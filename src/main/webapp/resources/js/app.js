/**
 * Created by domingos on 23/10/14.
 */

(function(){

   /* jQuery(function($){
        $.datepicker.regional['pt-BR'] = {
            closeText: 'Fechar',
            prevText: 'Anterior',
            nextText: 'Pr&oacute;ximo',
            currentText: 'Hoje',
            monthNames: ['Janeiro','Fevereiro','Mar&ccedil;o','Abril','Maio','Junho','Julho','Agosto','Setembro','Outubro','Novembro','Dezembro'],
            monthNamesShort: ['Jan','Fev','Mar','Abr','Mai','Jun','Jul','Ago','Set','Out','Nov','Dez'],
            dayNames: ['Domingo','Segunda-feira','Ter&ccedil;a-feira','Quarta-feira','Quinta-feira','Sexta-feira','S&aacute;bado'],
            dayNamesShort: ['Dom','Seg','Ter','Qua','Qui','Sex','Sab'],
            dayNamesMin: ['Do','Se','Te','Qa','Qi','Se','Sa'],
            weekHeader: 'Sm',
            dateFormat: 'dd/mm/yy',
            firstDay: 0,
            isRTL: false,
            showMonthAfterYear: false,
            yearSuffix: '',
            changeYear: true};
        $.datepicker.setDefaults($.datepicker.regional['pt-BR']);
    });*/

    var app = angular.module('Imovel', []);
    app.rootContext = '/imovel';


    app.controller('MenuController',['$scope',function($scope){
        $scope.menuIdx = 1;

        $scope.selecionaMenu = function(idMenu){
            $scope.menuIdx = idMenu;
        };

        $scope.menuSelecionado = function(idMenu){
            return $scope.menuIdx === idMenu;
        };

    }]);

    app.controller('ImovelController',['$scope','$rootScope','$http','ImovelSrv','PesquisaImovelSrv',function($scope,$rootScope, $http,ImovelSrv,PesquisaImovelSrv ){
        $scope.paginacao = [];
        $scope.imoveis = [];
        $scope.estados = [];
        $scope.valores = [
            {key:1,val:'1.00 and 1000.00',inicio:'1',fim:'1000'},
            {key:2,val:'1000.00 and 10000.00',inicio:'1000',fim:'10000'},
            {key:3,val:'10000.00 and 100000.00',inicio:'10000',fim:'1000000'},
            {key:4,val:'1000000.00 and 200000.00',inicio:'1000000',fim:'2000000'},
            {key:5,val:'4000000.00 and 300000.00',inicio:'2000000',fim:'3000000'},
        ];


        $scope.estado = '';
        $scope.faixaInicio = 0;
        $scope.faixaFim = 100000;
        $scope.verResultado = true;
        $scope.pesquisando = false;

        $rootScope.pagina = 1;
        $rootScope.status = 'A';

        $http({
            method: 'GET',
            url: app.rootContext + '/ws/imovel/estados',
            data: { }
        }).success(function (result) {
            $scope.estados = result;
        });


        ImovelSrv();

        $scope.onChangeFaixa = function(){
            //$scope.faixaInicio = $scope.valores[idx];
            //$scope.faixaFim = $scope.valores[idx];
            //alert(document.getElementById('valor').value);
        };

        $scope.pesquisar = function() {
            $scope.pesquisando = true;
            $scope.verResultado = false;

            $rootScope.status = $scope.status;
            $rootScope.estado = $scope.estado;
            $rootScope.faixaInicio = $scope.faixaInicio;
            $rootScope.faixaFim = $scope.faixaFim;

            PesquisaImovelSrv();
        };

        $scope.alterarPagina = function(pag) {
            if(pag != $rootScope.pagina) {
                $rootScope.pagina = pag;
                ImovelSrv();
            }
        };

        $scope.$on('atualizarListaImovel', function(event, args) {
            $scope.imoveis = args.result.imoveis;
            $scope.paginacao = args.result.paginacao;
            $scope.verResultado = true;
            $scope.pesquisando = false;
        });


    }]);

    app.factory('ImovelSrv',['$http', '$rootScope', function($http, $rootScope) {
        return function() {

            var params = {};

            params['pagina'] = $rootScope.pagina;
            params['status'] = $rootScope.status;
            $http({
                method: 'GET',
                url: app.rootContext + '/ws/imovel/lista',
                data: { },
                params: params
            }).success(function (result) {
                $rootScope.$broadcast('atualizarListaImovel', { result : result });
            });
        };
    }]);

    app.factory('PesquisaImovelSrv',['$http', '$rootScope', function($http, $rootScope) {
        return function() {

            var params = {};

            params['pagina'] = $rootScope.pagina;
            params['status'] = $rootScope.status;
            params['estado'] = $rootScope.estado;
            params['faixainicio'] = $rootScope.faixaInicio;
            params['faixafim'] = $rootScope.faixaFim;

            $http({
                method: 'GET',
                url: app.rootContext + '/ws/imovel/pesquisa',
                data: { },
                params: params
            }).success(function (result) {
                $rootScope.$broadcast('atualizarListaImovel', { result : result });
            });
        };
    }]);

    app.factory('EstadosSrv',['$http', '$rootScope', function($http, $rootScope) {
        return function() {

            $http({
                method: 'GET',
                url: app.rootContext + '/ws/imovel/estados',
                data: { }
            }).success(function (result) {
                $rootScope.$broadcast('atualizarListaEstado', { result : result });
            });
        };
    }]);


})();
var app = angular.module('ECIMaps', []);

app.controller('VistaInicial', ['$scope', function ($scope) {
        $scope.Mapa = true;
        $scope.ECIMAP = false;

        $scope.generarMapa = function () {
            $scope.Mapa = false;
            $scope.ECIMAP = true;
        }
    }
]);
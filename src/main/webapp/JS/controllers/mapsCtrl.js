angular.module('ECIMaps', [])
        .controller('VistaInicial', ['$scope', function ($scope) {
        $scope.Mapa = true;
        $scope.ECIMAP = false;
        
        $scope.generarMapa = function () {
            var v = document.getElementById('nombreMapa').value;

            if (v === "" || v === " ") {
                alert("Escriba el nombre del ECIMap por favor");
            } else {
                $scope.Mapa = false;
                $scope.ECIMAP = true;
            }
        }
    }
]);
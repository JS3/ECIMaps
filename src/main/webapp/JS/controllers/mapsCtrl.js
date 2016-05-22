angular.module('ECIMaps', [])
        .controller('VistaInicial', ['$scope', function ($scope) {
        $scope.Mapa = true;
        $scope.ECIMAP = false;
        
        $scope.generarMapa = function () {
            var v = document.getElementById('nombreMapa').value;

            if (v === "" || v === " ") {
                alert("Escriba un nombre profavor");
            } else {
                $scope.Mapa = false;
                $scope.ECIMAP = true;
            }
        }
    }
]);
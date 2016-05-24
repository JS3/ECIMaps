angular.module('ECIMapsNodos', [])
        .controller('NodosECIMap', function ($scope, $http) {
            $scope.JSONMapa = {};
            $scope.MapaBiologia =
            {
            "Nombre": "Mi Biologia",
            "Descripcion": "Tema principal",
            "Posicion": {"x": 15, "y":15 },
            "Hijos": [
                {
                    "Nombre": "Peces",
                    "Descripcion": "Vertebrado",
                    "Posicion": {"x": 80,"y": 80 },
                    "Hijos": []
                },
                {
                    "Nombre": "Gusanos",
                    "Descripcion": "Invertebrado",
                    "Posicion": {"x": 100, "y": 100 },
                    "Hijos": [
                        { 
                            "Nombre": "Anelidos",
                            "Descripcion": "Bilateral",
                            "Posicion": {"x": 170,"y": 170},
                            "Hijos": []
                        }
                    ]
                }
            ]
            };
            
//            $scope.cargarMapa = function () {
//                var nombre = document.getElementById('nombreMapa').value;
//                if (nombre === 'MapaBiologia') {
//                    $scope.JSONMapa = $scope.MapaBiologia;
//                }
//            }
            
            $scope.wolis = function () {
                alert("asdsdfadfg");
            }
            
            $scope.cargarMapaBiologia = function () {
                $scope.JSONMap = $scope.MapaBiologia;
                document.getElementById('MapaJSON').value = $scope.JSONMap;
            }
        });
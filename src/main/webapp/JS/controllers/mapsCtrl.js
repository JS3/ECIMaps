var app = angular.module('ECIMaps', []);

//angular.module('ECIMaps', [])
//        .controller('VistaInicial', ['$scope', function ($scope) {
//                $scope.Mapa = true;
//                $scope.ECIMAP = false;
//
//                $scope.generarMapa = function () {
//                    var v = document.getElementById('nombreMapa').value;
//
//                    if (v === "" || v === " ") {
//                        alert("Escriba el nombre del ECIMap por favor");
//                    } else {
//                        $scope.Mapa = false;
//                        $scope.ECIMAP = true;
//                    }
//                };
//            }
//        ]);

app.controller('ctrlVista', function ($scope) {
    $scope.vistaInicio = true;
    $scope.vistaCheckList = false;
    $scope.vistaCanvas = false;
    $scope.vistaJSON = false;
    $scope.vistaFinal = false;

    $scope.verCanvasInicio = function () {
        var v = document.getElementById('nombreMapa').value;

        if (v === "" || v === " ") {
            alert("Escriba el nombre del ECIMap por favor");
        } else {
            $scope.verCanvas();
            $scope.vistaInicio = false;
            $scope.vistaFinal = true;
        }
    };

    $scope.verCanvas = function () {
        $scope.vistaCheckList = false;
        $scope.vistaCanvas = true;
        $scope.vistaJSON = false;
    };

    $scope.verCheckList = function () {
        $scope.vistaCheckList = true;
        $scope.vistaCanvas = false;
        $scope.vistaJSON = false;
    };

    $scope.verJSON = function () {
        $scope.vistaCheckList = false;
        $scope.vistaCanvas = false;
        $scope.vistaJSON = true;
    };


    $scope.JSONMapa = {};
    $scope.MapaBiologia =
            {
                "Nombre": "Mi Biologia",
                "Descripcion": "Tema principal",
                "Posicion": {"x": 15, "y": 15},
                "Hijos": [
                    {
                        "Nombre": "Peces",
                        "Descripcion": "Vertebrado",
                        "Posicion": {"x": 80, "y": 80},
                        "Hijos": []
                    },
                    {
                        "Nombre": "Gusanos",
                        "Descripcion": "Invertebrado",
                        "Posicion": {"x": 100, "y": 100},
                        "Hijos": [
                            {
                                "Nombre": "Anelidos",
                                "Descripcion": "Bilateral",
                                "Posicion": {"x": 170, "y": 170},
                                "Hijos": []
                            }
                        ]
                    }
                ]
            };

    $scope.wolis = function () {
        alert("asdsdfadfg");
    };

    $scope.cargarMapaBiologia = function () {
        $scope.JSONMap = $scope.MapaBiologia;
        document.getElementById('MapaJSON').value = $scope.JSONMap;
    };


});

app.directive('drawing', function () {
    return {
        restrict: 'A',
        link: function ($scope, element) {

            var ctx = element[0].getContext('2d');

            $scope.JSONMapa = //$scope.MapaBiologia;
                    {
                        "Nombre": "Mi Biologia",
                        "Descripcion": "Tema principal",
                        "Posicion": {"x": 70, "y": 70},
                        "Hijos": [
                            {
                                "Nombre": "Peces",
                                "Descripcion": "Vertebrado",
                                "Posicion": {"x": 200, "y": 200},
                                "Hijos": []
                            },
                            {
                                "Nombre": "Gusanos",
                                "Descripcion": "Invertebrado",
                                "Posicion": {"x": 400, "y": 70},
                                "Hijos": [
                                    {
                                        "Nombre": "Anelidos",
                                        "Descripcion": "Bilateral",
                                        "Posicion": {"x": 480, "y": 480},
                                        "Hijos": [
                                            {
                                                "Nombre": "Algo muy raro",
                                                "Descripcion": "Rarisimo",
                                                "Posicion": {"x": 680, "y": 480},
                                                "Hijos": []
                                            }
                                        ]
                                    },
                                    {
                                        "Nombre": "Otra cosa rara",
                                        "Descripcion": "Algo raro",
                                        "Posicion": {"x": 180, "y": 480},
                                        "Hijos": []
                                    }
                                ]
                            }
                        ]
                    };



            element.bind('mousedown', function (event) {
                pintarMapa();
            });

            function pintarMapa() {
                reset();
                // Pintar nodo central
                dibujarNodo($scope.JSONMapa.Posicion.x,
                        $scope.JSONMapa.Posicion.y,
                        $scope.JSONMapa.Nombre);

                // Pintar hijos de nodo central
                hijosMios($scope.JSONMapa.Hijos, $scope.JSONMapa.Posicion);

            }


            // Pintar los Hijos de los Hijos de los Hijos
            function hijosMios(hijos, posicionPadre) {

                for (var hijo in hijos) {

                    dibujarNodo(hijos[hijo].Posicion.x,
                            hijos[hijo].Posicion.y,
                            hijos[hijo].Nombre);

                    dibujarHerencia(posicionPadre.x,
                            posicionPadre.y,
                            hijos[hijo].Posicion.x,
                            hijos[hijo].Posicion.y);

                    if (hijos[hijo].Hijos.length > 0) {
                        hijosMios(hijos[hijo].Hijos, hijos[hijo].Posicion);
                    }
                }
            }


            var centro = 48;

            function dibujarHerencia(Xpadre, Ypadre, Xhijo, Yhijo) {
                var color = getRandomColor();
                ctx.moveTo(Xpadre, Ypadre);
                ctx.lineTo(Xhijo, Yhijo);
                ctx.strokeStyle = color;
                ctx.stroke();

            }

            function dibujarNodo(X, Y, nombre) {
                ctx.beginPath();
                ctx.arc(X, Y, centro, 0, 2 * Math.PI);
                ctx.font = "15px Arial";
                ctx.fillText(nombre, X - centro / 2, Y);
                ctx.stroke();
            }

            // canvas reset
            function reset() {
                element[0].width = element[0].width;
            }

            function getRandomColor() {
                var letters = '0123456789ABCDEF'.split('');
                var color = '#';
                for (var i = 0; i < 6; i++) {
                    color += letters[Math.floor(Math.random() * 16)];
                }
                return color;
            }
        }
    };
});

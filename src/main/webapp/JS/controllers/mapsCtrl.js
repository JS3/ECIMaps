var app = angular.module('ECIMaps', []);

app.controller('ctrlVista', function ($scope) {
    $scope.vistaInicio = true;
    $scope.vistaCheckList = false;
    $scope.vistaCanvas = false;
    $scope.vistaJSON = false;
    $scope.vistaFinal = false;
    
    alert("¡ADVERTENCIA!\n\n\n\
Este proyecto es compatible en un 100% con los navebagores\n\
Google Chrome y Mozilla Firefox\n");
    
    $scope.verCanvasInicio = function () {
        var v = document.getElementById('nombreMapa').value;

        if (v === "" || v === " ") {
            alert("Escriba el nombre del ECIMap por favor");
        } else {
            if (v === "Mapa Biologia") {
                $scope.cargarMapaBiologia();
            } else if (v === "Mapa Universo") {
                $scope.cargarMapaUniverso();
            }

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

    MapasBase();
    $scope.JSONMapa = $scope.ECIMaps;
    $scope.MapaInicial = JSONtoString();

    $scope.cargarMapaBiologia = function () {
        $scope.JSONMapa = $scope.MapaBiologia;
        var str = JSONtoString();
        document.getElementById('MapaJSON').value = str;
    };

    $scope.cargarMapaECIMaps = function () {
        $scope.JSONMapa = $scope.ECIMaps;
        var str = JSONtoString();
        document.getElementById('MapaJSON').value = str;
    };

    $scope.cargarMapaUniverso = function () {
        $scope.JSONMapa = $scope.MapaUniverso;
        var str = JSONtoString();
        document.getElementById('MapaJSON').value = str;
    }

    function JSONtoString() {
        return JSON.stringify($scope.JSONMapa, undefined, 2);
    }

    function MapasBase() {
        $scope.ECIMaps = {
            "Nombre": "ECI MAPS",
            "Descripcion": "Mapas mentales",
            "Posicion": {"x": 500, "y": 100},
            "Hijos": [{
                    "Nombre": "Autores",
                    "Descripcion": "ECI",
                    "Posicion": {"x": 500, "y": 300},
                    "Hijos": [{
                            "Nombre": "Juan",
                            "Descripcion": "Autor",
                            "Posicion": {"x": 200, "y": 400},
                            "Hijos": []
                        }, {
                            "Nombre": "Diana",
                            "Descripcion": "Autor",
                            "Posicion": {"x": 800, "y": 400},
                            "Hijos": []
                        }]
                }]
        };

        $scope.MapaBiologia = {
            "Nombre": "Mi Biologia",
            "Descripcion": "Tema principal",
            "Posicion": {"x": 70, "y": 70},
            "Hijos": [{
                    "Nombre": "Peces",
                    "Descripcion": "Vertebrado",
                    "Posicion": {"x": 200, "y": 200},
                    "Hijos": []
                }, {
                    "Nombre": "Gusanos",
                    "Descripcion": "Invertebrado",
                    "Posicion": {"x": 400, "y": 70},
                    "Hijos": [{
                            "Nombre": "Anelidos",
                            "Descripcion": "Bilateral",
                            "Posicion": {"x": 400, "y": 200},
                            "Hijos": []
                        }]
                }]
        };

        $scope.MapaUniverso = {
            "Nombre": "Sistema Solar",
            "Descripcion": "Universo",
            "Posicion": {"x": 500, "y": 200},
            "Hijos": [{
                    "Nombre": "Estrellas",
                    "Descripcion": "Brillante",
                    "Posicion": {"x": 250, "y": 100},
                    "Hijos": [{
                            "Nombre": "Sol",
                            "Descripcion": "Nuestro Sol",
                            "Posicion": {"x": 100, "y": 100},
                            "Hijos": []
                        }]
                }, {
                    "Nombre": "Planetas",
                    "Descripcion": "Planetas",
                    "Posicion": {"x": 250, "y": 300},
                    "Hijos": [{
                            "Nombre": "Interiores",
                            "Descripcion": "",
                            "Posicion": {"x": 100, "y": 300},
                            "Hijos": [{
                                    "Nombre": "Mercurio",
                                    "Descripcion": "",
                                    "Posicion": {"x": 50, "y": 400},
                                    "Hijos": []
                                }, {
                                    "Nombre": "Venus",
                                    "Descripcion": "",
                                    "Posicion": {"x": 100, "y": 500},
                                    "Hijos": []
                                }, {
                                    "Nombre": "Tierra",
                                    "Descripcion": "",
                                    "Posicion": {"x": 200, "y": 400},
                                    "Hijos": []
                                }, {
                                    "Nombre": "Marte",
                                    "Descripcion": "",
                                    "Posicion": {"x": 200, "y": 500},
                                    "Hijos": []
                                }]
                        }, {
                            "Nombre": "Exteriores",
                            "Descripcion": "",
                            "Posicion": {"x": 350, "y": 350},
                            "Hijos": [{
                                    "Nombre": "Jupiter",
                                    "Descripcion": "",
                                    "Posicion": {"x": 300, "y": 450},
                                    "Hijos": []
                                }, {
                                    "Nombre": "Urano",
                                    "Descripcion": "",
                                    "Posicion": {"x": 400, "y": 550},
                                    "Hijos": []
                                }, {
                                    "Nombre": "Saturno",
                                    "Descripcion": "",
                                    "Posicion": {"x": 450, "y": 450},
                                    "Hijos": []
                                }, {
                                    "Nombre": "Nepturno",
                                    "Descripcion": "",
                                    "Posicion": {"x": 500, "y": 350},
                                    "Hijos": []
                                }]
                        }]
                }, {
                    "Nombre": "Planetas enanos",
                    "Descripcion": "Planetas enanos",
                    "Posicion": {"x": 700, "y": 200},
                    "Hijos": [{
                            "Nombre": "Pluton",
                            "Descripcion": "",
                            "Posicion": {"x": 700, "y": 85},
                            "Hijos": []
                        }, {
                            "Nombre": "Sedna",
                            "Descripcion": "",
                            "Posicion": {"x": 500, "y": 85},
                            "Hijos": []
                        }, {
                            "Nombre": "Eris",
                            "Descripcion": "",
                            "Posicion": {"x": 900, "y": 85},
                            "Hijos": []
                        }]
                }, {
                    "Nombre": "Cuerpos pequeños",
                    "Descripcion": "Pequeños",
                    "Posicion": {"x": 700, "y": 350},
                    "Hijos": [{
                            "Nombre": "Asteroides",
                            "Descripcion": "",
                            "Posicion": {"x": 800, "y": 450},
                            "Hijos": []
                        }, {
                            "Nombre": "Cometas",
                            "Descripcion": "",
                            "Posicion": {"x": 600, "y": 450},
                            "Hijos": []
                        }]
                }]
        }
    }

    $scope.cargarMapaEditado = function () {
        var jsonMapaEditado = document.getElementById('MapaJSON').value;
        $scope.JSONMapa = JSON.parse(jsonMapaEditado);
    }
    
    $scope.limpiarEditadoMapas = function () {
        
        $scope.JSONMapa = {};
        var str = JSONtoString();
        document.getElementById('MapaJSON').value = str;
    }

});

app.directive('drawing', function () {
    return {
        restrict: 'A',
        link: function ($scope, element) {

            var ctx = element[0].getContext('2d');

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

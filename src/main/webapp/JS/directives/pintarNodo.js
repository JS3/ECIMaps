angular.module('ECIMapsNodos', [])
        .directive('drawing', function () {
            return {
                restrict: 'A',
                link: function ($scope, element) {
                    
                    var ctx = element[0].getContext('2d');
                    
                    $scope.JSONMapa = //$scope.MapaBiologia;
                        {
                            "Nombre": "Mi Biologia",
                            "Descripcion": "Tema principal",
                            "Posicion": {"x": 70, "y":70 },
                            "Hijos": [
                                {
                                    "Nombre": "Peces",
                                    "Descripcion": "Vertebrado",
                                    "Posicion": {"x": 200,"y": 200 },
                                    "Hijos": []
                                },
                                {
                                    "Nombre": "Gusanos",
                                    "Descripcion": "Invertebrado",
                                    "Posicion": {"x": 400, "y": 70 },
                                    "Hijos": [
                                        { 
                                            "Nombre": "Anelidos",
                                            "Descripcion": "Bilateral",
                                            "Posicion": {"x": 480,"y": 480},
                                            "Hijos": [
                                                { 
                                                    "Nombre": "Algo muy raro",
                                                    "Descripcion": "Rarisimo",
                                                    "Posicion": {"x": 680,"y": 480},
                                                    "Hijos": []
                                                }
                                            ]
                                        },
                                        { 
                                            "Nombre": "Otra cosa rara",
                                            "Descripcion": "Algo raro",
                                            "Posicion": {"x": 180,"y": 480},
                                            "Hijos": []
                                        }
                                    ]
                                }
                            ]
                        };
                    
                    function pintarMapa(){
                        reset();
                        // Pintar nodo central
                        dibujarNodo($scope.JSONMapa.Posicion.x,
                                    $scope.JSONMapa.Posicion.y,
                                    $scope.JSONMapa.Nombre);

                        // Pintar hijos de nodo central
                        hijosMios($scope.JSONMapa.Hijos, $scope.JSONMapa.Posicion);
                    
                    }
                    
                    element.bind('mousedown', function (event) {
//                        reset();
//                        // Pintar nodo central
//                        dibujarNodo($scope.JSONMapa.Posicion.x,
//                                    $scope.JSONMapa.Posicion.y,
//                                    $scope.JSONMapa.Nombre);
//
//                        // Pintar hijos de nodo central
//                        hijosMios($scope.JSONMapa.Hijos, $scope.JSONMapa.Posicion);
                        pintarMapa();
                    });
                    
                    
                    // Pintar los Hijos de los Hijos de los Hijos
                    function hijosMios(hijos, posicionPadre){
                        
                        for (var hijo in hijos){
                            
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
                    
                    function dibujarHerencia(Xpadre, Ypadre, Xhijo, Yhijo){
                        var color = getRandomColor();
                        ctx.moveTo(Xpadre,Ypadre);
                        ctx.lineTo(Xhijo,Yhijo);
                        ctx.strokeStyle = color;
                        ctx.stroke();
                        
                    }
                    
                    function dibujarNodo(X, Y, nombre) {
                        ctx.beginPath();
                        ctx.arc(X, Y, centro, 0, 2 * Math.PI);
                        ctx.font = "15px Arial";
                        ctx.fillText(nombre, X - centro/2 , Y);
                        ctx.stroke();
                    }
                    
                    // canvas reset
                    function reset() {
                        element[0].width = element[0].width;
//                        ctx.fillStyle = "#FFF";
//                        ctx.fillRect(0,0,ctx.width,ctx.height);
//                        ctx.width=ctx.width;
//                        oContext.clearRect(0, 0, oCanvas.width, oCanvas.height);
                    }
                    
                    function getRandomColor() {
                        var letters = '0123456789ABCDEF'.split('');
                        var color = '#';
                        for (var i = 0; i < 6; i++ ) {
                            color += letters[Math.floor(Math.random() * 16)];
                        }
                    return color;
                    }
                }
            }
        });









//.directive("drawing", function(){
//  return {
//    restrict: "A",
//    link: function(scope, element){
//      var ctx = element[0].getContext('2d');
//      
//      // variable that decides if something should be drawn on mousemove
//      var drawing = false;
//      
//      // the last coordinates before the current move
//      var lastX;
//      var lastY;
//      
//      element.bind('mousedown', function(event){
//        if(event.offsetX!==undefined){
//          lastX = event.offsetX;
//          lastY = event.offsetY;
//        } else {
//          lastX = event.layerX - event.currentTarget.offsetLeft;
//          lastY = event.layerY - event.currentTarget.offsetTop;
//        }
//        
//        // begins new line
//        ctx.beginPath();
//        
//        drawing = true;
//      });
//      element.bind('mousemove', function(event){
//        if(drawing){
//          // get current mouse position
//          if(event.offsetX!==undefined){
//            currentX = event.offsetX;
//            currentY = event.offsetY;
//          } else {
//            currentX = event.layerX - event.currentTarget.offsetLeft;
//            currentY = event.layerY - event.currentTarget.offsetTop;
//          }
//          
//          draw(lastX, lastY, currentX, currentY);
//          
//          // set current coordinates to last one
//          lastX = currentX;
//          lastY = currentY;
//        }
//        
//      });
//      element.bind('mouseup', function(event){
//        // stop drawing
//        drawing = false;
//      });
//        
//      // canvas reset
//      function reset(){
//       element[0].width = element[0].width; 
//      }
//      
//      function draw(lX, lY, cX, cY){
//        // line from
//        ctx.moveTo(lX,lY);
//        // to
//        ctx.lineTo(cX,cY);
//        // color
//        ctx.strokeStyle = "#4bf";
//        // draw it
//        ctx.stroke();
//      }
//    }
//  };
//});

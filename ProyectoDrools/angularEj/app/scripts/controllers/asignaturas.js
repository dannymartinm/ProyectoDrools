'use strict';

/**
 * @ngdoc function
 * @name angularEjApp.controller:AsignaturasCtrl
 * @description
 * # AsignaturasCtrl
 * Controller of the angularEjApp
 */
angular.module('angularEjApp')
  .controller('AsignaturasCtrl', ['$http', '$scope',function ($http, $scope, $log) {

  $scope.isDisabled = true;

   $http.get('http://localhost:8080/api/asignaturas')
        .then(function(response){
          var listado = response.data;
          $scope.asignaturas = listado;
        });


  	$scope.insertarAsignaturaAlumno = function(nombre){
  		var matricula = $http.get('http://localhost:8080/api/alumnos')
        .then(function(response){
          var res = response.data[0].matricula;
          console.log(response.data[0].matricula);
          //$log.debug("matricula"+res.nombre);

          var promedio = Math.floor((Math.random() * 50) + 50);
          var materiaInsertar = {
  			"clave": nombre,
  			"matricula": res,
        "promedio": promedio
  		}
  		console.log(nombre);

  		$http.post('http://localhost:8080/api/alumnos/insertaAlumnoAsignatura', materiaInsertar)
  		.then(function(response){
  			var respuesta = response.data;
  			$scope.resultadoInsercion =  respuesta;
  		});
        });
   //   $scope.isDisabled = false;
      		
  	}

   
  }]);

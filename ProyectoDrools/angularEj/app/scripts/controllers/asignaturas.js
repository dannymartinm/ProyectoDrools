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

   $http.get('http://localhost:8080/api/asignaturas')
        .then(function(response){
          var listado = response.data;
          $scope.asignaturas = listado;
        });


  	$scope.insertarAsignaturaAlumno = function(nombre){
  		var matricula = $http.get('http://localhost:8080/api/alumnos')
        .then(function(response){
          response.data[0].matricula;
          console.log(response.data[0].matricula);
          //$log.debug("matricula"+res.nombre);
        });
  		var materiaInsertar = {
  			"nombre": nombre,
  			"matricula": matricula
  		}
  		console.log(nombre);
  	/*	$http.post('http://localhost:8080/alumnos', alumnoInsertar)
  		.then(function(response){
  			var respuesta = response.data;
  			$scope.resultadoInsercion =  respuesta;
  		});*/
  	}
  }]);

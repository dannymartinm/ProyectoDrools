'use strict';

/**
 * @ngdoc function
 * @name angularEjApp.controller:MainCtrl
 * @description
 * # MainCtrl
 * Controller of the angularEjApp
 */
angular.module('angularEjApp')
  .controller('MainCtrl', function ($scope, $http, $window) {


    $scope.listado = function(){
      $http.get('http://localhost:8080/api/padres')
        .then(function(response){
          var listado = response.data;
          $scope.padres = listado;
        });
    }

  	$scope.insertarAlumno = function(){
  		var alumnoInsertar = {
  			"padre": $scope.padre,
  			"hijo": $scope.hijo
  		}
  		$http.post('http://localhost:8080/api/padres/inserta', alumnoInsertar)
  		.then(function(response){
  			var respuesta = response.data;
  			$scope.resultadoInsercion =  respuesta;
  		});
  	}

  });

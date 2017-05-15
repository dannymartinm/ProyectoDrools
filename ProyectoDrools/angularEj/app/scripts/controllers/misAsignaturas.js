'use strict';

/**
 * @ngdoc function
 * @name angularEjApp.controller:AsignaturasCtrl
 * @description
 * # AsignaturasCtrl
 * Controller of the angularEjApp
 */
angular.module('angularEjApp')
  .controller('MisAsignaturasCtrl', ['$http', '$scope',function ($http, $scope, $log) {

   $http.get('http://localhost:8080/api/alumnoAsignaturas')
        .then(function(response){
          var listado = response.data;
          $scope.ejercicios = listado;
        });

  }]);

'use strict';

/**
 * @ngdoc function
 * @name angularEjApp.controller:AsignaturasCtrl
 * @description
 * # AsignaturasCtrl
 * Controller of the angularEjApp
 */
angular.module('angularEjApp')
  .controller('AsignaturasCtrl', function ($http, $scope) {

   $http.get('http://localhost:8080/api/asignaturas')
        .then(function(response){
          var listado = response.data;
          $scope.asignaturas = listado;
        });
  });

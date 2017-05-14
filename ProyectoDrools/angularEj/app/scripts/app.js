'use strict';

/**
 * @ngdoc overview
 * @name angularEjApp
 * @description
 * # angularEjApp
 *
 * Main module of the application.
 */
angular
  .module('angularEjApp', [
    'ngAnimate',
    'ngCookies',
    'ngResource',
    'ngRoute',
    'ngSanitize',
    'ngTouch'
  ])
  .config(function ($routeProvider) {
    $routeProvider
      .when('/', {
        templateUrl: 'views/main.html',
        controller: 'MainCtrl',
        controllerAs: 'main'
      })
      .when('/about', {
        templateUrl: 'views/about.html',
        controller: 'AboutCtrl',
        controllerAs: 'about'
      })
      .when('/materias', {
        templateUrl: 'views/materias.html',
        controller: 'AsignaturasCtrl',
        controllerAs: 'asignaturas'
      })
      .otherwise({
        redirectTo: '/'
      });
  });

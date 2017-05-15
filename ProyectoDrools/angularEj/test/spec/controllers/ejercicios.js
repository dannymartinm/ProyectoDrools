'use strict';

describe('Controller: EjerciciosCtrl', function () {

  // load the controller's module
  beforeEach(module('angularEjApp'));

  var EjerciciosCtrl,
    scope;

  // Initialize the controller and a mock scope
  beforeEach(inject(function ($controller, $rootScope) {
    scope = $rootScope.$new();
    EjerciciosCtrl = $controller('EjerciciosCtrl', {
      $scope: scope
      // place here mocked dependencies
    });
  }));

  it('should attach a list of awesomeThings to the scope', function () {
    expect(EjerciciosCtrl.awesomeThings.length).toBe(3);
  });
});

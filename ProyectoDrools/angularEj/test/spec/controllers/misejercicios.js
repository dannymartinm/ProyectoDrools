'use strict';

describe('Controller: MisejerciciosCtrl', function () {

  // load the controller's module
  beforeEach(module('angularEjApp'));

  var MisejerciciosCtrl,
    scope;

  // Initialize the controller and a mock scope
  beforeEach(inject(function ($controller, $rootScope) {
    scope = $rootScope.$new();
    MisejerciciosCtrl = $controller('MisejerciciosCtrl', {
      $scope: scope
      // place here mocked dependencies
    });
  }));

  it('should attach a list of awesomeThings to the scope', function () {
    expect(MisejerciciosCtrl.awesomeThings.length).toBe(3);
  });
});

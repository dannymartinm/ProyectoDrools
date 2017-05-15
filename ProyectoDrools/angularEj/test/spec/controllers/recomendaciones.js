'use strict';

describe('Controller: RecomendacionesCtrl', function () {

  // load the controller's module
  beforeEach(module('angularEjApp'));

  var RecomendacionesCtrl,
    scope;

  // Initialize the controller and a mock scope
  beforeEach(inject(function ($controller, $rootScope) {
    scope = $rootScope.$new();
    RecomendacionesCtrl = $controller('RecomendacionesCtrl', {
      $scope: scope
      // place here mocked dependencies
    });
  }));

  it('should attach a list of awesomeThings to the scope', function () {
    expect(RecomendacionesCtrl.awesomeThings.length).toBe(3);
  });
});

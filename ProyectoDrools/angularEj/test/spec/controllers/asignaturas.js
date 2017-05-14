'use strict';

describe('Controller: AsignaturasCtrl', function () {

  // load the controller's module
  beforeEach(module('angularEjApp'));

  var AsignaturasCtrl,
    scope;

  // Initialize the controller and a mock scope
  beforeEach(inject(function ($controller, $rootScope) {
    scope = $rootScope.$new();
    AsignaturasCtrl = $controller('AsignaturasCtrl', {
      $scope: scope
      // place here mocked dependencies
    });
  }));

  it('should attach a list of awesomeThings to the scope', function () {
    expect(AsignaturasCtrl.awesomeThings.length).toBe(3);
  });
});

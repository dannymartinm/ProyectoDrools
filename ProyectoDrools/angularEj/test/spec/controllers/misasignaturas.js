'use strict';

describe('Controller: MisasignaturasCtrl', function () {

  // load the controller's module
  beforeEach(module('angularEjApp'));

  var MisasignaturasCtrl,
    scope;

  // Initialize the controller and a mock scope
  beforeEach(inject(function ($controller, $rootScope) {
    scope = $rootScope.$new();
    MisasignaturasCtrl = $controller('MisasignaturasCtrl', {
      $scope: scope
      // place here mocked dependencies
    });
  }));

  it('should attach a list of awesomeThings to the scope', function () {
    expect(MisasignaturasCtrl.awesomeThings.length).toBe(3);
  });
});

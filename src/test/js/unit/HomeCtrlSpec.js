'use strict';

describe('Home module unit tests', function(){

  beforeEach(function(){
    this.addMatchers({
      toEqualData: function(expected) {
        return angular.equals(this.actual, expected);
      }
    });
  });


  beforeEach(module('jewellery.home'));

  describe('HomeCtrl', function(){
    var scope, ctrl, $httpBackend;
    
    beforeEach(inject(function(_$httpBackend_, $rootScope, $controller) {
      $httpBackend = _$httpBackend_;
      $httpBackend.expectGET('/offers').
          respond([
            {
                "offerId": "1001",
                "description": "BUILD YOUR OWN PENDANT"
            },
            {
                "offerId": "1002",
                "description": "BUILD YOUR OWN RING"
            }
          ]);

      scope = $rootScope.$new();
      ctrl = $controller('HomeCtrl', {$scope: scope});
    }));


    it('should create "offers" model with 2 offers fetched from xhr', function() {
      expect(scope.offers).toEqualData([]);
      $httpBackend.flush();

      expect(scope.offers).toEqualData(
          [
           {
               "offerId": "1001",
               "description": "BUILD YOUR OWN PENDANT"
           },
           {
               "offerId": "1002",
               "description": "BUILD YOUR OWN RING"
           }
          ]);
      expect(scope.myInterval).toEqual(5000);
      expect(scope.noWrapSlides).toBe(false);
    });

  });

});



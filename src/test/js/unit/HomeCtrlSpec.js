'use strict';

describe('Home module unit tests', function(){

  beforeEach(function(){
    this.addMatchers({
      toEqualData: function(expected) {
        return angular.equals(this.actual, expected);
      }
    });
  });


  beforeEach(module('jewellry.home'));

  describe('HomeCtrl', function(){
    var scope, ctrl, $httpBackend;
    
    beforeEach(inject(function(_$httpBackend_, $rootScope, $controller) {
      $httpBackend = _$httpBackend_;
      $httpBackend.expectGET('/offers').
          respond([
            {
                "offerId": "1001",
                "caption": "BUILD YOUR OWN PENDANT",
                "imgUrl": "components/offer/img/1001.jpg",
                "promotion": "Unmatched diamond selection makes classic diamond pendants anything but ordinary."
            },
            {
                "offerId": "1002",
                "caption": "BUILD YOUR OWN RING",
                "imgUrl": "components/offer/img/1002.jpg",
                "promotion": "Uniquely designed engagement rings custom crafted with certified diamonds."
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
                "caption": "BUILD YOUR OWN PENDANT",
                "imgUrl": "components/offer/img/1001.jpg",
                "promotion": "Unmatched diamond selection makes classic diamond pendants anything but ordinary."
            },
            {
                "offerId": "1002",
                "caption": "BUILD YOUR OWN RING",
                "imgUrl": "components/offer/img/1002.jpg",
                "promotion": "Uniquely designed engagement rings custom crafted with certified diamonds."
            }
          ]);
    });

  });

});



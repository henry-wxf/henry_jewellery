'use strict';

describe('Product module unit tests', function(){

  beforeEach(function(){
    this.addMatchers({
      toEqualData: function(expected) {
        return angular.equals(this.actual, expected);
      }
    });
  });


  beforeEach(module('jewellery.product'));

  describe('ProductCtrl', function(){
    var scope, ctrl, $httpBackend, $controller;
    
    beforeEach(inject(function(_$httpBackend_, $rootScope, _$controller_) {
      $httpBackend = _$httpBackend_;
      scope = $rootScope.$new();
      $controller = _$controller_;
    }));

    var products = [
                    {
                        "productId": "1001",
                        "price": 33.00
                    },
                    {
                        "productId": "1002",
                        "price": 66.00
                    }
                  ];

    it('should query with type ALL and create "products" model with 2 products fetched from xhr', function() {
        $httpBackend.expectGET('/products?type=ALL').respond(products);

        ctrl = $controller('ProductCtrl', {$scope: scope, $routeParams:{type: 'ALL'}});
        
        expect(scope.products).toEqualData([]);
        $httpBackend.flush();

        expect(scope.products).toEqualData(products);
    });

    it('should query without type and create "products" model with 2 products fetched from xhr', function() {
        $httpBackend.expectGET('/products').respond(products);

        ctrl = $controller('ProductCtrl', {$scope: scope});
        
        expect(scope.products).toEqualData([]);
        $httpBackend.flush();

        expect(scope.products).toEqualData(products);
    });
  });

});



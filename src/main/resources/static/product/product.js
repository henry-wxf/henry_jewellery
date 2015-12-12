'use strict';

angular.module('jewellery.product', ['ngRoute', 'angular.filter', 'productService'])

.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/products', {
    templateUrl: 'product/product.html',
    controller: 'ProductCtrl'
  });
}])

.controller('ProductCtrl', ['$scope', '$routeParams', 'Product', function($scope, $routeParams, Product) {
    $scope.products = Product.query({'type':$routeParams.type});
}]);
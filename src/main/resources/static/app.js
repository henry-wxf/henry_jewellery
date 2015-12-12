'use strict';

// Declare app level module which depends on views, and components
angular.module('jewellery', [
  'ngRoute',
  'jewellery.home',
  'jewellery.product',
  'jewellery.deal'
]).
config(['$routeProvider', function($routeProvider) {
  $routeProvider.otherwise({redirectTo: '/home'});
}]).
controller('NavCtrl', ['$scope', 'Product', function($scope, Product) {
    $scope.activeMenuItem = "home";
    $scope.productTypes = Product.getTypes();
    $scope.changeMenuItem = function(theItem){
        $scope.activeMenuItem = theItem;
        $scope.activeSubMenuItem = null;
    }
    
    $scope.changeSubMenuItem = function(theItem){
        $scope.activeMenuItem = "products"
        $scope.activeSubMenuItem = theItem;
    }
}]);

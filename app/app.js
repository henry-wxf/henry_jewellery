'use strict';

// Declare app level module which depends on views, and components
angular.module('jewellry', [
  'ngRoute',
  'jewellry.home',
  'jewellry.product',
  'jewellry.deal'
]).
config(['$routeProvider', function($routeProvider) {
  $routeProvider.otherwise({redirectTo: '/home'});
}]).
controller('NavCtrl', ['$scope', function($scope) {
    $scope.activeLink = "home";

    $scope.changeLink = function(theLink){
        $scope.activeLink = theLink;
    }
}]);

'use strict';

angular.module('jewellery.home', ['ngRoute', 'angular.filter', 'ui.bootstrap', 'offerService'])

.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/home', {
    templateUrl: 'home/home.html',
    controller: 'HomeCtrl'
  });
}])

.controller('HomeCtrl', ['$scope', 'Offer', function($scope, Offer) {
    $scope.offers = Offer.query();
    $scope.myInterval = 5000;
    $scope.noWrapSlides = false;
}]);
'use strict';

angular.module('jewellry.home', ['ngRoute', 'angular.filter', 'offerService'])

.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/home', {
    templateUrl: 'home/home.html',
    controller: 'HomeCtrl'
  });
}])

.controller('HomeCtrl', ['$scope', 'Offer', function($scope, Offer) {
    $scope.offers = Offer.query();
}]);
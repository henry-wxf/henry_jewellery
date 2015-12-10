'use strict';

angular.module('jewellry.deal', ['ngRoute'])

.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/deal', {
    templateUrl: 'deal/deal.html',
    controller: 'DealCtrl'
  });
}])

.controller('DealCtrl', [function() {

}]);
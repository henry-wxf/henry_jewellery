'use strict';

angular.module('jewellery.deal', ['ngRoute'])

.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/deals', {
    templateUrl: 'deal/deal.html',
    controller: 'DealCtrl'
  });
}])

.controller('DealCtrl', [function() {

}]);
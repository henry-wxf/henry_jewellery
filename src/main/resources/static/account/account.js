'use strict';

angular.module('jewellery.account', ['ngRoute', 'angular.filter', 'accountService'])

.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/register', {
      templateUrl: 'account/register.html',
      controller: 'AccountCtrl'
  }).when('/myaccount', {
      templateUrl: 'account/my_account.html',
      controller: 'AccountCtrl'
  });
}])

.controller('AccountCtrl', ['$scope', 'Account', function($scope, Account){
    Account().getMe(function(data){
        $scope.user = data.principal;
    });
}]);
'use strict';

// Declare app level module which depends on views, and components
angular.module('jewellery', [
  'ngRoute',
  'jewellery.home',
  'jewellery.product',
  'jewellery.deal',
  'jewellery.store',
  'jewellery.account'
]).
config(['$routeProvider', '$httpProvider', function($routeProvider, $httpProvider) {
    $routeProvider.when('/login', {
        templateUrl: 'login.html',
        controller: 'NavCtrl'
    }).otherwise({redirectTo: '/home'});
  
    $httpProvider.defaults.headers.common["X-Requested-With"] = 'XMLHttpRequest';
}]).
controller('NavCtrl', ['$route', '$rootScope', '$scope', '$http', '$location', 'Product', 'Account', 
  function($route, $rootScope, $scope, $http, $location, Product, Account) {
    
    $scope.activeTab = function(route) {
        return $route.current && route === $route.current.controller;
    };
    
    $scope.productTypes = Product.getTypes();
    
    $scope.changeSubMenuItem = function(theItem){
        $scope.activeSubMenuItem = theItem;
    };
    
    var authenticate = function(credentials, callback) {
        var headers = credentials ? {authorization : "Basic "
            + btoa(credentials.username + ":" + credentials.password)
        } : {};
        
        var successCallback = function(data, responseHeaders) {
            $rootScope.authenticated = true;
            
            callback && callback(true);
        };
        
        var errorCallback = function(httpResponse) {
            $rootScope.authenticated = false;
            
            callback && callback(false, httpResponse);
        };
        
        Account(headers).auth(successCallback, errorCallback);
    };

    authenticate();
    
    $scope.signin = function() {
        authenticate($scope.user, function(succ, msg) {
            if(succ) {
                $location.path("/myaccount");
                $scope.error = false;
            } else {
                $scope.error = true;
                console.log(msg);
            }
        });
    };
    
    $rootScope.signout = function() {
        $http.post('/logout').then(
          function() {
            $rootScope.authenticated = false;
            $location.path("/home");
            $scope.error = false;
          },
          function(data) {
            $rootScope.authenticated = false;
            $scope.error = true;
            console.log(data);
          }
       );
    };
}]);

'use strict';

var accountService = angular.module('accountService', ['ngResource']);

accountService.factory('Account', ['$resource',
    function($resource){
        return function(customHeaders) {
            return $resource('/accounts/:accountId', {}, {
                auth: {method:'POST', url:'/accounts/me', headers:customHeaders||{}, isArray:false},
                getMe: {method: 'GET', url: '/accounts/me', isArray:false}
            });
        };
    }]);
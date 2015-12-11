'use strict';

var offerService = angular.module('offerService', ['ngResource']);

offerService.factory('Offer', ['$resource',
  function($resource){
    return $resource('/offers/:offerId', {}, {
      query: {method:'GET', params:{offerId:''}, isArray:true}
    });
  }]);
'use strict';

var offerService = angular.module('offerService', ['ngResource']);

offerService.factory('Offer', ['$resource',
  function($resource){
    return $resource('components/offer/:offerId.json', {}, {
      query: {method:'GET', params:{offerId:'offers'}, isArray:true}
    });
  }]);
'use strict';

var offerService = angular.module('productService', ['ngResource']);

offerService.factory('Product', ['$resource',
  function($resource){
    return $resource('/products/:productId', {}, {
      query: {method:'GET', params:{productId:''}, isArray:true},
      getTypes: {method:'GET', url:'/products/types', isArray:true}
    });
  }]);
'use strict';

angular.module('jewellery.store', ['ngRoute', 'uiGmapgoogle-maps'])

.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/stores', {
    templateUrl: 'store/store.html',
    controller: 'StoreCtrl'
  });
}])

.config(function(uiGmapGoogleMapApiProvider) {
    uiGmapGoogleMapApiProvider.configure({
        //    key: 'your api key',
        v: '3.20', //defaults to latest 3.X anyhow
        libraries: 'weather,geometry,visualization'
    });
})

.controller('StoreCtrl', function($scope, uiGmapGoogleMapApi) {
    $scope.map = {center: {latitude: -37.823775, longitude: 144.963871 }, zoom: 13 };
    $scope.options = {scrollwheel: false};
    $scope.markers = [
        {
            id: 1,
            latitude: -37.823775,
            longitude: 144.963871,
            title: 'Henry Jewellery'
        },
        {
            id: 2,
            latitude: -37.833775,
            longitude: 144.975871,
            title: 'Henry Jewellery'
        }
        ];
});
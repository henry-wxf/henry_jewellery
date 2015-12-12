module.exports = function(config){
  config.set({

    basePath : '../../../',

    files : [
      'main/resources/static/bower_components/angular/angular.js',
      'main/resources/static/bower_components/angular-route/angular-route.js',
      'main/resources/static/bower_components/angular-mocks/angular-mocks.js',
      'main/resources/static/bower_components/angular-resource/angular-resource.js',
      'main/resources/static/bower_components/angular-filter/angular-filter.js',
      'main/resources/static/components/**/*.js',
      'main/resources/static/home/*.js',
      'test/js/unit/**/*.js'
    ],

    autoWatch : true,

    frameworks: ['jasmine'],

    browsers : ['Chrome'],

    plugins : [
            'karma-chrome-launcher',
            'karma-firefox-launcher',
            'karma-jasmine',
            'karma-junit-reporter'
            ],

    junitReporter : {
      outputFile: 'test_out/unit.xml',
      suite: 'unit'
    }

  });
};

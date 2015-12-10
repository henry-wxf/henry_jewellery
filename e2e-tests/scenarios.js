'use strict';

/* https://github.com/angular/protractor/blob/master/docs/toc.md */

describe('Jewellry app', function() {


  it('should automatically redirect to /home when location hash/fragment is empty', function() {
    browser.get('index.html');
    expect(browser.getLocationAbsUrl()).toMatch("/home");
  });

  it('should show active class after clicking a navigation link', function(){
    browser.get('index.html');
    expect(element(by.css(".active")).element(by.css("a")).getText()).toBe("Home");

    element(by.css('a[href="#/deal"]')).click();
    expect(element(by.css(".active")).element(by.css("a")).getText()).toBe("Deals");
  });

  describe('jewellry.home', function() {

    beforeEach(function() {
      browser.get('index.html#/home');
    });


    it('should render home when user navigates to /home', function() {
      expect(element.all(by.css('.panel-heading')).first().getText()).
        toMatch(/BUILD YOUR OWN PENDANT/);
    });

  });
/*
  describe('view1', function() {

    beforeEach(function() {
      browser.get('index.html#/view1');
    });


    it('should render view1 when user navigates to /view1', function() {
      expect(element.all(by.css('[ng-view] p')).first().getText()).
        toMatch(/partial for view 1/);
    });

  });


  describe('view2', function() {

    beforeEach(function() {
      browser.get('index.html#/view2');
    });


    it('should render view2 when user navigates to /view2', function() {
      expect(element.all(by.css('[ng-view] p')).first().getText()).
        toMatch(/partial for view 2/);
    });

  });
*/
});

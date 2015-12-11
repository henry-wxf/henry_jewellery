'use strict';

describe('Jewellry app', function() {


  it('should automatically redirect to /home when location hash/fragment is empty', function() {
    browser.get('index.html');
    expect(browser.getLocationAbsUrl()).toMatch("/home");
  });

  it('should show active class after clicking a navigation link', function(){
    browser.get('index.html');
    expect(element(by.css(".active")).element(by.css("a")).getText()).toBe("Special");

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
});

'use strict';

describe('Jewellery app', function() {


  it('should automatically redirect to /home when location hash/fragment is empty', function() {
    browser.get('index.html');
    expect(browser.getLocationAbsUrl()).toMatch("/home");
  });

  it('should show active class after clicking a navigation link', function(){
    browser.get('index.html');
    expect(element(by.css("li#home")).element(by.css("a")).getText()).toBe("Home");

    element(by.css('a[href="#/deals"]')).click();
    expect(element(by.css("li#deals")).element(by.css("a")).getText()).toBe("Deals");
  });

  describe('jewellery.home', function() {

    beforeEach(function() {
      browser.get('index.html#/home');
    });


    it('should render home when user navigates to /home', function() {
      expect(element(by.repeater('offer in offers')).isPresent()).toBe(true);
    });

  });
});

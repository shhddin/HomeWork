package hw13Selenium_dynamic_xpath;

class DynamicXpath {
	
	/* 1) Tag with single attribute 
	 * //a[@name='myaccount']
	 * //a[@href='https://www.xfinity.com/learn/moving']
	 * //a[@class='cms-logo']
	 * //input[@id='main-search-field']
	 * //a[@class='tv-carousel-link poster-items-links']
	 */
	
	
	/* 2) Tag with multiple attribute OR logic
	 * //a[@name='myxfinity' or @class='xc-header--navigation-link xc-header--active']
	 * //input[@id='main-search-field' or @name='searchTerm']
	 * //input[@id='user' or @name='user']
	 * //button[@class='btn md theme1 fill sc-prism-button-default sc-prism-button-default-s' or @id='sign_in']
	 * //a[@name='comcastbusiness' or @class='xc-header--slim-navigation-link']
	 */
	
	
	/* 3) Tag with multiple attribute AND logic
	 * //a[@name='myxfinity' and @class='xc-header--navigation-link xc-header--active']
	 * //input[@id='main-search-field' and @name='searchTerm']
	 * //input[@id='user' and @name='user']
	 * //button[@class='btn md theme1 fill sc-prism-button-default sc-prism-button-default-s' and @id='sign_in']
	 * //a[@name='comcastbusiness' and @class='xc-header--slim-navigation-link']
	 */
	
	
	/* 4) Tag with inner text [means complete text] 
	 * //a[text()='My Xfinity']
	 * //a[text()='Change Plan']
	 * //a[text()='Support']
	 * //a[text()='My Account']
	 * //a[text()='Moving']
	 */
	
	
	/* 5) Tag with inner text [Partial text]
	 * //p[contains(text(),'Tisch Cancer Center')]
	 * //p[contains(text(),'Masks are sti')]
	 * //a[contains(text(),'How to se')]  (from ebay)
	 * //p[contains(text(),'From listing to getting paid')]
	 * //h2[contains(text(),'Shop by')]
	 */
	
	
	/* 6) Tag with attributes and use of contains (not commonly used)
	 * //input[contains(@class,'gh-tb ui-autocomplete-input')]
	 * //input[contains(@class,'gh-tb ui-autocomplete-in')]
	 * //input[contains(@class,'gh-tb ui-autocomplet')]
	 * //input[contains(@class,'gh-tb ui-auto')]
	 * //input[contains(@class,'gh-tb ui-')]
	 */
	
	/* 7) Normalize space -- eliminates leading and trailing spaces.
	 * //a[normalize-space(text())='Find a Doctor']
	 * //a[normalize-space(text())='Patient Care' and @role='button']
	 * //a[normalize-space(text())='About Us']
	 * //a[normalize-space(text())='About Us' and @class='hidden-xs dropdown']
	 * //a[normalize-space(text())='Request an Appointment' and @href='/appointment']
	 */
	
	
	/* 8) Starts with text
	 * //p[starts-with(text(),'From global ')]
	 * //p[starts-with(text(),'You can')]
	 * //p[starts-with(text(),'Our p')]
	 * //p[starts-with(text(),'From mobile apps')]
	 * //p[starts-with(text(),'Our approachable')]
	 */
	
	
/* 9) Starts with attribute (not commonly used, no need to practice it)
 * //a[starts-with(@class,'thrd')]
 * //a[starts-with(@class,'textual-display')]
 * //input[starts-with(@id,'userid')]
 * //input[starts-with(@id,'Email')]
 * //input[starts-with(@id,'password')]
 */
	
	
	
}

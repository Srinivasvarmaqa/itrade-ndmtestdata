package com.itt.spend.tests;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.itt.basetest.ITTBaseTest;
import com.itt.parser.testdata.TestData;
import com.itt.parser.testdata.TestDataProviders;
import com.itt.spend.datamodelhelper.SPENDDataModelHelperFactory;
import com.itt.spend.pages.login.SPENDLoginPage.USER;

public class WidgetLibraryTest extends ITTBaseTest {
	private static final Logger LOG =LoggerFactory.getLogger(WidgetLibraryTest.class);
	private String tabName;
	private String menuName;
	private String menu;
	private String textmenu;
	
	@BeforeMethod
	public void beforeMethodWidgetLibraryTest() throws Exception {
	LOG.info("Before Method Operator User Login Test");
	LOG.info("APP URL is" +APP_URL);
	sPENDHelperFactory.getSPENDLoginPage().goToLoginPage(APP_URL);

	}
	@Test(dataProvider = "testDataProvider", dataProviderClass = TestDataProviders.class)
	@TestData(dataFilePath = "testdata_C56789_oms_carrier.json")
	public void testClickOnWidgets(SPENDDataModelHelperFactory spendDataModelHelperFactory) throws Exception {
		LOG.info("===== " + Thread.currentThread().getStackTrace()[1].getMethodName() + " TEST CASE EXECUTION STARTED  =====");
		sPENDHelperFactory.getSPENDLoginPage().loginToSPEND(USER.OPERATOR, spendDataModelHelperFactory);
		
		LOG.info("CLICK ON WIDGET LIBRARY AND VERIFY");
		sPENDHelperFactory.getinsightsMainWindowPage().clickWidgetLibraryF();
		LOG.info("CLICK ON UNCONFIRMED PO AND VERIFY");
		textmenu="UNCONFIRMED PO’S";
		tabName=sPENDHelperFactory.getinsightsMainWindowPage().clickUnconfirmedPoWidget(textmenu);
		Assert.assertEquals(tabName, textmenu, textmenu + "title not found"  );
				
	}
	}

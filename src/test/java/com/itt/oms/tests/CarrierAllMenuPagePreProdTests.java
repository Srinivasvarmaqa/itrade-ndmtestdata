package com.itt.oms.tests;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.itt.basetest.ITTBaseTest;
import com.itt.oms.datamodelhelper.OMSDataModelHelperFactory;
import com.itt.oms.pages.login.OMSLoginPage.USER;
import com.itt.parser.testdata.TestData;
import com.itt.parser.testdata.TestDataProviders;

public class CarrierAllMenuPagePreProdTests extends ITTBaseTest {

	private static final Logger LOG = LoggerFactory.getLogger(CarrierAllMenuPagePreProdTests.class);
    private String tabName;
    private String menuName;
    private String mainMenuName;
	
	@BeforeMethod
	public void beforeMethodCarrierAllMenuPagePreProdTests() throws Exception {
		LOG.info("Before Method CarrierAllMenuPagePreProdTests Workflow Test");
		LOG.info("APP URL is " + APP_URL);
		oMSHelperFactory.getOMSLoginPage().goToLoginPage(APP_URL);
	}

	@Test(dataProvider = "testDataProvider", dataProviderClass = TestDataProviders.class)
	@TestData(dataFilePath="testdata_C2345_oms_carriermenu.json")
    public void testClickAllMenusAndPages(OMSDataModelHelperFactory omsDataModelHelperFactory) throws Exception {
       	LOG.info("===== " + Thread.currentThread().getStackTrace()[1].getMethodName() + " TEST CASE EXECUTION STARTED  =====");

		LOG.info("Login as Carrier");
		oMSHelperFactory.getOMSLoginPage().loginToOMS(USER.CARRIER, omsDataModelHelperFactory);
		oMSHelperFactory.closeAllChildWindowPopups();
		
		LOG.info("CLICK ON ALL LOGISTICS C PAGES AND VERIFY");
		mainMenuName = "Logistics C";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftMainMenu(mainMenuName);		 
		Assert.assertEquals(tabName, mainMenuName, mainMenuName + " title not found");
		
		menuName = "Order Status";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Load Status";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Load Builder";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Tendering Loads";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "RFQ Status";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "RFQ Status";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Load Tracker";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "GPS Load Tracking";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "GPS Exception Report";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Availability";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Post Availability";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
//		menuName = "Post Availability Non-RFQ";
//		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
//		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
//		Assert.assertEquals(tabName, menuName, menuName + " title not found");
//		
		menuName = "Accounting";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Invoice";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Configuration";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Vehicle";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Containers";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Drivers";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "204 Ref Table";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Tax Code Setup";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		oMSHelperFactory.getoMSMenuNavigationPage().openLeftMainMenu(mainMenuName);
		
		LOG.info("CLICK ON ALL SETTINGS PAGES AND VERIFY");
		mainMenuName = "Settings";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftMainMenu(mainMenuName);		 
		Assert.assertEquals(tabName, mainMenuName, mainMenuName + " title not found");
		
		menuName = "Location Admin";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "HQ Info";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
//		menuName = "Locations";
//		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
//		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
//		Assert.assertEquals(tabName, menuName, menuName + " title not found");
//		
//		menuName = "Proprietary Code Map";
//		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
//		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
//		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "User Admin";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "User Profile";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Create User";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");

		menuName = "PCM";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");

		menuName = "User Report";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Configuration";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Partners";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "E-Mail Setup";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
//		menuName = "Setup Options";
//		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
//		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
//		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
//		menuName = "Mobile Texting Setup";
//		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
//		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
//		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Process Notifications ";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName.trim(), menuName + " title not found");
		
		menuName = "User Profile";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Update User";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Partner Directory";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Options";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Integration Documents";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");

		menuName = "Integration Documents";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");

		
		oMSHelperFactory.getoMSMenuNavigationPage().openLeftMainMenu(mainMenuName);
		
    	LOG.info("===== " + Thread.currentThread().getStackTrace()[1].getMethodName() + " TEST CASE EXECUTION COMPLETED  =====");
	}
	
    @AfterMethod
    public void afterMethodCarrierAllMenuPagePreProdTests() throws Exception {
    	LOG.info("After Method CarrierAllMenuPagePreProdTests Workflow Test");
    }
}

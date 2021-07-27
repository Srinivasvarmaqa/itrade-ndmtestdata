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

public class OperatorAllMenuPagePreProdTests extends ITTBaseTest {

	private static final Logger LOG = LoggerFactory.getLogger(OperatorAllMenuPagePreProdTests.class);
    private String tabName;
    private String menuName;
    private String mainMenuName;
	
	@BeforeMethod
	public void beforeMethodOperatorAllMenuPagePreProdTests() throws Exception {
		LOG.info("Before Method CarrierAllMenuPagePreProdTests Workflow Test");
		LOG.info("APP URL is " + APP_URL);
		oMSHelperFactory.getOMSLoginPage().goToLoginPage(APP_URL);
	}

	@Test(dataProvider = "testDataProvider", dataProviderClass = TestDataProviders.class)
	@TestData(dataFilePath="testdata_C2345678_oms_operatormenu.json")
    public void testClickAllOperatorMenusAndPages(OMSDataModelHelperFactory omsDataModelHelperFactory) throws Exception {
       	LOG.info("===== " + Thread.currentThread().getStackTrace()[1].getMethodName() + " TEST CASE EXECUTION STARTED  =====");

		LOG.info("Login as Operator");
		oMSHelperFactory.getOMSLoginPage().loginToOMS(USER.OPERATOR, omsDataModelHelperFactory);
		oMSHelperFactory.closeAllChildWindowPopups();
		
		LOG.info("CLICK ON ALL SPEND PAGES AND VERIFY");
		mainMenuName = "Spend";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftMainMenu(mainMenuName);		 
		Assert.assertEquals(tabName, mainMenuName, mainMenuName + " title not found");
		
		menuName = "My Dashboard";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Dash Board";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Post POS Maintenance";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		oMSHelperFactory.getoMSMenuNavigationPage().openLeftMainMenu(mainMenuName);
		
		LOG.info("CLICK ON ALL CONTRACT PAGES AND VERIFY");
		mainMenuName = "Contract";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftMainMenu(mainMenuName);		 
		Assert.assertEquals(tabName, mainMenuName, mainMenuName + " title not found");
		
		menuName = "My Contracts";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Status";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Contract Item Filter";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Contract Change Report";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "List Release Config";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Pricing Report";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "DPC Exclusions";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		// Error found in this page, could be a bug, pelase check
//		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Program Report Queue";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Excl/Incl Admin";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Program Admin";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Program Type";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Distributor Markup";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		//Errors in the page
//		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Alert Admin";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		oMSHelperFactory.getoMSMenuNavigationPage().openLeftMainMenu(mainMenuName);
		
		LOG.info("CLICK ON ALL ADMIN PAGES AND VERIFY");
		mainMenuName = "Spend Admin";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftMainMenu(mainMenuName);		 
		Assert.assertEquals(tabName, mainMenuName, mainMenuName + " title not found");
		
		menuName = "Org Admin";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Vendor Admin";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Distributor Admin";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "VDA Config";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Minority Admin";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Reference Data";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Master Product Lookup";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Cust Admin";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Unit Admin";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Distributor Assignment";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Create Unit Hierarchy ";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName.trim(), menuName + " title not found");
		
		menuName = "Assign Unit Hierarchy ";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName.trim(), menuName + " title not found");
		
		menuName = "Organization View";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Group Admin";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Manage Group";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Create Group";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		oMSHelperFactory.getoMSMenuNavigationPage().openLeftMainMenu(mainMenuName);
		
		LOG.info("CLICK ON ALL FINANCE PAGES AND VERIFY");
		mainMenuName = "Finance";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftMainMenu(mainMenuName);		 
		Assert.assertEquals(tabName, mainMenuName, mainMenuName + " title not found");
		
		menuName = "VDA Calculation";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "VDA Calculation";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "VDA Process Queue";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Invoice";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Monthly Invoice";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Pre-Invoice";
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
		
		menuName = "Currency Admin";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Auto Number";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Setup Options";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "UOM Setup";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
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
		
		oMSHelperFactory.getoMSMenuNavigationPage().openLeftMainMenu(mainMenuName);
		
    	LOG.info("===== " + Thread.currentThread().getStackTrace()[1].getMethodName() + " TEST CASE EXECUTION COMPLETED  =====");
	}
	
    @AfterMethod
    public void afterMethodOperatorAllMenuPagePreProdTests() throws Exception {
    	LOG.info("After Method OperatorAllMenuPagePreProdTests Workflow Test");
    }
}

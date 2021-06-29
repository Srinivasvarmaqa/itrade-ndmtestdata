package com.itt.oms.tests;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.itt.basetest.OMSBaseTest;
import com.itt.oms.datamodelhelper.OMSDataModelHelperFactory;
import com.itt.oms.pages.login.OMSLoginPage.USER;
import com.itt.parser.testdata.TestData;
import com.itt.parser.testdata.TestDataProviders;

public class VendorAllMenuPagePreProdTests extends OMSBaseTest {

	private static final Logger LOG = LoggerFactory.getLogger(VendorAllMenuPagePreProdTests.class);
    private String tabName;
    private String menuName;
    private String mainMenuName;
	
	@BeforeMethod
	public void beforeMethodVendorAllMenuPagePreProdTests() throws Exception {
		LOG.info("Before Method CarrierAllMenuPagePreProdTests Workflow Test");
		LOG.info("APP URL is " + APP_URL);
		oMSHelperFactory.getOMSLoginPage().goToLoginPage(APP_URL);
	}

	@Test(dataProvider = "testDataProvider", dataProviderClass = TestDataProviders.class)
	@TestData(dataFilePath="testdata_C23456_oms_vendormenu.json")
    public void testClickVendorMenusAndPages(OMSDataModelHelperFactory omsDataModelHelperFactory) throws Exception {
       	LOG.info("===== " + Thread.currentThread().getStackTrace()[1].getMethodName() + " TEST CASE EXECUTION STARTED  =====");

		LOG.info("Login as Vendor");
		oMSHelperFactory.getOMSLoginPage().loginToOMS(USER.VENDOR, omsDataModelHelperFactory);
		oMSHelperFactory.closeAllChildWindowPopups();
		
		LOG.info("CLICK ON ALL VENDOR PAGES AND VERIFY");
		mainMenuName = "Vendor";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftMainMenu(mainMenuName);		 
		Assert.assertEquals(tabName, mainMenuName, mainMenuName + " title not found");
		
		menuName = "Order Status";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "PO Status";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Demand Status";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "OMS";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Create Order";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "PS Module";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "PS Status";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Create New PS";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");

		menuName = "PS Analyzer";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "RFQ Module";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "RFQ Summary";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Contracts";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		//Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		oMSHelperFactory.getoMSMenuNavigationPage().openLeftMainMenu(mainMenuName);
		
		LOG.info("CLICK ON CONTRACT PAGES AND VERIFY");
		mainMenuName = "Contract";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftMainMenu(mainMenuName);		 
		Assert.assertEquals(tabName, mainMenuName, mainMenuName + " title not found");
		
		menuName = "Contracts";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Create";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Status";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		oMSHelperFactory.getoMSMenuNavigationPage().openLeftMainMenu(mainMenuName);
		
		LOG.info("CLICK ON ALL SHIPPING PAGES AND VERIFY");
		mainMenuName = "Shipping";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftMainMenu(mainMenuName);		 
		Assert.assertEquals(tabName, mainMenuName, mainMenuName + " title not found");
		
		menuName = "Shipping W/H";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Shipping Status";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Auto Assignment";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Confirmation Of Sales";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "W/H Appointment";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Appointments";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Warehouse Dock Setup";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Setup";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "LPN Setup";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "View Labels";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		oMSHelperFactory.getoMSMenuNavigationPage().openLeftMainMenu(mainMenuName);
		
		LOG.info("CLICK ON ALL XDOCK PAGES AND VERIFY");
		mainMenuName = "Xdock";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftMainMenu(mainMenuName);		 
		Assert.assertEquals(tabName, mainMenuName, mainMenuName + " title not found");
		
		menuName = "X-Dock Order";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "My X-dock Orders";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "X-Dock Setup";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Manage X-Docks";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		oMSHelperFactory.getoMSMenuNavigationPage().openLeftMainMenu(mainMenuName);
		
		LOG.info("CLICK ON ALL PLANNING PAGES AND VERIFY");
		mainMenuName = "Planning";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftMainMenu(mainMenuName);		 
		Assert.assertEquals(tabName, mainMenuName, mainMenuName + " title not found");
		
		menuName = "VMI";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Manage";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Configuration";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "PO Setup";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Shipping Calendar";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "PO Creation";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		oMSHelperFactory.getoMSMenuNavigationPage().openLeftMainMenu(mainMenuName);
		
		LOG.info("CLICK ON ALL ACCOUNTING PAGES AND VERIFY");
		mainMenuName = "Accounting";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftMainMenu(mainMenuName);		 
		Assert.assertEquals(tabName, mainMenuName, mainMenuName + " title not found");
		
		menuName = "Invoice";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Invoice";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Net Term Setup";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Retail Contract Invoice";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Term Attachments";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Reconcile";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Reconcile";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		oMSHelperFactory.getoMSMenuNavigationPage().openLeftMainMenu(mainMenuName);
		
		LOG.info("CLICK ON CaRMA PAGES AND VERIFY");
		mainMenuName = "CaRMA";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftMainMenu(mainMenuName);		 
		Assert.assertEquals(tabName, mainMenuName, mainMenuName + " title not found");
		
		menuName = "POP";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "POP Viewer (EDI 867 )";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		oMSHelperFactory.getoMSMenuNavigationPage().openLeftMainMenu(mainMenuName);
		
		LOG.info("CLICK ON ALL REPORTS PAGES AND VERIFY");
		mainMenuName = "Reports";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftMainMenu(mainMenuName);		 
		Assert.assertEquals(tabName, mainMenuName, mainMenuName + " title not found");
		
		menuName = "Enhanced Reports";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Enhanced Reports";
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
		
		menuName = "Locations";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Proprietary Code Map";
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
		
		menuName = "PCM";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "User Report";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Catalog Admin";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Product Group";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Item Catalog";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Map/Subs/MFG";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "SO Price Setup";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Price Setup";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Price Maintenance";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Price Search";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Templates Admin";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Update Templates";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Create Template";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Scorecard Admin";
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
		
		menuName = "Auto Number";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Setup Options";
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
		
		menuName = "Partner Directory";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Item Display Order";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "PS Defaults";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Options";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Price Options";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Price Build up";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "ES Charges";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "ES Set Up";
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
		
		menuName = "Broker Setup";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Customer Assignment";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Broker Assignment";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Category Assignment";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftMainMenu(mainMenuName);
		
		LOG.info("CLICK ON ALL PID PAGES AND VERIFY");
		mainMenuName = "PID";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftMainMenu(mainMenuName);		 
		Assert.assertEquals(tabName, mainMenuName, mainMenuName + " title not found");
		
		menuName = "Item Master";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Search";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Summary Report";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Upload Catalog";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Upload Results";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Item Map";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Unmapped Items In PO";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Mapped Items";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Map/Subs/MFG";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Nutritional Data";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Item Maintenance";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Nutritional Data";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "GDSN";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "GDSN";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		oMSHelperFactory.getoMSMenuNavigationPage().openLeftMainMenu(mainMenuName);
		
    	LOG.info("===== " + Thread.currentThread().getStackTrace()[1].getMethodName() + " TEST CASE EXECUTION COMPLETED  =====");
	}
	
    @AfterMethod
    public void afterMethodVendorAllMenuPagePreProdTests() throws Exception {
    	LOG.info("After Method VendorAllMenuPagePreProdTests Workflow Test");
    	oMSHelperFactory.logout();
    }
}

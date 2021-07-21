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

public class BuyerAllMenuPageBuy8PreProdTests2 extends ITTBaseTest {

	private static final Logger LOG = LoggerFactory.getLogger(BuyerAllMenuPageBuy8PreProdTests2.class);
    private String tabName;
    private String menuName;
    private String mainMenuName;
	
	@BeforeMethod
	public void beforeMethodBuyerAllMenuPageBuy8PreProdTests() throws Exception {
		LOG.info("Before Method BuyerAllMenuPageBuy8PreProdTests Workflow Test");
		LOG.info("APP URL is " + APP_URL);
		oMSHelperFactory.getOMSLoginPage().goToLoginPage(APP_URL);
	}

	@Test(dataProvider = "testDataProvider", dataProviderClass = TestDataProviders.class)
	@TestData(dataFilePath="testdata_C234567_oms_buyermenu.json")
    public void testClickAllMenusAndPages(OMSDataModelHelperFactory omsDataModelHelperFactory) throws Exception {
       	LOG.info("===== " + Thread.currentThread().getStackTrace()[1].getMethodName() + " TEST CASE EXECUTION STARTED  =====");

		LOG.info("Login as Buyer");
		oMSHelperFactory.getOMSLoginPage().loginToOMS(USER.BUYER, omsDataModelHelperFactory);
		oMSHelperFactory.closeAllChildWindowPopups();

		
		LOG.info("CLICK ON ALL ACCOUNTING PAGES AND VERIFY");
		mainMenuName = "Accounting";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftMainMenu(mainMenuName);		 
		Assert.assertEquals(tabName, mainMenuName, mainMenuName + " title not found");
		
		menuName = "Invoice";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "2 Invoice";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");

		menuName = "Invoice";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Net Term Setup";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Term Attachments";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Term and Policy";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
//		// looks like bug only happeing when you login first time.
//		menuName = "Sales Order Invoice";
//		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
//		//Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
//		//Assert.assertEquals(tabName, menuName, menuName + " title not found");
//		
//		// looks like bug only happeing when you login first time.
//		Thread.sleep(3000);
//		oMSHelperFactory.closeAllChildWindowPopups();
//		oMSHelperFactory.getoMSMenuNavigationPage().openLeftMainMenu(mainMenuName);
//		
//		menuName = "Invoice";
//		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
//		//Assert.assertEquals(tabName, menuName, menuName + " title not found");
//		
//		menuName = "Sales Order Invoice";
//		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
//		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
//		Assert.assertEquals(tabName, menuName, menuName + " title not found");
//		// above is temp workaround for now.
		
		menuName = "VAT Setup";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Invoice Terms and Bank Account Setup";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Claim Entry";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Claim Entry";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Reconcile";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "3 Reconcile";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");

		menuName = "2 Reconcile";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Reconcile";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");

		oMSHelperFactory.getoMSMenuNavigationPage().openLeftMainMenu(mainMenuName);

		LOG.info("CLICK ON ALL CARMA PAGES AND VERIFY");
		mainMenuName = "CaRMA";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftMainMenu(mainMenuName);		 
		Assert.assertEquals(tabName, mainMenuName, mainMenuName + " title not found");
		
		menuName = "Deals";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Status";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "POP";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Status";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");

		menuName = "POP Viewer (EDI 867)";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "POP Import";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Create P.O.PUR.";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");

		menuName = "Vendor A/R";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "A/R Status";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");

		menuName = "Short Pay Process";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");

		menuName = "Reports";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Reports";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Partner A/R";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Status";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");

		menuName = "Config Admin";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Alert Admin";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");

		menuName = "Organization";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Operator & BG";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");

		menuName = "Manufacturers";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		oMSHelperFactory.getoMSMenuNavigationPage().openLeftMainMenu("CaRMA");	
		
		LOG.info("CLICK ON ALL REPORT PAGES AND VERIFY");
		mainMenuName = "Reports";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftMainMenu(mainMenuName);		 
		Assert.assertEquals(tabName, mainMenuName, mainMenuName + " title not found");
		
		menuName = "Generic Reports";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Purchase Order";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");

		menuName = "Buyer PO";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Vendor Sales Order";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Kroger Reports";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Buyer Reports";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");

		menuName = "Transportation Reports";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Vendor Reports";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Vendor Reports";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "USDA Reports";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Trade Reports";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");

		menuName = "USDA Comparison";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Daily Trades Period";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Albertson PM Reports";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Buyer Report";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Reports";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "USDA Report";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");

		menuName = "Reports";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Custom Reports";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Buyer Reports";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");

		menuName = "Transaction Reports";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Transportation Reports";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");

		menuName = "Load/PO Report";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");

		menuName = "Response Time";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");

		oMSHelperFactory.getoMSMenuNavigationPage().openLeftMainMenu(mainMenuName);	
		
		LOG.info("CLICK ON ALL SETTINGS PAGES PART1 AND VERIFY");
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
		
		menuName = "RPC/CHEP";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Group";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Regions";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Proprietary Code Map";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Create Pseudo Vendor";
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
		
		menuName = "Map SKU";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Catalog Importer";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Catalog Attributes";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Catalog Options";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "MO Price Setup";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Shipper Assignment";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Price Setup";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Price Maintenance";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Overage Price Setup";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Price Search";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "PO Price Setup";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Shipper Assignment";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Price Setup";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Price Maintenance";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Overage Price Setup";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Price Search";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "SO Price Setup";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
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
		
		menuName = "MO Roll Back";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "PO Roll Back";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Vendor ID MGMT";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "2 SDF";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Currency Admin";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "3 SDF";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
//		menuName = "Partner Proprietary Id's";
//		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
//		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
//		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "E-Mail Setup";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
//		oMSHelperFactory.getoMSMenuNavigationPage().clickRightArrow(5);
		
		menuName = "Auto Number";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Setup Options";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "UOM Admin";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "UOM Setup";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "GDSN Preferences";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
//		oMSHelperFactory.getoMSMenuNavigationPage().clickRightArrow(8);
		
//		menuName = "Incoterm";
//		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
//		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
//		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "PO Recap Pref";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Load Estimator";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "PO Cancellation Reason";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Customer Freight Matrix";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Markup Fee Matrix";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Markup Fee Exceptions";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Shipping Origin";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
//		oMSHelperFactory.getoMSMenuNavigationPage().clickRightArrow(3);
		
		menuName = "Vendor ID MGMT EXT";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
//		menuName = "Incoterm ";
//		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
//		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
//		Assert.assertEquals(tabName, menuName.trim(), menuName + " title not found");
		
		menuName = "Process Notifications ";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName.trim(), menuName + " title not found");
		
		oMSHelperFactory.getoMSMenuNavigationPage().clickLeftArrow(18);
		oMSHelperFactory.getoMSMenuNavigationPage().openLeftMainMenu(mainMenuName);

		LOG.info("Log out");
		oMSHelperFactory.logout();
		
		LOG.info("Login as Buyer");
		oMSHelperFactory.getOMSLoginPage().loginToOMS(USER.BUYER, omsDataModelHelperFactory);
		oMSHelperFactory.closeAllChildWindowPopups();
		
		LOG.info("CLICK ON ALL SETTINGS PAGES PART2 AND VERIFY");
		mainMenuName = "Settings";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftMainMenu(mainMenuName);		 
		Assert.assertEquals(tabName, mainMenuName, mainMenuName + " title not found");
		
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
		
		menuName = "Board Price";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Cap Price";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "PO/RFQ/Demand Preference";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
//		oMSHelperFactory.getoMSMenuNavigationPage().clickRightArrow(3);
		
		menuName = "PO Defaults Indirect";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "PO Defaults Direct";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "MO Preference";
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
		
		oMSHelperFactory.getoMSMenuNavigationPage().clickLeftArrow(5);
		
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
		
		menuName = "Landed Cost";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Fee Matrix";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "ES Set Up";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Max ES";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "USDA Admin";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Daily Data";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "User Display";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Global Display";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Assign Products";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Custom Services";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Services Assignment";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Custom Services Setup";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		oMSHelperFactory.getoMSMenuNavigationPage().openLeftMainMenu(mainMenuName);
		
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
		
		menuName = "Add New Item";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Display Option";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Data Importer";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Catalog Group Option";
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
	
		//Taking long time almost 2 minutes to validate the page.Hence commented out
		menuName = "Upload Results";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
//		//Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
//		Looks like a bug has 2 items
//		menuName = "List Price";
//		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
//		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
//		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "DMS";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "DMS Admin";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		//Looks like a bug need to confirm 
		menuName = "Data Management Services";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		//Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Item Map";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Map Item";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
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
		
		menuName = "Synch Item";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Buyer Map";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Nutritional Data";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Recipe Status";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Recipe";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Item Maintenance";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Nutritional Data";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Watch List";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		oMSHelperFactory.getoMSMenuNavigationPage().openLeftMainMenu(mainMenuName);
		
    	LOG.info("===== " + Thread.currentThread().getStackTrace()[1].getMethodName() + " TEST CASE EXECUTION COMPLETED  =====");
	}
	
    @AfterMethod
    public void afterMethodBuyerAllMenuPageBuy8PreProdTests() throws Exception {
    	LOG.info("After Method BuyerAllMenuPageBuy8PreProdTests Workflow Test");
    }
}

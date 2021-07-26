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

public class BuyerAllMenuPageBuy8PreProdTests extends ITTBaseTest {

	private static final Logger LOG = LoggerFactory.getLogger(BuyerAllMenuPageBuy8PreProdTests.class);
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
			
		LOG.info("CLICK ON ALL BUYER PAGES AND VERIFY");
		mainMenuName = "Buyer";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftMainMenu(mainMenuName);		 
		Assert.assertEquals(tabName, mainMenuName, mainMenuName + " title not found");
		
		menuName = "Customer Order";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "MO Status";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Order Confirmation";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Create MO";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Multi PO Assignment";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Demand";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
//		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Multi Single Item PO";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Customer RFQ";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Order Requisition";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Order Requisition Status";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Create REQ";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
//		menuName = "Item Buy Board";
//		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
//		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
//		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "OMS";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");

		menuName = "PO Status";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Create PO";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Create Direct PO";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");

		menuName = "PO Direct";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Direct PO Status";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");

		menuName = "PO Direct";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "PO Demand";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Ceiling Price";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");

		menuName = "USDA Update";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "USDA Setup";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "RFQ Module";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "RFQ Status";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Create New RFQ";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "RFQ Analyzer";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Contracts";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Customer Offer Price";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Landed Cost Analyzer";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "RFQ-DM Module";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Create New RFQ";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Create New Demand";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Demand Status";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");

		menuName = "PS Module";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");

		menuName = "PS Summary";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "PS Analyzer";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		oMSHelperFactory.getoMSMenuNavigationPage().openLeftMainMenu(mainMenuName);
		
		LOG.info("CLICK ON ALL RETAIL PAGES AND VERIFY");
		mainMenuName = "Retail";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftMainMenu(mainMenuName);		 
		Assert.assertEquals(tabName, mainMenuName, mainMenuName + " title not found");
		
		menuName = "Create Order";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "PO Indirect";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "PO Direct";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Demand";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "RFQ";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Order Status";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "PO Direct";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Demand";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "PO Indirect";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "RFQ Response";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "PO Summary";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "RFQ Module";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");

		menuName = "RFQ Status";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Create New RFQ";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "RFQ Analyzer";
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
		
		menuName = "PS Analyzer";
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

		menuName = "Order Status";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Received by Warehouse";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "My X-dock Orders";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
	
		menuName = "X-Dock Setup";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");

		menuName = "Configuration";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Manage X-Docks";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Assign X-dock";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Alt W/H Setup";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Appointment";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");

		menuName = "W/H Appointment";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Warehouse Setup";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		oMSHelperFactory.getoMSMenuNavigationPage().openLeftMainMenu(mainMenuName);
		
		LOG.info("CLICK ON ALL PLANNING PAGES AND VERIFY");
		mainMenuName = "Planning";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftMainMenu(mainMenuName);		 
		Assert.assertEquals(tabName, mainMenuName, mainMenuName + " title not found");

		menuName = "Demand";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");

		menuName = "PM Demand Status";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Demand Requisition";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Create Demand (MW)";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Create Demand";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Demand Worksheet";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "PO Demand";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Demand Status";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		oMSHelperFactory.getoMSMenuNavigationPage().clickRightArrow(5);
		
		menuName = "Seller Demand Status ";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName.trim(), menuName + " title not found");
		
		menuName = "User Preference";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Company Preference";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		oMSHelperFactory.getoMSMenuNavigationPage().clickLeftArrow(7);
		
		menuName = "Forecast";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");

		menuName = "Inventory Position";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Event Setup";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Warehouse Setup";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "History View Setup";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Data Loader";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "VMI View";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");

		menuName = "View";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Configuration";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "PO Number Assignment";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Receiving Calendar";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");

		menuName = "Offers";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");

		menuName = "Offer Price";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		oMSHelperFactory.getoMSMenuNavigationPage().openLeftMainMenu(mainMenuName);
		
		LOG.info("CLICK ON ALL LOGISTIC PAGES AND VERIFY");
		mainMenuName = "Logistics";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftMainMenu(mainMenuName);		 
		Assert.assertEquals(tabName, mainMenuName, mainMenuName + " title not found");
		
		menuName = "Load Builder";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");

		menuName = "New Orders";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Load Manager";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");

		menuName = "Load Status";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Appointment View";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		//Thread.sleep(2000);
		menuName = "Dispatch Advice";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		//Check this issue
		//Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		//Assert.assertEquals(tabName, menuName, menuName + " title not found");

		Thread.sleep(2000);
		oMSHelperFactory.closeAllChildWindowPopups();
		//Thread.sleep(2000);
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftMainMenu(mainMenuName);
		menuName = "Load Status";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Order Status";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Load Tracker";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		//Thread.sleep(2000);
		menuName = "GPS Tracking";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "GPS Exception Report ";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName.trim(), menuName + " title not found");
		
		menuName = "Shipper GPS Tracking";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Shipper GPS Exception Report";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "RFQ";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Dashboard Status";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Create RFQ";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName.trim(), menuName + " title not found");
		
		menuName = "RFQ Load Report";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Configuration";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Load Option";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");

		menuName = "Receiving Zone";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Shipping Zone";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Load Estimator";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Inbound FRT Matrix";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Carrier";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Origin";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Pay Rate";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Temperature Management";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
//		oMSHelperFactory.getoMSMenuNavigationPage().clickRightArrow(8);
		
		menuName = "Vendor Certification";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Customer FRT Contract";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		oMSHelperFactory.getoMSMenuNavigationPage().clickRightArrow(4);
		menuName = "Vendor Origin";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Customer Price Matrix";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "DC FRT Matrix";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");

		oMSHelperFactory.getoMSMenuNavigationPage().clickLeftArrow(4);
		
		menuName = "Availability";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
//		menuName = "Carrier Availability";
//		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
//		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
//		Assert.assertEquals(tabName, menuName, menuName + " title not found");
				
		menuName = "Setup";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Receiving Zone";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Shipping Zone";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Segments";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Carrier Management";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Regional Groups";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
//		// Review this code as there are duplicate tabs
//		menuName = "Rate Management";
//		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
//		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
//		Assert.assertEquals(tabName, menuName, menuName + " title not found");
//		
//		menuName = "Rate Management2";
//		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
//		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
//		Assert.assertEquals(tabName, menuName, menuName + " title not found");

		menuName = "Load Estimator";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Options";
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
		
		menuName = "Reports";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Reports";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Transportation Report";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		oMSHelperFactory.getoMSMenuNavigationPage().openLeftMainMenu(mainMenuName);

		Thread.sleep(5000);
		LOG.info("CLICK ON ALL RECEIVING PAGES AND VERIFY");
		mainMenuName = "Receiving";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftMainMenu(mainMenuName);		 
		Assert.assertEquals(tabName, mainMenuName, mainMenuName + " title not found");
		
		menuName = "Receiving W/H";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Receiving Status";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Confirmation Of Sales";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "COOL Vendor Assignment";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "RW Threshold";
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
		
		menuName = "Pallet Reporting";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Inbound";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Outbound";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Report";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "ASN Options";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "ASN Requirements";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Item Assignment";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "ASN Assignment";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Warehouse Restriction";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Third Party";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Service Setup";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Quote";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Claim Management";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Claim Entry";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Inspections";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Alt Warehouse";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Alt RWH Setup";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "3-PL";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Config";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");

		oMSHelperFactory.getoMSMenuNavigationPage().openLeftMainMenu(mainMenuName);
		
		LOG.info("CLICK ON ALL SERVICE ADMIN PAGES AND VERIFY");
		mainMenuName = "Service Admin";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftMainMenu(mainMenuName);		 
		Assert.assertEquals(tabName, mainMenuName, mainMenuName + " title not found");
		
		menuName = "Setup & Config";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Service Type";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openHeaderMenu(menuName);
		Assert.assertFalse(oMSHelperFactory.hasErrorMessage(), "Error found in this tab" + tabName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Flow Admin";
		tabName = oMSHelperFactory.getoMSMenuNavigationPage().openLeftSubMenu(mainMenuName,menuName);
		Assert.assertEquals(tabName, menuName, menuName + " title not found");
		
		menuName = "Route Service Management";
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

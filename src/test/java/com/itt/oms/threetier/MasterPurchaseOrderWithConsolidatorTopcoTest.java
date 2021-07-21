package com.itt.oms.threetier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.itt.basetest.ITTBaseTest;
import com.itt.oms.datamodelhelper.OMSDataModelHelperFactory;
import com.itt.oms.pages.login.OMSLoginPage.USER;
import com.itt.parser.testdata.TestData;
import com.itt.parser.testdata.TestDataProviders;

public class MasterPurchaseOrderWithConsolidatorTopcoTest extends ITTBaseTest {

	private static final Logger LOG = LoggerFactory.getLogger(MasterPurchaseOrderWithConsolidatorTopcoTest.class);

	@BeforeMethod
	public void beforeMethodMasterPurchaseOrderWithConsolidatorTopcoTest() throws Exception {
		LOG.info("Before Method PurchaseOrder Workflow Test");
		LOG.info("APP URL is " + APP_URL);
		oMSHelperFactory.getOMSLoginPage().goToLoginPage(APP_URL);
	}

	@Test(dataProvider = "testDataProvider", dataProviderClass = TestDataProviders.class)
	@TestData(dataFilePath="testdata_C1234567_oms_topco.json")
    public void testCreateMasterPurchaseOrderWithConsolidatorTopco(OMSDataModelHelperFactory omsDataModelHelperFactory) throws Exception {
       	LOG.info("===== " + Thread.currentThread().getStackTrace()[1].getMethodName() + " TEST CASE EXECUTION STARTED  =====");

       	LOG.info("*** BUYER - LOGIN AND CREATE MASTER PURCHASE ORDER AND GET VENDOR PO ***");

		LOG.info("Login as Buyer");
		oMSHelperFactory.getOMSLoginPage().loginToOMS(USER.BUYER, omsDataModelHelperFactory);
		oMSHelperFactory.closeAllChildWindowPopups();

		LOG.info("Create Purchase Order");
		oMSHelperFactory.getOmsMasterPurchaseOrderPage().createMasterPurchaseOrder(omsDataModelHelperFactory);
		
		LOG.info("Update Quantity and Price and submit the order");
		oMSHelperFactory.getoMSPurchaseOrderDetailsPage().submitPurchaseOrder(omsDataModelHelperFactory);
		
		LOG.info("Select Xdock");
		oMSHelperFactory.getOmsXdockPage().selectXdock(omsDataModelHelperFactory);
		
		LOG.info("verify member Price on page before booking Equal to  Broker Price");
		Assert.assertEquals(oMSHelperFactory.getoMSPurchaseOrderDetailsPage().getCustomerPrice(), oMSHelperFactory.getoMSPurchaseOrderDetailsPage().getBrokerPrice(), "");
		
		LOG.info("Get MO Number");
		String moNumber = oMSHelperFactory.getoMSPurchaseOrderDetailsPage().getMONumber();
		LOG.info("MO Number is :" + moNumber);
	
		LOG.info("Get Customer reference number");
		String customerReferenceNumber = oMSHelperFactory.getoMSPurchaseOrderDetailsPage().getCustomerReferenceNumber();
	
		LOG.info("Add custfrtcost");
		oMSHelperFactory.getoMSPurchaseOrderDetailsPage().addCustfrtCost(omsDataModelHelperFactory);
		
		LOG.info("Click on Submit Button");
		oMSHelperFactory.getoMSPurchaseOrderDetailsPage().clickOnSubmitButton();
		
	    LOG.info("verify Total Qty on page is Equal to  Total Broker Qty on page");
	    Assert.assertEquals(oMSHelperFactory.getoMSPurchaseOrderDetailsPage().getTotalQuantity(), oMSHelperFactory.getoMSPurchaseOrderDetailsPage().getTotalBrokerQuantity());

		LOG.info("Click on Vendor link");
		oMSHelperFactory.getoMSPurchaseOrderDetailsPage().clickVendorlinktopco();
		
		String vendorPONumber = oMSHelperFactory.getoMSPurchaseOrderDetailsPage().getVendorPOForTopco();
		LOG.info("Vendor - PO number is : " + vendorPONumber);

		LOG.info("Logout as Buyer");
		oMSHelperFactory.logout();
		
		LOG.info("*** VENDOR - LOGIN AND CONFIRM PO AND SHIP ORDER ***");

		LOG.info("Login as Vendor");
		oMSHelperFactory.getOMSLoginPage().loginToOMS(USER.VENDOR, omsDataModelHelperFactory);
		oMSHelperFactory.closeAllChildWindowPopups();
		
		LOG.info("Confirm Purchase Order");
		oMSHelperFactory.getoMSVendorOrderManagementPage().confirmPurchaseOrder(vendorPONumber, omsDataModelHelperFactory);
		
		String orderStatus = oMSHelperFactory.getOrderStatus();
		LOG.info("Vendor - PO status: " + orderStatus);
		Assert.assertEquals(orderStatus, "Status:Confirmed", "OrderStatus is NOT confirmed");
		
		LOG.info("Logout as Vendor");
		oMSHelperFactory.logout();
		
		LOG.info("*** BUYER - LOGIN AND SELECT CARRIER ***");

		LOG.info("Login as Buyer");
		oMSHelperFactory.getOMSLoginPage().loginToOMS(USER.BUYER, omsDataModelHelperFactory);
		oMSHelperFactory.closeAllChildWindowPopups();
		
		LOG.info("Select Carrier");
		oMSHelperFactory.gettMSNewOrderPage().selectCarrier(moNumber, omsDataModelHelperFactory);
		
		LOG.info("Get Load Number");
		String loadNumber = oMSHelperFactory.gettMSNewOrderPage().getLoadNumber();
		LOG.info("Load Number: " + loadNumber);
		
		LOG.info("Logout as Buyer");
		oMSHelperFactory.logout();
		
		LOG.info("*** CARRIER - LOGIN AND CONFIRM LOAD STATUS ***");

		LOG.info("Login as Carrier");
		oMSHelperFactory.getOMSLoginPage().loginToOMS(USER.CARRIER, omsDataModelHelperFactory);
		oMSHelperFactory.closeAllChildWindowPopups();
		
		LOG.info("Confirm the load status");
		oMSHelperFactory.getOmsLoadStatusPage().confirmLoadStatus(null, loadNumber, omsDataModelHelperFactory);
		
		LOG.info("Logout as Carrier");
		oMSHelperFactory.logout();
		
		LOG.info("*** VENDOR - LOGIN AND SHIP ORDER ***");

		LOG.info("Login as Vendor");
		oMSHelperFactory.getOMSLoginPage().loginToOMS(USER.VENDOR, omsDataModelHelperFactory);
		oMSHelperFactory.closeAllChildWindowPopups();
		
		LOG.info("Ship Order");
		oMSHelperFactory.getoMSShipmentOrderPage().shipOrder(vendorPONumber, omsDataModelHelperFactory);
		orderStatus = oMSHelperFactory.getOrderStatus();
		LOG.info("Vendor - PO status: " + orderStatus);
		
		LOG.info("Logout as Vendor");
		oMSHelperFactory.logout();

		LOG.info("*** BUYER - LOGIN AND RECEIVE ORDER ***");
		
		LOG.info("Login as Buyer");
		oMSHelperFactory.getOMSLoginPage().loginToOMS(USER.BUYER, omsDataModelHelperFactory);
		oMSHelperFactory.closeAllChildWindowPopups();

		LOG.info("Receive Order");
		oMSHelperFactory.getoMSReceiveOrderPage().receiveOrder(moNumber);
		orderStatus = oMSHelperFactory.getOrderStatus();
		LOG.info("Receive Order - PO status: " + orderStatus);
		Assert.assertEquals(orderStatus, "Status:Received", "OrderStatus is NOT In Received");

		LOG.info("Logout as Buyer");
		oMSHelperFactory.logout();

		LOG.info("*** VENDOR - LOGIN AND SUBMIT INVOICE ***");

		LOG.info("Login as Vendor");
		oMSHelperFactory.getOMSLoginPage().loginToOMS(USER.VENDOR, omsDataModelHelperFactory);
		oMSHelperFactory.closeAllChildWindowPopups();

		LOG.info("Submit Invoice");
		oMSHelperFactory.getoMSSubmitInvoicePage().submitInvoiceOrder(vendorPONumber);
		orderStatus = oMSHelperFactory.getOrderStatus();
		LOG.info("Invoice - PO status: " + orderStatus);
		Assert.assertEquals(orderStatus, "Submitted", "OrderStatus is NOT In Submitted");

		LOG.info("Logout as Vendor");
		oMSHelperFactory.logout();

    	LOG.info("===== " + Thread.currentThread().getStackTrace()[1].getMethodName() + " TEST CASE EXECUTION COMPLETED  =====");
	}
}

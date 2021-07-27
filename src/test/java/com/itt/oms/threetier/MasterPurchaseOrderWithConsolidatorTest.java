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

public class MasterPurchaseOrderWithConsolidatorTest extends ITTBaseTest {

	private static final Logger LOG = LoggerFactory.getLogger(MasterPurchaseOrderWithConsolidatorTest.class);

	@BeforeMethod
	public void beforeMethodPurchaseOrderWorkflowLoblawsTest() throws Exception {
		LOG.info("Before Method PurchaseOrder Workflow Test");
		LOG.info("APP URL is " + APP_URL);
		oMSHelperFactory.getOMSLoginPage().goToLoginPage(APP_URL);
	}

	@Test(dataProvider = "testDataProvider", dataProviderClass = TestDataProviders.class)
	@TestData(dataFilePath = "testdata_C123456_oms_kroger.json")
	public void testCreateMasterPurchaseOrderWithConsolidator(OMSDataModelHelperFactory omsDataModelHelperFactory) throws Exception {
		LOG.info("===== " + Thread.currentThread().getStackTrace()[1].getMethodName() + " TEST CASE EXECUTION STARTED  =====");

		LOG.info("*** BUYER - LOGIN AND CREATE MASTER PURCHASE ORDER AND SELECT XDOCK AND CARRIER ***");

		LOG.info("Login as Buyer");
		oMSHelperFactory.getOMSLoginPage().loginToOMS(USER.BUYER, omsDataModelHelperFactory);
		oMSHelperFactory.closeAllChildWindowPopups();

		LOG.info("Create Purchase Order");
		oMSHelperFactory.getOmsMasterPurchaseOrderPage().createMasterPurchaseOrder(omsDataModelHelperFactory);

		LOG.info("Get the PO number");
		String poNumber = oMSHelperFactory.getPONumber();

		LOG.info("Update Quantity and Price and submit the order");
		oMSHelperFactory.getoMSPurchaseOrderDetailsPage().submitPurchaseOrder(omsDataModelHelperFactory);

		LOG.info("Select Xdock");
		oMSHelperFactory.getOmsXdockPage().selectXdock(omsDataModelHelperFactory);

		String orderStatus = oMSHelperFactory.getOrderStatus();
		LOG.info("Buyer - PO status is: " + orderStatus);
		Assert.assertEquals(orderStatus, "Status:Booking", "OrderStatus is NOT Booking");

		LOG.info("Select Carrier");
		oMSHelperFactory.gettMSNewOrderPage().selectCarrier(poNumber, omsDataModelHelperFactory);

		LOG.info("Logout as Buyer");
		oMSHelperFactory.logout();

		LOG.info("*** CARRIER - LOGIN AND CONFIRM LOAD STATUS ***");

		LOG.info("Login as Carrier");
		oMSHelperFactory.getOMSLoginPage().loginToOMS(USER.CARRIER, omsDataModelHelperFactory);
		oMSHelperFactory.closeAllChildWindowPopups();

		LOG.info("Confirm the load status");
		oMSHelperFactory.getOmsLoadStatusPage().confirmLoadStatus(poNumber, null, omsDataModelHelperFactory);

		LOG.info("Logout as Carrier");
		oMSHelperFactory.logout();

		LOG.info("*** VENDOR - LOGIN AND CONFIRM PO AND SHIP ORDER ***");

		LOG.info("Login as Vendor");
		oMSHelperFactory.getOMSLoginPage().loginToOMS(USER.VENDOR, omsDataModelHelperFactory);
		oMSHelperFactory.closeAllChildWindowPopups();

		LOG.info("Confirm Purchase Order");
		oMSHelperFactory.getoMSVendorOrderManagementPage().confirmPurchaseOrder(poNumber, omsDataModelHelperFactory);
		orderStatus = oMSHelperFactory.getOrderStatus();
		LOG.info("Vendor - PO status: " + orderStatus);
		Assert.assertEquals(orderStatus, "Status:Confirmed", "OrderStatus is NOT confirmed");

		LOG.info("Ship Order");
		oMSHelperFactory.getoMSShipmentOrderPage().shipOrder(poNumber, omsDataModelHelperFactory);
		orderStatus = oMSHelperFactory.getOrderStatus();

		LOG.info("Logout as Vendor");
		oMSHelperFactory.logout();

		LOG.info("*** XDOCK - LOGIN AND CONFIRM ***");

		LOG.info("Login as Xdock user");
		oMSHelperFactory.getOMSLoginPage().loginToOMS(USER.XDOCK, omsDataModelHelperFactory);
		oMSHelperFactory.closeAllChildWindowPopups();

		LOG.info("Confirm order received from Xdock");
		oMSHelperFactory.getOmsXdockPage().confirmFromXdock(poNumber);

		LOG.info("Logout as Xdock user");
		oMSHelperFactory.logout();

		LOG.info("*** CARRIER - LOGIN AND CONFIRM LOAD AFTER SHIPPING ***");

		LOG.info("Login as Carrier");
		oMSHelperFactory.getOMSLoginPage().loginToOMS(USER.CARRIER, omsDataModelHelperFactory);
		oMSHelperFactory.closeAllChildWindowPopups();

		LOG.info("Confirm the load status after shipping");
		oMSHelperFactory.getOmsLoadStatusPage().confirmLoadAfterShipping(poNumber);

		LOG.info("Logout as Carrier");
		oMSHelperFactory.logout();

		LOG.info("*** XDOCK - LOGIN AND CONFIRM AFTER SHIPPING ***");

		LOG.info("Login as Xdock user");
		oMSHelperFactory.getOMSLoginPage().loginToOMS(USER.XDOCK, omsDataModelHelperFactory);
		oMSHelperFactory.closeAllChildWindowPopups();

		LOG.info("Confirm order received from Xdock");
		oMSHelperFactory.getOmsXdockPage().confirmFromXdock(poNumber);

		LOG.info("Logout as Xdock user");
		oMSHelperFactory.logout();

		LOG.info("*** BUYER - LOGIN AND RECEIVE ORDER ***");

		LOG.info("Login as Buyer");
		oMSHelperFactory.getOMSLoginPage().loginToOMS(USER.BUYER, omsDataModelHelperFactory);
		oMSHelperFactory.closeAllChildWindowPopups();

		LOG.info("Receive Order");
		oMSHelperFactory.getoMSReceiveOrderPage().receiveOrder(poNumber);
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
		oMSHelperFactory.getoMSSubmitInvoicePage().submitInvoiceOrder(poNumber);
		orderStatus = oMSHelperFactory.getOrderStatus();
		LOG.info("Invoice - PO status: " + orderStatus);
		Assert.assertEquals(orderStatus, "Submitted", "OrderStatus is NOT In Submitted");

		LOG.info("Logout as Vendor");
		oMSHelperFactory.logout();

		LOG.info("===== " + Thread.currentThread().getStackTrace()[1].getMethodName() + " TEST CASE EXECUTION COMPLETED  =====");
	}
}

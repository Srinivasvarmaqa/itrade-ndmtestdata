package com.itt.oms.tests;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.itt.basetest.OMSBaseTest;
import com.itt.oms.datamodelhelper.OMSDataModelHelperFactory;
import com.itt.oms.pages.login.OMSLoginPage.USER;
import com.itt.parser.testdata.TestData;
import com.itt.parser.testdata.TestDataProviders;

public class CarrierLoginTest extends OMSBaseTest {

	private static final Logger LOG = LoggerFactory.getLogger(CarrierLoginTest.class);

	@BeforeMethod
	public void beforeMethodCarrierLoginTest() throws Exception {
		LOG.info("Before Method Carrier Login Test");
		LOG.info("APP URL is " + APP_URL);
		oMSHelperFactory.getOMSLoginPage().goToLoginPage(APP_URL);
	}

	@Test(dataProvider = "testDataProvider", dataProviderClass = TestDataProviders.class)
	@TestData(dataFilePath = "testdata_C56789_oms_carrier.json")
	public void testCarrierLogin(OMSDataModelHelperFactory omsDataModelHelperFactory) throws Exception {
		LOG.info("===== " + Thread.currentThread().getStackTrace()[1].getMethodName() + " TEST CASE EXECUTION STARTED  =====");
		oMSHelperFactory.getOMSLoginPage().loginToOMS(USER.CARRIER, omsDataModelHelperFactory);
		oMSHelperFactory.closeAllChildWindowPopups();
		oMSHelperFactory.logout();
		LOG.info("===== " + Thread.currentThread().getStackTrace()[1].getMethodName() + " TEST CASE EXECUTION COMPLETED  =====");
	}
}

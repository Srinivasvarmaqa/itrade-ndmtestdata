package com.itt.spend.tests;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.itt.basetest.ITTBaseTest;
import com.itt.parser.testdata.TestData;
import com.itt.parser.testdata.TestDataProviders;
import com.itt.spend.datamodelhelper.SPENDDataModelHelperFactory;
import com.itt.spend.pages.login.SPENDLoginPage.USER;

public class OperatorUserLoginTest extends ITTBaseTest {
	private static final Logger LOG =LoggerFactory.getLogger(OperatorUserLoginTest.class);
	@BeforeMethod
	public void beforeMethodOperatorUserLoginTest() throws Exception {
	LOG.info("Before Method Operator User Login Test");
	LOG.info("APP URL is" +APP_URL);
	sPENDHelperFactory.getSPENDLoginPage().goToLoginPage(APP_URL);

}
	@Test(dataProvider = "testDataProvider", dataProviderClass = TestDataProviders.class)
	@TestData(dataFilePath = "testdata_C56789_oms_carrier.json")
	public void testOperatorUserLogin(SPENDDataModelHelperFactory spendDataModelHelperFactory) throws Exception {
		LOG.info("===== " + Thread.currentThread().getStackTrace()[1].getMethodName() + " TEST CASE EXECUTION STARTED  =====");
		sPENDHelperFactory.getSPENDLoginPage().loginToSPEND(USER.OPERATOR, spendDataModelHelperFactory);
	}
	}

package mainClass;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.CommonProductAttributes;
import pages.DescriptiveAttributePage;
import pages.DescriptiveFeatureFunction;
import pages.DescriptiveOnlineContentComponentAttributesAllOCC;
import pages.FinancialandLegalPage;
import pages.Home_Page;
import pages.Login;
import pages.OfferingProducts;
import pages.OverView;
import pages.SalesAndMarketing;
import pages.Specifications_Page;
import utility.ExcelUtils;

public class Productmaster_IDD {
	WebDriver driver;

	//String path = "C://Users//PANDEYS4//Desktop//Product_Master_Merge//Product_Master_updated//src//testData//PM_TestData.xlsx";
	//String path=System.getProperty("user.dir")+"src//productmanager//testdata//PM_TestData.xlsx";
	String path="C://Users//BANASX//workspace//ZZZPIM_GIT//src//productmaster//testdata//PM_TestData.xlsx";
	@BeforeMethod
	public void InitiateBrowser() {
		// For firefox 

		driver = new FirefoxDriver();
		driver.manage().window().maximize();

		// for chrome web driver
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C://\eclipse\\chromedriver.exe"); driver = new ChromeDriver();
		 * driver.manage().window().maximize();
		 */
	}

	/**************************************************************************************************************************/

	/*
	 * @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ SHALU'S test
	 * cases@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	 */
	// Test Id:202448

	@Test(dataProvider = "202448")
	public void verifyUSCourtsof_AppealTaxCasesAssemblyId1079469(String URL, String UID, String password,
			String AssemblyId) throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			Specifications_Page specification = new Specifications_Page();
			CommonProductAttributes attribute = new CommonProductAttributes();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch(driver, AssemblyId));
			Thread.sleep(2000);
			Assert.assertTrue(specification.Click_commonProductAttributeLink(driver));
			Thread.sleep(2000);
			Assert.assertTrue(attribute.verifyProductType_VirtualSource(driver));
			Thread.sleep(2000);
			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "202448")
	public Object[][] getDataFromDataproviderverifyUSCourtsof_AppealTaxCasesAssemblyId1079469() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "202448");
		return (testObjArray);
	}

	/**************************************************************************************************************************/

	// Test Id:202449

	@Test(dataProvider = "202449")
	public void verifyUSCourtsof_AppealTaxCasesAssemblyId1079470(String URL, String UID, String password,
			String AssemblyId) throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			Specifications_Page specification = new Specifications_Page();
			CommonProductAttributes attribute = new CommonProductAttributes();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch(driver, AssemblyId));
			Thread.sleep(2000);
			Assert.assertTrue(specification.Click_commonProductAttributeLink(driver));
			Thread.sleep(2000);
			Assert.assertTrue(attribute.verifyProductType_ContentProperty(driver));
			Thread.sleep(2000);
			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "202449")
	public Object[][] getDataFromDataproviderverifyUSCourtsof_AppealTaxCasesAssemblyId1079470() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "202449");
		return (testObjArray);
	}

	/**************************************************************************************************************************/

	// Test Id:202450

	@Test(dataProvider = "202450")
	public void verify_10thCircuit_USCourtofAppealsCases_ComponentId1008915(String URL, String UID, String password,
			String AssemblyId) throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			Specifications_Page specification = new Specifications_Page();
			CommonProductAttributes attribute = new CommonProductAttributes();
			DescriptiveOnlineContentComponentAttributesAllOCC occ = new DescriptiveOnlineContentComponentAttributesAllOCC();
			Object obj = null;
			login.equals(obj);
			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch(driver, AssemblyId));
			Thread.sleep(2000);
			Assert.assertTrue(specification.Click_commonProductAttributeLink(driver));
			Thread.sleep(2000);
			Assert.assertTrue(attribute.verifyProductType_OnlineContent(driver));
			Thread.sleep(2000);
			Assert.assertTrue(specification.Click_DescriptiveOnlineContentComponentAttributesAllOCC(driver));
			Assert.assertTrue(occ.verifyContentType_UsCases(driver));
			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "202450")
	public Object[][] getDataFromDataproviderverify_10thCircuit_USCourtofAppealsCases_ComponentId1008915()
			throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "202450");
		return (testObjArray);
	}

	/**************************************************************************************************************************/

	// Test Id:202451

	@Test(dataProvider = "202451")
	public void verify_11thCircuit_USCourtofAppealsCases_ComponentId1008916(String URL, String UID, String password,
			String AssemblyId) throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			Specifications_Page specification = new Specifications_Page();
			CommonProductAttributes attribute = new CommonProductAttributes();
			DescriptiveOnlineContentComponentAttributesAllOCC occ = new DescriptiveOnlineContentComponentAttributesAllOCC();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch(driver, AssemblyId));
			Thread.sleep(2000);
			Assert.assertTrue(specification.Click_commonProductAttributeLink(driver));
			Thread.sleep(2000);
			Assert.assertTrue(attribute.verifyProductType_OnlineContent(driver));
			Thread.sleep(2000);
			Assert.assertTrue(specification.Click_DescriptiveOnlineContentComponentAttributesAllOCC(driver));
			Assert.assertTrue(occ.verifyContentType_UsCases(driver));
			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "202451")
	public Object[][] getDataFromDataproviderverify_11thCircuit_USCourtofAppealsCases_ComponentId1008916()
			throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "202451");
		return (testObjArray);
	}

	/**************************************************************************************************************************/

	// Test Id:202452

	@Test(dataProvider = "202452")
	public void verify_1stCircuit_USCourtofAppealsCases_ComponentId1008917(String URL, String UID, String password,
			String AssemblyId) throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			Specifications_Page specification = new Specifications_Page();
			CommonProductAttributes attribute = new CommonProductAttributes();
			DescriptiveOnlineContentComponentAttributesAllOCC occ = new DescriptiveOnlineContentComponentAttributesAllOCC();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch(driver, AssemblyId));
			Thread.sleep(2000);
			Assert.assertTrue(specification.Click_commonProductAttributeLink(driver));
			Thread.sleep(2000);
			Assert.assertTrue(attribute.verifyProductType_OnlineContent(driver));
			Thread.sleep(2000);
			Assert.assertTrue(specification.Click_DescriptiveOnlineContentComponentAttributesAllOCC(driver));
			Assert.assertTrue(occ.verifyContentType_UsCases(driver));
			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "202452")
	public Object[][] getDataFromDataproviderverify_1stCircuit_USCourtofAppealsCases_ComponentId1008917()
			throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "202452");
		return (testObjArray);
	}

	/**************************************************************************************************************************/

	// Test Id:202453

	@Test(dataProvider = "202453")
	public void verify_2ndCircuit_USCourtofAppealsCases_ComponentId1008918(String URL, String UID, String password,
			String AssemblyId) throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			Specifications_Page specification = new Specifications_Page();
			CommonProductAttributes attribute = new CommonProductAttributes();
			DescriptiveOnlineContentComponentAttributesAllOCC occ = new DescriptiveOnlineContentComponentAttributesAllOCC();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch(driver, AssemblyId));
			Thread.sleep(2000);
			Assert.assertTrue(specification.Click_commonProductAttributeLink(driver));
			Thread.sleep(2000);
			Assert.assertTrue(attribute.verifyProductType_OnlineContent(driver));
			Thread.sleep(2000);
			Assert.assertTrue(specification.Click_DescriptiveOnlineContentComponentAttributesAllOCC(driver));
			Assert.assertTrue(occ.verifyContentType_UsCases(driver));
			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "202453")
	public Object[][] getDataFromDataproviderverify_2ndCircuit_USCourtofAppealsCases_ComponentId1008918()
			throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "202453");
		return (testObjArray);
	}

	/**************************************************************************************************************************/

	// Test Id:202454

	@Test(dataProvider = "202454")
	public void verify_3rdCircuit_USCourtofAppealsCases_ComponentId1008919(String URL, String UID, String password,
			String AssemblyId) throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			Specifications_Page specification = new Specifications_Page();
			CommonProductAttributes attribute = new CommonProductAttributes();
			DescriptiveOnlineContentComponentAttributesAllOCC occ = new DescriptiveOnlineContentComponentAttributesAllOCC();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch(driver, AssemblyId));
			Thread.sleep(2000);
			Assert.assertTrue(specification.Click_commonProductAttributeLink(driver));
			Thread.sleep(2000);
			Assert.assertTrue(attribute.verifyProductType_OnlineContent(driver));
			Thread.sleep(2000);
			Assert.assertTrue(specification.Click_DescriptiveOnlineContentComponentAttributesAllOCC(driver));
			Assert.assertTrue(occ.verifyContentType_UsCases(driver));
			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "202454")
	public Object[][] getDataFromDataproviderverify_3rdCircuit_USCourtofAppealsCases_ComponentId1008919()
			throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "202454");
		return (testObjArray);
	}

	/**************************************************************************************************************************/
	// Test Id:202455

	@Test(dataProvider = "202455")
	public void verify_4thCircuit_USCourtofAppealsCases_ComponentId1008920(String URL, String UID, String password,
			String AssemblyId) throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			Specifications_Page specification = new Specifications_Page();
			CommonProductAttributes attribute = new CommonProductAttributes();
			DescriptiveOnlineContentComponentAttributesAllOCC occ = new DescriptiveOnlineContentComponentAttributesAllOCC();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch(driver, AssemblyId));
			Thread.sleep(2000);
			Assert.assertTrue(specification.Click_commonProductAttributeLink(driver));
			Thread.sleep(2000);
			Assert.assertTrue(attribute.verifyProductType_OnlineContent(driver));
			Thread.sleep(2000);
			Assert.assertTrue(specification.Click_DescriptiveOnlineContentComponentAttributesAllOCC(driver));
			Assert.assertTrue(occ.verifyContentType_UsCases(driver));
			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "202455")
	public Object[][] getDataFromDataproviderverify_4thCircuit_USCourtofAppealsCases_ComponentId1008920()
			throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "202455");
		return (testObjArray);
	}

	/**************************************************************************************************************************/

	// Test Id:202456

	@Test(dataProvider = "202456")
	public void verify_5thCircuit_USCourtofAppealsCases_ComponentId1008921(String URL, String UID, String password,
			String AssemblyId) throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			Specifications_Page specification = new Specifications_Page();
			CommonProductAttributes attribute = new CommonProductAttributes();
			DescriptiveOnlineContentComponentAttributesAllOCC occ = new DescriptiveOnlineContentComponentAttributesAllOCC();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch(driver, AssemblyId));
			Thread.sleep(2000);
			Assert.assertTrue(specification.Click_commonProductAttributeLink(driver));
			Thread.sleep(2000);
			Assert.assertTrue(attribute.verifyProductType_OnlineContent(driver));
			Thread.sleep(2000);
			Assert.assertTrue(specification.Click_DescriptiveOnlineContentComponentAttributesAllOCC(driver));
			Assert.assertTrue(occ.verifyContentType_UsCases(driver));
			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "202456")
	public Object[][] getDataFromDataproviderverify_5thCircuit_USCourtofAppealsCases_ComponentId1008921()
			throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "202456");
		return (testObjArray);
	}

	/**************************************************************************************************************************/
	// Test Id:202457

	@Test(dataProvider = "202457")
	public void verify_6thCircuit_USCourtofAppealsCases_ComponentId1008922(String URL, String UID, String password,
			String AssemblyId) throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			Specifications_Page specification = new Specifications_Page();
			CommonProductAttributes attribute = new CommonProductAttributes();
			DescriptiveOnlineContentComponentAttributesAllOCC occ = new DescriptiveOnlineContentComponentAttributesAllOCC();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch(driver, AssemblyId));
			Thread.sleep(2000);
			Assert.assertTrue(specification.Click_commonProductAttributeLink(driver));
			Thread.sleep(2000);
			Assert.assertTrue(attribute.verifyProductType_OnlineContent(driver));
			Thread.sleep(2000);
			Assert.assertTrue(specification.Click_DescriptiveOnlineContentComponentAttributesAllOCC(driver));
			Assert.assertTrue(occ.verifyContentType_UsCases(driver));
			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "202457")
	public Object[][] getDataFromDataproviderverify_6thCircuit_USCourtofAppealsCases_ComponentId1008922()
			throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "202457");
		return (testObjArray);
	}

	/**************************************************************************************************************************/

	// Test Id:202458

	@Test(dataProvider = "202458")
	public void verify_7thCircuit_USCourtofAppealsCases_ComponentId1008923(String URL, String UID, String password,
			String AssemblyId) throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			Specifications_Page specification = new Specifications_Page();
			CommonProductAttributes attribute = new CommonProductAttributes();
			DescriptiveOnlineContentComponentAttributesAllOCC occ = new DescriptiveOnlineContentComponentAttributesAllOCC();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch(driver, AssemblyId));
			Thread.sleep(2000);
			Assert.assertTrue(specification.Click_commonProductAttributeLink(driver));
			Thread.sleep(2000);
			Assert.assertTrue(attribute.verifyProductType_OnlineContent(driver));
			Thread.sleep(2000);
			Assert.assertTrue(specification.Click_DescriptiveOnlineContentComponentAttributesAllOCC(driver));
			Assert.assertTrue(occ.verifyContentType_UsCases(driver));
			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "202458")
	public Object[][] getDataFromDataproviderverify_7thCircuit_USCourtofAppealsCases_ComponentId1008923()
			throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "202458");
		return (testObjArray);
	}

	/**************************************************************************************************************************/

	// Test Id:202459

	@Test(dataProvider = "202459")
	public void verify_8thCircuit_USCourtofAppealsCases_ComponentId1008924(String URL, String UID, String password,
			String AssemblyId) throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			Specifications_Page specification = new Specifications_Page();
			CommonProductAttributes attribute = new CommonProductAttributes();
			DescriptiveOnlineContentComponentAttributesAllOCC occ = new DescriptiveOnlineContentComponentAttributesAllOCC();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch(driver, AssemblyId));
			Thread.sleep(2000);
			Assert.assertTrue(specification.Click_commonProductAttributeLink(driver));
			Thread.sleep(2000);
			Assert.assertTrue(attribute.verifyProductType_OnlineContent(driver));
			Thread.sleep(2000);
			Assert.assertTrue(specification.Click_DescriptiveOnlineContentComponentAttributesAllOCC(driver));
			Assert.assertTrue(occ.verifyContentType_UsCases(driver));
			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "202459")
	public Object[][] getDataFromDataproviderverify_8thCircuit_USCourtofAppealsCases_ComponentId1008924()
			throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "202459");
		return (testObjArray);
	}

	/**************************************************************************************************************************/
	// Test Id:202460

	@Test(dataProvider = "202460")
	public void verify_DistrictofColumbiaCircuit_USCourtofAppealsCases(String URL, String UID, String password,
			String AssemblyId) throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			Specifications_Page specification = new Specifications_Page();
			CommonProductAttributes attribute = new CommonProductAttributes();
			DescriptiveOnlineContentComponentAttributesAllOCC occ = new DescriptiveOnlineContentComponentAttributesAllOCC();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch(driver, AssemblyId));
			Thread.sleep(2000);
			Assert.assertTrue(specification.Click_commonProductAttributeLink(driver));
			Thread.sleep(2000);
			Assert.assertTrue(attribute.verifyProductType_OnlineContent(driver));
			Thread.sleep(2000);
			Assert.assertTrue(specification.Click_DescriptiveOnlineContentComponentAttributesAllOCC(driver));
			Assert.assertTrue(occ.verifyContentType_UsCases(driver));
			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "202460")
	public Object[][] getDataFromDataproviderverify_DistrictofColumbiaCircuit_USCourtofAppealsCases() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "202460");
		return (testObjArray);
	}

	/**************************************************************************************************************************/
	// Test Id:202461

	@Test(dataProvider = "202461")
	public void verify_9thCircuit_USCourtofAppealsCases_Component(String URL, String UID, String password,
			String AssemblyId) throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			Specifications_Page specification = new Specifications_Page();
			CommonProductAttributes attribute = new CommonProductAttributes();
			DescriptiveOnlineContentComponentAttributesAllOCC occ = new DescriptiveOnlineContentComponentAttributesAllOCC();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch(driver, AssemblyId));
			Thread.sleep(2000);
			Assert.assertTrue(specification.Click_commonProductAttributeLink(driver));
			Thread.sleep(2000);
			Assert.assertTrue(attribute.verifyProductType_OnlineContent(driver));
			Thread.sleep(2000);
			Assert.assertTrue(specification.Click_DescriptiveOnlineContentComponentAttributesAllOCC(driver));
			Assert.assertTrue(occ.verifyContentType_UsCases(driver));
			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "202461")
	public Object[][] getDataFromDataproviderverify_9thCircuit_USCourtofAppealsCases_Component() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "202461");
		return (testObjArray);
	}

	/**************************************************************************************************************************/
	// Test Id:202462

	@Test(dataProvider = "202462")
	public void verify_FederalCircuit_USCourtofAppealsCases(String URL, String UID, String password, String AssemblyId)
			throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			Specifications_Page specification = new Specifications_Page();
			CommonProductAttributes attribute = new CommonProductAttributes();
			DescriptiveOnlineContentComponentAttributesAllOCC occ = new DescriptiveOnlineContentComponentAttributesAllOCC();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch(driver, AssemblyId));
			Thread.sleep(2000);
			Assert.assertTrue(specification.Click_commonProductAttributeLink(driver));
			Thread.sleep(2000);
			Assert.assertTrue(attribute.verifyProductType_OnlineContent(driver));
			Thread.sleep(2000);
			Assert.assertTrue(specification.Click_DescriptiveOnlineContentComponentAttributesAllOCC(driver));
			Assert.assertTrue(occ.verifyContentType_UsCases(driver));
			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "202462")
	public Object[][] getDataFromDataproviderverify_FederalCircuit_USCourtofAppealsCases() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "202462");
		return (testObjArray);
	}

	/**************************************************************************************************************************/

	// Test Id:202463

	@Test(dataProvider = "202463")
	public void verify_USCourtofAppealsCases_ForArmedForcesComponent(String URL, String UID, String password,
			String AssemblyId) throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			Specifications_Page specification = new Specifications_Page();
			CommonProductAttributes attribute = new CommonProductAttributes();
			DescriptiveOnlineContentComponentAttributesAllOCC occ = new DescriptiveOnlineContentComponentAttributesAllOCC();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch(driver, AssemblyId));
			Thread.sleep(2000);
			Assert.assertTrue(specification.Click_commonProductAttributeLink(driver));
			Thread.sleep(2000);
			Assert.assertTrue(attribute.verifyProductType_OnlineContent(driver));
			Thread.sleep(2000);
			Assert.assertTrue(specification.Click_DescriptiveOnlineContentComponentAttributesAllOCC(driver));
			Assert.assertTrue(occ.verifyContentType_UsCases(driver));
			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "202463")
	public Object[][] getDataFromDataproviderverify_USCourtofAppealsCases_ForArmedForcesComponent() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "202463");
		return (testObjArray);
	}

	/**************************************************************************************************************************/
	// Test Id:202464

	@Test(dataProvider = "202464")
	public void verify_USCourtofAppealsCases_ForVeteransClaims(String URL, String UID, String password,
			String AssemblyId) throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			Specifications_Page specification = new Specifications_Page();
			CommonProductAttributes attribute = new CommonProductAttributes();
			DescriptiveOnlineContentComponentAttributesAllOCC occ = new DescriptiveOnlineContentComponentAttributesAllOCC();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch(driver, AssemblyId));
			Thread.sleep(2000);
			Assert.assertTrue(specification.Click_commonProductAttributeLink(driver));
			Thread.sleep(2000);
			Assert.assertTrue(attribute.verifyProductType_OnlineContent(driver));
			Thread.sleep(2000);
			Assert.assertTrue(specification.Click_DescriptiveOnlineContentComponentAttributesAllOCC(driver));
			Assert.assertTrue(occ.verifyContentType_UsCases(driver));
			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "202464")
	public Object[][] getDataFromDataproviderverify_USCourtofAppealsCases_ForVeteransClaims() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "202464");
		return (testObjArray);
	}

	/**************************************************************************************************************************/
	// Test Id:205661
	@Test(dataProvider = "205661")
	public void verify_BasicSearchComponent(String URL, String UID, String password, String componentId)
			throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			Specifications_Page specification = new Specifications_Page();
			DescriptiveFeatureFunction des = new DescriptiveFeatureFunction();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch(driver, componentId));
			Thread.sleep(2000);
			Assert.assertTrue(specification.descriptiveFeatureFunction_tab(driver));
			Thread.sleep(2000);
			Assert.assertTrue(des.verifyValueOfProductEmulationIndicator(driver));

			Thread.sleep(2000);
			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "205661")
	public Object[][] getDataFromDataproviderverify_BasicSearchComponent() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "205661");
		return (testObjArray);
	}

	/**************************************************************************************************************************/
	// Test Id:205662
	@Test(dataProvider = "205662")
	public void verify_HourlyCostRecoveryComponent(String URL, String UID, String password, String componentId)
			throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			Specifications_Page specification = new Specifications_Page();
			DescriptiveFeatureFunction des = new DescriptiveFeatureFunction();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch(driver, componentId));
			Thread.sleep(2000);
			Assert.assertTrue(specification.descriptiveFeatureFunction_tab(driver));
			Thread.sleep(2000);
			Assert.assertTrue(des.verifyValueOfProductEmulationIndicator(driver));

			Thread.sleep(2000);
			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "205662")
	public Object[][] getDataFromDataproviderverify_HourlyCostRecoveryComponent() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "205662");
		return (testObjArray);
	}

	/**************************************************************************************************************************/

	// Test Id:205663
	@Test(dataProvider = "205663")
	public void verify_StandardAnalyticsComponent(String URL, String UID, String password, String componentId)
			throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			Specifications_Page specification = new Specifications_Page();
			DescriptiveFeatureFunction des = new DescriptiveFeatureFunction();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch(driver, componentId));
			Thread.sleep(2000);
			Assert.assertTrue(specification.descriptiveFeatureFunction_tab(driver));
			Thread.sleep(2000);
			Assert.assertTrue(des.verifyValueOfProductEmulationIndicator(driver));

			Thread.sleep(2000);
			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "205663")
	public Object[][] getDataFromDataproviderverify_StandardAnalyticsComponent() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "205663");
		return (testObjArray);
	}

	/**************************************************************************************************************************/
	// Test Id:205664
	@Test(dataProvider = "205664")
	public void verify_AdvancedSearchComponent(String URL, String UID, String password, String componentId)
			throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			Specifications_Page specification = new Specifications_Page();
			DescriptiveFeatureFunction des = new DescriptiveFeatureFunction();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch(driver, componentId));
			Thread.sleep(2000);
			Assert.assertTrue(specification.descriptiveFeatureFunction_tab(driver));
			Thread.sleep(2000);
			Assert.assertTrue(des.verifyValueOfProductEmulationIndicator(driver));

			Thread.sleep(2000);
			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "205664")
	public Object[][] getDataFromDataproviderverify_AdvancedSearchComponent() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "205664");
		return (testObjArray);
	}

	/**************************************************************************************************************************/
	// Test Id:205665
	@Test(dataProvider = "205665")
	public void verify_DownloadsComponent(String URL, String UID, String password, String componentId)
			throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			Specifications_Page specification = new Specifications_Page();
			DescriptiveFeatureFunction des = new DescriptiveFeatureFunction();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch(driver, componentId));
			Thread.sleep(2000);
			Assert.assertTrue(specification.descriptiveFeatureFunction_tab(driver));
			Thread.sleep(2000);
			Assert.assertTrue(des.verifyValueOfProductEmulationIndicator(driver));

			Thread.sleep(2000);
			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "205665")
	public Object[][] getDataFromDataproviderverify_DownloadsComponent() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "205665");
		return (testObjArray);
	}

	/**************************************************************************************************************************/
	// Test Id:205666
	@Test(dataProvider = "205666")
	public void verify_Workfoldercreation(String URL, String UID, String password, String componentId)
			throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			Specifications_Page specification = new Specifications_Page();
			DescriptiveFeatureFunction des = new DescriptiveFeatureFunction();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch(driver, componentId));
			Thread.sleep(2000);
			Assert.assertTrue(specification.descriptiveFeatureFunction_tab(driver));
			Thread.sleep(2000);
			Assert.assertTrue(des.verifyValueOfProductEmulationIndicator(driver));

			Thread.sleep(2000);
			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "205666")
	public Object[][] getDataFromDataproviderverify_Workfoldercreation() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "205666");
		return (testObjArray);
	}

	/**************************************************************************************************************************/
	// Test Id:205667
	@Test(dataProvider = "205667")
	public void verify_WorkfolderexporComponent(String URL, String UID, String password, String componentId)
			throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			Specifications_Page specification = new Specifications_Page();
			DescriptiveFeatureFunction des = new DescriptiveFeatureFunction();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch(driver, componentId));
			Thread.sleep(2000);
			Assert.assertTrue(specification.descriptiveFeatureFunction_tab(driver));
			Thread.sleep(2000);
			Assert.assertTrue(des.verifyValueOfProductEmulationIndicator(driver));

			Thread.sleep(2000);
			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "205667")
	public Object[][] getDataFromDataproviderverify_WorkfolderexporComponent() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "205667");
		return (testObjArray);
	}

	/**************************************************************************************************************************/
	// Test Id:205668
	@Test(dataProvider = "205668")
	public void verify_PremiumAnalyticsComponent(String URL, String UID, String password, String componentId)
			throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			Specifications_Page specification = new Specifications_Page();
			DescriptiveFeatureFunction des = new DescriptiveFeatureFunction();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch(driver, componentId));
			Thread.sleep(2000);
			Assert.assertTrue(specification.descriptiveFeatureFunction_tab(driver));
			Thread.sleep(2000);
			Assert.assertTrue(des.verifyValueOfProductEmulationIndicator(driver));

			Thread.sleep(2000);
			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "205668")
	public Object[][] getDataFromDataproviderverify_PremiumAnalyticsComponent() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "205668");
		return (testObjArray);
	}

	/**************************************************************************************************************************/
	// Test Id:205669
	@Test(dataProvider = "205669")
	public void verify_BasicSearchAssembly(String URL, String UID, String password, String componentId)
			throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			Specifications_Page specification = new Specifications_Page();
			DescriptiveFeatureFunction des = new DescriptiveFeatureFunction();
			SalesAndMarketing sale = new SalesAndMarketing();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch(driver, componentId));
			Thread.sleep(2000);
			Assert.assertTrue(specification.descriptiveFeatureFunction_tab(driver));
			Thread.sleep(2000);
			Assert.assertTrue(des.verifyProductAdministartionValueForBasicSearchAssembly(driver));
			Thread.sleep(2000);
			Assert.assertTrue(specification.click_SalesAndMarketingLink(driver));
			Assert.assertTrue(sale.verify_SalesClassificationForAssembly(driver));

			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "205669")
	public Object[][] getDataFromDataproviderverify_BasicSearchAssembly() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "205669");
		return (testObjArray);
	}

	/**************************************************************************************************************************/
	// Test Id:205670
	@Test(dataProvider = "205670")
	public void verify_HourlyCostRecoveryAssembly(String URL, String UID, String password, String componentId)
			throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			Specifications_Page specification = new Specifications_Page();
			DescriptiveFeatureFunction des = new DescriptiveFeatureFunction();
			SalesAndMarketing sale = new SalesAndMarketing();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch(driver, componentId));
			Thread.sleep(2000);
			Assert.assertTrue(specification.descriptiveFeatureFunction_tab(driver));
			Thread.sleep(2000);
			Assert.assertTrue(des.verifyProductAdministartionValueForHourlyCostRecoveryAssembly(driver));
			Thread.sleep(2000);
			Assert.assertTrue(specification.click_SalesAndMarketingLink(driver));
			Assert.assertTrue(sale.verify_SalesClassificationForAssembly(driver));

			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "205670")
	public Object[][] getDataFromDataproviderverify_HourlyCostRecoveryAssembly() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "205670");
		return (testObjArray);
	}

	/**************************************************************************************************************************/
	// Test Id:205671
	@Test(dataProvider = "205671")
	public void verify_StandardAnalyticsAssembly(String URL, String UID, String password, String componentId)
			throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			Specifications_Page specification = new Specifications_Page();
			DescriptiveFeatureFunction des = new DescriptiveFeatureFunction();
			SalesAndMarketing sale = new SalesAndMarketing();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch(driver, componentId));
			Thread.sleep(2000);
			Assert.assertTrue(specification.descriptiveFeatureFunction_tab(driver));
			Thread.sleep(2000);
			Assert.assertTrue(des.verifyProductAdministartionValueForBasicSearchAssembly(driver));
			Thread.sleep(2000);
			Assert.assertTrue(specification.click_SalesAndMarketingLink(driver));
			Assert.assertTrue(sale.verify_SalesClassificationForAssembly(driver));

			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "205671")
	public Object[][] getDataFromDataproviderverify_StandardAnalyticsAssembly() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "205671");
		return (testObjArray);
	}

	/**************************************************************************************************************************/

	// Test Id:205672
	@Test(dataProvider = "205672")
	public void verify_AdvancedSearchAssembly(String URL, String UID, String password, String componentId)
			throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			Specifications_Page specification = new Specifications_Page();
			DescriptiveFeatureFunction des = new DescriptiveFeatureFunction();
			SalesAndMarketing sale = new SalesAndMarketing();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch(driver, componentId));
			Thread.sleep(2000);
			Assert.assertTrue(specification.descriptiveFeatureFunction_tab(driver));
			Thread.sleep(2000);
			Assert.assertTrue(des.verifyProductAdministartionValueForBasicSearchAssembly(driver));
			Thread.sleep(2000);
			Assert.assertTrue(specification.click_SalesAndMarketingLink(driver));
			Assert.assertTrue(sale.verify_SalesClassificationForAssembly(driver));

			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "205672")
	public Object[][] getDataFromDataproviderverify_AdvancedSearchAssembly() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "205672");
		return (testObjArray);
	}

	/**************************************************************************************************************************/

	// Test Id:205673
	@Test(dataProvider = "205673")
	public void verify_DownloadAssembly(String URL, String UID, String password, String componentId) throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			Specifications_Page specification = new Specifications_Page();
			DescriptiveFeatureFunction des = new DescriptiveFeatureFunction();
			SalesAndMarketing sale = new SalesAndMarketing();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch(driver, componentId));
			Thread.sleep(2000);
			Assert.assertTrue(specification.descriptiveFeatureFunction_tab(driver));
			Thread.sleep(2000);
			Assert.assertTrue(des.verifyProductAdministartionValueForBasicSearchAssembly(driver));
			Thread.sleep(2000);
			Assert.assertTrue(specification.click_SalesAndMarketingLink(driver));
			Assert.assertTrue(sale.verify_SalesClassificationForAssembly(driver));

			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "205673")
	public Object[][] getDataFromDataproviderverify_DownloadAssembly() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "205673");
		return (testObjArray);
	}

	/**************************************************************************************************************************/
	// Test Id:205674
	@Test(dataProvider = "205674")
	public void verify_WorkfolderCreationAssembly(String URL, String UID, String password, String componentId)
			throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			Specifications_Page specification = new Specifications_Page();
			DescriptiveFeatureFunction des = new DescriptiveFeatureFunction();
			SalesAndMarketing sale = new SalesAndMarketing();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch(driver, componentId));
			Thread.sleep(2000);
			Assert.assertTrue(specification.descriptiveFeatureFunction_tab(driver));
			Thread.sleep(2000);
			Assert.assertTrue(des.verifyProductAdministartionValueForBasicSearchAssembly(driver));
			Thread.sleep(2000);
			Assert.assertTrue(specification.click_SalesAndMarketingLink(driver));
			Assert.assertTrue(sale.verify_SalesClassificationForAssembly(driver));

			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "205674")
	public Object[][] getDataFromDataproviderverify_WorkfolderCreationAssembly() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "205674");
		return (testObjArray);
	}

	/**************************************************************************************************************************/
	// Test Id:205675
	@Test(dataProvider = "205675")
	public void verify_WorkFolderExportAssembly(String URL, String UID, String password, String componentId)
			throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			Specifications_Page specification = new Specifications_Page();
			DescriptiveFeatureFunction des = new DescriptiveFeatureFunction();
			SalesAndMarketing sale = new SalesAndMarketing();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch(driver, componentId));
			Thread.sleep(2000);
			Assert.assertTrue(specification.descriptiveFeatureFunction_tab(driver));
			Thread.sleep(2000);
			Assert.assertTrue(des.verifyProductAdministartionValueForBasicSearchAssembly(driver));
			Thread.sleep(2000);
			Assert.assertTrue(specification.click_SalesAndMarketingLink(driver));
			Assert.assertTrue(sale.verify_SalesClassificationForAssembly(driver));

			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "205675")
	public Object[][] getDataFromDataproviderverify_WorkFolderExportAssembly() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "205675");
		return (testObjArray);
	}

	/**************************************************************************************************************************/
	// Test Id:205676
	@Test(dataProvider = "205676")
	public void verify_PremiumAnalyticsAssembly(String URL, String UID, String password, String componentId)
			throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			Specifications_Page specification = new Specifications_Page();
			DescriptiveFeatureFunction des = new DescriptiveFeatureFunction();
			SalesAndMarketing sale = new SalesAndMarketing();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch(driver, componentId));
			Thread.sleep(2000);
			Assert.assertTrue(specification.descriptiveFeatureFunction_tab(driver));
			Thread.sleep(2000);
			Assert.assertTrue(des.verifyProductAdministartionValueForBasicSearchAssembly(driver));
			Thread.sleep(2000);
			Assert.assertTrue(specification.click_SalesAndMarketingLink(driver));
			Assert.assertTrue(sale.verify_SalesClassificationForAssembly(driver));

			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "205676")
	public Object[][] getDataFromDataproviderverify_PremiumAnalyticsAssembly() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "205676");
		return (testObjArray);
	}

	/**************************************************************************************************************************/
	// Test Id:205677
	@Test(dataProvider = "205677")
	public void verify_IPServicesAssembly(String URL, String UID, String password, String componentId)
			throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			Specifications_Page specification = new Specifications_Page();
			SalesAndMarketing sale = new SalesAndMarketing();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch(driver, componentId));
			Thread.sleep(2000);
			Assert.assertTrue(specification.click_SalesAndMarketingLink(driver));
			Assert.assertTrue(sale.verify_SalesClassificationForIPservicesAssembly(driver));

			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "205677")
	public Object[][] getDataFromDataproviderverify_IPServicesAssembly() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "205677");
		return (testObjArray);
	}

	/**************************************************************************************************************************/
	// Test Id:205678
	@Test(dataProvider = "205678")
	public void verify_IPServicesComponent(String URL, String UID, String password, String componentId)
			throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			Specifications_Page specification = new Specifications_Page();
			SalesAndMarketing sale = new SalesAndMarketing();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch(driver, componentId));
			Thread.sleep(2000);
			Assert.assertTrue(specification.click_SalesAndMarketingLink(driver));
			Assert.assertTrue(sale.verify_SalesClassificationForIPservicesComponent(driver));

			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "205678")
	public Object[][] getDataFromDataproviderverify_IPServicesComponent() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "205678");
		return (testObjArray);
	}

	/**************************************************************************************************************************/
	// Test Id:205679
	@Test(dataProvider = "205679")
	public void verify_TotalPatentAssembly(String URL, String UID, String password, String componentId)
			throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			Specifications_Page specification = new Specifications_Page();
			SalesAndMarketing sale = new SalesAndMarketing();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch(driver, componentId));
			Thread.sleep(2000);
			Assert.assertTrue(specification.click_SalesAndMarketingLink(driver));
			Assert.assertTrue(sale.verify_TotalPatentAssembly(driver));

			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "205679")
	public Object[][] getDataFromDataproviderverify_TotalPatentAssembly() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "205679");
		return (testObjArray);
	}

	/**************************************************************************************************************************/
	// Test Id:205680
	@Test(dataProvider = "205680")
	public void verify_TotalPatentComponent(String URL, String UID, String password, String componentId)
			throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			Specifications_Page specification = new Specifications_Page();
			SalesAndMarketing sale = new SalesAndMarketing();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch(driver, componentId));
			Thread.sleep(2000);
			Assert.assertTrue(specification.click_SalesAndMarketingLink(driver));
			Assert.assertTrue(sale.verify_SalesClassificationForTotalPatentComponent(driver));

			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "205680")
	public Object[][] getDataFromDataproviderverify_TotalPatentComponent() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "205680");
		return (testObjArray);
	}

	/**************************************************************************************************************************/
	/*
	 * @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ Kalpana's test
	 * cases @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	 */

	@Test(dataProvider = "202428")
	public void verifyTaxLogoComponent(String URL, String UID, String password, String componentId) throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			Specifications_Page specification = new Specifications_Page();
			DescriptiveFeatureFunction des = new DescriptiveFeatureFunction();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch(driver, componentId));
			Thread.sleep(2000);
			Assert.assertTrue(specification.descriptiveFeatureFunction(driver));
			Thread.sleep(2000);
			Assert.assertTrue(des.verifyValueOfProductEmulationIndicator(driver));

			Thread.sleep(2000);
			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "202428")
	public Object[][] getDataFromDataproviderverifyTaxLogoComponent() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "202428");
		return (testObjArray);
	}

	/**************************************************************************************************************************/
	/**************************************************************************************************************************/

	@Test(dataProvider = "202429")
	public void verifyGeneralCounselLogo(String URL, String UID, String password, String componentId) throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			Specifications_Page specification = new Specifications_Page();
			DescriptiveFeatureFunction des = new DescriptiveFeatureFunction();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch(driver, componentId));
			Thread.sleep(2000);
			Assert.assertTrue(specification.descriptiveFeatureFunction(driver));
			Thread.sleep(2000);
			Assert.assertTrue(des.verifyValueOfProductEmulationIndicator(driver));

			Thread.sleep(2000);
			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "202429")
	public Object[][] getDataFromDataproviderverifyGeneralCounselLogo() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "202429");
		return (testObjArray);
	}

	/**************************************************************************************************************************/

	@Test(dataProvider = "202430")
	public void verifyPGAUTaxLogo(String URL, String UID, String password, String componentId) throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			Specifications_Page specification = new Specifications_Page();
			DescriptiveFeatureFunction des = new DescriptiveFeatureFunction();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch(driver, componentId));
			Thread.sleep(4000);
			Assert.assertTrue(specification.descriptiveFeatureFunctionAssembly_tab(driver));
			Thread.sleep(2000);
			Assert.assertTrue(des.verifyProductAdministartionValueNull(driver));

			Thread.sleep(2000);
			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "202430")
	public Object[][] getDataFromDataproviderverifyPGAUTaxLogo() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "202430");
		return (testObjArray);
	}

	/**************************************************************************************************************************/
	@Test(dataProvider = "202431")
	public void verifyPGAUGeneralCounselLogo(String URL, String UID, String password, String componentId)
			throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			Specifications_Page specification = new Specifications_Page();
			DescriptiveFeatureFunction des = new DescriptiveFeatureFunction();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch(driver, componentId));
			Thread.sleep(4000);
			Assert.assertTrue(specification.descriptiveFeatureFunctionAssembly_tab(driver));
			Thread.sleep(2000);
			Assert.assertTrue(des.verifyProductAdministartionValueNull(driver));

			Thread.sleep(2000);
			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "202431")
	public Object[][] getDataFromDataproviderverifyPGAUGeneralCounselLogo() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "202431");
		return (testObjArray);
	}

	/**************************************************************************************************************************/
	/**************************************************************************************************************************/
	@Test(dataProvider = "202432")
	public void verifyPGAUTaxModuleIdentifier(String URL, String UID, String password, String componentId)
			throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			OverView view = new OverView();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch(driver, componentId));
			Thread.sleep(4000);

			Assert.assertTrue(view.findPGAUTaxModuleIdentifierComponent(driver));
			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "202432")
	public Object[][] getDataFromDataproviderverifyPGAUTaxModuleIdentifier() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "202432");
		return (testObjArray);
	}

	/**************************************************************************************************************************/
	@Test(dataProvider = "202433")
	public void PGAUTaxModuleIdentifier(String URL, String UID, String password, String componentId) throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			OverView view = new OverView();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch(driver, componentId));
			Thread.sleep(4000);
			Assert.assertTrue(view.findPGAUTaxModuleIdentifierAssembly(driver));

			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "202433")
	public Object[][] getDataFromDataproviderPGAUTaxModuleIdentifier() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "202433");
		return (testObjArray);
	}

	/**************************************************************************************************************************/
	/**************************************************************************************************************************/
	@Test(dataProvider = "202434")
	public void verifyPgauGovernanceModuleIdentifier(String URL, String UID, String password, String componentId)
			throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			OverView view = new OverView();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch(driver, componentId));
			Thread.sleep(4000);
			Assert.assertTrue(view.findPGAUGovernanceModuleIdentifierComponent(driver));

			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "202434")
	public Object[][] getDataFromDataproviderverifyPgauGovernanceModuleIdentifier() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "202434");
		return (testObjArray);
	}

	/*******************************************************************************************************************************************/

	/**************************************************************************************************************************/
	@Test(dataProvider = "202435")
	public void pgauGovernanceModuleIdentifier(String URL, String UID, String password, String componentId)
			throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			OverView view = new OverView();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch(driver, componentId));
			Thread.sleep(4000);
			Assert.assertTrue(view.findPGAUGovernanceModuleIdentifierAssembly(driver));

			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "202435")
	public Object[][] getDataFromDataproviderpgauGovernanceModuleIdentifier() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "202435");
		return (testObjArray);
	}

	/**************************************************************************************************************************/
	/**************************************************************************************************************************/
	@Test(dataProvider = "202436")
	public void verifyPgauCriminalModuleIdentifier(String URL, String UID, String password, String componentId)
			throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			OverView view = new OverView();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch(driver, componentId));
			Thread.sleep(4000);
			Assert.assertTrue(view.pgauCriminalModuleIdentifierComponent(driver));

			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "202436")
	public Object[][] getDataFromDataproviderverifyPgauCriminalModuleIdentifierr() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "202436");
		return (testObjArray);
	}

	/**************************************************************************************************************************/
	@Test(dataProvider = "202437")
	public void PgauCriminalModuleIdentifier(String URL, String UID, String password, String componentId)
			throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			OverView view = new OverView();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch(driver, componentId));
			Thread.sleep(4000);
			Assert.assertTrue(view.pgauCriminalModuleIdentifierAssembly(driver));

			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "202437")
	public Object[][] getDataFromDataproviderPgauCriminalModuleIdentifier() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "202437");
		return (testObjArray);
	}

	/**************************************************************************************************************************/
	@Test(dataProvider = "202438")
	public void verifyPgauIntellectualPropertyModuleIdentifier(String URL, String UID, String password,
			String componentId) throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			OverView view = new OverView();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch(driver, componentId));
			Thread.sleep(4000);
			Assert.assertTrue(view.pgauIntellectualPropertyModuleIdentifieComponent(driver));

			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "202438")
	public Object[][] getDataFromDataproviderverifyPgauIntellectualPropertyModuleIdentifier() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "202438");
		return (testObjArray);
	}

	/**************************************************************************************************************************/
	@Test(dataProvider = "202439")
	public void PgauIntellectualPropertyModuleIdentifier(String URL, String UID, String password, String componentId)
			throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			OverView view = new OverView();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch(driver, componentId));
			Thread.sleep(4000);
			Assert.assertTrue(view.pgauIntellectualPropertyModuleIdentifieAssembly(driver));

			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "202439")
	public Object[][] getDataFromDataproviderPgauIntellectualPropertyModuleIdentifier() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "202439");
		return (testObjArray);
	}

	/**************************************************************************************************************************/
	/**************************************************************************************************************************/
	@Test(dataProvider = "202440")
	public void verifyPgnzdistrictCourtLitigationModuleIdentifier(String URL, String UID, String password,
			String componentId) throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			OverView view = new OverView();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch(driver, componentId));
			Thread.sleep(4000);
			Assert.assertTrue(view.pgnzdistrictCourtLitigationModuleIdentifierComponent(driver));

			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "202440")
	public Object[][] getDataFromDataproviderverifyPgnzdistrictCourtLitigationModuleIdentifier() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "202440");
		return (testObjArray);
	}

	/**************************************************************************************************************************/
	/**************************************************************************************************************************/
	@Test(dataProvider = "202441")
	public void PgnzdistrictCourtLitigationModuleIdentifier(String URL, String UID, String password, String componentId)
			throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			OverView view = new OverView();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch(driver, componentId));
			Thread.sleep(4000);
			Assert.assertTrue(view.pgnzdistrictCourtLitigationModuleIdentifierAssembly(driver));

			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "202441")
	public Object[][] getDataFromDataproviderPgnzdistrictCourtLitigationModuleIdentifier() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "202441");
		return (testObjArray);
	}

	/**************************************************************************************************************************/
	@Test(dataProvider = "202442")
	public void verifyPgnzGovernanceModuleIdentifier(String URL, String UID, String password, String componentId)
			throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			OverView view = new OverView();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch(driver, componentId));
			Thread.sleep(4000);
			Assert.assertTrue(view.PgnzGovernanceModuleIdentifierComponent(driver));

			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "202442")
	public Object[][] getDataFromDataproviderverifyPgnzGovernanceModuleIdentifier() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "202442");
		return (testObjArray);
	}

	/**************************************************************************************************************************/
	@Test(dataProvider = "202443")
	public void PgnzGovernanceModuleIdentifier(String URL, String UID, String password, String componentId)
			throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			OverView view = new OverView();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch(driver, componentId));
			Thread.sleep(4000);
			Assert.assertTrue(view.PgnzGovernanceModuleIdentifierassembly(driver));

			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "202443")
	public Object[][] getDataFromDataproviderPgnzGovernanceModuleIdentifier() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "202443");
		return (testObjArray);
	}

	/**************************************************************************************************************************/
	/**************************************************************************************************************************/
	@Test(dataProvider = "202444")
	public void verifypgnzInsuranceModuleIdentifierComponent(String URL, String UID, String password,
			String componentId) throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			OverView view = new OverView();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch(driver, componentId));
			Thread.sleep(4000);
			Assert.assertTrue(view.pgnzInsuranceModuleIdentifierComponent(driver));

			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "202444")
	public Object[][] getDataFromDataproviderverifypgnzInsuranceModuleIdentifierComponent() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "202444");
		return (testObjArray);
	}

	/**************************************************************************************************************************/
	@Test(dataProvider = "202445")
	public void verifypgnzInsuranceModuleIdentifierassembly(String URL, String UID, String password, String componentId)
			throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			OverView view = new OverView();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch(driver, componentId));
			Thread.sleep(4000);
			Assert.assertTrue(view.pgnzInsuranceModuleIdentifierassembly(driver));

			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "202445")
	public Object[][] getDataFromDataproviderverifypgnzInsuranceModuleIdentifierassembly() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "202445");
		return (testObjArray);
	}

	/**************************************************************************************************************************/
	@Test(dataProvider = "202446")
	public void verifypgauIntellectualPropertyModuleIdentifieComponent(String URL, String UID, String password,
			String componentId) throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			OverView view = new OverView();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch(driver, componentId));
			Thread.sleep(4000);
			Assert.assertTrue(view.pgnzIntellectualPropertyModuleIdentifierComponent(driver));

			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "202446")
	public Object[][] getDataFromDataproviderverifypgauIntellectualPropertyModuleIdentifieComponent() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "202446");
		return (testObjArray);
	}

	/**************************************************************************************************************************/
	/**************************************************************************************************************************/
	@Test(dataProvider = "202447")
	public void verifypgauIntellectualPropertyModuleIdentifierAssembly(String URL, String UID, String password,
			String componentId) throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			OverView view = new OverView();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch(driver, componentId));
			Thread.sleep(4000);
			Assert.assertTrue(view.pgnzIntellectualPropertyModuleIdentifierAssembly(driver));

			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "202447")
	public Object[][] getDataFromDataproviderverifypgauIntellectualPropertyModuleIdentifierassembly() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "202447");
		return (testObjArray);
	}

	/**************************************************************************************************************************/
	/**************************************************************************************************************************/
	@Test(dataProvider = "202054")
	public void verifyAcceptPatronAccessTermsandConditionswithFirstNameComponent(String URL, String UID,
			String password, String componentId) throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			OverView view = new OverView();
			Specifications_Page spec = new Specifications_Page();
			DescriptiveFeatureFunction dcomp = new DescriptiveFeatureFunction();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch(driver, componentId));
			Thread.sleep(4000);
			Assert.assertTrue(view.AcceptPatronAccessTermsandConditionswithFirstNameComponent(driver));
			Thread.sleep(4000);
			Assert.assertTrue(spec.descriptiveApplicationComponentAttributes_tab(driver));
			Thread.sleep(4000);
			Assert.assertTrue(dcomp.verifyValueOfProductEmulationIndicator(driver));
			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "202054")
	public Object[][] getDataFromDataproviderverifyAcceptPatronAccessTermsandConditionswithFirstNameComponent()
			throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "202054");
		return (testObjArray);
	}

	/**************************************************************************************************************************/
	@Test(dataProvider = "202055")
	public void verifyAcceptPatronAccessTermsandConditionswithFirstNameAssembly(String URL, String UID, String password,
			String componentId) throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			OverView view = new OverView();
			Specifications_Page spec = new Specifications_Page();
			DescriptiveFeatureFunction dcomp = new DescriptiveFeatureFunction();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch(driver, componentId));
			Thread.sleep(4000);
			Assert.assertTrue(view.AcceptPatronAccessTermsandConditionswithFirstNameAssembly(driver));
			Thread.sleep(4000);
			Assert.assertTrue(spec.dscriptiveApplicationAssemblyAttributes_tab(driver));
			Thread.sleep(4000);
			Assert.assertTrue(dcomp.verifyProductAdministartionValuePresent(driver));
			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "202055")
	public Object[][] getDataFromDataproviderverifyAcceptPatronAccessTermsandConditionswithFirstNameAssemby()
			throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "202055");
		return (testObjArray);
	}

	/**************************************************************************************************************************/

	/**************************************************************************************************************************/
	@Test(dataProvider = "205687")
	public void verifyMyLexisEditUserEmailAddressAssembly(String URL, String UID, String password, String componentId)
			throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			OverView view = new OverView();
			Specifications_Page spec = new Specifications_Page();
			DescriptiveFeatureFunction dcomp = new DescriptiveFeatureFunction();
			SalesAndMarketing sales = new SalesAndMarketing();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch(driver, componentId));
			Thread.sleep(4000);
			Assert.assertTrue(view.MyLexisEditUserEmailAddressAssembly(driver));
			Thread.sleep(4000);
			Assert.assertTrue(spec.descriptiveFeatureFunctionAssembly_tab(driver));
			Thread.sleep(4000);
			Assert.assertTrue(dcomp.verifyProductAdminValuePresent(driver));
			Thread.sleep(4000);
			Assert.assertTrue(spec.salesandMarketing_tab(driver));
			Thread.sleep(4000);
			Assert.assertTrue(sales.verifySalesClassificationSolutionLnUS(driver));
			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "205687")
	public Object[][] getDataFromDataproviderverifyMyLexisEditUserEmailAddressAssembly() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "205687");
		return (testObjArray);
	}

	/**************************************************************************************************************************/

	/**************************************************************************************************************************/

	@Test(dataProvider = "205686")
	public void verifyMyLexisEditUserEmailAddressComponent(String URL, String UID, String password, String componentId)
			throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			OverView view = new OverView();
			Specifications_Page spec = new Specifications_Page();
			DescriptiveFeatureFunction dcomp = new DescriptiveFeatureFunction();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch(driver, componentId));
			Thread.sleep(4000);
			Assert.assertTrue(view.MyLexisEditUserEmailAddressComponent(driver));
			Thread.sleep(4000);
			Assert.assertTrue(spec.descriptiveFeatureFunction(driver));
			Thread.sleep(4000);
			Assert.assertTrue(dcomp.verifyValueOfProductEmulationIndicatorNo(driver));
			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "205686")
	public Object[][] getDataFromDataproviderverifyMyLexisEditUserEmailAddressComponent() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "205686");
		return (testObjArray);
	}

	/**************************************************************************************************************************/
	@Test(dataProvider = "207649")
	public void verifyLexisAdvanceResearchNZComponent(String URL, String UID, String password, String componentId)
			throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			OverView view = new OverView();
			Specifications_Page spec = new Specifications_Page();
			DescriptiveFeatureFunction dcomp = new DescriptiveFeatureFunction();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch(driver, componentId));
			Thread.sleep(4000);
			Assert.assertTrue(view.LexisAdvanceResearchNZComponent(driver));
			Thread.sleep(4000);
			Assert.assertTrue(spec.descriptiveFeatureFunction(driver));
			Thread.sleep(4000);
			Assert.assertTrue(dcomp.verifyValueOfProductEmulationIndicator(driver));
			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "207649")
	public Object[][] getDataFromDataproviderverifyLexisAdvanceResearchNZComponent() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "207649");
		return (testObjArray);
	}

	/**************************************************************************************************************************/
	@Test(dataProvider = "207650")
	public void verifyLexisAdvanceResearchNZAssembly(String URL, String UID, String password, String componentId)
			throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			OverView view = new OverView();
			Specifications_Page spec = new Specifications_Page();
			DescriptiveFeatureFunction dcomp = new DescriptiveFeatureFunction();
			SalesAndMarketing sales = new SalesAndMarketing();
			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch(driver, componentId));
			Thread.sleep(4000);
			Assert.assertTrue(view.LexisAdvanceResearchNZAssembly(driver));
			Thread.sleep(4000);
			Assert.assertTrue(spec.descriptiveFeatureFunctionAssembly_tab(driver));
			Thread.sleep(4000);
			Assert.assertTrue(dcomp.verifyProductAdministartionValuePresent(driver));
			Thread.sleep(4000);
			Assert.assertTrue(spec.salesandMarketing_tab(driver));
			Thread.sleep(4000);
			Assert.assertTrue(sales.verifySalesClassification(driver));
			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "207650")
	public Object[][] getDataFromDataproviderverifyLexisAdvanceResearchNZAssembly() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "207650");
		return (testObjArray);
	}

	/**************************************************************************************************************************/
	// Lexis Advance Practical Guidance NZ
	@Test(dataProvider = "207651")
	public void verifyLexisAdvancePracticalGuidanceNZ(String URL, String UID, String password, String componentId)
			throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			OverView view = new OverView();
			Specifications_Page spec = new Specifications_Page();
			DescriptiveFeatureFunction dcomp = new DescriptiveFeatureFunction();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch(driver, componentId));
			Thread.sleep(4000);
			Assert.assertTrue(view.LexisAdvancePracticalGuidanceNZ(driver));
			Thread.sleep(4000);
			Assert.assertTrue(spec.descriptiveFeatureFunction(driver));
			Thread.sleep(4000);
			Assert.assertTrue(dcomp.verifyValueOfProductEmulationIndicator(driver));
			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "207651")
	public Object[][] getDataFromDataproviderverifyLexisAdvancePracticalGuidanceNZ() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "207651");
		return (testObjArray);
	}

	/**************************************************************************************************************************/
	// Lexis Advance Practical Guidance NZ
	@Test(dataProvider = "207652")
	public void verifyLexisAdvancePracticalGuidanceNZassembly(String URL, String UID, String password,
			String componentId) throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			OverView view = new OverView();
			Specifications_Page spec = new Specifications_Page();
			DescriptiveFeatureFunction dcomp = new DescriptiveFeatureFunction();
			SalesAndMarketing sales = new SalesAndMarketing();
			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch(driver, componentId));
			Thread.sleep(4000);
			Assert.assertTrue(view.LexisAdvancePracticalGuidanceNZAssembly(driver));
			Thread.sleep(4000);
			Assert.assertTrue(spec.descriptiveFeatureFunctionAssembly_tab(driver));
			Thread.sleep(4000);
			Assert.assertTrue(dcomp.verifyProductAdministartionValuePresent(driver));
			Thread.sleep(4000);
			Assert.assertTrue(spec.salesandMarketing_tab(driver));
			Thread.sleep(4000);
			Assert.assertTrue(sales.verifySalesClassification(driver));
			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "207652")
	public Object[][] getDataFromDataproviderverifyLexisAdvancePracticalGuidanceNZAssembly() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "207652");
		return (testObjArray);
	}

	/**************************************************************************************************************************/
	//
	@Test(dataProvider = "207869")
	public void verifyNonUseOptOutComponent(String URL, String UID, String password, String componentId)
			throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			OverView view = new OverView();
			Specifications_Page spec = new Specifications_Page();
			DescriptiveFeatureFunction dcomp = new DescriptiveFeatureFunction();
			SalesAndMarketing sales = new SalesAndMarketing();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch(driver, componentId));
			Thread.sleep(4000);
			Assert.assertTrue(view.nonUseOptOutComponent(driver));
			Thread.sleep(4000);
			Assert.assertTrue(spec.descriptiveFeatureFunction(driver));
			Thread.sleep(4000);
			Assert.assertTrue(dcomp.verifyValueOfProductEmulationIndicatorNo(driver));
			Thread.sleep(3000);
			Assert.assertTrue(spec.salesandMarketing_tab(driver));
			Assert.assertTrue(sales.verifyValueOfComponentProdClass(driver));
			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "207869")
	public Object[][] getDataFromDataproviderverifyNonUseOptOutComponent() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "207869");
		return (testObjArray);
	}

	/**************************************************************************************************************************/
	/**************************************************************************************************************************/
	// Lexis Advance Practical Guidance NZ
	@Test(dataProvider = "207870")
	public void verifyNonUseOptOutCAssembly(String URL, String UID, String password, String componentId)
			throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			OverView view = new OverView();
			Specifications_Page spec = new Specifications_Page();
			DescriptiveFeatureFunction dcomp = new DescriptiveFeatureFunction();
			SalesAndMarketing sales = new SalesAndMarketing();
			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch(driver, componentId));
			Thread.sleep(4000);
			Assert.assertTrue(view.nonUseOptOutassembly(driver));
			Thread.sleep(4000);
			Assert.assertTrue(spec.descriptiveFeatureFunctionAssembly_tab(driver));
			Thread.sleep(4000);
			Assert.assertTrue(dcomp.verifyProductAdminValuePresentUS(driver));
			Thread.sleep(4000);
			Assert.assertTrue(spec.salesandMarketing_tab(driver));
			Thread.sleep(4000);
			Assert.assertTrue(sales.verifySalesClassificationSolutionLnUS(driver));
			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "207870")
	public Object[][] getDataFromDataproviderverifyNonUseOptOutCAssembly() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "207870");
		return (testObjArray);
	}

	/**************************************************************************************************************************/
	// 207871 IADP Manage Customer Non-Use

	@Test(dataProvider = "207871")
	public void verifyIadpManageCustomerNonUseComponent(String URL, String UID, String password, String componentId)
			throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			OverView view = new OverView();
			Specifications_Page spec = new Specifications_Page();
			DescriptiveFeatureFunction dcomp = new DescriptiveFeatureFunction();
			SalesAndMarketing sales = new SalesAndMarketing();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch(driver, componentId));
			Thread.sleep(4000);
			Assert.assertTrue(view.iadpManageCustomerNonUseComponent(driver));
			Thread.sleep(4000);
			Assert.assertTrue(spec.descriptiveFeatureFunction(driver));
			Thread.sleep(4000);
			Assert.assertTrue(dcomp.verifyValueOfProductEmulationIndicatorNo(driver));
			Thread.sleep(3000);
			Assert.assertTrue(spec.salesandMarketing_tab(driver));
			Assert.assertTrue(sales.verifyValueOfComponentProdClass(driver));
			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "207871")
	public Object[][] getDataFromDataproviderverifyIadpManageCustomerNonUseComponent() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "207871");
		return (testObjArray);
	}

	/***********************************************************************************************************/

	// Iadp Manage Customer NonUse Assembly
	@Test(dataProvider = "207872")
	public void verifyIadpManageCustomerNonUseAssembly(String URL, String UID, String password, String componentId)
			throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			OverView view = new OverView();
			Specifications_Page spec = new Specifications_Page();
			DescriptiveFeatureFunction dcomp = new DescriptiveFeatureFunction();
			SalesAndMarketing sales = new SalesAndMarketing();
			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch(driver, componentId));
			Thread.sleep(4000);
			Assert.assertTrue(view.iadpManageCustomerNonUseAssembly(driver));
			Thread.sleep(4000);
			Assert.assertTrue(spec.descriptiveFeatureFunctionAssembly_tab(driver));
			Thread.sleep(4000);
			Assert.assertTrue(dcomp.verifyProductAdminValuUserLevel(driver));
			Thread.sleep(4000);
			Assert.assertTrue(spec.salesandMarketing_tab(driver));
			Thread.sleep(4000);
			Assert.assertTrue(sales.verifySalesClassificationSolutionLnUS(driver));
			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "207872")
	public Object[][] getDataFromDataproviderverifyIadpManageCustomerNonUseAssembly() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "207872");
		return (testObjArray);
	}

	/***********************************************************************************************************************/
	// Surname
	@Test(dataProvider = "207873")
	public void verifySurnameFieldAssembly(String URL, String UID, String password, String componentId)
			throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			OverView view = new OverView();
			Specifications_Page spec = new Specifications_Page();

			SalesAndMarketing sales = new SalesAndMarketing();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch(driver, componentId));
			Thread.sleep(4000);
			Assert.assertTrue(view.surnameAssembly(driver));
			Thread.sleep(4000);
			Assert.assertTrue(spec.salesandMarketing_tab(driver));
			Thread.sleep(4000);
			Assert.assertTrue(sales.verifySalesClassificationSolutionLnUS(driver));
			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "207873")
	public Object[][] getDataFromDataproviderverifySurnameFieldAssembly() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "207873");
		return (testObjArray);
	}

	/***********************************************************************************************************************/
	@Test(dataProvider = "207874")
	public void verifySurnameLevel1Searchcomponent(String URL, String UID, String password, String componentId)
			throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			OverView view = new OverView();
			Specifications_Page spec = new Specifications_Page();
			DescriptiveFeatureFunction dcomp = new DescriptiveFeatureFunction();
			SalesAndMarketing sales = new SalesAndMarketing();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch(driver, componentId));
			Thread.sleep(4000);
			Assert.assertTrue(view.surnameLevel1Searchcomponent(driver));
			Thread.sleep(4000);

			Assert.assertTrue(spec.salesandMarketing_tab(driver));
			Assert.assertTrue(sales.verifyValueOfComponentProdClass(driver));
			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "207874")
	public Object[][] getDataFromDataproviderverifySurnameLevel1Searchcomponent() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "207874");
		return (testObjArray);
	}

	/****************************************************************************************************************/
	/***********************************************************************************************************************/
	@Test(dataProvider = "207875")
	public void verifySurnameLevel2Searchcomponent(String URL, String UID, String password, String componentId)
			throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			OverView view = new OverView();
			Specifications_Page spec = new Specifications_Page();
			DescriptiveFeatureFunction dcomp = new DescriptiveFeatureFunction();
			SalesAndMarketing sales = new SalesAndMarketing();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch(driver, componentId));
			Thread.sleep(4000);
			Assert.assertTrue(view.surnameLevel2Searchcomponent(driver));
			Thread.sleep(4000);

			Assert.assertTrue(spec.salesandMarketing_tab(driver));
			Assert.assertTrue(sales.verifyValueOfComponentProdClass(driver));
			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "207875")
	public Object[][] getDataFromDataproviderverifySurnameLevel2Searchcomponent() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "207875");
		return (testObjArray);
	}

	/****************************************************************************************************************/
	@Test(dataProvider = "207876")
	public void verifySurnameLevel1Reportcomponent(String URL, String UID, String password, String componentId)
			throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			OverView view = new OverView();
			Specifications_Page spec = new Specifications_Page();
			DescriptiveFeatureFunction dcomp = new DescriptiveFeatureFunction();
			SalesAndMarketing sales = new SalesAndMarketing();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch(driver, componentId));
			Thread.sleep(4000);
			Assert.assertTrue(view.SurnameLevel1Reportcomponent(driver));
			Thread.sleep(4000);

			Assert.assertTrue(spec.salesandMarketing_tab(driver));
			Assert.assertTrue(sales.verifyValueOfComponentProdClass(driver));
			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "207876")
	public Object[][] getDataFromDataproviderverifySurnameLevel1Reportcomponent() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "207876");
		return (testObjArray);
	}

	/****************************************************************************************************************/
	@Test(dataProvider = "207877")
	public void verifySurnameLevel2Reportcomponent(String URL, String UID, String password, String componentId)
			throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			OverView view = new OverView();
			Specifications_Page spec = new Specifications_Page();
			// DescriptiveFeatureFunction dcomp=new
			// DescriptiveFeatureFunction();
			SalesAndMarketing sales = new SalesAndMarketing();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch(driver, componentId));
			Thread.sleep(4000);
			Assert.assertTrue(view.SurnameLevel2Reportcomponent(driver));
			Thread.sleep(4000);

			Assert.assertTrue(spec.salesandMarketing_tab(driver));
			Assert.assertTrue(sales.verifyValueOfComponentProdClass(driver));
			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "207877")
	public Object[][] getDataFromDataproviderverifySurnameLevel2Reportcomponent() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "207877");
		return (testObjArray);
	}

	/****************************************************************************************************************/
	// Surname Document View
	@Test(dataProvider = "207878")
	public void verifySurnameDocumentViewComponent(String URL, String UID, String password, String componentId)
			throws Exception {

		try {

			Login login = new Login();

			Home_Page home = new Home_Page();
			OverView view = new OverView();
			Specifications_Page spec = new Specifications_Page();

			SalesAndMarketing sales = new SalesAndMarketing();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch(driver, componentId));
			Thread.sleep(4000);
			Assert.assertTrue(view.surnameDocumentViewComponent(driver));
			Thread.sleep(4000);

			Assert.assertTrue(spec.salesandMarketing_tab(driver));
			Assert.assertTrue(sales.verifyValueOfComponentProdClass(driver));
			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "207878")
	public Object[][] getDataFromDataproviderverifySurnameDocumentViewComponent() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "207878");
		return (testObjArray);
	}
	/****************************************************************************************************************/

	/*
	 * @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ SONU'S test
	 * cases@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	 */
	/**************************************************************************************************************************/
	// sonu
	// test componentId: 191231
	@Test(dataProvider = "191231")
	public void verifyproductEmulationforebilliedFF(String URL, String UNAME, String password, String componentId) {

		Login login = new Login();
		Assert.assertTrue(login.PM_login(driver, URL, UNAME, password));
		Home_Page home = new Home_Page();
		Assert.assertTrue(home.productSearch(driver, componentId));

		OverView overview = new OverView();
		Assert.assertTrue(overview.descriptiveFeatureComponentLnkDrilldown(driver));
		DescriptiveAttributePage attribute = new DescriptiveAttributePage();
		Assert.assertTrue(attribute.verifyproductEmulationValueisYes(driver));
	}

	@DataProvider(name = "191231")
	public Object[][] getDataFromDataprovider191231() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "191231");
		return (testObjArray);
	}

	// ***********************************************************************************************************************************************
	// sonu
	// test componentId:202052
	@Test(dataProvider = "202052")
	public void verifyPrisonKisokComponent(String URL, String UNAME, String password, String componentId) {

		Login login = new Login();
		Assert.assertTrue(login.PM_login(driver, URL, UNAME, password));
		Home_Page home = new Home_Page();
		Assert.assertTrue(home.productSearch(driver, componentId));

		OverView overview = new OverView();
		Assert.assertTrue(overview.descriptiveApplicationComponentLnkDrilldown(driver));
		DescriptiveAttributePage attribute = new DescriptiveAttributePage();
		Assert.assertTrue(attribute.verifyproductEmulationValueisYes(driver));
	}

	@DataProvider(name = "202052")
	public Object[][] getDataFromDataprovider202052() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "202052");
		return (testObjArray);
	}

	// **************************************************************************************************************************************************************
	// sonu
	// test componentId: 193012
	@Test(dataProvider = "193012")
	public void verifydenyAccessPublicRecordFF(String URL, String UNAME, String password, String componentId) {

		Login login = new Login();
		Assert.assertTrue(login.PM_login(driver, URL, UNAME, password));
		Home_Page home = new Home_Page();
		Assert.assertTrue(home.productSearch(driver, componentId));

		OverView overview = new OverView();
		Assert.assertTrue(overview.descriptiveFeatureComponentLnkDrilldown(driver));
		DescriptiveAttributePage attribute = new DescriptiveAttributePage();
		Assert.assertTrue(attribute.verifyproductEmulationvalueisNo(driver));
	}

	@DataProvider(name = "193012")
	public Object[][] getDataFromDataprovider193012() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "193012");
		return (testObjArray);
	}

	// **************************************************************************************************************************************************************
	// sonu
	// test componentId:198012
	@Test(dataProvider = "198012")
	public void FeatureFunctionComponentShepardBriefCheck(String URL, String UNAME, String password,
			String componentId) {

		Login login = new Login();
		Assert.assertTrue(login.PM_login(driver, URL, UNAME, password));
		Home_Page home = new Home_Page();
		Assert.assertTrue(home.productSearch(driver, componentId));

		OverView overview = new OverView();
		Assert.assertTrue(overview.descriptiveFeatureComponentLnkDrilldown(driver));
		DescriptiveAttributePage attribute = new DescriptiveAttributePage();
		Assert.assertTrue(attribute.verifyproductEmulationValueisYes(driver));
	}

	@DataProvider(name = "198012")
	public Object[][] getDataFromDataprovider198012() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "198012");
		return (testObjArray);
	}

	// **********************************************************************************************************************************************************************
	// sonu
	// test componentId:198013
	@Test(dataProvider = "198013")
	public void FeatureFunctionAssemblyShepardBriefCheck(String URL, String UNAME, String password,
			String componentId) {

		Login login = new Login();
		Assert.assertTrue(login.PM_login(driver, URL, UNAME, password));
		Home_Page home = new Home_Page();
		Assert.assertTrue(home.productSearch(driver, componentId));

		OverView overview = new OverView();
		Assert.assertTrue(overview.descriptivefeaturefunctionAssemblyLnkDrilldown(driver));
		DescriptiveAttributePage attribute = new DescriptiveAttributePage();
		Assert.assertTrue(attribute.VerifyAppliesToAllValueisNo(driver));
		Assert.assertTrue(attribute.VerifyAuthorisedByvalueisLN(driver));
		Assert.assertTrue(attribute.VerifyProductApplytoisUserLevel(driver));
		Assert.assertTrue(attribute.VerifyProductDefaultAuthorizationIndicatorisNo(driver));
	}

	@DataProvider(name = "198013")
	public Object[][] getDataFromDataprovider198013() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "198013");
		return (testObjArray);
	}

	// ***********************************************************************************************************************************************************************
	// sonu
	// test componentId:202053
	@Test(dataProvider = "202053")
	public void verifyPrisonKioskAssembly(String URL, String UNAME, String password, String componentId) {

		Login login = new Login();
		Assert.assertTrue(login.PM_login(driver, URL, UNAME, password));
		Home_Page home = new Home_Page();
		Assert.assertTrue(home.productSearch(driver, componentId));

		OverView overview = new OverView();
		Assert.assertTrue(overview.descriptiveApplicationAssemblyLnkDrilldown(driver));
		DescriptiveAttributePage attribute = new DescriptiveAttributePage();
		Assert.assertTrue(attribute.VerifyAppliesToAllValueisNo(driver));
		Assert.assertTrue(attribute.VerifyAuthorisedByvalueisLNandCustomer(driver));
		Assert.assertTrue(attribute.VerifyProductApplytoisUserLevel(driver));
		Assert.assertTrue(attribute.VerifyProductDefaultAuthorizationIndicatorisNo(driver));
	}

	@DataProvider(name = "202053")
	public Object[][] getDataFromDataprovider202053() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "202053");
		return (testObjArray);
	}

	// **************************************************************************************************************************************************************
	// sonu
	// test componentId:193013
	@Test(dataProvider = "193013")
	public void verifyDenyAccessPublicRecordFFAssembly(String URL, String UNAME, String password, String componentId) {

		Login login = new Login();
		Assert.assertTrue(login.PM_login(driver, URL, UNAME, password));
		Home_Page home = new Home_Page();
		Assert.assertTrue(home.productSearch(driver, componentId));

		OverView overview = new OverView();
		Assert.assertTrue(overview.descriptivefeaturefunctionAssemblyLnkDrilldown(driver));
		DescriptiveAttributePage attribute = new DescriptiveAttributePage();
		Assert.assertTrue(attribute.VerifyAppliesToAllValueisYes(driver));
		Assert.assertTrue(attribute.VerifyAuthorisedByvalueisLN(driver));
		Assert.assertTrue(attribute.VerifyProductApplytoisCustomerLevel(driver));
		Assert.assertTrue(attribute.VerifyProductDefaultAuthorizationIndicatorisNo(driver));
	}

	@DataProvider(name = "193013")
	public Object[][] getDataFromDataprovider193013() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "193013");
		return (testObjArray);
	}

	// **************************************************************************************************************************************************************
	// sonu
	// test componentId:193036
	@Test(dataProvider = "193036")
	public void cr587VerifyNewFeatureFunctionComponent(String URL, String UNAME, String password, String componentId) {

		Login login = new Login();
		Assert.assertTrue(login.PM_login(driver, URL, UNAME, password));
		Home_Page home = new Home_Page();
		Assert.assertTrue(home.productSearch(driver, componentId));

	}

	@DataProvider(name = "193036")
	public Object[][] getDataFromDataprovider193036() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "193036");
		return (testObjArray);
	}

	// ************************************************************************************************************************************************************
	// sonu
	// test componentId:193024
	@Test(dataProvider = "193024")
	public void verifyLexisAdvanceFFComponent(String URL, String UNAME, String password, String componentId) {

		Login login = new Login();
		Assert.assertTrue(login.PM_login(driver, URL, UNAME, password));
		Home_Page home = new Home_Page();
		Assert.assertTrue(home.productSearch(driver, componentId));

		OverView overview = new OverView();
		Assert.assertTrue(overview.descriptiveFeatureComponentLnkDrilldown(driver));
		DescriptiveAttributePage attribute = new DescriptiveAttributePage();
		Assert.assertTrue(attribute.verifyproductEmulationvalueisNo(driver));

	}

	@DataProvider(name = "193024")
	public Object[][] getDataFromDataprovider193024() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "193024");
		return (testObjArray);
	}

	// ************************************************************************************************************************************************************************
	// sonu
	// test componentId:193037
	@Test(dataProvider = "193037")
	public void cr587VerifyNewFeatureFunctionAssembly(String URL, String UNAME, String password, String componentId) {

		Login login = new Login();
		Assert.assertTrue(login.PM_login(driver, URL, UNAME, password));
		Home_Page home = new Home_Page();
		Assert.assertTrue(home.productSearch(driver, componentId));

	}

	@DataProvider(name = "193037")
	public Object[][] getDataFromDataprovider193037() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "193037");
		return (testObjArray);
	}

	// **********************************************************************************************************************************************************************
	// sonu
	// test componentId:202060
	@Test(dataProvider = "202060")
	public void verifyLPAEnterpriseSearchComponent(String URL, String UNAME, String password, String componentId) {

		Login login = new Login();
		Assert.assertTrue(login.PM_login(driver, URL, UNAME, password));
		Home_Page home = new Home_Page();
		Assert.assertTrue(home.productSearch(driver, componentId));

		OverView overviewPage = new OverView();
		Assert.assertTrue(overviewPage.descriptiveFeatureComponentLnkDrilldown(driver));
		DescriptiveAttributePage attribute = new DescriptiveAttributePage();
		Assert.assertTrue(attribute.verifyproductEmulationValueisYes(driver));

	}

	@DataProvider(name = "202060")
	public Object[][] getDataFromDataprovider202060() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "202060");
		return (testObjArray);
	}

	// ****************************************************************************************************************************************************************
	// sonu
	// test componentId:191232
	@Test(dataProvider = "191232")
	public void verifyEBillBoardFeatureFunctionAssembly(String URL, String UNAME, String password, String componentId) {

		Login login = new Login();
		Assert.assertTrue(login.PM_login(driver, URL, UNAME, password));
		Home_Page home = new Home_Page();
		Assert.assertTrue(home.productSearch(driver, componentId));

		OverView overviewPage = new OverView();
		Assert.assertTrue(overviewPage.descriptivefeaturefunctionAssemblyLnkDrilldown(driver));
		DescriptiveAttributePage attribute = new DescriptiveAttributePage();
		Assert.assertTrue(attribute.VerifyAppliesToAllValueisYes(driver));
		Assert.assertTrue(attribute.VerifyAuthorisedByvalueisLN(driver));
		Assert.assertTrue(attribute.VerifyProductApplytoisCustomerLevel(driver));
		Assert.assertTrue(attribute.VerifyProductDefaultAuthorizationIndicatorisYes(driver));
	}

	@DataProvider(name = "191232")
	public Object[][] getDataFromDataprovider191232() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "191232");
		return (testObjArray);
	}

	// ***********************************************************************************************************************************************************************
	// sonu
	// test componentId:193025
	@Test(dataProvider = "193025")
	public void verifyLACustomInterfaceFFAssembly(String URL, String UNAME, String password, String componentId) {

		Login login = new Login();
		Assert.assertTrue(login.PM_login(driver, URL, UNAME, password));
		Home_Page home = new Home_Page();
		Assert.assertTrue(home.productSearch(driver, componentId));

		OverView overviewPage = new OverView();
		Assert.assertTrue(overviewPage.descriptivefeaturefunctionAssemblyLnkDrilldown(driver));
		DescriptiveAttributePage attribute = new DescriptiveAttributePage();
		Assert.assertTrue(attribute.VerifyAppliesToAllValueisNo(driver));
		Assert.assertTrue(attribute.VerifyAuthorisedByvalueisLNandCustomer(driver));
		Assert.assertTrue(attribute.VerifyProductApplytoisUserLevel(driver));
		Assert.assertTrue(attribute.VerifyProductDefaultAuthorizationIndicatorisNo(driver));
	}

	@DataProvider(name = "193025")
	public Object[][] getDataFromDataprovider193025() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "193025");
		return (testObjArray);
	}

	// **************************************************************************************************************************************************************************
	// sonu
	// test componentId:193026
	@Test(dataProvider = "193026")
	public void verifyManagePINGenerationFFComponent(String URL, String UNAME, String password, String componentId) {

		Login login = new Login();
		Assert.assertTrue(login.PM_login(driver, URL, UNAME, password));
		Home_Page home = new Home_Page();
		Assert.assertTrue(home.productSearch(driver, componentId));

		OverView overviewPage = new OverView();
		Assert.assertTrue(overviewPage.descriptiveFeatureComponentLnkDrilldown(driver));
		DescriptiveAttributePage attribute = new DescriptiveAttributePage();
		Assert.assertTrue(attribute.verifyproductEmulationvalueisNo(driver));
	}

	@DataProvider(name = "193026")
	public Object[][] getDataFromDataprovider193026() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "193026");
		return (testObjArray);
	}

	// *****************************************************************************************************************************************************************************
	// sonu
	// test componentId:193027
	@Test(dataProvider = "193027")
	public void verifyManagePINGenerationFFAssembly(String URL, String UNAME, String password, String componentId) {

		Login login = new Login();
		Assert.assertTrue(login.PM_login(driver, URL, UNAME, password));
		Home_Page home = new Home_Page();
		Assert.assertTrue(home.productSearch(driver, componentId));

		OverView overviewPage = new OverView();
		Assert.assertTrue(overviewPage.descriptivefeaturefunctionAssemblyLnkDrilldown(driver));
		DescriptiveAttributePage attribute = new DescriptiveAttributePage();
		Assert.assertTrue(attribute.VerifyAppliesToAllValueisNo(driver));
		Assert.assertTrue(attribute.VerifyAuthorisedByvalueisLN(driver));
		Assert.assertTrue(attribute.VerifyProductApplytoisUserLevel(driver));
		Assert.assertTrue(attribute.VerifyProductDefaultAuthorizationIndicatorisYes(driver));
	}

	@DataProvider(name = "193027")
	public Object[][] getDataFromDataprovider193027() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "193027");
		return (testObjArray);
	}

	// *********************************************************************************************************************************************************************
	// sonu
	// test componentId:198014
	@Test(dataProvider = "198014")
	public void verifyFFComponentShepardBriefLink(String URL, String UNAME, String password, String componentId) {

		Login login = new Login();
		Assert.assertTrue(login.PM_login(driver, URL, UNAME, password));
		Home_Page home = new Home_Page();
		Assert.assertTrue(home.productSearch(driver, componentId));

		OverView overviewPage = new OverView();
		Assert.assertTrue(overviewPage.descriptiveFeatureComponentLnkDrilldown(driver));
		DescriptiveAttributePage attribute = new DescriptiveAttributePage();
		Assert.assertTrue(attribute.verifyproductEmulationValueisYes(driver));
	}

	@DataProvider(name = "198014")
	public Object[][] getDataFromDataprovider198014() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "198014");
		return (testObjArray);
	}

	// ************************************************************************************************************************************************************
	// sonu
	// test componentId:198015
	@Test(dataProvider = "198015")
	public void verifyFFAssemblyShepardBriefLink(String URL, String UNAME, String password, String componentId) {

		Login login = new Login();
		Assert.assertTrue(login.PM_login(driver, URL, UNAME, password));
		Home_Page home = new Home_Page();
		Assert.assertTrue(home.productSearch(driver, componentId));

		OverView overviewPage = new OverView();
		Assert.assertTrue(overviewPage.descriptivefeaturefunctionAssemblyLnkDrilldown(driver));
		DescriptiveAttributePage attribute = new DescriptiveAttributePage();
		Assert.assertTrue(attribute.VerifyAppliesToAllValueisNo(driver));
		Assert.assertTrue(attribute.VerifyAuthorisedByvalueisLN(driver));
		Assert.assertTrue(attribute.VerifyProductApplytoisUserLevel(driver));
		Assert.assertTrue(attribute.VerifyProductDefaultAuthorizationIndicatorisNo(driver));
	}

	@DataProvider(name = "198015")
	public Object[][] getDataFromDataprovider198015() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "198015");
		return (testObjArray);
	}

	// ******************************************************************************************************************************************************************
	// sonu
	// test componentId:202061
	@Test(dataProvider = "202061")
	public void verifyLPAEnterpriseSearchAssembly(String URL, String UNAME, String password, String componentId) {

		Login login = new Login();
		Assert.assertTrue(login.PM_login(driver, URL, UNAME, password));
		Home_Page home = new Home_Page();
		Assert.assertTrue(home.productSearch(driver, componentId));

		OverView overviewPage = new OverView();
		Assert.assertTrue(overviewPage.descriptivefeaturefunctionAssemblyLnkDrilldown(driver));
		DescriptiveAttributePage attribute = new DescriptiveAttributePage();
		Assert.assertTrue(attribute.VerifyAppliesToAllValueisYes(driver));
		Assert.assertTrue(attribute.VerifyAuthorisedByvalueisLN(driver));
		Assert.assertTrue(attribute.VerifyProductApplytoisCustomerLevel(driver));
		Assert.assertTrue(attribute.VerifyProductDefaultAuthorizationIndicatorisNo(driver));
	}

	@DataProvider(name = "202061")
	public Object[][] getDataFromDataprovider202061() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "202061");
		return (testObjArray);
	}

	// **************************************************************************************************************************************
	// sonu
	// test componentId :202062
	@Test(dataProvider = "202062")
	public void verifyProgressBarVisualizationComponent(String URL, String UNAME, String password, String componentId) {

		Login login = new Login();
		Assert.assertTrue(login.PM_login(driver, URL, UNAME, password));
		Home_Page home = new Home_Page();
		Assert.assertTrue(home.productSearch(driver, componentId));

		OverView overviewPage = new OverView();
		Assert.assertTrue(overviewPage.descriptiveFeatureComponentLnkDrilldown(driver));
		DescriptiveAttributePage attribute = new DescriptiveAttributePage();
		Assert.assertTrue(attribute.verifyproductEmulationValueisYes(driver));
	}

	@DataProvider(name = "202062")
	public Object[][] getDataFromDataprovider202062() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "202062");
		return (testObjArray);
	}

	// *******************************************************************************************************************************************************
	// sonu
	// test componentId:202063
	@Test(dataProvider = "202063")
	public void verifyLegislativeOutlookGaugeComponent(String URL, String UNAME, String password, String componentId) {

		Login login = new Login();
		Assert.assertTrue(login.PM_login(driver, URL, UNAME, password));
		Home_Page home = new Home_Page();
		Assert.assertTrue(home.productSearch(driver, componentId));

		OverView overviewPage = new OverView();
		Assert.assertTrue(overviewPage.descriptiveFeatureComponentLnkDrilldown(driver));
		DescriptiveAttributePage attribute = new DescriptiveAttributePage();
		Assert.assertTrue(attribute.verifyproductEmulationValueisYes(driver));

	}

	@DataProvider(name = "202063")
	public Object[][] getDataFromDataprovider202063() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "202063");
		return (testObjArray);
	}

	// ****************************************************************************************************************************************************
	// sonu
	// test componentId:202067
	@Test(dataProvider = "202067")
	public void verifyCaseLawVisualizationFFComponent(String URL, String UNAME, String password, String componentId) {

		Login login = new Login();
		Assert.assertTrue(login.PM_login(driver, URL, UNAME, password));
		Home_Page home = new Home_Page();
		Assert.assertTrue(home.productSearch(driver, componentId));

		OverView overviewPage = new OverView();
		Assert.assertTrue(overviewPage.descriptiveFeatureComponentLnkDrilldown(driver));
		DescriptiveAttributePage attribute = new DescriptiveAttributePage();
		Assert.assertTrue(attribute.verifyproductEmulationValueisYes(driver));
	}

	@DataProvider(name = "202067")
	public Object[][] getDataFromDataprovider202067() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "202067");
		return (testObjArray);
	}

	// ***************************************************************************************************************************************************
	// sonu
	// test componentId:202064
	@Test(dataProvider = "202064")
	public void verifyProgressBarVisualizationAssembly(String URL, String UNAME, String password, String componentId) {

		Login login = new Login();
		Assert.assertTrue(login.PM_login(driver, URL, UNAME, password));
		Home_Page home = new Home_Page();
		Assert.assertTrue(home.productSearch(driver, componentId));

		OverView overviewPage = new OverView();
		Assert.assertTrue(overviewPage.descriptivefeaturefunctionAssemblyLnkDrilldown(driver));
		DescriptiveAttributePage attribute = new DescriptiveAttributePage();
		Assert.assertTrue(attribute.VerifyAppliesToAllValueisNo(driver));
		Assert.assertTrue(attribute.VerifyProductApplytoisCustomerLevel(driver));
		Assert.assertTrue(attribute.VerifyAuthorisedByvalueisLN(driver));
		Assert.assertTrue(attribute.VerifyProductDefaultAuthorizationIndicatorisNo(driver));
	}

	@DataProvider(name = "202064")
	public Object[][] getDataFromDataprovider202064() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "202064");
		return (testObjArray);
	}

	// *********************************************************************************************************************************
	// sonu
	// test componentId:202068
	@Test(dataProvider = "202068")
	public void verifyCaseLawVisualizationFFAssembly(String URL, String UNAME, String password, String componentId) {

		Login login = new Login();
		Assert.assertTrue(login.PM_login(driver, URL, UNAME, password));
		Home_Page home = new Home_Page();
		Assert.assertTrue(home.productSearch(driver, componentId));

		OverView overviewPage = new OverView();
		Assert.assertTrue(overviewPage.descriptivefeaturefunctionAssemblyLnkDrilldown(driver));
		DescriptiveAttributePage attribute = new DescriptiveAttributePage();
		Assert.assertTrue(attribute.VerifyAppliesToAllValueisYes(driver));
		Assert.assertTrue(attribute.VerifyProductApplytoisCustomerLevel(driver));
		Assert.assertTrue(attribute.VerifyAuthorisedByvalueisLN(driver));
		Assert.assertTrue(attribute.VerifyProductDefaultAuthorizationIndicatorisNo(driver));
	}

	@DataProvider(name = "202068")
	public Object[][] getDataFromDataprovider202068() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "202068");
		return (testObjArray);
	}

	// *********************************************************************************************************************************
	// sonu
	// test componentId:202065
	@Test(dataProvider = "202065")
	public void verifyLegislativeOutlookGaugeAssembly(String URL, String UNAME, String password, String componentId) {

		Login login = new Login();
		Assert.assertTrue(login.PM_login(driver, URL, UNAME, password));
		Home_Page home = new Home_Page();
		Assert.assertTrue(home.productSearch(driver, componentId));

		OverView overviewPage = new OverView();
		Assert.assertTrue(overviewPage.descriptivefeaturefunctionAssemblyLnkDrilldown(driver));
		DescriptiveAttributePage attribute = new DescriptiveAttributePage();
		Assert.assertTrue(attribute.VerifyAppliesToAllValueisNo(driver));
		Assert.assertTrue(attribute.VerifyProductApplytoisCustomerLevel(driver));
		Assert.assertTrue(attribute.VerifyAuthorisedByvalueisLN(driver));
		Assert.assertTrue(attribute.VerifyProductDefaultAuthorizationIndicatorisNo(driver));
	}

	@DataProvider(name = "202065")
	public Object[][] getDataFromDataprovider202065() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "202065");
		return (testObjArray);
	}

	// ************************************************************************************************************************************
	// sonu
	// test componentId:202069
	@Test(dataProvider = "202069")
	public void verifySystemAccesaAlertPricingFFAssembly(String URL, String UNAME, String password,
			String componentId) {

		Login login = new Login();
		Assert.assertTrue(login.PM_login(driver, URL, UNAME, password));
		Home_Page home = new Home_Page();
		Assert.assertTrue(home.productSearch(driver, componentId));

		OverView overviewPage = new OverView();
		Assert.assertTrue(overviewPage.descriptivefeaturefunctionAssemblyLnkDrilldown(driver));
		DescriptiveAttributePage attribute = new DescriptiveAttributePage();
		Assert.assertTrue(attribute.VerifyAppliesToAllValueisYes(driver));
		Assert.assertTrue(attribute.VerifyProductApplytoisCustomerLevel(driver));
		Assert.assertTrue(attribute.VerifyAuthorisedByvalueisLN(driver));
		Assert.assertTrue(attribute.VerifyProductDefaultAuthorizationIndicatorisYes(driver));

	}

	@DataProvider(name = "202069")
	public Object[][] getDataFromDataprovider202069() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "202069");
		return (testObjArray);
	}

	// ****************************************************************************************************************************************
	// sonu
	// test componentId :205682
	@Test(dataProvider = "205682")
	public void verifyTotalPatentMasterFeatureComponent(String URL, String UNAME, String password, String componentId) {

		Login login = new Login();
		Assert.assertTrue(login.PM_login(driver, URL, UNAME, password));
		Home_Page home = new Home_Page();
		Assert.assertTrue(home.productSearch(driver, componentId));

		OverView overviewPage = new OverView();
		Assert.assertTrue(overviewPage.descriptiveFeatureComponentLnkDrilldown(driver));
		DescriptiveAttributePage attribute = new DescriptiveAttributePage();
		Assert.assertTrue(attribute.verifyproductEmulationValueisYes(driver));
	}

	@DataProvider(name = "205682")
	public Object[][] getDataFromDataprovider205682() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "205682");
		return (testObjArray);
	}

	// ***************************************************************************************************************************************************
	// sonu
	// test componentId:205684
	@Test(dataProvider = "205684")
	public void verifyRTISApplicationComponent(String URL, String UNAME, String password, String componentId) {

		Login login = new Login();
		Assert.assertTrue(login.PM_login(driver, URL, UNAME, password));
		Home_Page home = new Home_Page();
		Assert.assertTrue(home.productSearch(driver, componentId));

		OverView overviewPage = new OverView();
		Assert.assertTrue(overviewPage.descriptiveApplicationComponentLnkDrilldown(driver));
		DescriptiveAttributePage attribute = new DescriptiveAttributePage();
		Assert.assertTrue(attribute.verifyproductEmulationvalueisNo(driver));
	}

	@DataProvider(name = "205684")
	public Object[][] getDataFromDataprovider205684() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "205684");
		return (testObjArray);
	}

	// *******************************************************************************************************************************************************
	// sonu
	// test componentId:205685
	@Test(dataProvider = "205685")
	public void verifyRTISApplicationAssembly(String URL, String UNAME, String password, String componentId) {

		Login login = new Login();
		Assert.assertTrue(login.PM_login(driver, URL, UNAME, password));
		Home_Page home = new Home_Page();
		Assert.assertTrue(home.productSearch(driver, componentId));

		OverView overviewPage = new OverView();
		Assert.assertTrue(overviewPage.descriptiveApplicationAssemblyLnkDrilldown(driver));
		DescriptiveAttributePage attribute = new DescriptiveAttributePage();
		Assert.assertTrue(attribute.verifyproductEmulationvalueisNo(driver));
		Assert.assertTrue(attribute.VerifyAuthorisedByvalueisLNandCustomer(driver));
		Assert.assertTrue(attribute.VerifyProductApplytoisUserLevel(driver));
		Assert.assertTrue(attribute.VerifyProductDefaultAuthorizationIndicatorisNo(driver));
		Assert.assertTrue(overviewPage.salesAndMarketingtLnkDrilldown(driver));
		SalesAndMarketing sales = new SalesAndMarketing();
		Assert.assertTrue(sales.verifyLegalOwnerisRTIS(driver));
		Assert.assertTrue(sales.verifyLNProductClassisLAGeneral(driver));
		Assert.assertTrue(sales.verifyProductPriceModelTypeisQuantity(driver));
		Assert.assertTrue(sales.verifysolutionLineisUSLMResearchSolutionLine(driver));
	}

	@DataProvider(name = "205685")
	public Object[][] getDataFromDataprovider205685() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "205685");
		return (testObjArray);
	}

	// ****************************************************************************************************************************
	// sonu
	// Test componentId: 205683
	@Test(dataProvider = "205683")
	public void verifyTotalPatentMasterFeatureassembly(String URL, String UNAME, String password, String componentId) {

		Login login = new Login();
		Assert.assertTrue(login.PM_login(driver, URL, UNAME, password));
		Home_Page home = new Home_Page();
		Assert.assertTrue(home.productSearch(driver, componentId));

		OverView overviewPage = new OverView();
		Assert.assertTrue(overviewPage.descriptivefeaturefunctionAssemblyLnkDrilldown(driver));
		DescriptiveAttributePage attribute = new DescriptiveAttributePage();
		Assert.assertTrue(attribute.verifyproductEmulationvalueisNo(driver));
		Assert.assertTrue(attribute.VerifyAuthorisedByvalueisLNandCustomer(driver));
		Assert.assertTrue(attribute.VerifyProductApplytoisUserLevel(driver));
		Assert.assertTrue(attribute.VerifyProductDefaultAuthorizationIndicatorisNo(driver));
		Assert.assertTrue(overviewPage.salesAndMarketingtLnkDrilldown(driver));
		SalesAndMarketing sales = new SalesAndMarketing();
		Assert.assertTrue(sales.verifyLegalOwnerisRTIS(driver));
		Assert.assertTrue(sales.verifyLNProductClassisTotalPatent(driver));
		Assert.assertTrue(sales.verifyProductPriceModelTypeisQuantity(driver));
		Assert.assertTrue(sales.verifysolutionLineisUSLMResearchSolutionLine(driver));
	}

	@DataProvider(name = "205683")
	public Object[][] getDataFromDataprovider205683() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "205683");
		return (testObjArray);
	}

	// *****************************************************************************************************************************************************
	// sonu
	// test componentId: 202066
	@Test(dataProvider = "202066")
	public void verifyLegislativeOutlookGaugeOffering(String URL, String UNAME, String password, String componentId) {

		Login login = new Login();
		Assert.assertTrue(login.PM_login(driver, URL, UNAME, password));
		Home_Page home = new Home_Page();
		Assert.assertTrue(home.productSearch(driver, componentId));

	}

	@DataProvider(name = "202066")
	public Object[][] getDataFromDataprovider202066() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "202066");
		return (testObjArray);
	}
	// **********************************************************************************************************************************************************

	// sonu
	// test componentId: 205681
	@Test(dataProvider = "205681")
	public void verifyRTISOffering(String URL, String UNAME, String password, String componentId) {

		Login login = new Login();
		Assert.assertTrue(login.PM_login(driver, URL, UNAME, password));
		Home_Page home = new Home_Page();
		Assert.assertTrue(home.productSearch(driver, componentId));

		OverView overview = new OverView();
		Assert.assertTrue(overview.salesAndMarketingtLnkDrilldown(driver));
		SalesAndMarketing sales = new SalesAndMarketing();
		Assert.assertTrue(sales.verifyLegalOwnerisRTIS(driver));
		Assert.assertTrue(sales.verifyLNProductClassisTotalPatent(driver));
		Assert.assertTrue(sales.verifysolutionLineisRTIS(driver));
		Assert.assertTrue(sales.verifyProductPriceModelTypeisQuantity(driver));
	}

	@DataProvider(name = "205681")
	public Object[][] getDataFromDataprovider205681() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "205681");
		return (testObjArray);
	}
	// **********************************************************************************************************************************************************

	// sonu
	// test componentId: 202070
	@Test(dataProvider = "202070")
	public void verifySystemAccessAlertPricingFFComponents(String URL, String UNAME, String password,
			String componentId) {

		Login login = new Login();
		Assert.assertTrue(login.PM_login(driver, URL, UNAME, password));
		Home_Page home = new Home_Page();
		Assert.assertTrue(home.productSearch(driver, componentId));

		OverView overview = new OverView();
		Assert.assertTrue(overview.descriptiveFeatureComponentLnkDrilldown(driver));
		DescriptiveAttributePage attribute = new DescriptiveAttributePage();
		Assert.assertTrue(attribute.verifyproductEmulationValueisYes(driver));
	}

	@DataProvider(name = "202070")
	public Object[][] getDataFromDataprovider202070() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "202070");
		return (testObjArray);
	}
	// **********************************************************************************************************************************************************

	// sonu
	// test componentId: 193028
	@Test(dataProvider = "193028")
	public void verifyPacificLegislationCitatorFFComponent(String URL, String UNAME, String password,
			String componentId) {

		Login login = new Login();
		Assert.assertTrue(login.PM_login(driver, URL, UNAME, password));
		Home_Page home = new Home_Page();
		Assert.assertTrue(home.productSearch(driver, componentId));

	}

	@DataProvider(name = "193028")
	public Object[][] getDataFromDataprovider193028() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "193028");
		return (testObjArray);
	}

	// **********************************************************************************************************************************************************
	// sonu
	// test componentId: 193029
	@Test(dataProvider = "193029")
	public void verifyPacificLegislationCitatorFFAssembly(String URL, String UNAME, String password,
			String componentId) {

		Login login = new Login();
		Assert.assertTrue(login.PM_login(driver, URL, UNAME, password));
		Home_Page home = new Home_Page();
		Assert.assertTrue(home.productSearch(driver, componentId));

	}

	@DataProvider(name = "193029")
	public Object[][] getDataFromDataprovider193029() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "193029");
		return (testObjArray);
	}

	// *************************************************************************************************************************************************
	// sonu
	// test componentId: 1930011
	@Test(dataProvider = "193011")
	public void verifyCADictionariesHLCTProducts(String URL, String UNAME, String password, String componentId) {

		Login login = new Login();
		Assert.assertTrue(login.PM_login(driver, URL, UNAME, password));
		Home_Page home = new Home_Page();
		Assert.assertTrue(home.productSearch(driver, componentId));

	}

	@DataProvider(name = "193011")
	public Object[][] getDataFromDataprovider193011() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "193011");
		return (testObjArray);
	}

	// ****************************************************************************************************************************************************
	// sonu
	// test componentId: 190970
	@Test(dataProvider = "190970")
	public void verifyFeatureFunctionComponent(String URL, String UNAME, String password, String componentId) {

		Login login = new Login();
		Assert.assertTrue(login.PM_login(driver, URL, UNAME, password));
		Home_Page home = new Home_Page();
		Assert.assertTrue(home.productSearch(driver, componentId));

	}

	@DataProvider(name = "190970")
	public Object[][] getDataFromDataprovider190970() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "190970");
		return (testObjArray);
	}
	// ****************************************************************************************************************************************************

	// sonu
	// test componentId: 190971
	@Test(dataProvider = "190971")
	public void verifyFeatureFunctionAssembly(String URL, String UNAME, String password, String componentId) {

		Login login = new Login();
		Assert.assertTrue(login.PM_login(driver, URL, UNAME, password));
		Home_Page home = new Home_Page();
		Assert.assertTrue(home.productSearch(driver, componentId));

		OverView overview = new OverView();
		Assert.assertTrue(overview.descriptivefeaturefunctionAssemblyLnkDrilldown(driver));
		DescriptiveAttributePage attribute = new DescriptiveAttributePage();
		Assert.assertTrue(attribute.verifysellingTypeisSubscriptionOnly(driver));
		Assert.assertTrue(attribute.verifyTrialableisYes(driver));
		Assert.assertTrue(attribute.verifyMyLexisAuthFamilyisHotlineCustomerService(driver));
		Assert.assertTrue(attribute.verifytrialDurationis59(driver));
		Assert.assertTrue(attribute.VerifyAppliesToAllValueisYes(driver));
		Assert.assertTrue(attribute.VerifyAuthorisedByvalueisLN(driver));
		Assert.assertTrue(attribute.VerifyProductDefaultAuthorizationIndicatorisNo(driver));
		Assert.assertTrue(attribute.VerifyProductApplytoisCustomerLevel(driver));
		Assert.assertTrue(overview.FinancialandLegalLnkDrilldown(driver));
		FinancialandLegalPage legal = new FinancialandLegalPage();
		Assert.assertTrue(legal.verifyInvoiceRollUpisYes(driver));
		Assert.assertTrue(overview.commonProductAttributesyLnkDrilldown(driver));
		CommonProductAttributes product = new CommonProductAttributes();
		Assert.assertTrue(product.verifyProductSubTypeisAdminOnlyFeature(driver));
		Assert.assertTrue(overview.salesAndMarketingtLnkDrilldown(driver));
		SalesAndMarketing sale = new SalesAndMarketing();
		Assert.assertTrue(sale.verifyBeneficialOwnerisUS(driver));
		Assert.assertTrue(sale.verifyLNProductClassisLAGeneral(driver));
		Assert.assertTrue(sale.verifyLegalOwnerisUnitedStates(driver));
		Assert.assertTrue(sale.verifyOrderableisNo(driver));

	}

	@DataProvider(name = "190971")
	public Object[][] getDataFromDataprovider190971() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "190971");
		return (testObjArray);
	}

	/**************************************************************************************************************************/

	/*
	 * @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ Shefali's test
	 * cases @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	 */

	// Shefali
	@Test(dataProvider = "124545")
	public void Verify_OfferingProducts(String URL, String UID, String password, String componentId,
			String componentId1, String componentId2) throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			OfferingProducts offer = new OfferingProducts();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch1(driver, componentId));
			Thread.sleep(2000);
			Assert.assertTrue(offer.offerProducts_presentOrNot(driver));
			Assert.assertTrue(home.navigate_back(driver, componentId1, componentId2));

			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "124545")
	public Object[][] getDataFromDataproviderVerify_OfferingProducts() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "124545");
		return (testObjArray);
	}

	/**************************************************************************************************************************/

	// Shefali
	@Test(dataProvider = "159763")
	public void Verify_CommonProductAttributes(String URL, String UID, String password, String componentId)
			throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			DescriptiveFeatureFunction des = new DescriptiveFeatureFunction();
			Specifications_Page spec = new Specifications_Page();
			CommonProductAttributes comprod = new CommonProductAttributes();
			// OfferingProducts offer = new OfferingProducts();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch1(driver, componentId));
			Thread.sleep(2000);
			Assert.assertTrue(home.clk_Link(driver, componentId));
			Assert.assertTrue(des.verifyBulkAPIServices(driver));
			Assert.assertTrue(spec.commonProductAtrributes_tab(driver));
			Assert.assertTrue(comprod.verifyProductAttribute(driver));

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "159763")
	public Object[][] getDataFromDataproviderVerify_CommonProductAttributes() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "159763");
		return (testObjArray);
	}

	/**************************************************************************************************************************/

	// Shefali
	@Test(dataProvider = "180948")
	public void Verify_CanOffering(String URL, String UID, String password, String componentId) throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			DescriptiveFeatureFunction des = new DescriptiveFeatureFunction();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch1(driver, componentId));
			Thread.sleep(2000);
			Assert.assertTrue(home.clk_Link(driver, componentId));
			Assert.assertTrue(des.verifyCanOffering(driver));
			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "180948")
	public Object[][] getDataFromDataproviderVerify_CanOffering() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "180948");
		return (testObjArray);
	}

	/**************************************************************************************************************************/

	// Shefali
	@Test(dataProvider = "165007")
	public void Verify_EmulateCustomer(String URL, String UID, String password, String componentId) throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			DescriptiveFeatureFunction des = new DescriptiveFeatureFunction();
			Specifications_Page spec = new Specifications_Page();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch1(driver, componentId));
			Thread.sleep(2000);
			Assert.assertTrue(home.clk_Link(driver, componentId));
			Assert.assertTrue(des.verifyEmulateCustomer(driver));
			Assert.assertTrue(spec.descriptiveFeatureFunction_tab(driver));
			Assert.assertTrue(des.verifyProductAdministartionValue1(driver));

			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "165007")
	public Object[][] getDataFromDataproviderVerify_EmulateCustome() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "165007");
		return (testObjArray);
	}

	/**************************************************************************************************************************/

	// Shefali
	@Test(dataProvider = "186672")
	public void Verify_ABTesting(String URL, String UID, String password, String componentId, String componentId1)
			throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			DescriptiveFeatureFunction des = new DescriptiveFeatureFunction();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch1(driver, componentId));
			Thread.sleep(2000);
			Assert.assertTrue(home.clk_Link(driver, componentId));
			Assert.assertTrue(des.verifyAB_Testing(driver));
			/*
			 * Assert.assertTrue(des.navigate_back_forABtesting(driver,
			 * componentId1)); Assert.assertTrue(home.clk_Link(driver,
			 * componentId1)); Assert.assertTrue(des.verifyAB_Testing(driver));
			 */
			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "186672")
	public Object[][] getDataFromDataproviderVerify_ABTesting() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "186672");
		return (testObjArray);
	}

	/**************************************************************************************************************************/
	// Shefali
	@Test(dataProvider = "186671")
	public void Verify_progressBar(String URL, String UID, String password, String componentId, String componentId1,
			String componentId2) throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			DescriptiveFeatureFunction des = new DescriptiveFeatureFunction();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch1(driver, componentId));
			Thread.sleep(2000);
			Assert.assertTrue(home.clk_Link(driver, componentId));
			Assert.assertTrue(des.verifyProgressBar(driver));

			Assert.assertTrue(des.navigate_back_forABtesting(driver, componentId1));
			Assert.assertTrue(home.clk_Link(driver, componentId1));
			Assert.assertTrue(des.verifyProgressBar(driver));

			/*
			 * Assert.assertTrue(des.navigate_back_forABtesting1(driver,
			 * componentId2)); Assert.assertTrue(home.clk_Link(driver,
			 * componentId2)); Assert.assertTrue(des.verifyProgressBar(driver));
			 */

			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "186671")
	public Object[][] getDataFromDataproviderVerify_progressBar() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "186671");
		return (testObjArray);
	}

	/**************************************************************************************************************************/
	// Shefali
	@Test(dataProvider = "186665")
	public void Verify_RestrictPreGLBA(String URL, String UID, String password, String componentId) throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			DescriptiveFeatureFunction des = new DescriptiveFeatureFunction();
			Specifications_Page spec = new Specifications_Page();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch1(driver, componentId));
			Thread.sleep(2000);
			Assert.assertTrue(home.clk_Link(driver, componentId));
			Assert.assertTrue(des.verify_RestrictpreGLBAData(driver));
			Assert.assertTrue(spec.descriptiveFeatureFunction_tab(driver));
			Assert.assertTrue(des.verifyProductAdministartionValue2(driver));
			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "186665")
	public Object[][] getDataFromDataproviderVerify_RestrictPreGLBA() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "186665");
		return (testObjArray);
	}

	/**************************************************************************************************************************/
	// Shefali
	@Test(dataProvider = "186666")
	public void Verify_RestrictPreGLBA1(String URL, String UID, String password, String componentId) throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			DescriptiveFeatureFunction des = new DescriptiveFeatureFunction();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch1(driver, componentId));
			Thread.sleep(2000);
			Assert.assertTrue(home.clk_Link(driver, componentId));
			Assert.assertTrue(des.verify_RestrictpreGLBAData(driver));

			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "186666")
	public Object[][] getDataFromDataproviderVerify_RestrictPreGLBA1() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "186666");
		return (testObjArray);
	}

	/**************************************************************************************************************************/

	// Shefali
	@Test(dataProvider = "189275")
	public void Verify_Florida_illinoisState(String URL, String UID, String password, String componentId,
			String componentId1) throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			DescriptiveFeatureFunction des = new DescriptiveFeatureFunction();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch1(driver, componentId));
			Thread.sleep(2000);
			Assert.assertTrue(home.clk_Link(driver, componentId));
			Assert.assertTrue(des.verify_FloridaState(driver));

			Assert.assertTrue(des.navigate_back1(driver, componentId1));
			Assert.assertTrue(home.clk_Link(driver, componentId1));
			Assert.assertTrue(des.verify_IllinoisState(driver));

			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "189275")
	public Object[][] getDataFromDataproviderVerify_Florida_illinoisState() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "189275");
		return (testObjArray);
	}

	/**************************************************************************************************************************/

	// Shefali
	@Test(dataProvider = "190960")
	public void Verify_managementAccountVisibility(String URL, String UID, String password, String componentId)
			throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			DescriptiveFeatureFunction des = new DescriptiveFeatureFunction();
			Specifications_Page spec = new Specifications_Page();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch1(driver, componentId));
			Thread.sleep(2000);
			Assert.assertTrue(home.clk_Link(driver, componentId));
			Assert.assertTrue(des.verify_ManageFinancialAccountVisibility(driver));
			Assert.assertTrue(spec.descriptiveFeatureFunction_tab(driver));
			Assert.assertTrue(des.verify_ProductEmulationIndicator(driver));

			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "190960")
	public Object[][] getDataFromDataproviderVerify_managementAccountVisibility() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "190960");
		return (testObjArray);
	}

	/**************************************************************************************************************************/
	// Shefali
	@Test(dataProvider = "190961")
	public void Verify_managementAccountVisibility1(String URL, String UID, String password, String componentId)
			throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			DescriptiveFeatureFunction des = new DescriptiveFeatureFunction();
			Specifications_Page spec = new Specifications_Page();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch1(driver, componentId));
			Thread.sleep(2000);
			Assert.assertTrue(home.clk_Link(driver, componentId));
			Assert.assertTrue(des.verify_ManageFinancialAccountVisibility(driver));
			Assert.assertTrue(spec.descriptiveFeatureFunction_tab(driver));
			Assert.assertTrue(des.verifyProductAdministartionValue3(driver));

			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "190961")
	public Object[][] getDataFromDataproviderVerify_managementAccountVisibility1() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "190961");
		return (testObjArray);
	}

	/**************************************************************************************************************************/

	// Shefali
	@Test(dataProvider = "190962")
	public void Verify_manageAllocationProfile(String URL, String UID, String password, String componentId)
			throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			DescriptiveFeatureFunction des = new DescriptiveFeatureFunction();
			Specifications_Page spec = new Specifications_Page();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch1(driver, componentId));
			Thread.sleep(2000);
			Assert.assertTrue(home.clk_Link(driver, componentId));
			Assert.assertTrue(des.verify_Manageallocationprofile(driver));
			Assert.assertTrue(spec.descriptiveFeatureFunction_tab(driver));
			Assert.assertTrue(des.verify_ProductEmulationIndicator(driver));

			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "190962")
	public Object[][] getDataFromDataproviderVerify_manageAllocationProfile() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "190962");
		return (testObjArray);
	}

	/**************************************************************************************************************************/
	// Shefali
	@Test(dataProvider = "190963")
	public void Verify_manageAllocationProfile_Features(String URL, String UID, String password, String componentId)
			throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			DescriptiveFeatureFunction des = new DescriptiveFeatureFunction();
			Specifications_Page spec = new Specifications_Page();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch1(driver, componentId));
			Thread.sleep(2000);
			Assert.assertTrue(home.clk_Link(driver, componentId));
			Assert.assertTrue(des.verify_Manageallocationprofile(driver));
			Assert.assertTrue(spec.descriptiveFeatureFunction_tab(driver));
			Assert.assertTrue(des.verifyProductAdministartionValue3(driver));

			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "190963")
	public Object[][] getDataFromDataproviderVerify_manageAllocationProfile_Features() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "190963");
		return (testObjArray);
	}

	/**************************************************************************************************************************/
	// Shefali
	@Test(dataProvider = "190964")
	public void Verify_SupressadhocAllocation(String URL, String UID, String password, String componentId)
			throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			DescriptiveFeatureFunction des = new DescriptiveFeatureFunction();
			Specifications_Page spec = new Specifications_Page();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch1(driver, componentId));
			Thread.sleep(2000);
			Assert.assertTrue(home.clk_Link(driver, componentId));
			Assert.assertTrue(des.verify_supressAllocationProfileTab(driver));
			Assert.assertTrue(spec.descriptiveFeatureFunction_tab(driver));
			Assert.assertTrue(des.verify_ProductEmulationIndicator(driver));

			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "190964")
	public Object[][] getDataFromDataproviderVerify_SupressadhocAllocation() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "190964");
		return (testObjArray);
	}

	/**************************************************************************************************************************/
	// Shefali
	@Test(dataProvider = "190965")
	public void Verify_SupressadhocAllocationFeatures(String URL, String UID, String password, String componentId)
			throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			DescriptiveFeatureFunction des = new DescriptiveFeatureFunction();
			Specifications_Page spec = new Specifications_Page();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch1(driver, componentId));
			Thread.sleep(2000);
			Assert.assertTrue(home.clk_Link(driver, componentId));
			Assert.assertTrue(des.verify_supressAllocationProfileTab(driver));
			Assert.assertTrue(spec.descriptiveFeatureFunction_tab(driver));
			Assert.assertTrue(des.verifyProductAdministartionValue4(driver));

			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "190965")
	public Object[][] getDataFromDataproviderVerify_SupressadhocAllocationFeatures() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "190965");
		return (testObjArray);
	}

	/**************************************************************************************************************************/
	// Shefali
	@Test(dataProvider = "190966")
	public void Verify_LexisnexisClientValidation(String URL, String UID, String password, String componentId)
			throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			DescriptiveFeatureFunction des = new DescriptiveFeatureFunction();
			Specifications_Page spec = new Specifications_Page();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch1(driver, componentId));
			Thread.sleep(2000);
			Assert.assertTrue(home.clk_Link(driver, componentId));
			Assert.assertTrue(des.verify_LexisNexisClientValidationTab(driver));
			Assert.assertTrue(spec.descriptiveFeatureFunction_tab(driver));
			Assert.assertTrue(des.verify_ProductEmulationIndicator(driver));

			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "190966")
	public Object[][] getDataFromDataprovideLexisnexisClientValidation() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "190966");
		return (testObjArray);
	}

	/**************************************************************************************************************************/
	// Shefali
	@Test(dataProvider = "190967")
	public void Verify_LexisnexisClientValidationFeature(String URL, String UID, String password, String componentId)
			throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			DescriptiveFeatureFunction des = new DescriptiveFeatureFunction();
			Specifications_Page spec = new Specifications_Page();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch1(driver, componentId));
			Thread.sleep(2000);
			Assert.assertTrue(home.clk_Link(driver, componentId));
			Assert.assertTrue(des.verify_LexisNexisClientValidationTab(driver));
			Assert.assertTrue(spec.descriptiveFeatureFunction_tab(driver));
			Assert.assertTrue(des.verifyProductAdministartionValue5(driver));

			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "190967")
	public Object[][] getDataFromDataproviderLexisnexisClientValidationFeatures() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "190967");
		return (testObjArray);
	}

	/**************************************************************************************************************************/
	// Shefali
	@Test(dataProvider = "190968")
	public void Verify_MachineActivationNoPublicRecord(String URL, String UID, String password, String componentId)
			throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			DescriptiveFeatureFunction des = new DescriptiveFeatureFunction();
			Specifications_Page spec = new Specifications_Page();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch1(driver, componentId));
			Thread.sleep(2000);
			Assert.assertTrue(home.clk_Link(driver, componentId));
			Assert.assertTrue(des.verify_MachineActivation(driver));
			Assert.assertTrue(spec.descriptiveFeatureFunction_tab(driver));
			Assert.assertTrue(des.verify_ProductEmulationIndicator(driver));
			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "190968")
	public Object[][] getDataFromDataproviderMachineActivationNoPublicRecord() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "190968");
		return (testObjArray);
	}

	/**************************************************************************************************************************/
	// Shefali
	@Test(dataProvider = "190969")
	public void Verify_MachineActivationNoPublicRecordFeature(String URL, String UID, String password,
			String componentId) throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			DescriptiveFeatureFunction des = new DescriptiveFeatureFunction();
			Specifications_Page spec = new Specifications_Page();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch1(driver, componentId));
			Thread.sleep(2000);
			Assert.assertTrue(home.clk_Link(driver, componentId));
			Assert.assertTrue(des.verify_MachineActivation(driver));
			Assert.assertTrue(spec.descriptiveFeatureFunction_tab(driver));
			Assert.assertTrue(des.verifyProductAdministartionValue2(driver));

			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "190969")
	public Object[][] getDataFromDataproviderMachineActivationNoPublicRecordFeatures() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "190969");
		return (testObjArray);
	}

	/**************************************************************************************************************************/
	// Shefali
	@Test(dataProvider = "202056")
	public void Verify_AcceptPatronAccessTerms(String URL, String UID, String password, String componentId)
			throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			DescriptiveFeatureFunction des = new DescriptiveFeatureFunction();
			Specifications_Page spec = new Specifications_Page();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch1(driver, componentId));
			Thread.sleep(2000);
			Assert.assertTrue(home.clk_Link(driver, componentId));
			Assert.assertTrue(des.verify_AcceptPatronAccessTerms(driver));
			Assert.assertTrue(spec.Click_DescriptiveApplicationComponentAttributes(driver));
			Assert.assertTrue(des.verifyValueOfProductEmulationIndicator(driver));

			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "202056")
	public Object[][] getDataFromDataproviderVerify_AcceptPatronAccessTerms() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "202056");
		return (testObjArray);
	}

	/**************************************************************************************************************************/
	// Shefali
	@Test(dataProvider = "202057")
	public void Verify_AcceptPatronAccessTermsFeatures(String URL, String UID, String password, String componentId)
			throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			DescriptiveFeatureFunction des = new DescriptiveFeatureFunction();
			Specifications_Page spec = new Specifications_Page();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch1(driver, componentId));
			Thread.sleep(2000);
			Assert.assertTrue(home.clk_Link(driver, componentId));
			Assert.assertTrue(des.verify_AcceptPatronAccessTerms(driver));
			Assert.assertTrue(spec.Click_DescriptiveApplicationAssemblyAttributes(driver));
			Assert.assertTrue(des.verifyProductAdministartionValue_AcceptpatronwithLastName(driver));

			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "202057")
	public Object[][] getDataFromDataproviderVerify_AcceptPatronAccessTermsFeatures() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "202057");
		return (testObjArray);
	}

	/**************************************************************************************************************************/
	// Shefali
	@Test(dataProvider = "202058")
	public void Verify_AcceptPatronAccessTerms_withInmatenumber(String URL, String UID, String password,
			String componentId) throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			DescriptiveFeatureFunction des = new DescriptiveFeatureFunction();
			Specifications_Page spec = new Specifications_Page();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch1(driver, componentId));
			Thread.sleep(2000);
			Assert.assertTrue(home.clk_Link(driver, componentId));
			Assert.assertTrue(des.verify_AcceptPatronAccessTerms_InmatNumber(driver));
			Assert.assertTrue(spec.Click_DescriptiveApplicationComponentAttributes(driver));
			Assert.assertTrue(des.verifyValueOfProductEmulationIndicator(driver));

			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "202058")
	public Object[][] getDataFromDataproviderVerify_AcceptPatronAccessTerms_withInmatenumber() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "202058");
		return (testObjArray);
	}

	/**************************************************************************************************************************/
	// Shefali
	@Test(dataProvider = "202059")
	public void Verify_AcceptPatronAccessTerms_withInmatenumberFeatures(String URL, String UID, String password,
			String componentId) throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			DescriptiveFeatureFunction des = new DescriptiveFeatureFunction();
			Specifications_Page spec = new Specifications_Page();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch1(driver, componentId));
			Thread.sleep(2000);
			Assert.assertTrue(home.clk_Link(driver, componentId));
			Assert.assertTrue(des.verify_AcceptPatronAccessTerms_InmatNumber(driver));
			Assert.assertTrue(spec.Click_DescriptiveApplicationAssemblyAttributes(driver));
			Assert.assertTrue(des.verifyProductAdministartionValue_AcceptpatronwithLastName(driver));

			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "202059")
	public Object[][] getDataFromDataproviderVerify_AcceptPatronAccessTerms_withInmatenumberFeatures()
			throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "202059");
		return (testObjArray);
	}

	/**************************************************************************************************************************/
	// Shefali
	@Test(dataProvider = "205688")
	public void Verify_EagleEyeForLMOFeatureFunction(String URL, String UID, String password, String componentId)
			throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			DescriptiveFeatureFunction des = new DescriptiveFeatureFunction();
			Specifications_Page spec = new Specifications_Page();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch1(driver, componentId));
			Thread.sleep(2000);
			Assert.assertTrue(home.clk_Link(driver, componentId));
			Assert.assertTrue(des.verify_EagleEyeForLMO(driver));
			Assert.assertTrue(spec.Click_DescriptiveFeatureFunctionAssemblyAttributes(driver));
			Assert.assertTrue(des.verifyProductAdministartionValue_AcceptpatronwithLastName(driver));
			Assert.assertTrue(spec.Click_SalesandMarketing(driver));
			Assert.assertTrue(des.verifySalesClassification(driver));

			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "205688")
	public Object[][] getDataFromDataproviderVerify_EagleEyeForLMOFeatureFunction() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "205688");
		return (testObjArray);
	}

	/**************************************************************************************************************************/
	// Shefali
	@Test(dataProvider = "205689")
	public void Verify_ILCLELibraryOnlineContentOffering(String URL, String UID, String password, String componentId)
			throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			DescriptiveFeatureFunction des = new DescriptiveFeatureFunction();
			Specifications_Page spec = new Specifications_Page();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch1(driver, componentId));
			Thread.sleep(2000);
			Assert.assertTrue(home.clk_Link(driver, componentId));
			Assert.assertTrue(des.verify_ILCLELibrary(driver));
			Assert.assertTrue(spec.Click_SalesandMarketing(driver));
			Assert.assertTrue(des.verifySalesClassification_Lexisadvance(driver));

			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "205689")
	public Object[][] getDataFromDataproviderVerify_ILCLELibraryOnlineContentOffering() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "205689");
		return (testObjArray);
	}

	/**************************************************************************************************************************/
	// Shefali
	@Test(dataProvider = "205690")
	public void Verify_LexisForMSoffice(String URL, String UID, String password, String componentId) throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			DescriptiveFeatureFunction des = new DescriptiveFeatureFunction();
			Specifications_Page spec = new Specifications_Page();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch1(driver, componentId));
			Thread.sleep(2000);
			Assert.assertTrue(home.clk_Link(driver, componentId));
			Assert.assertTrue(des.verify_lexisForMSOffice(driver));
			Assert.assertTrue(spec.Click_SalesandMarketing(driver));
			Assert.assertTrue(des.verifySalesClassification(driver));

			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "205690")
	public Object[][] getDataFromDataproviderVerify_LexisForMSoffice() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "205690");
		return (testObjArray);
	}

	/**************************************************************************************************************************/
	// Shefali
	@Test(dataProvider = "205691")
	public void Verify_LexisPracticeAdvisorFinancialRestructuringandBankruptcyoffering(String URL, String UID,
			String password, String componentId) throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			DescriptiveFeatureFunction des = new DescriptiveFeatureFunction();
			Specifications_Page spec = new Specifications_Page();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch1(driver, componentId));
			Thread.sleep(2000);
			Assert.assertTrue(home.clk_Link(driver, componentId));
			Assert.assertTrue(des.verify_lexisPracticeAdvisor(driver));
			Assert.assertTrue(spec.Click_SalesandMarketing(driver));
			Assert.assertTrue(des.verifySalesClassification_LexisPracticeAdvisor(driver));

			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "205691")
	public Object[][] getDataFromDataproviderVerify_LexisPracticeAdvisorFinancialRestructuringandBankruptcyoffering()
			throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "205691");
		return (testObjArray);
	}

	/**************************************************************************************************************************/
	// Shefali
	@Test(dataProvider = "205692")
	public void Verify_LexisSecuritiesMosaicMultiUserOffering(String URL, String UID, String password,
			String componentId) throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			DescriptiveFeatureFunction des = new DescriptiveFeatureFunction();
			Specifications_Page spec = new Specifications_Page();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch1(driver, componentId));
			Thread.sleep(2000);
			Assert.assertTrue(home.clk_Link(driver, componentId));
			Assert.assertTrue(des.verify_LexisSecuritiesMosaicMultiUser(driver));
			Assert.assertTrue(spec.Click_SalesandMarketing(driver));
			Assert.assertTrue(des.verifySalesClassification_LexisMosiac(driver));

			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "205692")
	public Object[][] getDataFromDataproviderVerify_LexisSecuritiesMosaicMultiUserOffering() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "205692");
		return (testObjArray);
	}

	/**************************************************************************************************************************/

	// Shefali
	@Test(dataProvider = "205693")
	public void Verify_BankingLawAnalytics(String URL, String UID, String password, String componentId)
			throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			DescriptiveFeatureFunction des = new DescriptiveFeatureFunction();
			Specifications_Page spec = new Specifications_Page();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch1(driver, componentId));
			Thread.sleep(2000);
			Assert.assertTrue(home.clk_Link(driver, componentId));
			Assert.assertTrue(des.verify_BankingLawAnalytical(driver));
			Assert.assertTrue(spec.Click_SalesandMarketing(driver));
			Assert.assertTrue(des.verifySalesClassification_Lexisadvance(driver));

			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "205693")
	public Object[][] getDataFromDataproviderVerify_BankingLawAnalytics() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "205693");
		return (testObjArray);
	}

	/**************************************************************************************************************************/
	// Shefali
	@Test(dataProvider = "205694")
	public void Verify_GovtContractsLibrary(String URL, String UID, String password, String componentId)
			throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			DescriptiveFeatureFunction des = new DescriptiveFeatureFunction();
			Specifications_Page spec = new Specifications_Page();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch1(driver, componentId));
			Thread.sleep(2000);
			Assert.assertTrue(home.clk_Link(driver, componentId));
			Assert.assertTrue(des.verify_GovtContractsLib(driver));
			Assert.assertTrue(spec.Click_SalesandMarketing(driver));
			Assert.assertTrue(des.verifySalesClassification_Lexisadvance(driver));

			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "205694")
	public Object[][] getDataFromDataproviderVerify_GovtContractsLibrary() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "205694");
		return (testObjArray);
	}

	/**************************************************************************************************************************/
	// Shefali
	@Test(dataProvider = "205695")
	public void Verify_VerdictSettlementAnalyser_withVerdicts(String URL, String UID, String password,
			String componentId) throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			DescriptiveFeatureFunction des = new DescriptiveFeatureFunction();
			Specifications_Page spec = new Specifications_Page();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch1(driver, componentId));
			Thread.sleep(2000);
			Assert.assertTrue(home.clk_Link(driver, componentId));
			Assert.assertTrue(des.verify_VerdictSettlementAnalyser(driver));
			Assert.assertTrue(spec.Click_SalesandMarketing(driver));
			Assert.assertTrue(des.verifySalesClassification_VSA_Verdicts(driver));

			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "205695")
	public Object[][] getDataFromDataproviderVerify_VerdictSettlementAnalyser_withVerdicts() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "205695");
		return (testObjArray);
	}

	/**************************************************************************************************************************/
	// Shefali
	@Test(dataProvider = "205696")
	public void Verify_IslandPublicRecordsPlusNationalperson(String URL, String UID, String password,
			String componentId) throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			DescriptiveFeatureFunction des = new DescriptiveFeatureFunction();
			Specifications_Page spec = new Specifications_Page();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch1(driver, componentId));
			Thread.sleep(2000);
			Assert.assertTrue(home.clk_Link(driver, componentId));
			Assert.assertTrue(des.verify_IslandPublicRecords(driver));
			Assert.assertTrue(spec.Click_SalesandMarketing(driver));
			Assert.assertTrue(des.verifySalesClassification_Lexisadvance(driver));

			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "205696")
	public Object[][] getDataFromDataproviderVerify_IslandPublicRecordsPlusNationalperson() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "205696");
		return (testObjArray);
	}

	/**************************************************************************************************************************/
	// Shefali
	@Test(dataProvider = "205697")
	public void Verify_NYoffering(String URL, String UID, String password, String componentId) throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			DescriptiveFeatureFunction des = new DescriptiveFeatureFunction();
			Specifications_Page spec = new Specifications_Page();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch1(driver, componentId));
			Thread.sleep(2000);
			Assert.assertTrue(home.clk_Link(driver, componentId));
			Assert.assertTrue(des.verify_NYPrimaryOffering(driver));
			Assert.assertTrue(spec.Click_SalesandMarketing(driver));
			Assert.assertTrue(des.verifySalesClassification_Lexisadvance(driver));

			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "205697")
	public Object[][] getDataFromDataproviderVerify_NYoffering() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "205697");
		return (testObjArray);
	}

	/**************************************************************************************************************************/
	// Shefali
	@Test(dataProvider = "205698")
	public void Verify_UnitedStatesCodeservice(String URL, String UID, String password, String componentId)
			throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			DescriptiveFeatureFunction des = new DescriptiveFeatureFunction();
			Specifications_Page spec = new Specifications_Page();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch1(driver, componentId));
			Thread.sleep(2000);
			Assert.assertTrue(home.clk_Link(driver, componentId));
			Assert.assertTrue(des.verify_USCS(driver));
			Assert.assertTrue(spec.Click_SalesandMarketing(driver));
			Assert.assertTrue(des.verifySalesClassification_Lexisadvance(driver));

			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "205698")
	public Object[][] getDataFromDataproviderVerify_UnitedStatesCodeservice() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "205698");
		return (testObjArray);
	}

	/**************************************************************************************************************************/
	// Shefali
	@Test(dataProvider = "190931")
	public void Verify_PacificLegislation(String URL, String UID, String password, String componentId,
			String componentId1, String componentId2, String c3, String c4, String c5, String c7, String c8)
			throws Exception {

		try {

			Login login = new Login();
			Home_Page home = new Home_Page();
			DescriptiveFeatureFunction des = new DescriptiveFeatureFunction();

			login.PM_login(driver, URL, UID, password);
			Assert.assertTrue(home.productSearch1(driver, componentId));
			Thread.sleep(2000);
			Assert.assertTrue(home.clk_Link(driver, componentId));
			Assert.assertTrue(des.verifyPacificLegislation(driver));
			Thread.sleep(2000);

			Assert.assertTrue(des.navigate_back_forABtesting(driver, componentId1));
			Assert.assertTrue(home.clk_Link(driver, componentId1));
			Assert.assertTrue(des.verifyPacificLegislation(driver));
			Thread.sleep(2000);

			Assert.assertTrue(des.navigate_back_forABtesting1(driver, componentId2));
			Assert.assertTrue(home.clk_Link(driver, componentId2));
			Assert.assertTrue(des.verifyPacificLegislation(driver));
			Thread.sleep(2000);

			Assert.assertTrue(des.navigate_back_forABtesting1(driver, c3));
			Assert.assertTrue(home.clk_Link(driver, c3));
			Assert.assertTrue(des.verifyPacificLegislation(driver));
			Thread.sleep(2000);

			Assert.assertTrue(des.navigate_back_forABtesting1(driver, c4));
			Assert.assertTrue(home.clk_Link(driver, c4));
			Assert.assertTrue(des.verifyPacificLegislation(driver));
			Thread.sleep(2000);

			Assert.assertTrue(des.navigate_back_forABtesting1(driver, c5));
			Assert.assertTrue(home.clk_Link(driver, c5));
			Assert.assertTrue(des.verifyPacificLegislation(driver));
			Thread.sleep(2000);

			/*
			 * Assert.assertTrue(des.navigate_back_forABtesting1(driver, c6));
			 * Assert.assertTrue(home.clk_Link(driver, c6));
			 * Assert.assertTrue(des.verifyPacificLegislation(driver));
			 * Thread.sleep(2000);
			 */

			Assert.assertTrue(des.navigate_back_forABtesting1(driver, c7));
			Assert.assertTrue(home.clk_Link(driver, c7));
			Assert.assertTrue(des.verifyPacificLegislation(driver));
			Thread.sleep(2000);

			Assert.assertTrue(des.navigate_back_forABtesting1(driver, c8));
			Assert.assertTrue(home.clk_Link(driver, c8));
			Assert.assertTrue(des.verifyPacificLegislation(driver));
			Thread.sleep(2000);

			/*
			 * Assert.assertTrue(des.navigate_back_forABtesting1(driver, c9));
			 * Assert.assertTrue(home.clk_Link(driver, c9));
			 * Assert.assertTrue(des.verifyPacificLegislation(driver));
			 * Thread.sleep(2000);
			 * 
			 * Assert.assertTrue(des.navigate_back_forABtesting1(driver, c10));
			 * Assert.assertTrue(home.clk_Link(driver, c10));
			 * Assert.assertTrue(des.verifyPacificLegislation(driver));
			 * Thread.sleep(2000);
			 */

			System.out.println("Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@DataProvider(name = "190931")
	public Object[][] getDataFromDataproviderVerify_PacificLegislation() throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(path, "190931");
		return (testObjArray);
	}

	/**************************************************************************************************************************/

	@AfterMethod
	public void cleanUp() {
		driver.manage().deleteAllCookies();
		driver.close();
	}
}

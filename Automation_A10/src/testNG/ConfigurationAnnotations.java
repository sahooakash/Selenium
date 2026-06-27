package testNG;

	import org.testng.Reporter;
	import org.testng.annotations.AfterSuite;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeSuite;
	import org.testng.annotations.BeforeTest;

	public class ConfigurationAnnotations {
		@BeforeSuite
		public void beforesuite() {
			Reporter.log("Before Suite Is Executed",true);
		}
		@AfterSuite
		public void aftersuite() {
			Reporter.log("Before Suite Is Executed",true);
		}
		@BeforeTest
		public void beforetest() {
			Reporter.log("Before Test Is Executed",true);
			
		}
		@AfterTest
		public void aftertest() {
			Reporter.log("After Test Is Executed",true);
		}

	}




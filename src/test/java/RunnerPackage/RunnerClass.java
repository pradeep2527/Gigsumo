package RunnerPackage;

import java.awt.AWTException;
import java.io.IOException;
import java.sql.SQLException;
import org.testng.annotations.Test;
import LibGlobalPackage.BaseClass;
import LibGlobalPackage.Configurations;
import LibGlobalPackage.SqlTableCollections;
import PojoPackage.CandidateCreationPojo;
import PojoPackage.JobCreationPojo;
import PojoPackage.ProfileCreationPojo;
import PojoPackage.UserCreationPojo;

public class RunnerClass extends BaseClass {

	// USER CREATION
	@Test(enabled =true, priority = 1)
	private void UserCreation() throws InterruptedException, SQLException, IOException {
		
		String usercountstart =toReadDataFromExcel("LOGIN", 2, 1);
		int startCount=Integer.parseInt(usercountstart);	
		String usercountend =toReadDataFromExcel("LOGIN", 3, 1);
		int endCount=Integer.parseInt(usercountend);
		for (int i = startCount; i <=endCount; i++) {
		openChrome();
		driver.manage().window().maximize();
		Configurations.readbaseUrl("SignUpURL");
		Thread.sleep(2000);
		UserCreationPojo a = new UserCreationPojo();
		toFillTextbox(a.getEnterFirstname(),toReadDataFromExcel("USER DETAILS", 1, i));
		toFillTextbox(a.getEnterLastName(), toReadDataFromExcel("USER DETAILS", 2, i));
		toFillTextbox(a.getEnterEmailAddress(),toReadDataFromExcel("USER DETAILS", 3, i));
		toClickButton(a.getClickFlexCheck());
		toClickButton(a.getClickCreateMyAccount());
		Thread.sleep(2000);
		String token = SqlTableCollections.getActivationToken(toReadDataFromExcel("USER DETAILS", 3, i));
		Configurations.readPasswordUrl("SetPassword", token);
		Thread.sleep(2000);
		toFillTextbox(a.getEnterCreateNewPassword(), toReadDataFromExcel("USER DETAILS", 6, 1));
		toFillTextbox(a.getEnterConfirmNewPasword(), toReadDataFromExcel("USER DETAILS", 7, 1));
		toClickButton(a.getClickFlexCheck());
		Thread.sleep(1000);
		toClickButton(a.getClickCreateMyFreeAccount());
		Thread.sleep(2000);
		if (toReadDataFromExcel("USER DETAILS", 4, i).equals("Freelancer")) {
			Thread.sleep(1000);
			toClickButton(a.getClickTechnologyJob());
			Thread.sleep(1000);
			toClickButton(a.getClickNext());
			Thread.sleep(1000);
			toClickButton(a.getClickFreelancerRecruiter());
		}
	
		    toThreadSleep(1000);
		if (toReadDataFromExcel("USER DETAILS", 4, i).equals("JobSeeker")) {
			toThreadSleep(1000);
			toClickButton(a.getClickTechnologyJob());
			Thread.sleep(1000);
			toClickButton(a.getClickNext());
			Thread.sleep(1000);
			toClickButton(a.getClickJobSeeker());
		}

		if (toReadDataFromExcel("USER DETAILS", 4, i).equals("BenchSalesRecruiter")) {
			toThreadSleep(1000);
			toClickButton(a.getClickTechnologyJob());
			Thread.sleep(1000);
			toClickButton(a.getClickNext());
			Thread.sleep(1000);
			scrollDown(a.getClickBenchSalesRecruiter());
			toClickButton(a.getClickBenchSalesRecruiter());
			Thread.sleep(1000);
			toClickButton(a.getClickNextClienttypes());
			Thread.sleep(1000);
			if (toReadDataFromExcel("USER DETAILS", 5, i).equals("Client")) {
				Thread.sleep(1000);
				toClickButton(a.getClickClient());
			}
			else if (toReadDataFromExcel("USER DETAILS", 5, i).equals("SystemsIntegrator")) {
				Thread.sleep(1000);
				toClickButton(a.getClickSystemIntegrator());
			}
			else if (toReadDataFromExcel("USER DETAILS", 5, i).equals("PrimeVendor")) {
				Thread.sleep(1000);
				toClickButton(a.getClickPrimeVendor());
			}
			else if (toReadDataFromExcel("USER DETAILS", 5, i).equals("StaffingAgency")) {
				Thread.sleep(1000);
				toClickButton(a.getClickStaffingAgency());
			}
			else if (toReadDataFromExcel("USER DETAILS", 5, i).equals("Vendor")) {
				scrollDown(a.getClickVendor());
				Thread.sleep(1000);
				toClickButton(a.getClickVendor());
				scrollUp(a.getClickVendor());
			}
			else if (toReadDataFromExcel("USER DETAILS", 5, i).equals("Supplier") ) {
				scrollDown(a.getClickSupplier());
				Thread.sleep(1000);
				toClickButton(a.getClickSupplier());
				scrollUp(a.getClickSupplier());
			}
		}

		if (toReadDataFromExcel("USER DETAILS", 4, i).equals("MTA")) {
			toThreadSleep(1000);
			toClickButton(a.getClickTechnologyJob());
			Thread.sleep(1000);
			toClickButton(a.getClickNext());
			scrollDown(a.getClickManagementTalentAcquisition());
			Thread.sleep(1000);
			toClickButton(a.getClickManagementTalentAcquisition());
			scrollUp(a.getClickManagementTalentAcquisition());
			Thread.sleep(1000);
			toClickButton(a.getClickNextClienttypes());
			if (toReadDataFromExcel("USER DETAILS", 5, i).equals("Client") ) {
				Thread.sleep(1000);
				toClickButton(a.getClickClient());
				Thread.sleep(1000);
				scrollUp(a.getClickClient());
				Thread.sleep(1000);
			}
			else if (toReadDataFromExcel("USER DETAILS", 5, i).equals("SystemsIntegrator")) {
				Thread.sleep(1000);
				toClickButton(a.getClickSystemIntegrator());
				scrollUp(a.getClickSystemIntegrator());
				toThreadSleep(1000);
			}
			else if (toReadDataFromExcel("USER DETAILS", 5, i).equals("PrimeVendor")) {
				Thread.sleep(1000);
				toClickButton(a.getClickPrimeVendor());
				scrollUp(a.getClickPrimeVendor());
				toThreadSleep(1000);
			}
			else if (toReadDataFromExcel("USER DETAILS", 5, i).equals("StaffingAgency")) {
				Thread.sleep(1000);
				toClickButton(a.getClickStaffingAgency());
				scrollUp(a.getClickSystemIntegrator());
				toThreadSleep(1000);
			}
			else if (toReadDataFromExcel("USER DETAILS", 5, i).equals("Vendor")) {
				Thread.sleep(1000);
				toClickButton(a.getClickVendor());
				scrollUp(a.getClickVendor());
			}
			else if (toReadDataFromExcel("USER DETAILS", 5, i).equals("Supplier")) {
				Thread.sleep(1000);
				toClickButton(a.getClickSupplier());
				scrollUp(a.getClickSupplier());
			}
		}

		if (toReadDataFromExcel("USER DETAILS", 4, i).equals("Recruiter")) {
			toThreadSleep(4000);
			toClickButton(a.getClickFindCandidates());
			toClickButton(a.getClickNext());
			Thread.sleep(3000);
			scrollDown(a.getClickRecruiter());
			toThreadSleep(2000);
			toClickButton(a.getClickRecruiter());
			toThreadSleep(2000);
			scrollUp(a.getClickRecruiter());
			toThreadSleep(2000);
			toClickButton(a.getClickNextClienttypes());
			Thread.sleep(3000);
			if (toReadDataFromExcel("USER DETAILS", 5, i).equals("Client")) {
				Thread.sleep(3000);
				toClickButton(a.getClickClient());
			}
			else if (toReadDataFromExcel("USER DETAILS", 5, i).equals("SystemsIntegrator")) {
				Thread.sleep(3000);
				toClickButton(a.getClickSystemIntegrator());
				scrollDown(a.getClickSystemIntegrator());
			}
			else if (toReadDataFromExcel("USER DETAILS", 5, i).equals("PrimeVendor")) {
				Thread.sleep(3000);
				toClickButton(a.getClickPrimeVendor());
			}
			else if (toReadDataFromExcel("USER DETAILS", 5, i).equals("StaffingAgency")) {
				Thread.sleep(3000);
				toClickButton(a.getClickStaffingAgency());
			}
			else if (toReadDataFromExcel("USER DETAILS", 5, i).equals("Vendor") ) {
				scrollDown(a.getClickVendor());
				Thread.sleep(3000);
				toClickButton(a.getClickVendor());
				toThreadSleep(3000);
				scrollUp(a.getClickVendor());
			}
		}
		if (toReadDataFromExcel("USER DETAILS", 4, i).equals("Recruiter") || toReadDataFromExcel("USER DETAILS", 4, i).equals("MTA")  || toReadDataFromExcel("USER DETAILS", 4, i).equals("BenchSalesRecruiter")) {
			Thread.sleep(3000);
			toClickButton(a.getClickSubmitBtn());
		} else {
			Thread.sleep(3000);
			toClickButton(a.getClickUserSubmit());    
		}
		Thread.sleep(6000);
		closeBrowser();
	}
	}
	

	// CURRENT ORGANIZATION JOB CREATION
	@Test(enabled =false, priority = 2)
	private void CurrentOrganization() throws InterruptedException, AWTException, IOException {
		openChrome();
		driver.manage().window().maximize();
		Configurations.readbaseUrl("BaseURL");
		Thread.sleep(2000);
		UserCreationPojo a = new UserCreationPojo();
		ProfileCreationPojo p = new ProfileCreationPojo();
		toFillTextbox(a.getEnterUsername(),toReadDataFromExcel("CURRENT ORG", 1, 1));
		toFillTextbox(a.getEnterPassword(),toReadDataFromExcel("CURRENT ORG", 2, 1));
		Thread.sleep(2000);
		toClickButton(a.getClickLoginbtn());
		Thread.sleep(2000);
		toClickButton(a.getClickPlusEycon());
		toThreadSleep(2000);
		toClickButton(a.getClickCrtjobEycon());
		Thread.sleep(2000);
		toFillTextbox(p.getOrganziationName(), toReadDataFromExcel("CURRENT ORG", 3, 1));
		pressEnterKey();
		Thread.sleep(2000);
		toSelectVisibleText(p.getOrganizationType(), toReadDataFromExcel("CURRENT ORG", 4, 1));
		Thread.sleep(2000);
		toFillTextbox(p.getTitle(),toReadDataFromExcel("CURRENT ORG", 5, 1));
		pressEnterKey();
		Thread.sleep(1000);
		toSelectVisibleText(p.getSelectCountry(), toReadDataFromExcel("CURRENT ORG", 6, 1));
		Thread.sleep(2000);
		toFillTextbox(p.getZipcode(),toReadDataFromExcel("CURRENT ORG", 7, 1));
		Thread.sleep(2000);
		// JOBSERKER NOT ALLOWED TIME ZONE
		toSelectVisibleText(p.getTimeZone(),toReadDataFromExcel("CURRENT ORG", 8, 1));
		Thread.sleep(2000);
		toSelectVisibleText(p.getStartYear(),toReadDataFromExcel("CURRENT ORG", 9, 1));
		toThreadSleep(1000);
		toSelectVisibleText(p.getStartMonth(),toReadDataFromExcel("CURRENT ORG", 10, 1));
		scrollDown(p.getTimeZone());
		Thread.sleep(2000);
		toClickButton(p.getClickCurrentOrgSubmit());
		// toClickButton(p.getClickCloseX());
		Thread.sleep(2000);
		JobCreationPojo j = new JobCreationPojo();
		// toSelectVisibleText(j.getSelectTimeZoneCountry(), " United States");
		// toSelectVisibleText(j.getSelecttimeZone(), " America/New_York");
		// Thread.sleep(2000);
		// toClickButton(j.getClickTimeZoneSubmit());
		Thread.sleep(3000);
		toSelectVisibleText(j.getSelectClientType(), toReadDataFromExcel("CURRENT ORG", 12, 1));
		toFillTextbox(j.getFillClientName(),toReadDataFromExcel("CURRENT ORG", 13, 1));
		Thread.sleep(2000);
		toSelectVisibleText(j.getSelectJobEngagement(),toReadDataFromExcel("CURRENT ORG", 14, 1));
		Thread.sleep(2000);
		toFillTextbox(j.getFillJobTitle(),toReadDataFromExcel("CURRENT ORG", 15, 1));
		Thread.sleep(2000);
		pressEnterKey();
		Thread.sleep(2000);
		// toClickButton(j.getClickJob7days());
		// toClickButton(j.getClickJob15days());
		// toClickButton(j.getClickJob30days());
		toClickButton(j.getClickJobCustom());
		Thread.sleep(2000);
		toFillTextbox(j.getFillJobPrimary(),toReadDataFromExcel("CURRENT ORG", 16, 1));
		Thread.sleep(2000);
		pressEnterKey();
		Thread.sleep(2000);
		toClickButton(j.getFillSecondary());
		toFillTextbox(j.getFillSecondary(),toReadDataFromExcel("CURRENT ORG", 17, 1));
		Thread.sleep(2000);
		pressEnterKey();
		toClickButton(j.getSelectJobCountry());
		toSelectVisibleText(j.getSelectJobCountry(),toReadDataFromExcel("CURRENT ORG", 18, 1));
		Thread.sleep(2000);
		toSelectVisibleText(j.getSelectJobState(),toReadDataFromExcel("CURRENT ORG", 19, 1));
		toFillTextbox(j.getEnterJobCity(),toReadDataFromExcel("CURRENT ORG", 20, 1));
		toFillTextbox(j.getFillJobZipcode(),toReadDataFromExcel("CURRENT ORG", 21, 1));
		Thread.sleep(2000);
		toSelectVisibleText(j.getSelectJobPayType(),toReadDataFromExcel("CURRENT ORG", 22, 1));
		toFillTextbox(j.getFillTragetRate(), toReadDataFromExcel("CURRENT ORG", 23, 1));
		Thread.sleep(2000);
		toSelectVisibleText(j.getSelectJobDuration(),toReadDataFromExcel("CURRENT ORG", 24, 1));
		toSelectVisibleText(j.getSelectJobDurationType(),toReadDataFromExcel("CURRENT ORG", 25, 1));
		Thread.sleep(2000);
		toSelectVisibleText(j.getSelectJobExpeFrom(), toReadDataFromExcel("CURRENT ORG", 26, 1));
		toSelectVisibleText(j.getSelectJobExpto(), toReadDataFromExcel("CURRENT ORG", 27, 1));
		Thread.sleep(2000);
		toClickButton(j.getClickJobRemotWrk());
		toClickButton(j.getClickJobRelocateReq());
		toClickButton(j.getClickJobSecurityClear());
		toClickButton(j.getClickJobWorkFrom());
		toFillTextbox(j.getClickJobDescripction(), toReadDataFromExcel("CURRENT ORG", 28, 1));
		Thread.sleep(2000);
		// toClickButton(j.getClickJobClear());
		// toClickButton(j.getClickJobCancel());
		// toClickButton(j.getClickJobDraft());
		toClickButton(j.getClickJobPost());
		Thread.sleep(2000);
		// toClickButton(j.getClickJobNo());
		// toClickButton(j.getClickJobYes());
		toClickButton(j.getClickJob());
		Thread.sleep(4000);
		toClickButton(j.getClickThreeDotOne());
		Thread.sleep(4000);
		toClickButton(j.getClickJobView());
		Thread.sleep(4000);
		toClickButton(j.getClickJob());

	}

	// CONNECTIONS
	@Test(enabled = false)
	private void connections() throws InterruptedException, IOException {
		openChrome();
		driver.manage().window().maximize();
		Configurations.readbaseUrl("BaseURL");
//		driver.get("http://135.181.42.100/gigsumo/#/login");
		Thread.sleep(3000);
		UserCreationPojo a = new UserCreationPojo();
		toFillTextbox(a.getEnterUsername(), "recruiter@gig.com");
		toFillTextbox(a.getEnterPassword(), "Pass@123");
		Thread.sleep(2000);
		toClickButton(a.getClickLoginbtn());
		Thread.sleep(5000);
		toFillTextbox(a.getFillGlobalSearchdata(), "JOE FRANCES");
		Thread.sleep(4000);
		toClickButton(a.getClickGlbViewAll());
		// toClickButton(a.getClickUser());
		Thread.sleep(3000);
		toClickButton(a.getClickConnect());
		// toClickButton(a.getClickUserConnection());
		Thread.sleep(5000);
		// WebElement logo=driver.findElement(By.xpath("(//img[@class='img-circle
		// ng-star-inserted'])[1]"));
		replaceClick(a.getClickUserProfile());
		Thread.sleep(3000);
		toClickButton(a.getClickLogout());
		Thread.sleep(3000);
		toFillTextbox(a.getEnterUsername(), "benchrec@gig.com");
		toFillTextbox(a.getEnterPassword(), "Pass@123");
		Thread.sleep(3000);
		toClickButton(a.getClickLoginbtn());
		Thread.sleep(5000);
		toClickButton(a.getClickNotification());
		Thread.sleep(3000);
		toClickButton(a.getClickUserAccept());
		Thread.sleep(3000);
		toClickButton(a.getClickHome());
		Thread.sleep(3000);
		toClickButton(a.getClickConnections());

	}

	// PERSIONAL DETAILS
	@Test(enabled = false)
	private void PersionalDetails() throws InterruptedException, AWTException, IOException {
		openChrome();
		driver.manage().window().maximize();
		Configurations.readbaseUrl("BaseURL");
//		driver.get("http://135.181.42.100/gigsumo/#/login");
		Thread.sleep(3000);
		UserCreationPojo a = new UserCreationPojo();
		ProfileCreationPojo p = new ProfileCreationPojo();
		toFillTextbox(a.getEnterUsername(), "recruiter@gig.com");
		toFillTextbox(a.getEnterPassword(), "Pass@123");
		toClickButton(a.getClickLoginbtn());
		Thread.sleep(4000);
		// toClickButton(p.getClickOrgName());
		toClickButton(p.getClickCompleteYourProfile());
		Thread.sleep(3000);
		toClickButton(p.getClickpersonalDet());
		Thread.sleep(3000);
		toFillTextbox(p.getFillPN(), "9988776644");
		toSelectVisibleText(p.getSelectCtry(), " United States");
		Thread.sleep(3000);
		toFillTextbox(p.getFillZipCd(), "12345");
		Thread.sleep(2000);
		scrollDown(p.getFillZipCd());
		Thread.sleep(3000);
		toClickButton(p.getClickSub());
		Thread.sleep(4000);
	}

	// JOB CREATION POST
	@Test(enabled = false)
	private void JobCreation() throws InterruptedException, AWTException, IOException {
		openChrome();
		driver.manage().window().maximize();
		Configurations.readbaseUrl("BaseURL");
		Thread.sleep(2000);
		UserCreationPojo a = new UserCreationPojo();
		toFillTextbox(a.getEnterUsername(),toReadDataFromExcel("JOB CREATION", 1, 1));
		toFillTextbox(a.getEnterPassword(), toReadDataFromExcel("JOB CREATION", 2, 1));
		toClickButton(a.getClickLoginbtn());
		Thread.sleep(4000);
		JobCreationPojo j = new JobCreationPojo();
		toClickButton(j.getClickpostCreatJob());
		// Thread.sleep(3000);
		// toSelectVisibleText(j.getSelectTimeZoneCountry(), " United States");
		// .sleep(2000);
		// toSelectVisibleText(j.getSelecttimeZone(), " America/New_York");
		// Thread.sleep(2000);
		// toClickButton(j.getClickTimeZoneSubmit());
		Thread.sleep(4000);
		toSelectVisibleText(j.getSelectClientType(), toReadDataFromExcel("JOB CREATION", 3, 1));
		toFillTextbox(j.getFillClientName(), toReadDataFromExcel("JOB CREATION", 4, 1));
		Thread.sleep(2000);
		toSelectVisibleText(j.getSelectJobEngagement(), toReadDataFromExcel("JOB CREATION", 5, 1));
		Thread.sleep(2000);
		toFillTextbox(j.getFillJobTitle(),toReadDataFromExcel("JOB CREATION", 6, 1));
		Thread.sleep(2000);
		pressEnterKey();
		Thread.sleep(2000);
		// toClickButton(j.getClickJob7days());
		// toClickButton(j.getClickJob15days());
		// toClickButton(j.getClickJob30days());
		toClickButton(j.getClickJobCustom());
		toThreadSleep(2000);
		toFillTextbox(j.getFillJobPrimary(), toReadDataFromExcel("JOB CREATION", 7, 1));
		Thread.sleep(2000);
		pressEnterKey();
		Thread.sleep(2000);
		toClickButton(j.getFillSecondary());
		toFillTextbox(j.getFillSecondary(), toReadDataFromExcel("JOB CREATION", 8, 1));
		Thread.sleep(2000);
		pressEnterKey();
		toClickButton(j.getSelectJobCountry());
		toSelectVisibleText(j.getSelectJobCountry(),toReadDataFromExcel("JOB CREATION", 9, 1));
		Thread.sleep(2000);
		toSelectVisibleText(j.getSelectJobState(),toReadDataFromExcel("JOB CREATION", 10, 1));
		toFillTextbox(j.getEnterJobCity(), toReadDataFromExcel("JOB CREATION", 11, 1));
		toFillTextbox(j.getFillJobZipcode(), toReadDataFromExcel("JOB CREATION", 12, 1));
		Thread.sleep(2000);
		toSelectVisibleText(j.getSelectJobPayType(), toReadDataFromExcel("JOB CREATION", 13, 1));
		toFillTextbox(j.getFillTragetRate(), toReadDataFromExcel("JOB CREATION", 14, 1));
		Thread.sleep(2000);
		toSelectVisibleText(j.getSelectJobDuration(), toReadDataFromExcel("JOB CREATION", 15, 1));
		toSelectVisibleText(j.getSelectJobDurationType(), toReadDataFromExcel("JOB CREATION", 16, 1));
		Thread.sleep(2000);
		toSelectVisibleText(j.getSelectJobExpeFrom(), toReadDataFromExcel("JOB CREATION", 17, 1));
		toSelectVisibleText(j.getSelectJobExpto(), toReadDataFromExcel("JOB CREATION", 18, 1));
		Thread.sleep(2000);
		toClickButton(j.getClickJobRemotWrk());
		toClickButton(j.getClickJobRelocateReq());
		toClickButton(j.getClickJobSecurityClear());
		toClickButton(j.getClickJobWorkFrom());
		toFillTextbox(j.getClickJobDescripction(), toReadDataFromExcel("JOB CREATION", 19, 1));
		Thread.sleep(2000);
		// toClickButton(j.getClickJobClear());
		// toClickButton(j.getClickJobCancel());
		// toClickButton(j.getClickJobDraft());
		toClickButton(j.getClickJobPost());
		// Thread.sleep(3000);
		// toClickButton(j.getClickJobNo());
		// toClickButton(j.getClickJobYes());
		// toClickButton(j.getClickJob());

	}

	
	// JOB CARD VIEW, EDIT, UPGRADEJOB, DOWNGRADEJOB
	@Test(enabled = false)
	private void JobCardViewEdit() throws InterruptedException, IOException {
		openChrome();
		driver.manage().window().maximize();
		Configurations.readbaseUrl("BaseURL");
//		driver.get("http://135.181.42.100/gigsumo/#/login");
		Thread.sleep(3000);
		UserCreationPojo a = new UserCreationPojo();
		toFillTextbox(a.getEnterUsername(), toReadDataFromExcel("JOB CREATION", 1, 1));
		toFillTextbox(a.getEnterPassword(), toReadDataFromExcel("JOB CREATION", 2, 1));
		toClickButton(a.getClickLoginbtn());
		Thread.sleep(4000);
		JobCreationPojo j = new JobCreationPojo();
		toClickButton(j.getClickJob());
		Thread.sleep(4000);
		toClickButton(j.getClickThreeDotOne());
		Thread.sleep(4000);
		toClickButton(j.getClickJobView());
		Thread.sleep(4000);
		toClickButton(j.getClickJobEdit());
		Thread.sleep(4000);
		toClickButton(j.getClickJobCustom());
		toThreadSleep(4000);
		toClickButton(j.getClickUpdateJOb());
		toThreadSleep(4000);
		toClickButton(j.getClickThreeDotOne());
		toThreadSleep(2000);
		toClickButton(j.getClickUpgradeJob());
		toThreadSleep(2000);
		toClickButton(j.getClickUpgradeYes());
		Thread.sleep(5000);
		toClickButton(j.getClickThreeDotOne());
		toThreadSleep(4000);
		toClickButton(j.getClickDowngradeJob());
		toThreadSleep(4000);
		toClickButton(j.getClickJob());

	}

	// HOLD, ONHOLD, ACTIVE, IN ACTIVE, CLOSE, FILLED
	@Test(enabled = false)
	private void JobHoldAndClosed() throws InterruptedException, IOException {
		openChrome();
		driver.manage().window().maximize();
		Configurations.readbaseUrl("BaseURL");
//		driver.get("http://135.181.42.100/gigsumo/#/login");
		Thread.sleep(3000);
		UserCreationPojo a = new UserCreationPojo();
		toFillTextbox(a.getEnterUsername(), toReadDataFromExcel("JOB CREATION", 1, 1));
		toFillTextbox(a.getEnterPassword(), toReadDataFromExcel("JOB CREATION", 2, 1));
		toClickButton(a.getClickLoginbtn());
		Thread.sleep(3000);
		JobCreationPojo j = new JobCreationPojo();
		Thread.sleep(4000);
		toClickButton(j.getClickJob());
		Thread.sleep(3000);
		toClickButton(j.getClickActive1());
		toClickButton(j.getClickOnHold());
		toThreadSleep(3000);
		scrollDown(j.getClickJobStaus());
		Thread.sleep(4000);
		toClickButton(j.getClickJobStaus());
		toClickButton(j.getClickJFilterStatusOnHold());
		Thread.sleep(3000);
		scrollUp(j.getClickStatuOnhold());
		Thread.sleep(3000);
		toClickButton(j.getClickStatuOnhold());
		Thread.sleep(3000);
		toClickButton(j.getClickStatusActive());
		Thread.sleep(7000);
		toClickButton(j.getClickFormStatusActive());
		Thread.sleep(4000);
		toClickButton(j.getClickJob());
		Thread.sleep(3000);
		toClickButton(j.getClickActive1());
		toClickButton(j.getClickJobInactive());
		Thread.sleep(3000);
		scrollDown(j.getClickJobStaus());
		Thread.sleep(4000);
		toClickButton(j.getClickJobStaus());
		toClickButton(j.getClickFilterJobInactive());
		Thread.sleep(3000);
		scrollUp(j.getClickStatusInactive());
		Thread.sleep(3000);
		toClickButton(j.getClickStatusInactive());
		Thread.sleep(3000);
		toClickButton(j.getClickStatusActive());
		Thread.sleep(7000);
		toClickButton(j.getClickFormStatusActive());
		Thread.sleep(3000);
		toClickButton(j.getClickJob());
		Thread.sleep(3000);
		toClickButton(j.getClickActive1());
		Thread.sleep(2000);
		toClickButton(j.getClickJobClose());
		Thread.sleep(4000);
		// scrollDown(j.getClickJobStaus());
		// Thread.sleep(3000);
		toClickButton(j.getClickJobStaus());
		toThreadSleep(2000);
		toClickButton(j.getClickStatusClose());
		toThreadSleep(4000);
		toClickButton(j.getClickJob());
		Thread.sleep(4000);
		toClickButton(j.getClickActive1());
		Thread.sleep(3000);
		toClickButton(j.getClickJobFilled());
		Thread.sleep(3000);
		// scrollDown(j.getClickJobStaus());
		toClickButton(j.getClickJobStaus());
		toThreadSleep(2000);
		toClickButton(j.getClickStatusFilled());
		toThreadSleep(4000);
		toClickButton(j.getClickJob());
	}

	// JOBCARD DETAILS
	@Test(enabled = false)
	private void JobCardDetails() throws InterruptedException, IOException {
		openChrome();
		driver.manage().window().maximize();
		Configurations.readbaseUrl("BaseURL");
//		driver.get("http://135.181.42.100/gigsumo/#/login");
		Thread.sleep(3000);
		UserCreationPojo a = new UserCreationPojo();
		toFillTextbox(a.getEnterUsername(), toReadDataFromExcel("JOB CREATION", 1, 1));
		toFillTextbox(a.getEnterPassword(), toReadDataFromExcel("JOB CREATION", 2, 1));
		toClickButton(a.getClickLoginbtn());
		Thread.sleep(4000);
		JobCreationPojo j = new JobCreationPojo();
		toClickButton(j.getClickJob());
		Thread.sleep(3000);
		toClickButton(j.getClickJobcard());
		Thread.sleep(3000);
		toClickButton(j.getClickJobApplicants());
		Thread.sleep(4000);
		toClickButton(j.getClickApplied());
		Thread.sleep(4000);
		toClickButton(j.getClickListShortlisted());
		Thread.sleep(4000);
		toClickButton(j.getClickShortlisted());
		Thread.sleep(5000);
		toClickButton(j.getClickListRedjected());
		Thread.sleep(5000);
		toClickButton(j.getClickRejected());
		Thread.sleep(5000);
		toClickButton(j.getClickListInterviewScheduled());
		Thread.sleep(6000);
		toClickButton(j.getClickInterivewScheduled());
		Thread.sleep(7000);
		toClickButton(j.getClickListInterviewRejected());
		Thread.sleep(6000);
		toClickButton(j.getClickInterviewRejected());
		Thread.sleep(6000);
		toClickButton(j.getClickListSelected());
		Thread.sleep(6000);
		toClickButton(j.getClickSelected());
		Thread.sleep(6000);
		toClickButton(j.getClickListOffered());
		Thread.sleep(6000);
		toClickButton(j.getClickOffered());
		Thread.sleep(6000);
		toClickButton(j.getClickListPreonboarded());
		Thread.sleep(6000);
		toClickButton(j.getClickpreOnboared());
		Thread.sleep(6000);
		toClickButton(j.getClickListOnboarded());
		Thread.sleep(6000);
		toClickButton(j.getClickOnboarded());
		Thread.sleep(6000);
		toClickButton(j.getClickListOfferWithdrawn());
		Thread.sleep(6000);
		toClickButton(j.getClickOfferWithdrawn());
		Thread.sleep(6000);
		toClickButton(j.getClickListOfferDeclined());
		Thread.sleep(6000);
		toClickButton(j.getClickCandidatesInvited());
		Thread.sleep(3000);
		toClickButton(j.getClickPeopleViewed());
		Thread.sleep(4000);
		toClickButton(j.getClickPeopleLiked());
		Thread.sleep(4000);
		toClickButton(j.getClickJob());

	}

	// ABOUT YOURSELF, WORK EXPERIENCE, EDUCATION, CERTIFICATIONS, SOCIAL INFLUENCE
	@Test(enabled = false)
	private void ProfileUpdate() throws InterruptedException, AWTException {
		openChrome();
		driver.manage().window().maximize();
		driver.get("http://135.181.42.100/gigsumo/#/login");
		Thread.sleep(3000);
		UserCreationPojo a = new UserCreationPojo();
		ProfileCreationPojo p = new ProfileCreationPojo();
		toFillTextbox(a.getEnterUsername(), "benchrecruiter@abi.com");
		toFillTextbox(a.getEnterPassword(), "Pass@123");
		toClickButton(a.getClickLoginbtn());
		Thread.sleep(4000);
		// toClickButton(p.getClickOrgName());
		toClickButton(p.getClickCompleteYourProfile());
		Thread.sleep(3000);

		// ABOUT YOURSELF

		toClickButton(p.getClickEditAbtYors());
		Thread.sleep(4000);
		toFillTextbox(p.getEnterAboutYourSelf(),
				"My strengths are I am a self-motivated dedicated and honest person. My current goal is to get a job in a reputed company and my long-term goal is to achieve a good position where I can build my career and help the organization too. My strength is included hard work honesty and adaptability. That's all about me.");
		toClickButton(p.getSubmitaboutyrs());
		// toClickButton(p.getCancelaboutyrs());
		Thread.sleep(4000);

		// WORK EXPERIENCE

		 scrollDown(p.getClickEditAbtYors());
		 Thread.sleep(3000);
		 toClickButton(p.getClickWorkexperience());
		 Thread.sleep(2000);
		 toFillTextbox(p.getOrganziationName(), "MAHIA ORG");
		 toThreadSleep(3000);
		 pressEnterKey();
		 Thread.sleep(3000);
		 toClickButton(p.getClickCheckCurrentORG());
		 toThreadSleep(2000);
		 toSelectVisibleText(p.getOrganizationType(), " Systems Integrator");
		 Thread.sleep(3000);
		 toFillTextbox(p.getTitle(), "Bench Sales Recruiter ");
		 pressEnterKey();
		 Thread.sleep(1000);
		 toSelectVisibleText(p.getSelectCountry()," United States");
		 Thread.sleep(2000);
		 toFillTextbox(p.getZipcode(), "12345");
		 Thread.sleep(2000);
		 //JOBSERKER NOT ALLOWED TIME ZONE
		 toSelectVisibleText(p.getTimeZone(), " America/New_York");
		 Thread.sleep(2000);
		 toSelectVisibleText(p.getStartYear(), "2023");
		 toSelectVisibleText(p.getStartMonth(), "June");
		 scrollDown(p.getTimeZone());
		 Thread.sleep(4000);
		 toClickButton(p.getSubmit());
		 //toClickButton(p.getClickCloseX());

		// EDUCATION

		Thread.sleep(3000);
		scrollDown(p.getClickWorkexperience());
		Thread.sleep(3000);
		toClickButton(p.getClickEducation());
		Thread.sleep(3000);
		toFillTextbox(p.getSchoolName(), "ABS ");
		Thread.sleep(3000);
		toClickButton(p.getClickCurrentlyPursed());
		Thread.sleep(3000);
		toSelectVisibleText(p.getProfileCountry(), " United States ");
		Thread.sleep(3000);
		toFillTextbox(p.getZipcode(), "12345");
		Thread.sleep(2000);
		toFillTextbox(p.getDegree(), "BED");
		toFillTextbox(p.getSpeciality(), "Computer Science");
		toSelectVisibleText(p.getStartYear(), "2022 ");
		toSelectVisibleText(p.getStartMonth(), "June ");
		Thread.sleep(3000);
		scrollDown(p.getSubmit());
		toClickButton(p.getSubmit());
		Thread.sleep(3000);

		// CERTIFICATIONS

		scrollDown(p.getClickWorkexperience());
		Thread.sleep(3000);
		// scrollDown(p.getClickEducation());
		// Thread.sleep(3000);
		toClickButton(p.getClickCertifications());
		Thread.sleep(3000);
		toFillTextbox(p.getFillCertificationName(), "AIMS");
		Thread.sleep(2000);
		toFillTextbox(p.getFillOrganization(), "APPOLLO");
		toFillTextbox(p.getFillLincenseNo(), "837338346");
		Thread.sleep(2000);
		toSelectVisibleText(p.getSelectIssueYear(), "2021 ");
		Thread.sleep(2000);
		toSelectVisibleText(p.getSelectIssueMonth(), "June ");
		Thread.sleep(2000);
		toSelectVisibleText(p.getSelectEndYear(), "2022 ");
		Thread.sleep(2000);
		toSelectVisibleText(p.getSelectEndMonth(), "March ");
		Thread.sleep(2000);
		toClickButton(p.getClickCertificateSubmit());
		Thread.sleep(3000);

		// SOCIAL INFLUENCE

		toClickButton(p.getClickSocialInfluence());
		toFillTextbox(p.getFillLinkedin(), "pradI");
		Thread.sleep(2000);
		toFillTextbox(p.getFillTwitter(), "pradz");
		toFillTextbox(p.getFillfacebook(), "pradeep rajendran");
		Thread.sleep(2000);
		toClickButton(p.getSocialSubmit());
	}

	// CURRENT ORGANIZATION CANDIDATE CREATION
	@Test(enabled = false)
	private void CurrentOrganizationCandidate() throws InterruptedException, AWTException {
		openChrome();
		driver.manage().window().maximize();
		driver.get("http://135.181.42.100/gigsumo/#/login");
		Thread.sleep(3000);
		UserCreationPojo a = new UserCreationPojo();
		ProfileCreationPojo p = new ProfileCreationPojo();
		toFillTextbox(a.getEnterUsername(), "benchrec@care.com");
		toFillTextbox(a.getEnterPassword(), "Pass@123");
		toClickButton(a.getClickLoginbtn());
		Thread.sleep(4000);
		CandidateCreationPojo c = new CandidateCreationPojo();
		toClickButton(c.getClickPlusCreate());
		toClickButton(c.getClickPluseCreateCandidate());
		// toClickButton(c.getClickCreatecandidate());
		Thread.sleep(6000);
		toFillTextbox(p.getOrganziationName(), "DP CORE");
		pressEnterKey();
		Thread.sleep(3000);
		toSelectVisibleText(p.getOrganizationType(), " Systems Integrator");
		Thread.sleep(3000);
		toFillTextbox(p.getTitle(), "Recruiter");
		pressEnterKey();
		Thread.sleep(1000);
		toSelectVisibleText(p.getSelectCountry(), " United States");
		Thread.sleep(2000);
		toFillTextbox(p.getZipcode(), "12345");
		Thread.sleep(2000);
		// JOBSERKER NOT ALLOWED TIME ZONE
		toSelectVisibleText(p.getTimeZone(), " America/New_York");
		Thread.sleep(2000);
		toSelectVisibleText(p.getStartYear(), "2023");
		toSelectVisibleText(p.getStartMonth(), "June");
		scrollDown(p.getTimeZone());
		Thread.sleep(4000);
		toClickButton(p.getClickCurrentOrgSubmit());
		// toClickButton(p.getClickCloseX());
		Thread.sleep(7000);
		toFillTextbox(c.getFirstName(), "SHANA");
		toThreadSleep(2000);
		toFillTextbox(c.getLastName(), "STEV");
		toFillTextbox(c.getPhone(), "6868843424566");
		toFillTextbox(c.getEmail(), "scott@gig.com");
		Thread.sleep(2000);
		toFillTextbox(c.getEffectiveFrom(), getCurrentDate());
		toClickButton(c.getEffectivefor());
		toSelectVisibleText(c.getAvalibility(), "  Other");
		toSelectVisibleText(c.getAvilablefor(), " W2 - Contract");
		Thread.sleep(1000);
		toFillTextbox(c.getJobTitle(), "Change Management Analyst");
		Thread.sleep(2000);
		pressEnterKey();
		toSelectVisibleText(c.getTotalExperience(), " 3");
		Thread.sleep(2000);
		// toSelectVisibleText(c.getCountry(), " United States");
		// Thread.sleep(2000);
		// toSelectVisibleText(c.getState(), "New York ");
		// toFillTextbox(c.getCity(), "Albany");
		// toFillTextbox(c.getZipcode(), "12345");
		// Thread.sleep(2000);
		toFillTextbox(c.getPrimarySkills(), "Java Deployment Technologies");
		Thread.sleep(2000);
		pressEnterKey();
		toClickButton(c.getSecondarySkills());
		toFillTextbox(c.getSecondarySkills(), "AWS DevOps");
		Thread.sleep(1000);
		pressEnterKey();
		toSelectVisibleText(c.getWorkAuthorization(), "  EAD - H4  ");
		Thread.sleep(2000);
		toSelectVisibleText(c.getPayType(), "Monthly");
		toFillTextbox(c.getTargetRate(), "4000");
		Thread.sleep(1000);
		toClickButton(c.getRemoteWork());
		toClickButton(c.getWorkFromHome());
		toFillTextbox(c.getResumeSummary(),
				"The following table shows the 100 most popular given names for male and female babies born during the last 100 years, 1922-2021. ");
		Thread.sleep(2000);
		// toClickButton(c.getClear());
		// toClickButton(c.getSaveAsDraft());
		toClickButton(c.getMakeAvilable());
	}

	// CANDIDATE CREATION
	@Test(enabled =false)
	private void CandidateCreation() throws InterruptedException, AWTException {
		// openEdge();
		openChrome();
		driver.manage().window().maximize();
		driver.get("http://135.181.42.100/gigsumo/#/login");
		Thread.sleep(3000);
		UserCreationPojo a = new UserCreationPojo();
		toFillTextbox(a.getEnterUsername(), "benchrec@gig.com");
		toFillTextbox(a.getEnterPassword(), "Pass@123");
		toClickButton(a.getClickLoginbtn());
		Thread.sleep(4000);
		CandidateCreationPojo c = new CandidateCreationPojo();
		toClickButton(c.getClickPlusCreate());
		toClickButton(c.getClickPluseCreateCandidate());
		// toClickButton(c.getClickCreatecandidate());
		Thread.sleep(5000);
		toFillTextbox(c.getFirstName(), "SHANNA");
		toFillTextbox(c.getLastName(), "MELIS");
		toFillTextbox(c.getPhone(), "6868234534566");
		toFillTextbox(c.getEmail(), "scott@gig.com");
		Thread.sleep(3000);
		// toFillTextbox(c.getEffectiveFrom(), getCurrentDate());
		// toClickButton(c.getEffectivefor());
		toClickButton(c.getClickCandCustom());
		toThreadSleep(3000);
		toSelectVisibleText(c.getAvalibility(), "  Other");
		toSelectVisibleText(c.getAvilablefor(), " W2 - Contract");
		Thread.sleep(1000);
		toFillTextbox(c.getJobTitle(), "Change Management Analyst");
		Thread.sleep(2000);
		pressEnterKey();
		toSelectVisibleText(c.getTotalExperience(), " 3");
		Thread.sleep(2000);
		// toSelectVisibleText(c.getCountry(), " United States");
		// Thread.sleep(2000);
		// toSelectVisibleText(c.getState(), "New York ");
		// toFillTextbox(c.getCity(), "Albany");
		// toFillTextbox(c.getZipcode(), "12345");
		// Thread.sleep(2000);
		toFillTextbox(c.getPrimarySkills(), "Java Deployment Technologies");
		Thread.sleep(2000);
		pressEnterKey();
		toClickButton(c.getSecondarySkills());
		toFillTextbox(c.getSecondarySkills(), "AWS DevOps");
		Thread.sleep(1000);
		pressEnterKey();
		toSelectVisibleText(c.getWorkAuthorization(), "  EAD - H4  ");
		Thread.sleep(2000);
		toSelectVisibleText(c.getPayType(), "Monthly");
		toFillTextbox(c.getTargetRate(), "4000");
		Thread.sleep(1000);
		toClickButton(c.getRemoteWork());
		toClickButton(c.getWorkFromHome());
		toFillTextbox(c.getResumeSummary(),
				"The following table shows the 100 most popular given names for mPlease note that popular names listed below are not necessarily consistently popular in every year. For example, the name James, ranked as the most popular male name over the last 100 years, has been ranked as low as number 19years, has been ranked as low as number 19 ");
		Thread.sleep(3000);
		// toClickButton(c.getClear());
		// toClickButton(c.getSaveAsDraft());
		toClickButton(c.getMakeAvilable());
		Thread.sleep(4000);
		// toClickButton(c.getClickCreditAlert());

		// VIEW,EDIT,UPGRADE,DOWNGRADE

		toClickButton(c.getClickCandidate());
		Thread.sleep(4000);
		toClickButton(c.getClickThreeDot());
		Thread.sleep(1000);
		toClickButton(c.getClickView());
		Thread.sleep(3000);
		toClickButton(c.getClickViewEdit());
		Thread.sleep(5000);
		toClickButton(c.getClickCandidateUpdate());
		Thread.sleep(5000);
		toClickButton(c.getClickThreeDot());
		Thread.sleep(2000);
		toClickButton(c.getClickUpgradeCandidate());
		Thread.sleep(2000);
		toClickButton(c.getClickCandidateUpgradeYes());
		Thread.sleep(5000);
		toClickButton(c.getClickThreeDot());
		Thread.sleep(1000);
		toClickButton(c.getClickDowngradCandidate());

	}

	// DEACTIVATE AVILABLE, UNAVAILABLE
	@Test(enabled = false)
	private void Deactivate() throws InterruptedException {
		openChrome();
		driver.manage().window().maximize();
		driver.get("http://135.181.42.100/gigsumo/#/login");
		Thread.sleep(3000);
		UserCreationPojo a = new UserCreationPojo();
		toFillTextbox(a.getEnterUsername(), "benchrecruiter@abi.com");
		toFillTextbox(a.getEnterPassword(), "Pass@123");
		toClickButton(a.getClickLoginbtn());
		Thread.sleep(4000);
		CandidateCreationPojo c = new CandidateCreationPojo();
		toClickButton(c.getClickCandidate());
		toThreadSleep(4000);
		toClickButton(c.getClickCandiateCustom());
		// toClickButton(c.getClickCandidate7());
		// toClickButton(c.getClickCandidate15());
		// toClickButton(c.getClickCandiate30());
		toThreadSleep(4000);
		toClickButton(c.getClickCandCheckBox());
		toThreadSleep(3000);
		toClickButton(c.getClickCandActivate());
		toThreadSleep(4000);
		toClickButton(c.getClickAvailable());
		toThreadSleep(4000);
		toClickButton(c.getClickListUnavailable());
		Thread.sleep(6000);
		toClickButton(c.getClickCandidateSorece());
		// scrollDown(c.getClickCandidateStatus());
		Thread.sleep(4000);
		toClickButton(c.getClickCandidateStatus());
		Thread.sleep(4000);
		toClickButton(c.getClickStatusUnavilable());
		Thread.sleep(4000);
		toClickButton(c.getClickUnavilable());
		toThreadSleep(5000);
		toClickButton(c.getClickUnavilableActive());
		Thread.sleep(5000);
		toClickButton(c.getClickMakeAvilable());
		toThreadSleep(4000);
		toClickButton(c.getClickCandidate());

	}

	// CANDIDATE DETAILS SUBMISSION FILTER
	@Test(enabled = false)
	private void CandidateDetails() throws InterruptedException, AWTException {

		openChrome();
		driver.manage().window().maximize();
		driver.get("http://135.181.42.100/gigsumo/#/login");
		Thread.sleep(3000);
		ProfileCreationPojo p = new ProfileCreationPojo();
		UserCreationPojo a = new UserCreationPojo();
		toFillTextbox(a.getEnterUsername(), "benchrec@care.com");
		toFillTextbox(a.getEnterPassword(), "Pass@123");
		toClickButton(a.getClickLoginbtn());
		Thread.sleep(4000);
		CandidateCreationPojo c = new CandidateCreationPojo();
		toClickButton(c.getClickCandidate());
		toThreadSleep(3000);
		toClickButton(c.getClickCandCard());
		toThreadSleep(3000);
		toClickButton(c.getClickCandiateDetails());
		toThreadSleep(3000);
		toClickButton(c.getClickdetailAboutCandidate());
		toThreadSleep(2000);
		toFillTextbox(c.getFillDetailsAbutCandiate(), "Please note that popular names listed below are not necessarily consistently popular in every year. ");
		toThreadSleep(3000);
		toClickButton(c.getClickCanDetailsSubmit());
		toThreadSleep(4000);
	    toClickButton(c.getClickCandidateWorkExperience());
		toThreadSleep(3000);
	
		toClickButton(c.getClickDetailEducationDetails());
		Thread.sleep(4000);
		toFillTextbox(p.getSchoolName(), "ABScol ");
		Thread.sleep(3000);
		toClickButton(p.getClickCurrentlyPursed());
		Thread.sleep(3000);
		toSelectVisibleText(p.getProfileCountry(), " United States ");
		Thread.sleep(3000);
		toFillTextbox(p.getZipcode(), "12345");
		Thread.sleep(2000);
		toFillTextbox(p.getDegree(), "BED");
		toFillTextbox(p.getSpeciality(), "Computer Science");
		toSelectVisibleText(p.getStartYear(), "2022 ");
		toSelectVisibleText(p.getStartMonth(), "June ");
		Thread.sleep(3000);
		scrollDown(p.getSubmit());
		toClickButton(p.getSubmit());
		Thread.sleep(3000);
		toClickButton(c.getClickJobsApplited());
		toThreadSleep(4000);
		toClickButton(c.getClickJobAppliedFilter());
		toThreadSleep(3000);
		toClickButton(c.getClickFilterArrow());
		toThreadSleep(3000);
		toClickButton(c.getClickPeopleViewed());
		toThreadSleep(3000);
		toClickButton(c.getClickResumeRequests());
		toThreadSleep(4000);
		toClickButton(c.getClickJobInvites());
		toThreadSleep(4000);
		toClickButton(c.getClickCandInvited());
		toThreadSleep(4000);
		toClickButton(c.getClickSubmitInvitation());
		toThreadSleep(3000);
		toClickButton(c.getClickCandTermsBox());
		toThreadSleep(3000);
		toClickButton(c.getClickCandSubmit());
		toThreadSleep(4000);
		toClickButton(c.getClickCandRejected());
		toThreadSleep(4000);
		toClickButton(c.getClickRejectInviation());
		toThreadSleep(4000);
		toClickButton(c.getClickCandRejected());
		toThreadSleep(4000);
		toClickButton(c.getClickSubmitInvitation());
		toThreadSleep(4000);
		toClickButton(c.getClickCandTermsBox());
		toThreadSleep(3000);
		toClickButton(c.getClickCandSubmit());
		toThreadSleep(3000);
		toClickButton(c.getClickPeopelLiked());

	}

//	@Test
//	private void tc1() throws InterruptedException, IOException, SQLException {
//		
//	String token=SqlTableCollections.getActivationToken("mta@team.com");
//	
//		openChrome();
//		driver.manage().window().maximize();
//		Configurations.readbaseUrl("BaseURL");
//		Thread.sleep(3000);
//		UserCreationPojo a = new UserCreationPojo();
//		toFillTextbox(a.getEnterUsername(), toReadDataFromExcel("Test", 0, 0));
//		toFillTextbox(a.getEnterPassword(), toReadDataFromExcel("Test", 1, 0));
//		toClickButton(a.getClickLoginbtn());
//		Thread.sleep(4000);
//	}
//	}
}

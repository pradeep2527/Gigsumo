package RunnerPackage;

import java.awt.AWTException;
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

	
	//USER CREATION
	
	@Test(enabled =false)
	private void UserCreation() throws InterruptedException, SQLException{
		
		openChrome();
		driver.manage().window().maximize();
		driver.get("http://135.181.42.100/gigsumo/#/signUp");
		Thread.sleep(3000);
		UserCreationPojo a = new UserCreationPojo();
		toFillTextbox(a.getEnterFirstname(), Configurations.firstName);	
		toFillTextbox(a.getEnterLastName(), Configurations.lastName);
		toFillTextbox(a.getEnterEmailAddress(), Configurations.mail);
		toClickButton(a.getClickFlexCheck());
		toClickButton(a.getClickCreateMyAccount());
		Thread.sleep(3000);
		String token=SqlTableCollections.getActivationToken(Configurations.mail);
		driver.get("http://135.181.42.100/gigsumo/#/setPassword?jsr="+token);
		Thread.sleep(3000);
		toFillTextbox(a.getEnterCreateNewPassword(),"Pass@123");
		toFillTextbox(a.getEnterConfirmNewPasword(), "Pass@123");
		toClickButton(a.getClickFlexCheck());
		Thread.sleep(2000);
		toClickButton(a.getClickCreateMyFreeAccount());
		Thread.sleep(3000);
		
		String s=Configurations.userRoll;
		
		if(s=="Freelancer") 
		{
		Thread.sleep(4000);
		toClickButton(a.getClickTechnologyJob());
		Thread.sleep(4000);
		toClickButton(a.getClickNext());
		Thread.sleep(3000);
		toClickButton(a.getClickFreelancerRecruiter());
		Thread.sleep(3000);
	}
		
		if(s=="JobSeeker") {
			
			toClickButton(a.getClickTechnologyJob());
			Thread.sleep(2000);
			toClickButton(a.getClickNext());
			toClickButton(a.getClickJobSeeker());
		}
		

		if(s=="BenchsalesRecruiter") {
			
			toClickButton(a.getClickTechnologyJob());
			Thread.sleep(2000);
			toClickButton(a.getClickNext());
			Thread.sleep(3000);
			toClickButton(a.getClickBenchSalesRecruiter());
			Thread.sleep(4000);
			toClickButton(a.getClickNextClienttypes());	
			Thread.sleep(2000);
			String c1=Configurations.clientType;			
			if(c1=="Client") {
				
			Thread.sleep(3000);
			toClickButton(a.getClickClient());
			}
			
			else if (c1=="SystemsIntegrator") {
			Thread.sleep(3000);
			toClickButton(a.getClickSystemIntegrator());	
			}
			
			else if (c1=="PrimeVendor"){
			Thread.sleep(3000);
			toClickButton(a.getClickPrimeVendor());	
			}
			
			else if (c1=="StaffingAgency") {
			Thread.sleep(3000);
			toClickButton(a.getClickStaffingAgency());	
			}
			
			else if (c1=="Vendor") {
			Thread.sleep(3000);
			toClickButton(a.getClickVendor());	
			}
			
			else if (c1=="Supplier") {
			Thread.sleep(3000);	
			toClickButton(a.getClickSupplier());
			}}
			
			if(s=="MTA") {
				
				toClickButton(a.getClickTechnologyJob());
				Thread.sleep(2000);
				toClickButton(a.getClickNext());
				scrollDown(a.getClickManagementTalentAcquisition());
				Thread.sleep(2000);
				toClickButton(a.getClickManagementTalentAcquisition());
				scrollUp(a.getClickManagementTalentAcquisition());
				Thread.sleep(2000);
				toClickButton(a.getClickNextClienttypes());			
				String c2=Configurations.clientType;			
				if(c2=="Client") {
				Thread.sleep(3000);
				toClickButton(a.getClickClient());
				Thread.sleep(3000);
				//scrollUp(a.getClickVendor());
				
				
				//Thread.sleep(3000);
				}
				
				else if (c2=="SystemsIntegrator") {
				Thread.sleep(3000);
				toClickButton(a.getClickSystemIntegrator());	
				}
				
				else if (c2=="PrimeVendor"){
				Thread.sleep(3000);
				toClickButton(a.getClickPrimeVendor());	
				}
				
				
				
				else if (c2=="StaffingAgency") {
				Thread.sleep(3000);
				toClickButton(a.getClickStaffingAgency());	
				scrollUp(a.getClickSystemIntegrator());
				}
				
				else if (c2=="Vendor") {
				Thread.sleep(3000);
				toClickButton(a.getClickVendor());	
				scrollUp(a.getClickVendor());
				}
				
				else if (c2=="Supplier") {
				Thread.sleep(3000);	
				toClickButton(a.getClickSupplier());
				scrollUp(a.getClickSupplier());
				}}
			
			if(s=="Recruiter") 
			{
			
				toClickButton(a.getClickFindCandidates());
				toClickButton(a.getClickNext());
				Thread.sleep(3000);
				toClickButton(a.getClickRecruiter());	
				toClickButton(a.getClickNextClienttypes());
				Thread.sleep(3000);
				String c3=Configurations.clientType;
				
				
				if(c3=="Client") {
				Thread.sleep(3000);	
				toClickButton(a.getClickClient());
				}
				
				else if (c3=="SystemsIntegrator") {
				Thread.sleep(3000);	
				toClickButton(a.getClickSystemIntegrator());
				scrollDown(a.getClickSystemIntegrator());
				}
				
				else if (c3=="PrimeVendor") {
				Thread.sleep(3000);
				toClickButton(a.getClickPrimeVendor());
				}
				
				else if (c3=="StaffingAgency") {
				Thread.sleep(3000);
				toClickButton(a.getClickStaffingAgency());	
				}
				
				else if (c3=="Vendor") {
			    Thread.sleep(3000);			
			    toClickButton(a.getClickVendor());
				}}	
		Thread.sleep(3000);
		toClickButton(a.getClickUserSubmit());
	
	}
	
	//CONNECTIONS
	
	@Test(enabled=false)
	private void connections() throws InterruptedException {
		openChrome();
		driver.manage().window().maximize();
		driver.get("http://135.181.42.100/gigsumo/#/login");
		Thread.sleep(3000);
		UserCreationPojo a = new UserCreationPojo();
		ProfileCreationPojo p=new ProfileCreationPojo();
		toFillTextbox(a.getEnterUsername(), "bench@west.com");
		toFillTextbox(a.getEnterPassword(),"Pass@123");
		Thread.sleep(2000);
		toClickButton(a.getClickLoginbtn());
		Thread.sleep(5000);
		toFillTextbox(a.getFillGlobalSearchdata(), "MONI RECRUITER");
		Thread.sleep(6000);
		toClickButton(a.getClickUser());
		Thread.sleep(3000);
		toClickButton(a.getClickUserConnection());
		Thread.sleep(3000);
		toClickButton(a.getClickUserProfile());
		Thread.sleep(3000);
		toClickButton(a.getClickLogout());
		Thread.sleep(3000);
		toFillTextbox(a.getEnterUsername(), "recruiter@west.com");
		toFillTextbox(a.getEnterPassword(),"Pass@123");
		Thread.sleep(3000);
		toClickButton(a.getClickLoginbtn());
		Thread.sleep(5000);
		toClickButton(a.getClickNotification());
		Thread.sleep(3000);
		toClickButton(a.getClickUserAccept());
		Thread.sleep(3000);
		toClickButton(a.getClickUserProfile());
		Thread.sleep(3000);
		toClickButton(a.getClickLogout());
		
	}

	
	//PERSIONAL DETAILS
	
	@Test(enabled =false)
	 private void PersionalDetails() throws InterruptedException, AWTException {
		openChrome();
		driver.manage().window().maximize();
		driver.get("http://135.181.42.100/gigsumo/#/login");
		Thread.sleep(3000);
		UserCreationPojo a = new UserCreationPojo();
		ProfileCreationPojo p=new ProfileCreationPojo();
		toFillTextbox(a.getEnterUsername(), "bench@viv.com");
		toFillTextbox(a.getEnterPassword(),"Pass@123");
		toClickButton(a.getClickLoginbtn());
		Thread.sleep(4000);
		//toClickButton(p.getClickOrgName());
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
		
		
		
		@Test(enabled=false)
		private void ProfileUpdate() throws InterruptedException, AWTException {
			openChrome();
			driver.manage().window().maximize();
			driver.get("http://135.181.42.100/gigsumo/#/login");
			Thread.sleep(3000);
			UserCreationPojo a = new UserCreationPojo();
			ProfileCreationPojo p=new ProfileCreationPojo();
			toFillTextbox(a.getEnterUsername(), "thiru.t@mavens-i.com");
			toFillTextbox(a.getEnterPassword(),"Pass@123");
			toClickButton(a.getClickLoginbtn());
			Thread.sleep(4000);
			//toClickButton(p.getClickOrgName());
			toClickButton(p.getClickCompleteYourProfile());
			Thread.sleep(3000);
			
		//ABOUT YOURSELF
			
	    toClickButton(p.getClickEditAbtYors());
		Thread.sleep(4000);
		toFillTextbox(p.getEnterAboutYourSelf(), "My strengths are I am a self-motivated dedicated and honest person. My current goal is to get a job in a reputed company and my long-term goal is to achieve a good position where I can build my career and help the organization too. My strength is included hard work honesty and adaptability. That's all about me.");
		toClickButton(p.getSubmitaboutyrs());
		//toClickButton(p.getCancelaboutyrs());
		Thread.sleep(4000);
		
    	//WORK EXPERIENCE
		
    	scrollDown(p.getClickEditAbtYors());
		Thread.sleep(3000);
        toClickButton(p.getClickWorkexperience());
		Thread.sleep(2000);
		toFillTextbox(p.getOrganziationName(), "Rss ORG");
		pressEnterKey();
		Thread.sleep(3000);
		toSelectVisibleText(p.getOrganizationType(), " Systems Integrator");
		Thread.sleep(3000);
	    toFillTextbox(p.getTitle(), "Freelance Recruiter ");
		pressEnterKey();
		Thread.sleep(1000);
		toSelectVisibleText(p.getSelectCountry()," United States");
		Thread.sleep(2000);
		toFillTextbox(p.getZipcode(), "15555");
		Thread.sleep(2000);
		toSelectVisibleText(p.getTimeZone(), " America/New_York");
		Thread.sleep(2000);
		toSelectVisibleText(p.getStartYear(), "2022");
		toSelectVisibleText(p.getStartMonth(), "June");
		scrollDown(p.getTimeZone());
		Thread.sleep(3000);
		toClickButton(p.getSubmit());
		//toClickButton(p.getClickCloseX());
		
		//EDUCATION
		
		Thread.sleep(3000);
		scrollDown(p.getClickWorkexperience());
		Thread.sleep(3000);
		toClickButton(p.getClickEducation());
		Thread.sleep(3000);
		toFillTextbox(p.getSchoolName(), "QAs ");
		Thread.sleep(3000);
		toClickButton(p.getClickCurrentlyPursed());
		Thread.sleep(3000);
		toSelectVisibleText(p.getProfileCountry(), " United States ");
		Thread.sleep(3000);
		toFillTextbox(p.getZipcode(), "12345");
		toFillTextbox(p.getDegree(), "BE");
		toFillTextbox(p.getSpeciality(), "Computer Science");
		toSelectVisibleText(p.getStartYear(), "2022 ");
		toSelectVisibleText(p.getStartMonth(), "June ");
		Thread.sleep(3000);
		scrollDown(p.getSubmit());
		toClickButton(p.getSubmit());
		Thread.sleep(3000);
		
		//CERTIFICATIONS	
		
    	scrollDown(p.getClickWorkexperience());
		Thread.sleep(3000);
		//scrollDown(p.getClickEducation());
		//Thread.sleep(3000);
		toClickButton(p.getClickCertifications());
		Thread.sleep(3000);
		toFillTextbox(p.getFillCertificationName(), "JIS");
		Thread.sleep(2000);
		toFillTextbox(p.getFillOrganization(), "VETTRI");
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

		//SOCIAL INFLUENCE
		
		toClickButton(p.getClickSocialInfluence());
		toFillTextbox(p.getFillLinkedin(), "pradeep");
		Thread.sleep(2000);
		toFillTextbox(p.getFillTwitter(), "pradz");
		toFillTextbox(p.getFillfacebook(), "pradeep rajendran");
		Thread.sleep(2000);
		toClickButton(p.getSocialSubmit());
	}
		
		
         //JOB CREATION
		
	@Test(enabled =false)
	private void JobCreation() throws InterruptedException, AWTException{
		
		openChrome();
		driver.manage().window().maximize();
		driver.get("http://135.181.42.100/gigsumo/#/login");
		Thread.sleep(3000);
		UserCreationPojo a = new UserCreationPojo();
		toFillTextbox(a.getEnterUsername(), "shanarec@maven.com");
		toFillTextbox(a.getEnterPassword(), "Pass@123");
		toClickButton(a.getClickLoginbtn());
		Thread.sleep(6000);
		JobCreationPojo j = new JobCreationPojo();
		toClickButton(j.getClickpostCreatJob());	
//		Thread.sleep(3000);
//		toSelectVisibleText(j.getSelectTimeZoneCountry(), " United States");
//		.sleep(2000);
//		toSelectVisibleText(j.getSelecttimeZone(), " America/New_York");
//		Thread.sleep(2000);
//		toClickButton(j.getClickTimeZoneSubmit());
		Thread.sleep(8000);
		toSelectVisibleText(j.getSelectClientType(), " Systems Integrator");
		toFillTextbox(j.getFillClientName(), "Rohith");
		Thread.sleep(3000);
		toSelectVisibleText(j.getSelectJobEngagement(), " Contract to Hire");
		Thread.sleep(3000);
	    toFillTextbox(j.getFillJobTitle(), "Computer Vision Engineer");
		Thread.sleep(4000);
		pressEnterKey();
		Thread.sleep(2000);
		toClickButton(j.getClickJobEffectivefor());
		toFillTextbox(j.getFillJobEffecticefrom(), getCurrentDate());
		Thread.sleep(3000);
		toFillTextbox(j.getFillJobPrimary(), "Business Analyst");
		Thread.sleep(3000);
		pressEnterKey();
		Thread.sleep(2000);
		toClickButton(j.getFillSecondary());
		toFillTextbox(j.getFillSecondary(), "Integration Architectures");
		Thread.sleep(3000);
		pressEnterKey();
		toClickButton(j.getSelectJobCountry());
		toSelectVisibleText(j.getSelectJobCountry(), " United States");
		Thread.sleep(3000);
		toSelectVisibleText(j.getSelectJobState(), "New York ");
		toFillTextbox(j.getEnterJobCity(), "Albany");
		toFillTextbox(j.getFillJobZipcode(), "12345");
		Thread.sleep(2000);
		toSelectVisibleText(j.getSelectJobPayType(), "Monthly");
		toFillTextbox(j.getFillTragetRate(), "3000");
		Thread.sleep(2000);
		toSelectVisibleText(j.getSelectJobDuration(), "4");
		toSelectVisibleText(j.getSelectJobDurationType(), " Days ");
		Thread.sleep(2000);
		toSelectVisibleText(j.getSelectJobExpeFrom(), "5 ");
		toSelectVisibleText(j.getSelectJobExpto(), "10 ");
		Thread.sleep(2000);
		toClickButton(j.getClickJobRemotWrk());
		toClickButton(j.getClickJobRelocateReq());
		toClickButton(j.getClickJobSecurityClear());
		toClickButton(j.getClickJobWorkFrom());
		toFillTextbox(j.getClickJobDescripction(), "All executing threads share this part of the JVM memory area. Class elements like constant pool, class fields, constructor codes, method codes, etc. Method area can be considered as a part of the heap area but stores per-class data only. ");
		Thread.sleep(3000);
		//toClickButton(j.getClickJobClear());
		//toClickButton(j.getClickJobCancel());
		//toClickButton(j.getClickJobDraft());
		toClickButton(j.getClickJobPost());
		//Thread.sleep(3000);
		//toClickButton(j.getClickJobNo());
		//toClickButton(j.getClickJobYes());	
		toClickButton(j.getClickJob());
		Thread.sleep(3000);
		toClickButton(j.getClickThreeDotOne());
		Thread.sleep(4000);
		toClickButton(j.getClickJobView());
		Thread.sleep(3000);
		
	}
	    //JOB HOLD, FILED AND CLOSED
	
	@Test(enabled =false)
	private void JobHoldAndClosed() throws InterruptedException {
		openChrome();
		driver.manage().window().maximize();
		driver.get("http://135.181.42.100/gigsumo/#/login");
		Thread.sleep(3000);
		UserCreationPojo a = new UserCreationPojo();
		toFillTextbox(a.getEnterUsername(), "free@viv.com");
		toFillTextbox(a.getEnterPassword(), "Pass@123");
		toClickButton(a.getClickLoginbtn());
		Thread.sleep(3000);
		JobCreationPojo j = new JobCreationPojo();
		Thread.sleep(3000);
		toClickButton(j.getClickJob());
		Thread.sleep(3000);
		toClickButton(j.getClickActive1());
		toClickButton(j.getClickOnHold());
		Thread.sleep(3000);
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
		Thread.sleep(4000);
		toClickButton(j.getClickJob());
		//toClickButton(j.getClickJobClose());
		//toClickButton(j.getClickJobFilled());


	}
	
	
		
		//JOB CARD EDIT VIEW UPGRADE DOWNGRADE
	
	@Test(enabled =false)
	private void JobCardViewEdit() throws InterruptedException {
		openChrome();
		driver.manage().window().maximize();
		driver.get("http://135.181.42.100/gigsumo/#/login");
		Thread.sleep(3000);
		UserCreationPojo a = new UserCreationPojo();
		toFillTextbox(a.getEnterUsername(), "free@viv.com");
		toFillTextbox(a.getEnterPassword(), "Pass@123");
		toClickButton(a.getClickLoginbtn());
		Thread.sleep(4000);
		JobCreationPojo j = new JobCreationPojo();
		toClickButton(j.getClickJob());	
		Thread.sleep(4000);
		toClickButton(j.getClickThreeDotOne());
		Thread.sleep(4000);
		toClickButton(j.getClickJobEdit());
		Thread.sleep(3000);
		toClickButton(j.getClickUpgradeJob());
		toClickButton(j.getClickUpgradeYes());
		Thread.sleep(4000);
		toClickButton(j.getClickJobView());
		Thread.sleep(4000);
		toClickButton(j.getClickDowngradeJob());

	}
	
    //JOBCARD DETAILS
	 
	@Test(enabled=false)
	 private void JobCardDetails() throws InterruptedException {
		openChrome();
		driver.manage().window().maximize();
		driver.get("http://135.181.42.100/gigsumo/#/login");
		Thread.sleep(3000);
		UserCreationPojo a = new UserCreationPojo();
		toFillTextbox(a.getEnterUsername(), "thiru.t@mavens-i.com");
		toFillTextbox(a.getEnterPassword(), "Pass@123");
		toClickButton(a.getClickLoginbtn());
		Thread.sleep(4000);
		JobCreationPojo j = new JobCreationPojo();
		toClickButton(j.getClickJob());
		Thread.sleep(3000);
		toClickButton(j.getClickJobcard());
		Thread.sleep(3000);
		toClickButton(j.getClickJobApplicants());
		Thread.sleep(4000);
//		toClickButton(j.getClickApplied());
//		Thread.sleep(4000);
//		toClickButton(j.getClickListShortlisted());
//		Thread.sleep(4000);
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
		
		  //CANDIDATE CREATION
		
		  @Test(enabled =false)
		  private void CandidateCreation() throws InterruptedException, AWTException {
			//openEdge();
			openChrome();
			driver.manage().window().maximize();
			driver.get("http://135.181.42.100/gigsumo/#/login");
			Thread.sleep(3000);
			UserCreationPojo a = new UserCreationPojo();
			toFillTextbox(a.getEnterUsername(), "bench@zee.com");
			toFillTextbox(a.getEnterPassword(), "Pass@123");
			toClickButton(a.getClickLoginbtn());
			Thread.sleep(4000);
			CandidateCreationPojo c = new CandidateCreationPojo();
			toClickButton(c.getClickCreatecandidate());
			Thread.sleep(6000);
			toFillTextbox(c.getFirstName(), "ROKER");
			toFillTextbox(c.getLastName(), "san");
			toFillTextbox(c.getPhone(), "6868893534566");
			toFillTextbox(c.getEmail(), "rocler@wbc.com");
			Thread.sleep(2000);
			toFillTextbox(c.getEffectiveFrom(), getCurrentDate());
			toClickButton(c.getEffectivefor());
			toSelectVisibleText(c.getAvalibility(), "  Other");
			toSelectVisibleText(c.getAvilablefor(), " W2 - Contract");
			toFillTextbox(c.getJobTitle(), "Change Management Analyst");
			Thread.sleep(1000);
			pressEnterKey();
			toSelectVisibleText(c.getTotalExperience(), " 3");
			Thread.sleep(2000);
			toSelectVisibleText(c.getCountry(), " United States");
			Thread.sleep(2000);
			toSelectVisibleText(c.getState(), "New York ");
//			toFillTextbox(c.getCity(), "Albany");
//			toFillTextbox(c.getZipcode(), "12345");
			Thread.sleep(2000);
     		toFillTextbox(c.getPrimarySkills(), "Java Deployment Technologies");
			Thread.sleep(1000);
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
			//toClickButton(c.getClear());
			toClickButton(c.getMakeAvilable());
//			Thread.sleep(2000);
//		    toClickButton(c.getClickCreditAlert());

		}
	
}

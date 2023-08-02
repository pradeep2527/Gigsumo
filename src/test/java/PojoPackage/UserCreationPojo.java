package PojoPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import LibGlobalPackage.BaseClass;

public class UserCreationPojo extends BaseClass {

	public UserCreationPojo() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(xpath="(//div[contains(@data-toggle,'tooltip')])[4]")
	private WebElement userstatus;
	
	public WebElement getUserstatus() {
		return userstatus;
	}


	@FindBy(xpath="//input[@formcontrolname='username']")
	private WebElement enterUsername;

	public WebElement getEnterUsername() {
		return enterUsername;
	}
	
	@FindBy(xpath="//input[@formcontrolname='password']")
	private WebElement enterPassword;
	
	public WebElement getEnterPassword() {
		return enterPassword;
	}
	
	@FindBy(xpath="//a[text()='Login']")
	private WebElement clickLoginbtn;

	public WebElement getClickLoginbtn() {
		return clickLoginbtn;
	}
	
	
	@FindBy(xpath="//input[@placeholder='FirstName']")
	private WebElement enterFirstname;

	public WebElement getEnterFirstname() {
		return enterFirstname;
	}
	
	@FindBy(xpath="//input[@placeholder='LastName']")
	private WebElement enterLastName;

	public WebElement getEnterLastName() {
		return enterLastName;
	}
	
	@FindBy(xpath="//input[@placeholder='Email Address']")
	private WebElement enterEmailAddress;

	public WebElement getEnterEmailAddress() {
		return enterEmailAddress;
	}
	
	@FindBy (xpath="//input[@id='flexCheckDefault']")
	private WebElement clickFlexCheck;
	
	public WebElement getClickFlexCheck() {
		return clickFlexCheck;
	}

	@FindBy(xpath="//a[text()= ' Create my free account ']")
	private WebElement clickCreateMyAccount;

	public WebElement getClickCreateMyAccount() {
		return clickCreateMyAccount;
	}
	
	
	@FindBy(xpath="//input[@placeholder='Create New Password']")
	private WebElement enterCreateNewPassword;

	public WebElement getEnterCreateNewPassword() {
		return enterCreateNewPassword;
	}

	@FindBy(xpath="//input[@placeholder='Confirm New Password']")
	private WebElement enterConfirmNewPasword;

	public WebElement getEnterConfirmNewPasword() {
		return enterConfirmNewPasword;
	}
	
	
	@FindBy(xpath="//a[@class='btn cm-btn-2']")
		private WebElement clickCreateMyFreeAccount;

		
	
		public WebElement getClickCreateMyFreeAccount() {
			return clickCreateMyFreeAccount;
		}
		
		//I'm looking for technology jobs
		
	@FindBy(xpath="//label[@for='toTechnoGigs']")
	private WebElement clickTechnologyJob;
	
	public WebElement getClickTechnologyJob() {
		return clickTechnologyJob;
	}	
	
	 @FindBy(xpath="//button[text()='NEXT']")
	 private WebElement clickNext;

	public WebElement getClickNext() {
		return clickNext;
	}
	
	@FindBy(xpath="//label[text()=' Freelance Recruiter ']")
	private WebElement clickFreelancerRecruiter;

	public WebElement getClickFreelancerRecruiter() {
		return clickFreelancerRecruiter;
	}
	
	@FindBy(xpath="//label[text()=' Bench Sales Recruiter ']")
	private WebElement clickBenchSalesRecruiter;

	public WebElement getClickBenchSalesRecruiter() {
		return clickBenchSalesRecruiter;
	}
	
	@FindBy(xpath="//button[@class='nextStep ng-star-inserted']")
	private WebElement ClickNextClienttypes;
	
	public WebElement getClickNextClienttypes() {
		return ClickNextClienttypes;
	}

	@FindBy(xpath="(//button[text()='Submit'])[1]")
	private WebElement clickSubmit;
	
	
	public WebElement getClickSubmit() {
		return clickSubmit;
	}
	
	@FindBy(xpath="(//button[text()='SUBMIT'])[1]")
	private WebElement clickSubmitBtn;

	
	public WebElement getClickSubmitBtn() {
		return clickSubmitBtn;
	}

	@FindBy(xpath="//label[text()=' Job Seeker ']")
	private WebElement clickJobSeeker;

	public WebElement getClickJobSeeker() {
		return clickJobSeeker;
	}
	@FindBy(xpath="//label[text()=' Management - Talent Acquisition ']")
	private WebElement clickManagementTalentAcquisition;

	public WebElement getClickManagementTalentAcquisition() {
		return clickManagementTalentAcquisition;
	}
	
	//I AM lOOKING FOR CANDIDDATES
	
	
	@FindBy(xpath="//label[@for='toFindCandidates']")
	private WebElement clickFindCandidates;

	public WebElement getClickFindCandidates() {
		return clickFindCandidates;
	}
	
	@FindBy(xpath="//label[text()=' Recruiter ']")
	private WebElement clickRecruiter;
	
	public WebElement getClickRecruiter() {
		return clickRecruiter;
	}
	
	@FindBy(xpath="//label[text()=' Freelance Recruiter ']")
	private WebElement clickFreelancer;
	

	public WebElement getClickFreelancer() {
		return clickFreelancer;
	}
	
	@FindBy(xpath="//label[@for='MANAGEMENT_TALENT_ACQUISITION']")
	private WebElement clickMTA;

	public WebElement getClickMTA() {
		return clickMTA;
	}


	@FindBy(xpath="//label[text()=' Client ']")
	private WebElement clickClient;

	public WebElement getClickClient() {
		return clickClient;
	}
	
	@FindBy(xpath="//label[text()=' Systems Integrator ']")
	private WebElement clickSystemIntegrator;

	public WebElement getClickSystemIntegrator() {
		return clickSystemIntegrator;
	}
	
	@FindBy(xpath="//label[text()=' Prime or Tier 1 Vendor ']")
	private WebElement clickPrimeVendor;

	public WebElement getClickPrimeVendor() {
		return clickPrimeVendor;
	}
	
	@FindBy(xpath="//label[text()=' Staffing Agency ']")
	private WebElement clickStaffingAgency;

	public WebElement getClickStaffingAgency() {
		return clickStaffingAgency;
	}
	
	@FindBy(xpath="//label[text()=' Vendor ']")
	private WebElement clickVendor;

	public WebElement getClickVendor() {
		return clickVendor;
	}
	
	@FindBy(xpath="//label[text()=' Supplier ']")
	private WebElement clickSupplier;

	public WebElement getClickSupplier() {
		return clickSupplier;
	}
	
	@FindBy(xpath="//button[text()='Submit']")
	private WebElement ClickUserSubmit;
	
	public WebElement getClickUserSubmit() {
		return ClickUserSubmit;
	}

	@FindBy(xpath="(//img[@class='logo-size_define'])[1]")
	private WebElement ClickPlusEycon;

	public WebElement getClickPlusEycon() {
		return ClickPlusEycon;
	}
	
	@FindBy(xpath="(//button[@role='menuitem'])[1]")
	private WebElement ClickCrtjobEycon;

	public WebElement getClickCrtjobEycon() {
		return ClickCrtjobEycon;
	}
	
	//CONNECTIONS
	
	

	@FindBy(xpath="//input[@formcontrolname='serachData']")
	private WebElement FillGlobalSearchdata;

	public WebElement getFillGlobalSearchdata() {
		return FillGlobalSearchdata;
	}
	
	@FindBy(xpath="//span[@class='d']")
	private WebElement ClickUser;

	public WebElement getClickUser() {
		return ClickUser;
	}
	
	@FindBy(xpath="(//h6[text()='View All >>>'])[1]")
	private WebElement ClickGlbViewAll;

	public WebElement getClickGlbViewAll() {
		return ClickGlbViewAll;
	}
	
	

	@FindBy(xpath="(//button[text()=' Connect '])[1]")
	private WebElement ClickUserConnection;

	public WebElement getClickUserConnection() {
		return ClickUserConnection;
	}
	
	@FindBy(xpath="//button[text()='Connect ']")
	private WebElement ClickConnect;
	
	public WebElement getClickConnect() {
		return ClickConnect;
	}

	@FindBy(xpath="(//img[@class='img-circle ng-star-inserted'])[1]")
	private WebElement ClickUserProfile;
	

	public WebElement getClickUserProfile() {
		return ClickUserProfile;
	}

	@FindBy(xpath="//a[text()='LogOut']")
	private WebElement ClickLogout;

	public WebElement getClickLogout() {
		return ClickLogout;
	}
	

	@FindBy(xpath="(//a[@class='headertext'])[5]")
	private WebElement ClickNotification;
	
	public WebElement getClickNotification() {
		return ClickNotification;
	}
	
	@FindBy(xpath="(//button[text()='Accept '])[1]")
	private WebElement ClickUserAccept;

	public WebElement getClickUserAccept() {
		return ClickUserAccept;
	}
	
	@FindBy(xpath="//span[text()=' Connection ']")
	private WebElement ClickConnections;

	public WebElement getClickConnections() {
		return ClickConnections;
	}
	
	@FindBy(xpath=" (//a[@class='headertext'])[1]")
	private WebElement ClickHome;

	public WebElement getClickHome() {
		return ClickHome;
	}



	

	

}

package PojoPackage;

import javax.management.loading.PrivateClassLoader;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import LibGlobalPackage.BaseClass;



public class ProfileCreationPojo extends BaseClass {
		
	
	public ProfileCreationPojo() {
		
		PageFactory.initElements(driver, this);
	}
	  
	@FindBy(xpath="//button[text()=' Complete Your Profile ']")
	private WebElement clickCompleteYourProfile;
	
	public WebElement getClickCompleteYourProfile() {
		return clickCompleteYourProfile;
	}
	
	@FindBy(xpath="//div[text()=' Organization is missing in profile ']")
	private WebElement clickOrgName;
	
	public WebElement getClickOrgName() {
		return clickOrgName;
	}
	
	//PERSIONAL DETAILS
	
	@FindBy(xpath="(//button[@class='edit-pencil'])[1]")
	private WebElement ClickpersonalDet;

	public WebElement getClickpersonalDet() {
		return ClickpersonalDet;
	}              
	
	@FindBy(xpath="//input[@formcontrolname='phoneNo']")
	private WebElement fillPN;

	public WebElement getFillPN() {
		return fillPN;
	}

	@FindBy(xpath="//select[@formcontrolname='country']")
	private WebElement SelectCtry;

	public WebElement getSelectCtry() {
		return SelectCtry;
	}
	
	@FindBy(xpath="//input[@formcontrolname='zipcode']")
	private WebElement FillZipCd;

	public WebElement getFillZipCd() {
		return FillZipCd;
	}
	
	@FindBy(xpath="(//button[text()=' Submit '])[2]")
	private WebElement ClickSub;

	public WebElement getClickSub() {
		return ClickSub;
	}
	
	//ABOUT YOURSELF
	
	@FindBy(xpath="(//button[@class='edit-pencil'])[2]")
	private WebElement clickEditAbtYors;


	public WebElement getClickEditAbtYors() {
		return clickEditAbtYors;
	}

	@FindBy(xpath="//div[@role='textbox']")
	private WebElement enterAboutYourSelf;

	public WebElement getEnterAboutYourSelf() {
		return enterAboutYourSelf;
	}
	
	@FindBy(xpath="//button[text()=' Submit ']")
	private WebElement Submitaboutyrs;
	
	public WebElement getSubmitaboutyrs() {
		return Submitaboutyrs;
	}
	
	@FindBy(xpath="//button[text()=' Cancel ']")
	private WebElement Cancelaboutyrs;

	
	public WebElement getCancelaboutyrs() {
		return Cancelaboutyrs;
	}
	
	//PROFILE
	
	@FindBy(xpath="//div[@class='ty']")
	private WebElement ClickProf;

	public WebElement getClickProf() {
		return ClickProf;
	}
	
	//ABOUT YOURSELF
	
//	@FindBy(xpath="//div[@title='Edit about yourself']")
//	private WebElement ClickAbutyrs;
//
//	public WebElement getClickAbutyrs() {
//		return ClickAbutyrs;
//	}
//	
//	@FindBy(xpath="//div[@contenteditable='true']")
//	private WebElement FillAbturSelf;
//
//	public WebElement getFillAbturfelf() {
//		return FillAbturSelf;
//	}
//	
//	@FindBy(xpath="//button[text()=' Submit ']")
//	private WebElement ClickSmit;
//
//	public WebElement getClickSmit() {
//		return ClickSmit;
//	}
//	
	
	
	//WORK EXPERIENCE
	
	@FindBy(xpath="(//i[@class='fa fa-plus '])[1]")
	private WebElement ClickWorkexperience;

	public WebElement getClickWorkexperience() {
		return ClickWorkexperience;
	}


	@FindBy(xpath="//input[@placeholder='Organization Name']")
	private WebElement OrganziationName;

	public WebElement getOrganziationName() {
		return OrganziationName;
	}

	@FindBy(xpath="//select[@formcontrolname='clientType']")
	private WebElement OrganizationType;

	public WebElement getOrganizationType() {
		return OrganizationType;
	}
	
	@FindBy(xpath="(//input[@role='combobox'])[3]")
	private WebElement Title;

	public WebElement getTitle() {
		return Title;
	}
	
	@FindBy(xpath="//select[@formcontrolname='country']")
	private WebElement profileCountry;

	public WebElement getProfileCountry() {
		return profileCountry;
	}
	
	@FindBy(xpath="//select[@formcontrolname='timeZone']")
	private WebElement TimeZone;

	public WebElement getTimeZone() {
		return TimeZone;
	}
	
	@FindBy(xpath="//select[@formcontrolname='startMonth']")
	private WebElement StartMonth;

	public WebElement getStartMonth() {
		return StartMonth;
	}

	@FindBy(xpath="//select[@formcontrolname='startYear']")
	private WebElement startYear;

	public WebElement getStartYear() {
		return startYear;
	}
	 @FindBy(xpath="(//button[text()=' Submit '])[2]")
	 private WebElement Submit;

	public WebElement getSubmit() {
		return Submit;
	}
	
	@FindBy(xpath="(//span[text()='×'])[2]")
	private WebElement ClickCloseX;

	public WebElement getClickCloseX() {
		return ClickCloseX;
	}
	
	@FindBy(xpath="//button[@class='swal2-confirm btn btn-success']")
	private WebElement Clickwrkexpok;
	
	public WebElement getClickwrkexpok() {
		return Clickwrkexpok;
	}
	//EDUCATION
	
	@FindBy(xpath="(//i[@class='fa fa-plus '])[2]")
	private WebElement ClickEducation;

	public WebElement getClickEducation() {
		return ClickEducation;
	}
	
	@FindBy(xpath="//input[@placeholder='School Name']")
    private WebElement SchoolName;

	public WebElement getSchoolName() {
		return SchoolName;
	}
	
	@FindBy(xpath="//span[@class='checkmark']")
	private WebElement ClickCurrentlyPursed;

	public WebElement getClickCurrentlyPursed() {
		return ClickCurrentlyPursed;
	}
	
	@FindBy(xpath="//select[@formcontrolname='country']")
	private WebElement SelectCountry;

	public WebElement getSelectCountry() {
		return SelectCountry;
	}
	
	@FindBy(xpath="//input[@placeholder='Zipcode']")
	private WebElement Zipcode;

	public WebElement getZipcode() {
		return Zipcode;
	}
	
	@FindBy(xpath="//input[@placeholder='Degree']")
	private WebElement Degree;

	public WebElement getDegree() {
		return Degree;
	}
	
	@FindBy(xpath="//input[@placeholder='Speciality']")
	private WebElement Speciality;

	public WebElement getSpeciality() {
		return Speciality;
	}
	
	@FindBy(xpath="(//button[text()=' Submit '])[2]")
	private WebElement EdSubmit;

	public WebElement getEdSubmit() {
		return EdSubmit;
	}
	
	//CERTIFICATIONS
	
	@FindBy(xpath="(//i[@class='fa fa-plus '])[3]")
	private WebElement ClickCertifications;

	public WebElement getClickCertifications() {
		return ClickCertifications;
	}
	
	@FindBy(xpath="//input[@formcontrolname='certificationName']")
	private WebElement FillCertificationName;

	public WebElement getFillCertificationName() {
		return FillCertificationName;
	}
	
	@FindBy(xpath="//input[@formcontrolname='certificateOrganization']")
	private WebElement FillOrganization;

	public WebElement getFillOrganization() {
		return FillOrganization;
	}
	
	@FindBy(xpath="//input[@formcontrolname='certificateLicenseNo']")
	private WebElement fillLincenseNo;

	public WebElement getFillLincenseNo() {
		return fillLincenseNo;
	}
	 @FindBy(xpath="//select[@formcontrolname='startYear']")
	 private WebElement selectIssueYear;

	public WebElement getSelectIssueYear() {
		return selectIssueYear;
	}
	
	@FindBy(xpath="//select[@formcontrolname='startMonth']")
	private WebElement SelectIssueMonth;

	public WebElement getSelectIssueMonth() {
		return SelectIssueMonth;
	}
	 @FindBy(xpath="//select[@formcontrolname='endYear']")
	 private WebElement SelectEndYear;

	public WebElement getSelectEndYear() {
		return SelectEndYear;
	}
	 
	@FindBy(xpath="//select[@formcontrolname='endMonth']")
	private WebElement selectEndMonth;

	public WebElement getSelectEndMonth() {
		return selectEndMonth;
	}
	
	@FindBy(xpath="(//button[text()=' Submit '])[2]")
	private WebElement ClickCertificateSubmit;

	public WebElement getClickCertificateSubmit() {
		return ClickCertificateSubmit;
	}

	//SOCIAL INFLUENCE
	
	@FindBy(xpath="(//i[@class='fas fa-pencil-alt '])[6]")
	private WebElement ClickSocialInfluence;

	public WebElement getClickSocialInfluence() {
		return ClickSocialInfluence;
	}
	
	@FindBy(xpath="//input[@formcontrolname='linkedin']")
	private WebElement FillLinkedin;

	public WebElement getFillLinkedin() {
		return FillLinkedin;
	}
	
	@FindBy(xpath="//input[@formcontrolname='twitter']")
	private WebElement FillTwitter;
	
	public WebElement getFillTwitter() {
		return FillTwitter;
	}

	
	
	@FindBy(xpath="//input[@formcontrolname='facebook']")
	private WebElement Fillfacebook;

	public WebElement getFillfacebook() {
		return Fillfacebook;
	}
	

	@FindBy(xpath="(//button[text()=' Submit '])[2]")
	private WebElement SocialSubmit;
	
	public WebElement getSocialSubmit() {
		return SocialSubmit;
	}
	
	
	

}

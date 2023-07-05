package PojoPackage;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import LibGlobalPackage.BaseClass;

public class JobCreationPojo extends BaseClass {
	
	public JobCreationPojo() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//select[@formcontrolname='timeZoneCountry']")
	private WebElement SelectTimeZoneCountry;
	
	public WebElement getSelectTimeZoneCountry() {
		return SelectTimeZoneCountry;
	}
	
	@FindBy(xpath="//select[@formcontrolname='timeZone']")
	private WebElement SelecttimeZone;
	
	public WebElement getSelecttimeZone() {
		return SelecttimeZone;
	}
	
	@FindBy(xpath="//button[text()=' Submit ']")
	private WebElement ClickTimeZoneSubmit;

	public WebElement getClickTimeZoneSubmit() {
		return ClickTimeZoneSubmit;
	}

	@FindBy(xpath="//div[@title='Create Job']")
	private WebElement ClickpostCreatJob;


	public WebElement getClickpostCreatJob() {
		return ClickpostCreatJob;
	}


	@FindBy(xpath="//select[@formcontrolname='clientType']")
	private WebElement SelectClientType;


	public WebElement getSelectClientType() {
		return SelectClientType;
	}
	
	@FindBy(xpath="//input[@formcontrolname='clientName']")
	private WebElement FillClientName;


	public WebElement getFillClientName() {
		return FillClientName;
	}
	
	@FindBy(xpath="//select[@formcontrolname='jobClassification']")
	private WebElement SelectJobEngagement;

	public WebElement getSelectJobEngagement() {
		return SelectJobEngagement;
	}


	@FindBy(xpath="(//input[@role='combobox'])[3]")
	private WebElement FillJobTitle;

	public WebElement getFillJobTitle() {
		return FillJobTitle;
	}


	@FindBy(xpath="//input[@placeholder='Effective From ']")
	private WebElement ClickJobEffectiveFrom;

	
	public WebElement getClickJobEffectivefor() {
		return ClickJobEffectiveFrom;
	}

	@FindBy(xpath="//input[@id='7']")
	private WebElement ClickJob7days;
	
	public WebElement getClickJob7days() {
		return ClickJob7days;
	}

	@FindBy(xpath="//input[@id='Custom']")
	private WebElement ClickJobCustom;


	public WebElement getClickJobCustom() {
		return ClickJobCustom;
	}
	
	@FindBy(xpath="//input[@id='15']")
	private WebElement ClickJob15days;

	public WebElement getClickJob15days() {
		return ClickJob15days;
	}
	
	@FindBy(xpath="//input[@id='30']")
	private WebElement ClickJob30days;

	public WebElement getClickJob30days() {
		return ClickJob30days;
	}

	@FindBy(xpath="//input[@formcontrolname='effectiveDate']")
	private WebElement FillJobEffecticefrom;


	public WebElement getFillJobEffecticefrom() {
		return FillJobEffecticefrom;
	}
	
	@FindBy(xpath="//input[@formcontrolname='effectiveUntil']")
	private WebElement FillJobEffectiveUntil;


	public WebElement getFillJobEffectiveUntil() {
		return FillJobEffectiveUntil;
	}

	@FindBy(xpath="(//input[@role='combobox'])[4]")
	private WebElement FillJobPrimary;

	public WebElement getFillJobPrimary() {
		return FillJobPrimary;
	}


	@FindBy(xpath="(//input[@role='combobox'])[5]")
	private WebElement FillSecondary;

	public WebElement getFillSecondary() {
		return FillSecondary;
	}


	@FindBy(xpath="//select[@formcontrolname='country']")
	private WebElement SelectJobCountry;


	public WebElement getSelectJobCountry() {
		return SelectJobCountry;
	}
	
	@FindBy(xpath="//select[@formcontrolname='state']")
	private WebElement SelectJobState;


	public WebElement getSelectJobState() {
		return SelectJobState;
	}
	
	@FindBy(xpath="//input[@formcontrolname='city']")
	private WebElement EnterJobCity;


	public WebElement getEnterJobCity() {
		return EnterJobCity;
	}
	
	@FindBy(xpath="//input[@formcontrolname='zipCode']")
	private WebElement fillJobZipcode;


	public WebElement getFillJobZipcode() {
		return fillJobZipcode;
	}
	
	@FindBy(xpath="//select[@formcontrolname='payType']")
	private WebElement SelectJobPayType;

	
	public WebElement getSelectJobPayType() {
		return SelectJobPayType;
	}


	@FindBy(xpath="//input[@id='targetRate']")
	private WebElement FillJobTragetRate;


	public WebElement getFillTragetRate() {
		return FillJobTragetRate;
	}
	
	@FindBy(xpath="//select[@formcontrolname='duration']")
	private WebElement SelectJobDuration;


	public WebElement getSelectJobDuration() {
		return SelectJobDuration;
	}
	
	@FindBy(xpath="//select[@formcontrolname='durationType']")
	private WebElement SelectJobDurationType;

	public WebElement getSelectJobDurationType() {
		return SelectJobDurationType;
	}


	@FindBy(xpath="//select[@formcontrolname='experienceFrom']")
	private WebElement SelectJobExpeFrom;


	public WebElement getSelectJobExpeFrom() {
		return SelectJobExpeFrom;
	}
	@FindBy(xpath="//select[@formcontrolname='experienceTo']")
	private WebElement SelectJobExpto;


	public WebElement getSelectJobExpto() {
		return SelectJobExpto;
	}
	
	@FindBy(xpath="(//label[text()=' Yes '])[1]")
	private WebElement ClickJobRemotWrk;


	public WebElement getClickJobRemotWrk() {
		return ClickJobRemotWrk;
	}
	
	@FindBy(xpath="(//label[text()=' Yes '])[2]")	
	private WebElement ClickJobRelocateReq;


	public WebElement getClickJobRelocateReq() {
		return ClickJobRelocateReq;
	}
	
	@FindBy(xpath="(//label[text()=' Yes '])[3]")
	private WebElement ClickJobSecurityClear;


	public WebElement getClickJobSecurityClear() {
		return ClickJobSecurityClear;
	}
	
	@FindBy(xpath="(//label[text()=' Yes '])[4]")
	private WebElement ClickJobWorkFrom;


	public WebElement getClickJobWorkFrom() {
		return ClickJobWorkFrom;
	}
	
	@FindBy(xpath="//div[@role='textbox']")
	private WebElement ClickJobDescripction;


	public WebElement getClickJobDescripction() {
		return ClickJobDescripction;
	}
	
	@FindBy(xpath="(//button[text()='Clear'])")
	private WebElement ClickJobClear;


	public WebElement getClickJobClear() {
		return ClickJobClear;
	}
	
	@FindBy(xpath="//button[text()='Save as Draft']")
	private WebElement ClickJobDraft;


	public WebElement getClickJobDraft() {
		return ClickJobDraft;
	}
	
	
	@FindBy(xpath="//button[text()='Cancel']")
	private WebElement ClickJobCancel;


	public WebElement getClickJobCancel() {
		return ClickJobCancel;
	}
	
	@FindBy(xpath="//button[text()='Post Job']")
	private WebElement ClickJobPost;


	public WebElement getClickJobPost() {
		return ClickJobPost;
	}
	
	@FindBy(xpath="(//button[text()='No'])[1]")
	private WebElement ClickJobNo;

	public WebElement getClickJobNo() {
		return ClickJobNo;
	}
	
	@FindBy(xpath="//button[text()='Yes']")
	private WebElement clickJobYes;


	public WebElement getClickJobYes() {
		return clickJobYes;
	}
	
	
	//JOB CARD VIEW, EDIT, UPGRADE, DOWNGRADE
	
	@FindBy(xpath="(//a[@class='headertext'])[2]")
	private WebElement ClickJob;
	
	public WebElement getClickJob() {
		return ClickJob;
	}
	
	@FindBy(xpath="(//img[@class='actionIconDot'])[1]")
	private WebElement ClickThreeDotOne;

	public WebElement getClickThreeDotOne() {
		return ClickThreeDotOne;
	}

	@FindBy(xpath="(//li[@role='menuitem'])[1]")
	private WebElement ClickJobView;
	

	public WebElement getClickJobView() {
		return ClickJobView;
	}

	@FindBy(xpath="//div[@class='edit-candidate-job-pencil ng-star-inserted']")
	private WebElement ClickJobEdit;


	public WebElement getClickJobEdit() {
		return ClickJobEdit;
	}
	
	@FindBy(xpath="(//li[@role='menuitem'])[3]")
	private WebElement ClickUpgradeJob;


	public WebElement getClickUpgradeJob() {
		return ClickUpgradeJob;
	}
	
	@FindBy(xpath="//button[text()='Update']")
	private WebElement ClickUpdateJOb;
	
	public WebElement getClickUpdateJOb() {
		return ClickUpdateJOb;
	}

	@FindBy(xpath="//button[@class='swal2-confirm btn btn-success']")
	private WebElement ClickUpgradeYes;


	public WebElement getClickUpgradeYes() {
		return ClickUpgradeYes;
	}
	
	@FindBy(xpath="//i[@class='fa fa-arrow-circle-o-down']")
	private WebElement ClickDowngradeJob;


	public WebElement getClickDowngradeJob() {
		return ClickDowngradeJob;
	}
	
	@FindBy(xpath="(//button[text()=' Active '])[1]")
	private WebElement ClickActive1;


	public WebElement getClickActive1() {
		return ClickActive1;
	}
	
	@FindBy(xpath="//a[@id='ON HOLD']")
	private WebElement ClickOnHold;


	public WebElement getClickOnHold() {
		return ClickOnHold;
	}
	@FindBy(xpath="(//div[@class='flexs ng-star-inserted'])[3]")
	private WebElement ClickJobStaus;


	public WebElement getClickJobStaus() {
		return ClickJobStaus;
	}
	
	@FindBy(xpath="(//span[@class='checkmark'])[4]")
	private WebElement ClickJFilterStatusOnHold;

	public WebElement getClickJFilterStatusOnHold() {
		return ClickJFilterStatusOnHold;
	}


	@FindBy(xpath="(//button[@data-toggle='dropdown'])[1]")
	private WebElement ClickStatuOnhold;

	
	public WebElement getClickStatuOnhold() {
		return ClickStatuOnhold;
	}


	@FindBy(xpath="//a[@id='ACTIVE']")
	private WebElement ClickStatusActive;


	public WebElement getClickStatusActive() {
		return ClickStatusActive;
	}
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement ClickFormStatusActive;


	public WebElement getClickFormStatusActive() {
		return ClickFormStatusActive;
	}

	@FindBy(xpath="//a[@id='CLOSED']")
	private WebElement ClickJobClose;


	public WebElement getClickJobClose() {
		return ClickJobClose;
	}
	
	@FindBy(xpath="(//span[@class='checkmark'])[6]")
	private WebElement ClickStatusClose;
	
	public WebElement getClickStatusClose() {
		return ClickStatusClose;
	}

	@FindBy(xpath="//a[@id='FILLED']")
	private WebElement ClickJobFilled;

	public WebElement getClickJobFilled() {
		return ClickJobFilled;
	}
	
	@FindBy(xpath="(//span[@class='checkmark'])[5]")
	private WebElement ClickStatusFilled;
	
	public WebElement getClickStatusFilled() {
		return ClickStatusFilled;
	}

	@FindBy(xpath="//a[@id='INACTIVE']")
	private WebElement ClickJobInactive;


	public WebElement getClickJobInactive() {
		return ClickJobInactive;
	}
	
	@FindBy(xpath="(//span[@class='checkmark'])[7]")
	private WebElement ClickFilterJobInactive;


	public WebElement getClickFilterJobInactive() {
		return ClickFilterJobInactive;
	}
	
	@FindBy(xpath="(//button[@data-toggle='dropdown'])[1]")
	private WebElement ClickStatusInactive;


	public WebElement getClickStatusInactive() {
		return ClickStatusInactive;
	}
	
	
	//JOB CARD DETAILS
	
	

	@FindBy(xpath="(//div[@class='panel-body pad-cus p-mb-6 hover-border ng-star-inserted'])[1]")
	private WebElement ClickJobcard;


	public WebElement getClickJobcard() {
		return ClickJobcard;
	}
	
	@FindBy(xpath="//a[text()=' Job Applicants ']")
	private WebElement ClickJobApplicants;


	public WebElement getClickJobApplicants() {
		return ClickJobApplicants;
	}
	
	@FindBy(xpath="//a[text()=' Candidates Invited ']")
	private WebElement clickCandidatesInvited;


	public WebElement getClickCandidatesInvited() {
		return clickCandidatesInvited;
	}
	
	@FindBy(xpath="//a[text()=' Company ']")
	private WebElement ClickCompany;


	public WebElement getClickCompany() {
		return ClickCompany;
	}
	
	@FindBy(xpath="//a[text()=' People Viewed ']")
	private WebElement ClickPeopleViewed;


	public WebElement getClickPeopleViewed() {
		return ClickPeopleViewed;
	}
	
	@FindBy(xpath="//a[text()=' People Liked ']")
	private WebElement ClickPeopleLiked;


	public WebElement getClickPeopleLiked() {
		return ClickPeopleLiked;
	}

	
	
	//JOB APPLICANTS
	
	@FindBy(xpath="(//span[text()=' Applied '])[1]")
	private WebElement ClickApplied;


	public WebElement getClickApplied() {
		return ClickApplied;
	}
	
	@FindBy(xpath="(//a[@id='SHORTLISTED'])[1]")
	private WebElement ClickListShortlisted;


	public WebElement getClickListShortlisted() {
		return ClickListShortlisted;
	}


	@FindBy(xpath="(//span[text()=' Shortlisted '])[1]")
	private WebElement ClickShortlisted;


	public WebElement getClickShortlisted() {
		return ClickShortlisted;
	}
	
	@FindBy(xpath="(//a[@id='REJECTED'])[1]")
	private WebElement ClickListRejected;


	public WebElement getClickListRedjected() {
		return ClickListRejected;
	}
	
	@FindBy(xpath="(//span[text()=' Rejected '])[1]")
	private WebElement ClickRejected;


	public WebElement getClickRejected() {
		return ClickRejected;
	}
	
	@FindBy(xpath="(//a[@id='INTERVIEW SCHEDULED'])[1]")
	private WebElement ClickListInterviewScheduled;


	public WebElement getClickListInterviewScheduled() {
		return ClickListInterviewScheduled;
	}
	
	@FindBy(xpath="(//span[text()=' Interview Scheduled '])[1]")
	private WebElement clickInterivewScheduled;

	
	public WebElement getClickInterivewScheduled() {
		return clickInterivewScheduled;
	}

	@FindBy(xpath="(//a[@id='INTERVIEW REJECTED'])[1]")
	private WebElement ClickListInterviewRejected;


	public WebElement getClickListInterviewRejected() {
		return ClickListInterviewRejected;
	}
	
	@FindBy(xpath="(//span[text()=' Interview Rejected '])[1]")
	private WebElement ClickInterviewRejected;


	public WebElement getClickInterviewRejected() {
		return ClickInterviewRejected;
	}
	
	@FindBy(xpath="(//a[@id='SELECTED'])[1]")
	private WebElement ClickListSelected;


	public WebElement getClickListSelected() {
		return ClickListSelected;
	}
	
	@FindBy(xpath="(//span[text()=' Selected '])[1]")
	private WebElement ClickSelected;


	public WebElement getClickSelected() {
		return ClickSelected;
	}
	
	@FindBy(xpath="(//a[@id='OFFERED'])[1]")
	private WebElement ClickListOffered;


	public WebElement getClickListOffered() {
		return ClickListOffered;
	}
	
	@FindBy(xpath="(//span[text()=' Offered '])[1]")
	private WebElement ClickOffered;


	public WebElement getClickOffered() {
		return ClickOffered;
	}
	
	@FindBy(xpath="(//a[@id='PREONBOARDED'])[1]")
	private WebElement ClickListPreonboarded;


	public WebElement getClickListPreonboarded() {
		return ClickListPreonboarded;
	}
	
	@FindBy(xpath="(//span[text()=' Preonboarded '])[1]")
	private WebElement ClickpreOnboared;


	public WebElement getClickpreOnboared() {
		return ClickpreOnboared;
	}
	
	@FindBy(xpath="(//a[@id='ONBOARDED'])[1]")
	private WebElement ClickListOnboarded;


	public WebElement getClickListOnboarded() {
		return ClickListOnboarded;
	}
	
	@FindBy(xpath="(//span[text()=' Onboarded '])[1]")
	private WebElement ClickOnboarded;


	public WebElement getClickOnboarded() {
		return ClickOnboarded;
	}

	@FindBy(xpath="(//a[@id='OFFER WITHDRAWN'])[1]")
	private WebElement ClickListOfferWithdrawn;


	public WebElement getClickListOfferWithdrawn() {
		return ClickListOfferWithdrawn;
	}
	
	@FindBy(xpath="(//span[text()=' Offer Withdrawn '])[1]")
	private WebElement ClickOfferWithdrawn;


	public WebElement getClickOfferWithdrawn() {
		return ClickOfferWithdrawn;
	}
	
	@FindBy(xpath="(//a[@id='OFFER DECLINED'])[1]")
	private WebElement clickListOfferDeclined;


	public WebElement getClickListOfferDeclined() {
		return clickListOfferDeclined;
	}
	
	
}
	






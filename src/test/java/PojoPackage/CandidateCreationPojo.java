package PojoPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import LibGlobalPackage.BaseClass;

public class CandidateCreationPojo extends BaseClass {
	
	public CandidateCreationPojo() {
		PageFactory.initElements(driver, this);
	}
	  @FindBy(xpath="//div[@title='Create Candidates']")
	  private WebElement ClickCreatecandidate;
	  
	public WebElement getClickCreatecandidate() {
		return ClickCreatecandidate;
	}
	  
			@FindBy(xpath="//input[@id='firstName']")
			private WebElement FirstName;
			public WebElement getFirstName() {
				return FirstName;
			}

			@FindBy(xpath="//input[@id='lastName']")
		    private WebElement LastName;
			public WebElement getLastName() {
				return LastName;
			}

			@FindBy(xpath="//input[@id='phone']")
			private WebElement Phone;
			public WebElement getPhone() {
				return Phone;
			}
		
			@FindBy(xpath="//input[@id='email']")
			private WebElement Email;
			public WebElement getEmail() {
				return Email;
			}
			
			@FindBy(xpath="//input[@formcontrolname='effectiveDate']")
			private WebElement EffectiveFrom;
			
			public WebElement getEffectiveFrom() {
				return EffectiveFrom;
			}
			
			
			@FindBy(xpath="//input[@id='7']")
			private WebElement Effectivefor;
			
			public WebElement getEffectivefor() {
				return Effectivefor;
			}	
			
			@FindBy(xpath="//select[@formcontrolname='availableIn']")
			private WebElement Avalibility;
			
			public WebElement getAvalibility() {
				return Avalibility;
			}
			
			@FindBy(xpath="//select[@formcontrolname='engagementType']")
			private WebElement Avilablefor;
			
			public WebElement getAvilablefor() {
				return Avilablefor;
			}
			
			@FindBy(xpath="(//input[@role='combobox'])[2]")
			private WebElement JobTitle;
			
			public WebElement getJobTitle() {
				return JobTitle;
			}
			
			@FindBy(xpath="//select[@formcontrolname='totalExperience']")
			private WebElement TotalExperience;
			
			public WebElement getTotalExperience() {
				return TotalExperience;
			}
			
			@FindBy(xpath="//select[@formcontrolname='country']")
			private WebElement Country;
			public WebElement getCountry() {
				return Country;
				
			}
			@FindBy(xpath="//select[@formcontrolname='state']")
			private WebElement State;
			public WebElement getState() {
				return State;
			}
			
			@FindBy(xpath="//input[@formcontrolname='city']")
			private WebElement city;
			public WebElement getCity() {
				return city;
			}
			
			@FindBy(xpath="//input[@formcontrolname='zipCode']")
			private WebElement Zipcode;

			public WebElement getZipcode() {
				return Zipcode;
			}
			
			@FindBy(xpath="(//input[@role='combobox'])[3]")
			private WebElement PrimarySkills;

			public WebElement getPrimarySkills() {
				return PrimarySkills;
			}
			
			@FindBy(xpath="(//input[@role='combobox'])[4]")
			private WebElement SecondarySkills;

			public WebElement getSecondarySkills() {
				return SecondarySkills;
			}
			
			@FindBy(xpath="//select[@formcontrolname='workAuthorization']")
			private WebElement WorkAuthorization;

			public WebElement getWorkAuthorization() {
				return WorkAuthorization;
			}
			
			@FindBy(xpath="//select[@formcontrolname='payType']")
			private WebElement PayType;

			public WebElement getPayType() {
				return PayType;
			}
			
			@FindBy(xpath="//input[@formcontrolname='targetRate']")
			private WebElement TargetRate;

			public WebElement getTargetRate() {
				return TargetRate;
			}
			
			@FindBy(xpath="(//label[text()=' Yes '])[1]")
			private WebElement RemoteWork;

			public WebElement getRemoteWork() {
				return RemoteWork;
			}
			
			@FindBy(xpath="(//label[text()=' Yes '])[2]")
			private WebElement OpenToRelocate;

			public WebElement getOpenToRelocate() {
				return OpenToRelocate;
			}
			
			@FindBy(xpath="(//label[text()=' Yes '])[3]")
			private WebElement SecurityClearance;

			public WebElement getSecurityClearance() {
				return SecurityClearance;
			}
			
			@FindBy(xpath="(//label[text()=' Yes '])[4]")
			private WebElement WorkFromHome;

			public WebElement getWorkFromHome() {
				return WorkFromHome;
			}
			@FindBy(xpath="//div[@role='textbox']")
			private WebElement ResumeSummary;

			public WebElement getResumeSummary() {
				return ResumeSummary;
			}
			
			@FindBy(xpath="//button[text()=' Clear ']")
			private WebElement Clear;

			public WebElement getClear() {
				return Clear;
			}
			
			@FindBy(xpath="//button[text()='Cancel']")
			private WebElement Cancel;

			public WebElement getCancel() {
				return Cancel;
			}
			
			@FindBy(xpath="//button[text()='Save as Draft']")
			private WebElement SaveAsDraft;

			public WebElement getSaveAsDraft() {
				return SaveAsDraft;
			}
			
			@FindBy(xpath="//button[text()='Make Available']")
			private WebElement MakeAvilable;


			public WebElement getMakeAvilable() {
				return MakeAvilable;
			}

			@FindBy(xpath="//button[text()='No']")
			private WebElement ClickCreditAlert;

			public WebElement getClickCreditAlert() {
				return ClickCreditAlert;
			}

}

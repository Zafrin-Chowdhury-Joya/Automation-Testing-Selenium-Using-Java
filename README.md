### **Automation Testing - Selenium Using JAVA**
This repository is the complete overview of my automation knowledge.

### **Prerequisite:**
1. [JAVA JDK](https://www.oracle.com/java/technologies/downloads/?er=221886)
2. Install the following IDE :
   - [Spring Tools](https://spring.io/tools)
3. [Apache Maven](https://maven.apache.org/download.cgi)

### **Installation**
1. Java JDK
   - Download the installer from the [Oracle Java SE Downloads](https://www.oracle.com/java/technologies/downloads/?er=221886) page.
   - Run the installer and set up the JDK.
2. IDE
   - Download and Install Spring Tools
3. Apache Maven
   - Download Apache Maven from the [official website](https://maven.apache.org/download.cgi)
   - Follow installation instructions.

### **Setting Up Java JDK**
1. Download the JDK installer from Oracle.
2. Run the installer and select your installation folder.
3. Set up JAVA_HOME and PATH environment variables:
   - Open System Properties.
   - Navigate to Environment Variables.
   - Add JAVA_HOME with the JDK installation path.
   - Update the PATH variable to include %JAVA_HOME%\bin.
5. Verify Java installation by running java --version in a terminal.

### **Setting Up Spring Tools**
1. Download Spring Tools from the [official website](https://spring.io/tools)
2. Run the installer and select the package to install.
3. Choose your installation folder and complete the setup.
4. Launch Spring Tools to start using it.

   
### **Installing Apache Maven**
1. Check if you have Java installed by running java --version.
2. Download Apache Maven from the [official website](https://maven.apache.org/download.cgi) 
3. Extract the archive to your desired location.
4. Set up M2_HOME and MAVEN_HOME environment variables:
   - Create M2_HOME and point it to the Maven installation directory.
   - Update the PATH variable to include %M2_HOME%\bin.
5. Verify Maven installation by running mvn --version in a terminal

### **Installation Steps**
To start using the framework:
1. [Fork](https://github.com/Zafrin-Chowdhury-Joya/Automation-Testing-Selenium-Using-Java/tree/main) the repository.
2. Clone, i.e, download your copy of the repository to your local machine using
 ```console 
 https://github.com/Zafrin-Chowdhury-Joya/Automation-Testing-Selenium-Using-Java.git
```
3. Import the project into your preferred IDE (Eclipse, IntelliJ IDEA, or Spring Tools).
4. Maven Dependencies
 ```console 
   <dependencies>
    <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>3.8.1</version>
      <scope>test</scope>
    </dependency>
    
    <!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
<dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>4.21.0</version>
</dependency>
   
   
   <!-- https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager -->
<dependency>
    <groupId>io.github.bonigarcia</groupId>
    <artifactId>webdrivermanager</artifactId>
    <version>5.8.0</version>
</dependency>


<!-- https://mvnrepository.com/artifact/org.testng/testng -->
<dependency>
    <groupId>org.testng</groupId>
    <artifactId>testng</artifactId>
    <version>7.10.2</version>
    <scope>test</scope>
</dependency>

  </dependencies>

```

### **Step Wise Details**
### 00 - Launching Browsers
   - 00 - 00 [Run Selenium Tests using Chrome Browser.](https://github.com/Zafrin-Chowdhury-Joya/Automation-Testing-Selenium-Using-Java/blob/main/src/main/java/Browserhandling/ChromeBrowserInselenium.java)
   - 00 - 01 [Run Selenium Tests using Firefox Browser.](https://github.com/Zafrin-Chowdhury-Joya/Automation-Testing-Selenium-Using-Java/blob/main/src/main/java/Browserhandling/FireFoxBrowserInSelenium.java)
   - 00 - 02 [Run Selenium Tests using Edge Browser. ](https://github.com/Zafrin-Chowdhury-Joya/Automation-Testing-Selenium-Using-Java/blob/main/src/main/java/Browserhandling/EdgeBrowserInSelenium.java)
   - 00 - 03 [Run Selenium Tests using Safari Browser. ](https://github.com/Zafrin-Chowdhury-Joya/Automation-Testing-Selenium-Using-Java/blob/main/src/main/java/Browserhandling/SafariBrowserInSelenium.java)
   - 00 - 04 [Run Selenium Tests using Cross Browser. ](https://github.com/Zafrin-Chowdhury-Joya/Automation-Testing-Selenium-Using-Java/blob/main/src/main/java/Browserhandling/CrossBrowserInSelenium.java)

### 01 - TestNG Examples
BeforeSuite - BeforeTest - BeforeClass - BeforeMethod - Test - AfterMethod - AfterClass - AfterTest - AfterSuite
   - 01 - 00 [TestNG ](https://github.com/Zafrin-Chowdhury-Joya/Automation-Testing-Selenium-Using-Java/blob/main/src/main/java/TestNG/TestNG_Examples.java)

### 02 - Locators in Selenium
  - 02 - 00 [Locate by ID](https://github.com/Zafrin-Chowdhury-Joya/Automation-Testing-Selenium-Using-Java/blob/main/src/main/java/WebElements_Locators/LocateById.java)
  - 02 - 01 [Locate by Name](https://github.com/Zafrin-Chowdhury-Joya/Automation-Testing-Selenium-Using-Java/blob/main/src/main/java/WebElements_Locators/LocateByName.java)
  - 02 - 02 [Locate by Class](https://github.com/Zafrin-Chowdhury-Joya/Automation-Testing-Selenium-Using-Java/blob/main/src/main/java/WebElements_Locators/LocateByClass.java)
  - 02 - 03 [Locate by LinkText](https://github.com/Zafrin-Chowdhury-Joya/Automation-Testing-Selenium-Using-Java/blob/main/src/main/java/WebElements_Locators/LocateByLinkText.java)
  - 02 - 04 [Locate by Partial Link](https://github.com/Zafrin-Chowdhury-Joya/Automation-Testing-Selenium-Using-Java/blob/main/src/main/java/WebElements_Locators/LocateByPartialLink.java)
  - 02 - 05 [Locate by Tag Name](https://github.com/Zafrin-Chowdhury-Joya/Automation-Testing-Selenium-Using-Java/blob/main/src/main/java/WebElements_Locators/LocateByTagName.java)
  - 02 - 06 [Locate by CSS Selector](https://github.com/Zafrin-Chowdhury-Joya/Automation-Testing-Selenium-Using-Java/blob/main/src/main/java/WebElements_Locators/LocateByCSS_Selector.java)

### 03 - Tab and Window Handling
  - 03 - 00 [Tab Handling](https://github.com/Zafrin-Chowdhury-Joya/Automation-Testing-Selenium-Using-Java/blob/main/src/main/java/TabOrWindowHandling/TabHandling.java) 
  - 03 - 01 [Window Handling](https://github.com/Zafrin-Chowdhury-Joya/Automation-Testing-Selenium-Using-Java/blob/main/src/main/java/TabOrWindowHandling/WindowHandling.java)

### 04 - Handling Alert and Pop-Ups
  - 04 - 00 [Simple Alert](https://github.com/Zafrin-Chowdhury-Joya/Automation-Testing-Selenium-Using-Java/blob/main/src/main/java/Handling_Alerts_and_PopUps/SimpleAlert.java)
  - 04 - 01 [Simple Alert After Five Seconds](https://github.com/Zafrin-Chowdhury-Joya/Automation-Testing-Selenium-Using-Java/blob/main/src/main/java/Handling_Alerts_and_PopUps/SimpleAlertAfterFiveSeconds.java)
  - 04 - 02 [Simple Alert With Confirm Box](https://github.com/Zafrin-Chowdhury-Joya/Automation-Testing-Selenium-Using-Java/blob/main/src/main/java/Handling_Alerts_and_PopUps/SimpleAlertWithConfirmBox.java)
  - 04 - 03 [Simple ALert With Promt Box](https://github.com/Zafrin-Chowdhury-Joya/Automation-Testing-Selenium-Using-Java/blob/main/src/main/java/Handling_Alerts_and_PopUps/SimpleAlertWithPromtBox.java)
  
### 05 - Waits in Selenium
  - 05 - 00 [Explicit Waits](https://github.com/Zafrin-Chowdhury-Joya/Automation-Testing-Selenium-Using-Java/blob/main/src/main/java/Waits_And_IFrameHandling/ExplicitWaits.java)
### 06 - IFrame Handling
  - 06 - 00 [Count & Switch Frame](https://github.com/Zafrin-Chowdhury-Joya/Automation-Testing-Selenium-Using-Java/blob/main/src/main/java/Waits_And_IFrameHandling/IFrameHandling.java)
### 07 - Assertions
  - 07 - 00 [Assertions Equals Hard Assertions](https://github.com/Zafrin-Chowdhury-Joya/Automation-Testing-Selenium-Using-Java/blob/main/src/main/java/Assertions/AssertEqualsHardAssertions.java) 
  - 07 - 01 [Assertions Equals Soft Assertions](https://github.com/Zafrin-Chowdhury-Joya/Automation-Testing-Selenium-Using-Java/blob/main/src/main/java/Assertions/AssertEqualsSoftAssertions.java)
### 08 - Action and Select Class
  - 08 - 00 [Mouse Hovering Using Action Class ](https://github.com/Zafrin-Chowdhury-Joya/Automation-Testing-Selenium-Using-Java/blob/main/src/main/java/Action_And_Select_Class/MouseHoverUsingActionClass.java)
  - 08 - 01 [Copy and Paste Using Action Class ](https://github.com/Zafrin-Chowdhury-Joya/Automation-Testing-Selenium-Using-Java/blob/main/src/main/java/Action_And_Select_Class/CopyAndPaste.java)
### 09 - Scroll In Selenium
  - 09 - 00 [Scroll Sepecific Area, Up And Down  ](https://github.com/Zafrin-Chowdhury-Joya/Automation-Testing-Selenium-Using-Java/blob/main/src/main/java/Action_And_Select_Class/ScrollUpAndDown.java)

 


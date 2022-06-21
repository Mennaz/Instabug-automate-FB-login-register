**MyFitnessPal App Test Plan**

1. **Product Analysis**

**1.1 Who will use the app?**

Target users are normal people that aims to make a difference with their body and health

**1.2 What is it used for?**

Track and monitor user’s daily activity and meals to help the user enhance his habits

**1.3 How will it work?**

It’s a mobile app used for iOS and Android with offline and online features

**1.4 What software/hardware the product uses?**

Software: Development frameworks

Hardware: Mobile device






2. **Test Strategy Design**

`              `**2.1 Scope of the product**

The components of the system to be tested (hardware, software, middleware, etc.) are defined as “in scope“

The components of the system that will not be tested also need to be clearly defined as being “out of scope.”

**Based on:**

- Customer requirement
- Project Budget
- Product Specification
- Skills & talent of your test team

`            `**2.2 Testing scope**
 Using:
 - Unit testing
 - API testing
 - Integration testing
 - System testing
 - Acceptance testing
 - Agile testing
 
`     `**2.3 Document Risk & Issues**

|**Risk**|**Mitigation**|
| :-: | :-: |
|Team members lack the required skills for mobile testing.|Plan training course to skill up your members|
|The project schedule is too tight; it’s hard to complete this project on time|Set Test Priority for each of the test activities.|
|A lack of cooperation negatively affects your employees’ productivity|Encourage each team member in his task, and inspire them to greater efforts.|
|Wrong budget estimate and cost overruns|Establish the scope before beginning work, pay a lot of attention to project planning and constantly track and measure the progress|

3. **Define test objectives**

The objective of the testing is finding as many software defects as possible; ensure that the software under test is bug free before release.


MyFitnessPal App testing objective is to test the following
- APIs
- Compatibility
- Performance
- Functionality
- Usability
- UI
- Automation
- Security


Check that whether MyFitnessPal app functionality(Account, Payments … ) is working as expected without any error or bugs in real business environment
Check that the external interface of the app such as UI and UX are working as expected and & meet the customer need
Verify the usability of the app. Are those functionalities convenient for the users or not?








4. **Test criteria**
4.1 **Exit Criteria**
- 100% Requirements coverage is achieved.
- Project Deadline or Test Finish deadline is reached.
- All Test Documents / deliverables (eg: test summary report) are prepared, reviewed and published across.
- Complete Testing Budget is exhausted.
- “Go /No Go” meeting has been conducted with stakeholders and a decision is made.
- Risk points are covered safely.
- Test Coverage:
    - Test Coverage should be 95% achieved.
    - Test case Pass Rate should be 95%. This can be calculated by formula
    - ( Total No of TCs Passed / Total number of TCs ) \* 100.
    - All critical Test cases are passed.
    - 5% Test cases can be failed but the Failed Test cases are of low priority.
    - Complete Functional Coverage is achieved.
    - All major functional / business flows are executed successfully with various inputs and are working fine.

5. **Resources Planning**
5.1 **Human Resources**


|**Member**|**Tasks**|
| :-: | :-: |
|Test Manager| 1. Manage the whole project 2.Define project directions 3.Acquire appropriate resources|
|Tester|1. Identifying and describing appropriate test techniques/tools/automation architecture 2. Verify and assess the Test Approach. 3. Execute the tests, Log results, Report the defects. 4. Tester could be in-sourced or out-sourced members, base on the project budget|
|Developer in Test| Implement the test cases, test suite etc.|
|SOA member|1. Take in charge of quality assurance. 2.Check to confirm whether the testing process is meeting specified requirements|


**System Resources**


|**Resource**|**Description**|
| :-: | :-: |
|Test Tool|The testing tool is to automate the testing, simulate the user operation, generate the test results|
|Network|You need a Network include LAN and Internet to simulate the real business and user environment|
|Mobile device|iOS and Android which users often use in the app|







6. **Plan Test Environment**

To be done with the developers by asking them

- What is the maximum user connection which this website can handle at the same time?
- What are hardware/software requirements to install this website?
- Does the user’s computer need any particular setting to browse the website?
- What is the maximum user connection which this website can handle at the same time?
- What are hardware/software requirements to install this website?
- Does the user’s computer need any particular setting to browse the website?







7. **Schedule and Estimation**

In the **test estimation** phase, we supposed to break out the whole project into small tasks and add the estimation for each task as below

To create the **project schedule**, we need several types of input as below:

- Employee and project deadline: The working days, the project deadline, resource availability are the factors which affected to the schedule
- Project estimation: Based on the estimation, we know how long it takes to complete the project. So we can make the appropriate project schedule
- Project Risk : Understanding the risk helps add enough extra time to the project schedule to deal with the risks





8. **Test Deliverables**
8.1 Test plan (Current file)
8.2 Test cases 


|**Testing Type**|**Module**|**Scenario**|**Impact - Periority**|**Pre requestes**|
| :-: | :-: | :-: | :-: | :-: |
|**Functional Testing**|**Sign Up**|User can sign up successfully with right email format|**High Impact - High Periority**||
|||User can sign up successfully with FB with valid existing account|**High Impact - High Periority**||
|||User can't sign up with wrong email format, eg: "x@m,com"|**High Impact - High Periority**||
|||User can't sign up with wrong FB account|**High Impact - High Periority**|have valid FB account|
||||||
||||||
||**Sign In**|User can sign in successfully with right email & password|**High Impact - High Periority**|create user|
|||User can't sign in with wrong email & password|**High Impact - High Periority**|create user|
||||||
||||||
||**Sign Out**|User can sign out and sign in again successfully with existing right email & password|**High Impact - High Periority**|already have account|
||||||
||||||
||**Change Password**|User can change password successfully|**High Impact - High Periority**|already have account|
|||User can't change pass if he entered new password that dismatch the new password re-type|**High Impact - High Periority**|already have account|
||||||
||||||
||**User Profile** |User can change his photo with take/upload photo|**High Impact - High Periority**|already have account|
|||user can edit his info successfully|**High Impact - High Periority**|already have account|
||||||
||||||
||**Notifications**|Notification counter is decreased by one each time user view one notification|**High Impact - High Periority**|have notifications|
|||User can view all his notifications|**High Impact - High Periority**|have notifications|
|||User can view all his messages|**High Impact - High Periority**|have notifications|
||||||
||||||
||**Go Premium**|User can go premium with yearly package|**High Impact - High Periority**|have valid credit card|
|||User can premium with monthly package|**High Impact - High Periority**|have valid credit card|
|||User can try one month free trial|**High Impact - High Periority**|have valid credit card|
||||||
||||||
||**Add food**|User can add new food to Breakfast, lunch, dinner or scacks|**High Impact - High Periority**|open diary tab|
|||User can add new food to Breakfast, lunch, dinner or scacks|**High Impact - High Periority**|open diary tab|
||||||
||||||
|**Recovery Testing**||Open app on a mobile device then make this app reccieve a call and check app behavior after the call|**Low Impact - medium Periority**||
|||Kill app and make it in background and check app after opening it again|**Low Impact - High Periority**||
||||||
||||||
|**compatibility Testing**||Check app is compatible with website regsrding user info |**High Impact - High Periority**||
|||Check app is working fine with old OSs (if available)|**Meduim Impact - Medium Periority**||
|||Check app is working fine with different screen sizes|**Meduim Impact - Medium Periority**||
|||Check app is working fine with iOS and Android (if available)|**High Impact - High Periority**||


8.3 Defect report document  (to be found in the GitHub folder)
8.4 Release notes



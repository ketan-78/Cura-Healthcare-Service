
# 🩺 Cura Healthcare Service

A healthcare appointment booking website being tested using automation scripts. The automation ensures all key functionalities work smoothly for users booking appointments online.


## Tech Stack

- **Java**
- **Selenium WebDriver**
- **TestNG**
- **Maven**
- **Jenkins** (CI/CD)
- **Ngrok**



## Features covered

- 🔐 Login functionality
- 🔘 Radio buttons
- 📅 Calendar date picker
- 🔽 Dropdown selections
- 🧰 ChromeOptions setup for browser configuration

## Installation/ Setup Instructions

1.	Install Eclipse IDE (or any preferred IDE).
2.	Install Java JDK (ensure JAVA_HOME is set).
3.	Clone this repository:
```bash
git clone https://github.com/your-username/your-repository-name.git
```
4.	Open the project in Eclipse.
5.	Make sure Maven is installed and configured.
6.	Update Maven dependencies (Right-click on project > Maven > Update Project).
7.  Java and Selenium basics recommended for understanding

    
## Running Tests
-	Via testng.xml:
    Right-click testng.xml → Run As → TestNG Suite
-	From Eclipse:
    Right-click on test classes → Run As → TestNG Test
-	Test execution reports will be generated automatically.
-   The test can also be run using mvn from commad prompt by running the below code: 
```bash
mvn test
```


## Folder Structure
```
├───reports
├───src
│   ├───main
│   │   └───java
│   │       └───StandardFramework
│   │           ├───PageObject
│   │           ├───Resources
│   │           └───ReusableComponents
│   └───test
│       └───java
│           └───StandardFramework
│               ├───Data
│               ├───TestComponents
│               └───Tests
├───target
│   ├───classes
│   │   ├───META-INF
│   │   │   └───maven
│   │   │       └───StandardFramework
│   │   │           └───Framework
│   │   └───StandardFramework
│   │       ├───PageObject
│   │       ├───Resources
│   │       └───ReusableComponents
│   ├───generated-sources
│   │   └───annotations
│   ├───generated-test-sources
│   │   └───test-annotations
│   ├───maven-status
│   │   └───maven-compiler-plugin
│   │       ├───compile
│   │       │   └───default-compile
│   │       └───testCompile
│   │           └───default-testCompile
│   ├───surefire-reports
│   │   ├───junitreports
│   │   └───Suite
│   └───test-classes
│       └───StandardFramework
│           ├───Data
│           ├───TestComponents
│           └───Tests
└───test-output
    ├───Default suite
    ├───junitreports
    └───Suite
```
## Screenshots
- Extent Report
![image](https://github.com/user-attachments/assets/432883fa-6835-4648-aa74-d8f0bafb66d2)
- Jenkins
![image](https://github.com/user-attachments/assets/f6d99889-a182-4efe-8d4f-dda160a8f772)

- Webhooks (CI/CD)
![Webhook](https://github.com/user-attachments/assets/3ffbb0ef-cc8d-4821-9634-f606ca698da3)

- Cura Healthcare Service Website
![Homepage](https://github.com/user-attachments/assets/4bda82f7-6447-40e6-9ecc-ef6ae4747ac3)
![AppointmentPage](https://github.com/user-attachments/assets/2dd1fb9c-e23c-4f51-9bb6-40888bdf4fd8)





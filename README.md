**Note:** To run this project, users must set up their local environment with the necessary configurations and dependencies. Please follow the steps provided below to ensure the proper setup.

**** Note ** : I have hardcoded the data (city, state code, zip code) in the tests for the assignment purpose.**

**Pre-requisites:**

Before running this project, ensure the following tools and dependencies are set up on your local machine:

1. Java (Java 17 is used for this project)
2. IDE: IntelliJ IDEA (Ultimate or Community Edition) or Eclipse
3. Maven: Ensure that Maven is installed and properly configured on your machine


**** Required dependencies added in pom.xml file ****

<dependencies>
    <!-- https://mvnrepository.com/artifact/io.rest-assured/rest-assured -->
    <dependency>
      <groupId>io.rest-assured</groupId>
      <artifactId>rest-assured</artifactId>
      <version>5.5.1</version>
      <scope>test</scope>
    </dependency>

    <!-- https://mvnrepository.com/artifact/org.hamcrest/hamcrest -->
    <dependency>
      <groupId>org.hamcrest</groupId>
      <artifactId>hamcrest</artifactId>
      <version>2.2</version>
      <scope>test</scope>
    </dependency>
    <!-- https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind -->
    <dependency>
      <groupId>com.fasterxml.jackson.core</groupId>
      <artifactId>jackson-databind</artifactId>
      <version>2.18.2</version>
    </dependency>

    <!-- https://mvnrepository.com/artifact/io.rest-assured/json-path -->
    <dependency>
      <groupId>io.rest-assured</groupId>
      <artifactId>json-path</artifactId>
      <version>5.5.1</version>
    </dependency>

    <dependency>
      <groupId>log4j</groupId>
      <artifactId>log4j</artifactId>
      <version>1.2.16</version>
    </dependency>

    <dependency>
      <groupId>org.projectlombok</groupId>
      <artifactId>lombok</artifactId>
      <version>1.18.34</version> <!-- Ensure you have the latest version -->
      <scope>provided</scope>
    </dependency>

    <!-- https://mvnrepository.com/artifact/com.aventstack/extentreports -->
    <dependency>
      <groupId>com.aventstack</groupId>
      <artifactId>extentreports</artifactId>
      <version>5.0.9</version>
    </dependency>

    <dependency>
      <groupId>org.testng</groupId>
      <artifactId>testng</artifactId>
      <version>7.11.0</version>
      <scope>compile</scope>
    </dependency>
    <dependency>
      <groupId>io.rest-assured</groupId>
      <artifactId>rest-assured</artifactId>
      <version>5.5.1</version>
      <scope>compile</scope>
    </dependency>

  </dependencies>


**How to Run the Project**

After setting up your local environment, follow these steps to run the project:

Running the Tests
**** From the IntelliJ Terminal: ****
Use the following command to run the tests:
mvn test
This will execute the tests defined in the weather-geolocation-api.xml file (Note: This is a testng.xml file that has been renamed).

Alternatively, From the /src/test/tests Folder:
You can also run the GeolocationTests.java class directly from this folder.

**Additional Notes**

1. For successful execution, I have already pushed the reports to the repository. You can review the reports located in the reports folder.
   
2. Extent Reports are used in this project to visualize the test execution results. Please run any of the XML files to generate the reports.



   
   







   

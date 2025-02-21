****** Note:** Any one who wants to run this project need to setup their locan machine ** ****

**** Pre-requisites ****

1. JAVA (Java 17 used for this project)
2. Intellij/ eclipse IDE (Intellij Ulimate/ CE edition any thing works fine)
3. Maven should install and configure in local machine

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


****  How to run the project ****

After setting up your local machine properly use mvn test command as mentioned below 

** command to run this project **
1. From Intellij terminal we can run using the below command
      mvn test --> it will run the tests from weather-geolocation-api.xml file (note: this is testng.xml file i have renamed it)
   
         (or)
   
2. from the /src/test/tests folder we can run the GeolocationTests.java class


Note: For my successful runs i have pushed the reports in the repo

1. extent reports used in this project to see the execution results. Kindly run any one if the xml files to see the reports



   
   







   

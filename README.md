# CucumberJavaFrameworkEclipse_ASBS
Cucumber Framework using Java Language and Gherin Syntax with BDD Terminologies.

**NOTES:**
1. For Dependancy Injection "Pico Container" Dependancy Plugin is Required.
   2. Also, Reposrting can be used.


==========================================================================================================================================
<-->Add the Following Dependancies in POM.XML:
<project xmlns="http://maven.apache.org/POM/4.0.0"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>
	<groupId>CucumberJava</groupId>
	<artifactId>CucumberJava</artifactId>
	<version>0.0.1-SNAPSHOT</version>

	<properties>
		<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
		<java.version>20.0.1</java.version>
		<maven.compiler.source>1.8</maven.compiler.source>
		<maven.compiler.target>1.8</maven.compiler.target>
	</properties>

	<dependencies>
		<!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-java -->
		<dependency>
			<groupId>io.cucumber</groupId>
			<artifactId>cucumber-java</artifactId>
			<version>7.12.1</version>
		</dependency>

		<!--https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
		<dependency>
			<groupId>org.seleniumhq.selenium</groupId>
			<artifactId>selenium-java</artifactId>
			<version>4.10.0</version>
		</dependency>

		<!-- https://mvnrepository.com/artifact/junit/junit -->
		<dependency>
			<groupId>junit</groupId>
			<artifactId>junit</artifactId>
			<version>4.13.2</version>
			<scope>test</scope>
		</dependency>

		<!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-junit -->
		<dependency>
			<groupId>io.cucumber</groupId>
			<artifactId>cucumber-junit</artifactId>
			<version>7.12.1</version>
			<scope>test</scope>
		</dependency>
		<!-- https://mvnrepository.com/artifact/commons-io/commons-io -->
		<dependency>
			<groupId>commons-io</groupId>
			<artifactId>commons-io</artifactId>
			<version>2.13.0</version>
		</dependency>
		<!--
		https://mvnrepository.com/artifact/io.cucumber/cucumber-picocontainer -->
		<dependency>
			<groupId>io.cucumber</groupId>
			<artifactId>cucumber-picocontainer</artifactId>
			<version>7.12.1</version>
		</dependency>
		<!--
		https://mvnrepository.com/artifact/net.masterthought/maven-cucumber-reporting -->
		<dependency>
			<groupId>net.masterthought</groupId>
			<artifactId>maven-cucumber-reporting</artifactId>
			<version>5.7.5</version>
		</dependency>


	</dependencies>

	<build>

		<plugins>
			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-surefire-plugin</artifactId>
				<version>3.1.2</version>
				<configuration>
					<testFailureIgnore>true</testFailureIgnore>
				</configuration>
			</plugin>
			<plugin>
				<groupId>net.masterthought</groupId>
				<artifactId>maven-cucumber-reporting</artifactId>
				<version>2.8.0</version>
				<executions>
					<execution>
						<id>execution</id>
						<phase>verify</phase>
						<goals>
							<goal>generate</goal>
						</goals>
						<configuration>
							<projectName>CucumberJava_ASBS</projectName>
							<outputDirectory>
								${project.build.directory}/cucumber-report-html</outputDirectory>
							<cucumberOutput>
								${project.build.directory}/cucumber.json</cucumberOutput>
						</configuration>
					</execution>
				</executions>
			</plugin>
		</plugins>
	</build>
</project>


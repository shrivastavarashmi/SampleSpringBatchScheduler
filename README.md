# Deploy Spring Boot Batch Application on Azure App Service

This quickstart shows you how to deploy Spring Boot Batch application on App Service. When you're finished, you can continue to manage the application via the Azure CLI or switch to using the Azure Portal.

* [Deploy Spring Boot apps on Azure App Service](https://github.com/shrivastavarashmi/SampleSpringBatchScheduler#deploy-spring-boot-batch-application-on-azure-app-service)
  * [What will you experience](https://github.com/shrivastavarashmi/SampleSpringBatchScheduler#what-will-you-experience)
  * [What will you need](https://github.com/shrivastavarashmi/SampleSpringBatchScheduler#what-will-you-need)
  * [Clone and build the repo](https://github.com/shrivastavarashmi/SampleSpringBatchScheduler#clone-and-build-the-repo)
  * [Deploy the application](https://github.com/shrivastavarashmi/SampleSpringBatchScheduler#to-deploy-the-project-on-azure-cloud-shell)
  * [Verify the application](https://github.com/shrivastavarashmi/SampleSpringBatchScheduler#verify-azure-app-service)
 
# What will you experience
You will:

* Build existing Spring Boot Batch application.This repository consists of sample application to showcase a way to deploy Spring Boot Batch application on App Service.
* Deploy the application on App Service
* Verify and monitor the application
* How application behave with Always On Feature on Azure App Service

# What will you need

In order to deploy a Java app to cloud, you need an Azure subscription. If you do not already have an Azure subscription, you can activate your [MSDN subscriber benefits](https://azure.microsoft.com/en-us/pricing/member-offers/credit-for-visual-studio-subscribers/) or sign up for a free Azure account.

In addition, you will need the following:

| [Azure CLI version 2.17.1 or higher](https://docs.microsoft.com/en-us/cli/azure/install-azure-cli?view=azure-cli-latest) | [Java 11](https://docs.microsoft.com/en-us/azure/developer/java/fundamentals/java-support-on-azure) | [Maven](https://maven.apache.org/) 

OR Use Azure Cloud Shell
Or, you can use the Azure Cloud Shell. Azure hosts Azure Cloud Shell, an interactive shell environment that you can use through your browser. You can use the Bash with Cloud Shell to work with Azure services. You can use the Cloud Shell pre-installed commands to run the code in this README without having to install anything on your local environment. To start Azure Cloud Shell: go to https://shell.azure.com, or select the Launch Cloud Shell button to open Cloud Shell in your browser.

To run the code in this article in Azure Cloud Shell:

Start Cloud Shell.

Select the Copy button on a code block to copy the code.

Paste the code into the Cloud Shell session by selecting Ctrl+Shift+V on Windows and Linux or by selecting Cmd+Shift+V on macOS.

Select Enter to run the code.

# Clone and build the repo

* Create a new folder and clone the sample app repository to your Azure Cloud account

  ```bash
   mkdir source-code`  
   git clone https://github.com/shrivastavarashmi/SampleSpringBatchScheduler.git
  ``` 

* Change directory to the project

  ```bash
   cd SampleSpringBatchScheduler
  ``` 

* Configure the maven plugin to [set up](https://docs.microsoft.com/en-us/azure/app-service/quickstart-java?tabs=javase&pivots=platform-linux-development-environment-maven#3---configure-the-maven-plugin) the App Service operating system, Java version, and Tomcat version using below command :

  ```bash
   mvn com.microsoft.azure:azure-webapp-maven-plugin:2.5.0:config
  ```  

* Build the project
 
  ```bash
   mvn clean package -DskipTests -Denv=cloud
  ```

This will take a few minutes.

# To Deploy the project on Azure Cloud Shell

Use below command to deploy project on App Service 

  ```bash
    mvn package azure-webapp:deploy
  ```

# Verify Azure App Service

Below information can be used to verify the application running on App Service :

* Hit the health check url  `https://{appservicename}.azurewebsites.net/actuator/health` to see if your app service is up and running. It should display below json output :
      
 ``{"status":"UP"}``

* Check LogStream for logs as below :

  ![image](https://user-images.githubusercontent.com/83832052/180320383-573db632-40db-430c-b34f-c72f61fd392f.png)


# Always On Feature on Azure App Service
With Always On disabled App Service will not run. If it is not already On , it can be done as per below instruction :

In the Azure portal, go to your web app.
* Select Configuration.
* Select General settings.
* For Always On, select On.

![image](https://user-images.githubusercontent.com/83832052/180438016-4250575a-7499-42f5-bb31-8ef529dda557.png)

# Reference Links
* [Create a Java app on Azure App Service](https://docs.microsoft.com/en-us/azure/app-service/quickstart-java?tabs=javase&pivots=platform-linux-development-environment-maven)

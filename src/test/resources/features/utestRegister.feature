# Autor: Alberto Caballero
  @stories
  Feature: Utest registration
    As a user, i want to join the utest community
  @scenario
  Scenario: uTest page registration
    Given than Luis want to join the utest community page
    When he fill out the registration form
      |firstNameUser|lastNameUser|    emailUser    |birthMonthUser|birthDayUser|birthYearUser|languageUser| cityAdressUser  |stateAdressUser|cityZipCodeUser|countryAdressUser| deviceOsUser | osVersionUser | osLanguageUser | mobileDeviceUser | modelMobileUser | osMobileUser| passwordUser|
      |     Luis    |  Franco    | lfranco@mail.com|    April     |    7       |  1998       |  French    |      Miami      |     Florida   |  33195        | United States   | Windows      | 10            |English         | Apple            | iPhone 11       |iOS 14.6     |  password123|
    Then he complete the registration process
      | finishLabel    |
      | Complete Setup |
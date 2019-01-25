$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("APIDemos_01_SettingWifi.feature");
formatter.feature({
  "line": 1,
  "name": "APIDemos: Setting Wifi",
  "description": "",
  "id": "apidemos:-setting-wifi",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Setting Wifi",
  "description": "",
  "id": "apidemos:-setting-wifi;setting-wifi",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@APIDemos_SettingWifi"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User clicks on Preference Option",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "clicks on Preference Dependencies Option",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User should be able to set the wifi of the device using the password \u003cpassword\u003e",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "apidemos:-setting-wifi;setting-wifi;",
  "rows": [
    {
      "cells": [
        "password"
      ],
      "line": 10,
      "id": "apidemos:-setting-wifi;setting-wifi;;1"
    },
    {
      "cells": [
        "pass1111"
      ],
      "line": 11,
      "id": "apidemos:-setting-wifi;setting-wifi;;2"
    },
    {
      "cells": [
        "pass2222"
      ],
      "line": 12,
      "id": "apidemos:-setting-wifi;setting-wifi;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 132368208303,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Setting Wifi",
  "description": "",
  "id": "apidemos:-setting-wifi;setting-wifi;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@APIDemos_SettingWifi"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User clicks on Preference Option",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "clicks on Preference Dependencies Option",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User should be able to set the wifi of the device using the password pass1111",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition_01_APIDemos_SettingWifi.user_clicks_on_preference_option()"
});
formatter.result({
  "duration": 1292987129,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition_01_APIDemos_SettingWifi.clicks_on_preference_dependencies_option()"
});
formatter.result({
  "duration": 4350124914,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "pass1111",
      "offset": 69
    }
  ],
  "location": "stepDefinition_01_APIDemos_SettingWifi.user_should_be_able_to_set_the_wifi_of_the_device_using_the_password(String)"
});
formatter.result({
  "duration": 11039828485,
  "status": "passed"
});
formatter.after({
  "duration": 1940875118,
  "status": "passed"
});
formatter.before({
  "duration": 27943190670,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Setting Wifi",
  "description": "",
  "id": "apidemos:-setting-wifi;setting-wifi;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@APIDemos_SettingWifi"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User clicks on Preference Option",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "clicks on Preference Dependencies Option",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User should be able to set the wifi of the device using the password pass2222",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition_01_APIDemos_SettingWifi.user_clicks_on_preference_option()"
});
formatter.result({
  "duration": 559894165,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition_01_APIDemos_SettingWifi.clicks_on_preference_dependencies_option()"
});
formatter.result({
  "duration": 4682451093,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "pass2222",
      "offset": 69
    }
  ],
  "location": "stepDefinition_01_APIDemos_SettingWifi.user_should_be_able_to_set_the_wifi_of_the_device_using_the_password(String)"
});
formatter.result({
  "duration": 10992777012,
  "status": "passed"
});
formatter.after({
  "duration": 981541979,
  "status": "passed"
});
formatter.uri("APIDemos_02_RetrivingDogsInfo.feature");
formatter.feature({
  "line": 1,
  "name": "API Demos: Retriving Dogs Info",
  "description": "",
  "id": "api-demos:-retriving-dogs-info",
  "keyword": "Feature"
});
formatter.before({
  "duration": 26757840039,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "APIDemos_RetrivingDogsInfo",
  "description": "",
  "id": "api-demos:-retriving-dogs-info;apidemos-retrivingdogsinfo",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@APIDemos_RetrivingInfo"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User navigates to Custom Adapter page",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User should be able to retrieve dogs information",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition_02_APIDemos_RetrivingDogsInfo.user_navigates_to_custom_adapter_page()"
});
formatter.result({
  "duration": 4262500057,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition_02_APIDemos_RetrivingDogsInfo.user_should_be_able_to_retrieve_dogs_information()"
});
formatter.result({
  "duration": 8941611753,
  "status": "passed"
});
formatter.after({
  "duration": 546906073,
  "status": "passed"
});
formatter.uri("APIDemos_03_PlayingRedDots.feature");
formatter.feature({
  "line": 1,
  "name": "API Demos: Playing Red Dots",
  "description": "",
  "id": "api-demos:-playing-red-dots",
  "keyword": "Feature"
});
formatter.before({
  "duration": 26795018676,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "APIDemos_PlayingRedDots",
  "description": "",
  "id": "api-demos:-playing-red-dots;apidemos-playingreddots",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@APIDemos_PlayingRedDots"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User taps on View Option",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Taps on Drag And Drop Option",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User should be able to perform drag and drop operation from the first dot over the third dot",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition_03_APIDemos_PlayingRedDots.user_taps_on_view_option()"
});
formatter.result({
  "duration": 1073903486,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition_03_APIDemos_PlayingRedDots.taps_on_drag_and_drop_option()"
});
formatter.result({
  "duration": 4089121848,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition_03_APIDemos_PlayingRedDots.user_should_be_able_to_perform_drag_and_drop_operation_from_the_first_dot_over_the_third_dot()"
});
formatter.result({
  "duration": 5668912840,
  "status": "passed"
});
formatter.after({
  "duration": 251592264,
  "status": "passed"
});
formatter.uri("APIDemos_04_MakingPopUps.feature");
formatter.feature({
  "line": 1,
  "name": "API Demos: Making Pop Ups",
  "description": "",
  "id": "api-demos:-making-pop-ups",
  "keyword": "Feature"
});
formatter.before({
  "duration": 26536865055,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "APIDemos_MakingPopUps",
  "description": "",
  "id": "api-demos:-making-pop-ups;apidemos-makingpopups",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@APIDemos_MakingPopUps"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User taps on Views option",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "taps on Pop Up option",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User should be able to make a pop up",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition_04_APIDemos_MakingPopUps.user_taps_on_views_option()"
});
formatter.result({
  "duration": 1112552737,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition_04_APIDemos_MakingPopUps.taps_on_pop_up_option()"
});
formatter.result({
  "duration": 11131706062,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition_04_APIDemos_MakingPopUps.user_should_be_able_to_make_a_pop_up()"
});
formatter.result({
  "duration": 1595367590,
  "status": "passed"
});
formatter.after({
  "duration": 779370999,
  "status": "passed"
});
});
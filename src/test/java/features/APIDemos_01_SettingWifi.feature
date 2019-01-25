Feature: APIDemos: Setting Wifi

@APIDemos_SettingWifi
Scenario Outline: Setting Wifi
When User clicks on Preference Option
And clicks on Preference Dependencies Option
Then User should be able to set the wifi of the device using the password <password>

Examples:
|	password	|
|	pass1111	|
|	pass2222	|

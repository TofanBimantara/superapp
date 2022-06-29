import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Login/TS001_Login'), [('User') : 'tofanb@nobubank.com', ('Password') : 'tofanb@nobubank.com'])

WebUI.click(findTestObject('DafaultMenuPage/OR006_MainMenuDefault'))

WebUI.click(findTestObject('DafaultMenuPage/OR007_SubMenuApp'))

WebUI.click(findTestObject('DafaultMenuPage/PascaBayar/OR008_EditButton'))

WebUI.click(findTestObject('DafaultMenuPage/PascaBayar/OR009_StatusDropDown'))

WebUI.scrollToElement(findTestObject('DafaultMenuPage/PascaBayar/OR010_StatusInactive'), 0)

if (Status == 'InActive') {
    WebUI.click(findTestObject('DafaultMenuPage/PascaBayar/OR010_StatusInactive'))
} else if (Status == 'ComingSoon') {
    WebUI.click(findTestObject('DafaultMenuPage/PascaBayar/OR013_StatusComingSoon'))
} else {
    WebUI.click(findTestObject('DafaultMenuPage/PascaBayar/OR012_StatusActive'))
}

//WebUI.click(findTestObject('DafaultMenuPage/PascaBayar/OR010_StatusInactive'))
WebUI.click(findTestObject('DafaultMenuPage/PascaBayar/OR011_UpdateButton'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Page_App Menu List  NOBU Dashboard/svg'))

WebUI.callTestCase(findTestCase('Logout/TS002_logout'), [:], FailureHandling.STOP_ON_FAILURE)


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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://automationexercise.com/')

WebUI.click(findTestObject('Object Repository/Login with valid username and password/Page_Automation Exercise/a_Signup  Login'))

WebUI.setText(findTestObject('Object Repository/Login with valid username and password/Page_Automation Exercise - Signup  Login/input_Login to your account_email'), 
    'asrinasibagariang@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Login with valid username and password/Page_Automation Exercise - Signup  Login/input_Login to your account_password'), 
    '8K9Ot5QHsMzfCU/s9Qbkug==')

WebUI.click findTestObject('Object Repository/Login with valid username and password/Page_Automation Exercise - Signup  Login/button_Login')
WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise/a_Logged in as asrina'), 'Logged in as asrina')
WebUI.click(findTestObject('Object Repository/Login with valid username and password/Page_Automation Exercise/a_Delete Account'))
WebUI.verifyElementText(findTestObject('Object Repository/Login with username and password valid/Page_Automation Exercise - Account Created/b_Account Deleted'),  'ACCOUNT DELETED!')
WebUI.click(findTestObject('Object Repository/Login with valid username and password/Page_Automation Exercise - Account Created/a_Continue'))


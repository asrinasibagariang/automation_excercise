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

WebUI.verifyElementVisible(findTestObject('Object Repository/Verify Test Cases Page/Page_Automation Exercise/img'))

WebUI.click(findTestObject('Object Repository/Verify Test Cases Page/Page_Automation Exercise/a_Signup  Login'))

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://automationexercise.com/')

WebUI.verifyElementPresent(findTestObject('Object Repository/Verify Test Cases Page/Page_Automation Exercise/img'), 0)

WebUI.click(findTestObject('Object Repository/Verify Test Cases Page/Page_Automation Exercise/a_Contact us'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Verify Test Cases Page/Page_Automation Exercise - Contact Us/h2_Get In Touch'))

WebUI.setText(findTestObject('Object Repository/Verify Test Cases Page/Page_Automation Exercise - Contact Us/input_Get In Touch_name'), 
    'asrina')

WebUI.setText(findTestObject('Object Repository/Verify Test Cases Page/Page_Automation Exercise - Contact Us/input_Get In Touch_subject'), 
    'asrinakatalon')

WebUI.setText(findTestObject('Object Repository/Verify Test Cases Page/Page_Automation Exercise - Contact Us/input_Get In Touch_email'), 
    'asrinasibagariang@gmail.com')

WebUI.setText(findTestObject('Object Repository/Verify Test Cases Page/Page_Automation Exercise - Contact Us/textarea_Get In Touch_message'), 
    'aku mau belajar katalon sekarang semoga ada harapan untuk aku lulus menjadi qa automation')

WebUI.click(findTestObject('Object Repository/Verify Test Cases Page/Page_Automation Exercise - Contact Us/input_Get In Touch_submit'))

WebUI.click(findTestObject('Object Repository/Verify Test Cases Page/Page_Automation Exercise - Contact Us/input_Get In Touch_submit'))

WebUI.click(findTestObject('Object Repository/Verify Test Cases Page/Page_Automation Exercise - Contact Us/input_Get In Touch_submit'))

WebUI.click(findTestObject('Object Repository/Verify Test Cases Page/Page_Automation Exercise - Contact Us/input_Get In Touch_subject'))

WebUI.click(findTestObject('Object Repository/Verify Test Cases Page/Page_Automation Exercise - Contact Us/input_Get In Touch_submit'))

WebUI.click(findTestObject('Object Repository/Verify Test Cases Page/Page_Automation Exercise - Contact Us/input_Get In Touch_submit'))

WebUI.click(findTestObject('Object Repository/Verify Test Cases Page/Page_Automation Exercise - Contact Us/input_Get In Touch_submit'))

WebUI.click(findTestObject('Object Repository/Verify Test Cases Page/Page_Automation Exercise - Contact Us/input_Get In Touch_submit'))

WebUI.click(findTestObject('Object Repository/Verify Test Cases Page/Page_Automation Exercise - Contact Us/input_Get In Touch_submit'))

WebUI.click(findTestObject('Object Repository/Verify Test Cases Page/Page_Automation Exercise - Contact Us/input_Get In Touch_submit'))

WebUI.click(findTestObject('Object Repository/Verify Test Cases Page/Page_Automation Exercise - Contact Us/form_Get In Touch_contact-form'))

WebUI.click(findTestObject('Object Repository/Verify Test Cases Page/Page_Automation Exercise - Contact Us/input_Get In Touch_submit'))

WebUI.click(findTestObject('Object Repository/Verify Test Cases Page/Page_Automation Exercise - Contact Us/input_Get In Touch_submit'))

WebUI.click(findTestObject('Object Repository/Verify Test Cases Page/Page_Automation Exercise - Contact Us/input_Get In Touch_submit'))

WebUI.click(findTestObject('Object Repository/Verify Test Cases Page/Page_Automation Exercise - Contact Us/form_Get In Touch_contact-form'))

WebUI.click(findTestObject('Object Repository/Verify Test Cases Page/Page_Automation Exercise - Contact Us/input_Get In Touch_submit'))

WebUI.click(findTestObject('Object Repository/Verify Test Cases Page/Page_Automation Exercise - Contact Us/input_Get In Touch_submit'))

WebUI.click(findTestObject('Object Repository/Verify Test Cases Page/Page_Automation Exercise - Contact Us/input_Get In Touch_submit'))

WebUI.click(findTestObject('Object Repository/Verify Test Cases Page/Page_Automation Exercise - Contact Us/input_Get In Touch_submit'))

WebUI.click(findTestObject('Object Repository/Verify Test Cases Page/Page_Automation Exercise - Contact Us/input_Get In Touch_submit'))

WebUI.click(findTestObject('Object Repository/Verify Test Cases Page/Page_Automation Exercise - Contact Us/input_Get In Touch_submit'))

WebUI.click(findTestObject('Object Repository/Verify Test Cases Page/Page_Automation Exercise - Contact Us/input_Get In Touch_submit'))

WebUI.click(findTestObject('Object Repository/Verify Test Cases Page/Page_Automation Exercise - Contact Us/a_Home'))

WebUI.click(findTestObject('Object Repository/Verify Test Cases Page/Page_Automation Exercise/i_Contact us_fa fa-envelope'))

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://automationexercise.com/')

WebUI.verifyElementVisible(findTestObject('Object Repository/Verify Test Cases Page/Page_Automation Exercise/img'))

WebUI.click(findTestObject('Object Repository/Verify Test Cases Page/Page_Automation Exercise/a_Test Cases'))

WebUI.click(findTestObject('Object Repository/Verify Test Cases Page/Page_Automation Exercise/svg'))

WebUI.click(findTestObject('Object Repository/Verify Test Cases Page/Page_Automation Practice Website for UI Tes_a19d73/body_Home Products Cart Signup  Login Test _4dc3d6'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Verify Test Cases Page/Page_Automation Practice Website for UI Tes_a19d73/div_Home Products Cart Signup  Login Test C_6d23b7'))


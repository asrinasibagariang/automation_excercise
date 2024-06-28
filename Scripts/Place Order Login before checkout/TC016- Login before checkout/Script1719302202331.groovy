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

WebUI.verifyElementVisible(findTestObject('Object Repository/Login before checkout/Page_Automation Exercise/img'))

WebUI.click(findTestObject('Object Repository/Login before checkout/Page_Automation Exercise/a_Signup  Login'))

WebUI.setText(findTestObject('Object Repository/Login before checkout/Page_Automation Exercise - Signup  Login/input_Login to your account_email'), 
    'asrinasibagariang@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Login before checkout/Page_Automation Exercise - Signup  Login/input_Login to your account_password'), 
    '1yOhX5QgtoE=')

WebUI.click(findTestObject('Object Repository/Login before checkout/Page_Automation Exercise - Signup  Login/button_Login'))

WebUI.verifyElementVisible(findTestObject('Page_Automation Exercise/a_Logged in as asrina'))

WebUI.click(findTestObject('Login before chekout/Page_Automation Exercise/a_View Product'))

WebUI.click(findTestObject('Login before chekout/Page_Automation Exercise - Product Details/button_Add to cart'))

WebUI.click(findTestObject('Login before chekout/Page_Automation Exercise - Product Details/button_Continue Shopping'))

WebUI.click(findTestObject('Object Repository/Login before checkout/Page_Automation Exercise/a_Cart'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Login before checkout/Page_Automation Exercise - Checkout/div_Home  Shopping CartProceed To CheckoutC_230818'))

WebUI.click(findTestObject('Object Repository/Login before checkout/Page_Automation Exercise - Checkout/a_Proceed To Checkout'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Login before checkout/Page_Automation Exercise - Checkout/h2_Address Details'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Login before checkout/Page_Automation Exercise - Checkout/h2_Review Your Order'))

WebUI.click(findTestObject('Object Repository/Login before checkout/Page_Automation Exercise - Checkout/body_Home Products Cart Logout Delete Accou_2a6c77'))

WebUI.setText(findTestObject('Object Repository/Login before checkout/Page_Automation Exercise - Checkout/textarea_If you would like to add a comment_a4f199'), 
    'barangnya bagus sukkaa banget')

WebUI.click(findTestObject('Object Repository/Login before checkout/Page_Automation Exercise - Checkout/a_Place Order'))

WebUI.setText(findTestObject('Object Repository/Login before checkout/Page_Automation Exercise - Payment/input_Name on Card_name_on_card'), 
    'asrina')

WebUI.setText(findTestObject('Object Repository/Login before checkout/Page_Automation Exercise - Payment/input_Card Number_card_number'), 
    '1111')

WebUI.setText(findTestObject('Object Repository/Login before checkout/Page_Automation Exercise - Payment/input_CVC_cvc'), 
    '31')

WebUI.setText(findTestObject('Object Repository/Login before checkout/Page_Automation Exercise - Payment/input_Expiration_expiry_month'), 
    '06')

WebUI.setText(findTestObject('Object Repository/Login before checkout/Page_Automation Exercise - Payment/input_Expiration_expiry_year'), 
    '2024')

WebUI.click(findTestObject('Object Repository/Login before checkout/Page_Automation Exercise - Payment/button_Pay and Confirm Order'))

WebUI.verifyElementPresent(findTestObject('Login before checkout/Page_Automation Exercise - Order Placed/p_Congratulations Your order has been confirmed'), 
    0)


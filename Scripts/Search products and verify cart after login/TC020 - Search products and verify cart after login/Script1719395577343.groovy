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

WebUI.click(findTestObject('Object Repository/Seacrh products and verify cart after login/Page_Automation Exercise/a_Products'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Seacrh products and verify cart after login/Page_Automation Exercise - All Products/div_Contact us_container'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Seacrh products and verify cart after login/Page_Automation Exercise - All Products/input_Contact us_search'))

WebUI.setText(findTestObject('Object Repository/Seacrh products and verify cart after login/Page_Automation Exercise - All Products/input_Contact us_search'), 
    'kids')

WebUI.click(findTestObject('Object Repository/Seacrh products and verify cart after login/Page_Automation Exercise - All Products/i_Contact us_fa fa-search'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Seacrh products and verify cart after login/Page_Automation Exercise - All Products/div_Rs. 278Frozen Tops For KidsAdd to cart'))

WebUI.click(findTestObject('Object Repository/Seacrh products and verify cart after login/Page_Automation Exercise - All Products/a_View Product'))

WebUI.click(findTestObject('Object Repository/Seacrh products and verify cart after login/Page_Automation Exercise - All Products/svg'))

WebUI.click(findTestObject('Object Repository/Seacrh products and verify cart after login/Page_Automation Exercise - Product Details/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/Seacrh products and verify cart after login/Page_Automation Exercise - Product Details/u_View Cart'))

WebUI.click(findTestObject('Object Repository/Seacrh products and verify cart after login/Page_Automation Exercise - Checkout/a_Cart'))

WebUI.click(findTestObject('Object Repository/Seacrh products and verify cart after login/Page_Automation Exercise - Checkout/a_Signup  Login'))

WebUI.setText(findTestObject('Object Repository/Seacrh products and verify cart after login/Page_Automation Exercise - Signup  Login/input_Login to your account_email'), 
    'asrinasibagariang@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Seacrh products and verify cart after login/Page_Automation Exercise - Signup  Login/input_Login to your account_password'), 
    '1yOhX5QgtoE=')

WebUI.click(findTestObject('Object Repository/Seacrh products and verify cart after login/Page_Automation Exercise - Signup  Login/button_Login'))

WebUI.click(findTestObject('Object Repository/Seacrh products and verify cart after login/Page_Automation Exercise/a_Cart'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Seacrh products and verify cart after login/Page_Automation Exercise - Checkout/div_Home  Shopping CartProceed To CheckoutC_867d3c'))


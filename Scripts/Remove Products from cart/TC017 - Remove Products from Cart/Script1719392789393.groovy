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

WebUI.verifyElementVisible(findTestObject('Object Repository/Remove product form carts/Page_Automation Exercise/img'))

WebUI.click(findTestObject('Object Repository/Remove product form carts/Page_Automation Exercise/a_View Product'))

WebUI.click(findTestObject('Object Repository/Remove product form carts/Page_Automation Exercise - Product Details/i_Add to cart_fa fa-shopping-cart'))

WebUI.click(findTestObject('Object Repository/Remove product form carts/Page_Automation Exercise - Product Details/u_View Cart'))

WebUI.click(findTestObject('Object Repository/Remove product form carts/Page_Automation Exercise - Checkout/i_Cart_fa fa-shopping-cart'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Remove product form carts/Page_Automation Exercise - Checkout/div_Home  Shopping CartProceed To CheckoutC_a34174'))

WebUI.click(findTestObject('Object Repository/Remove product form carts/Page_Automation Exercise - Checkout/i_Blue Top_fa fa-times'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Remove product form carts/Page_Automation Exercise - Checkout/span_Cart is empty Click here to buy products'))


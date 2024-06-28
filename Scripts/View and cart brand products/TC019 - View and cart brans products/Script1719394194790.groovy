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

WebUI.click(findTestObject('Object Repository/View and cart brans products/Page_Automation Exercise/a_Products'))

WebUI.verifyElementVisible(findTestObject('Object Repository/View and cart brans products/Page_Automation Exercise - All Products/div_Brands (6)Polo (5)HM (5)Madame (3)Mast _49c309'))

WebUI.click(findTestObject('Object Repository/View and cart brans products/Page_Automation Exercise - All Products/a_(5)HM'))

WebUI.verifyElementVisible(findTestObject('Object Repository/View and cart brans products/Page_Automation Exercise - HM Products/div_Rs. 400Men TshirtAdd to cart'))

WebUI.click(findTestObject('Object Repository/View and cart brans products/Page_Automation Exercise - HM Products/a_(5)Madame'))

WebUI.verifyElementVisible(findTestObject('Object Repository/View and cart brans products/Page_Automation Exercise - Madame Products/div_Rs. 1500Stylish DressAdd to cart'))


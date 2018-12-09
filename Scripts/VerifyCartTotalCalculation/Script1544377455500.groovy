import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.did.ie/')

WebUI.setText(findTestObject('Page_Search_Item/input_Search_q'), 'iphone 7')

WebUI.click(findTestObject('Page_Search_Item/u_iphone'))

WebUI.click(findTestObject('Page_ClickItem/img'))

WebUI.click(findTestObject('Page_item/a_Add to Cart'))

WebUI.setText(findTestObject('Page_Qty/input_qty'), '2')

WebUI.click(findTestObject('Page_Qty/button_'))

WebUI.click(findTestObject('Page_Qty/td_1299.98'))

WebUI.verifyElementText(findTestObject('Page_Qty/td_1299.98'), '€1,299.98')

WebUI.closeBrowser()


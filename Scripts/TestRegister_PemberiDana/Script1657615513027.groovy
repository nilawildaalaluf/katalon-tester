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

WebUI.openBrowser(GlobalVariable.bash_url)

WebUI.maximizeWindow()

WebUI.click(findTestObject('registerButton'))

WebUI.click(findTestObject('Object Repository/registration/pemberiDanaCard'))

WebUI.setText(findTestObject('Object Repository/registration/namaLengkapInputText'), 'Nile QA Tester')

WebUI.setText(findTestObject('Object Repository/registration/emailUserInputText'), GlobalVariable.username)

WebUI.setText(findTestObject('Object Repository/registration/noHandphoneInputText'), '085233849842')

WebUI.setText(findTestObject('Object Repository/registration/passwordInputText'), GlobalVariable.password)

WebUI.click(findTestObject('Object Repository/registration/jenisCheckbox'))

WebUI.setText(findTestObject('Object Repository/registration/kodeReferralInputText'), '')

WebUI.selectOptionByValue(findTestObject('Object Repository/registration/informationOptionSelect'), '3', true)

WebUI.click(findTestObject('Object Repository/registration/button_Lanjutkan'))

WebUI.click(findTestObject('Object Repository/registration/validasiCheckbok1'))

WebUI.scrollToElement(findTestObject('registration/div_Bismillahirrahmanirrahim               _2fb175'), 3)

WebUI.click(findTestObject('Object Repository/registration/validasiSetujuCheckbok2'))

WebUI.click(findTestObject('Object Repository/registration/button_Lanjutkan_1'))

WebUI.click(findTestObject('Object Repository/registration/button_OK'))

WebUI.scrollToPosition(9999999, 9999999)


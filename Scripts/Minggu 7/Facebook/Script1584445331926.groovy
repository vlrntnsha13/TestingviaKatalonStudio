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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://web.facebook.com/?stype=lo&jlou=AffYlrPO7Ojc5pgyFVTB5rhyxellY4K9nAdS3hhgoCPQXkpTIkIVQ0Sl6yu-zLZkNjjAEcWUBoSnXCWjn5T2ppNzs-0F7iMYFfISskC8qtc51g&smuh=42571&lh=Ac9nj-FYFDPWQMaF')

WebUI.setText(findTestObject('Object Repository/Page_Facebook - Masuk atau Daftar/input_Kata Sandi_email'), 'valentanesa13@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Facebook - Masuk atau Daftar/input_Kata Sandi_pass'), 'ruNjZMH9B1DjfyvsbVAQtQ==')

WebUI.click(findTestObject('Object Repository/Page_Facebook - Masuk atau Daftar/input_Kata Sandi_u_0_b'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Facebook/div_0 Permintaan Pertemanan'), 3)

WebUI.click(findTestObject('Object Repository/Page_Facebook/div_0 Permintaan Pertemanan'))

WebUI.click(findTestObject('Object Repository/Page_Facebook/a_Cari Teman'))

cari_teman = WebUI.getUrl()

WebUI.verifyMatch('cari_teman', 'https://web.facebook.com/?sk=ff', false)

WebUI.click(findTestObject('Object Repository/Page_Facebook/span_Keluar'))

WebUI.closeBrowser()


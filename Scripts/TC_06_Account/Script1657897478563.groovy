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

Mobile.tap(findTestObject('TC_06_Account/android.widget.ImageView-Account'), 0)

Mobile.tap(findTestObject('TC_06_Account/android.widget.Button-Btn Edit Profile'), 0)

Mobile.tap(findTestObject('TC_06_Account/android.widget.EditText - Nama Lengkap'), 0)

Mobile.setText(findTestObject('TC_06_Account/android.widget.EditText - Nama Lengkap'), 'Cla Fara', 0)

Mobile.tap(findTestObject('TC_06_Account/android.widget.EditText - Email'), 0)

Mobile.setText(findTestObject('TC_06_Account/android.widget.EditText - Email'), 'clarisa123@gmail.com', 0)

Mobile.tap(findTestObject('TC_06_Account/android.widget.EditText - No.Handpone'), 0)

Mobile.setText(findTestObject('TC_06_Account/android.widget.EditText - No.Handpone'), '0987654567', 0)

Mobile.tap(findTestObject('TC_06_Account/android.widget.Button-Simpan Perubahan'), 0)

Mobile.tap(findTestObject('TC_06_Account/android.widget.Button-Btn Back'), 0)


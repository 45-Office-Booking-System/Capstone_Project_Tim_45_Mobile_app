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

Mobile.startApplication('C:\\Users\\ASUS\\Downloads\\app-armeabi-v7a-release (2).apk', false)

Mobile.tap(findTestObject('TC_01_Register/android.view.View-Mendaftar'), 0)

Mobile.tap(findTestObject('TC_01_Register/android.view.View-Sign Up'), 0)

Mobile.tap(findTestObject('TC_01_Register/android.widget.EditText - Email'), 0)

Mobile.setText(findTestObject('TC_01_Register/android.widget.EditText - Email'), 'clarisa123@gmail.com', 0)

Mobile.tap(findTestObject('TC_01_Register/android.widget.EditText - Name'), 0)

Mobile.setText(findTestObject('TC_01_Register/android.widget.EditText - Name'), 'Clarisa ', 0)

Mobile.tap(findTestObject('TC_01_Register/android.widget.EditText - Fullname'), 0)

Mobile.setText(findTestObject('TC_01_Register/android.widget.EditText - Fullname'), 'clarisa fara', 0)

Mobile.tap(findTestObject('TC_01_Register/android.widget.EditText - Alamat'), 0)

Mobile.setText(findTestObject('TC_01_Register/android.widget.EditText - Alamat'), 'surabaya', 0)

Mobile.tap(findTestObject('TC_01_Register/android.widget.EditText - Phone'), 0)

Mobile.setText(findTestObject('TC_01_Register/android.widget.EditText - Phone'), '08512345678', 0)

Mobile.tap(findTestObject('TC_01_Register/android.widget.EditText - Password'), 0)

Mobile.setText(findTestObject('TC_01_Register/android.widget.EditText - Password'), '12345678', 0)

Mobile.tap(findTestObject('TC_01_Register/android.widget.Button-Register'), 0)


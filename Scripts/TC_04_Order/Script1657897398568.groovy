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

Mobile.tap(findTestObject('TC_04_Order/android.widget.ImageView-Order'), 0)

Mobile.tap(findTestObject('TC_04_Order/android.view.View-Aktif'), 0)

Mobile.tap(findTestObject('TC_04_Order/android.view.View-Selesai'), 0)

Mobile.tap(findTestObject('TC_04_Order/android.widget.Button-Buat review'), 0)

Mobile.tap(findTestObject('TC_04_Order/android.view.View-Bintang 4'), 0)

Mobile.tap(findTestObject('TC_04_Order/android.widget.EditText - Ketikkan komentar Anda mengenai penyewaan Gedung ini'), 
    0)

Mobile.setText(findTestObject('TC_04_Order/android.widget.EditText - Ketikkan komentar Anda mengenai penyewaan Gedung ini'), 
    'Bagus dan harga sangat murah', 0)

Mobile.tap(findTestObject('TC_04_Order/android.widget.Button-Kirim review'), 0)

Mobile.tap(findTestObject('TC_04_Order/android.widget.Button-Btn back'), 0)


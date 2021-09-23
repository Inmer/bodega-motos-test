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
import internal.GlobalVariable
import junit.framework.Assert

import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://bodega-motos-spring.herokuapp.com/login')

WebUI.setText(findTestObject('Object Repository/Page_Bodega Motocicletas/input_Usuario_username'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Bodega Motocicletas/input_Contrasea_password'), '4nvbrPglk7k=')

WebUI.click(findTestObject('Object Repository/Page_Bodega Motocicletas/input_Contrasea_btn btn-primary btn-block'))

WebUI.click(findTestObject('Object Repository/Page_Bodega Motocicletas/a_Agencias'))

WebUI.click(findTestObject('Object Repository/Page_Bodega Motocicletas/a_Agregar Agencias'))

WebUI.click(findTestObject('Object Repository/Page_Bodega Motocicletas/button_Guardar'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Bodega Motocicletas/input_Nombre_nombre'), 0)

WebUI.closeBrowser()

package com.ultimateqa.courses.testbase;

import com.ultimateqa.courses.propertyreader.PropertyReader;
import com.ultimateqa.courses.utility.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utility {

    String browser = "Chrome";

    @BeforeMethod

    public void setUp(){
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));
    }

    @AfterMethod
    public void tearDown(){
        closeBrowser();
    }



}

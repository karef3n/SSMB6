package com.shiftedtech.qa.framework.pages;

import com.shiftedtech.qa.framework.utils.WebElementUtils;
import org.junit.Assert;

/**
 * Created by ShiftTeacher on 12/17/2017.
 */
public class PageBase extends WebElementUtils{

    public PageBase()
    {
       super();
    }

    public void verifyPageTitle(String expectedTitle){
        String title = driver.getTitle();
        Assert.assertEquals(expectedTitle,title);
    }

}

package asserts;

import io.qameta.allure.Step;
import org.testng.Assert;

public class Assertions {
    @Step("Check the '{fieldName}' field is equal '{expected}'")
    public static void expectedTextsAreEqual(String fieldName,String actual,String expected)
    {
        Assert.assertEquals(actual,expected,"String in fieldName '"+fieldName+"' should be equal to '"+expected+"'" +
                "but displayed '"+actual+"'");
    }
}

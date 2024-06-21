package Testing_Academy.com.RA_01.TESTNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LAB5 {

@Test
public void Assert(){

//        SoftAssert a = new SoftAssert();
//        a.assertEquals("Rakesh", "akesh","Not equal" );
//        System.out.println("Hi Its SOFT ASSERSTION");
//        a.assertAll();

//    Assert.assertEquals("Rakesh","akesh","Not eauql");
//    System.out.println("Hi Its me HARD ASSERTION");
    Assert.assertEquals("True","True");
    System.out.println("Hi Its me HARD ASSERTION");
    }
    @Test
    public void Assert1(){
        Assert.assertEquals("True","False");
        System.out.println("Hi Its me HARD ASSERTION");

    }
}

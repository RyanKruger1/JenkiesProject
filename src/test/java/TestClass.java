import org.testng.annotations.*;

public class TestClass extends BaseTest{

    @Test(groups = "One")
    public void testOne(){
        System.out.println("This is the first test");
    }

    @Test(groups = "Two")
    public void testTwo(){
        System.out.println("This is the second test");
    }

    @Test(groups = "Three")
    public void thirdTest(){
        System.out.println("This is the third test");
    }

    @Test(groups = "Three")
    public void fourthTest(){
        System.out.println("This is the fourth test");
    }
}


import org.testng.Assert;
import org.testng.annotations.*;

public class Testing {
    private Shturmovik shturmovik;
    @BeforeSuite//указывает, что данный метод, будет запускаться перед любым методом тестового класса.
    public void testBeforeSuite() {
        System.out.println("@BeforeSuite");
    }

    @BeforeClass// указывает, что метод будет выполнен после запуска тестового класса, но перед всеми тестовыми методами.
    public void testBeforeClass() {
        System.out.println("@BeforeClass");
    }
    @BeforeMethod//аннотированный метод будет выполняться перед каждым тестовым методом.
    public void testBeforeMethod() {
        System.out.println("@BeforeMethod");
    }
    @BeforeTest//аннотированный метод будет запускаться после всех уже запущенных тестовых методов.
    public void testBeforeTest() {
        System.out.println("@BeforeTest");
        shturmovik = new Shturmovik("Rap", 600, 1200, "KEK", "Hard");
    }

    @AfterSuite
    public void testASuite() {
        System.out.println("@AfterSuite");
    }

    @AfterClass
    public void testAClass() {
        System.out.println("@AfterClass");
    }
    @AfterMethod
    public void testAMethod() {
        System.out.println("@AfterMethod");
    }
    @AfterTest
    public void testATest() {
        System.out.println("@AfterTest");
    }

    // тест конструктора
    @Test(alwaysRun = true)
    public void testObject(){
        try{
            if(shturmovik == null)
                throw new NullPointerException();
            Assert.assertEquals(shturmovik.getName(), "KEK");//позволяющая проверять предположения о значениях произвольных данных в произвольном месте программы.
           Assert.assertEquals(shturmovik.getOil() , "Rap");
            System.out.println("@Test");
        }
        catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
    }
    //assert
    @Test(enabled = false)
    public void ExTst(){
        System.out.println("miss");
        //Assert.fail();
    }
    //timeout
    @Test(timeOut = 100)
    public void waitLongTime() throws Exception {
        Thread.sleep(10);
        System.out.println("Ignored");
    }
    //groups
    @Test(groups = {"Group"})
    public void test1Group(){
        System.out.println("method 1 test in group");
    }
    @Test(groups = {"Group"})
    public void test2Group(){
        System.out.println("method 2 test in group");
    }
    @Test(dependsOnGroups = "Group")//определеяет группы которые должны быть запу перед запускаемой данной службы
    public void testGroup(){
        System.out.println("Group test");
    }

}

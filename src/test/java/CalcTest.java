import data.StaticProvider;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class CalcTest extends BaseTest {
    Calculator calculator = new Calculator();

    @Test(priority = -1, groups = "Int")
    public void testDivInt() {
        Assert.assertEquals(calculator.div(2, 1), 2, "Неверное деление...");
    }

    @Test(dependsOnMethods = "testDivInt", groups = "Double")
    public void testDivDouble() {
        Assert.assertEquals(calculator.div(2.2, 2.2), 1.0, "Неверное деление...");
    }

    @Test(priority = 3, enabled = false, groups = "Int")
    public void testDivInt1() {
        Assert.assertEquals(calculator.div(3, 3), 1, "Неверное деление...");
    }


    @Test(priority = 5, description = "Деление целых чисел", groups = "Int")
    public void testDivInt2() {
        Assert.assertEquals(calculator.div(3, 3), 1, "Неверное деление...");
    }

    @Test(priority = 1, testName = "Деление дробных чисел", groups = "Double")
    public void testDivDouble1() {
        Assert.assertEquals(calculator.div(2.2, 2.2), 1.0, "Неверное деление...");
    }

    @Test(priority = 2, timeOut = 100, alwaysRun = true)
    public void waitTimeTest() throws InterruptedException {
        Thread.sleep(99);
    }

    @Test(invocationCount = 4, invocationTimeOut = 1000, dependsOnMethods = "testDivDouble", groups = "Double", threadPoolSize = 3)
    public void invocationCountTest() throws InterruptedException {
        Thread.sleep(900);
        Assert.assertEquals(calculator.div(20.2, 20.2), 1, "Неверное деление...");
    }

    @Test(dataProvider = "Division", dataProviderClass = GroupsTest.class, threadPoolSize = 6, groups = "Int")
    public void testDataProvider(int a, int b, int expectedResult) {
        Assert.assertEquals(calculator.div(a, b), expectedResult, "Неверное деление...");
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testExceptions() {
        System.out.println("Деление на ноль");
    }

    private int attempt = 1;

    @Test(retryAnalyzer = Retry.class)
    public void flakyTest() {
        if (attempt == 4) {
            Assert.assertTrue(true);
        } else {
            System.out.println("A isn't 6");
        }
    }


//    @Test
//    public void testSum() {
//        Assert.assertEquals(calculator.sum(2, 3), 5, "Неверная сумма...");
//    }
//
//    @Test(enabled = false)
//    public void testSum1() {
//        Assert.assertEquals(calculator.sum(2, 3), 5, "Неверная сумма...");
//    }
//
//    @Test(description = "Тест с описанием")
//    public void testSum2() {
//        Assert.assertEquals(calculator.sum(2, 3), 5, "Неверная сумма...");
//    }
//
//    @Test(testName = "Test with name")
//    public void testSum3() {
//        Assert.assertEquals(calculator.sum(2, 3), 5, "Неверная сумма...");
//    }
//
//    @Test(timeOut = 1000)
//    public void waitLongTimeTest() throws InterruptedException {
//        Thread.sleep(500);
//    }
//
//   // @Test (invocationCount = 3, invocationTimeOut = 1000, threadPoolSize = 3)
//    @Test (invocationCount = 3, invocationTimeOut = 1000, threadPoolSize = 3)
//    public void invocationCountTest() throws InterruptedException {
//        Thread.sleep(500);
//        Assert.assertEquals(calculator.sum(2, 3), 5, "Неверная сумма...");
//    }
//
////  @Test (dataProvider = "dataForSum", dataProviderClass = StaticProvider.class, threadPoolSize = 3)
//    @Test (dataProvider = "dataForSum", dataProviderClass = StaticProvider.class)
//    public void testDataProvider(int a, int b, int expectedResult) {
//        Assert.assertEquals(calculator.sum(a, b), expectedResult, "Неверная сумма...");
//    }
//
//    @Test (expectedExceptions = NullPointerException.class)
//    public void testExceptions() {
//        List list = null;
//        int size = list.size();
//    }

}

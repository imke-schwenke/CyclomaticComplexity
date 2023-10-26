package test;
import main.BranchMethod;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class BranchMethodTest {

    int starter;
    int multplier;
    int result;
    int starter2;
    int multiplier2;

    @Before public void setUp(){
        starter = 3;
        multplier = 7;
        result = 490;
        starter2 = 2;
        multiplier2 = 0;
    }

    @Test public void testMyMethodWithBranches(){
        BranchMethod testBranchMethod = new BranchMethod();
        int testResult = testBranchMethod.myMethodWithBranches(starter, multplier);
        Assert.assertEquals(testResult, result);
    }

    @Test public void testIfMultiplierEqualsZero(){
        BranchMethod testBranchMethod = new BranchMethod();
        int testResult = testBranchMethod.myMethodWithBranches(starter2, multiplier2);
        Assert.assertEquals(testResult, starter2);
    }
}

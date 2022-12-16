import org.junit.Assert;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void combinationSum() {

        int [] input = { 1,3,5,4};

        int expected = 68;
        Main obj1 = new Main();
        int actual = obj1.combinationSum(input);
        Assert .assertEquals(expected,actual);

    }
    @org.junit.jupiter.api.Test
    void combinationSum1() {

        int [] input = { 1,4,7,6,5};

        int expected = 173;
        Main obj1 = new Main();
        int actual = obj1.combinationSum(input);
        Assert .assertEquals(expected,actual);

    }

    @org.junit.jupiter.api.Test
    void combinationSum2() {

        int [] input = { 7,6,5};

        int expected = 60;
        Main obj1 = new Main();
        int actual = obj1.combinationSum(input);
        Assert .assertEquals(expected,actual);

    }

}





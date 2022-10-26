import org.junit.Assert;
import org.junit.Test;

public class test {
    @Test
    public void test1() {
        XetTN test = new XetTN();
        boolean maxLearningTime = true;
        boolean criminalRes = true;
        boolean finishProgram = false;
        double gpa = -2.0;
        boolean foreignLanguage = false;
        boolean PE = true;
        String result = "No";
        Assert.assertEquals(result, test.graduateOrNot(maxLearningTime, criminalRes, finishProgram, gpa, foreignLanguage, PE));
    }

    @Test
    public void test2() {
        XetTN test = new XetTN();
        boolean maxLearningTime = false;
        boolean criminalRes = false;
        boolean finishProgram = true;
        double gpa = 1.5;
        boolean foreignLanguage = true;
        boolean PE = false;
        String result = "No";
        Assert.assertEquals(result, test.graduateOrNot(maxLearningTime, criminalRes, finishProgram, gpa, foreignLanguage, PE));
    }

    @Test
    public void test3() {
        XetTN test = new XetTN();
        boolean maxLearningTime = true;
        boolean criminalRes = false;
        boolean finishProgram = true;
        double gpa = 3.6;
        boolean foreignLanguage = true;
        boolean PE = true;
        String result = "Yes";
        Assert.assertEquals(result, test.graduateOrNot(maxLearningTime, criminalRes, finishProgram, gpa, foreignLanguage, PE));
    }

    @Test
    public void test4() {
        XetTN test = new XetTN();
        boolean maxLearningTime = true;
        boolean criminalRes = false;
        boolean finishProgram = true;
        double gpa = 4.1;
        boolean foreignLanguage = true;
        boolean PE = true;
        String result = "No";
        Assert.assertEquals(result, test.graduateOrNot(maxLearningTime, criminalRes, finishProgram, gpa, foreignLanguage, PE));
    }
}

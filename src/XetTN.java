public class XetTN {
    int result;
    public static String graduateOrNot (boolean maxLearningTime, boolean criminalRes,
                                boolean finishProgram, double gpa,
                                boolean foreignLanguage, boolean PE) {
        if (maxLearningTime == true) {
            if (criminalRes == false) {
                if (finishProgram == true) {
                    if (gpa >= 2.0) {
                        if (foreignLanguage == true) {
                            if (PE == true) return "Yes";
                        }
                    }
                }
            }
        }
        return "No";
    }
}

public class XetTN {
    public static String graduateOrNot (boolean maxLearningTime, boolean criminalRes,
                                boolean finishProgram, double gpa,
                                boolean foreignLanguage, boolean PE) {
        if (maxLearningTime) {
            if (!criminalRes) {
                if (finishProgram) {
                    if (gpa >= 2.0) {
                        if (foreignLanguage) {
                            if (PE) return "Yes";
                        }
                    }
                }
            }
        }
        return "No";
    }
}

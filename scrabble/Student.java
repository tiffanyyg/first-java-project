package akpac;

public class Student {
    private String firstName;
    private String lastName;
    private CW001 cw001;
    private EX002 ex002;
    private CE003 ce003;

    public Student(String firstName, String lastName, CW001 cw001, EX002 ex002, CE003 ce003) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cw001 = cw001;
        this.ex002 = ex002;
        this.ce003 = ce003;
    }

    public String getModuleMarks(String moduleName) {
        if (cw001.getName().equals(moduleName)) {
            return cw001.toString();
        } else if (ex002.getName().equals(moduleName)) {
            return ex002.toString();
        } else if (ce003.getName().equals(moduleName)) {
            return ce003.toString();
        } else {
            return "";
        }
    }

    @Override
    public String toString() {
        return String.format("| %-10s | %-15s | %-15s | %-15.2f |\n", cw001.getName(), firstName, lastName, cw001.getFinalMark())
                + String.format("| %-10s | %-15s | %-15s | %-15.2f |\n", ex002.getName(), firstName, lastName, ex002.getFinalMark())
                + String.format("| %-10s | %-15s | %-15s | %-15.2f |\n", ce003.getName(), firstName, lastName, ce003.getFinalMark())
                + String.format("+------------+-----------------+-----------------+-----------------+\n");
    }
}

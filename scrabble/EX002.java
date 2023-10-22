package akpac;

public class EX002 extends Module {
    private double exam;

    public EX002(String name, int status) {
        super(name, status);
    }

    public void setExam(double exam) {
        this.exam = exam;
    }

    @Override
    public String getMarks() {
        String table = "";
        table += String.format("| %-10s | %-15s | %-15s |\n",
                "EX002", exam, getFinalMark());
        return table;
    }

    public void calculateFinalMark() {
        setFinalMark(exam);
    }
}

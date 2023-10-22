package akpac;

public class CE003 extends Module {
    private double homework1;
    private double homework2;
    private double homework3;
    private double homework4;
    private double exam;

    public CE003(String name, int status) {
        super(name, status);
    }

    public void setHomework1(double homework1) {
        this.homework1 = homework1;
    }

    public void setHomework2(double homework2) {
        this.homework2 = homework2;
    }

    public void setHomework3(double homework3) {
        this.homework3 = homework3;
    }

    public void setHomework4(double homework4) {
        this.homework4 = homework4;
    }

    public void setExam(double exam) {
        this.exam = exam;
    }

    @Override
    public String getMarks() {
        String table = "";
        table += String.format("| %-10s | %-15s | %-15s | %-15s | %-15s | %-15s |\n",
                "CE003", homework1, homework2, homework3, homework4, exam, getFinalMark());
        return table;
    }

    public void calculateFinalMark() {
        double averageHomeworkMark = (homework1 + homework2 + homework3 + homework4) / 4;
        double finalMark = (0.4 * averageHomeworkMark) + (0.6 * exam);
        setFinalMark(finalMark);
    }
}


package akpac;

public class CW001 extends Module {
    private double homework1;
    private double homework2;
    private double homework3;
    private double project;

    public CW001(String name, int status) {
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

    public void setProject(double project) {
        this.project = project;
    }

    @Override
    public String getMarks() {
        String table = "";
        table += String.format("| %-10s | %-15s | %-15s | %-15s | %-15s | %-15s |\n",
                "CW001", homework1, homework2, homework3, project, getFinalMark());
        return table;
    }

    public void calculateFinalMark() {
        double averageHomeworkMark = (homework1 + homework2 + homework3) / 3;
        double finalMark = (0.5 * averageHomeworkMark) + (0.5 * project);
        setFinalMark(finalMark);
    }
}

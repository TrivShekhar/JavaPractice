//student eligible for taking admission in class 12th with following
public class Student {
    private String name;
    private int mm;
    private int sm;
    private int cm;

    Student(String tname, int tmm, int tsm, int tcm) {
        this.name = tname;
        if (tmm <= 100) {
            this.mm = tmm;
        } else {
            System.out.println("Marks can not be more than 100");
        }
        if (tsm <= 100) {
            this.sm = tsm;
        } else {
            System.out.println("Marks can not be more than 100");
        }
        if (tcm <= 100) {
            this.cm = tcm;
        } else {
            System.out.println("Marks can not be more than 100");
        }
    }

    private String check() {
        int tot = mm + sm + cm;
        tot = tot / 3;
        if (tot > 90) {
            return "Science And Computer";
        } else if (tot <= 90 && tot > 80) {
            return "Science And Bio";
        } else {
            return "Commerce";
        }
    }

    public void display() {
        System.out.println(this.name + " is eligible for " + this.check());
    }

}
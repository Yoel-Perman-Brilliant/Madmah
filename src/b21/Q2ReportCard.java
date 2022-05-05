package b21;

public class Q2ReportCard {

    private String stuName;
    private Q2Subject[] subArray;

    public Q2ReportCard(String name, int num) {
        stuName = name;
        subArray = new Q2Subject[num];
    }

    public double average() {
        double sum = 0;
        for (int i = 0; i < subArray.length; i++) {
            sum += subArray[i].getGrade();
        }
        return sum/subArray.length;
    }

    public boolean isExcellent() {
        return average() >= 85 && allAbove54() && one100();
    }

    public boolean allAbove54() {
        for (int i = 0; i < subArray.length; i++) {
            if (subArray[i].getGrade() <= 54)
                return false;
        }
        return true;
    }

    public boolean one100() {
        for (int i = 0; i < subArray.length; i++) {
            if (subArray[i].getGrade() == 100) {
                return true;
            }
        }
        return false;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public Q2Subject[] getSubArray() {
        return subArray;
    }

    public void setSubArray(Q2Subject[] subArray) {
        this.subArray = subArray;
    }
}

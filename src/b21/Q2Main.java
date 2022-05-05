package b21;

public class Q2Main {

    public static void printExcellent(Q2ReportCard[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].isExcellent())
                System.out.println(arr[i].getStuName());
        }
    }
}

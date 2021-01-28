package Wissenskontrolle1;

public class CallbyValue_CallbyRefference {
    public static void main(String[] args) {
        Integer x = 10;
        integerRef(x);
        String[][] babo = new String[10][20];
        stringParam(babo);
        int[][] array = {{7, 7, 7, 7, 7, 7, 7},
                        {2, 3},
                        {4, 5, 6},
                        {7, 8, 9, 10},
                        {11, 12, 13, 14, 16}};
        int[] zeilenArr = getFirstLine(array);
        for (int k : zeilenArr) {
            System.out.print(k + " ");
        }
    }

    public static void integerRef(int a) {
        System.out.println(a);
    }

    public static void stringParam(String[][] blabla) {
        System.out.println("chabo");
    }

    public static int[] getFirstLine(int[][] arr) {
        int spaltenindex = 0;
        int[] tempArr = new int[arr[spaltenindex].length];
        for (int i = 0; i < arr[spaltenindex].length; i++) {
            tempArr[i] = arr[spaltenindex][i];
        }
        return tempArr;
    }

}

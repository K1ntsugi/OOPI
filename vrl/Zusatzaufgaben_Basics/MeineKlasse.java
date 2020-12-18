public class MeineKlasse {
    private String schwierigkeit;
    private int[] array;

    public MeineKlasse() {
        schwierigkeit = "leicht";
        array = new int[5];
    }

    public String getSchwierigkeit() {
        return schwierigkeit;
    }

    public void setSchwierigkeit(String s) {
        schwierigkeit = s;
    }

    public void setArray(int[] n) {
        array = n;
    }

    public int[] getArray() {
        int[] arr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arr[i] = array[i];
        }
        return arr;
    }

    public void fillArrayA(int[] n) {

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

    }

    public void fillArrayB(int[] n) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (i * 2) + 1;
        }

    }

    public void fillArrayC(int[] n) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 10;
        }
    }

    public void fillArrayD(int[] n) {
        for (int i = array.length - 1; i == 0; i--) {
            array[i] = i + 1;
        }
    }

    public void fillArrayE(int[] n) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.pow(-1, i) * (i + 1);
        }
    }
}

/*
 Nama   = Haikal Muhammad Kurniawan
 NIM    = 20220040008
 Kelas  = Ti22M
*/
//Soal C
public class bubble {
    public static void main(String args[]) {
        String arr[] = {"Semarang", "Malang", "Jakarta", "Cianjur", "Bogor", "Denpasar"};

        String temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

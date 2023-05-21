/*
 Nama   = Haikal Muhammad Kurniawan
 NIM    = 20220040008
 Kelas  = Ti22M
*/
//Soal A
public class InsertionSort {
    public static void main(String args[]) {
        int a[] = { 8, 5, 9, 6, 3, 4 };

        // Initialize min and j
        int min = a[0];
        int j = 1;

        // Iterate through the array
        for (int i = 1; i < a.length; i++) {

            // If the current element is less than min
            if (a[i] < min) {

                // Update min
                min = a[i];

                // Move j backwards until min is greater than or equal to a[j - 1]
                while (j > 0 && min < a[j - 1]) {

                    // Swap a[j] and a[j - 1]
                    int temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;

                    // Decrement j
                    j--;
                }
            }
        }

        // Print the sorted array
        for (int x = 0; x < a.length; x++) {
            System.out.println(a[x] + ",");
        }
    }
}

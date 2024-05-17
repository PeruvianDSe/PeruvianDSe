package Labs;

public class Lecture12 {
    public static void main(String[] args){
        int[] data = {40, 50, 10, 30, 20, 5};
        System.out.format("%18s", "Unsorted List is: ");
        printArray(data);
        bubbleSort(data);
        System.out.println();
        System.out.format("%18s", "SOrted List is: ");
        printArray(data);
    }

    public static void printArray(int[] num) {
        for (int i = 0; i  < num.length; i++){
            System.out.print(num[i] + " ");
        }
    }


    public static void bubbleSort(int[] num) { 
        for (int i = 0; i < num.length - 1; i++) {
            for (int j = 0; j < num.length - i - 1; j++){
                if (num[j] > num[j + 1]){
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp; 
                }
            }
        }
    }
}

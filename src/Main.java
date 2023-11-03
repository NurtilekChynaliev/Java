public class Main {

    public static void main(String[] args) {
        int[] myArray = new int[10];

        for (int i = 0; i < myArray.length; i++) {

            int numberToAdd = 9 - i;
            myArray[i] = numberToAdd;
        }

        System.out.println("Array values:");
        for (int value : myArray) {
            System.out.println(value);
        }
    }
}
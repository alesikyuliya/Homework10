import java.util.Arrays;
import java.util.Random;

public class Homework10 {

    public static void main(String[] args) {

        int[] arrayOfAllShuttles = new int[100];

        for (int index = 0, index2 = 1; index2 < arrayOfAllShuttles.length + 56; index2++) {
            int numPercent = index2 % 10;
            int numDivision = index2 / 10;
            if (numPercent != 4 && numDivision != 4 && numPercent != 9 && numDivision != 9 && numPercent != 14 && numDivision != 14){
                arrayOfAllShuttles[index++] = index2;
            }
        }
        System.out.println("All shuttle numbers: " + Arrays.toString( arrayOfAllShuttles));
    }
}

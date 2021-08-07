import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
         
    }

    public static int[] arrayExample(int[] arr) {
        int[] secondArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 4) {
               return Arrays.copyOfRange(arr, arr[i],arr.length);
            }
        }
         throw new RuntimeException();
    }

    public static boolean oneAndFour(int[] arr) {
        boolean checkerForOne=false;
        boolean checkerForFour=false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==1) {
                checkerForOne=true;
            } else if(arr[i]==4){
                checkerForFour = true;
            } else return false;
        }

        return checkerForOne && checkerForFour;
    }
}

public class NineInts {
    public static void main (String args[]) {
        // Write your code here
        int[] numbers = {10, 15, 19, 23, 26, 29, 31, 34, 38};
        System.out.println("Numbers from first to last: ");
        for(int x = 0; x < numbers.length; ++x)
            System.out.println(numbers[x]);
        System.out.println("Numbers from last to first");
        for(int x = numbers.length - 1; x >= 0; --x)
            System.out.println(numbers[x]);
    }
}

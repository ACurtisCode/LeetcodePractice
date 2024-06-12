public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // PangramCheck checker = new PangramCheck();
        // System.out.println(checker.CheckPangram("abc"));
        // System.out.println(checker.CheckPangram("abcdefghijklmnopqrstuvwxyz"));

        // MissingNumber numChecker = new MissingNumber();
        // System.out.println(numChecker.CheckNums(new int[]{0, 1, 3}));
        // System.out.println(numChecker.CheckNums(new int[]{0, 1, 2}));

        // CountSequence sequenceChecker = new CountSequence();
        // System.out.println(sequenceChecker.CountElements(new int[] {1, 2, 3, 4}));
        // System.out.println(sequenceChecker.CountElements(new int[] {1, 1, 4, 4}));
        // System.out.println(sequenceChecker.CountElements(new int[] {1, 1, 2, 2}));

        // ReversePrefix rev = new ReversePrefix();

        // System.out.println(rev.reversePrefix("abcdefd", 'd'));

        MinimumSubarray min = new MinimumSubarray();

        System.out.println(min.minSubArrayLen(7, new int[] {2,3,1,2,4,3}));
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        PangramCheck checker = new PangramCheck();
        System.out.println(checker.CheckPangram("abc"));
        System.out.println(checker.CheckPangram("abcdefghijklmnopqrstuvwxyz"));

        MissingNumber numChecker = new MissingNumber();
        System.out.println(numChecker.CheckNums(new int[]{0, 1, 3}));
        System.out.println(numChecker.CheckNums(new int[]{0, 1, 2}));
    }
}
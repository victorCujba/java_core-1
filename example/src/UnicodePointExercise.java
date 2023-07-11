public class UnicodePointExercise {

    public static void main(String[] args) {
        String str = "w3resource.com";
        int codePoint = Character.codePointBefore(str.toCharArray(), 1);
        System.out.println(codePoint);
    }

}

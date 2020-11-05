public class Print {
    private static String defString = "Print: ";

    public static void out(String msg){
        System.out.println(defString + "" + msg);
    }

    public static void out(int a, int b){
        out(Integer.toString(a+b));
    }
}

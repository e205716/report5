public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerExceptionが発生しました。");
            System.out.println("例外メッセージ: " + e.getMessage());
        }
    }
}

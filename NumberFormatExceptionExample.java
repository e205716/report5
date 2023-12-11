public class NumberFormatExceptionExample {
    public static void main(String[] args) {
        String str = "壱百満";
        try {
            int value = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}

public class Even{
    public static void main(String[] args) {
        for (int i = 1; i<50; i++) {
            if (isEven(i)) {
                System.out.println(i + " Четное");
            } else {
                System.out.println(i + " Нечетное");
            }

        }
    }

    public static boolean isEven(int n) {
        return n%2 == 0;
    }   
}
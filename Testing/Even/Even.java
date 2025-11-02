public class Even{
    public static void main(String[] args) {
        for (int i = 1; i<50; i++) { // цикл начинается с числа 1, идет до 50 и увеличивается
            if (isEven(i)) {
                System.out.println(i + " Четное");
            } else {
                System.out.println(i + " Нечетное");
            }

        }
    }

    public static boolean isEven(int n) { // метод который считает четность числа
        return n%2 == 0;
    }   
}
@SuppressWarnings("unused")
class program{

    public static void main(String[] args) {
        
        calculator calc = new calculator();
        int result = calc.sum(10, 12);
        System.out.println(result);

        System.out.println(calc.sum (10, 15));
    }
}

class calculator{

    int sum(int a, int b){

        return a + b; // метод возвращает сумму
    }
}
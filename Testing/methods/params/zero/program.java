@SuppressWarnings("unused")
class program{

    public static void main(String[] args) {
        calculator calc = new calculator();

        calc.sum("Sum of {1, 2 , 3}: ", 1, 2, 3);
        calc.sum("Zero sum: ");
    }
}

class calculator{

    void sum(String message, int ...nums){

        System.out.println(message);
        int result = 0;

        for (int n: nums){
            result += n;
        }

        System.out.println(result);
    }
}
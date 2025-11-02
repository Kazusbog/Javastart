@SuppressWarnings("unused")
class program{
    public static void main(String[] args) {
        
        calculator calc = new calculator();
        
        calc.sum(1, 2, 3);
        calc.sum(1, 3, 4, 5);
        calc.sum();
    }
}

class calculator{

    void sum(int ...nums){ // параметр бесконечен и определен только лишь типом int

        int result = 0;
        for (int n: nums){
            result += n;
        }
        System.out.println(result);
    }
}
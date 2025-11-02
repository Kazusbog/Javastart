@SuppressWarnings("unused")
class program{

    public static void main(String[] args) {
        
        calculator calc = new calculator();
        calc.sum(1,2); // первое и второе число - параметры передавыаемые в тело метода
        calc.sum(2,3);
        calc.sum(3,2); 
    }
}
class calculator{

    void sum(int a, int b){ // параметры метода типа int

        int result = a + b;
        System.out.println(result);
    }
}
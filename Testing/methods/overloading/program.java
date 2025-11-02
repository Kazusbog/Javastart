@SuppressWarnings("unused")
class program{

    public static void main(String[] args) {
        
        calculator calc = new calculator();

        System.out.println(calc.sum(2, 3));
        System.out.println(calc.sum(4.5, 3.2));
        System.out.println(calc.sum(4, 3, 7));

    }
}

class calculator{

    int sum(int x, int y){

        return x + y;
    }

    double sum(double x, double y){

        return x + y;
    }

    int sum(int x, int y, int z){

        return x + y + z;
    }
}
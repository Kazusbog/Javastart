class superclass { // родительский класс
    int i, j; // задали два числа

    void showij(){ // метод который выдает i и j
    System.out.println("i и j: " +i + " " + j);
    }
}


class subclass extends superclass{ // новый класс, наследующий родителя - superclass
    int k; // задаем новое число k

    void showk(){ // метод выдает число k
        System.out.println("k: " +k);
    }
    void sum(){ // метод считающий сумму числа из родительского класса и наследующего
        System.out.println("i+j+k: " + (i+j+k));
    }

}

class SimpleInheritance {
    public static void main(String[] args){
       superclass superOb = new superclass(); // задаем объект родительского метода
       subclass subOb = new subclass(); // задаем объект наследующего метода

       superOb.i = 10; // задали число для переменной i из родительского
       superOb.j = 20; // задали число для переменной j из родительского
       System.out.println("Содержимое объекта superOb: "); 
       superOb.showij();
       System.out.println();

       subOb.i = 15;
       subOb.j = 14;
       subOb.k = 88; // задали число для переменной k из наследующего
       System.out.println("Содержимое обчъекта subOb: ");
       subOb.showij();
       subOb.showk();

       System.out.println();
        System.out.println("Сумма чисел i,j,k в subOb: " );
        subOb.sum(); // запускаем метод sum, который объединяет в себе объекты из двух классов, один из которых наследующий
    }

}
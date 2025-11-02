class animal{ // родительский класс
    String name;

    public void eat() { // метод родителя
        System.out.println(name + "ест");
    }
}

class dog extends animal{ // наследующий класс
    public void bark() { // метод наследующего
        System.out.println(name + "лает");
    }
}

public class main{
    public static void main(String[] args){ // в методе запускаем два метода из двух разных классов и они работают, так как один является родителем другого
        dog dog1 = new dog();
        dog1.name = "Шарик ";
        dog1.eat();
        dog1.bark();
    }
}
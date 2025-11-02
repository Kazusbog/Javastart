class Person {
    String name;
    int age;

    void printname(){ // метод вызывает имя
            System.out.printf("Name %s\n", name);
        }

    void printage(){ // метод вызывает возраст
        System.out.printf("Age: %d\n", age);
    }

    void print(){ // метод запускает два предыдущих метода
        printname();
        printage();
    }
}
  

@SuppressWarnings("unused")
class Program{
    public static void main(String[] args){ // мейн метод задает объект из класса Person и вызывает метод print
        
        Person vadim = new Person();

        vadim.name = "Vadim";
        vadim.age = 19;
        vadim.print();
    }
}
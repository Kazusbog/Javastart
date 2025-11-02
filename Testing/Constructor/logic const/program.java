@SuppressWarnings("unused")
class program{

    public static void main(String[] args) {
        
        person vadim = new person(); /// вызов конструктора который мы сами определили
        vadim.print();
    }
}
class person{

    String name;
    int age;

    person(){  // конструктор в который передаем значения параметров

        System.out.println("Создание объекта person"); 
        name = "Vadim";
        age = 19;
    }

    void print(){

        System.out.printf("Name: %s; Age: %d\n", name, age);
    }
}
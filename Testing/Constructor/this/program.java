@SuppressWarnings("unused")
class program{

    public static void main(String[] args) {
        
        person vadim = new person();
        person sofa = new person("Sofa");
        person sasha = new person("Sasha", 19);

        vadim.print();
        sofa.print();
        sasha.print();
    }
}

class person{

    String name;
    int age;

    person()
    {
        this("Unknown", 19);
    }

    person(String name)
    {
        this(name, 19);
    }

    person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    void print(){

        System.out.printf("Name: %s; Age: %d\n", name, age);
    }
}
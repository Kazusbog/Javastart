@SuppressWarnings("unused")
class program{

    public static void main(String[] args) {
        
        person undef = new person();
        undef.print();

        person vadim = new person("Vadim", 19);
        vadim.print();
    }
}

class person{

    String name;
    int age;

    {
        name = "Unknown";
        age = 19;
    }

    person() {}

    person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    void print(){

        System.out.printf("Name: %s; Age: %d\n", name, age);
    }
}
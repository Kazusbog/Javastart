@SuppressWarnings("unused")
class program{

    public static void main(String[] args) {
        person vadim = new person();
        person goshan = new person("Goshan");
        person vados = new person("Vados", 19); /// вызов всех конструкторов

        vadim.print();
        goshan.print();
        vados.print();
    }
}

class person{

    String name;
    int age;

    person(){ /// конструктор без параметров
        name = "Неизвестно";
        age = 19;
    }

    person(String username, int userage){ /// конструктор с двумя параметрами
        name = username;
        age = userage;
    }

     person(String username){ /// конструктор с одним параметром
        name = username;
        age = 228;
    }

    void print(){

        System.out.printf("Name: %s, age: %d\n", name, age);
    }
}
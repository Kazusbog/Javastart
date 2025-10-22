public class privat {
    public static void main(String[] args) {
        privatny p = new privatny();
        p.setAge(-5); // Попытка установить отрицательный возраст
        p.setAge(25);
        System.out.println("Возраст: " + p.getAge());
    }
}

class privatny {
    private String name;
    private int age;

    public void setAge(int age) {
    if (age >= 0) {
        this.age = age;
    } else {
        System.out.println("Возраст не может быть отрицательным.");
    }

    }
    public int getAge() {
        return age;
    }
    public void setName(String name) {
    this.name = name;
    }

    public String getName() {
    return name;
    }
}




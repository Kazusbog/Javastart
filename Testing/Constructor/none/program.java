@SuppressWarnings("unused")
class program{

    public static void main(String[] args) {
        
        person vadim = new person();

        vadim.name = "vadim";
        vadim.age = 19;

        vadim.print();
    }
}
class person{

    String name;
    int age;

    void print(){

        System.out.printf("Name %s; Age %d\n", name, age);
    } 
}
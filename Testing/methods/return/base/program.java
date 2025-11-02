@SuppressWarnings("unused")
class program{

    public static void main(String[] args) {
        
        person vadim = new person();
        System.out.println(vadim.sayhello()); // вызов метода sayhello

        String message = vadim.sayhello();
        System.out.println(message);
    }
}
class person{

    String sayhello(){

        return "Hello"; // метод возвращает строку hello
    }
}
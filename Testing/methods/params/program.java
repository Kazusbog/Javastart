@SuppressWarnings("unused")
class program{
    public static void main(String[] args){

        person vadim = new person();
        vadim.say("Hello work"); // параметр в скобках
        vadim.say("Hello gold");
    }
}

class person{

    void say(String message){ // параметр метода String message
        System.out.println(message);
    }
}
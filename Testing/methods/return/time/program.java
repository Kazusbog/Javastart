@SuppressWarnings("unused")
class program{

    public static void main(String[] args) {
        
        time time = new time(); // метод вызывает нужное значение из return метода asString
            System.out.println(time.asString(5));
            System.out.println(time.asString(13));
            System.out.println(time.asString(18));           
            System.out.println(time.asString(2));
            
    }
}

class time{

    String asString(int hour){

        if (hour>24 || hour<0)
        return "Invalid Data";
        
        else if (hour>21 || hour<6)
        return "Good Night";

        else if (hour >= 15)
        return "Good evening";

        else if (hour>=11)
        return "Good Afternoon";

        else
        return "Good Morning";
    }
}
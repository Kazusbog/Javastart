@SuppressWarnings("unused")
class program{

    public static void main(String[] args){

    furniture bed = new furniture();

    bed.print();
    }
}

class furniture{ 

    int price;
    double width;
    String furnitureName;

    furniture()
    {
        this.price = 2000;
        this.width = 15.2;
        this.furnitureName = "Кровать из красного дерева";
    }

    void print(){

        System.out.printf("Price: %d$; Width: %.1f inch; Name: %s\n", price, width, furnitureName);
    }

} 
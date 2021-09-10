package encapsulation;

public class EncapsulationDemo {
    public static void main(String[] args) {
        Encapsulation encapsulation = new Encapsulation();
        encapsulation.doWork();

        Laptop l1 = new Laptop();
        l1.setPrice(31);
    }
}

class Laptop{

    int ram;
    private int price;  //For Encapsulation, cannot access directly

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price){
        boolean isAdmin = false;

        if(!isAdmin){
            System.out.println("You cannot set the Price");
        }else {
            this.price = price;
        }
    }

}


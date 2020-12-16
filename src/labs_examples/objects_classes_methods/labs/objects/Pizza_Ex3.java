package labs_examples.objects_classes_methods.labs.objects;

public class Pizza_Ex3 {
    public static void main(String[] args) {

        Pizza a = new Pizza("M", "Pepperoni, Suasage", true);
        Pizza b = new Pizza("L", "Supreme", true);
        Pizza c = new Pizza("S", "Cheese", false);
        System.out.println(a.toString());
        System.out.println();
        System.out.println(b.toString());
        System.out.println();
        System.out.println(c.toString());

    }
}
class Pizza{
    String toppings;
    String size;
    boolean delivery;


    public Pizza(String size, String toppings, boolean delivery){
        this.size = size;
        this.toppings = toppings;
        this.delivery = delivery;

    }

    @Override
    public String toString() {
        return "Pizza{" +
                "toppings='" + toppings + '\'' +
                ", size='" + size + '\'' +
                ", delivery=" + delivery +
                '}';
    }
}
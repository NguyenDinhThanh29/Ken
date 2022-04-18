public class Product {
    private String name;
    private float price;
    private int quantity;
    private int id;
    public Product(String ChocopieCake, int i, float p, int qua) {
        name = ChocopieCake;
        id = i;
        price = p;
        quantity = qua;
    }
    public String getName(){
        return name;
    }
    public float getPrice(){
        return price;
    }
    public int getQuantity(){
        return quantity;
    }
    public int getId(){
        return id;
    }
    public static void main(String[]args){
        Product a1 = new Product("ChocopieCake",1,25000,3);
        System.out.println("Id : "+a1.getId());
        System.out.println("Products : "+a1.getName());
        System.out.println("Quantity : "+a1.getQuantity());
        System.out.println("Price : "+a1.getPrice());
    }
}

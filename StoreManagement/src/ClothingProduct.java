public class ClothingProduct extends Product
{
    private String size;

    public ClothingProduct(int id, String name, double price, int quantity, String size) 
    {
        super(id, name, price, quantity);
        this.size = size;
    }

    public String getSize() 
    {
        return size;
    }

    public void setSize(String size) 
    {
        this.size = size;
    }
    
    @Override
    public String getCategory()
    {
        return "Clothing";
    }
    
    @Override
    public double calculateDiscountedPrice(double percent) 
    {
        return getPrice() * (1 - percent / 100);
    }
}
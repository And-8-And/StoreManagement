public class ElectronicProduct extends Product
{
    private int warranty;

    public ElectronicProduct(int id, String name, double price, int quantity, int warranty) 
    {
        super(id, name, price, quantity);
        this.warranty = warranty;
    }

    public int getWarranty() 
    {
        return warranty;
    }

    public void setWarranty(int warranty) 
    {
        this.warranty = warranty;
    }
    
    @Override
    public double calculateDiscountedPrice(double percent) 
    {
        return getPrice() * (1 - percent / 100);
    }
    
    @Override
    public String getCategory()
    {
        return "Electronics";
    }
}
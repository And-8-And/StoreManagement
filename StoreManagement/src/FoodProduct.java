public class FoodProduct extends Product
{
    private String expirationDate;

    public FoodProduct(int id, String name, double price, int quantity, String expirationDate) 
    {
        super(id, name, price, quantity);
        this.expirationDate = expirationDate;
    }

    public String getExpirationDate() 
    {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) 
    {
        this.expirationDate = expirationDate;
    }
    
    @Override
    public String getCategory()
    {
        return "Grocery";
    }
    
    @Override
    public double calculateDiscountedPrice(double percent) 
    {
        return getPrice() * (1 - percent / 100);
    }
}
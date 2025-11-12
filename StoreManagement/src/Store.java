import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Store 
{
    private String name;
    private String city;
    private List<Product> products;

    public Store(String name, String city, List<Product> products) 
    {
        this.name = name;
        this.city = city;
        
        if (products != null)
        {
            this.products = products;
        }
        else
        {
            this.products = new ArrayList<>();
        }
    }
    
    public Store(String name, String city) 
    {
        this(name, city, new ArrayList<>());
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public String getCity() 
    {
        return city;
    }

    public void setCity(String city) 
    {
        this.city = city;
    }

    public List<Product> getProducts() 
    {
        return products;
    }

    public void setProducts(List<Product> products) 
    {
        this.products = products;
    }
    
    public void addProduct(Product p)
    {
        products.add(p);
    }
    
    public void addProduct(String name, double price, int quantity)
    {
        try 
        {
            if (quantity < 0) 
            {
                throw new InvalidStockOperationException("Quantity cannot be negative", 101);
            }

            products.add(new FoodProduct(ShopManager.getNextProductId(), name, price, quantity, "N/A"));
        } 
        catch (InvalidStockOperationException e) 
        {
            System.err.println(e);
            
            JOptionPane.showMessageDialog(null, e.toString() + "\n" + e.toStringInt(), "Stock Error", JOptionPane.ERROR_MESSAGE);
        } 
        finally 
        {
            System.out.println("addProduct attempt finished for: " + name);
        }

    }
    
    @Override
    public String toString() 
    {
        return name + " (" + city + ") - " + products.size() + "product";
    }
    
    public String detailedToString()
    {
        StringBuilder sb = new StringBuilder();
        
        sb.append("Shop: ").append(name).append(" (").append(city).append(" )\n");
        
        sb.append("Products: \n");
        for (int i = 0; i < products.size(); i++)
        {
            sb.append(" - ").append(products.toString()).append("\n");
        }
        
        return sb.toString();
    }
}
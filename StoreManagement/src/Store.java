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
    
    public void addProduct(Product p) throws InvalidStockOperationException
    {
            if (p.getQuantity() < 0) 
            {
                throw new InvalidStockOperationException("Quantity cannot be negative", 101);
            }
            
            if (p.getPrice() < 0) 
            {
                throw new InvalidStockOperationException("Price cannot be negative", 102);
            }
            
            products.add(p);
    }
    
    @Override
    public String toString() 
    {
        return name + " (" + city + ") - " + products.size() + " product(s)";
    }
    
    public String detailedToString()
    {
        StringBuilder sb = new StringBuilder();
        
        sb.append("Shop: ").append(name).append(" (").append(city).append(")\n");
        sb.append("Products:\n");
        
        if (products.isEmpty())
        {
            sb.append(" - No products available.\n");
        }
        else
        {
            for (int i = 0; i < products.size(); i++)
            {
                Product p = products.get(i);
                sb.append(" - ").append(p.toDetailedString()).append("\n");
            }
        }
        
        return sb.toString();
    }
}
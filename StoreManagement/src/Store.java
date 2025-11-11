import java.util.ArrayList;
import java.util.List;

public class Store 
{
    private String name;
    private String city;
    private List<Product> products;

    public Store(String name, String city, List<Product> products) 
    {
        this.name = name;
        this.city = city;
        this.products = new ArrayList<>();
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
}
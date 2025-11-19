public abstract class Product implements Discountable
{
    protected int id;
    private String name;
    private double price;
    private int quantity;

    private static int nextId = 1;
    
    public Product(int id, String name, double price, int quantity) 
    {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        
        if (id >= nextId) 
        {
            nextId = id + 1;
        }
    }

    public int getId() 
    {
        return id;
    }
    
    public static int getNextId()
    {
        return nextId;
    }

    public void setId(int id) 
    {
        this.id = id;
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public double getPrice() 
    {
        return price;
    }

    public void setPrice(double price) 
    {
        this.price = price;
    }

    public int getQuantity() 
    {
        return quantity;
    }

    public void setQuantity(int quantity) 
    {
        this.quantity = quantity;
    }
    
    public abstract String getCategory();
    
    public String toString()
    {
        return name + " [" + getCategory() + "] - " + price + " lei, " + quantity + " buc.";
    }
    
    public String toDetailedString()
    {
        return "ID: " + id + ", " + name + " [" + getCategory() + "], Price: " + price + ", Quantity: " + quantity;
    }
    
    @Override
    public boolean equals(Object o) 
    {
        if (this == o) 
        {
            return true;
        }
        
        if (!(o instanceof Product)) 
        {
            return false;
        }
    
        Product p = (Product) o;
        return this.getId() == p.getId();
    }
}
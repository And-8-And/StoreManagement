import java.util.ArrayList;
import java.util.List;

public class ShopManager 
{
    private static int nextProductId = 1;
    private List<Store> stores;
    
    public ShopManager()
    {
        this.stores = new ArrayList<>();
    }

    public static int getNextProductId() 
    {
        return nextProductId++;
    }

    public List<Store> getStores() 
    {
        return stores;
    }

    public void setStores(List<Store> stores) 
    {
        this.stores = stores;
    }
}
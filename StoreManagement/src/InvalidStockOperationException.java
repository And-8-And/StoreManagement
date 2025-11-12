public class InvalidStockOperationException extends Exception
{
    private int errorCode;
    
    public InvalidStockOperationException(String message, int errorCode)
    {
        super(message);
        this.errorCode = errorCode;
    }

    public int getErrorCode() 
    {
        return errorCode;
    }

    public void setErrorCode(int errorCode) 
    {
        this.errorCode = errorCode;
    }
    
    @Override
    public String toString() 
    {
        return "Invalid Stock Operation Exception: " + getMessage();
    }
    
    public String toStringInt() 
    {
        return "Error Code: " + errorCode;
    }
}

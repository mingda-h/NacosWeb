package MDException;

public abstract class MDBaseException  extends Exception{

    private String message;

    public MDBaseException(String msg)
    {
        this.message = msg;
    }
    public MDBaseException(){}
    public String getMessage() {
        return message;
    }

}

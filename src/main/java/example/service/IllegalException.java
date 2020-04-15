package example.service;

/**
 * @author fstar
 */
public class IllegalException  extends RuntimeException{
    private String exceptionMsg;

    public IllegalException(String exceptionMsg){
        this.exceptionMsg = exceptionMsg;
    }

    public void setExceptionMsg(String exceptionMsg) {
        this.exceptionMsg = exceptionMsg;
    }

    public String getExceptionMsg() {
        return exceptionMsg;
    }
}

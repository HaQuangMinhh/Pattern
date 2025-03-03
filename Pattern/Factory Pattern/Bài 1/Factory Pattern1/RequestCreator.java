import java.time.LocalDate;

public abstract class RequestCreator {

    abstract RequestProduct createRequest(); 

    public void processRequest( String priority , LocalDate expire , String status ) {
        RequestProduct request = createRequest() ; 

        request.setPriority(priority);
        request.setExpire(expire);
        request.setStatus(status);

        request.processRequest();
    }

}

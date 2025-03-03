import java.time.LocalDate;

public class MediumPriorityConcrete implements RequestProduct{

    private String priority;
    private String status;
    private LocalDate expireDate;

    @Override
    public void processRequest() {
        System.out.println("Request denied");
    }

    @Override
    public void setExpire(LocalDate expire) {
        this.expireDate = expire;
    }

    @Override
    public void setPriority(String priority) {
        this.priority = priority ;
    }

    @Override
    public void setStatus(String status) {
        this.status = status ; 
    }

}

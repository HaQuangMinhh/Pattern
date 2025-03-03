import java.time.LocalDate;

public class HighPriorityConcrete implements RequestProduct {

    private String priority;
    private String status;
    private LocalDate expireDate;


    @Override
    public void processRequest() {
        System.out.println("Emergency request, our Administer will contact you immediately !");
    }

    @Override
    public void setExpire(LocalDate expire) {
        this.expireDate = LocalDate.now();
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

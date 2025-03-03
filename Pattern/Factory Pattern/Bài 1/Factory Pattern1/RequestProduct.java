import java.time.LocalDate;

public interface RequestProduct {

    void setPriority ( String priority ) ;
    void setExpire  ( LocalDate expire );
    void setStatus ( String status );

    void processRequest() ;
}

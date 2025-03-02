public class Document {

    private String extension ; 
    private boolean encryption ;


    
    public Document(String extension, boolean encryption) {
        this.extension = extension;
        this.encryption = encryption;
    }

    @Override
    public String toString() {
        return "Document [extension=" + extension + ", encryption=" + encryption + "]";
    } 

}

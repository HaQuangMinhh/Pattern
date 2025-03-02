public interface DocumentBuilder {

    DocumentBuilder setExtension( String extension ) ;  // txt zip 
    DocumentBuilder setEncryption ( boolean encryption );   // T F 

    Document buildDoc(); 

}

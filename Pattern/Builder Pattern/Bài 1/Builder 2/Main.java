public class Main {


    public static void main(String[] args) {
        
        DocumentBuilder twoDocs = new TwoDocs() ; 

        twoDocs.setEncryption(false);
        twoDocs.setExtension("txt");

        Document doc = twoDocs.buildDoc(); 

        System.out.println(doc);
        
        System.out.println("---------------------------------------------");
        Document doc2 = new TwoDocs()
            .setExtension("txt")
            .setEncryption(true)
            .buildDoc();

        System.out.println(doc2);

    }


}

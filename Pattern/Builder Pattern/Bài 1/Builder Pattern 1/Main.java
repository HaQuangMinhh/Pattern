public class Main {

    public static void main(String[] args) {

        // -------------------Permanent------------------------------------------
        System.out.println("------------------Permanent---------------------");

        ContractBuilder permanent = new PermanentContractBuilder();
        ContractDirector director1 = new ContractDirector(permanent);
        Contract permanentContract = director1.buildContract("S101", "hehe", "1233456", (double) 6000);

        System.out.println(permanentContract);

        // -------------------Long Term------------------------------------------
        System.out.println("------------------Long Term---------------------");

        ContractBuilder longTerm = new PermanentContractBuilder();
        ContractDirector director2 = new ContractDirector(longTerm);
        Contract longTermContract = director2.buildContract("S102", "hehe55", "123156", (double) 9000);

        System.out.println(longTermContract);

        // -------------------Short Term------------------------------------------
        System.out.println("------------------Short Term---------------------");

        ContractBuilder shortTerm = new ShortTermContractBuilder(); 
        ContractDirector director3 = new ContractDirector(shortTerm);
        Contract shortTermContract = director3.buildContract("S109", "hehe00", "123", (double) 60110);

        System.out.println(shortTermContract);
    }

}

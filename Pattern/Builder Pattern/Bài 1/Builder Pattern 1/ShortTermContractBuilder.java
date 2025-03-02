public class ShortTermContractBuilder implements ContractBuilder {

    private String contractID ; 
    private double rentAmount ; 
    private String tenantID ; 
    private String propertyID ; 

    @Override
    public void buildContractID(String id) {
        this.contractID = id ;  
    }

    @Override
    public void buildPropertyID(String id) {
        this.propertyID = id ; 
        
    }

    @Override
    public void buildRentAmount(double amount) {
        this.rentAmount = amount ; 
        
    }

    @Override
    public void buildTenantID(String id) {
        this.tenantID = id ; 
        
    }

    @Override
    public Contract signContract() {
        return new Contract(contractID, propertyID, tenantID, rentAmount);
    }

}

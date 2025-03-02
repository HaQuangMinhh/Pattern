public class ContractDirector {

    private ContractBuilder builder ; // tạo hợp đồng có tổ chức 

    public ContractDirector(ContractBuilder builder) {
        this.builder = builder;
    }

    public Contract buildContract( String contractID , String propertyID , String tenantID , Double rentAmount ) {
        builder.buildContractID(contractID);
        builder.buildPropertyID(propertyID);
        builder.buildTenantID(tenantID);
        builder.buildRentAmount(rentAmount);
        
        return builder.signContract();
    }

}

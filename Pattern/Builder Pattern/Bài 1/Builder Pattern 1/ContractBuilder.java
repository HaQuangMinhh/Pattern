public interface ContractBuilder {  // Quy trình tạo hợp đồng 

    void buildContractID( String id ); 
    void buildPropertyID( String id );
    void buildTenantID( String id ); 
    void buildRentAmount( double amount ); 

    Contract signContract(); // giống pizza build
}

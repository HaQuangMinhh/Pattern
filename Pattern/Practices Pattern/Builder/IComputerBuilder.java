public interface IComputerBuilder {

    void setMotherBoard ( String motherBoard ) ;
    void setPowerSupply ( String powerSupply ) ;
    void setGpu ( String gpu );
    void setStorage ( String storage );
    void setCoolingSystem ( boolean cooling );

    Computer buildComputer() ; 

}

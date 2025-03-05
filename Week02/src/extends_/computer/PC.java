package extends_.computer;

public class PC extends Computer{
    private String brand;

    public PC(){}

    public PC(String cpu,String internalMemory,String hardDisk,String brand){
        super(cpu,internalMemory,hardDisk);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void printInfo(){
        System.out.println(getCpu()+getInternalMemory()+getHardDisk()+getBrand());
        System.out.println(getDetails() + getBrand());
    }
}

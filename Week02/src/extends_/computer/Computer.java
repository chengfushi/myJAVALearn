package extends_.computer;

public class Computer {
    private String cpu;
    private String internalMemory;
    private String hardDisk;

    public Computer(){}

    public Computer(String cpu, String internalMemory, String hardDisk) {
        this.cpu = cpu;
        this.internalMemory = internalMemory;
        this.hardDisk = hardDisk;
    }

    public String getInternalMemory() {
        return internalMemory;
    }

    public void setInternalMemory(String internalMemory) {
        this.internalMemory = internalMemory;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {

        this.cpu = cpu;
    }

    public String getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(String hardDisk) {
        this.hardDisk = hardDisk;
    }

    public String getDetails(){
        return "cpu: " + cpu + " internalMemory: " + internalMemory + " hardDisk: " + hardDisk;
    }

}

package oop;

// atributy: cpu, gpu, ram, motherboard, diskdrive
// udělat construktor pro 0 parametrů a contructor pro všechny parametry
// udělat gettery + settery pro všechny atributy
// vyzkoušet třídu - udělat novou instanci a vyplnit všechny atributy

public class Computer {

    String cpu;
    String gpu;
    String ram;
    String motherboard;
    String diskdrive;
    
    public Computer() {
        
    }

    public Computer(String cpu, String gpu, String ram, String motherboard, String diskdrive) {
        this.cpu = cpu;
        this.gpu = gpu;
        this.ram = ram;
        this.motherboard = motherboard;
        this.diskdrive = diskdrive;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }

    public String getDiskdrive() {
        return diskdrive;
    }

    public void setDiskdrive(String diskdrive) {
        this.diskdrive = diskdrive;
    }
}

package org.launchcode;

import java.util.ArrayList;


public  abstract class DiscContent  extends BaseDisc{
    private double capacity;
    private final ArrayList<Data> files = new ArrayList<>();


    public DiscContent(String name, String discType, int spinRate, double capacity) {
        super(name, discType, spinRate);
        capacity = capacity;


    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public ArrayList<Data> getFiles() {
        return files;
    }

    @Override
    public String toString() {
        String newline=System.lineSeparator();

        return super.toString() +
                "Capacity: " + capacity + "MB" + newline +
                "Space Used: " + getSpaceUsed() + "MB" + newline +
                "Available Space: " + getSpaceAvailable() +"MB" + newline;
    }
    public String getFormattedFileList(String header){
        StringBuilder fileList=new StringBuilder();
        String newLine = System.lineSeparator();
        if(files.size()>0){
            fileList.append(newLine).append(header).append(":");
            for(Data file :files){
                fileList.append(newLine).append("\t").append(file);
            }

        }
        return  fileList.toString();

    }
    public boolean fileIsPresent(Data file){
        if(getFiles().contains(file)){
            return true;

        }else{
            System.out.println("That file doesnot exist on this " +getDiscType()+".");
            return false;
        }
    }
    public double getSpaceUsed(){
        int total=0;
        for(Data file :files){
            total+=file.getSize();
        }
        return total;
    }
    public double getSpaceAvailable(){
        if(capacity==0){
            return 0;

        }
        return  capacity+getSpaceUsed();

    }
}

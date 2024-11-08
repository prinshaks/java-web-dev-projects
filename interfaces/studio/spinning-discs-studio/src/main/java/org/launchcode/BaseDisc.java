package org.launchcode;

public abstract class BaseDisc {
    private static int nextId=1;
    private final int id;
    private String name;
    private String discType;
    private int rpm;

    public BaseDisc(String name, String discType, int rpm) {
        this.id = nextId;
        this.name = name;
        this.discType = discType;
        this.rpm = rpm;
        nextId++;
    }

    public static int getNextId() {
        return nextId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    public String getDiscType() {
        return discType;
    }

    public int getRpm() {
        return rpm;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }

    public void setRpm(int rpm) {
        this.rpm = rpm;
    }

    @Override
    public String toString() {
        String newline=System.lineSeparator();
        String asteriks="******";
        return newline+asteriks+ name +asteriks+newline+
                "id=" + id +newline+
                "discType=" + discType + newline +
                "spinRate=" + rpm +newline;

    }
    public void spinDisc(){
       System.out.println("The Disc "+name+" is Spinning at "+rpm+"RPM");
    }
}

package Appointment;

public class appoint {
 
    private int AppointID;
    private String AppointName;
    private String AppointPhone;
    private String AppointEmail;
    private String AppointSpecial;

    public int getAppointID() {
        return AppointID;
    }

    public void setAppointID(int AppointID) {
        this.AppointID = AppointID;
    }

    public String getAppointName() {
        return AppointName;
    }

    public void setAppointName(String AppointName) {
        this.AppointName = AppointName;
    }

    public String getAppointPhone() {
        return AppointPhone;
    }

    public void setAppointPhone(String AppointPhone) {
        this.AppointPhone = AppointPhone;
    }

    public String getAppointEmail() {
        return AppointEmail;
    }

    public void setAppointEmail(String AppointEmail) {
        this.AppointEmail = AppointEmail;
    }

    public String getAppointSpecial() {
        return AppointSpecial;
    }

    public void setAppointSpecial(String AppointSpecial) {
        this.AppointSpecial = AppointSpecial;
    }

    public void setAppointID(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
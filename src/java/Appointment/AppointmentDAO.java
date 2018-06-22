
package Appointment;

import java.util.List;


public interface AppointmentDAO {
    public abstract void insert(appoint a);
    public abstract void update(appoint a);
    public abstract void delete(int pid);
    
    public abstract appoint getappoint(int pid);
    public abstract List<appoint> getappoint();
}

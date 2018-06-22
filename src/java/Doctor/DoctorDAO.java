package Doctor;

import java.util.List;

public interface DoctorDAO {

    public abstract void insert(Doctor p);
    public abstract void update(Doctor p);
    public abstract void delete(int pid);
    
    public abstract Doctor getDoctor(int pid);
    public abstract List<Doctor> getDoctor();
    
}

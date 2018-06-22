package profiles;

import java.util.List;

public interface ProfilesDAO {

    public abstract void insert(Profiles p);
    public abstract void update(Profiles p);
    public abstract void delete(int pid);
    
    public abstract Profiles getProfiles(int pid);
    public abstract List<Profiles> getProfiles();
    
}

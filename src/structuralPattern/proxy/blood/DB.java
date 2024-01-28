package structuralPattern.proxy.blood;

import java.util.List;

public interface DB {
    BloodSample getById(int id);
    List<BloodSample> find(String request);
}

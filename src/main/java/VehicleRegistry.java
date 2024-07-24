import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {

    private final HashMap<LicensePlate, String> owners;

    public VehicleRegistry() {
        this.owners = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (!owners.containsKey(licensePlate)) {
            owners.put(licensePlate, owner);
            return true;
        }
        return false;
    }

    public String get(LicensePlate licensePlate) {
        return owners.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate) {
        return owners.remove(licensePlate) != null;
    }

    public void printLicensePlates() {
        for (LicensePlate licensePlate : this.owners.keySet()) {
            System.out.println(licensePlate);
        }
    }

    public void printOwners() {
        ArrayList<String> uniqueOwners = new ArrayList<>();
        for (String toPrint : this.owners.values()) {
            if (uniqueOwners.contains(toPrint)) {
                continue;
            } else {
                uniqueOwners.add(toPrint);
            }
        }
        for (String owner : uniqueOwners) {
            System.out.println(owner);
        }
    }
}

import java.util.HashMap;
import java.util.Map;

public class GovernmentRegistry {
    private static GovernmentRegistry instance;
    private Map<String, CitizenInfo> citizenRegistry;

    private GovernmentRegistry() {
        citizenRegistry = new HashMap<>();
    }

    public static synchronized GovernmentRegistry getInstance() {
        if (instance == null) {
            instance = new GovernmentRegistry();
        }
        return instance;
    }

    public synchronized void updateCitizenInfo(String citizenId, CitizenInfo info) {
        citizenRegistry.put(citizenId, info);
    }

    public synchronized CitizenInfo getCitizenInfo(String citizenId) {
        return citizenRegistry.get(citizenId);
    }
}

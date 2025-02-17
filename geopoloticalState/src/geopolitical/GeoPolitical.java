package geopolitical;

import enums.GeoPoliticalZone;

public class GeoPolitical {

    public static String getGeoPoliticalZone(String state) {
        for (GeoPoliticalZone zone : GeoPoliticalZone.values()) {
            if (zone.containsState(state)) {
                return zone.name().replace("_", " ");
            }
        }
        return null;
    }
}
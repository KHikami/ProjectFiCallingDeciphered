import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public final class bng {
    private Map a;

    public bng() {
        this.a = new HashMap();
    }

    public final Map a(String str) {
        Map hashMap = new HashMap();
        for (Entry entry : this.a.entrySet()) {
            hashMap.put(str + ((String) entry.getKey()), entry.getValue());
        }
        return hashMap;
    }

    public final String toString() {
        return cql.a(this.a, 1);
    }
}

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public final class bnb extends cql {
    public Map a;

    public bnb() {
        this.a = new HashMap(4);
    }

    public final /* synthetic */ void a(cql cql) {
        ((bnb) cql).a.putAll(this.a);
    }

    public final String toString() {
        Map hashMap = new HashMap();
        for (Entry entry : this.a.entrySet()) {
            hashMap.put("metric" + entry.getKey(), entry.getValue());
        }
        return cql.a(hashMap, 0);
    }
}

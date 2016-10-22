import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public final class bna extends cql {
    public Map a;

    public bna() {
        this.a = new HashMap(4);
    }

    public final /* synthetic */ void a(cql cql) {
        ((bna) cql).a.putAll(this.a);
    }

    public final String toString() {
        Map hashMap = new HashMap();
        for (Entry entry : this.a.entrySet()) {
            hashMap.put("dimension" + entry.getKey(), entry.getValue());
        }
        return cql.a(hashMap, 0);
    }
}

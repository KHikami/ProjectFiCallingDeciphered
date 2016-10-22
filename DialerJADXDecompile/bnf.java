import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public final class bnf {
    public final String toString() {
        Map hashMap = new HashMap();
        Map map = null;
        for (Entry entry : map.entrySet()) {
            if (((String) entry.getKey()).startsWith("&")) {
                hashMap.put(((String) entry.getKey()).substring(1), entry.getValue());
            } else {
                hashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return cql.a(hashMap, 1);
    }
}

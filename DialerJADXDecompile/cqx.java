import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public final class cqx extends cql {
    public final List a;
    public final List b;
    public final Map c;
    public bnf d;

    public cqx() {
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = new HashMap();
    }

    public final /* synthetic */ void a(cql cql) {
        cqx cqx = (cqx) cql;
        cqx.a.addAll(this.a);
        cqx.b.addAll(this.b);
        for (Entry entry : this.c.entrySet()) {
            String str = (String) entry.getKey();
            for (bne bne : (List) entry.getValue()) {
                if (bne != null) {
                    Object obj;
                    if (str == null) {
                        obj = "";
                    } else {
                        String str2 = str;
                    }
                    if (!cqx.c.containsKey(obj)) {
                        cqx.c.put(obj, new ArrayList());
                    }
                    ((List) cqx.c.get(obj)).add(bne);
                }
            }
        }
        if (this.d != null) {
            cqx.d = this.d;
        }
    }

    public final String toString() {
        Map hashMap = new HashMap();
        if (!this.a.isEmpty()) {
            hashMap.put("products", this.a);
        }
        if (!this.b.isEmpty()) {
            hashMap.put("promotions", this.b);
        }
        if (!this.c.isEmpty()) {
            hashMap.put("impressions", this.c);
        }
        hashMap.put("productAction", this.d);
        return cql.a((Object) hashMap);
    }
}

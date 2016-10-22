import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

public final class cqy extends cql {
    public String a;
    public String b;
    public String c;
    public long d;

    public final /* synthetic */ void a(cql cql) {
        cqy cqy = (cqy) cql;
        if (!TextUtils.isEmpty(this.a)) {
            cqy.a = this.a;
        }
        if (!TextUtils.isEmpty(this.b)) {
            cqy.b = this.b;
        }
        if (!TextUtils.isEmpty(this.c)) {
            cqy.c = this.c;
        }
        if (this.d != 0) {
            cqy.d = this.d;
        }
    }

    public final String toString() {
        Map hashMap = new HashMap();
        hashMap.put("category", this.a);
        hashMap.put("action", this.b);
        hashMap.put("label", this.c);
        hashMap.put("value", Long.valueOf(this.d));
        return cql.a((Object) hashMap);
    }
}

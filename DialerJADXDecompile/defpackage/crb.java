package defpackage;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: crb */
public final class crb extends cql {
    public String a;
    public String b;
    public String c;

    public final /* synthetic */ void a(cql cql) {
        crb crb = (crb) cql;
        if (!TextUtils.isEmpty(this.a)) {
            crb.a = this.a;
        }
        if (!TextUtils.isEmpty(this.b)) {
            crb.b = this.b;
        }
        if (!TextUtils.isEmpty(this.c)) {
            crb.c = this.c;
        }
    }

    public final String toString() {
        Map hashMap = new HashMap();
        hashMap.put("network", this.a);
        hashMap.put("action", this.b);
        hashMap.put("target", this.c);
        return cql.a((Object) hashMap);
    }
}

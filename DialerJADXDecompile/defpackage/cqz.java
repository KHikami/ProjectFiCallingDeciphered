package defpackage;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: cqz */
public final class cqz extends cql {
    public String a;
    public boolean b;

    public final /* synthetic */ void a(cql cql) {
        cqz cqz = (cqz) cql;
        if (!TextUtils.isEmpty(this.a)) {
            cqz.a = this.a;
        }
        if (this.b) {
            cqz.b = this.b;
        }
    }

    public final String toString() {
        Map hashMap = new HashMap();
        hashMap.put("description", this.a);
        hashMap.put("fatal", Boolean.valueOf(this.b));
        return cql.a((Object) hashMap);
    }
}

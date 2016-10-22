package defpackage;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: bnd */
public final class bnd extends cql {
    public String a;
    public String b;
    public String c;
    public String d;
    public boolean e;
    public String f;
    public boolean g;
    public double h;

    public final /* synthetic */ void a(cql cql) {
        boolean z = true;
        bnd bnd = (bnd) cql;
        if (!TextUtils.isEmpty(this.a)) {
            bnd.a = this.a;
        }
        if (!TextUtils.isEmpty(this.b)) {
            bnd.b = this.b;
        }
        if (!TextUtils.isEmpty(this.c)) {
            bnd.c = this.c;
        }
        if (!TextUtils.isEmpty(this.d)) {
            bnd.d = this.d;
        }
        if (this.e) {
            bnd.e = true;
        }
        if (!TextUtils.isEmpty(this.f)) {
            bnd.f = this.f;
        }
        if (this.g) {
            bnd.g = this.g;
        }
        if (this.h != 0.0d) {
            double d = this.h;
            if (d < 0.0d || d > 100.0d) {
                z = false;
            }
            buf.b(z, (Object) "Sample rate must be between 0% and 100%");
            bnd.h = d;
        }
    }

    public final String toString() {
        Map hashMap = new HashMap();
        hashMap.put("hitType", this.a);
        hashMap.put("clientId", this.b);
        hashMap.put("userId", this.c);
        hashMap.put("androidAdId", this.d);
        hashMap.put("AdTargetingEnabled", Boolean.valueOf(this.e));
        hashMap.put("sessionControl", this.f);
        hashMap.put("nonInteraction", Boolean.valueOf(this.g));
        hashMap.put("sampleRate", Double.valueOf(this.h));
        return cql.a(hashMap, 0);
    }
}

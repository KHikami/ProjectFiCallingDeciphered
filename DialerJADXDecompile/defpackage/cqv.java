package defpackage;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: cqv */
public final class cqv extends cql {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;

    public final /* synthetic */ void a(cql cql) {
        cqv cqv = (cqv) cql;
        if (!TextUtils.isEmpty(this.a)) {
            cqv.a = this.a;
        }
        if (!TextUtils.isEmpty(this.b)) {
            cqv.b = this.b;
        }
        if (!TextUtils.isEmpty(this.c)) {
            cqv.c = this.c;
        }
        if (!TextUtils.isEmpty(this.d)) {
            cqv.d = this.d;
        }
        if (!TextUtils.isEmpty(this.e)) {
            cqv.e = this.e;
        }
        if (!TextUtils.isEmpty(this.f)) {
            cqv.f = this.f;
        }
        if (!TextUtils.isEmpty(this.g)) {
            cqv.g = this.g;
        }
        if (!TextUtils.isEmpty(this.h)) {
            cqv.h = this.h;
        }
        if (!TextUtils.isEmpty(this.i)) {
            cqv.i = this.i;
        }
        if (!TextUtils.isEmpty(this.j)) {
            cqv.j = this.j;
        }
    }

    public final String toString() {
        Map hashMap = new HashMap();
        hashMap.put("name", this.a);
        hashMap.put("source", this.b);
        hashMap.put("medium", this.c);
        hashMap.put("keyword", this.d);
        hashMap.put("content", this.e);
        hashMap.put("id", this.f);
        hashMap.put("adNetworkId", this.g);
        hashMap.put("gclid", this.h);
        hashMap.put("dclid", this.i);
        hashMap.put("aclid", this.j);
        return cql.a((Object) hashMap);
    }
}

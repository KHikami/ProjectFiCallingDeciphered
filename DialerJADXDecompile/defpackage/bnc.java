package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: bnc */
public final class bnc extends cql {
    public final Map a;

    public bnc() {
        this.a = new HashMap();
    }

    public final /* synthetic */ void a(cql cql) {
        Object obj = (bnc) cql;
        buf.A(obj);
        obj.a.putAll(this.a);
    }

    public final String toString() {
        return cql.a(this.a, 0);
    }
}

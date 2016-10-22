package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: bns */
public final class bns {
    final long a;
    final String b;
    final String c;
    final boolean d;
    long e;
    final Map f;

    public bns(long j, String str, String str2, boolean z, long j2, Map map) {
        buf.n(str);
        buf.n(str2);
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = j2;
        if (map != null) {
            this.f = new HashMap(map);
        } else {
            this.f = Collections.emptyMap();
        }
    }
}

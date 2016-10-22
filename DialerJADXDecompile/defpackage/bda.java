package defpackage;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* renamed from: bda */
public final class bda {
    public static bda a;
    public final Set b;
    final Set c;
    final Set d;

    static {
        a = new bda();
    }

    private bda() {
        this.b = Collections.newSetFromMap(new ConcurrentHashMap(8, 0.9f, 1));
        this.c = Collections.newSetFromMap(new ConcurrentHashMap(8, 0.9f, 1));
        this.d = Collections.newSetFromMap(new ConcurrentHashMap(8, 0.9f, 1));
    }

    public final void a(ayo ayo, int i) {
        String valueOf = String.valueOf(ayo);
        bdf.a((Object) this, new StringBuilder(String.valueOf(valueOf).length() + 59).append("upgradeToVideoRequest call = ").append(valueOf).append(" new video state = ").append(i).toString());
        for (bdb a : this.b) {
            a.a(ayo, i);
        }
    }

    public final void a(long j) {
        for (bdd a : this.c) {
            a.a(j);
        }
    }
}

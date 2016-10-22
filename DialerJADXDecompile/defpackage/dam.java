package defpackage;

import java.util.Map.Entry;

/* compiled from: PG */
/* renamed from: dam */
final class dam extends czk {
    private /* synthetic */ czt a;
    private /* synthetic */ dak b;

    dam(dak dak, czt czt) {
        this.b = dak;
        this.a = czt;
    }

    public final Object get(int i) {
        return ((Entry) this.a.get(i)).getValue();
    }

    final czp a() {
        return this.b;
    }
}

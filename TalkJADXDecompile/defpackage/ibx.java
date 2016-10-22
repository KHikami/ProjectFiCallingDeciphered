package defpackage;

import com.google.android.gms.common.data.DataHolder;

/* renamed from: ibx */
public final class ibx extends gve implements hxu {
    private final int c;

    public ibx(DataHolder dataHolder, int i, int i2) {
        super(dataHolder, i);
        this.c = i2;
    }

    private hxu c() {
        return new ibw(this);
    }

    public hxw a() {
        return new hze(this.a, this.b, this.c);
    }

    public int b() {
        return a("event_type");
    }

    public /* synthetic */ Object f() {
        return c();
    }

    public String toString() {
        String str = b() == 1 ? "changed" : b() == 2 ? "deleted" : "unknown";
        String valueOf = String.valueOf(a());
        return new StringBuilder((String.valueOf(str).length() + 32) + String.valueOf(valueOf).length()).append("DataEventRef{ type=").append(str).append(", dataitem=").append(valueOf).append(" }").toString();
    }
}

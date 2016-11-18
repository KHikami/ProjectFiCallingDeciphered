package p000;

import com.google.android.gms.common.data.DataHolder;

public final class ibx extends gve implements hxu {
    private final int f17544c;

    public ibx(DataHolder dataHolder, int i, int i2) {
        super(dataHolder, i);
        this.f17544c = i2;
    }

    private hxu m21553c() {
        return new ibw(this);
    }

    public hxw mo3132a() {
        return new hze(this.a, this.b, this.f17544c);
    }

    public int mo3133b() {
        return m18664a("event_type");
    }

    public /* synthetic */ Object mo1288f() {
        return m21553c();
    }

    public String toString() {
        String str = mo3133b() == 1 ? "changed" : mo3133b() == 2 ? "deleted" : "unknown";
        String valueOf = String.valueOf(mo3132a());
        return new StringBuilder((String.valueOf(str).length() + 32) + String.valueOf(valueOf).length()).append("DataEventRef{ type=").append(str).append(", dataitem=").append(valueOf).append(" }").toString();
    }
}

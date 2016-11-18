package p000;

public final class ibw implements hxu {
    private int f17542a;
    private hxw f17543b;

    public ibw(hxu hxu) {
        this.f17542a = hxu.mo3133b();
        this.f17543b = (hxw) hxu.mo3132a().mo1288f();
    }

    private hxu m21548c() {
        return this;
    }

    public hxw mo3132a() {
        return this.f17543b;
    }

    public int mo3133b() {
        return this.f17542a;
    }

    public boolean mo1287e() {
        return true;
    }

    public /* synthetic */ Object mo1288f() {
        return m21548c();
    }

    public String toString() {
        String str = mo3133b() == 1 ? "changed" : mo3133b() == 2 ? "deleted" : "unknown";
        String valueOf = String.valueOf(mo3132a());
        return new StringBuilder((String.valueOf(str).length() + 35) + String.valueOf(valueOf).length()).append("DataEventEntity{ type=").append(str).append(", dataitem=").append(valueOf).append(" }").toString();
    }
}

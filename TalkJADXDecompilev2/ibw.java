package defpackage;

public final class ibw implements hxu {
    private int a;
    private hxw b;

    public ibw(hxu hxu) {
        this.a = hxu.b();
        this.b = (hxw) hxu.a().f();
    }

    private hxu c() {
        return this;
    }

    public hxw a() {
        return this.b;
    }

    public int b() {
        return this.a;
    }

    public boolean e() {
        return true;
    }

    public /* synthetic */ Object f() {
        return c();
    }

    public String toString() {
        String str = b() == 1 ? "changed" : b() == 2 ? "deleted" : "unknown";
        String valueOf = String.valueOf(a());
        return new StringBuilder((String.valueOf(str).length() + 35) + String.valueOf(valueOf).length()).append("DataEventEntity{ type=").append(str).append(", dataitem=").append(valueOf).append(" }").toString();
    }
}

package p000;

public final class jpu {
    public static final jpu f20749a = new jpv().m24967a(true).m24968b(true).m24966a();
    private final C0000a f20750b;
    private final boolean f20751c;
    private final boolean f20752d;

    jpu(jpv jpv) {
        this.f20750b = jpv.f20753a;
        this.f20751c = jpv.f20754b;
        this.f20752d = jpv.f20755c;
    }

    private boolean m24963b() {
        return this.f20752d;
    }

    private boolean m24964c() {
        return this.f20751c;
    }

    public void m24965a() {
        if (this != f20749a) {
            if (this.f20750b == null) {
                throw new IllegalStateException("must supply network capability to validate constraints");
            } else if (this.f20750b.m22s() && !m24964c()) {
                throw new jqh("metered network not allowed");
            } else if (this.f20750b.m23t() && !m24963b()) {
                throw new jqh("roaming not allowed");
            }
        }
    }
}

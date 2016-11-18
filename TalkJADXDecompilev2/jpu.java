package defpackage;

public final class jpu {
    public static final jpu a = new jpv().a(true).b(true).a();
    private final a b;
    private final boolean c;
    private final boolean d;

    jpu(jpv jpv) {
        this.b = jpv.a;
        this.c = jpv.b;
        this.d = jpv.c;
    }

    private boolean b() {
        return this.d;
    }

    private boolean c() {
        return this.c;
    }

    public void a() {
        if (this != a) {
            if (this.b == null) {
                throw new IllegalStateException("must supply network capability to validate constraints");
            } else if (this.b.s() && !c()) {
                throw new jqh("metered network not allowed");
            } else if (this.b.t() && !b()) {
                throw new jqh("roaming not allowed");
            }
        }
    }
}

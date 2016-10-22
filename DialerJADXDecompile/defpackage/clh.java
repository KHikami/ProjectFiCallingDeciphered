package defpackage;

/* renamed from: clh */
public final class clh extends ckv {
    private static volatile clh[] c;
    private String d;
    private String e;

    public clh() {
        this.d = "";
        this.e = "";
        this.a = null;
        this.b = -1;
    }

    public static clh[] d() {
        if (c == null) {
            synchronized (ckz.a) {
                if (c == null) {
                    c = new clh[0];
                }
            }
        }
        return c;
    }

    protected final int a() {
        int a = super.a();
        if (!this.d.equals("")) {
            a += ckt.b(1, this.d);
        }
        return !this.e.equals("") ? a + ckt.b(2, this.e) : a;
    }

    public final void a(ckt ckt) {
        if (!this.d.equals("")) {
            ckt.a(1, this.d);
        }
        if (!this.e.equals("")) {
            ckt.a(2, this.e);
        }
        super.a(ckt);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof clh)) {
            return false;
        }
        clh clh = (clh) obj;
        if (this.d == null) {
            if (clh.d != null) {
                return false;
            }
        } else if (!this.d.equals(clh.d)) {
            return false;
        }
        if (this.e == null) {
            if (clh.e != null) {
                return false;
            }
        } else if (!this.e.equals(clh.e)) {
            return false;
        }
        return (this.a == null || this.a.a()) ? clh.a == null || clh.a.a() : this.a.equals(clh.a);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((this.e == null ? 0 : this.e.hashCode()) + (((this.d == null ? 0 : this.d.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31;
        if (!(this.a == null || this.a.a())) {
            i = this.a.hashCode();
        }
        return hashCode + i;
    }
}

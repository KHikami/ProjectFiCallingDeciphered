public final class cle extends ckv {
    private int c;
    private String d;
    private String e;

    public cle() {
        this.c = 0;
        this.d = "";
        this.e = "";
        this.a = null;
        this.b = -1;
    }

    protected final int a() {
        int a = super.a();
        if (!this.d.equals("")) {
            a += ckt.b(2, this.d);
        }
        return !this.e.equals("") ? a + ckt.b(3, this.e) : a;
    }

    public final void a(ckt ckt) {
        if (!this.d.equals("")) {
            ckt.a(2, this.d);
        }
        if (!this.e.equals("")) {
            ckt.a(3, this.e);
        }
        super.a(ckt);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cle)) {
            return false;
        }
        cle cle = (cle) obj;
        if (this.d == null) {
            if (cle.d != null) {
                return false;
            }
        } else if (!this.d.equals(cle.d)) {
            return false;
        }
        if (this.e == null) {
            if (cle.e != null) {
                return false;
            }
        } else if (!this.e.equals(cle.e)) {
            return false;
        }
        return (this.a == null || this.a.a()) ? cle.a == null || cle.a.a() : this.a.equals(cle.a);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((this.e == null ? 0 : this.e.hashCode()) + (((this.d == null ? 0 : this.d.hashCode()) + (((getClass().getName().hashCode() + 527) * 31) * 31)) * 31)) * 31;
        if (!(this.a == null || this.a.a())) {
            i = this.a.hashCode();
        }
        return hashCode + i;
    }
}

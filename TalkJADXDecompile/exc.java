public final class exc extends evz {
    private static final long serialVersionUID = 1;
    private final String g;
    private final boolean h;
    private final int i;

    exc(oib oib) {
        ohq ohq;
        this.i = gwb.a(oib.d);
        if (gwb.a(oib.b) != 1 || oib.c == null || oib.c.c == null) {
            ohq = oib.a;
        } else {
            ohq = oib.c.c;
        }
        if (ohq != null) {
            this.g = ohq.c;
            if (gwb.a(ohq.a) == 0) {
                this.h = true;
                return;
            } else {
                this.h = false;
                return;
            }
        }
        this.g = null;
        this.h = false;
    }

    public String k() {
        return this.g;
    }

    public boolean l() {
        return this.h;
    }

    public int m() {
        return this.i;
    }

    public boolean n() {
        return this.i == 0;
    }
}

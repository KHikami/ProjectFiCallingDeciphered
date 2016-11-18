package p000;

public final class exc extends evz {
    private static final long serialVersionUID = 1;
    private final String f12428g;
    private final boolean f12429h;
    private final int f12430i;

    exc(oib oib) {
        ohq ohq;
        this.f12430i = gwb.m1507a(oib.d);
        if (gwb.m1507a(oib.b) != 1 || oib.c == null || oib.c.c == null) {
            ohq = oib.a;
        } else {
            ohq = oib.c.c;
        }
        if (ohq != null) {
            this.f12428g = ohq.c;
            if (gwb.m1523a(ohq.a) == 0) {
                this.f12429h = true;
                return;
            } else {
                this.f12429h = false;
                return;
            }
        }
        this.f12428g = null;
        this.f12429h = false;
    }

    public String m14737k() {
        return this.f12428g;
    }

    public boolean m14738l() {
        return this.f12429h;
    }

    public int m14739m() {
        return this.f12430i;
    }

    public boolean m14740n() {
        return this.f12430i == 0;
    }
}

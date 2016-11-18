package p000;

public class fab extends evz {
    private static final long serialVersionUID = 2;
    private Boolean f12573g;
    private Boolean f12574h;

    public fab(lvu lvu) {
        super(lvu, lvu.responseHeader, 0);
        for (lus lus : lvu.f26620a) {
            if (!(lus.f26530b == null || lus.f26529a == null)) {
                switch (gwb.m1507a(lus.f26529a)) {
                    case 2:
                        this.f12573g = Boolean.valueOf(gwb.m2061b(lus.f26530b));
                        break;
                    case 6:
                        this.f12574h = Boolean.valueOf(gwb.m2061b(lus.f26530b));
                        break;
                    default:
                        break;
                }
            }
        }
    }

    public Boolean m14838k() {
        return this.f12573g;
    }

    public Boolean m14839l() {
        return this.f12574h;
    }
}

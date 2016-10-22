public class fab extends evz {
    private static final long serialVersionUID = 2;
    private Boolean g;
    private Boolean h;

    public fab(lvu lvu) {
        super(lvu, lvu.responseHeader, 0);
        for (lus lus : lvu.a) {
            if (!(lus.b == null || lus.a == null)) {
                switch (gwb.a(lus.a)) {
                    case wi.l /*2*/:
                        this.g = Boolean.valueOf(gwb.b(lus.b));
                        break;
                    case wi.s /*6*/:
                        this.h = Boolean.valueOf(gwb.b(lus.b));
                        break;
                    default:
                        break;
                }
            }
        }
    }

    public Boolean k() {
        return this.g;
    }

    public Boolean l() {
        return this.h;
    }
}

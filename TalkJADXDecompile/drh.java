public final class drh extends evz {
    private static final long serialVersionUID = 1;
    private final String g;

    private drh(lrj lrj) {
        super(lrj, lrj.responseHeader, -1);
        this.g = lrj.a;
    }

    public static evz a(lrj lrj) {
        if (evz.a(lrj.responseHeader)) {
            return new ewv((nzf) lrj, lrj.responseHeader);
        }
        return new drh(lrj);
    }

    public void a(blo blo, fhc fhc) {
        super.a(blo, fhc);
        if (glk.a("Babel", 3)) {
            int i = this.c.b;
            String valueOf = String.valueOf(this.c.a);
            glk.b("Babel", new StringBuilder(String.valueOf(valueOf).length() + 67).append("processEventResponse response status: ").append(i).append(" error description").append(valueOf).toString(), new Object[0]);
        }
        blo.d(((drg) this.b).c(), this.g);
    }
}

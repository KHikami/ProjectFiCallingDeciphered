package p000;

public final class drh extends evz {
    private static final long serialVersionUID = 1;
    private final String f10393g;

    private drh(lrj lrj) {
        super(lrj, lrj.responseHeader, -1);
        this.f10393g = lrj.f26216a;
    }

    public static evz m12548a(lrj lrj) {
        if (evz.m8120a(lrj.responseHeader)) {
            return new ewv((nzf) lrj, lrj.responseHeader);
        }
        return new drh(lrj);
    }

    public void mo1047a(blo blo, fhc fhc) {
        super.mo1047a(blo, fhc);
        if (glk.m17973a("Babel", 3)) {
            int i = this.c.f12529b;
            String valueOf = String.valueOf(this.c.f12528a);
            glk.m17976b("Babel", new StringBuilder(String.valueOf(valueOf).length() + 67).append("processEventResponse response status: ").append(i).append(" error description").append(valueOf).toString(), new Object[0]);
        }
        blo.m6040d(((drg) this.b).m12547c(), this.f10393g);
    }
}

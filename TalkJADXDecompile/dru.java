import android.content.Context;

public final class dru extends evz {
    private static final long serialVersionUID = 1;
    private final String g;

    private dru(ltp ltp) {
        super(ltp, ltp.responseHeader, -1);
        this.g = ltp.a.a;
    }

    public static evz a(ltp ltp) {
        if (evz.a(ltp.responseHeader)) {
            return new ewv((nzf) ltp, ltp.responseHeader);
        }
        return new dru(ltp);
    }

    public void a(blo blo, fhc fhc) {
        super.a(blo, fhc);
        if (glk.a("Babel", 3)) {
            int i = this.c.b;
            String valueOf = String.valueOf(this.c.a);
            glk.b("Babel", new StringBuilder(String.valueOf(valueOf).length() + 67).append("processEventResponse response status: ").append(i).append(" error description").append(valueOf).toString(), new Object[0]);
        }
        Context f = blo.f();
        ayo bow = new bow(this.g, blo.h(), box.JOIN_CONVERSATION_BY_LINK);
        gid gid = (gid) jyn.a(f, gid.class);
        if (this.c.b == 1) {
            if (blf.a(blo, this.g, 0, new fhc(), null)) {
                gid.a(bow, bow.a());
                return;
            } else {
                gid.a(bow, new drb(), bow.a());
                return;
            }
        }
        int i2 = this.c.b;
        String valueOf2 = String.valueOf(this.c.a);
        gid.a(bow, new Exception(new StringBuilder(String.valueOf(valueOf2).length() + 49).append("response status: ").append(i2).append(", error description: ").append(valueOf2).toString()), bow.a());
    }
}

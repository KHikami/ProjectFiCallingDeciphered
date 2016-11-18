package defpackage;

public final class fap extends evz {
    private static final long serialVersionUID = 2;

    public fap(luf luf) {
        super(luf, luf.responseHeader, -1);
        if (glk.a("Babel", 3)) {
            String str = "Babel";
            String str2 = "UploadAnalyticsResponse debugUrl: ";
            String valueOf = String.valueOf(luf.responseHeader.c);
            glk.b(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
        }
    }

    public void a(blo blo, fhc fhc) {
        super.a(blo, fhc);
        if (glk.a("Babel", 3)) {
            int i = this.c.b;
            String str = this.c.a;
            glk.b("Babel", new StringBuilder(String.valueOf(str).length() + 67).append("processEventResponse response status: ").append(i).append(" error description").append(str).toString(), new Object[0]);
        }
    }
}

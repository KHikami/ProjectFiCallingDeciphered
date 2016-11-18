package p000;

public final class fap extends evz {
    private static final long serialVersionUID = 2;

    public fap(luf luf) {
        super(luf, luf.responseHeader, -1);
        if (glk.m17973a("Babel", 3)) {
            String str = "Babel";
            String str2 = "UploadAnalyticsResponse debugUrl: ";
            String valueOf = String.valueOf(luf.responseHeader.f26517c);
            glk.m17976b(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
        }
    }

    public void mo1047a(blo blo, fhc fhc) {
        super.mo1047a(blo, fhc);
        if (glk.m17973a("Babel", 3)) {
            int i = this.c.f12529b;
            String str = this.c.f12528a;
            glk.m17976b("Babel", new StringBuilder(String.valueOf(str).length() + 67).append("processEventResponse response status: ").append(i).append(" error description").append(str).toString(), new Object[0]);
        }
    }
}

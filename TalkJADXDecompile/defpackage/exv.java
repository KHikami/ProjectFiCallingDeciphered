package defpackage;

/* renamed from: exv */
public final class exv extends evz {
    private static final long serialVersionUID = 1;
    public final String g;

    exv(lrl lrl) {
        super(lrl, lrl.responseHeader, -1);
        this.g = lrl.a;
        if (evz.a) {
            String str = "GetOffnetworkInviteUrlResponse: Invite Url=";
            String valueOf = String.valueOf(this.g);
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
        }
    }

    public void a(blo blo, fhc fhc) {
        super.a(blo, fhc);
        if (glk.a("Babel", 3)) {
            int i = this.c.b;
            String str = this.c.a;
            glk.b("Babel", new StringBuilder(String.valueOf(str).length() + 85).append("processGetOffnetworkInviteUrlResponse response status: ").append(i).append(" error description ").append(str).toString(), new Object[0]);
        }
    }
}

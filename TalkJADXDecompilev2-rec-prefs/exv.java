package p000;

public final class exv extends evz {
    private static final long serialVersionUID = 1;
    public final String f12448g;

    exv(lrl lrl) {
        super(lrl, lrl.responseHeader, -1);
        this.f12448g = lrl.f26219a;
        if (evz.f5798a) {
            String str = "GetOffnetworkInviteUrlResponse: Invite Url=";
            String valueOf = String.valueOf(this.f12448g);
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
        }
    }

    public void mo1047a(blo blo, fhc fhc) {
        super.mo1047a(blo, fhc);
        if (glk.m17973a("Babel", 3)) {
            int i = this.c.f12529b;
            String str = this.c.f12528a;
            glk.m17976b("Babel", new StringBuilder(String.valueOf(str).length() + 85).append("processGetOffnetworkInviteUrlResponse response status: ").append(i).append(" error description ").append(str).toString(), new Object[0]);
        }
    }
}

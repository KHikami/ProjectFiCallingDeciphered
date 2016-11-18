package p000;

public final class ezu extends evz {
    private static final long serialVersionUID = 1;

    ezu(lvh lvh) {
        String valueOf;
        super(lvh, lvh.responseHeader, 0);
        if (glk.m17973a("Babel", 3)) {
            String str = "Babel";
            String str2 = "SetConfigurationBitResponse debugUrl: ";
            valueOf = String.valueOf(lvh.responseHeader.f26517c);
            glk.m17976b(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
            if (lvh.f26587a.length > 0) {
                str = "Babel";
                str2 = "SetConfigurationBitResponse error: ";
                valueOf = String.valueOf(lvh.f26587a[0].f25877b);
                if (valueOf.length() != 0) {
                    valueOf = str2.concat(valueOf);
                } else {
                    valueOf = new String(str2);
                }
                glk.m17976b(str, valueOf, new Object[0]);
            }
        }
        if (evz.f5798a) {
            valueOf = String.valueOf(lvh);
            new StringBuilder(String.valueOf(valueOf).length() + 33).append("SetConfigurationBitResponse from:").append(valueOf);
        }
    }
}

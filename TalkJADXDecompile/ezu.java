public final class ezu extends evz {
    private static final long serialVersionUID = 1;

    ezu(lvh lvh) {
        String valueOf;
        super(lvh, lvh.responseHeader, 0);
        if (glk.a("Babel", 3)) {
            String str = "Babel";
            String str2 = "SetConfigurationBitResponse debugUrl: ";
            valueOf = String.valueOf(lvh.responseHeader.c);
            glk.b(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
            if (lvh.a.length > 0) {
                str = "Babel";
                str2 = "SetConfigurationBitResponse error: ";
                valueOf = String.valueOf(lvh.a[0].b);
                if (valueOf.length() != 0) {
                    valueOf = str2.concat(valueOf);
                } else {
                    valueOf = new String(str2);
                }
                glk.b(str, valueOf, new Object[0]);
            }
        }
        if (evz.a) {
            valueOf = String.valueOf(lvh);
            new StringBuilder(String.valueOf(valueOf).length() + 33).append("SetConfigurationBitResponse from:").append(valueOf);
        }
    }
}

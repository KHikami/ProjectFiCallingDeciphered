package defpackage;

public enum bnr {
    CONTACT("c:"),
    GAIA("g:"),
    PHONE("p:"),
    MANUAL("SYNTH:"),
    CONVERSATION("CONV:");
    
    public final String f;

    private bnr(String str) {
        this.f = str;
    }

    public String a(String str) {
        String valueOf = String.valueOf(this.f);
        String valueOf2 = String.valueOf(str);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    public boolean b(String str) {
        return str != null && str.startsWith(this.f);
    }

    public String c(String str) {
        if (b(str)) {
            return str.substring(this.f.length());
        }
        return null;
    }
}

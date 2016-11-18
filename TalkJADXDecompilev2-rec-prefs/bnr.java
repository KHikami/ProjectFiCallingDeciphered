package p000;

public enum bnr {
    CONTACT("c:"),
    GAIA("g:"),
    PHONE("p:"),
    MANUAL("SYNTH:"),
    CONVERSATION("CONV:");
    
    public final String f4057f;

    private bnr(String str) {
        this.f4057f = str;
    }

    public String m6228a(String str) {
        String valueOf = String.valueOf(this.f4057f);
        String valueOf2 = String.valueOf(str);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    public boolean m6229b(String str) {
        return str != null && str.startsWith(this.f4057f);
    }

    public String m6230c(String str) {
        if (m6229b(str)) {
            return str.substring(this.f4057f.length());
        }
        return null;
    }
}

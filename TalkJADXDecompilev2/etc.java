package defpackage;

public class etc extends esx {
    private static final long serialVersionUID = 1;
    private final String c;

    public etc(String str) {
        String c = glq.c(gwb.H(), str);
        if (c == null) {
            glk.e("Babel_RequestWriter", new StringBuilder(String.valueOf(str).length() + 45).append("Invalid phone number: ").append(str).append(" in GetCallRateRequest.").toString(), new Object[0]);
            this.c = null;
        } else if (c.charAt(0) == '+') {
            this.c = c.substring(1);
        } else {
            this.c = c;
        }
    }

    public nzf a(String str, int i, int i2) {
        return new esz();
    }

    public boolean k() {
        return false;
    }

    public String g() {
        String valueOf = String.valueOf("users/@me/destinations/%");
        String valueOf2 = String.valueOf(Integer.toHexString(43));
        String str = this.c;
        String valueOf3 = String.valueOf("/rate");
        return new StringBuilder((((String.valueOf(valueOf).length() + 0) + String.valueOf(valueOf2).length()) + String.valueOf(str).length()) + String.valueOf(valueOf3).length()).append(valueOf).append(valueOf2).append(str).append(valueOf3).toString();
    }
}

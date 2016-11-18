package p000;

public class etc extends esx {
    private static final long serialVersionUID = 1;
    private final String f12223c;

    public etc(String str) {
        String c = glq.m18012c(gwb.m1400H(), str);
        if (c == null) {
            glk.m17982e("Babel_RequestWriter", new StringBuilder(String.valueOf(str).length() + 45).append("Invalid phone number: ").append(str).append(" in GetCallRateRequest.").toString(), new Object[0]);
            this.f12223c = null;
        } else if (c.charAt(0) == '+') {
            this.f12223c = c.substring(1);
        } else {
            this.f12223c = c;
        }
    }

    public nzf mo1944a(String str, int i, int i2) {
        return new esz();
    }

    public boolean mo1950k() {
        return false;
    }

    public String mo1947g() {
        String valueOf = String.valueOf("users/@me/destinations/%");
        String valueOf2 = String.valueOf(Integer.toHexString(43));
        String str = this.f12223c;
        String valueOf3 = String.valueOf("/rate");
        return new StringBuilder((((String.valueOf(valueOf).length() + 0) + String.valueOf(valueOf2).length()) + String.valueOf(str).length()) + String.valueOf(valueOf3).length()).append(valueOf).append(valueOf2).append(str).append(valueOf3).toString();
    }
}

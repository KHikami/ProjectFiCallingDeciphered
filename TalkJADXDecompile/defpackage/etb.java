package defpackage;

import java.net.URLEncoder;

/* renamed from: etb */
public class etb extends esx {
    private static final long serialVersionUID = 1;
    private final String c;
    private final String d;

    public etb(String str, String str2) {
        this.c = str;
        this.d = str2;
    }

    public nzf a(String str, int i, int i2) {
        return new esz();
    }

    public boolean k() {
        return false;
    }

    public String g() {
        String valueOf = String.valueOf("users/@me/phones/");
        String valueOf2 = String.valueOf(URLEncoder.encode(this.d));
        String valueOf3 = String.valueOf("/proxyNumbers/");
        String valueOf4 = String.valueOf(URLEncoder.encode(this.c));
        return new StringBuilder((((String.valueOf(valueOf).length() + 0) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()) + String.valueOf(valueOf4).length()).append(valueOf).append(valueOf2).append(valueOf3).append(valueOf4).toString();
    }
}

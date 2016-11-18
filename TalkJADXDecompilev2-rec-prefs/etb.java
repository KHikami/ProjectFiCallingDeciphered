package p000;

import java.net.URLEncoder;

public class etb extends esx {
    private static final long serialVersionUID = 1;
    private final String f12221c;
    private final String f12222d;

    public etb(String str, String str2) {
        this.f12221c = str;
        this.f12222d = str2;
    }

    public nzf mo1944a(String str, int i, int i2) {
        return new esz();
    }

    public boolean mo1950k() {
        return false;
    }

    public String mo1947g() {
        String valueOf = String.valueOf("users/@me/phones/");
        String valueOf2 = String.valueOf(URLEncoder.encode(this.f12222d));
        String valueOf3 = String.valueOf("/proxyNumbers/");
        String valueOf4 = String.valueOf(URLEncoder.encode(this.f12221c));
        return new StringBuilder((((String.valueOf(valueOf).length() + 0) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()) + String.valueOf(valueOf4).length()).append(valueOf).append(valueOf2).append(valueOf3).append(valueOf4).toString();
    }
}

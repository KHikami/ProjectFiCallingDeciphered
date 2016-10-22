package defpackage;

import java.security.PrivateKey;
import java.util.Collection;

/* renamed from: keh */
public final class keh extends kdx {
    String i;
    Collection<String> j;
    PrivateKey k;
    String l;
    String m;
    String n;

    public /* synthetic */ kdx a(String str) {
        return b(str);
    }

    public keh() {
        super(kdu.a());
        b("https://accounts.google.com/o/oauth2/token");
    }

    private keh b(String str) {
        return (keh) super.a(str);
    }
}

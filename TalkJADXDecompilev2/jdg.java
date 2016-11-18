package defpackage;

import java.util.Collections;
import java.util.Set;

final class jdg implements jch {
    final /* synthetic */ jcx a;
    private final String b;

    private jdg(jcx jcx, String str) {
        this.a = jcx;
        this.b = String.valueOf(str).concat(".");
    }

    jdg(jcx jcx, int i) {
        this(jcx, Integer.toString(i));
    }

    public boolean a(String str) {
        return this.a.b.contains(e(str));
    }

    public String a(String str, String str2) {
        return this.a.b.getString(e(str), str2);
    }

    public String b(String str) {
        return a(str, null);
    }

    public Set<String> a(String str, Set<String> set) {
        Set stringSet = this.a.b.getStringSet(e(str), null);
        if (stringSet == null) {
            return null;
        }
        return Collections.unmodifiableSet(stringSet);
    }

    public boolean a(String str, boolean z) {
        return this.a.b.getBoolean(e(str), z);
    }

    public boolean c(String str) {
        return a(str, false);
    }

    public int a(String str, int i) {
        return this.a.b.getInt(e(str), i);
    }

    public long a(String str, long j) {
        return this.a.b.getLong(e(str), j);
    }

    public boolean a() {
        return c("logged_in");
    }

    public boolean b() {
        return c("logged_out");
    }

    public jch d(String str) {
        jcx jcx = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(str);
        return new jdg(jcx, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
    }

    private String e(String str) {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(str);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }
}

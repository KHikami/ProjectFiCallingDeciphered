package p000;

import java.util.Collections;
import java.util.Set;

final class jdg implements jch {
    final /* synthetic */ jcx f19894a;
    private final String f19895b;

    private jdg(jcx jcx, String str) {
        this.f19894a = jcx;
        this.f19895b = String.valueOf(str).concat(".");
    }

    jdg(jcx jcx, int i) {
        this(jcx, Integer.toString(i));
    }

    public boolean mo3438a(String str) {
        return this.f19894a.f19875b.contains(m23964e(str));
    }

    public String mo3435a(String str, String str2) {
        return this.f19894a.f19875b.getString(m23964e(str), str2);
    }

    public String mo3440b(String str) {
        return mo3435a(str, null);
    }

    public Set<String> mo3436a(String str, Set<String> set) {
        Set stringSet = this.f19894a.f19875b.getStringSet(m23964e(str), null);
        if (stringSet == null) {
            return null;
        }
        return Collections.unmodifiableSet(stringSet);
    }

    public boolean mo3439a(String str, boolean z) {
        return this.f19894a.f19875b.getBoolean(m23964e(str), z);
    }

    public boolean mo3448c(String str) {
        return mo3439a(str, false);
    }

    public int mo3433a(String str, int i) {
        return this.f19894a.f19875b.getInt(m23964e(str), i);
    }

    public long mo3434a(String str, long j) {
        return this.f19894a.f19875b.getLong(m23964e(str), j);
    }

    public boolean mo3437a() {
        return mo3448c("logged_in");
    }

    public boolean mo3442b() {
        return mo3448c("logged_out");
    }

    public jch mo3449d(String str) {
        jcx jcx = this.f19894a;
        String valueOf = String.valueOf(this.f19895b);
        String valueOf2 = String.valueOf(str);
        return new jdg(jcx, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
    }

    private String m23964e(String str) {
        String valueOf = String.valueOf(this.f19895b);
        String valueOf2 = String.valueOf(str);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }
}

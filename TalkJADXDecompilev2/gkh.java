package defpackage;

public abstract class gkh {
    private String a;
    public String b;
    public String c;
    public boolean d;
    private final String e;
    private String f;
    private String g;

    public abstract void a();

    public gkh(String str, String str2) {
        this(str, str2, false);
    }

    private gkh(String str, String str2, boolean z) {
        this.e = str;
        if (this.e == null || this.e.contains("focus")) {
            this.a = str2;
        }
        this.d = false;
    }

    public String l() {
        return this.e;
    }

    public String m() {
        return this.a;
    }

    public boolean n() {
        return this.d;
    }

    public String o() {
        return this.f;
    }

    public void a(String str) {
        this.f = str;
    }

    public String p() {
        return this.g;
    }

    public void b(String str) {
        this.g = str;
    }

    public String toString() {
        String str = this.e;
        String valueOf = String.valueOf(glk.b(this.a));
        String str2 = this.b;
        String str3 = this.c;
        return new StringBuilder((((String.valueOf(str).length() + 41) + String.valueOf(valueOf).length()) + String.valueOf(str2).length()) + String.valueOf(str3).length()).append("Base:").append(str).append(" Account name=").append(valueOf).append(" Load:").append(str2).append(" key=").append(str3).append(" save:").append(this.d).toString();
    }

    public String q() {
        if (this.c == null) {
            a();
        }
        return this.c;
    }

    public String r() {
        if (this.b == null) {
            a();
        }
        return this.b;
    }
}

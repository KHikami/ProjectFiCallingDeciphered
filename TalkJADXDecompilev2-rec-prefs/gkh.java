package p000;

public abstract class gkh {
    private String f3578a;
    public String f3579b;
    public String f3580c;
    public boolean f3581d;
    private final String f3582e;
    private String f3583f;
    private String f3584g;

    public abstract void mo608a();

    public gkh(String str, String str2) {
        this(str, str2, false);
    }

    private gkh(String str, String str2, boolean z) {
        this.f3582e = str;
        if (this.f3582e == null || this.f3582e.contains("focus")) {
            this.f3578a = str2;
        }
        this.f3581d = false;
    }

    public String m5539l() {
        return this.f3582e;
    }

    public String m5540m() {
        return this.f3578a;
    }

    public boolean m5541n() {
        return this.f3581d;
    }

    public String m5542o() {
        return this.f3583f;
    }

    public void m5537a(String str) {
        this.f3583f = str;
    }

    public String m5543p() {
        return this.f3584g;
    }

    public void m5538b(String str) {
        this.f3584g = str;
    }

    public String toString() {
        String str = this.f3582e;
        String valueOf = String.valueOf(glk.m17974b(this.f3578a));
        String str2 = this.f3579b;
        String str3 = this.f3580c;
        return new StringBuilder((((String.valueOf(str).length() + 41) + String.valueOf(valueOf).length()) + String.valueOf(str2).length()) + String.valueOf(str3).length()).append("Base:").append(str).append(" Account name=").append(valueOf).append(" Load:").append(str2).append(" key=").append(str3).append(" save:").append(this.f3581d).toString();
    }

    public String m5544q() {
        if (this.f3580c == null) {
            mo608a();
        }
        return this.f3580c;
    }

    public String m5545r() {
        if (this.f3579b == null) {
            mo608a();
        }
        return this.f3579b;
    }
}

package defpackage;

import android.net.Uri;
import android.text.TextUtils;

/* renamed from: gkc */
public class gkc extends gkh {
    private int a;
    private int e;
    private int f;
    private int g;
    private boolean h;
    private boolean i;
    private int j;
    private boolean k;
    private boolean l;
    private bjy m;
    private boolean n;

    public gkc(String str, String str2) {
        super(str, str2);
        this.a = -1;
        this.e = -1;
    }

    public gkc a(int i, int i2) {
        this.g = i;
        this.f = i2;
        return this;
    }

    public gkc a(int i) {
        this.g = i;
        this.f = i;
        return this;
    }

    public gkc b(int i, int i2) {
        this.e = i;
        this.a = i2;
        return this;
    }

    public gkc a(boolean z) {
        this.h = z;
        return this;
    }

    public gkc b(boolean z) {
        this.n = z;
        return this;
    }

    public gkc c(boolean z) {
        this.i = z;
        return this;
    }

    public gkc b(int i) {
        this.j = 0;
        return this;
    }

    public gkc d(boolean z) {
        this.k = z;
        return this;
    }

    public gkc e(boolean z) {
        this.d = true;
        return this;
    }

    public gkc f(boolean z) {
        this.l = z;
        return this;
    }

    public gkc a(bjy bjy) {
        this.m = bjy;
        return this;
    }

    public int b() {
        return this.g;
    }

    public int c() {
        return this.f;
    }

    public boolean d() {
        return this.h;
    }

    public boolean e() {
        return this.i;
    }

    public int f() {
        return this.j;
    }

    public boolean g() {
        return this.n;
    }

    public boolean h() {
        return this.k;
    }

    public boolean i() {
        return this.l;
    }

    public boolean j() {
        return (this.m == null || this.m == bjy.NONE) ? false : true;
    }

    public bjy k() {
        return this.m;
    }

    public static StringBuilder a(int i, int i2, boolean z, boolean z2, boolean z3) {
        StringBuilder stringBuilder = new StringBuilder();
        if (z3) {
            stringBuilder.append("d");
            stringBuilder.append("-ip");
        } else {
            if (i2 == i) {
                stringBuilder.append("s").append(i);
                if (z) {
                    stringBuilder.append("-c");
                }
            } else {
                stringBuilder.append("w").append(i).append("-h").append(i2);
                if (z) {
                    stringBuilder.append("-n");
                }
            }
            if (z2) {
                stringBuilder.append("-k");
            }
            stringBuilder.append("-no");
        }
        return stringBuilder;
    }

    public void a() {
        String str;
        gkc gkc;
        if (TextUtils.isEmpty(l())) {
            str = null;
            gkc = this;
        } else if (l().startsWith("content://")) {
            str = l();
            gkc = this;
        } else {
            int i = this.e == -1 ? this.g : this.e;
            int i2 = this.a == -1 ? this.f : this.a;
            String l = l();
            StringBuilder a = gkc.a(i, i2, this.h, this.k, this.d);
            if (TextUtils.isEmpty(l)) {
                str = null;
                gkc = this;
            } else if (frm.a(l)) {
                str = l;
                gkc = this;
            } else {
                Object obj;
                CharSequence scheme = Uri.parse(l).getScheme();
                if (TextUtils.equals(scheme, "content")) {
                    obj = 1;
                } else if (scheme == null) {
                    String str2 = "https:";
                    str = String.valueOf(l);
                    l = str.length() != 0 ? str2.concat(str) : new String(str2);
                    obj = null;
                } else {
                    obj = null;
                }
                if (obj != null) {
                    str = String.valueOf(a.toString());
                    str = new StringBuilder((String.valueOf(l).length() + 1) + String.valueOf(str).length()).append(l).append("?").append(str).toString();
                } else {
                    str = enm.a(a.toString(), l).toString();
                }
                gkc = this;
            }
        }
        gkc.b = str;
        StringBuilder a2 = gkc.a(this.g, this.f, this.h, this.k, this.d);
        if (this.m == bjy.GV) {
            a2.append("-gvsms");
        } else if (this.m == bjy.CARRIER) {
            a2.append("-sms");
        }
        if (this.l) {
            a2.append("-force");
        }
        if (this.n) {
            a2.append("-rounded");
        }
        String valueOf = String.valueOf(l());
        str = String.valueOf(a2.toString());
        this.c = str.length() != 0 ? valueOf.concat(str) : new String(valueOf);
    }
}

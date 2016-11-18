package p000;

import android.net.Uri;
import android.text.TextUtils;

public class gkc extends gkh {
    private int f3585a = -1;
    private int f3586e = -1;
    private int f3587f;
    private int f3588g;
    private boolean f3589h;
    private boolean f3590i;
    private int f3591j;
    private boolean f3592k;
    private boolean f3593l;
    private bjy f3594m;
    private boolean f3595n;

    public gkc(String str, String str2) {
        super(str, str2);
    }

    public gkc m5548a(int i, int i2) {
        this.f3588g = i;
        this.f3587f = i2;
        return this;
    }

    public gkc m5547a(int i) {
        this.f3588g = i;
        this.f3587f = i;
        return this;
    }

    public gkc m5554b(int i, int i2) {
        this.f3586e = i;
        this.f3585a = i2;
        return this;
    }

    public gkc m5550a(boolean z) {
        this.f3589h = z;
        return this;
    }

    public gkc m5555b(boolean z) {
        this.f3595n = z;
        return this;
    }

    public gkc m5557c(boolean z) {
        this.f3590i = z;
        return this;
    }

    public gkc m5553b(int i) {
        this.f3591j = 0;
        return this;
    }

    public gkc m5558d(boolean z) {
        this.f3592k = z;
        return this;
    }

    public gkc m5560e(boolean z) {
        this.d = true;
        return this;
    }

    public gkc m5563f(boolean z) {
        this.f3593l = z;
        return this;
    }

    public gkc m5549a(bjy bjy) {
        this.f3594m = bjy;
        return this;
    }

    public int m5552b() {
        return this.f3588g;
    }

    public int m5556c() {
        return this.f3587f;
    }

    public boolean m5559d() {
        return this.f3589h;
    }

    public boolean m5561e() {
        return this.f3590i;
    }

    public int m5562f() {
        return this.f3591j;
    }

    public boolean m5564g() {
        return this.f3595n;
    }

    public boolean m5565h() {
        return this.f3592k;
    }

    public boolean m5566i() {
        return this.f3593l;
    }

    public boolean m5567j() {
        return (this.f3594m == null || this.f3594m == bjy.NONE) ? false : true;
    }

    public bjy m5568k() {
        return this.f3594m;
    }

    public static StringBuilder m5546a(int i, int i2, boolean z, boolean z2, boolean z3) {
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

    public void mo608a() {
        String str;
        gkc gkc;
        if (TextUtils.isEmpty(m5539l())) {
            str = null;
            gkc = this;
        } else if (m5539l().startsWith("content://")) {
            str = m5539l();
            gkc = this;
        } else {
            int i = this.f3586e == -1 ? this.f3588g : this.f3586e;
            int i2 = this.f3585a == -1 ? this.f3587f : this.f3585a;
            String l = m5539l();
            StringBuilder a = gkc.m5546a(i, i2, this.f3589h, this.f3592k, this.d);
            if (TextUtils.isEmpty(l)) {
                str = null;
                gkc = this;
            } else if (frm.m16048a(l)) {
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
                    str = enm.m14145a(a.toString(), l).toString();
                }
                gkc = this;
            }
        }
        gkc.b = str;
        StringBuilder a2 = gkc.m5546a(this.f3588g, this.f3587f, this.f3589h, this.f3592k, this.d);
        if (this.f3594m == bjy.GV) {
            a2.append("-gvsms");
        } else if (this.f3594m == bjy.CARRIER) {
            a2.append("-sms");
        }
        if (this.f3593l) {
            a2.append("-force");
        }
        if (this.f3595n) {
            a2.append("-rounded");
        }
        String valueOf = String.valueOf(m5539l());
        str = String.valueOf(a2.toString());
        this.c = str.length() != 0 ? valueOf.concat(str) : new String(valueOf);
    }
}

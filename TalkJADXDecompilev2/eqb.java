package defpackage;

import android.text.TextUtils;
import java.io.Serializable;
import java.util.concurrent.TimeUnit;

public final class eqb implements Serializable {
    private static final boolean a = false;
    private final String b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final int f;
    private boolean g;

    static {
        kae kae = glk.l;
    }

    public eqb(lts lts) {
        this.g = false;
        this.b = lts.a.a;
        if (TextUtils.isEmpty(this.b)) {
            glk.e("Babel", "Phone number should not be empty", new Object[0]);
        }
        this.c = gwb.b(lts.b);
        this.d = gwb.b(lts.f);
        boolean z = lts.c != null && gwb.a(lts.c) == 1;
        this.e = z;
        if (a) {
            String str = this.b;
            String valueOf = String.valueOf(lts.e);
            new StringBuilder((String.valueOf(str).length() + 29) + String.valueOf(valueOf).length()).append("Discoverability status for ").append(str).append(": ").append(valueOf);
        }
        switch (gwb.a(lts.e)) {
            case 1:
                this.f = 1;
                this.g = true;
                break;
            case 3:
                this.f = 2;
                break;
            default:
                this.f = 0;
                break;
        }
        iih iih = (iih) jyn.a(gwb.H(), iih.class);
        if (this.e) {
            iih.a(-1).b().a(1, TimeUnit.DAYS).c(1616);
        }
        if (this.g) {
            iih.a(-1).b().a(1, TimeUnit.DAYS).c(1617);
        }
    }

    private eqb(String str, boolean z, boolean z2, int i, boolean z3) {
        this.b = str;
        this.c = z;
        this.e = z2;
        this.f = i;
        this.d = z3;
    }

    public String a() {
        return this.b;
    }

    public boolean b() {
        return this.e;
    }

    public boolean c() {
        return this.e && this.f == 1;
    }

    public boolean d() {
        return this.c;
    }

    public boolean e() {
        return this.d;
    }

    public String toString() {
        return this.b + "," + String.valueOf(this.c) + "," + String.valueOf(this.e) + "," + String.valueOf(this.f) + "," + String.valueOf(this.d);
    }

    public static eqb a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split(",");
        if (split.length == 5) {
            return new eqb(split[0], Boolean.parseBoolean(split[1]), Boolean.parseBoolean(split[2]), Integer.parseInt(split[3]), Boolean.parseBoolean(split[4]));
        }
        glk.d("Babel", new StringBuilder(String.valueOf(str).length() + 111).append("Phone verification state is ignored due to changed format. Expected 5 parts, but got ").append(split.length).append("; input was: [").append(str).append("]").toString(), new Object[0]);
        return null;
    }
}

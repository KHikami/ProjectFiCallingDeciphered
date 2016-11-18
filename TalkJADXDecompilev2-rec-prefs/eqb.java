package p000;

import android.text.TextUtils;
import java.io.Serializable;
import java.util.concurrent.TimeUnit;

public final class eqb implements Serializable {
    private static final boolean f12023a = false;
    private final String f12024b;
    private final boolean f12025c;
    private final boolean f12026d;
    private final boolean f12027e;
    private final int f12028f;
    private boolean f12029g;

    static {
        kae kae = glk.f15565l;
    }

    public eqb(lts lts) {
        this.f12029g = false;
        this.f12024b = lts.f26405a.f28411a;
        if (TextUtils.isEmpty(this.f12024b)) {
            glk.m17982e("Babel", "Phone number should not be empty", new Object[0]);
        }
        this.f12025c = gwb.m2061b(lts.f26406b);
        this.f12026d = gwb.m2061b(lts.f26410f);
        boolean z = lts.f26407c != null && gwb.m1507a(lts.f26407c) == 1;
        this.f12027e = z;
        if (f12023a) {
            String str = this.f12024b;
            String valueOf = String.valueOf(lts.f26409e);
            new StringBuilder((String.valueOf(str).length() + 29) + String.valueOf(valueOf).length()).append("Discoverability status for ").append(str).append(": ").append(valueOf);
        }
        switch (gwb.m1507a(lts.f26409e)) {
            case 1:
                this.f12028f = 1;
                this.f12029g = true;
                break;
            case 3:
                this.f12028f = 2;
                break;
            default:
                this.f12028f = 0;
                break;
        }
        iih iih = (iih) jyn.m25426a(gwb.m1400H(), iih.class);
        if (this.f12027e) {
            iih.mo1979a(-1).mo1693b().mo1697a(1, TimeUnit.DAYS).mo1714c(1616);
        }
        if (this.f12029g) {
            iih.mo1979a(-1).mo1693b().mo1697a(1, TimeUnit.DAYS).mo1714c(1617);
        }
    }

    private eqb(String str, boolean z, boolean z2, int i, boolean z3) {
        this.f12024b = str;
        this.f12025c = z;
        this.f12027e = z2;
        this.f12028f = i;
        this.f12026d = z3;
    }

    public String m14240a() {
        return this.f12024b;
    }

    public boolean m14241b() {
        return this.f12027e;
    }

    public boolean m14242c() {
        return this.f12027e && this.f12028f == 1;
    }

    public boolean m14243d() {
        return this.f12025c;
    }

    public boolean m14244e() {
        return this.f12026d;
    }

    public String toString() {
        return this.f12024b + "," + String.valueOf(this.f12025c) + "," + String.valueOf(this.f12027e) + "," + String.valueOf(this.f12028f) + "," + String.valueOf(this.f12026d);
    }

    public static eqb m14239a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split(",");
        if (split.length == 5) {
            return new eqb(split[0], Boolean.parseBoolean(split[1]), Boolean.parseBoolean(split[2]), Integer.parseInt(split[3]), Boolean.parseBoolean(split[4]));
        }
        glk.m17981d("Babel", new StringBuilder(String.valueOf(str).length() + 111).append("Phone verification state is ignored due to changed format. Expected 5 parts, but got ").append(split.length).append("; input was: [").append(str).append("]").toString(), new Object[0]);
        return null;
    }
}

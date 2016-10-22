package defpackage;

import android.text.TextUtils;
import java.io.Serializable;

/* renamed from: ety */
public final class ety implements Serializable {
    public final int a;
    public final long b;
    public final double c;
    public final double d;
    public final String e;

    public ety(lpp lpp) {
        this.e = lpp.f;
        this.a = gwb.a(lpp.a);
        this.b = gwb.a(lpp.d);
        this.c = gwb.a(lpp.b);
        this.d = gwb.a(lpp.c);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ety)) {
            return false;
        }
        ety ety = (ety) obj;
        if (ety.a == this.a && ety.b == this.b && ety.c == this.c && ety.d == this.d && TextUtils.equals(ety.e, this.e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return gwb.e(this.e, gwb.a(this.d, gwb.a(this.c, gwb.a(this.b, gwb.f(this.a, 17)))));
    }

    public String toString() {
        String str = this.e;
        int i = this.a;
        double d = this.c;
        double d2 = this.d;
        return new StringBuilder(String.valueOf(str).length() + 123).append("[").append(str).append("]: type=").append(i).append(", latitude=").append(d).append(", longitude=").append(d2).append(", timestamp=").append(this.b).toString();
    }
}

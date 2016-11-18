package p000;

import android.text.TextUtils;
import java.io.Serializable;

public final class ety implements Serializable {
    public final int f12275a;
    public final long f12276b;
    public final double f12277c;
    public final double f12278d;
    public final String f12279e;

    public ety(lpp lpp) {
        this.f12279e = lpp.f26019f;
        this.f12275a = gwb.m1507a(lpp.f26014a);
        this.f12276b = gwb.m1523a(lpp.f26017d);
        this.f12277c = gwb.m1473a(lpp.f26015b);
        this.f12278d = gwb.m1473a(lpp.f26016c);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ety)) {
            return false;
        }
        ety ety = (ety) obj;
        if (ety.f12275a == this.f12275a && ety.f12276b == this.f12276b && ety.f12277c == this.f12277c && ety.f12278d == this.f12278d && TextUtils.equals(ety.f12279e, this.f12279e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return gwb.m2161e(this.f12279e, gwb.m1482a(this.f12278d, gwb.m1482a(this.f12277c, gwb.m1487a(this.f12276b, gwb.m2188f(this.f12275a, 17)))));
    }

    public String toString() {
        String str = this.f12279e;
        int i = this.f12275a;
        double d = this.f12277c;
        double d2 = this.f12278d;
        return new StringBuilder(String.valueOf(str).length() + 123).append("[").append(str).append("]: type=").append(i).append(", latitude=").append(d).append(", longitude=").append(d2).append(", timestamp=").append(this.f12276b).toString();
    }
}

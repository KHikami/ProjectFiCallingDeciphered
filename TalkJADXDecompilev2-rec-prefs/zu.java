package p000;

import android.content.pm.ResolveInfo;
import java.math.BigDecimal;

public final class zu implements Comparable<zu> {
    public final ResolveInfo f35939a;
    public float f35940b;
    final /* synthetic */ zt f35941c;

    public /* synthetic */ int compareTo(Object obj) {
        return m41613a((zu) obj);
    }

    public zu(zt ztVar, ResolveInfo resolveInfo) {
        this.f35941c = ztVar;
        this.f35939a = resolveInfo;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f35940b) + 31;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        if (Float.floatToIntBits(this.f35940b) != Float.floatToIntBits(((zu) obj).f35940b)) {
            return false;
        }
        return true;
    }

    private int m41613a(zu zuVar) {
        return Float.floatToIntBits(zuVar.f35940b) - Float.floatToIntBits(this.f35940b);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        stringBuilder.append("resolveInfo:").append(this.f35939a.toString());
        stringBuilder.append("; weight:").append(new BigDecimal((double) this.f35940b));
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

package defpackage;

import android.content.pm.ResolveInfo;
import java.math.BigDecimal;

public final class zu implements Comparable<zu> {
    public final ResolveInfo a;
    public float b;
    final /* synthetic */ zt c;

    public /* synthetic */ int compareTo(Object obj) {
        return a((zu) obj);
    }

    public zu(zt ztVar, ResolveInfo resolveInfo) {
        this.c = ztVar;
        this.a = resolveInfo;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.b) + 31;
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
        if (Float.floatToIntBits(this.b) != Float.floatToIntBits(((zu) obj).b)) {
            return false;
        }
        return true;
    }

    private int a(zu zuVar) {
        return Float.floatToIntBits(zuVar.b) - Float.floatToIntBits(this.b);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        stringBuilder.append("resolveInfo:").append(this.a.toString());
        stringBuilder.append("; weight:").append(new BigDecimal((double) this.b));
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

import android.content.pm.ResolveInfo;
import java.math.BigDecimal;

/* compiled from: PG */
public final class uq implements Comparable {
    public final ResolveInfo a;
    public float b;

    public final /* synthetic */ int compareTo(Object obj) {
        return Float.floatToIntBits(((uq) obj).b) - Float.floatToIntBits(this.b);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.b) + 31;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        if (Float.floatToIntBits(this.b) != Float.floatToIntBits(((uq) obj).b)) {
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        stringBuilder.append("resolveInfo:").append(this.a.toString());
        stringBuilder.append("; weight:").append(new BigDecimal((double) this.b));
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

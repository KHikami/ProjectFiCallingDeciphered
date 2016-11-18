package p000;

import android.content.ComponentName;
import java.math.BigDecimal;

public final class zv {
    public final ComponentName f35942a;
    public final long f35943b;
    public final float f35944c;

    public zv(String str, long j, float f) {
        this(ComponentName.unflattenFromString(str), j, f);
    }

    public zv(ComponentName componentName, long j, float f) {
        this.f35942a = componentName;
        this.f35943b = j;
        this.f35944c = f;
    }

    public int hashCode() {
        return (((((this.f35942a == null ? 0 : this.f35942a.hashCode()) + 31) * 31) + ((int) (this.f35943b ^ (this.f35943b >>> 32)))) * 31) + Float.floatToIntBits(this.f35944c);
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
        zv zvVar = (zv) obj;
        if (this.f35942a == null) {
            if (zvVar.f35942a != null) {
                return false;
            }
        } else if (!this.f35942a.equals(zvVar.f35942a)) {
            return false;
        }
        if (this.f35943b != zvVar.f35943b) {
            return false;
        }
        if (Float.floatToIntBits(this.f35944c) != Float.floatToIntBits(zvVar.f35944c)) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        stringBuilder.append("; activity:").append(this.f35942a);
        stringBuilder.append("; time:").append(this.f35943b);
        stringBuilder.append("; weight:").append(new BigDecimal((double) this.f35944c));
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

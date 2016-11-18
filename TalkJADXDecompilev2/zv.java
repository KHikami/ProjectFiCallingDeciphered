package defpackage;

import android.content.ComponentName;
import java.math.BigDecimal;

public final class zv {
    public final ComponentName a;
    public final long b;
    public final float c;

    public zv(String str, long j, float f) {
        this(ComponentName.unflattenFromString(str), j, f);
    }

    public zv(ComponentName componentName, long j, float f) {
        this.a = componentName;
        this.b = j;
        this.c = f;
    }

    public int hashCode() {
        return (((((this.a == null ? 0 : this.a.hashCode()) + 31) * 31) + ((int) (this.b ^ (this.b >>> 32)))) * 31) + Float.floatToIntBits(this.c);
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
        if (this.a == null) {
            if (zvVar.a != null) {
                return false;
            }
        } else if (!this.a.equals(zvVar.a)) {
            return false;
        }
        if (this.b != zvVar.b) {
            return false;
        }
        if (Float.floatToIntBits(this.c) != Float.floatToIntBits(zvVar.c)) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        stringBuilder.append("; activity:").append(this.a);
        stringBuilder.append("; time:").append(this.b);
        stringBuilder.append("; weight:").append(new BigDecimal((double) this.c));
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

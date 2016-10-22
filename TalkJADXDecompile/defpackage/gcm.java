package defpackage;

import java.util.Objects;

/* renamed from: gcm */
public final class gcm {
    public final int a;
    public final int b;
    public final int c;
    public final String d;
    public final int e;
    public final int f;

    gcm(int i, int i2, int i3, String str, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = str;
        this.e = i4;
        this.f = i5;
    }

    public String toString() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        String str = this.d;
        int i4 = this.e;
        return new StringBuilder(String.valueOf(str).length() + 161).append("CellState, serviceState: ").append(i).append(", signalLevelPercent: ").append(i2).append(", phoneType: ").append(i3).append(", networkOperator: ").append(str).append(", networkType: ").append(i4).append(", systemId: ").append(this.f).toString();
    }

    public boolean a() {
        return this.a != 0 || this.b == -1 || this.b == 0;
    }

    public boolean a(int i) {
        return this.a == 0 && this.b != -1 && this.b > i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        gcm gcm = (gcm) obj;
        if (this.a == gcm.a && this.b == gcm.b && this.c == gcm.c && Objects.equals(this.d, gcm.d) && this.e == gcm.e && this.f == gcm.f) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = ((((this.a + 31) * 31) + this.b) * 31) + this.c;
        if (this.d != null) {
            i = (i * 31) + this.d.hashCode();
        }
        return (((i * 31) + this.e) * 31) + this.f;
    }
}

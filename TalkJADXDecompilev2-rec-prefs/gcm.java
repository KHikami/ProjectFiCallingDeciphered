package p000;

import java.util.Objects;

public final class gcm {
    public final int f14659a;
    public final int f14660b;
    public final int f14661c;
    public final String f14662d;
    public final int f14663e;
    public final int f14664f;

    gcm(int i, int i2, int i3, String str, int i4, int i5) {
        this.f14659a = i;
        this.f14660b = i2;
        this.f14661c = i3;
        this.f14662d = str;
        this.f14663e = i4;
        this.f14664f = i5;
    }

    public String toString() {
        int i = this.f14659a;
        int i2 = this.f14660b;
        int i3 = this.f14661c;
        String str = this.f14662d;
        int i4 = this.f14663e;
        return new StringBuilder(String.valueOf(str).length() + 161).append("CellState, serviceState: ").append(i).append(", signalLevelPercent: ").append(i2).append(", phoneType: ").append(i3).append(", networkOperator: ").append(str).append(", networkType: ").append(i4).append(", systemId: ").append(this.f14664f).toString();
    }

    public boolean m16929a() {
        return this.f14659a != 0 || this.f14660b == -1 || this.f14660b == 0;
    }

    public boolean m16930a(int i) {
        return this.f14659a == 0 && this.f14660b != -1 && this.f14660b > i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        gcm gcm = (gcm) obj;
        if (this.f14659a == gcm.f14659a && this.f14660b == gcm.f14660b && this.f14661c == gcm.f14661c && Objects.equals(this.f14662d, gcm.f14662d) && this.f14663e == gcm.f14663e && this.f14664f == gcm.f14664f) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = ((((this.f14659a + 31) * 31) + this.f14660b) * 31) + this.f14661c;
        if (this.f14662d != null) {
            i = (i * 31) + this.f14662d.hashCode();
        }
        return (((i * 31) + this.f14663e) * 31) + this.f14664f;
    }
}

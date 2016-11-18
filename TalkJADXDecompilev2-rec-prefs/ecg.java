package p000;

public final class ecg {
    public final int f11165a;
    public final int f11166b;
    public final String f11167c;
    public final String f11168d;

    ecg(int i, int i2, String str, String str2) {
        this.f11166b = i2;
        this.f11167c = str;
        this.f11168d = str2;
        this.f11165a = i;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ecg)) {
            return false;
        }
        ecg ecg = (ecg) obj;
        if (this.f11166b == ecg.f11166b && gwb.m2223g(this.f11167c, ecg.f11167c) && gwb.m2223g(this.f11168d, ecg.f11168d) && this.f11165a == ecg.f11165a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = this.f11166b;
        String str = this.f11167c;
        String str2 = this.f11168d;
        return new StringBuilder((String.valueOf(str).length() + 25) + String.valueOf(str2).length()).append(i).append(":").append(str).append(":").append(str2).append(":").append(this.f11165a).toString().hashCode();
    }
}

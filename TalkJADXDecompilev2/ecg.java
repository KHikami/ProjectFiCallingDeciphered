package defpackage;

public final class ecg {
    public final int a;
    public final int b;
    public final String c;
    public final String d;

    ecg(int i, int i2, String str, String str2) {
        this.b = i2;
        this.c = str;
        this.d = str2;
        this.a = i;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ecg)) {
            return false;
        }
        ecg ecg = (ecg) obj;
        if (this.b == ecg.b && gwb.g(this.c, ecg.c) && gwb.g(this.d, ecg.d) && this.a == ecg.a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = this.b;
        String str = this.c;
        String str2 = this.d;
        return new StringBuilder((String.valueOf(str).length() + 25) + String.valueOf(str2).length()).append(i).append(":").append(str).append(":").append(str2).append(":").append(this.a).toString().hashCode();
    }
}

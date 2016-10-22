package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* renamed from: avy */
public final class avy {
    public final long a;
    public final long b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;
    public final int g;

    public avy(long j, long j2, String str, String str2, String str3, long j3, int i) {
        this.b = j2;
        this.a = j;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = j3;
        this.g = i;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Long.valueOf(this.a), Long.valueOf(this.b), this.c, this.d, this.e, Long.valueOf(this.f), Integer.valueOf(this.g)});
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof avy)) {
            return false;
        }
        avy avy = (avy) obj;
        if (Objects.equals(Long.valueOf(this.a), Long.valueOf(avy.a)) && Objects.equals(Long.valueOf(this.b), Long.valueOf(avy.b)) && Objects.equals(this.c, avy.c) && Objects.equals(this.d, avy.d) && Objects.equals(this.e, avy.e) && Objects.equals(Long.valueOf(this.f), Long.valueOf(avy.f)) && Objects.equals(Integer.valueOf(this.g), Integer.valueOf(avy.g))) {
            return true;
        }
        return false;
    }
}

package p000;

public final class jjq {
    private final long f20303a;
    private final long f20304b;

    public jjq(long j, long j2) {
        this.f20303a = j;
        this.f20304b = j2;
    }

    public long m24501a() {
        return this.f20303a;
    }

    public long m24502b() {
        return this.f20304b;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jjq)) {
            return false;
        }
        jjq jjq = (jjq) obj;
        if (this.f20303a == jjq.f20303a && this.f20304b == jjq.f20304b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((int) (this.f20303a ^ (this.f20303a >>> 32))) + 527) * 31) + ((int) (this.f20304b ^ (this.f20304b >>> 32)));
    }

    public String toString() {
        long j = this.f20303a;
        return j + "/" + this.f20304b;
    }
}

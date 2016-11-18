package defpackage;

public final class jjq {
    private final long a;
    private final long b;

    public jjq(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public long a() {
        return this.a;
    }

    public long b() {
        return this.b;
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
        if (this.a == jjq.a && this.b == jjq.b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((int) (this.a ^ (this.a >>> 32))) + 527) * 31) + ((int) (this.b ^ (this.b >>> 32)));
    }

    public String toString() {
        long j = this.a;
        return j + "/" + this.b;
    }
}

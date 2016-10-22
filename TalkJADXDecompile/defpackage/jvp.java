package defpackage;

/* renamed from: jvp */
final class jvp extends jvi {
    private final String a;
    private final long b;

    jvp(String str, long j) {
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        this.a = str;
        this.b = j;
    }

    public String a() {
        return this.a;
    }

    public long b() {
        return this.b;
    }

    public String toString() {
        String str = this.a;
        return new StringBuilder(String.valueOf(str).length() + 50).append("ApiaryAuthToken{token=").append(str).append(", time=").append(this.b).append("}").toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jvi)) {
            return false;
        }
        jvi jvi = (jvi) obj;
        if (this.a.equals(jvi.a()) && this.b == jvi.b()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (int) (((long) ((this.a.hashCode() ^ 1000003) * 1000003)) ^ ((this.b >>> 32) ^ this.b));
    }
}

package p000;

final class jvp extends jvi {
    private final String f21141a;
    private final long f21142b;

    jvp(String str, long j) {
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        this.f21141a = str;
        this.f21142b = j;
    }

    public String mo3617a() {
        return this.f21141a;
    }

    public long mo3618b() {
        return this.f21142b;
    }

    public String toString() {
        String str = this.f21141a;
        return new StringBuilder(String.valueOf(str).length() + 50).append("ApiaryAuthToken{token=").append(str).append(", time=").append(this.f21142b).append("}").toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jvi)) {
            return false;
        }
        jvi jvi = (jvi) obj;
        if (this.f21141a.equals(jvi.mo3617a()) && this.f21142b == jvi.mo3618b()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (int) (((long) ((this.f21141a.hashCode() ^ 1000003) * 1000003)) ^ ((this.f21142b >>> 32) ^ this.f21142b));
    }
}

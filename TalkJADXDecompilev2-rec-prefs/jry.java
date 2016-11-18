package p000;

public final class jry extends jsf {
    private final String f20967a;
    private final int f20968b;
    private final int f20969c;

    public jry(String str, int i, int i2) {
        if (str == null) {
            throw new NullPointerException("Null host");
        }
        this.f20967a = str;
        this.f20968b = i;
        this.f20969c = i2;
    }

    String mo3600a() {
        return this.f20967a;
    }

    int mo3601b() {
        return this.f20968b;
    }

    int mo3602c() {
        return this.f20969c;
    }

    public String toString() {
        String str = this.f20967a;
        int i = this.f20968b;
        return new StringBuilder(String.valueOf(str).length() + 60).append("QuicHint{host=").append(str).append(", port=").append(i).append(", alternatePort=").append(this.f20969c).append("}").toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jsf)) {
            return false;
        }
        jsf jsf = (jsf) obj;
        if (this.f20967a.equals(jsf.mo3600a()) && this.f20968b == jsf.mo3601b() && this.f20969c == jsf.mo3602c()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f20967a.hashCode() ^ 1000003) * 1000003) ^ this.f20968b) * 1000003) ^ this.f20969c;
    }
}

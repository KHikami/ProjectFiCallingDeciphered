package defpackage;

/* renamed from: jry */
public final class jry extends jsf {
    private final String a;
    private final int b;
    private final int c;

    public jry(String str, int i, int i2) {
        if (str == null) {
            throw new NullPointerException("Null host");
        }
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    String a() {
        return this.a;
    }

    int b() {
        return this.b;
    }

    int c() {
        return this.c;
    }

    public String toString() {
        String str = this.a;
        int i = this.b;
        return new StringBuilder(String.valueOf(str).length() + 60).append("QuicHint{host=").append(str).append(", port=").append(i).append(", alternatePort=").append(this.c).append("}").toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jsf)) {
            return false;
        }
        jsf jsf = (jsf) obj;
        if (this.a.equals(jsf.a()) && this.b == jsf.b() && this.c == jsf.c()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }
}

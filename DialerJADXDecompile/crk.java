public final class crk {
    final String a;
    final String b;
    final int c;

    public crk(String str, String str2, int i) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof crk)) {
            return false;
        }
        crk crk = (crk) obj;
        return buf.c(this.a, crk.a) && buf.c(this.b, crk.b) && buf.c(Integer.valueOf(this.c), Integer.valueOf(crk.c));
    }

    public final int hashCode() {
        return buf.a(this.a, this.b, Integer.valueOf(this.c));
    }

    public final String toString() {
        return "CacheKey[" + this.a + "/" + this.b + "/" + this.c + "]";
    }
}

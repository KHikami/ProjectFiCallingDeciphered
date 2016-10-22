public final class iht {
    private static final iic a;
    private final String b;
    private final iic c;
    private final int d;

    static {
        a = new iic();
    }

    public iht(String str) {
        this(str, a);
    }

    private iht(String str, iic iic) {
        this(str, iic, -1);
    }

    public iht(String str, iic iic, int i) {
        this.b = str;
        this.c = iic;
        this.d = i;
        if (!jpo.a(str)) {
            String str2 = "baseUrl is not a fife Url: ";
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        }
    }

    public iic a() {
        return this.c;
    }

    public String b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof iht)) {
            return false;
        }
        iht iht = (iht) obj;
        if (this.c.equals(iht.c) && this.b.equals(iht.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.c.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        String str = this.b;
        String valueOf = String.valueOf(this.c);
        return new StringBuilder((String.valueOf(str).length() + 38) + String.valueOf(valueOf).length()).append("FifeModel{baseUrl='").append(str).append("', fifeUrlOptions=").append(valueOf).append("}").toString();
    }
}

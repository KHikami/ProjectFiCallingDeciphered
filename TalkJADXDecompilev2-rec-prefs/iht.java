package p000;

public final class iht {
    private static final iic f17694a = new iic();
    private final String f17695b;
    private final iic f17696c;
    private final int f17697d;

    public iht(String str) {
        this(str, f17694a);
    }

    private iht(String str, iic iic) {
        this(str, iic, -1);
    }

    public iht(String str, iic iic, int i) {
        this.f17695b = str;
        this.f17696c = iic;
        this.f17697d = i;
        if (!jpo.m24941a(str)) {
            String str2 = "baseUrl is not a fife Url: ";
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        }
    }

    public iic m21831a() {
        return this.f17696c;
    }

    public String m21832b() {
        return this.f17695b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof iht)) {
            return false;
        }
        iht iht = (iht) obj;
        if (this.f17696c.equals(iht.f17696c) && this.f17695b.equals(iht.f17695b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f17696c.hashCode() * 31) + this.f17695b.hashCode();
    }

    public String toString() {
        String str = this.f17695b;
        String valueOf = String.valueOf(this.f17696c);
        return new StringBuilder((String.valueOf(str).length() + 38) + String.valueOf(valueOf).length()).append("FifeModel{baseUrl='").append(str).append("', fifeUrlOptions=").append(valueOf).append("}").toString();
    }
}

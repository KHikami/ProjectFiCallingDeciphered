package p000;

public final class hun implements hwm {
    private final String f17303b;
    private final String f17304c;
    private final double f17305d;
    private final double f17306e;
    private final double f17307f;
    private final double f17308g;
    private final double f17309h;
    private final String f17310i;
    private final String f17311j;
    private final String f17312k;
    private final String f17313l;
    private final String f17314m;

    public hun(String str, String str2) {
        this(str, str2, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, null, null, null, null);
    }

    public hun(String str, String str2, double d, double d2, double d3, double d4, double d5, String str3, String str4, String str5, String str6, String str7) {
        this.f17303b = str;
        this.f17304c = str2;
        this.f17305d = d;
        this.f17306e = d2;
        this.f17307f = d3;
        this.f17308g = d4;
        this.f17309h = d5;
        this.f17310i = str3;
        this.f17311j = str4;
        this.f17312k = str5;
        this.f17313l = str6;
        this.f17314m = str7;
    }

    public String mo2950a() {
        return this.f17303b;
    }

    public String mo2951b() {
        return this.f17304c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof hun)) {
            return false;
        }
        return gwb.m2186e(this.f17304c, ((hun) obj).f17304c);
    }

    public String toString() {
        String str = this.f17304c != null ? this.f17304c : "null";
        String str2 = this.f17303b != null ? this.f17303b : "null";
        double d = this.f17305d;
        String str3 = this.f17310i;
        double d2 = this.f17306e;
        String str4 = this.f17311j;
        double d3 = this.f17307f;
        String str5 = this.f17312k;
        double d4 = this.f17308g;
        String str6 = this.f17313l;
        double d5 = this.f17309h;
        String str7 = this.f17314m;
        return new StringBuilder(((((((String.valueOf(str).length() + 172) + String.valueOf(str2).length()) + String.valueOf(str3).length()) + String.valueOf(str4).length()) + String.valueOf(str5).length()) + String.valueOf(str6).length()) + String.valueOf(str7).length()).append("EmailAddress:[Value=").append(str).append(" Type=").append(str2).append(" a1=").append(d).append(",").append(str3).append(" a2=").append(d2).append(",").append(str4).append(" a3=").append(d3).append(",").append(str5).append(" a4=").append(d4).append(",").append(str6).append(" a5=").append(d5).append(",").append(str7).append("]").toString();
    }
}

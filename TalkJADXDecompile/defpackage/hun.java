package defpackage;

/* renamed from: hun */
public final class hun implements hwm {
    private final String b;
    private final String c;
    private final double d;
    private final double e;
    private final double f;
    private final double g;
    private final double h;
    private final String i;
    private final String j;
    private final String k;
    private final String l;
    private final String m;

    public hun(String str, String str2) {
        this(str, str2, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, null, null, null, null);
    }

    public hun(String str, String str2, double d, double d2, double d3, double d4, double d5, String str3, String str4, String str5, String str6, String str7) {
        this.b = str;
        this.c = str2;
        this.d = d;
        this.e = d2;
        this.f = d3;
        this.g = d4;
        this.h = d5;
        this.i = str3;
        this.j = str4;
        this.k = str5;
        this.l = str6;
        this.m = str7;
    }

    public String a() {
        return this.b;
    }

    public String b() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof hun)) {
            return false;
        }
        return gwb.e(this.c, ((hun) obj).c);
    }

    public String toString() {
        String str = this.c != null ? this.c : "null";
        String str2 = this.b != null ? this.b : "null";
        double d = this.d;
        String str3 = this.i;
        double d2 = this.e;
        String str4 = this.j;
        double d3 = this.f;
        String str5 = this.k;
        double d4 = this.g;
        String str6 = this.l;
        double d5 = this.h;
        String str7 = this.m;
        return new StringBuilder(((((((String.valueOf(str).length() + 172) + String.valueOf(str2).length()) + String.valueOf(str3).length()) + String.valueOf(str4).length()) + String.valueOf(str5).length()) + String.valueOf(str6).length()) + String.valueOf(str7).length()).append("EmailAddress:[Value=").append(str).append(" Type=").append(str2).append(" a1=").append(d).append(",").append(str3).append(" a2=").append(d2).append(",").append(str4).append(" a3=").append(d3).append(",").append(str5).append(" a4=").append(d4).append(",").append(str6).append(" a5=").append(d5).append(",").append(str7).append("]").toString();
    }
}

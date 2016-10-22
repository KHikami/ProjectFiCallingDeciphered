public final class crr {
    public String a;
    private String b;
    private String c;
    private int d;
    private String e;
    private crj f;

    private crr(String str) {
        this.b = str;
        this.c = "";
        this.a = "";
        this.d = 0;
        this.e = null;
        this.f = crj.a;
    }

    public crr(String str, String str2) {
        this(str);
        this.e = str2;
    }

    public final crm a(String str, int i) {
        return new cro(this.c + str, this.b, this.a + str, 0, this.e, this.f, Integer.valueOf(i), this.a + str);
    }

    public final crm a(String str, long j) {
        return new crn(this.c + str, this.b, this.a + str, 0, this.e, this.f, Long.valueOf(j), this.a + str);
    }

    public final crm a(String str, String str2) {
        return new crq(this.c + str, this.b, this.a + str, 0, this.e, this.f, str2, this.a + str);
    }

    public final crm a(String str, boolean z) {
        return new crp(this.c + str, this.b, this.a + str, 0, this.e, this.f, Boolean.valueOf(z), this.a + str);
    }
}

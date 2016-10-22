public final class jvc {
    private final String a;
    private final String b;
    private final boolean c;
    private final juh d;
    private final boolean e;
    private final juv f;

    @Deprecated
    public jvc(String str, String str2, juh juh, boolean z, juv juv) {
        this(str, str2, null, z, null, false);
    }

    @Deprecated
    private jvc(String str, String str2, juh juh, boolean z, juv juv, boolean z2) {
        this.a = (String) ba.a((Object) str, (Object) "accountName");
        this.b = str2;
        this.d = juh;
        this.e = z;
        this.f = juv;
        this.c = false;
    }

    jvc(jvd jvd) {
        this.a = jvd.a;
        this.b = jvd.b;
        this.d = jvd.d;
        this.e = jvd.e;
        this.f = jvd.f;
        boolean z = jvd.c && jvd.b != null;
        this.c = z;
    }

    public boolean a() {
        return this.c;
    }

    public String b() {
        return this.a;
    }

    public String c() {
        return this.b;
    }

    public juh d() {
        return this.d;
    }

    public boolean e() {
        return this.e;
    }

    public juv f() {
        return this.f;
    }

    public static jvd newBuilder() {
        return new jvd();
    }

    public static jvd newBuilder(jvc jvc) {
        jvd jvd = new jvd();
        jvd.a(jvc.b()).b(jvc.c()).a(jvc.a()).b(jvc.e()).a(jvc.f()).a(jvc.d());
        return jvd;
    }
}

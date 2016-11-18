package p000;

public final class jvc {
    private final String f21109a;
    private final String f21110b;
    private final boolean f21111c;
    private final juh f21112d;
    private final boolean f21113e;
    private final juv f21114f;

    @Deprecated
    public jvc(String str, String str2, juh juh, boolean z, juv juv) {
        this(str, str2, null, z, null, false);
    }

    @Deprecated
    private jvc(String str, String str2, juh juh, boolean z, juv juv, boolean z2) {
        this.f21109a = (String) ba.m4537a((Object) str, (Object) "accountName");
        this.f21110b = str2;
        this.f21112d = juh;
        this.f21113e = z;
        this.f21114f = juv;
        this.f21111c = false;
    }

    jvc(jvd jvd) {
        this.f21109a = jvd.f21115a;
        this.f21110b = jvd.f21116b;
        this.f21112d = jvd.f21118d;
        this.f21113e = jvd.f21119e;
        this.f21114f = jvd.f21120f;
        boolean z = jvd.f21117c && jvd.f21116b != null;
        this.f21111c = z;
    }

    public boolean m25292a() {
        return this.f21111c;
    }

    public String m25293b() {
        return this.f21109a;
    }

    public String m25294c() {
        return this.f21110b;
    }

    public juh m25295d() {
        return this.f21112d;
    }

    public boolean m25296e() {
        return this.f21113e;
    }

    public juv m25297f() {
        return this.f21114f;
    }

    public static jvd newBuilder() {
        return new jvd();
    }

    public static jvd newBuilder(jvc jvc) {
        jvd jvd = new jvd();
        jvd.m25300a(jvc.m25293b()).m25304b(jvc.m25294c()).m25303a(jvc.m25292a()).m25305b(jvc.m25296e()).m25302a(jvc.m25297f()).m25301a(jvc.m25295d());
        return jvd;
    }
}

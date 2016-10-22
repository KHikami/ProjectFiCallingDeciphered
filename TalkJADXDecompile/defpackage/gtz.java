package defpackage;

/* renamed from: gtz */
public final class gtz<O extends gua> {
    private final guc<?, O> a;
    private final guh<?, O> b;
    private final gue c;
    private final gue d;
    private final String e;

    public <C extends gug> gtz(String str, guc<C, O> guc_C__O, gue gue) {
        gwb.f((Object) guc_C__O, (Object) "Cannot construct an Api with a null ClientBuilder");
        gwb.f((Object) gue, (Object) "Cannot construct an Api with a null ClientKey");
        this.e = str;
        this.a = guc_C__O;
        this.b = null;
        this.c = gue;
        this.d = null;
    }

    public guf<?, O> a() {
        return this.a;
    }

    public guc<?, O> b() {
        gwb.a(this.a != null, (Object) "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
        return this.a;
    }

    public gue<?> c() {
        if (this.c != null) {
            return this.c;
        }
        throw new IllegalStateException("This API was constructed with null client keys. This should not be possible.");
    }

    public String d() {
        return this.e;
    }
}

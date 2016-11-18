package p000;

public final class gtz<O extends gua> {
    private final guc<?, O> f16149a;
    private final guh<?, O> f16150b = null;
    private final gue f16151c;
    private final gue f16152d;
    private final String f16153e;

    public <C extends gug> gtz(String str, guc<C, O> guc_C__O, gue gue) {
        gwb.m2195f((Object) guc_C__O, (Object) "Cannot construct an Api with a null ClientBuilder");
        gwb.m2195f((Object) gue, (Object) "Cannot construct an Api with a null ClientKey");
        this.f16153e = str;
        this.f16149a = guc_C__O;
        this.f16151c = gue;
        this.f16152d = null;
    }

    public guf<?, O> m18604a() {
        return this.f16149a;
    }

    public guc<?, O> m18605b() {
        gwb.m1886a(this.f16149a != null, (Object) "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
        return this.f16149a;
    }

    public gue<?> m18606c() {
        if (this.f16151c != null) {
            return this.f16151c;
        }
        throw new IllegalStateException("This API was constructed with null client keys. This should not be possible.");
    }

    public String m18607d() {
        return this.f16153e;
    }
}

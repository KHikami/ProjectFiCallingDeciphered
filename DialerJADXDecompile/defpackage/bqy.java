package defpackage;

/* renamed from: bqy */
public final class bqy {
    public final String a;
    private final bqz b;
    private final i c;
    private final brb d;
    private final buf e;

    public bqy(String str, bqz bqz, brb brb) {
        buf.d((Object) bqz, (Object) "Cannot construct an Api with a null ClientBuilder");
        buf.d((Object) brb, (Object) "Cannot construct an Api with a null ClientKey");
        this.a = str;
        this.b = bqz;
        this.c = null;
        this.d = brb;
        this.e = null;
    }

    public final bqz a() {
        buf.a(this.b != null, (Object) "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
        return this.b;
    }

    public final brb b() {
        buf.a(this.d != null, (Object) "This API was constructed with a SimpleClientKey. Use getSimpleClientKey");
        return this.d;
    }
}

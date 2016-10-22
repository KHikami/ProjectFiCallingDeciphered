import com.google.api.client.http.HttpStatusCodes;

final class ihv implements aoe<T>, aof<T> {
    final /* synthetic */ ihu a;
    private final aoe<T> b;
    private final int c;
    private final int d;
    private final anz e;
    private final iht f;
    private boolean g;
    private aof<? super T> h;
    private amq i;
    private volatile boolean j;

    ihv(ihu ihu, aoe<T> aoe_T, iht iht, int i, int i2, anz anz) {
        this.a = ihu;
        this.b = aoe_T;
        this.c = i;
        this.d = i2;
        this.e = anz;
        this.f = iht;
    }

    public void a(amq amq, aof<? super T> aof__super_T) {
        this.i = amq;
        this.h = aof__super_T;
        this.b.a(amq, this);
    }

    public void a() {
        this.b.a();
    }

    public void b() {
        this.j = true;
        this.b.b();
    }

    public Class<T> d() {
        return this.b.d();
    }

    public anq c() {
        return this.b.c();
    }

    public void a(T t) {
        this.h.a((Object) t);
    }

    public void a(Exception exception) {
        if (!(this.j || this.g)) {
            boolean z = exception instanceof anu ? HttpStatusCodes.STATUS_CODE_FORBIDDEN == ((anu) exception).a() : false;
            if (z) {
                this.g = true;
                gwb.I(this.a.b);
                aui a = this.a.a.a(this.a.a(this.f, this.c, this.d), this.c, this.d, this.e);
                if (a == null) {
                    a(exception);
                    return;
                } else {
                    a.c.a(this.i, this);
                    return;
                }
            }
        }
        this.h.a(exception);
    }
}

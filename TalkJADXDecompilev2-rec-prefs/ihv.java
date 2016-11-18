package p000;

import com.google.api.client.http.HttpStatusCodes;

final class ihv implements aoe<T>, aof<T> {
    final /* synthetic */ ihu f17702a;
    private final aoe<T> f17703b;
    private final int f17704c;
    private final int f17705d;
    private final anz f17706e;
    private final iht f17707f;
    private boolean f17708g;
    private aof<? super T> f17709h;
    private amq f17710i;
    private volatile boolean f17711j;

    ihv(ihu ihu, aoe<T> aoe_T, iht iht, int i, int i2, anz anz) {
        this.f17702a = ihu;
        this.f17703b = aoe_T;
        this.f17704c = i;
        this.f17705d = i2;
        this.f17706e = anz;
        this.f17707f = iht;
    }

    public void mo312a(amq amq, aof<? super T> aof__super_T) {
        this.f17710i = amq;
        this.f17709h = aof__super_T;
        this.f17703b.mo312a(amq, this);
    }

    public void mo311a() {
        this.f17703b.mo311a();
    }

    public void mo313b() {
        this.f17711j = true;
        this.f17703b.mo313b();
    }

    public Class<T> mo321d() {
        return this.f17703b.mo321d();
    }

    public anq mo314c() {
        return this.f17703b.mo314c();
    }

    public void mo326a(T t) {
        this.f17709h.mo326a((Object) t);
    }

    public void mo325a(Exception exception) {
        if (!(this.f17711j || this.f17708g)) {
            boolean z = exception instanceof anu ? HttpStatusCodes.STATUS_CODE_FORBIDDEN == ((anu) exception).m3519a() : false;
            if (z) {
                this.f17708g = true;
                gwb.m1404I(this.f17702a.f17699b);
                aui a = this.f17702a.f17698a.mo377a(this.f17702a.m21834a(this.f17707f, this.f17704c, this.f17705d), this.f17704c, this.f17705d, this.f17706e);
                if (a == null) {
                    mo325a(exception);
                    return;
                } else {
                    a.f2358c.mo312a(this.f17710i, this);
                    return;
                }
            }
        }
        this.f17709h.mo325a(exception);
    }
}

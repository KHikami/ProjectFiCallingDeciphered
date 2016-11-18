package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

final class auo<Data> implements aoe<Data>, aof<Data> {
    private final List<aoe<Data>> a;
    private final ll<List<Exception>> b;
    private int c = 0;
    private amq d;
    private aof<? super Data> e;
    private List<Exception> f;

    auo(List<aoe<Data>> list, ll<List<Exception>> llVar) {
        this.b = llVar;
        gwb.a((Collection) list);
        this.a = list;
    }

    public void a(amq amq, aof<? super Data> aof__super_Data) {
        this.d = amq;
        this.e = aof__super_Data;
        this.f = (List) this.b.a();
        ((aoe) this.a.get(this.c)).a(amq, this);
    }

    public void a() {
        this.b.a(this.f);
        this.f = null;
        for (aoe a : this.a) {
            a.a();
        }
    }

    public void b() {
        for (aoe b : this.a) {
            b.b();
        }
    }

    public Class<Data> d() {
        return ((aoe) this.a.get(0)).d();
    }

    public anq c() {
        return ((aoe) this.a.get(0)).c();
    }

    public void a(Data data) {
        if (data != null) {
            this.e.a((Object) data);
        } else {
            e();
        }
    }

    public void a(Exception exception) {
        this.f.add(exception);
        e();
    }

    private void e() {
        if (this.c < this.a.size() - 1) {
            this.c++;
            a(this.d, this.e);
            return;
        }
        this.e.a(new aqm("Fetch failed", new ArrayList(this.f)));
    }
}

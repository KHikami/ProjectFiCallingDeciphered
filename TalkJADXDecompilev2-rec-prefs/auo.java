package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

final class auo<Data> implements aoe<Data>, aof<Data> {
    private final List<aoe<Data>> f2365a;
    private final ll<List<Exception>> f2366b;
    private int f2367c = 0;
    private amq f2368d;
    private aof<? super Data> f2369e;
    private List<Exception> f2370f;

    auo(List<aoe<Data>> list, ll<List<Exception>> llVar) {
        this.f2366b = llVar;
        gwb.m1688a((Collection) list);
        this.f2365a = list;
    }

    public void mo312a(amq amq, aof<? super Data> aof__super_Data) {
        this.f2368d = amq;
        this.f2369e = aof__super_Data;
        this.f2370f = (List) this.f2366b.mo436a();
        ((aoe) this.f2365a.get(this.f2367c)).mo312a(amq, this);
    }

    public void mo311a() {
        this.f2366b.mo437a(this.f2370f);
        this.f2370f = null;
        for (aoe a : this.f2365a) {
            a.mo311a();
        }
    }

    public void mo313b() {
        for (aoe b : this.f2365a) {
            b.mo313b();
        }
    }

    public Class<Data> mo321d() {
        return ((aoe) this.f2365a.get(0)).mo321d();
    }

    public anq mo314c() {
        return ((aoe) this.f2365a.get(0)).mo314c();
    }

    public void mo326a(Data data) {
        if (data != null) {
            this.f2369e.mo326a((Object) data);
        } else {
            m4052e();
        }
    }

    public void mo325a(Exception exception) {
        this.f2370f.add(exception);
        m4052e();
    }

    private void m4052e() {
        if (this.f2367c < this.f2365a.size() - 1) {
            this.f2367c++;
            mo312a(this.f2368d, this.f2369e);
            return;
        }
        this.f2369e.mo325a(new aqm("Fetch failed", new ArrayList(this.f2370f)));
    }
}

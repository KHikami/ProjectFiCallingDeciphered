package p000;

import android.util.Log;
import java.util.Collections;
import java.util.List;

final class aqw implements aof<Object>, apd, ape {
    private final apf<?> f2179a;
    private final ape f2180b;
    private int f2181c;
    private apb f2182d;
    private Object f2183e;
    private volatile aui<?> f2184f;
    private apc f2185g;

    public aqw(apf<?> apf_, ape ape) {
        this.f2179a = apf_;
        this.f2180b = ape;
    }

    public boolean mo327a() {
        if (this.f2183e != null) {
            Object obj = this.f2183e;
            this.f2183e = null;
            long a = bam.m4675a();
            try {
                ant a2 = this.f2179a.m3615a(obj);
                arv arv = new arv(a2, obj, this.f2179a.m3628e());
                this.f2185g = new apc(this.f2184f.f2356a, this.f2179a.m3629f());
                this.f2179a.m3624b().mo369a(this.f2185g, arv);
                if (Log.isLoggable("SourceGenerator", 2)) {
                    String valueOf = String.valueOf(this.f2185g);
                    String valueOf2 = String.valueOf(obj);
                    String valueOf3 = String.valueOf(a2);
                    new StringBuilder(((String.valueOf(valueOf).length() + 95) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()).append("Finished encoding source to cache, key: ").append(valueOf).append(", data: ").append(valueOf2).append(", encoder: ").append(valueOf3).append(", duration: ").append(bam.m4674a(a));
                }
                this.f2184f.f2358c.mo311a();
                this.f2182d = new apb(Collections.singletonList(this.f2184f.f2356a), this.f2179a, this);
            } catch (Throwable th) {
                this.f2184f.f2358c.mo311a();
            }
        }
        if (this.f2182d != null && this.f2182d.mo327a()) {
            return true;
        }
        this.f2182d = null;
        this.f2184f = null;
        boolean z = false;
        while (!z && this.f2181c < this.f2179a.m3633j().size()) {
            List j = this.f2179a.m3633j();
            int i = this.f2181c;
            this.f2181c = i + 1;
            this.f2184f = (aui) j.get(i);
            if (this.f2184f != null && (this.f2179a.m3626c().mo334a(this.f2184f.f2358c.mo314c()) || this.f2179a.m3621a(this.f2184f.f2358c.mo321d()))) {
                this.f2184f.f2358c.mo312a(this.f2179a.m3627d(), this);
                z = true;
            }
        }
        return z;
    }

    public void mo328b() {
        aui aui = this.f2184f;
        if (aui != null) {
            aui.f2358c.mo313b();
        }
    }

    public void mo326a(Object obj) {
        apq c = this.f2179a.m3626c();
        if (obj == null || !c.mo334a(this.f2184f.f2358c.mo314c())) {
            this.f2180b.mo330a(this.f2184f.f2356a, obj, this.f2184f.f2358c, this.f2184f.f2358c.mo314c(), this.f2185g);
            return;
        }
        this.f2183e = obj;
        this.f2180b.mo331c();
    }

    public void mo325a(Exception exception) {
        this.f2180b.mo329a(this.f2185g, exception, this.f2184f.f2358c, this.f2184f.f2358c.mo314c());
    }

    public void mo331c() {
        throw new UnsupportedOperationException();
    }

    public void mo330a(anv anv, Object obj, aoe<?> aoe_, anq anq, anv anv2) {
        this.f2180b.mo330a(anv, obj, aoe_, this.f2184f.f2358c.mo314c(), anv);
    }

    public void mo329a(anv anv, Exception exception, aoe<?> aoe_, anq anq) {
        this.f2180b.mo329a(anv, exception, aoe_, this.f2184f.f2358c.mo314c());
    }
}

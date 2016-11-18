package defpackage;

import android.util.Log;
import java.util.Collections;
import java.util.List;

final class aqw implements aof<Object>, apd, ape {
    private final apf<?> a;
    private final ape b;
    private int c;
    private apb d;
    private Object e;
    private volatile aui<?> f;
    private apc g;

    public aqw(apf<?> apf_, ape ape) {
        this.a = apf_;
        this.b = ape;
    }

    public boolean a() {
        if (this.e != null) {
            Object obj = this.e;
            this.e = null;
            long a = bam.a();
            try {
                ant a2 = this.a.a(obj);
                arv arv = new arv(a2, obj, this.a.e());
                this.g = new apc(this.f.a, this.a.f());
                this.a.b().a(this.g, arv);
                if (Log.isLoggable("SourceGenerator", 2)) {
                    String valueOf = String.valueOf(this.g);
                    String valueOf2 = String.valueOf(obj);
                    String valueOf3 = String.valueOf(a2);
                    new StringBuilder(((String.valueOf(valueOf).length() + 95) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()).append("Finished encoding source to cache, key: ").append(valueOf).append(", data: ").append(valueOf2).append(", encoder: ").append(valueOf3).append(", duration: ").append(bam.a(a));
                }
                this.f.c.a();
                this.d = new apb(Collections.singletonList(this.f.a), this.a, this);
            } catch (Throwable th) {
                this.f.c.a();
            }
        }
        if (this.d != null && this.d.a()) {
            return true;
        }
        this.d = null;
        this.f = null;
        boolean z = false;
        while (!z && this.c < this.a.j().size()) {
            List j = this.a.j();
            int i = this.c;
            this.c = i + 1;
            this.f = (aui) j.get(i);
            if (this.f != null && (this.a.c().a(this.f.c.c()) || this.a.a(this.f.c.d()))) {
                this.f.c.a(this.a.d(), this);
                z = true;
            }
        }
        return z;
    }

    public void b() {
        aui aui = this.f;
        if (aui != null) {
            aui.c.b();
        }
    }

    public void a(Object obj) {
        apq c = this.a.c();
        if (obj == null || !c.a(this.f.c.c())) {
            this.b.a(this.f.a, obj, this.f.c, this.f.c.c(), this.g);
            return;
        }
        this.e = obj;
        this.b.c();
    }

    public void a(Exception exception) {
        this.b.a(this.g, exception, this.f.c, this.f.c.c());
    }

    public void c() {
        throw new UnsupportedOperationException();
    }

    public void a(anv anv, Object obj, aoe<?> aoe_, anq anq, anv anv2) {
        this.b.a(anv, obj, aoe_, this.f.c.c(), anv);
    }

    public void a(anv anv, Exception exception, aoe<?> aoe_, anq anq) {
        this.b.a(anv, exception, aoe_, this.f.c.c());
    }
}

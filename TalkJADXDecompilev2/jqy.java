package defpackage;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlRequest.Callback;

abstract class jqy {
    boolean a = false;
    final jrb b;
    int c;
    long d;
    byte[] e;
    IOException f;
    boolean g;
    jra h = new jra();
    public final Callback i = new jqz(this);
    private final juy j;

    public abstract void a();

    protected abstract void a(Map<String, List<String>> map);

    protected abstract UrlRequest b();

    protected jqy(juy juy) {
        this.j = juy;
        this.b = new jrb();
    }

    public final void d() {
        this.a = false;
        b().a();
        while (!this.a) {
            this.b.a();
        }
    }

    public int e() {
        return this.c;
    }

    public long f() {
        return this.d;
    }

    public byte[] g() {
        return this.e;
    }

    public IOException h() {
        return this.f;
    }

    public boolean i() {
        return this.g;
    }

    public juy j() {
        return this.j;
    }
}

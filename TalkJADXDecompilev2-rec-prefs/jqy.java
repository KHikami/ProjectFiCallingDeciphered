package p000;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlRequest.Callback;

abstract class jqy {
    boolean f20768a = false;
    final jrb f20769b;
    int f20770c;
    long f20771d;
    byte[] f20772e;
    IOException f20773f;
    boolean f20774g;
    jra f20775h = new jra();
    public final Callback f20776i = new jqz(this);
    private final juy f20777j;

    public abstract void mo3592a();

    protected abstract void mo3593a(Map<String, List<String>> map);

    protected abstract UrlRequest mo3594b();

    protected jqy(juy juy) {
        this.f20777j = juy;
        this.f20769b = new jrb();
    }

    public final void m24994d() {
        this.f20768a = false;
        mo3594b().a();
        while (!this.f20768a) {
            this.f20769b.m25047a();
        }
    }

    public int m24995e() {
        return this.f20770c;
    }

    public long m24996f() {
        return this.f20771d;
    }

    public byte[] m24997g() {
        return this.f20772e;
    }

    public IOException m24998h() {
        return this.f20773f;
    }

    public boolean m24999i() {
        return this.f20774g;
    }

    public juy m25000j() {
        return this.f20777j;
    }
}

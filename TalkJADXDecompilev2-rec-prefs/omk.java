package p000;

import io.grpc.internal.ae;
import io.grpc.internal.bi;
import io.grpc.internal.cb;
import io.grpc.internal.dl;
import io.grpc.internal.x;
import java.net.InetSocketAddress;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

public final class omk implements ae, dl {
    public static boolean f33225a = false;
    final String f33226b;
    cb f33227c;
    final Object f33228d = new Object();
    final Set<omh> f33229e = new HashSet();
    final Executor f33230f;
    final int f33231g;
    boolean f33232h;
    olv f33233i;
    boolean f33234j;
    omg f33235k;
    private final InetSocketAddress f33236l;
    private final String f33237m;
    private boolean f33238n;
    private boolean f33239o;

    public /* bridge */ /* synthetic */ x m38750a(olh olh, okw okw, ojm ojm) {
        return m38748a(olh, okw);
    }

    omk(omg omg, InetSocketAddress inetSocketAddress, String str, String str2, Executor executor, int i) {
        this.f33236l = (InetSocketAddress) bm.a(inetSocketAddress, "address");
        this.f33237m = str;
        this.f33226b = bi.a("cronet", str2);
        this.f33231g = i;
        this.f33230f = (Executor) bm.a(executor, "executor");
        this.f33235k = (omg) bm.a(omg, "streamFactory");
    }

    private omh m38748a(olh olh, okw okw) {
        bm.a(olh, "method");
        bm.a(okw, "headers");
        String str = "/";
        String valueOf = String.valueOf(olh.m38678b());
        valueOf = valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
        str = this.f33237m;
        return new omm(this, new StringBuilder((String.valueOf(str).length() + 8) + String.valueOf(valueOf).length()).append("https://").append(str).append(valueOf).toString(), okw, olh).f33241a;
    }

    public Runnable m38751a(cb cbVar) {
        this.f33227c = (cb) bm.a(cbVar, "listener");
        synchronized (this.f33228d) {
            this.f33234j = true;
        }
        return new oml(this);
    }

    public String toString() {
        String valueOf = String.valueOf(super.toString());
        String valueOf2 = String.valueOf(this.f33236l);
        return new StringBuilder((String.valueOf(valueOf).length() + 2) + String.valueOf(valueOf2).length()).append(valueOf).append("(").append(valueOf2).append(")").toString();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m38752a() {
        synchronized (this.f33228d) {
            if (this.f33232h) {
            }
        }
    }

    public ojh m38755b() {
        return ojh.f33081b;
    }

    public void m38753a(a aVar, Executor executor) {
        throw new UnsupportedOperationException();
    }

    public String m38756c() {
        return bi.a(this);
    }

    private void m38749d() {
        synchronized (this.f33228d) {
            if (this.f33232h && this.f33229e.size() == 0 && !this.f33239o) {
                this.f33239o = true;
            }
        }
    }

    void m38754a(omh omh, olv olv) {
        synchronized (this.f33228d) {
            if (this.f33229e.remove(omh)) {
                boolean z = olv.a() == olx.b || olv.a() == olx.e;
                omh.a(olv, z, new okw());
            }
        }
    }
}

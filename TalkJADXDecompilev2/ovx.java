package defpackage;

import org.chromium.net.NetworkChangeNotifier;
import org.chromium.net.NetworkChangeNotifierAutoDetect.Observer;

public final class ovx implements Observer {
    final /* synthetic */ NetworkChangeNotifier a;

    public ovx(NetworkChangeNotifier networkChangeNotifier) {
        this.a = networkChangeNotifier;
    }

    public void a(int i) {
        this.a.b(i);
    }

    public void a(double d) {
        this.a.a(d);
    }

    public void a(long j, int i) {
        this.a.a(j, i);
    }

    public void a(long j) {
        this.a.a(j);
    }

    public void b(long j) {
        this.a.b(j);
    }

    public void a(long[] jArr) {
        this.a.a(jArr);
    }
}

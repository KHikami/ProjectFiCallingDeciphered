package p000;

import org.chromium.net.NetworkChangeNotifier;
import org.chromium.net.NetworkChangeNotifierAutoDetect.Observer;

public final class ovx implements Observer {
    final /* synthetic */ NetworkChangeNotifier f34413a;

    public ovx(NetworkChangeNotifier networkChangeNotifier) {
        this.f34413a = networkChangeNotifier;
    }

    public void mo4239a(int i) {
        this.f34413a.b(i);
    }

    public void mo4238a(double d) {
        this.f34413a.a(d);
    }

    public void mo4241a(long j, int i) {
        this.f34413a.a(j, i);
    }

    public void mo4240a(long j) {
        this.f34413a.a(j);
    }

    public void mo4243b(long j) {
        this.f34413a.b(j);
    }

    public void mo4242a(long[] jArr) {
        this.f34413a.a(jArr);
    }
}

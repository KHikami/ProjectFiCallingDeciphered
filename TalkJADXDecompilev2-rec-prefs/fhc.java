package p000;

import android.content.Context;
import java.util.LinkedList;
import java.util.List;

public final class fhc {
    private static final boolean f13038a = false;
    private final List<fok> f13039b = new LinkedList();
    private final List<Runnable> f13040c = new LinkedList();
    private final int f13041d = 0;
    private fhe f13042e = fhe.NONE;
    private boolean f13043f;
    private fhd f13044g;
    private boolean f13045h = false;

    static {
        kae kae = glk.f15568o;
    }

    public void m15307a(bko bko) {
        this.f13044g = new fhd(bko);
    }

    public void m15304a() {
        this.f13043f = true;
    }

    public void m15308a(fok fok) {
        this.f13039b.add(fok);
    }

    public List<fok> m15311b() {
        return this.f13039b;
    }

    public void m15309a(Runnable runnable) {
        this.f13040c.add(runnable);
    }

    public void m15313c() {
        for (Runnable run : this.f13040c) {
            run.run();
        }
        this.f13040c.clear();
    }

    public void m15306a(Context context, blo blo, String str, List<edo> list) {
        if (this.f13044g != null) {
            this.f13044g.m15320a(context, blo, str, list);
        }
    }

    public void m15315d() {
        if (this.f13044g != null) {
            this.f13044g.m15319a();
        }
    }

    private void m15303a(long j, fhe fhe) {
        boolean z;
        if (fhe == fhe.LOUD || fhe == fhe.SILENT || fhe == fhe.DISPLAYONLY) {
            z = true;
        } else {
            z = false;
        }
        iil.m21874a("Expected condition to be true", z);
        if (f13038a) {
            long a = glj.m17956a();
            String valueOf = String.valueOf(fhe);
            String valueOf2 = String.valueOf(this.f13042e.toString());
            new StringBuilder((String.valueOf(valueOf).length() + 157) + String.valueOf(valueOf2).length()).append("setNotificationTrigger eventTime: ").append(j).append(", currentTimeMillis: ").append(a).append(", triggerLevel: ").append(valueOf).append(", mNotifTriggerLevel: ").append(valueOf2).append(", mIsFromLivePush: ").append(this.f13043f);
        }
        if (this.f13042e.ordinal() < fhe.ordinal()) {
            this.f13042e = fhe;
        }
    }

    public void m15305a(long j) {
        m15303a(j, fhe.LOUD);
    }

    public void m15312b(long j) {
        m15303a(j, fhe.DISPLAYONLY);
    }

    public void m15316e() {
        m15314c(-1);
    }

    public void m15314c(long j) {
        m15303a(j, fhe.SILENT);
    }

    public fhe m15317f() {
        return this.f13042e;
    }

    public boolean m15318g() {
        return this.f13045h;
    }

    public void m15310a(boolean z) {
        this.f13045h = z;
    }
}

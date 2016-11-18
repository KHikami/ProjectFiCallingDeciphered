package p000;

import android.app.Service;
import android.os.Handler;

public abstract class fiw extends Service {
    static final boolean f6774a = false;
    int f6775b = 0;
    int f6776c = 0;
    final Object f6777d = new Object();
    private final Handler f6778e = new Handler();
    private boolean f6779f = true;
    private final Runnable f6780g = new fix(this);

    public abstract int mo1195g();

    static {
        kae kae = glk.f15568o;
    }

    protected void m9131h() {
        this.f6779f = true;
    }

    public boolean m9132i() {
        synchronized (this.f6777d) {
            if (this.f6779f) {
                if (f6774a) {
                    m9128a("Retain failed.");
                }
                return false;
            }
            this.f6775b++;
            if (f6774a) {
                m9128a("Retain");
            }
            this.f6778e.removeCallbacks(this.f6780g);
            return true;
        }
    }

    public void m9129a(int i) {
        synchronized (this.f6777d) {
            this.f6776c = i;
            if (f6774a) {
                m9128a("Retain w/ startId");
            }
            m9133j();
        }
    }

    public void m9133j() {
        iil.m21867a();
        if (!m9132i()) {
            glk.m17982e("Babel", m9128a("Retain Failed"), new Object[0]);
            throw new IllegalStateException();
        }
    }

    public void m9134k() {
        synchronized (this.f6777d) {
            this.f6775b--;
            if (f6774a) {
                m9128a("Release");
            }
            if (this.f6775b < 0) {
                glk.m17982e("Babel", m9128a("Negative service count"), new Object[0]);
            }
            if (this.f6775b == 0) {
                glk.m17976b("Babel", "Idle: Shutdown runnable posted in release with a delay of %d ms.", Integer.valueOf(mo1195g()));
                this.f6778e.postDelayed(this.f6780g, (long) r0);
            }
        }
    }

    public void onCreate() {
        super.onCreate();
        synchronized (this.f6777d) {
            iil.m21869a(Integer.valueOf(0), Integer.valueOf(this.f6775b));
            this.f6779f = false;
            glk.m17976b("Babel", "onCreate: Shutdown runnable posted in onCreate with a delay of %d ms.", Integer.valueOf(mo1195g()));
            this.f6778e.postDelayed(this.f6780g, (long) r0);
        }
    }

    public void onDestroy() {
        glk.m17976b("Babel", m9128a("onDestroy"), new Object[0]);
        super.onDestroy();
    }

    public String m9128a(String str) {
        String valueOf = String.valueOf(getClass().getName());
        int i = this.f6775b;
        int i2 = this.f6776c;
        return new StringBuilder((String.valueOf(valueOf).length() + 75) + String.valueOf(str).length()).append("RefCountedService(").append(valueOf).append(") ").append(str).append(" (count=").append(i).append(", startId=").append(i2).append(" stopped=").append(this.f6779f).append(")").toString();
    }
}

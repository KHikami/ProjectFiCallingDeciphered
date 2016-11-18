package defpackage;

import android.app.Service;
import android.os.Handler;

public abstract class fiw extends Service {
    static final boolean a = false;
    int b = 0;
    int c = 0;
    final Object d = new Object();
    private final Handler e = new Handler();
    private boolean f = true;
    private final Runnable g = new fix(this);

    public abstract int g();

    static {
        kae kae = glk.o;
    }

    protected void h() {
        this.f = true;
    }

    public boolean i() {
        synchronized (this.d) {
            if (this.f) {
                if (a) {
                    a("Retain failed.");
                }
                return false;
            }
            this.b++;
            if (a) {
                a("Retain");
            }
            this.e.removeCallbacks(this.g);
            return true;
        }
    }

    public void a(int i) {
        synchronized (this.d) {
            this.c = i;
            if (a) {
                a("Retain w/ startId");
            }
            j();
        }
    }

    public void j() {
        iil.a();
        if (!i()) {
            glk.e("Babel", a("Retain Failed"), new Object[0]);
            throw new IllegalStateException();
        }
    }

    public void k() {
        synchronized (this.d) {
            this.b--;
            if (a) {
                a("Release");
            }
            if (this.b < 0) {
                glk.e("Babel", a("Negative service count"), new Object[0]);
            }
            if (this.b == 0) {
                glk.b("Babel", "Idle: Shutdown runnable posted in release with a delay of %d ms.", Integer.valueOf(g()));
                this.e.postDelayed(this.g, (long) r0);
            }
        }
    }

    public void onCreate() {
        super.onCreate();
        synchronized (this.d) {
            iil.a(Integer.valueOf(0), Integer.valueOf(this.b));
            this.f = false;
            glk.b("Babel", "onCreate: Shutdown runnable posted in onCreate with a delay of %d ms.", Integer.valueOf(g()));
            this.e.postDelayed(this.g, (long) r0);
        }
    }

    public void onDestroy() {
        glk.b("Babel", a("onDestroy"), new Object[0]);
        super.onDestroy();
    }

    public String a(String str) {
        String valueOf = String.valueOf(getClass().getName());
        int i = this.b;
        int i2 = this.c;
        return new StringBuilder((String.valueOf(valueOf).length() + 75) + String.valueOf(str).length()).append("RefCountedService(").append(valueOf).append(") ").append(str).append(" (count=").append(i).append(", startId=").append(i2).append(" stopped=").append(this.f).append(")").toString();
    }
}

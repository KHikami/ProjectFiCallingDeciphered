package defpackage;

import android.net.ConnectivityManager;
import android.os.Handler;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

/* renamed from: czj */
public abstract class czj<R extends eul, S extends evz> implements czh {
    public int a;
    public czi b;
    final Object c;
    private final Handler d;
    private final fip e;
    private final Runnable f;

    public abstract void a(fme fme);

    public abstract Class<R> d();

    public abstract Class<S> e();

    public czj() {
        this.d = new Handler();
        this.c = new Object();
        this.e = new czk(this);
        this.f = new czl(this);
        this.a = -1;
        this.b = null;
    }

    public int h() {
        return -1;
    }

    public void f() {
        RealTimeChatService.a(this.e);
        synchronized (this.c) {
            fme a = ((fmf) jyn.a(gwb.H(), fmf.class)).a();
            this.a = a.a();
            a(a);
            if (this.a == -1) {
                a(new czn());
                glk.e("Babel", String.valueOf(getClass().getName()).concat(" failed to start!"), new Object[0]);
            } else if (h() > 0) {
                this.d.postDelayed(this.f, (long) h());
            }
        }
    }

    public void g() {
        RealTimeChatService.b(this.e);
        this.a = -1;
        this.d.removeCallbacks(this.f);
    }

    public void a(czi czi) {
        this.b = czi;
    }

    public void a(fiu fiu) {
        RealTimeChatService.b(this.e);
        this.d.removeCallbacks(this.f);
        if (this.b != null) {
            this.b.a(this);
        }
    }

    public void a(Exception exception) {
        RealTimeChatService.b(this.e);
        this.d.removeCallbacks(this.f);
        if (this.b != null) {
            this.b.b(this);
        }
    }

    public static boolean i() {
        ConnectivityManager connectivityManager = (ConnectivityManager) gwb.H().getSystemService("connectivity");
        if (connectivityManager == null || connectivityManager.getActiveNetworkInfo() == null || !connectivityManager.getActiveNetworkInfo().isConnected()) {
            return false;
        }
        return true;
    }

    public void b() {
    }

    public void c() {
    }
}

package p000;

import android.net.ConnectivityManager;
import android.os.Handler;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public abstract class czj<R extends eul, S extends evz> implements czh {
    public int f9348a = -1;
    public czi f9349b = null;
    final Object f9350c = new Object();
    private final Handler f9351d = new Handler();
    private final fip f9352e = new czk(this);
    private final Runnable f9353f = new czl(this);

    public abstract void mo1480a(fme fme);

    public abstract Class<R> mo1481d();

    public abstract Class<S> mo1482e();

    public int mo1990h() {
        return -1;
    }

    public void mo1477f() {
        RealTimeChatService.m9040a(this.f9352e);
        synchronized (this.f9350c) {
            fme a = ((fmf) jyn.m25426a(gwb.m1400H(), fmf.class)).mo2035a();
            this.f9348a = a.m15674a();
            mo1480a(a);
            if (this.f9348a == -1) {
                mo1888a(new czn());
                glk.m17982e("Babel", String.valueOf(getClass().getName()).concat(" failed to start!"), new Object[0]);
            } else if (mo1990h() > 0) {
                this.f9351d.postDelayed(this.f9353f, (long) mo1990h());
            }
        }
    }

    public void mo1478g() {
        RealTimeChatService.m9077b(this.f9352e);
        this.f9348a = -1;
        this.f9351d.removeCallbacks(this.f9353f);
    }

    public void mo1474a(czi czi) {
        this.f9349b = czi;
    }

    public void mo1887a(fiu fiu) {
        RealTimeChatService.m9077b(this.f9352e);
        this.f9351d.removeCallbacks(this.f9353f);
        if (this.f9349b != null) {
            this.f9349b.m11345a(this);
        }
    }

    public void mo1888a(Exception exception) {
        RealTimeChatService.m9077b(this.f9352e);
        this.f9351d.removeCallbacks(this.f9353f);
        if (this.f9349b != null) {
            this.f9349b.m11346b(this);
        }
    }

    public static boolean m11296i() {
        ConnectivityManager connectivityManager = (ConnectivityManager) gwb.m1400H().getSystemService("connectivity");
        if (connectivityManager == null || connectivityManager.getActiveNetworkInfo() == null || !connectivityManager.getActiveNetworkInfo().isConnected()) {
            return false;
        }
        return true;
    }

    public void mo1475b() {
    }

    public void mo1476c() {
    }
}

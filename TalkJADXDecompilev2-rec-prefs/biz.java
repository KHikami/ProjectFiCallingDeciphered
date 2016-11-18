package p000;

import android.content.Context;
import android.content.IntentFilter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

final class biz implements biw {
    private static final mks<String> f3461a = mks.m32259b("device_country");
    private final String f3462b;
    private final Context f3463c;
    private final Object f3464d = new Object();
    private boolean f3465e;
    private final List<Runnable> f3466f = new ArrayList();

    public biz(String str, Context context, Executor executor) {
        this.f3462b = str;
        this.f3463c = context;
        executor.execute(new bja(this));
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.gservices.intent.action.GSERVICES_CHANGED");
        context.registerReceiver(new bjb(this), intentFilter);
    }

    private void m5350a(String str) {
        boolean z = str.startsWith(this.f3462b) || str.startsWith("url:") || f3461a.contains(str);
        String str2 = "Config keys must start with ";
        String valueOf = String.valueOf(this.f3462b);
        ba.m4578a(z, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
    }

    public String mo562a(String str, String str2) {
        m5350a(str);
        m5351c();
        return icb.m21564a(this.f3463c.getContentResolver(), str, str2);
    }

    public int mo560a(String str, int i) {
        m5350a(str);
        m5351c();
        return icb.m21560a(this.f3463c.getContentResolver(), str, i);
    }

    public long mo561a(String str, long j) {
        m5350a(str);
        m5351c();
        return icb.m21561a(this.f3463c.getContentResolver(), str, j);
    }

    public boolean mo564a(String str, boolean z) {
        m5350a(str);
        m5351c();
        return icb.m21567a(this.f3463c.getContentResolver(), str, z);
    }

    public void mo563a(Runnable runnable) {
        synchronized (this.f3466f) {
            this.f3466f.add(runnable);
        }
    }

    private void m5351c() {
        if (!this.f3465e) {
            synchronized (this.f3464d) {
                long currentTimeMillis = System.currentTimeMillis();
                while (!this.f3465e) {
                    try {
                        this.f3464d.wait(3000);
                        if (System.currentTimeMillis() - currentTimeMillis > 3000) {
                            ((iih) jyn.m25426a(this.f3463c, iih.class)).mo1979a(-1).mo1693b().mo1714c(2029);
                            return;
                        }
                    } catch (InterruptedException e) {
                        return;
                    }
                }
            }
        }
    }

    void m5355a() {
        icb.m21569b(this.f3463c.getContentResolver(), this.f3462b);
        synchronized (this.f3464d) {
            this.f3465e = true;
            this.f3464d.notifyAll();
        }
        m5358b();
    }

    void m5358b() {
        synchronized (this.f3466f) {
            for (Runnable a : this.f3466f) {
                gwb.m1863a(a);
            }
        }
    }
}

package defpackage;

import android.app.Application;
import android.os.Build.VERSION;
import android.text.format.DateUtils;
import android.util.Log;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

final class ixm implements ixl {
    final Application a;
    volatile boolean b;
    izw c;
    iyd d;
    iym e;
    ixw f;
    iye g;
    iyf h;
    iyb i;
    private final ixv j;
    private final iyn k;
    private final Object l = new Object();
    private final List<Runnable> m = new ArrayList();

    ixm(Application application, ixv ixv) {
        ba.b(ixm.f());
        this.a = application;
        this.j = ixv;
        this.k = iyn.a;
    }

    void b() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new ixn(this));
        a(newSingleThreadExecutor);
        newSingleThreadExecutor.shutdown();
    }

    private void a(ExecutorService executorService) {
        try {
            iwj.a(this.a);
            executorService.submit(new ixo(this));
        } catch (RuntimeException e) {
            d();
        }
    }

    void c() {
        ba.a(Integer.valueOf(gwb.xV));
        this.k.a(this.a);
        if (!this.k.a()) {
            ixt ixt = (ixt) ba.a(this.j.a());
            this.c = (izw) ba.a(ixt.a);
            this.d = (iyd) ba.a(ixt.b);
            this.e = (iym) ba.a(ixt.c);
            this.f = (ixw) ba.a(ixt.d);
            this.g = (iye) ba.a(ixt.e);
            this.h = (iyf) ba.a(ixt.f);
            this.i = (iyb) ba.a(ixt.g);
        }
        synchronized (this.l) {
            this.b = true;
        }
        if (!this.k.a()) {
            this.k.b(this.a);
            if (g()) {
                List arrayList = new ArrayList();
                if (this.f.a()) {
                    arrayList.add(iwm.a(this.c, this.a, this.f));
                }
                if (this.h.a()) {
                    boolean z;
                    Application application = this.a;
                    gwb.aK();
                    long j = application.getSharedPreferences("PackageMetricService", 0).getLong("lastSendTime", -1);
                    long az = gwb.az();
                    if (az < j) {
                        application.getSharedPreferences("PackageMetricService", 0).edit().remove("lastSendTime").commit();
                        j = -1;
                    }
                    if (j == -1 || az > j + 43200000) {
                        z = false;
                    } else {
                        if (Log.isLoggable("PackageMetricService", 3)) {
                            String str = "SentRecently countdown: ";
                            String valueOf = String.valueOf(DateUtils.formatElapsedTime(((j + 43200000) - az) / 1000));
                            if (valueOf.length() != 0) {
                                str.concat(valueOf);
                            } else {
                                valueOf = new String(str);
                            }
                        }
                        z = true;
                    }
                    boolean c = this.h.c();
                    if (c || z) {
                        new StringBuilder(77).append("Package metric: not registering on startup - manual / recently: ").append(c).append(" / ").append(z);
                    } else {
                        arrayList.add(new ixi(this.a, this.c));
                    }
                }
                if (!arrayList.isEmpty()) {
                    iyl iyl = new iyl(arrayList);
                    iyl.b();
                    iyl.a(this.a);
                }
            }
            iwp.a(this.c, this.a, iwj.a(this.a)).a();
            gwb.ac(this.a);
            for (Runnable runnable : this.m) {
                if (!g()) {
                    break;
                }
                runnable.run();
            }
        }
        this.m.clear();
    }

    void d() {
        this.k.e();
        this.c = izw.b;
        this.d = iyd.c;
        this.e = iym.c;
        this.f = ixw.c;
        this.g = iye.a;
        this.h = iyf.a;
        this.i = iyb.a;
        try {
            Application application = this.a;
            synchronized (iwj.class) {
                if (iwj.a != null) {
                    iwj.a.b.b(application);
                    iwj.a = null;
                }
            }
        } catch (RuntimeException e) {
        }
        synchronized (this.l) {
            this.b = true;
            this.m.clear();
        }
    }

    private void a(Runnable runnable) {
        ba.a((Object) runnable);
        if (!this.b) {
            synchronized (this.l) {
                if (!this.b) {
                    this.m.add(runnable);
                } else if (g()) {
                    runnable.run();
                }
            }
        } else if (g()) {
            runnable.run();
        }
    }

    public void a() {
        if (this.b) {
            e();
        } else {
            a(new ixp(this));
        }
    }

    void e() {
        if (g() && this.d.a()) {
            iwy.a(this.c, this.a, this.d).c();
        }
    }

    public void a(String str) {
        b(str, null);
    }

    private synchronized void b(String str, onw onw) {
        if (this.b) {
            a(str, null);
        } else {
            a(new ixq(this, str, null));
        }
    }

    void a(String str, onw onw) {
        if (g() && this.d.a()) {
            iwy.a(this.c, this.a, this.d).a(str, onw);
        }
    }

    public UncaughtExceptionHandler a(UncaughtExceptionHandler uncaughtExceptionHandler) {
        if (!this.b) {
            return new ixr(this, uncaughtExceptionHandler);
        }
        if (g() && this.f.a()) {
            return iwm.a(this.c, this.a, this.f).a(uncaughtExceptionHandler);
        }
        return uncaughtExceptionHandler;
    }

    static boolean f() {
        if (VERSION.SDK_INT < 16) {
            return false;
        }
        return true;
    }

    boolean g() {
        return this.b && !this.k.a();
    }
}

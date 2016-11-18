package p000;

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
    final Application f19342a;
    volatile boolean f19343b;
    izw f19344c;
    iyd f19345d;
    iym f19346e;
    ixw f19347f;
    iye f19348g;
    iyf f19349h;
    iyb f19350i;
    private final ixv f19351j;
    private final iyn f19352k;
    private final Object f19353l = new Object();
    private final List<Runnable> f19354m = new ArrayList();

    ixm(Application application, ixv ixv) {
        ba.m4609b(ixm.m23453f());
        this.f19342a = application;
        this.f19351j = ixv;
        this.f19352k = iyn.f19402a;
    }

    void m23458b() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new ixn(this));
        m23451a(newSingleThreadExecutor);
        newSingleThreadExecutor.shutdown();
    }

    private void m23451a(ExecutorService executorService) {
        try {
            iwj.m23388a(this.f19342a);
            executorService.submit(new ixo(this));
        } catch (RuntimeException e) {
            m23460d();
        }
    }

    void m23459c() {
        ba.m4536a(Integer.valueOf(gwb.xV));
        this.f19352k.m23492a(this.f19342a);
        if (!this.f19352k.m23494a()) {
            ixt ixt = (ixt) ba.m4536a(this.f19351j.m23472a());
            this.f19344c = (izw) ba.m4536a(ixt.f19365a);
            this.f19345d = (iyd) ba.m4536a(ixt.f19366b);
            this.f19346e = (iym) ba.m4536a(ixt.f19367c);
            this.f19347f = (ixw) ba.m4536a(ixt.f19368d);
            this.f19348g = (iye) ba.m4536a(ixt.f19369e);
            this.f19349h = (iyf) ba.m4536a(ixt.f19370f);
            this.f19350i = (iyb) ba.m4536a(ixt.f19371g);
        }
        synchronized (this.f19353l) {
            this.f19343b = true;
        }
        if (!this.f19352k.m23494a()) {
            this.f19352k.m23495b(this.f19342a);
            if (m23462g()) {
                List arrayList = new ArrayList();
                if (this.f19347f.mo1638a()) {
                    arrayList.add(iwm.m23399a(this.f19344c, this.f19342a, this.f19347f));
                }
                if (this.f19349h.m23482a()) {
                    boolean z;
                    Application application = this.f19342a;
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
                    boolean c = this.f19349h.m23484c();
                    if (c || z) {
                        new StringBuilder(77).append("Package metric: not registering on startup - manual / recently: ").append(c).append(" / ").append(z);
                    } else {
                        arrayList.add(new ixi(this.f19342a, this.f19344c));
                    }
                }
                if (!arrayList.isEmpty()) {
                    iyl iyl = new iyl(arrayList);
                    iyl.m23490b();
                    iyl.m23489a(this.f19342a);
                }
            }
            iwp.m23406a(this.f19344c, this.f19342a, iwj.m23388a(this.f19342a)).m23408a();
            gwb.ac(this.f19342a);
            for (Runnable runnable : this.f19354m) {
                if (!m23462g()) {
                    break;
                }
                runnable.run();
            }
        }
        this.f19354m.clear();
    }

    void m23460d() {
        this.f19352k.m23500e();
        this.f19344c = izw.f19333b;
        this.f19345d = iyd.f10284c;
        this.f19346e = iym.f10287c;
        this.f19347f = ixw.f10290c;
        this.f19348g = iye.f19389a;
        this.f19349h = iyf.f19390a;
        this.f19350i = iyb.f19387a;
        try {
            Application application = this.f19342a;
            synchronized (iwj.class) {
                if (iwj.f19256a != null) {
                    iwj.f19256a.f19257b.m23393b(application);
                    iwj.f19256a = null;
                }
            }
        } catch (RuntimeException e) {
        }
        synchronized (this.f19353l) {
            this.f19343b = true;
            this.f19354m.clear();
        }
    }

    private void m23450a(Runnable runnable) {
        ba.m4536a((Object) runnable);
        if (!this.f19343b) {
            synchronized (this.f19353l) {
                if (!this.f19343b) {
                    this.f19354m.add(runnable);
                } else if (m23462g()) {
                    runnable.run();
                }
            }
        } else if (m23462g()) {
            runnable.run();
        }
    }

    public void mo3415a() {
        if (this.f19343b) {
            m23461e();
        } else {
            m23450a(new ixp(this));
        }
    }

    void m23461e() {
        if (m23462g() && this.f19345d.mo1637a()) {
            iwy.m23416a(this.f19344c, this.f19342a, this.f19345d).m23420c();
        }
    }

    public void mo3416a(String str) {
        m23452b(str, null);
    }

    private synchronized void m23452b(String str, onw onw) {
        if (this.f19343b) {
            m23457a(str, null);
        } else {
            m23450a(new ixq(this, str, null));
        }
    }

    void m23457a(String str, onw onw) {
        if (m23462g() && this.f19345d.mo1637a()) {
            iwy.m23416a(this.f19344c, this.f19342a, this.f19345d).m23418a(str, onw);
        }
    }

    public UncaughtExceptionHandler mo3414a(UncaughtExceptionHandler uncaughtExceptionHandler) {
        if (!this.f19343b) {
            return new ixr(this, uncaughtExceptionHandler);
        }
        if (m23462g() && this.f19347f.mo1638a()) {
            return iwm.m23399a(this.f19344c, this.f19342a, this.f19347f).m23401a(uncaughtExceptionHandler);
        }
        return uncaughtExceptionHandler;
    }

    static boolean m23453f() {
        if (VERSION.SDK_INT < 16) {
            return false;
        }
        return true;
    }

    boolean m23462g() {
        return this.f19343b && !this.f19352k.m23494a();
    }
}

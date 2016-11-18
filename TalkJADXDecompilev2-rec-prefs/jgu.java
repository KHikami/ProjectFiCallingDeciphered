package p000;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import android.preference.PreferenceManager;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class jgu {
    final SparseArray<jgg> f20032a = new SparseArray();
    final List<jgc> f20033b = new ArrayList();
    final jgl f20034c;
    private final Context f20035d;
    private final Queue<jgc> f20036e = new LinkedBlockingQueue();
    private final Handler f20037f = new Handler(Looper.getMainLooper());
    private final jge f20038g;
    private int f20039h;

    jgu(Context context) {
        this.f20035d = context;
        ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.allowThreadDiskReads();
            this.f20034c = new jgl(context, "background_results.bin");
            this.f20039h = PreferenceManager.getDefaultSharedPreferences(this.f20035d).getInt("bom_last_listener_id", 0);
            this.f20038g = (jge) jyn.m25426a(context, jge.class);
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public void m24170a(jgc jgc, jgg jgg) {
        gwb.aJ();
        jgc.m6404d();
        int i = 0;
        if (jgg != null) {
            i = jgg.m24140c();
        }
        jgc.m6398a(i);
        this.f20033b.add(jgc);
        this.f20036e.add(jgc);
        this.f20038g.mo3503a();
        if (Log.isLoggable("BackgroundTask", 3)) {
            String valueOf = String.valueOf(jgc.m6411j());
            new StringBuilder(String.valueOf(valueOf).length() + 45).append("Start background task: ").append(valueOf).append(", manager: ").append(i);
        }
    }

    public boolean m24173a(jgg jgg, String str) {
        return m24174b(jgg, str) > 0;
    }

    public int m24174b(jgg jgg, String str) {
        gwb.aJ();
        int c = jgg.m24140c();
        int size = this.f20033b.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            int i3;
            jgc jgc = (jgc) this.f20033b.get(i);
            if (jgc.m6412k() == c && jgc.m6411j().equals(str)) {
                i3 = i2 + 1;
            } else {
                i3 = i2;
            }
            i++;
            i2 = i3;
        }
        return i2;
    }

    public void m24172a(jgg jgg) {
        gwb.aJ();
        int c = jgg.m24140c();
        this.f20032a.put(c, jgg);
        if (Log.isLoggable("BackgroundTask", 3)) {
            new StringBuilder(29).append("Register manager: ").append(c);
        }
        for (String str : jgg.m24143d()) {
            int d = jgg.m24142d(str) - m24174b(jgg, str);
            while (true) {
                int i = d - 1;
                if (d <= 0) {
                    break;
                }
                jgz a = this.f20034c.m24164a(c, str);
                if (Log.isLoggable("BackgroundTask", 4)) {
                    String valueOf = String.valueOf(a);
                    new StringBuilder((String.valueOf(str).length() + 40) + String.valueOf(valueOf).length()).append("Deliver saved background task result: ").append(str).append(", ").append(valueOf);
                }
                jgg.m24133a(str, a);
                d = i;
            }
        }
    }

    public void m24175b(jgg jgg) {
        gwb.aJ();
        int c = jgg.m24140c();
        this.f20032a.remove(c);
        if (Log.isLoggable("BackgroundTask", 3)) {
            new StringBuilder(31).append("Unregister manager: ").append(c);
        }
    }

    public void m24178c(jgg jgg) {
        int i;
        int c = jgg.m24140c();
        int size = this.f20033b.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            jgc jgc = (jgc) this.f20033b.get(i2);
            if (jgc.m6412k() == c) {
                jgc.m6398a(0);
                i = i3 + 1;
            } else {
                i = i3;
            }
            i2++;
            i3 = i;
        }
        i = this.f20034c.m24163a(c);
        if (Log.isLoggable("BackgroundTask", 3)) {
            new StringBuilder(95).append("Permanently remove manager: ").append(c).append(", pending ops: ").append(i3).append(", results dropped: ").append(i);
        }
    }

    int m24169a() {
        gwb.aJ();
        int i = this.f20039h + 1;
        this.f20039h = i;
        if (i == 0) {
            this.f20039h++;
        }
        return this.f20039h;
    }

    boolean m24176b() {
        return !this.f20033b.isEmpty();
    }

    jgc m24177c() {
        return (jgc) this.f20036e.poll();
    }

    Handler m24180d() {
        return this.f20037f;
    }

    void m24181e() {
        this.f20034c.m24162a();
        PreferenceManager.getDefaultSharedPreferences(this.f20035d).edit().putInt("bom_last_listener_id", this.f20039h).apply();
    }

    void m24179c(jgg jgg, String str) {
        int c;
        int i = 0;
        if (jgg != null) {
            c = jgg.m24140c();
        } else {
            c = 0;
        }
        int size = this.f20033b.size();
        while (i < size) {
            jgc jgc = (jgc) this.f20033b.get(i);
            if (jgc.m6412k() == c && jgc.m6411j().equals(str)) {
                jgc.m6396a(true);
            }
            i++;
        }
    }

    void m24171a(jgc jgc, jgz jgz) {
        lka.m29199a(jgz.f20048b, new jgv(this, jgc, jgz)).run();
    }
}

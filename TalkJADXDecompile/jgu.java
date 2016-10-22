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
    final SparseArray<jgg> a;
    final List<jgc> b;
    final jgl c;
    private final Context d;
    private final Queue<jgc> e;
    private final Handler f;
    private final jge g;
    private int h;

    jgu(Context context) {
        this.d = context;
        this.a = new SparseArray();
        this.b = new ArrayList();
        this.e = new LinkedBlockingQueue();
        this.f = new Handler(Looper.getMainLooper());
        ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.allowThreadDiskReads();
            this.c = new jgl(context, "background_results.bin");
            this.h = PreferenceManager.getDefaultSharedPreferences(this.d).getInt("bom_last_listener_id", 0);
            this.g = (jge) jyn.a(context, jge.class);
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public void a(jgc jgc, jgg jgg) {
        gwb.aJ();
        jgc.d();
        int i = 0;
        if (jgg != null) {
            i = jgg.c();
        }
        jgc.a(i);
        this.b.add(jgc);
        this.e.add(jgc);
        this.g.a();
        if (Log.isLoggable("BackgroundTask", 3)) {
            String valueOf = String.valueOf(jgc.j());
            new StringBuilder(String.valueOf(valueOf).length() + 45).append("Start background task: ").append(valueOf).append(", manager: ").append(i);
        }
    }

    public boolean a(jgg jgg, String str) {
        return b(jgg, str) > 0;
    }

    public int b(jgg jgg, String str) {
        gwb.aJ();
        int c = jgg.c();
        int size = this.b.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            int i3;
            jgc jgc = (jgc) this.b.get(i);
            if (jgc.k() == c && jgc.j().equals(str)) {
                i3 = i2 + 1;
            } else {
                i3 = i2;
            }
            i++;
            i2 = i3;
        }
        return i2;
    }

    public void a(jgg jgg) {
        gwb.aJ();
        int c = jgg.c();
        this.a.put(c, jgg);
        if (Log.isLoggable("BackgroundTask", 3)) {
            new StringBuilder(29).append("Register manager: ").append(c);
        }
        for (String str : jgg.d()) {
            int d = jgg.d(str) - b(jgg, str);
            while (true) {
                int i = d - 1;
                if (d <= 0) {
                    break;
                }
                jgz a = this.c.a(c, str);
                if (Log.isLoggable("BackgroundTask", 4)) {
                    String valueOf = String.valueOf(a);
                    new StringBuilder((String.valueOf(str).length() + 40) + String.valueOf(valueOf).length()).append("Deliver saved background task result: ").append(str).append(", ").append(valueOf);
                }
                jgg.a(str, a);
                d = i;
            }
        }
    }

    public void b(jgg jgg) {
        gwb.aJ();
        int c = jgg.c();
        this.a.remove(c);
        if (Log.isLoggable("BackgroundTask", 3)) {
            new StringBuilder(31).append("Unregister manager: ").append(c);
        }
    }

    public void c(jgg jgg) {
        int i;
        int c = jgg.c();
        int size = this.b.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            jgc jgc = (jgc) this.b.get(i2);
            if (jgc.k() == c) {
                jgc.a(0);
                i = i3 + 1;
            } else {
                i = i3;
            }
            i2++;
            i3 = i;
        }
        i = this.c.a(c);
        if (Log.isLoggable("BackgroundTask", 3)) {
            new StringBuilder(95).append("Permanently remove manager: ").append(c).append(", pending ops: ").append(i3).append(", results dropped: ").append(i);
        }
    }

    int a() {
        gwb.aJ();
        int i = this.h + 1;
        this.h = i;
        if (i == 0) {
            this.h++;
        }
        return this.h;
    }

    boolean b() {
        return !this.b.isEmpty();
    }

    jgc c() {
        return (jgc) this.e.poll();
    }

    Handler d() {
        return this.f;
    }

    void e() {
        this.c.a();
        PreferenceManager.getDefaultSharedPreferences(this.d).edit().putInt("bom_last_listener_id", this.h).apply();
    }

    void c(jgg jgg, String str) {
        int c;
        int i = 0;
        if (jgg != null) {
            c = jgg.c();
        } else {
            c = 0;
        }
        int size = this.b.size();
        while (i < size) {
            jgc jgc = (jgc) this.b.get(i);
            if (jgc.k() == c && jgc.j().equals(str)) {
                jgc.a(true);
            }
            i++;
        }
    }

    void a(jgc jgc, jgz jgz) {
        lka.a(jgz.b, new jgv(this, jgc, jgz)).run();
    }
}

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.os.Trace;
import android.telecom.Call;
import android.util.ArrayMap;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
public final class azs {
    public static azs a;
    public final Map b;
    public final Map c;
    final Map d;
    final Set e;
    private final Map f;
    private final Set g;
    private Handler h;

    static {
        a = new azs();
    }

    public azs() {
        this.b = new ArrayMap();
        this.c = new ArrayMap();
        this.f = new ArrayMap();
        this.g = Collections.newSetFromMap(new ConcurrentHashMap(8, 0.9f, 1));
        this.d = new ArrayMap();
        this.e = Collections.newSetFromMap(new ConcurrentHashMap(8, 0.9f, 1));
        this.h = new azt(this);
    }

    public final void a(Context context, Call call, bde bde) {
        int i;
        Trace.beginSection("onCallAdded");
        ayo ayo = new ayo(call, bde);
        bdf.a((Object) this, "onCallAdded: callState=" + ayo.c());
        if (buf.J(context).a()) {
            String c = buf.c(call);
            buf.J(context).a(c, null, new azu(this, ayo, context));
            buf.J(context).b(c, null, new azw(this, ayo));
            buf.J(context).d(c, null, new azx(this, ayo));
            buf.J(context).c(c, null, new azy(this, ayo));
        }
        new aup(context).a(new azv(this, ayo), buf.c(ayo.b), buf.g(context));
        if (ayo.c() == 4 || ayo.c() == 5) {
            b(ayo, ayo.b.getCannedTextResponses());
        } else {
            b(ayo);
        }
        if (buf.c() && ayo.c(64)) {
            i = 1;
        } else {
            i = 0;
        }
        if (i == 0) {
            if (ayo.c() == 4) {
                ayo.g.d = 1;
            } else if (ayo.e() != null) {
                ayo.g.d = ayo.e().getInt("com.android.dialer.EXTRA_CALL_INITIATION_TYPE", 12);
            }
        }
        Trace.endSection();
    }

    private void b(ayo ayo, List list) {
        if (g(ayo)) {
            String valueOf = String.valueOf(ayo);
            bdf.d(this, new StringBuilder(String.valueOf(valueOf).length() + 13).append("onIncoming - ").append(valueOf).toString());
        }
        a(ayo, list);
        for (baa a : this.g) {
            a.a(ayo);
        }
    }

    public final void a(ayo ayo) {
        String valueOf = String.valueOf(ayo);
        bdf.a((Object) this, new StringBuilder(String.valueOf(valueOf).length() + 22).append("onUpgradeToVideo call=").append(valueOf).toString());
        for (baa c : this.g) {
            c.c(ayo);
        }
    }

    public final void b(ayo ayo) {
        Trace.beginSection("onUpdate");
        String valueOf = String.valueOf(ayo);
        bdf.a((Object) this, new StringBuilder(String.valueOf(valueOf).length() + 1).append("\t").append(valueOf).toString());
        if (g(ayo)) {
            valueOf = String.valueOf(ayo);
            bdf.d(this, new StringBuilder(String.valueOf(valueOf).length() + 11).append("onUpdate - ").append(valueOf).toString());
        }
        a(ayo, ayo.b.getCannedTextResponses());
        e(ayo);
        m();
        Trace.endSection();
    }

    public final void a(ayo ayo, int i) {
        List<azz> list = (List) this.d.get(ayo.d);
        if (list != null) {
            for (azz a : list) {
                a.a(i);
            }
        }
    }

    public final void c(ayo ayo) {
        List<azz> list = (List) this.d.get(ayo.d);
        if (list != null) {
            for (azz a : list) {
                a.a();
            }
        }
    }

    public final void d(ayo ayo) {
        List<azz> list = (List) this.d.get(ayo.d);
        if (list != null) {
            for (azz b : list) {
                b.b();
            }
        }
    }

    public final void e(ayo ayo) {
        List<azz> list = (List) this.d.get(ayo.d);
        if (list != null) {
            for (azz d : list) {
                d.d(ayo);
            }
        }
    }

    public final void a(String str, azz azz) {
        List list = (List) this.d.get(str);
        if (list == null) {
            list = new CopyOnWriteArrayList();
            this.d.put(str, list);
        }
        list.add(azz);
    }

    public final void b(String str, azz azz) {
        List list = (List) this.d.get(str);
        if (list != null) {
            list.remove(azz);
        }
    }

    public final void a(baa baa) {
        Objects.requireNonNull(baa);
        this.g.add(baa);
        baa.a(this);
    }

    public final void b(baa baa) {
        if (baa != null) {
            this.g.remove(baa);
        }
    }

    public final ayo a() {
        ayo d = d();
        return d == null ? a(3, 0) : d;
    }

    public final ayo b() {
        return a(12, 0);
    }

    public final ayo c() {
        return a(13, 0);
    }

    public final ayo d() {
        ayo a = a(6, 0);
        if (a == null) {
            return a(7, 0);
        }
        return a;
    }

    public final ayo e() {
        return a(3, 0);
    }

    public final ayo f() {
        return a(8, 0);
    }

    public final ayo g() {
        return a(10, 0);
    }

    public final ayo h() {
        return a(9, 0);
    }

    public final ayo i() {
        ayo e = e();
        if (e == null) {
            return f();
        }
        return e;
    }

    public final ayo j() {
        ayo a = a(4, 0);
        if (a == null) {
            return a(5, 0);
        }
        return a;
    }

    public final ayo k() {
        ayo j = j();
        if (j == null) {
            j = c();
        }
        if (j == null) {
            j = d();
        }
        if (j == null) {
            j = a(3, 0);
        }
        if (j == null) {
            j = h();
        }
        if (j == null) {
            return g();
        }
        return j;
    }

    public final ayo l() {
        for (ayo ayo : this.b.values()) {
            if (ayo.i == 3) {
                return ayo;
            }
        }
        return null;
    }

    public final ayo a(String str) {
        return (ayo) this.b.get(str);
    }

    public final ayo a(Call call) {
        return (ayo) this.c.get(call);
    }

    public final List b(String str) {
        return (List) this.f.get(str);
    }

    public final ayo a(int i, int i2) {
        int i3 = 0;
        for (ayo ayo : this.b.values()) {
            int i4;
            if (ayo.c() != i) {
                i4 = i3;
            } else if (i3 >= i2) {
                return ayo;
            } else {
                i4 = i3 + 1;
            }
            i3 = i4;
        }
        return null;
    }

    public final void m() {
        for (baa a : this.g) {
            a.a(this);
        }
    }

    final void f(ayo ayo) {
        for (baa b : this.g) {
            b.b(ayo);
        }
    }

    public final boolean g(ayo ayo) {
        int i = 0;
        Objects.requireNonNull(ayo);
        if (ayo.c() == 10) {
            if (!this.b.containsKey(ayo.d)) {
                return false;
            }
            Message obtainMessage = this.h.obtainMessage(1, ayo);
            Handler handler = this.h;
            if (ayo.c() != 10) {
                throw new IllegalStateException();
            }
            switch (ayo.f().getCode()) {
                case rq.b /*1*/:
                case rl.e /*3*/:
                    i = 2000;
                    break;
                case rq.c /*2*/:
                    i = 200;
                    break;
                case rl.f /*4*/:
                case rl.g /*5*/:
                case rl.i /*6*/:
                    break;
                default:
                    i = 5000;
                    break;
            }
            handler.sendMessageDelayed(obtainMessage, (long) i);
            this.e.add(ayo);
            this.b.put(ayo.d, ayo);
            this.c.put(ayo.b, ayo);
            return true;
        } else if (!i(ayo)) {
            this.b.put(ayo.d, ayo);
            this.c.put(ayo.b, ayo);
            return true;
        } else if (!this.b.containsKey(ayo.d)) {
            return false;
        } else {
            this.b.remove(ayo.d);
            this.c.remove(ayo.b);
            return true;
        }
    }

    public final void a(ayo ayo, List list) {
        Objects.requireNonNull(ayo);
        if (i(ayo)) {
            if (this.b.containsKey(ayo.d)) {
                this.f.remove(ayo.d);
            }
        } else if (list != null) {
            this.f.put(ayo.d, list);
        }
    }

    private static boolean i(ayo ayo) {
        int c = ayo.c();
        return 2 == c || c == 0;
    }

    final void h(ayo ayo) {
        if (this.e.contains(ayo)) {
            this.e.remove(ayo);
        }
        ayo.a(2);
        g(ayo);
        m();
    }

    public final void a(int i) {
        for (ayo ayo : this.b.values()) {
            if (buf.a(ayo) && ayo.j() != null) {
                ayo.j().setDeviceOrientation(i);
            }
        }
    }
}

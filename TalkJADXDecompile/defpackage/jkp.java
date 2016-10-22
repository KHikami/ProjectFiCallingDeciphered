package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: jkp */
public final class jkp extends jtz implements jin, jkn {
    jkx b;
    private final jlq d;
    private final int e;
    private final ky<jtw, jtv> f;
    private final HashSet<jkj> g;
    private final ld<jtw, jkj> h;
    private final jld i;
    private long j;
    private final jjr k;
    private final jjr l;
    private final int m;
    private final jkh[] n;
    private final jst o;
    private int p;
    private final float q;
    private final int r;
    private final int s;
    private final int t;

    public int a() {
        return this.t;
    }

    protected jkp(Context context, jlo jlo) {
        jld jld;
        super(context);
        this.f = new ky();
        this.g = new HashSet();
        this.m = gwb.aA(context);
        jlm b = jlo.b();
        this.k = new jjr(context, b.a, b.b, b.c, b.d, b.e);
        b = jlo.c();
        this.l = new jjr(context, b.a, b.b, b.c, b.d, b.e);
        this.d = jlo.a();
        this.e = (int) (((double) this.d.a) * 0.75d);
        this.h = new jkr(this, this.d.a);
        DisplayMetrics ay = gwb.ay(context);
        this.q = Math.min(240.0f / ay.xdpi, 1.0f);
        this.p = Math.max(ay.heightPixels, ay.widthPixels);
        if (this.p == 0) {
            this.p = 640;
        }
        this.r = (int) ((((float) this.p) * 0.2f) * this.q);
        this.s = (int) (((float) this.p) * 0.5f);
        if (VERSION.SDK_INT < 11) {
            jld = null;
        } else {
            jld = new jld(this.d.c);
            if (this.d.f) {
                this.b = new jkx(this.d, jld, f(), e());
                gwb.a(new jks(this));
            }
        }
        this.i = jld;
        List c = jyn.c(context, jkh.class);
        this.n = (jkh[]) c.toArray(new jkh[c.size()]);
        Arrays.sort(this.n, new jkq(this));
        int integer = context.getApplicationContext().getResources().getInteger(gwb.yQ);
        if (this.m >= 256) {
            integer = 16777216;
        }
        this.t = integer;
        this.o = (jst) jyn.b(context, jst.class);
        if (Log.isLoggable("ImageResourceManager", 3)) {
            PrintWriter jkt = new jkt(this, new StringWriter());
            a(jkt);
            gwb.a(4, "ImageResourceManager", jkt.toString());
        }
        jyn b2 = jyn.b(context);
        b2.b(jin.class, (Object) this);
        if (this.i != null) {
            b2.b(jin.class, this.i);
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.getApplicationContext().registerReceiver(new jkb(), intentFilter);
        context.registerComponentCallbacks(new jko(context));
    }

    public Object a(jkj jkj, ByteBuffer byteBuffer, boolean z) {
        for (jkh a : this.n) {
            Object a2 = a.a(jkj, byteBuffer);
            if (a2 != null) {
                return a2;
            }
        }
        return null;
    }

    public jjr b() {
        return this.k;
    }

    public jjr c() {
        return this.l;
    }

    public int d() {
        return this.p;
    }

    public int e() {
        return this.r;
    }

    public int f() {
        return this.s;
    }

    public jtv a(jtw jtw) {
        jkj jkj = (jkj) this.f.get(jtw);
        return jkj != null ? jkj : (jtv) this.h.a((Object) jtw);
    }

    public void a(jtv jtv, jtx jtx) {
        gwb.aJ();
        Object l = jtv.l();
        jtv jtv2 = (jtv) this.f.get(l);
        String valueOf;
        String valueOf2;
        if (jtv2 == null) {
            jtv2 = (jtv) this.h.a(l);
            if (jtv2 == null) {
                this.f.put(l, jtv);
                if (jtv.p()) {
                    valueOf = String.valueOf(l);
                    new StringBuilder(String.valueOf(valueOf).length() + 14).append("loadResource: ").append(valueOf);
                }
                jtv.a(jtx);
            } else if (jtv2 != jtv) {
                valueOf2 = String.valueOf(l);
                throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf2).length() + 80).append("Duplicate resource: ").append(valueOf2).append(". Check getManagedResource() prior to calling loadResource. ").toString());
            } else {
                if (jtv.p()) {
                    valueOf = String.valueOf(l);
                    new StringBuilder(String.valueOf(valueOf).length() + 12).append("Activating: ").append(valueOf);
                }
                this.h.b(l);
                this.f.put(l, jtv);
                jtv.a(jtx);
            }
        } else if (jtv2 != jtv) {
            valueOf2 = String.valueOf(l);
            throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf2).length() + 80).append("Duplicate resource: ").append(valueOf2).append(". Check getManagedResource() prior to calling loadResource. ").toString());
        } else {
            if (jtv.p()) {
                valueOf = String.valueOf(l);
                new StringBuilder(String.valueOf(valueOf).length() + 25).append("Adding another consumer: ").append(valueOf);
            }
            jtv.a(jtx);
        }
    }

    public void a(jtv jtv) {
        if (this.f.containsKey(jtv.l())) {
            jkj jkj = (jkj) jtv;
            switch (jkj.m()) {
                case wi.w /*0*/:
                case wi.h /*4*/:
                case wi.q /*7*/:
                    if (jkj.p()) {
                        String valueOf = String.valueOf(jkj.l());
                        new StringBuilder(String.valueOf(valueOf).length() + 23).append("Requesting image load: ").append(valueOf);
                    }
                    jkj.c(2);
                    c(jtv);
                    return;
                case wi.j /*1*/:
                case wi.z /*3*/:
                case wi.p /*5*/:
                case wi.s /*6*/:
                    return;
                default:
                    String str = "Illegal resource state: ";
                    String valueOf2 = String.valueOf(jtv.n());
                    if (valueOf2.length() != 0) {
                        valueOf2 = str.concat(valueOf2);
                    } else {
                        valueOf2 = new String(str);
                    }
                    throw new IllegalStateException(valueOf2);
            }
        }
        valueOf = String.valueOf(jtv.l());
        throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 24).append("Resource is not active: ").append(valueOf).toString());
    }

    public void b(jtv jtv) {
        Object obj;
        Object obj2 = (jkj) jtv;
        Object l = obj2.l();
        if (obj2.p()) {
            String valueOf = String.valueOf(l);
            new StringBuilder(String.valueOf(valueOf).length() + 29).append("Deactivating image resource: ").append(valueOf);
        }
        if (obj2.m() == 2) {
            obj2.c(7);
            obj2.b.e();
        }
        this.f.remove(l);
        b((jkj) obj2);
        if (obj2.i == 5) {
            obj = null;
        } else if ((obj2.g.i & 10) != 0) {
            obj = null;
        } else {
            obj = 1;
        }
        if (obj == null || obj2.j() >= this.e) {
            obj2.i();
        } else if (this.j == 0 || this.j < System.currentTimeMillis()) {
            this.j = 0;
            this.h.a(l, obj2);
        }
    }

    public void a(jtv jtv, int i, int i2) {
        if (!(jtv instanceof jkj) || i != 4) {
            super.a(jtv, i, i2);
        } else if (((jkj) jtv).b.a()) {
            if (jtv.p()) {
                String valueOf = String.valueOf(jtv.l());
                new StringBuilder(String.valueOf(valueOf).length() + 21).append("Retrying image load: ").append(valueOf);
            }
            jtv.c(2);
            c(jtv);
        } else {
            jtv.c(5);
            super.a(jtv, 5, i2);
        }
    }

    public long g() {
        return this.d.d;
    }

    public long h() {
        return this.d.e;
    }

    public Bitmap a(int i, int i2) {
        Bitmap bitmap = null;
        if (this.i != null) {
            bitmap = this.i.a(i, i2);
        }
        if (bitmap == null) {
            return Bitmap.createBitmap(i, i2, Config.ARGB_8888);
        }
        return bitmap;
    }

    public void a(Bitmap bitmap) {
        if (bitmap != null) {
            if (this.i != null) {
                if (this.b != null) {
                    this.b.a();
                }
                this.i.a(bitmap);
                return;
            }
            bitmap.recycle();
        }
    }

    public void i() {
        if (!this.f.isEmpty() && ba.a(l())) {
            for (jtv jtv : this.f.values()) {
                if (jtv.m() == 4) {
                    a(jtv, 2);
                    c(jtv);
                }
            }
        }
    }

    public void a(jkj jkj) {
        synchronized (this.g) {
            this.g.add(jkj);
        }
    }

    public void b(jkj jkj) {
        synchronized (this.g) {
            this.g.remove(jkj);
        }
    }

    public float j() {
        return this.q;
    }

    public void k() {
        this.h.a(-1);
        this.j = System.currentTimeMillis() + 2000;
        if (this.i != null) {
            this.i.a();
        }
    }

    public void a(PrintWriter printWriter) {
        Map g = this.h.g();
        int i = this.d.a;
        int a = this.h.a();
        int size = g.size();
        int e = this.h.e();
        int c = this.h.c();
        int d = this.h.d();
        printWriter.println("Image cache size: " + i + "; cached size: " + a + "; cached bitmaps: " + size + "; put count: " + e + "; hit count: " + c + "; miss count: " + d + "; eviction count: " + this.h.f());
        if (g.isEmpty()) {
            printWriter.println("Image cache is empty");
        } else {
            for (jtw jtw : g.keySet()) {
                a = ((jkj) g.get(jtw)).j();
                String valueOf = String.valueOf(jtw);
                printWriter.println(new StringBuilder(String.valueOf(valueOf).length() + 27).append("Cached: ").append(a).append(" bytes, ").append(valueOf).toString());
            }
        }
        synchronized (this.g) {
            if (!this.g.isEmpty()) {
                Iterator it = this.g.iterator();
                while (it.hasNext()) {
                    valueOf = String.valueOf((jkj) it.next());
                    printWriter.println(new StringBuilder(String.valueOf(valueOf).length() + 13).append("Downloading: ").append(valueOf).toString());
                }
            }
        }
        if (this.f.isEmpty()) {
            printWriter.println("No active resources");
        } else {
            printWriter.println("Active resources");
            for (jtv defpackage_jtv : this.f.values()) {
                gwb.a(4, "ImageResourceManager", defpackage_jtv.toString());
            }
        }
        if (gwb.aI()) {
            new jku(this).execute(new Void[0]);
        } else {
            b(printWriter);
        }
    }

    void b(PrintWriter printWriter) {
        long a = this.k.a();
        long c = this.k.c();
        long max = Math.max(0, a - c);
        String valueOf = String.valueOf(kdq.a(a));
        String valueOf2 = String.valueOf(kdq.a(c));
        String valueOf3 = String.valueOf(kdq.a(max));
        printWriter.println(new StringBuilder(((String.valueOf(valueOf).length() + 39) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()).append("Disk cache total size: ").append(valueOf).append("; used: ").append(valueOf2).append("; free: ").append(valueOf3).toString());
        a = this.l.b();
        c = this.l.c();
        max = Math.max(0, a - c);
        valueOf = String.valueOf(kdq.a(a));
        valueOf2 = String.valueOf(kdq.a(c));
        valueOf3 = String.valueOf(kdq.a(max));
        printWriter.println(new StringBuilder(((String.valueOf(valueOf).length() + 44) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()).append("Long-term cache total size: ").append(valueOf).append("; used: ").append(valueOf2).append("; free: ").append(valueOf3).toString());
    }
}

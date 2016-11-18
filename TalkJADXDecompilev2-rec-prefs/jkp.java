package p000;

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

public final class jkp extends jtz implements jin, jkn {
    jkx f20359b;
    private final jlq f20360d;
    private final int f20361e;
    private final ky<jtw, jtv> f20362f = new ky();
    private final HashSet<jkj> f20363g = new HashSet();
    private final ld<jtw, jkj> f20364h;
    private final jld f20365i;
    private long f20366j;
    private final jjr f20367k;
    private final jjr f20368l;
    private final int f20369m;
    private final jkh[] f20370n;
    private final jst f20371o;
    private int f20372p;
    private final float f20373q;
    private final int f20374r;
    private final int f20375s;
    private final int f20376t;

    public int mo3536a() {
        return this.f20376t;
    }

    protected jkp(Context context, jlo jlo) {
        jld jld;
        super(context);
        this.f20369m = gwb.aA(context);
        jlm b = jlo.m24662b();
        this.f20367k = new jjr(context, b.f20420a, b.f20421b, b.f20422c, b.f20423d, b.f20424e);
        b = jlo.m24663c();
        this.f20368l = new jjr(context, b.f20420a, b.f20421b, b.f20422c, b.f20423d, b.f20424e);
        this.f20360d = jlo.m24661a();
        this.f20361e = (int) (((double) this.f20360d.f20439a) * 0.75d);
        this.f20364h = new jkr(this, this.f20360d.f20439a);
        DisplayMetrics ay = gwb.ay(context);
        this.f20373q = Math.min(240.0f / ay.xdpi, 1.0f);
        this.f20372p = Math.max(ay.heightPixels, ay.widthPixels);
        if (this.f20372p == 0) {
            this.f20372p = 640;
        }
        this.f20374r = (int) ((((float) this.f20372p) * 0.2f) * this.f20373q);
        this.f20375s = (int) (((float) this.f20372p) * 0.5f);
        if (VERSION.SDK_INT < 11) {
            jld = null;
        } else {
            jld = new jld(this.f20360d.f20441c);
            if (this.f20360d.f20444f) {
                this.f20359b = new jkx(this.f20360d, jld, mo3550f(), mo3549e());
                gwb.m1863a(new jks(this));
            }
        }
        this.f20365i = jld;
        List c = jyn.m25438c(context, jkh.class);
        this.f20370n = (jkh[]) c.toArray(new jkh[c.size()]);
        Arrays.sort(this.f20370n, new jkq(this));
        int integer = context.getApplicationContext().getResources().getInteger(gwb.yQ);
        if (this.f20369m >= 256) {
            integer = 16777216;
        }
        this.f20376t = integer;
        this.f20371o = (jst) jyn.m25433b(context, jst.class);
        if (Log.isLoggable("ImageResourceManager", 3)) {
            PrintWriter jkt = new jkt(this, new StringWriter());
            mo3452a(jkt);
            gwb.m1734a(4, "ImageResourceManager", jkt.toString());
        }
        jyn b2 = jyn.m25435b(context);
        b2.m25455b(jin.class, (Object) this);
        if (this.f20365i != null) {
            b2.m25455b(jin.class, this.f20365i);
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.getApplicationContext().registerReceiver(new jkb(), intentFilter);
        context.registerComponentCallbacks(new jko(context));
    }

    public Object mo3538a(jkj jkj, ByteBuffer byteBuffer, boolean z) {
        for (jkh a : this.f20370n) {
            Object a2 = a.mo3529a(jkj, byteBuffer);
            if (a2 != null) {
                return a2;
            }
        }
        return null;
    }

    public jjr mo3544b() {
        return this.f20367k;
    }

    public jjr mo3547c() {
        return this.f20368l;
    }

    public int mo3548d() {
        return this.f20372p;
    }

    public int mo3549e() {
        return this.f20374r;
    }

    public int mo3550f() {
        return this.f20375s;
    }

    public jtv mo3539a(jtw jtw) {
        jkj jkj = (jkj) this.f20362f.get(jtw);
        return jkj != null ? jkj : (jtv) this.f20364h.m1200a((Object) jtw);
    }

    public void mo3543a(jtv jtv, jtx jtx) {
        gwb.aJ();
        Object l = jtv.m24246l();
        jtv jtv2 = (jtv) this.f20362f.get(l);
        String valueOf;
        String valueOf2;
        if (jtv2 == null) {
            jtv2 = (jtv) this.f20364h.m1200a(l);
            if (jtv2 == null) {
                this.f20362f.put(l, jtv);
                if (jtv.m24250p()) {
                    valueOf = String.valueOf(l);
                    new StringBuilder(String.valueOf(valueOf).length() + 14).append("loadResource: ").append(valueOf);
                }
                jtv.m24238a(jtx);
            } else if (jtv2 != jtv) {
                valueOf2 = String.valueOf(l);
                throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf2).length() + 80).append("Duplicate resource: ").append(valueOf2).append(". Check getManagedResource() prior to calling loadResource. ").toString());
            } else {
                if (jtv.m24250p()) {
                    valueOf = String.valueOf(l);
                    new StringBuilder(String.valueOf(valueOf).length() + 12).append("Activating: ").append(valueOf);
                }
                this.f20364h.m1206b(l);
                this.f20362f.put(l, jtv);
                jtv.m24238a(jtx);
            }
        } else if (jtv2 != jtv) {
            valueOf2 = String.valueOf(l);
            throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf2).length() + 80).append("Duplicate resource: ").append(valueOf2).append(". Check getManagedResource() prior to calling loadResource. ").toString());
        } else {
            if (jtv.m24250p()) {
                valueOf = String.valueOf(l);
                new StringBuilder(String.valueOf(valueOf).length() + 25).append("Adding another consumer: ").append(valueOf);
            }
            jtv.m24238a(jtx);
        }
    }

    public void mo3542a(jtv jtv) {
        if (this.f20362f.containsKey(jtv.m24246l())) {
            jkj jkj = (jkj) jtv;
            switch (jkj.m24247m()) {
                case 0:
                case 4:
                case 7:
                    if (jkj.m24250p()) {
                        String valueOf = String.valueOf(jkj.m24246l());
                        new StringBuilder(String.valueOf(valueOf).length() + 23).append("Requesting image load: ").append(valueOf);
                    }
                    jkj.m24242c(2);
                    m24585c(jtv);
                    return;
                case 1:
                case 3:
                case 5:
                case 6:
                    return;
                default:
                    String str = "Illegal resource state: ";
                    String valueOf2 = String.valueOf(jtv.m24248n());
                    if (valueOf2.length() != 0) {
                        valueOf2 = str.concat(valueOf2);
                    } else {
                        valueOf2 = new String(str);
                    }
                    throw new IllegalStateException(valueOf2);
            }
        }
        valueOf = String.valueOf(jtv.m24246l());
        throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 24).append("Resource is not active: ").append(valueOf).toString());
    }

    public void mo3546b(jtv jtv) {
        Object obj;
        Object obj2 = (jkj) jtv;
        Object l = obj2.m24246l();
        if (obj2.m24250p()) {
            String valueOf = String.valueOf(l);
            new StringBuilder(String.valueOf(valueOf).length() + 29).append("Deactivating image resource: ").append(valueOf);
        }
        if (obj2.m24247m() == 2) {
            obj2.m24242c(7);
            obj2.f20097b.m24538e();
        }
        this.f20362f.remove(l);
        mo3545b((jkj) obj2);
        if (obj2.i == 5) {
            obj = null;
        } else if ((obj2.g.f20071i & 10) != 0) {
            obj = null;
        } else {
            obj = 1;
        }
        if (obj == null || obj2.m24272j() >= this.f20361e) {
            obj2.mo3520i();
        } else if (this.f20366j == 0 || this.f20366j < System.currentTimeMillis()) {
            this.f20366j = 0;
            this.f20364h.m1201a(l, obj2);
        }
    }

    public void mo3531a(jtv jtv, int i, int i2) {
        if (!(jtv instanceof jkj) || i != 4) {
            super.mo3531a(jtv, i, i2);
        } else if (((jkj) jtv).f20097b.m24533a()) {
            if (jtv.m24250p()) {
                String valueOf = String.valueOf(jtv.m24246l());
                new StringBuilder(String.valueOf(valueOf).length() + 21).append("Retrying image load: ").append(valueOf);
            }
            jtv.m24242c(2);
            m24585c(jtv);
        } else {
            jtv.m24242c(5);
            super.mo3531a(jtv, 5, i2);
        }
    }

    public long mo3551g() {
        return this.f20360d.f20442d;
    }

    public long mo3552h() {
        return this.f20360d.f20443e;
    }

    public Bitmap mo3537a(int i, int i2) {
        Bitmap bitmap = null;
        if (this.f20365i != null) {
            bitmap = this.f20365i.m24629a(i, i2);
        }
        if (bitmap == null) {
            return Bitmap.createBitmap(i, i2, Config.ARGB_8888);
        }
        return bitmap;
    }

    public void mo3540a(Bitmap bitmap) {
        if (bitmap != null) {
            if (this.f20365i != null) {
                if (this.f20359b != null) {
                    this.f20359b.m24620a();
                }
                this.f20365i.m24631a(bitmap);
                return;
            }
            bitmap.recycle();
        }
    }

    public void mo3553i() {
        if (!this.f20362f.isEmpty() && ba.m4581a(mo3535l())) {
            for (jtv jtv : this.f20362f.values()) {
                if (jtv.m24247m() == 4) {
                    mo3530a(jtv, 2);
                    m24585c(jtv);
                }
            }
        }
    }

    public void mo3541a(jkj jkj) {
        synchronized (this.f20363g) {
            this.f20363g.add(jkj);
        }
    }

    public void mo3545b(jkj jkj) {
        synchronized (this.f20363g) {
            this.f20363g.remove(jkj);
        }
    }

    public float mo3554j() {
        return this.f20373q;
    }

    public void mo3555k() {
        this.f20364h.m1202a(-1);
        this.f20366j = System.currentTimeMillis() + 2000;
        if (this.f20365i != null) {
            this.f20365i.m24630a();
        }
    }

    public void mo3452a(PrintWriter printWriter) {
        Map g = this.f20364h.m1212g();
        int i = this.f20360d.f20439a;
        int a = this.f20364h.m1197a();
        int size = g.size();
        int e = this.f20364h.m1210e();
        int c = this.f20364h.m1208c();
        int d = this.f20364h.m1209d();
        printWriter.println("Image cache size: " + i + "; cached size: " + a + "; cached bitmaps: " + size + "; put count: " + e + "; hit count: " + c + "; miss count: " + d + "; eviction count: " + this.f20364h.m1211f());
        if (g.isEmpty()) {
            printWriter.println("Image cache is empty");
        } else {
            for (jtw jtw : g.keySet()) {
                a = ((jkj) g.get(jtw)).m24272j();
                String valueOf = String.valueOf(jtw);
                printWriter.println(new StringBuilder(String.valueOf(valueOf).length() + 27).append("Cached: ").append(a).append(" bytes, ").append(valueOf).toString());
            }
        }
        synchronized (this.f20363g) {
            if (!this.f20363g.isEmpty()) {
                Iterator it = this.f20363g.iterator();
                while (it.hasNext()) {
                    valueOf = String.valueOf((jkj) it.next());
                    printWriter.println(new StringBuilder(String.valueOf(valueOf).length() + 13).append("Downloading: ").append(valueOf).toString());
                }
            }
        }
        if (this.f20362f.isEmpty()) {
            printWriter.println("No active resources");
        } else {
            printWriter.println("Active resources");
            for (jtv p000_jtv : this.f20362f.values()) {
                gwb.m1734a(4, "ImageResourceManager", p000_jtv.toString());
            }
        }
        if (gwb.aI()) {
            new jku(this).execute(new Void[0]);
        } else {
            m24599b(printWriter);
        }
    }

    void m24599b(PrintWriter printWriter) {
        long a = this.f20367k.m24506a();
        long c = this.f20367k.m24512c();
        long max = Math.max(0, a - c);
        String valueOf = String.valueOf(kdq.m25596a(a));
        String valueOf2 = String.valueOf(kdq.m25596a(c));
        String valueOf3 = String.valueOf(kdq.m25596a(max));
        printWriter.println(new StringBuilder(((String.valueOf(valueOf).length() + 39) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()).append("Disk cache total size: ").append(valueOf).append("; used: ").append(valueOf2).append("; free: ").append(valueOf3).toString());
        a = this.f20368l.m24510b();
        c = this.f20368l.m24512c();
        max = Math.max(0, a - c);
        valueOf = String.valueOf(kdq.m25596a(a));
        valueOf2 = String.valueOf(kdq.m25596a(c));
        valueOf3 = String.valueOf(kdq.m25596a(max));
        printWriter.println(new StringBuilder(((String.valueOf(valueOf).length() + 44) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()).append("Long-term cache total size: ").append(valueOf).append("; used: ").append(valueOf2).append("; free: ").append(valueOf3).toString());
    }
}

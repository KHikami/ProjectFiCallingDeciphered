package p000;

import android.graphics.drawable.Drawable;
import android.util.Log;

public final class azn<R> implements azi, azm, azw, bay {
    public static final ll<azn<?>> f2611a = bas.m4692a(150, new azo());
    public azj f2612b;
    public amk f2613c;
    public Object f2614d;
    public Class<R> f2615e;
    public azh<?> f2616f;
    public int f2617g;
    public int f2618h;
    public amq f2619i;
    public azx<R> f2620j;
    public azk<R> f2621k;
    public apw f2622l;
    public bad<? super R> f2623m;
    public int f2624n;
    private final String f2625o = String.valueOf(hashCode());
    private final bba f2626p = bba.m4705a();
    private aqr<R> f2627q;
    private aqb f2628r;
    private long f2629s;
    private Drawable f2630t;
    private Drawable f2631u;
    private Drawable f2632v;
    private int f2633w;
    private int f2634x;

    public bba j_() {
        return this.f2626p;
    }

    public void mo427i() {
        this.f2613c = null;
        this.f2614d = null;
        this.f2615e = null;
        this.f2616f = null;
        this.f2617g = -1;
        this.f2618h = -1;
        this.f2620j = null;
        this.f2621k = null;
        this.f2612b = null;
        this.f2623m = null;
        this.f2628r = null;
        this.f2630t = null;
        this.f2631u = null;
        this.f2632v = null;
        this.f2633w = -1;
        this.f2634x = -1;
        f2611a.mo437a(this);
    }

    public void mo417a() {
        this.f2626p.mo439b();
        this.f2629s = bam.m4675a();
        if (this.f2614d == null) {
            if (baq.m4686a(this.f2617g, this.f2618h)) {
                this.f2633w = this.f2617g;
                this.f2634x = this.f2618h;
            }
            m4464a(new aqm("Received null model"), m4469l() == null ? 5 : 3);
            return;
        }
        this.f2624n = azp.f2637c;
        if (baq.m4686a(this.f2617g, this.f2618h)) {
            mo418a(this.f2617g, this.f2618h);
        } else {
            this.f2620j.mo263a((azw) this);
        }
        if ((this.f2624n == azp.f2636b || this.f2624n == azp.f2637c) && m4470m()) {
            this.f2620j.mo432b(m4468k());
        }
        if (Log.isLoggable("Request", 2)) {
            m4466a("finished run method in " + bam.m4674a(this.f2629s));
        }
    }

    private void m4467j() {
        this.f2626p.mo439b();
        this.f2624n = azp.f2640f;
        if (this.f2628r != null) {
            this.f2628r.m3716a();
            this.f2628r = null;
        }
    }

    public void mo422c() {
        baq.m4685a();
        if (this.f2624n != azp.f2641g) {
            m4467j();
            if (this.f2627q != null) {
                m4465a(this.f2627q);
            }
            if (m4470m()) {
                this.f2620j.mo267d(m4468k());
            }
            this.f2624n = azp.f2641g;
        }
    }

    public void mo421b() {
        mo422c();
        this.f2624n = azp.f2642h;
    }

    public boolean mo423e() {
        return this.f2624n == azp.f2636b || this.f2624n == azp.f2637c;
    }

    public boolean mo424f() {
        return this.f2624n == azp.f2638d;
    }

    public boolean mo425g() {
        return mo424f();
    }

    public boolean mo426h() {
        return this.f2624n == azp.f2640f || this.f2624n == azp.f2641g;
    }

    private Drawable m4468k() {
        if (this.f2631u == null) {
            this.f2631u = this.f2616f.f2592f;
            if (this.f2631u == null && this.f2616f.f2593g > 0) {
                this.f2631u = m4463a(this.f2616f.f2593g);
            }
        }
        return this.f2631u;
    }

    private Drawable m4469l() {
        if (this.f2632v == null) {
            this.f2632v = this.f2616f.f2600n;
            if (this.f2632v == null && this.f2616f.f2601o > 0) {
                this.f2632v = m4463a(this.f2616f.f2601o);
            }
        }
        return this.f2632v;
    }

    private Drawable m4463a(int i) {
        return gwb.m1570a(this.f2613c.getResources(), i, this.f2616f.f2606t);
    }

    public void mo418a(int i, int i2) {
        this.f2626p.mo439b();
        if (Log.isLoggable("Request", 2)) {
            m4466a("Got onSizeReady in " + bam.m4674a(this.f2629s));
        }
        if (this.f2624n == azp.f2637c) {
            this.f2624n = azp.f2636b;
            float f = this.f2616f.f2587a;
            this.f2633w = azn.m4462a(i, f);
            this.f2634x = azn.m4462a(i2, f);
            if (Log.isLoggable("Request", 2)) {
                m4466a("finished setup for calling load in " + bam.m4674a(this.f2629s));
            }
            this.f2628r = this.f2622l.m3702a(this.f2613c, this.f2614d, this.f2616f.f2597k, this.f2633w, this.f2634x, this.f2616f.f2604r, this.f2615e, this.f2619i, this.f2616f.f2588b, this.f2616f.f2603q, this.f2616f.f2598l, this.f2616f.f2602p, this.f2616f.f2594h, this.f2616f.f2607u, this);
            if (Log.isLoggable("Request", 2)) {
                m4466a("finished onSizeReady in " + bam.m4674a(this.f2629s));
            }
        }
    }

    private static int m4462a(int i, float f) {
        return i == nzf.UNSET_ENUM_VALUE ? i : Math.round(((float) i) * f);
    }

    private boolean m4470m() {
        return this.f2612b == null || this.f2612b.mo429b(this);
    }

    private boolean m4471n() {
        return this.f2612b == null || !this.f2612b.mo431d();
    }

    public void mo420a(aqr<?> aqr_, anq anq) {
        this.f2626p.mo439b();
        this.f2628r = null;
        if (aqr_ == null) {
            String valueOf = String.valueOf(this.f2615e);
            mo419a(new aqm(new StringBuilder(String.valueOf(valueOf).length() + 82).append("Expected to receive a Resource<R> with an object of ").append(valueOf).append(" inside, but instead got null.").toString()));
            return;
        }
        Object c = aqr_.mo346c();
        if (c == null || !this.f2615e.isAssignableFrom(c.getClass())) {
            m4465a((aqr) aqr_);
            String valueOf2 = String.valueOf(this.f2615e);
            String valueOf3 = String.valueOf(c != null ? c.getClass() : "");
            String valueOf4 = String.valueOf(c);
            String valueOf5 = String.valueOf(aqr_);
            String str = c != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.";
            mo419a(new aqm(new StringBuilder(((((String.valueOf(valueOf2).length() + 71) + String.valueOf(valueOf3).length()) + String.valueOf(valueOf4).length()) + String.valueOf(valueOf5).length()) + String.valueOf(str).length()).append("Expected to receive an object of ").append(valueOf2).append(" but instead got ").append(valueOf3).append("{").append(valueOf4).append("} inside Resource{").append(valueOf5).append("}.").append(str).toString()));
            return;
        }
        Object obj;
        if (this.f2612b == null || this.f2612b.mo428a(this)) {
            obj = 1;
        } else {
            obj = null;
        }
        if (obj == null) {
            m4465a((aqr) aqr_);
            this.f2624n = azp.f2638d;
            return;
        }
        boolean n = m4471n();
        this.f2624n = azp.f2638d;
        this.f2627q = aqr_;
        if (this.f2613c.m2918d() <= 3) {
            str = String.valueOf(c.getClass().getSimpleName());
            String valueOf6 = String.valueOf(anq);
            valueOf2 = String.valueOf(this.f2614d);
            new StringBuilder(((String.valueOf(str).length() + 95) + String.valueOf(valueOf6).length()) + String.valueOf(valueOf2).length()).append("Finished loading ").append(str).append(" from ").append(valueOf6).append(" for ").append(valueOf2).append(" with size [").append(this.f2633w).append("x").append(this.f2634x).append("] in ").append(bam.m4674a(this.f2629s)).append(" ms");
        }
        if (this.f2621k == null || !this.f2621k.mo1309a(c, this.f2614d, this.f2620j, anq, n)) {
            this.f2620j.mo264a(c, this.f2623m.m4661a());
        }
        if (this.f2612b != null) {
            this.f2612b.mo430c(this);
        }
    }

    public void mo419a(aqm aqm) {
        m4464a(aqm, 5);
    }

    private void m4464a(aqm aqm, int i) {
        this.f2626p.mo439b();
        int d = this.f2613c.m2918d();
        if (d <= i) {
            String valueOf = String.valueOf(this.f2614d);
            int i2 = this.f2633w;
            new StringBuilder(String.valueOf(valueOf).length() + 52).append("Load failed for ").append(valueOf).append(" with size [").append(i2).append("x").append(this.f2634x).append("]");
            if (d <= 4) {
                aqm.m3749a("Glide");
            }
        }
        this.f2628r = null;
        this.f2624n = azp.f2639e;
        if (this.f2621k != null) {
            azk azk = this.f2621k;
            m4471n();
            if (azk.mo1308a(aqm)) {
                return;
            }
        }
        if (m4470m()) {
            Drawable l;
            if (this.f2614d == null) {
                l = m4469l();
            } else {
                if (this.f2630t == null) {
                    this.f2630t = this.f2616f.f2590d;
                    if (this.f2630t == null && this.f2616f.f2591e > 0) {
                        this.f2630t = m4463a(this.f2616f.f2591e);
                    }
                }
                l = this.f2630t;
            }
            if (l == null) {
                l = m4468k();
            }
            this.f2620j.mo433c(l);
        }
    }

    private void m4466a(String str) {
        String str2 = this.f2625o;
        new StringBuilder((String.valueOf(str).length() + 7) + String.valueOf(str2).length()).append(str).append(" this: ").append(str2);
    }

    private void m4465a(aqr<?> aqr_) {
        baq.m4685a();
        if (aqr_ instanceof aqk) {
            ((aqk) aqr_).m3741g();
            this.f2627q = null;
            return;
        }
        throw new IllegalArgumentException("Cannot release anything but an EngineResource");
    }
}

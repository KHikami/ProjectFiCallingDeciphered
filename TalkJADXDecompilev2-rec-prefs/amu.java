package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.io.File;

public class amu implements ayo {
    private static final azl f1356b;
    private static final azl f1357c;
    private static final azl f1358d = ((azl) ((azl) azl.m4457b(apq.f2077c).m4422a(amq.LOW)).m4432a(true));
    final ayn f1359a;
    private final ami f1360e;
    private final ayt f1361f;
    private final ayo f1362g;
    private final ayw f1363h;
    private final Runnable f1364i;
    private final Handler f1365j;
    private final ayo f1366k;
    private azh<?> f1367l;
    private azh<?> f1368m;

    static {
        azh b = azl.m4458b(Bitmap.class);
        b.f2605s = true;
        f1356b = (azl) b;
        b = azl.m4458b(axo.class);
        b.f2605s = true;
        f1357c = (azl) b;
    }

    public amu(ami ami, ayn ayn, ayo ayo) {
        this(ami, ayn, ayo, new ayt(), ami.m2909d());
    }

    private amu(ami ami, ayn ayn, ayo ayo, ayt ayt, ayj ayj) {
        this.f1363h = new ayw();
        this.f1364i = new amv(this);
        this.f1365j = new Handler(Looper.getMainLooper());
        this.f1360e = ami;
        this.f1359a = ayn;
        this.f1362g = ayo;
        this.f1361f = ayt;
        this.f1366k = ayj.m4345a(ami.m2910e().getBaseContext(), new ayi(ayt));
        if (baq.m4690c()) {
            this.f1365j.post(this.f1364i);
        } else {
            ayn.mo409a(this);
        }
        ayn.mo409a(this.f1366k);
        this.f1367l = ami.m2910e().m2914a();
        this.f1368m = this.f1367l;
        ami.m2904a(this);
    }

    public void m2972a(int i) {
        this.f1360e.m2910e().onTrimMemory(i);
    }

    public void m2971a() {
        this.f1360e.m2910e().onLowMemory();
    }

    public void m2976b() {
        baq.m4685a();
        this.f1361f.m4368a();
    }

    public void m2978c() {
        baq.m4685a();
        this.f1361f.m4370b();
    }

    public void mo260d() {
        m2978c();
        this.f1363h.mo260d();
    }

    public void h_() {
        m2976b();
        this.f1363h.h_();
    }

    public void mo261f() {
        this.f1363h.mo261f();
        for (azx a : this.f1363h.m4381a()) {
            m2974a(a);
        }
        this.f1363h.m4383b();
        this.f1361f.m4372c();
        this.f1359a.mo410b(this);
        this.f1359a.mo410b(this.f1366k);
        this.f1365j.removeCallbacks(this.f1364i);
        this.f1360e.m2907b(this);
    }

    public ams<Bitmap> m2981g() {
        return m2970a(Bitmap.class).m2962a(new amy((byte) 0)).m2964a(f1356b);
    }

    public ams<Drawable> m2982h() {
        return m2970a(Drawable.class).m2962a(new amy('\u0000'));
    }

    public ams<File> m2983i() {
        return m2970a(File.class).m2964a(f1358d);
    }

    public <ResourceType> ams<ResourceType> m2970a(Class<ResourceType> cls) {
        return new ams(this.f1360e.m2910e(), this, cls);
    }

    public void m2973a(View view) {
        m2974a(new amx(view));
    }

    public void m2974a(azx<?> azx_) {
        if (azx_ != null) {
            if (!baq.m4688b()) {
                this.f1365j.post(new amw(this, azx_));
            } else if (!m2977b(azx_)) {
                this.f1360e.m2905a((azx) azx_);
            }
        }
    }

    boolean m2977b(azx<?> azx_) {
        azi b = azx_.mo266b();
        if (b == null) {
            return true;
        }
        if (!this.f1361f.m4371b(b)) {
            return false;
        }
        this.f1363h.m4384b(azx_);
        azx_.mo265a(null);
        return true;
    }

    void m2975a(azx<?> azx_, azi azi) {
        this.f1363h.m4382a(azx_);
        this.f1361f.m4369a(azi);
    }

    azh<?> m2984j() {
        return this.f1368m;
    }

    public String toString() {
        String valueOf = String.valueOf(super.toString());
        String valueOf2 = String.valueOf(this.f1361f);
        String valueOf3 = String.valueOf(this.f1362g);
        return new StringBuilder(((String.valueOf(valueOf).length() + 21) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()).append(valueOf).append("{tracker=").append(valueOf2).append(", treeNode=").append(valueOf3).append("}").toString();
    }
}

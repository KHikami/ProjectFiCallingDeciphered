package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

final class axs {
    final amu f2502a;
    private final ani f2503b;
    private final Handler f2504c;
    private final Context f2505d;
    private final List<axu> f2506e;
    private final ard f2507f;
    private boolean f2508g;
    private boolean f2509h;
    private ams<Bitmap> f2510i;
    private axt f2511j;
    private boolean f2512k;
    private axt f2513l;
    private Bitmap f2514m;
    private aoc<Bitmap> f2515n;

    public axs(ami ami, ani ani, int i, int i2, aoc<Bitmap> aoc_android_graphics_Bitmap, Bitmap bitmap) {
        this(ami.m2908c(), ami.m2902a(), ami.m2901b(ami.m2908c()), ani, null, ami.m2901b(ami.m2908c()).m2981g().m2964a(((azl) azl.m4457b(apq.f2076b).m4432a(true)).m4421a(i, i2)), aoc_android_graphics_Bitmap, bitmap);
    }

    private axs(Context context, ard ard, amu amu, ani ani, Handler handler, ams<Bitmap> ams_android_graphics_Bitmap, aoc<Bitmap> aoc_android_graphics_Bitmap, Bitmap bitmap) {
        this.f2506e = new ArrayList();
        this.f2508g = false;
        this.f2509h = false;
        this.f2502a = amu;
        Handler handler2 = new Handler(Looper.getMainLooper(), new axv(this));
        this.f2505d = context;
        this.f2507f = ard;
        this.f2504c = handler2;
        this.f2510i = ams_android_graphics_Bitmap;
        this.f2503b = ani;
        m4300a(aoc_android_graphics_Bitmap, bitmap);
    }

    void m4300a(aoc<Bitmap> aoc_android_graphics_Bitmap, Bitmap bitmap) {
        this.f2515n = (aoc) gwb.m1404I((Object) aoc_android_graphics_Bitmap);
        this.f2514m = (Bitmap) gwb.m1404I((Object) bitmap);
        this.f2510i = this.f2510i.m2964a(new azl().m4424a(this.f2505d, (aoc) aoc_android_graphics_Bitmap));
    }

    Bitmap m4299a() {
        return this.f2514m;
    }

    void m4302a(axu axu) {
        if (this.f2512k) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        boolean isEmpty = this.f2506e.isEmpty();
        if (this.f2506e.contains(axu)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        this.f2506e.add(axu);
        if (isEmpty && !this.f2508g) {
            this.f2508g = true;
            this.f2512k = false;
            m4297j();
        }
    }

    void m4304b(axu axu) {
        this.f2506e.remove(axu);
        if (this.f2506e.isEmpty()) {
            this.f2508g = false;
        }
    }

    int m4303b() {
        return m4311i().getWidth();
    }

    int m4305c() {
        return m4311i().getHeight();
    }

    int m4306d() {
        return this.f2503b.mo302f() + baq.m4680a(m4311i().getWidth(), m4311i().getHeight(), m4311i().getConfig());
    }

    int m4307e() {
        if (this.f2511j != null) {
            return this.f2511j.f2518a;
        }
        return -1;
    }

    ByteBuffer m4308f() {
        return this.f2503b.mo297a().asReadOnlyBuffer();
    }

    int m4309g() {
        return this.f2503b.mo300d();
    }

    void m4310h() {
        this.f2506e.clear();
        m4298k();
        this.f2508g = false;
        if (this.f2511j != null) {
            this.f2502a.m2974a(this.f2511j);
            this.f2511j = null;
        }
        if (this.f2513l != null) {
            this.f2502a.m2974a(this.f2513l);
            this.f2513l = null;
        }
        this.f2503b.mo304h();
        this.f2512k = true;
    }

    Bitmap m4311i() {
        return this.f2511j != null ? this.f2511j.m4314a() : this.f2514m;
    }

    private void m4297j() {
        if (this.f2508g && !this.f2509h) {
            this.f2509h = true;
            long c = ((long) this.f2503b.mo299c()) + SystemClock.uptimeMillis();
            this.f2503b.mo298b();
            this.f2513l = new axt(this.f2504c, this.f2503b.mo301e(), c);
            this.f2510i.m2961a().m2964a(azl.m4456b(new axw())).m2966a(this.f2503b).m2969a(this.f2513l);
        }
    }

    private void m4298k() {
        if (this.f2514m != null) {
            this.f2507f.mo361a(this.f2514m);
            this.f2514m = null;
        }
    }

    void m4301a(axt axt) {
        if (this.f2512k) {
            this.f2504c.obtainMessage(2, axt).sendToTarget();
            return;
        }
        if (axt.m4314a() != null) {
            m4298k();
            axt axt2 = this.f2511j;
            this.f2511j = axt;
            for (int size = this.f2506e.size() - 1; size >= 0; size--) {
                ((axu) this.f2506e.get(size)).mo407f();
            }
            if (axt2 != null) {
                this.f2504c.obtainMessage(2, axt2).sendToTarget();
            }
        }
        this.f2509h = false;
        m4297j();
    }
}

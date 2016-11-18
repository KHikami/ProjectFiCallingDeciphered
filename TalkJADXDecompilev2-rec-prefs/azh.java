package p000;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.util.HashMap;
import java.util.Map;

public class azh<CHILD extends azh<CHILD>> implements Cloneable {
    float f2587a = 1.0f;
    apq f2588b = apq.f2079e;
    public amq f2589c = amq.NORMAL;
    Drawable f2590d;
    int f2591e;
    Drawable f2592f;
    int f2593g;
    boolean f2594h = true;
    public int f2595i = -1;
    public int f2596j = -1;
    anv f2597k = bae.f2719b;
    boolean f2598l;
    public boolean f2599m = true;
    Drawable f2600n;
    int f2601o;
    public anz f2602p = new anz();
    Map<Class<?>, aoc<?>> f2603q = new HashMap();
    Class<?> f2604r = Object.class;
    public boolean f2605s;
    Theme f2606t;
    boolean f2607u;
    private int f2608v;
    private boolean f2609w;

    public /* synthetic */ Object clone() {
        return m4419a();
    }

    public final CHILD m4420a(float f) {
        while (this.f2609w) {
            this = m4419a();
        }
        if (f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.f2587a = f;
        this.f2608v |= 2;
        return m4418d();
    }

    public final CHILD m4428a(apq apq) {
        while (this.f2609w) {
            this = m4419a();
        }
        this.f2588b = (apq) gwb.m1404I((Object) apq);
        this.f2608v |= 4;
        return m4418d();
    }

    public final CHILD m4422a(amq amq) {
        while (this.f2609w) {
            this = m4419a();
        }
        this.f2589c = (amq) gwb.m1404I((Object) amq);
        this.f2608v |= 8;
        return m4418d();
    }

    public final CHILD m4432a(boolean z) {
        while (this.f2609w) {
            this = m4419a();
        }
        this.f2594h = false;
        this.f2608v |= 256;
        return m4418d();
    }

    public final CHILD m4421a(int i, int i2) {
        while (this.f2609w) {
            this = m4419a();
        }
        this.f2596j = i;
        this.f2595i = i2;
        this.f2608v |= 512;
        return m4418d();
    }

    public final CHILD m4426a(anv anv) {
        while (this.f2609w) {
            this = m4419a();
        }
        this.f2597k = (anv) gwb.m1404I((Object) anv);
        this.f2608v |= 1024;
        return m4418d();
    }

    public final CHILD m4419a() {
        try {
            azh azh = (azh) super.clone();
            azh.f2602p = new anz();
            azh.f2602p.m3529a(this.f2602p);
            azh.f2603q = new HashMap();
            azh.f2603q.putAll(this.f2603q);
            azh.f2605s = false;
            azh.f2609w = false;
            return azh;
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public final <T> CHILD m4427a(anw<T> anw_T, T t) {
        while (this.f2609w) {
            this = m4419a();
        }
        gwb.m1404I((Object) anw_T);
        gwb.m1404I((Object) t);
        this.f2602p.m3527a(anw_T, t);
        return m4418d();
    }

    public final CHILD m4431a(Class<?> cls) {
        while (this.f2609w) {
            this = m4419a();
        }
        this.f2604r = (Class) gwb.m1404I((Object) cls);
        this.f2608v |= 4096;
        return m4418d();
    }

    public CHILD m4425a(anr anr) {
        return m4427a(awn.f2436a, (anr) gwb.m1404I((Object) anr));
    }

    public CHILD m4429a(awf awf) {
        return m4427a(awn.f2437b, (awf) gwb.m1404I((Object) awf));
    }

    public CHILD m4423a(Context context) {
        return m4414a(context, awf.f2427b, new awc(context));
    }

    public CHILD m4435b(Context context) {
        return m4414a(context, awf.f2426a, new awq(context));
    }

    public CHILD m4438c(Context context) {
        return m4416b(context, awf.f2426a, new awq(context));
    }

    public CHILD m4439d(Context context) {
        return m4414a(context, awf.f2430e, new awd(context));
    }

    public CHILD m4440e(Context context) {
        return m4416b(context, awf.f2430e, new awd(context));
    }

    private CHILD m4414a(Context context, awf awf, aoc<Bitmap> aoc_android_graphics_Bitmap) {
        while (this.f2609w) {
            this = m4419a();
        }
        m4429a(awf);
        return m4436b(context, (aoc) aoc_android_graphics_Bitmap);
    }

    private CHILD m4416b(Context context, awf awf, aoc<Bitmap> aoc_android_graphics_Bitmap) {
        while (this.f2609w) {
            this = m4419a();
        }
        m4429a(awf);
        return m4424a(context, (aoc) aoc_android_graphics_Bitmap);
    }

    public CHILD m4424a(Context context, aoc<Bitmap> aoc_android_graphics_Bitmap) {
        if (this.f2609w) {
            return m4419a().m4424a(context, (aoc) aoc_android_graphics_Bitmap);
        }
        m4436b(context, (aoc) aoc_android_graphics_Bitmap);
        this.f2598l = true;
        this.f2608v |= 131072;
        return m4418d();
    }

    public CHILD m4436b(Context context, aoc<Bitmap> aoc_android_graphics_Bitmap) {
        if (this.f2609w) {
            return m4419a().m4436b(context, (aoc) aoc_android_graphics_Bitmap);
        }
        m4415a(Bitmap.class, (aoc) aoc_android_graphics_Bitmap);
        m4415a(BitmapDrawable.class, new avx(context, aoc_android_graphics_Bitmap));
        m4415a(axo.class, new axr(context, (aoc) aoc_android_graphics_Bitmap));
        return m4418d();
    }

    private <T> CHILD m4415a(Class<T> cls, aoc<T> aoc_T) {
        while (this.f2609w) {
            this = m4419a();
        }
        gwb.m1404I((Object) cls);
        gwb.m1404I((Object) aoc_T);
        this.f2603q.put(cls, aoc_T);
        this.f2608v |= 2048;
        this.f2599m = true;
        this.f2608v |= 65536;
        return m4418d();
    }

    public final CHILD m4434b() {
        while (this.f2609w) {
            this = m4419a();
        }
        m4427a(axl.f2479a, Boolean.valueOf(true));
        m4427a(axy.f2525a, Boolean.valueOf(true));
        return m4418d();
    }

    public final CHILD m4430a(azh<?> azh_) {
        while (this.f2609w) {
            this = m4419a();
        }
        if (azh.m4417b(azh_.f2608v, 2)) {
            this.f2587a = azh_.f2587a;
        }
        if (azh.m4417b(azh_.f2608v, 262144)) {
            this.f2607u = azh_.f2607u;
        }
        if (azh.m4417b(azh_.f2608v, 4)) {
            this.f2588b = azh_.f2588b;
        }
        if (azh.m4417b(azh_.f2608v, 8)) {
            this.f2589c = azh_.f2589c;
        }
        if (azh.m4417b(azh_.f2608v, 16)) {
            this.f2590d = azh_.f2590d;
        }
        if (azh.m4417b(azh_.f2608v, 32)) {
            this.f2591e = azh_.f2591e;
        }
        if (azh.m4417b(azh_.f2608v, 64)) {
            this.f2592f = azh_.f2592f;
        }
        if (azh.m4417b(azh_.f2608v, 128)) {
            this.f2593g = azh_.f2593g;
        }
        if (azh.m4417b(azh_.f2608v, 256)) {
            this.f2594h = azh_.f2594h;
        }
        if (azh.m4417b(azh_.f2608v, 512)) {
            this.f2596j = azh_.f2596j;
            this.f2595i = azh_.f2595i;
        }
        if (azh.m4417b(azh_.f2608v, 1024)) {
            this.f2597k = azh_.f2597k;
        }
        if (azh.m4417b(azh_.f2608v, 4096)) {
            this.f2604r = azh_.f2604r;
        }
        if (azh.m4417b(azh_.f2608v, 8192)) {
            this.f2600n = azh_.f2600n;
        }
        if (azh.m4417b(azh_.f2608v, 16384)) {
            this.f2601o = azh_.f2601o;
        }
        if (azh.m4417b(azh_.f2608v, 32768)) {
            this.f2606t = azh_.f2606t;
        }
        if (azh.m4417b(azh_.f2608v, 65536)) {
            this.f2599m = azh_.f2599m;
        }
        if (azh.m4417b(azh_.f2608v, 131072)) {
            this.f2598l = azh_.f2598l;
        }
        if (azh.m4417b(azh_.f2608v, 2048)) {
            this.f2603q.putAll(azh_.f2603q);
        }
        if (!this.f2599m) {
            this.f2603q.clear();
            this.f2608v &= -2049;
            this.f2598l = false;
            this.f2608v &= -131073;
        }
        this.f2608v |= azh_.f2608v;
        this.f2602p.m3529a(azh_.f2602p);
        return m4418d();
    }

    public final CHILD m4437c() {
        if (!this.f2605s || this.f2609w) {
            this.f2609w = true;
            this.f2605s = true;
            return this;
        }
        throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
    }

    private CHILD m4418d() {
        if (!this.f2605s) {
            return this;
        }
        throw new IllegalStateException("You cannot modify locked RequestOptions, consider clone()");
    }

    public boolean m4433a(int i) {
        return azh.m4417b(this.f2608v, i);
    }

    private static boolean m4417b(int i, int i2) {
        return (i & i2) != 0;
    }
}

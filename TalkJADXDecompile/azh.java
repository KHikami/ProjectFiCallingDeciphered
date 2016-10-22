import android.content.Context;
import android.content.res.Resources.Theme;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.util.HashMap;
import java.util.Map;

public class azh<CHILD extends azh<CHILD>> implements Cloneable {
    float a;
    apq b;
    public amq c;
    Drawable d;
    int e;
    Drawable f;
    int g;
    boolean h;
    public int i;
    public int j;
    anv k;
    boolean l;
    public boolean m;
    Drawable n;
    int o;
    public anz p;
    Map<Class<?>, aoc<?>> q;
    Class<?> r;
    public boolean s;
    Theme t;
    boolean u;
    private int v;
    private boolean w;

    public azh() {
        this.a = 1.0f;
        this.b = apq.e;
        this.c = amq.NORMAL;
        this.h = true;
        this.i = -1;
        this.j = -1;
        this.k = bae.b;
        this.m = true;
        this.p = new anz();
        this.q = new HashMap();
        this.r = Object.class;
    }

    public /* synthetic */ Object clone() {
        return a();
    }

    public final CHILD a(float f) {
        while (this.w) {
            this = a();
        }
        if (f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.a = f;
        this.v |= 2;
        return d();
    }

    public final CHILD a(apq apq) {
        while (this.w) {
            this = a();
        }
        this.b = (apq) gwb.I((Object) apq);
        this.v |= 4;
        return d();
    }

    public final CHILD a(amq amq) {
        while (this.w) {
            this = a();
        }
        this.c = (amq) gwb.I((Object) amq);
        this.v |= 8;
        return d();
    }

    public final CHILD a(boolean z) {
        while (this.w) {
            this = a();
        }
        this.h = false;
        this.v |= 256;
        return d();
    }

    public final CHILD a(int i, int i2) {
        while (this.w) {
            this = a();
        }
        this.j = i;
        this.i = i2;
        this.v |= 512;
        return d();
    }

    public final CHILD a(anv anv) {
        while (this.w) {
            this = a();
        }
        this.k = (anv) gwb.I((Object) anv);
        this.v |= 1024;
        return d();
    }

    public final CHILD a() {
        try {
            azh azh = (azh) super.clone();
            azh.p = new anz();
            azh.p.a(this.p);
            azh.q = new HashMap();
            azh.q.putAll(this.q);
            azh.s = false;
            azh.w = false;
            return azh;
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public final <T> CHILD a(anw<T> anw_T, T t) {
        while (this.w) {
            this = a();
        }
        gwb.I((Object) anw_T);
        gwb.I((Object) t);
        this.p.a(anw_T, t);
        return d();
    }

    public final CHILD a(Class<?> cls) {
        while (this.w) {
            this = a();
        }
        this.r = (Class) gwb.I((Object) cls);
        this.v |= 4096;
        return d();
    }

    public CHILD a(anr anr) {
        return a(awn.a, (anr) gwb.I((Object) anr));
    }

    public CHILD a(awf awf) {
        return a(awn.b, (awf) gwb.I((Object) awf));
    }

    public CHILD a(Context context) {
        return a(context, awf.b, new awc(context));
    }

    public CHILD b(Context context) {
        return a(context, awf.a, new awq(context));
    }

    public CHILD c(Context context) {
        return b(context, awf.a, new awq(context));
    }

    public CHILD d(Context context) {
        return a(context, awf.e, new awd(context));
    }

    public CHILD e(Context context) {
        return b(context, awf.e, new awd(context));
    }

    private CHILD a(Context context, awf awf, aoc<Bitmap> aoc_android_graphics_Bitmap) {
        while (this.w) {
            this = a();
        }
        a(awf);
        return b(context, (aoc) aoc_android_graphics_Bitmap);
    }

    private CHILD b(Context context, awf awf, aoc<Bitmap> aoc_android_graphics_Bitmap) {
        while (this.w) {
            this = a();
        }
        a(awf);
        return a(context, (aoc) aoc_android_graphics_Bitmap);
    }

    public CHILD a(Context context, aoc<Bitmap> aoc_android_graphics_Bitmap) {
        if (this.w) {
            return a().a(context, (aoc) aoc_android_graphics_Bitmap);
        }
        b(context, (aoc) aoc_android_graphics_Bitmap);
        this.l = true;
        this.v |= 131072;
        return d();
    }

    public CHILD b(Context context, aoc<Bitmap> aoc_android_graphics_Bitmap) {
        if (this.w) {
            return a().b(context, (aoc) aoc_android_graphics_Bitmap);
        }
        a(Bitmap.class, (aoc) aoc_android_graphics_Bitmap);
        a(BitmapDrawable.class, new avx(context, aoc_android_graphics_Bitmap));
        a(axo.class, new axr(context, (aoc) aoc_android_graphics_Bitmap));
        return d();
    }

    private <T> CHILD a(Class<T> cls, aoc<T> aoc_T) {
        while (this.w) {
            this = a();
        }
        gwb.I((Object) cls);
        gwb.I((Object) aoc_T);
        this.q.put(cls, aoc_T);
        this.v |= 2048;
        this.m = true;
        this.v |= 65536;
        return d();
    }

    public final CHILD b() {
        while (this.w) {
            this = a();
        }
        a(axl.a, Boolean.valueOf(true));
        a(axy.a, Boolean.valueOf(true));
        return d();
    }

    public final CHILD a(azh<?> azh_) {
        while (this.w) {
            this = a();
        }
        if (b(azh_.v, 2)) {
            this.a = azh_.a;
        }
        if (b(azh_.v, 262144)) {
            this.u = azh_.u;
        }
        if (b(azh_.v, 4)) {
            this.b = azh_.b;
        }
        if (b(azh_.v, 8)) {
            this.c = azh_.c;
        }
        if (b(azh_.v, 16)) {
            this.d = azh_.d;
        }
        if (b(azh_.v, 32)) {
            this.e = azh_.e;
        }
        if (b(azh_.v, 64)) {
            this.f = azh_.f;
        }
        if (b(azh_.v, 128)) {
            this.g = azh_.g;
        }
        if (b(azh_.v, 256)) {
            this.h = azh_.h;
        }
        if (b(azh_.v, 512)) {
            this.j = azh_.j;
            this.i = azh_.i;
        }
        if (b(azh_.v, 1024)) {
            this.k = azh_.k;
        }
        if (b(azh_.v, 4096)) {
            this.r = azh_.r;
        }
        if (b(azh_.v, 8192)) {
            this.n = azh_.n;
        }
        if (b(azh_.v, 16384)) {
            this.o = azh_.o;
        }
        if (b(azh_.v, 32768)) {
            this.t = azh_.t;
        }
        if (b(azh_.v, 65536)) {
            this.m = azh_.m;
        }
        if (b(azh_.v, 131072)) {
            this.l = azh_.l;
        }
        if (b(azh_.v, 2048)) {
            this.q.putAll(azh_.q);
        }
        if (!this.m) {
            this.q.clear();
            this.v &= -2049;
            this.l = false;
            this.v &= -131073;
        }
        this.v |= azh_.v;
        this.p.a(azh_.p);
        return d();
    }

    public final CHILD c() {
        if (!this.s || this.w) {
            this.w = true;
            this.s = true;
            return this;
        }
        throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
    }

    private CHILD d() {
        if (!this.s) {
            return this;
        }
        throw new IllegalStateException("You cannot modify locked RequestOptions, consider clone()");
    }

    public boolean a(int i) {
        return b(this.v, i);
    }

    private static boolean b(int i, int i2) {
        return (i & i2) != 0;
    }
}

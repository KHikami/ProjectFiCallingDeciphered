import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

final class axs {
    final amu a;
    private final ani b;
    private final Handler c;
    private final Context d;
    private final List<axu> e;
    private final ard f;
    private boolean g;
    private boolean h;
    private ams<Bitmap> i;
    private axt j;
    private boolean k;
    private axt l;
    private Bitmap m;
    private aoc<Bitmap> n;

    public axs(ami ami, ani ani, int i, int i2, aoc<Bitmap> aoc_android_graphics_Bitmap, Bitmap bitmap) {
        this(ami.c(), ami.a(), ami.b(ami.c()), ani, null, ami.b(ami.c()).g().a(((azl) azl.b(apq.b).a(true)).a(i, i2)), aoc_android_graphics_Bitmap, bitmap);
    }

    private axs(Context context, ard ard, amu amu, ani ani, Handler handler, ams<Bitmap> ams_android_graphics_Bitmap, aoc<Bitmap> aoc_android_graphics_Bitmap, Bitmap bitmap) {
        this.e = new ArrayList();
        this.g = false;
        this.h = false;
        this.a = amu;
        Handler handler2 = new Handler(Looper.getMainLooper(), new axv(this));
        this.d = context;
        this.f = ard;
        this.c = handler2;
        this.i = ams_android_graphics_Bitmap;
        this.b = ani;
        a(aoc_android_graphics_Bitmap, bitmap);
    }

    void a(aoc<Bitmap> aoc_android_graphics_Bitmap, Bitmap bitmap) {
        this.n = (aoc) gwb.I((Object) aoc_android_graphics_Bitmap);
        this.m = (Bitmap) gwb.I((Object) bitmap);
        this.i = this.i.a(new azl().a(this.d, (aoc) aoc_android_graphics_Bitmap));
    }

    Bitmap a() {
        return this.m;
    }

    void a(axu axu) {
        if (this.k) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        boolean isEmpty = this.e.isEmpty();
        if (this.e.contains(axu)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        this.e.add(axu);
        if (isEmpty && !this.g) {
            this.g = true;
            this.k = false;
            j();
        }
    }

    void b(axu axu) {
        this.e.remove(axu);
        if (this.e.isEmpty()) {
            this.g = false;
        }
    }

    int b() {
        return i().getWidth();
    }

    int c() {
        return i().getHeight();
    }

    int d() {
        return this.b.f() + baq.a(i().getWidth(), i().getHeight(), i().getConfig());
    }

    int e() {
        if (this.j != null) {
            return this.j.a;
        }
        return -1;
    }

    ByteBuffer f() {
        return this.b.a().asReadOnlyBuffer();
    }

    int g() {
        return this.b.d();
    }

    void h() {
        this.e.clear();
        k();
        this.g = false;
        if (this.j != null) {
            this.a.a(this.j);
            this.j = null;
        }
        if (this.l != null) {
            this.a.a(this.l);
            this.l = null;
        }
        this.b.h();
        this.k = true;
    }

    Bitmap i() {
        return this.j != null ? this.j.a() : this.m;
    }

    private void j() {
        if (this.g && !this.h) {
            this.h = true;
            long c = ((long) this.b.c()) + SystemClock.uptimeMillis();
            this.b.b();
            this.l = new axt(this.c, this.b.e(), c);
            this.i.a().a(azl.b(new axw())).a(this.b).a(this.l);
        }
    }

    private void k() {
        if (this.m != null) {
            this.f.a(this.m);
            this.m = null;
        }
    }

    void a(axt axt) {
        if (this.k) {
            this.c.obtainMessage(2, axt).sendToTarget();
            return;
        }
        if (axt.a() != null) {
            k();
            axt axt2 = this.j;
            this.j = axt;
            for (int size = this.e.size() - 1; size >= 0; size--) {
                ((axu) this.e.get(size)).f();
            }
            if (axt2 != null) {
                this.c.obtainMessage(2, axt2).sendToTarget();
            }
        }
        this.h = false;
        j();
    }
}

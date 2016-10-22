import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import java.io.File;
import java.util.concurrent.atomic.AtomicInteger;

final class dfd implements dex, kcq {
    static final gma a;
    private static AtomicInteger c;
    Context b;
    private amu d;
    private boolean e;
    private jca f;
    private final Handler g;
    private final Runnable h;

    static {
        a = gma.a("GlideLoaderManagerImpl");
        c = new AtomicInteger(0);
    }

    private azk<Drawable> a(String str) {
        return new dff(this, str);
    }

    dfd(Context context, kbu kbu) {
        this.g = new Handler(Looper.getMainLooper());
        this.h = new dfe(this);
        kbu.a((kcq) this);
        this.b = context;
        a(context);
    }

    public dfd(Context context) {
        this.g = new Handler(Looper.getMainLooper());
        this.h = new dfe(this);
        a(context);
    }

    public void a(Uri uri, ImageView imageView, baf baf, azl azl) {
        if (baf != null) {
            azl.a((anv) baf);
        }
        a(uri, imageView, azl, null);
    }

    public void a(String str, ImageView imageView, azl azl, azk<Drawable> azk_android_graphics_drawable_Drawable) {
        gma gma = a;
        String valueOf = String.valueOf("loadImageWithGlide_");
        this.d.h().a((azh) azl).a(str).a(a(gma.b(new StringBuilder(String.valueOf(valueOf).length() + 11).append(valueOf).append(c.incrementAndGet()).toString()))).a(imageView);
    }

    private void a(Uri uri, ImageView imageView, azl azl, azk<Drawable> azk_android_graphics_drawable_Drawable) {
        gma gma = a;
        String valueOf = String.valueOf("loadImageWithGlide_");
        this.d.h().a((azh) azl).a(uri).a(a(gma.b(new StringBuilder(String.valueOf(valueOf).length() + 11).append(valueOf).append(c.incrementAndGet()).toString()))).a(imageView);
    }

    public void a(String str, azx<Bitmap> azx_android_graphics_Bitmap, azl azl, iic iic) {
        a(str, azl, iic).a((azx) azx_android_graphics_Bitmap);
    }

    public ams<Bitmap> a(String str, azl azl, iic iic) {
        int a;
        String b = b(str);
        if (this.f != null) {
            a = this.f.a();
        } else {
            a = -1;
        }
        if (a(b, iic)) {
            return this.d.g().a((azh) azl).a(new iht(b, iic, a));
        }
        return this.d.g().a((azh) azl).a(b);
    }

    public void b(String str, azx<Drawable> azx_android_graphics_drawable_Drawable, azl azl, iic iic) {
        b(str, azl, iic).a((azx) azx_android_graphics_drawable_Drawable);
    }

    public ams<Drawable> b(String str, azl azl, iic iic) {
        int a;
        String b = b(str);
        if (this.f != null) {
            a = this.f.a();
        } else {
            a = -1;
        }
        if (a(b, iic)) {
            return this.d.h().a((azh) azl).a(new iht(b, iic, a));
        }
        return this.d.h().a((azh) azl).a(b);
    }

    public void a(String str, azx<File> azx_java_io_File, azl azl) {
        this.d.i().a((azh) azl).a(str).a((azx) azx_java_io_File);
    }

    private static String b(String str) {
        CharSequence scheme = Uri.parse(str).getScheme();
        if (TextUtils.equals(scheme, "content") || scheme != null) {
            return str;
        }
        String str2 = "https:";
        String valueOf = String.valueOf(str);
        return valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2);
    }

    private static boolean a(String str, iic iic) {
        return str.startsWith("https:") && jpo.a(str) && iic != null;
    }

    public void a(View view) {
        this.d.a(view);
    }

    public void a(azx<Drawable> azx_android_graphics_drawable_Drawable) {
        this.d.a((azx) azx_android_graphics_drawable_Drawable);
    }

    public void a() {
        this.d.b();
        synchronized (this.g) {
            this.g.removeCallbacks(this.h);
            this.g.postDelayed(this.h, 20000);
        }
    }

    public void b() {
        this.d.c();
    }

    public boolean c() {
        return this.e;
    }

    private void a(Context context) {
        this.d = (amu) jyn.a(context, amu.class);
        this.d.c();
        this.f = (jca) jyn.b(context, jca.class);
        this.e = ((dew) jyn.b(context, dew.class)) != null;
        if (!this.e) {
            this.e = gwb.a(context, "babel_glide_enabled", false);
        }
        this.b = context;
    }
}

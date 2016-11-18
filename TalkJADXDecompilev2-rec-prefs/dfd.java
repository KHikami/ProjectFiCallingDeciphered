package p000;

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
    static final gma f9593a = gma.m18073a("GlideLoaderManagerImpl");
    private static AtomicInteger f9594c = new AtomicInteger(0);
    Context f9595b;
    private amu f9596d;
    private boolean f9597e;
    private jca f9598f;
    private final Handler f9599g = new Handler(Looper.getMainLooper());
    private final Runnable f9600h = new dfe(this);

    private azk<Drawable> m11570a(String str) {
        return new dff(this, str);
    }

    dfd(Context context, kbu kbu) {
        kbu.m25514a((kcq) this);
        this.f9595b = context;
        m11571a(context);
    }

    public dfd(Context context) {
        m11571a(context);
    }

    public void mo1502a(Uri uri, ImageView imageView, baf baf, azl azl) {
        if (baf != null) {
            azl.m4426a((anv) baf);
        }
        m11572a(uri, imageView, azl, null);
    }

    public void mo1505a(String str, ImageView imageView, azl azl, azk<Drawable> azk_android_graphics_drawable_Drawable) {
        gma gma = f9593a;
        String valueOf = String.valueOf("loadImageWithGlide_");
        this.f9596d.m2982h().m2964a((azh) azl).m2967a(str).m2965a(m11570a(gma.m18078b(new StringBuilder(String.valueOf(valueOf).length() + 11).append(valueOf).append(f9594c.incrementAndGet()).toString()))).m2968a(imageView);
    }

    private void m11572a(Uri uri, ImageView imageView, azl azl, azk<Drawable> azk_android_graphics_drawable_Drawable) {
        gma gma = f9593a;
        String valueOf = String.valueOf("loadImageWithGlide_");
        this.f9596d.m2982h().m2964a((azh) azl).m2963a(uri).m2965a(m11570a(gma.m18078b(new StringBuilder(String.valueOf(valueOf).length() + 11).append(valueOf).append(f9594c.incrementAndGet()).toString()))).m2968a(imageView);
    }

    public void mo1507a(String str, azx<Bitmap> azx_android_graphics_Bitmap, azl azl, iic iic) {
        mo1500a(str, azl, iic).m2969a((azx) azx_android_graphics_Bitmap);
    }

    public ams<Bitmap> mo1500a(String str, azl azl, iic iic) {
        int a;
        String b = dfd.m11574b(str);
        if (this.f9598f != null) {
            a = this.f9598f.mo2317a();
        } else {
            a = -1;
        }
        if (dfd.m11573a(b, iic)) {
            return this.f9596d.m2981g().m2964a((azh) azl).m2966a(new iht(b, iic, a));
        }
        return this.f9596d.m2981g().m2964a((azh) azl).m2967a(b);
    }

    public void mo1510b(String str, azx<Drawable> azx_android_graphics_drawable_Drawable, azl azl, iic iic) {
        mo1508b(str, azl, iic).m2969a((azx) azx_android_graphics_drawable_Drawable);
    }

    public ams<Drawable> mo1508b(String str, azl azl, iic iic) {
        int a;
        String b = dfd.m11574b(str);
        if (this.f9598f != null) {
            a = this.f9598f.mo2317a();
        } else {
            a = -1;
        }
        if (dfd.m11573a(b, iic)) {
            return this.f9596d.m2982h().m2964a((azh) azl).m2966a(new iht(b, iic, a));
        }
        return this.f9596d.m2982h().m2964a((azh) azl).m2967a(b);
    }

    public void mo1506a(String str, azx<File> azx_java_io_File, azl azl) {
        this.f9596d.m2983i().m2964a((azh) azl).m2967a(str).m2969a((azx) azx_java_io_File);
    }

    private static String m11574b(String str) {
        CharSequence scheme = Uri.parse(str).getScheme();
        if (TextUtils.equals(scheme, "content") || scheme != null) {
            return str;
        }
        String str2 = "https:";
        String valueOf = String.valueOf(str);
        return valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2);
    }

    private static boolean m11573a(String str, iic iic) {
        return str.startsWith("https:") && jpo.m24941a(str) && iic != null;
    }

    public void mo1503a(View view) {
        this.f9596d.m2973a(view);
    }

    public void mo1504a(azx<Drawable> azx_android_graphics_drawable_Drawable) {
        this.f9596d.m2974a((azx) azx_android_graphics_drawable_Drawable);
    }

    public void mo1501a() {
        this.f9596d.m2976b();
        synchronized (this.f9599g) {
            this.f9599g.removeCallbacks(this.f9600h);
            this.f9599g.postDelayed(this.f9600h, 20000);
        }
    }

    public void mo1509b() {
        this.f9596d.m2978c();
    }

    public boolean mo1511c() {
        return this.f9597e;
    }

    private void m11571a(Context context) {
        this.f9596d = (amu) jyn.m25426a(context, amu.class);
        this.f9596d.m2978c();
        this.f9598f = (jca) jyn.m25433b(context, jca.class);
        this.f9597e = ((dew) jyn.m25433b(context, dew.class)) != null;
        if (!this.f9597e) {
            this.f9597e = gwb.m1906a(context, "babel_glide_enabled", false);
        }
        this.f9595b = context;
    }
}

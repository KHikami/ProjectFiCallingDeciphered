package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;

public class giz implements iip {
    public static final boolean f15334b = false;
    private static final iio f15335e = iio.f17742a;
    public final Resources f15336a = gwb.m1400H().getResources();
    public final String f15337c;
    public ld<Bitmap, Exception> f15338d;

    static {
        kae kae = glk.f15573t;
    }

    public static boolean m17780a(Context context) {
        return gwb.m1906a(context, "babel_enable_bitmap_pool", true);
    }

    protected giz(String str) {
        this.f15337c = str;
        if (f15334b) {
            this.f15338d = new ld(30);
        }
    }

    public void mo2283h() {
        mo2287a();
    }

    public void mo2282b(int i) {
        if (i != 5) {
            mo2287a();
        }
    }

    public Bitmap mo2285a(int i, Options options, int i2, int i3, gja gja) {
        Bitmap bitmap = null;
        try {
            bitmap = BitmapFactory.decodeResource(this.f15336a, i, options);
        } catch (IllegalArgumentException e) {
            glk.m17981d("Babel", "Decoding resource " + i + " failed.", new Object[0]);
        } catch (OutOfMemoryError e2) {
            glk.m17981d("Babel", "Oom decoding resource " + i, new Object[0]);
            f15335e.m21892a();
        }
        return bitmap;
    }

    public Bitmap mo2286a(byte[] bArr, Options options, int i, int i2, gja gja) {
        Bitmap bitmap = null;
        try {
            bitmap = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } catch (IllegalArgumentException e) {
            glk.m17981d("Babel", "Decoding byte array failed.", new Object[0]);
        }
        return bitmap;
    }

    public Bitmap mo2284a(int i, int i2, gja gja) {
        if (gja != null) {
            Bitmap a = gja.mo2281a(i, i2);
            if (a != null) {
                a.eraseColor(0);
                return a;
            }
        }
        return Bitmap.createBitmap(i, i2, Config.ARGB_8888);
    }

    public void mo2288a(Bitmap bitmap) {
        iil.m21879b("Expected condition to be false", blc.m5743a(bitmap));
        if (bitmap != null) {
            m17789c(bitmap);
        } else {
            glk.m17978c("Babel", "BitmapPool receiving null bitmap", new Exception());
        }
    }

    public void mo2287a() {
    }

    public boolean mo2289b(int i, int i2) {
        return true;
    }

    boolean mo2290b(Bitmap bitmap) {
        return false;
    }

    protected final void m17789c(Bitmap bitmap) {
        bitmap.recycle();
        if (f15334b) {
            this.f15338d.m1201a((Object) bitmap, new Exception());
        }
    }

    public static giz m17779a(Context context, int i, int i2, int i3, int i4, String str) {
        iip gjb;
        if (gwb.m1906a(context, "babel_enable_bitmap_pool", true)) {
            gjb = new gjb(i, i2, i3, i4, str);
        } else {
            gjb = new giz(str);
        }
        f15335e.m21894a(gjb);
        return gjb;
    }

    public static Options m17778a(int i, int i2) {
        Options options = new Options();
        options.inScaled = false;
        options.inDensity = i;
        options.inTargetDensity = i2;
        options.inSampleSize = 1;
        options.inJustDecodeBounds = false;
        options.inMutable = true;
        return options;
    }
}

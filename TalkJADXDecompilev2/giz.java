package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;

public class giz implements iip {
    public static final boolean b = false;
    private static final iio e = iio.a;
    public final Resources a = gwb.H().getResources();
    public final String c;
    public ld<Bitmap, Exception> d;

    static {
        kae kae = glk.t;
    }

    public static boolean a(Context context) {
        return gwb.a(context, "babel_enable_bitmap_pool", true);
    }

    protected giz(String str) {
        this.c = str;
        if (b) {
            this.d = new ld(30);
        }
    }

    public void h() {
        a();
    }

    public void b(int i) {
        if (i != 5) {
            a();
        }
    }

    public Bitmap a(int i, Options options, int i2, int i3, gja gja) {
        Bitmap bitmap = null;
        try {
            bitmap = BitmapFactory.decodeResource(this.a, i, options);
        } catch (IllegalArgumentException e) {
            glk.d("Babel", "Decoding resource " + i + " failed.", new Object[0]);
        } catch (OutOfMemoryError e2) {
            glk.d("Babel", "Oom decoding resource " + i, new Object[0]);
            e.a();
        }
        return bitmap;
    }

    public Bitmap a(byte[] bArr, Options options, int i, int i2, gja gja) {
        Bitmap bitmap = null;
        try {
            bitmap = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } catch (IllegalArgumentException e) {
            glk.d("Babel", "Decoding byte array failed.", new Object[0]);
        }
        return bitmap;
    }

    public Bitmap a(int i, int i2, gja gja) {
        if (gja != null) {
            Bitmap a = gja.a(i, i2);
            if (a != null) {
                a.eraseColor(0);
                return a;
            }
        }
        return Bitmap.createBitmap(i, i2, Config.ARGB_8888);
    }

    public void a(Bitmap bitmap) {
        iil.b("Expected condition to be false", blc.a(bitmap));
        if (bitmap != null) {
            c(bitmap);
        } else {
            glk.c("Babel", "BitmapPool receiving null bitmap", new Exception());
        }
    }

    public void a() {
    }

    public boolean b(int i, int i2) {
        return true;
    }

    boolean b(Bitmap bitmap) {
        return false;
    }

    protected final void c(Bitmap bitmap) {
        bitmap.recycle();
        if (b) {
            this.d.a((Object) bitmap, new Exception());
        }
    }

    public static giz a(Context context, int i, int i2, int i3, int i4, String str) {
        iip gjb;
        if (gwb.a(context, "babel_enable_bitmap_pool", true)) {
            gjb = new gjb(i, i2, i3, i4, str);
        } else {
            gjb = new giz(str);
        }
        e.a(gjb);
        return gjb;
    }

    public static Options a(int i, int i2) {
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

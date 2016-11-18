package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.security.MessageDigest;

public final class dez extends awa {
    private static final Paint f9584b = new Paint(6);
    private static final byte[] f9585c = "com.google.android.apps.hangouts.glide.impl.FitSizeTransform".getBytes(a);
    private final int f9586d;
    private final int f9587e;

    public dez(Context context, int i, int i2) {
        super(context);
        this.f9586d = i;
        this.f9587e = i2;
    }

    protected Bitmap mo397a(ard ard, Bitmap bitmap, int i, int i2) {
        if (m11563a(bitmap.getWidth()) && m11563a(bitmap.getHeight())) {
            return bitmap;
        }
        float f;
        int i3;
        int i4;
        Config config;
        Bitmap createBitmap;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float max = (float) Math.max(width, height);
        float min = (float) Math.min(width, height);
        if (max / min >= ((float) (this.f9587e / this.f9586d))) {
            f = (float) this.f9586d;
            min = (float) this.f9587e;
        } else if (min < ((float) this.f9586d)) {
            f = (float) this.f9586d;
            min = (max * ((float) this.f9586d)) / min;
        } else if (max > ((float) this.f9587e)) {
            f = (min * ((float) this.f9587e)) / max;
            min = (float) this.f9587e;
        } else {
            f = min;
            min = max;
        }
        if (width > height) {
            i3 = (int) min;
            i4 = (int) f;
        } else {
            i4 = (int) min;
            i3 = (int) f;
        }
        if (bitmap.getConfig() != null) {
            config = bitmap.getConfig();
        } else {
            config = Config.ARGB_8888;
        }
        Bitmap a = ard.mo358a(i3, i4, config);
        if (a == null) {
            createBitmap = Bitmap.createBitmap(i3, i4, config);
        } else {
            createBitmap = a;
        }
        axa.m4244a(bitmap, createBitmap);
        if (glk.m17973a("Babel_FitSizeTransform", 2)) {
            new StringBuilder(32).append("request: ").append(i3).append("x").append(i4);
            width = bitmap.getWidth();
            new StringBuilder(32).append("toFit:   ").append(width).append("x").append(bitmap.getHeight());
            width = createBitmap.getWidth();
            new StringBuilder(32).append("toReuse: ").append(width).append("x").append(createBitmap.getHeight());
        }
        max = ((float) i3) / ((float) bitmap.getWidth());
        min = ((float) i4) / ((float) bitmap.getHeight());
        Matrix matrix = new Matrix();
        matrix.setScale(max, min);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawBitmap(bitmap, matrix, f9584b);
        canvas.setBitmap(null);
        return createBitmap;
    }

    public void mo308a(MessageDigest messageDigest) {
        messageDigest.update(f9585c);
    }

    public int hashCode() {
        return ("com.google.android.apps.hangouts.glide.impl.FitSizeTransform".hashCode() + Integer.toString(this.f9586d).hashCode()) + Integer.toString(this.f9587e).hashCode();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof dez)) {
            return false;
        }
        dez dez = (dez) obj;
        if (dez.f9586d == this.f9586d && dez.f9587e == this.f9587e) {
            return true;
        }
        return false;
    }

    private boolean m11563a(int i) {
        return i >= this.f9586d && i <= this.f9587e;
    }
}

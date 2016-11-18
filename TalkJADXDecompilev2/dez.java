package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.security.MessageDigest;

public final class dez extends awa {
    private static final Paint b = new Paint(6);
    private static final byte[] c = "com.google.android.apps.hangouts.glide.impl.FitSizeTransform".getBytes(a);
    private final int d;
    private final int e;

    public dez(Context context, int i, int i2) {
        super(context);
        this.d = i;
        this.e = i2;
    }

    protected Bitmap a(ard ard, Bitmap bitmap, int i, int i2) {
        if (a(bitmap.getWidth()) && a(bitmap.getHeight())) {
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
        if (max / min >= ((float) (this.e / this.d))) {
            f = (float) this.d;
            min = (float) this.e;
        } else if (min < ((float) this.d)) {
            f = (float) this.d;
            min = (max * ((float) this.d)) / min;
        } else if (max > ((float) this.e)) {
            f = (min * ((float) this.e)) / max;
            min = (float) this.e;
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
        Bitmap a = ard.a(i3, i4, config);
        if (a == null) {
            createBitmap = Bitmap.createBitmap(i3, i4, config);
        } else {
            createBitmap = a;
        }
        axa.a(bitmap, createBitmap);
        if (glk.a("Babel_FitSizeTransform", 2)) {
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
        canvas.drawBitmap(bitmap, matrix, b);
        canvas.setBitmap(null);
        return createBitmap;
    }

    public void a(MessageDigest messageDigest) {
        messageDigest.update(c);
    }

    public int hashCode() {
        return ("com.google.android.apps.hangouts.glide.impl.FitSizeTransform".hashCode() + Integer.toString(this.d).hashCode()) + Integer.toString(this.e).hashCode();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof dez)) {
            return false;
        }
        dez dez = (dez) obj;
        if (dez.d == this.d && dez.e == this.e) {
            return true;
        }
        return false;
    }

    private boolean a(int i) {
        return i >= this.d && i <= this.e;
    }
}

package p000;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import android.os.Build.VERSION;
import android.util.Log;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public final class axa {
    static final Lock f2465a;
    private static final Paint f2466b = new Paint(6);
    private static final Paint f2467c = new Paint(7);
    private static final Paint f2468d;

    static {
        Lock reentrantLock;
        if ("XT1097".equals(Build.MODEL) && VERSION.SDK_INT == 22) {
            reentrantLock = new ReentrantLock();
        } else {
            reentrantLock = new axb();
        }
        f2465a = reentrantLock;
        Paint paint = new Paint(7);
        f2468d = paint;
        paint.setXfermode(new PorterDuffXfermode(Mode.SRC_IN));
    }

    public static Bitmap m4243a(ard ard, Bitmap bitmap, int i, int i2) {
        float f = 0.0f;
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        float height;
        float width;
        Matrix matrix = new Matrix();
        if (bitmap.getWidth() * i2 > bitmap.getHeight() * i) {
            height = ((float) i2) / ((float) bitmap.getHeight());
            width = (((float) i) - (((float) bitmap.getWidth()) * height)) * 0.5f;
        } else {
            height = ((float) i) / ((float) bitmap.getWidth());
            width = 0.0f;
            f = (((float) i2) - (((float) bitmap.getHeight()) * height)) * 0.5f;
        }
        matrix.setScale(height, height);
        matrix.postTranslate((float) ((int) (width + 0.5f)), (float) ((int) (f + 0.5f)));
        Bitmap a = ard.mo358a(i, i2, axa.m4241a(bitmap));
        axa.m4244a(bitmap, a);
        axa.m4245a(bitmap, a, matrix);
        return a;
    }

    public static Bitmap m4247b(ard ard, Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        float min = Math.min(((float) i) / ((float) bitmap.getWidth()), ((float) i2) / ((float) bitmap.getHeight()));
        int width = (int) (((float) bitmap.getWidth()) * min);
        int height = (int) (((float) bitmap.getHeight()) * min);
        if (bitmap.getWidth() == width && bitmap.getHeight() == height) {
            return bitmap;
        }
        Bitmap a = ard.mo358a(width, height, axa.m4241a(bitmap));
        axa.m4244a(bitmap, a);
        if (Log.isLoggable("TransformationUtils", 2)) {
            new StringBuilder(32).append("request: ").append(i).append("x").append(i2);
            height = bitmap.getWidth();
            new StringBuilder(32).append("toFit:   ").append(height).append("x").append(bitmap.getHeight());
            height = a.getWidth();
            new StringBuilder(32).append("toReuse: ").append(height).append("x").append(a.getHeight());
            new StringBuilder(25).append("minPct:   ").append(min);
        }
        Matrix matrix = new Matrix();
        matrix.setScale(min, min);
        axa.m4245a(bitmap, a, matrix);
        return a;
    }

    public static Bitmap m4248c(ard ard, Bitmap bitmap, int i, int i2) {
        return (bitmap.getWidth() > i || bitmap.getHeight() > i2) ? axa.m4247b(ard, bitmap, i, i2) : bitmap;
    }

    public static void m4244a(Bitmap bitmap, Bitmap bitmap2) {
        axa.m4246a(bitmap2, bitmap.hasAlpha());
    }

    private static void m4246a(Bitmap bitmap, boolean z) {
        if (VERSION.SDK_INT >= 12 && bitmap != null) {
            bitmap.setHasAlpha(z);
        }
    }

    public static int m4240a(int i) {
        switch (i) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    public static Bitmap m4242a(ard ard, Bitmap bitmap, int i) {
        Matrix matrix = new Matrix();
        switch (i) {
            case 2:
                matrix.setScale(-1.0f, 1.0f);
                break;
            case 3:
                matrix.setRotate(180.0f);
                break;
            case 4:
                matrix.setRotate(180.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 5:
                matrix.setRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 6:
                matrix.setRotate(90.0f);
                break;
            case 7:
                matrix.setRotate(-90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 8:
                matrix.setRotate(-90.0f);
                break;
        }
        if (matrix.isIdentity()) {
            return bitmap;
        }
        RectF rectF = new RectF(0.0f, 0.0f, (float) bitmap.getWidth(), (float) bitmap.getHeight());
        matrix.mapRect(rectF);
        Bitmap a = ard.mo358a(Math.round(rectF.width()), Math.round(rectF.height()), axa.m4241a(bitmap));
        matrix.postTranslate(-rectF.left, -rectF.top);
        axa.m4245a(bitmap, a, matrix);
        return a;
    }

    public static Bitmap m4249d(ard ard, Bitmap bitmap, int i, int i2) {
        Bitmap bitmap2;
        int min = Math.min(i, i2);
        float f = ((float) min) / 2.0f;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float max = Math.max(((float) min) / ((float) width), ((float) min) / ((float) height));
        float f2 = ((float) width) * max;
        float f3 = ((float) height) * max;
        max = (((float) min) - f2) / 2.0f;
        float f4 = (((float) min) - f3) / 2.0f;
        RectF rectF = new RectF(max, f4, f2 + max, f3 + f4);
        if (Config.ARGB_8888.equals(bitmap.getConfig())) {
            bitmap2 = bitmap;
        } else {
            bitmap2 = ard.mo358a(bitmap.getWidth(), bitmap.getHeight(), Config.ARGB_8888);
            new Canvas(bitmap2).drawBitmap(bitmap, 0.0f, 0.0f, null);
        }
        Bitmap a = ard.mo358a(min, min, Config.ARGB_8888);
        axa.m4246a(a, true);
        f2465a.lock();
        try {
            Canvas canvas = new Canvas(a);
            canvas.drawCircle(f, f, f, f2467c);
            canvas.drawBitmap(bitmap2, null, rectF, f2468d);
            canvas.setBitmap(null);
            if (!bitmap2.equals(bitmap)) {
                ard.mo361a(bitmap2);
            }
            return a;
        } finally {
            a = f2465a;
            a.unlock();
        }
    }

    private static Config m4241a(Bitmap bitmap) {
        return bitmap.getConfig() != null ? bitmap.getConfig() : Config.ARGB_8888;
    }

    private static void m4245a(Bitmap bitmap, Bitmap bitmap2, Matrix matrix) {
        f2465a.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, f2466b);
            canvas.setBitmap(null);
        } finally {
            f2465a.unlock();
        }
    }
}

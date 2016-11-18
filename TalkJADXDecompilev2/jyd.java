package defpackage;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.os.Build.VERSION;
import android.util.Log;

public final class jyd {
    private static final jjv<Paint> a = new jye();
    private static final jjv<Paint> b = new jye();

    public static Bitmap a(Bitmap bitmap) {
        long nanoTime = System.nanoTime();
        if (VERSION.SDK_INT >= 12) {
            bitmap.setHasAlpha(true);
        }
        if (!(bitmap.isMutable() && bitmap.hasAlpha())) {
            bitmap = bitmap.copy(Config.ARGB_8888, true);
        }
        Canvas canvas = new Canvas(bitmap);
        if (gwb.aI()) {
            jyd.a(canvas, (Paint) a.b());
        } else {
            Paint paint = (Paint) b.b();
            synchronized (paint) {
                jyd.a(canvas, paint);
            }
        }
        if (Log.isLoggable("BitmapShapeUtils", 3)) {
            new StringBuilder(43).append("Avatar rounding took ").append(System.nanoTime() - nanoTime).append("ns");
        }
        return bitmap;
    }

    public static Bitmap a(Bitmap bitmap, float f) {
        return jyd.a(bitmap, f, null);
    }

    public static Bitmap a(Bitmap bitmap, float f, Bitmap bitmap2) {
        if (bitmap == null) {
            return null;
        }
        if (bitmap2 == null || (bitmap2.getWidth() == bitmap.getWidth() && bitmap2.getHeight() == bitmap.getHeight() && bitmap2.isMutable())) {
            Bitmap createBitmap;
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            boolean z = bitmap2 != null;
            if (bitmap2 == null) {
                try {
                    createBitmap = Bitmap.createBitmap(width, height, Config.ARGB_8888);
                } catch (OutOfMemoryError e) {
                    createBitmap = bitmap2;
                }
            } else {
                if (VERSION.SDK_INT >= 12) {
                    bitmap2.setHasAlpha(true);
                }
                createBitmap = bitmap2;
            }
            if (createBitmap != null) {
                Shader bitmapShader = new BitmapShader(bitmap, TileMode.CLAMP, TileMode.CLAMP);
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                paint.setShader(bitmapShader);
                RectF rectF = new RectF(0.0f, 0.0f, (float) bitmap.getWidth(), (float) bitmap.getHeight());
                Canvas canvas = new Canvas(createBitmap);
                if (z) {
                    canvas.drawColor(0, Mode.CLEAR);
                }
                canvas.drawRoundRect(rectF, f, f, paint);
                return createBitmap;
            } else if (!Log.isLoggable("BitmapShapeUtils", 5)) {
                return null;
            } else {
                new StringBuilder(85).append("Failed to allocate a bitmap for roundedCornersBitmap of size: ").append(width).append("x").append(height);
                return null;
            }
        }
        boolean isMutable = bitmap2.isMutable();
        int width2 = bitmap2.getWidth();
        int height2 = bitmap2.getHeight();
        throw new IllegalArgumentException("Given bitmap cannot be reused; Invalid dimensions or immutable: mutable=" + isMutable + " forMask dimens=[" + width2 + "x" + height2 + " bitmap dimens=[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "]");
    }

    private static void a(Canvas canvas, Paint paint) {
        float min = ((float) Math.min(canvas.getWidth(), canvas.getHeight())) / 2.0f;
        float hypot = ((float) Math.hypot((double) canvas.getWidth(), (double) canvas.getHeight())) - min;
        paint.setStrokeWidth(hypot);
        canvas.drawCircle(((float) canvas.getWidth()) / 2.0f, ((float) canvas.getHeight()) / 2.0f, min + (hypot / 2.0f), paint);
    }
}

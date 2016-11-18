package p000;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Looper;
import android.util.Log;

public final class kdh {
    private static final Paint f21408a = new Paint(2);
    private static final Paint f21409b = new Paint(2);
    private static volatile Thread f21410c;

    public static Bitmap m25584a(Bitmap bitmap, int i, int i2, Bitmap bitmap2) {
        if (bitmap == null || i == 0 || i2 == 0) {
            return null;
        }
        if (Log.isLoggable("BitmapUtils", 3)) {
            int width = bitmap.getWidth();
            new StringBuilder(83).append("resizeAndCropBitmap: Input: ").append(width).append("x").append(bitmap.getHeight()).append(", output:").append(i).append("x").append(i2);
        }
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Bitmap createBitmap;
        if (bitmap2 == null) {
            createBitmap = Bitmap.createBitmap(i, i2, Config.ARGB_8888);
        } else {
            createBitmap = bitmap2;
        }
        if (createBitmap == null) {
            return null;
        }
        Canvas canvas = new Canvas(createBitmap);
        width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (bitmap.getWidth() * i2 > bitmap.getHeight() * i) {
            width = (bitmap.getHeight() * i) / i2;
        } else {
            height = (bitmap.getWidth() * i2) / i;
        }
        int width2 = (bitmap.getWidth() - width) / 2;
        int height2 = (bitmap.getHeight() - height) / 2;
        kdh.m25585a(canvas, bitmap, new Rect(width2, height2, width + width2, height + height2), new Rect(0, 0, i, i2));
        return createBitmap;
    }

    private static void m25585a(Canvas canvas, Bitmap bitmap, Rect rect, Rect rect2) {
        if (f21410c == null) {
            f21410c = Looper.getMainLooper().getThread();
        }
        if (Thread.currentThread() == f21410c) {
            canvas.drawBitmap(bitmap, rect, rect2, f21408a);
            return;
        }
        synchronized (f21409b) {
            canvas.drawBitmap(bitmap, rect, rect2, f21409b);
        }
    }

    public static Bitmap m25583a(Bitmap bitmap, int i, int i2) {
        if (bitmap == null) {
            return null;
        }
        if (Log.isLoggable("BitmapUtils", 3)) {
            int width = bitmap.getWidth();
            new StringBuilder(84).append("resizeToSquareBitmap: Input: ").append(width).append("x").append(bitmap.getHeight()).append(", output:").append(i).append("x").append(i);
        }
        Bitmap createBitmap = Bitmap.createBitmap(i, i, Config.ARGB_8888);
        if (createBitmap == null) {
            return null;
        }
        Canvas canvas = new Canvas(createBitmap);
        if (bitmap.getWidth() == i && bitmap.getHeight() == i) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, null);
        } else {
            kdh.m25585a(canvas, bitmap, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), new Rect(0, 0, i, i));
        }
        return createBitmap;
    }
}

package p000;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.os.Build.VERSION;
import android.os.SystemClock;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

final class jka implements jkh {
    private static final AtomicReference<byte[]> f20327a = new AtomicReference();
    private static final kad f20328b = new kad("debug.bitmap.reuse");

    jka() {
    }

    public Object mo3529a(jkj jkj, ByteBuffer byteBuffer) {
        Bitmap decodeStream;
        Options options = new Options();
        InputStream b = gwb.m1989b(byteBuffer);
        options.inTempStorage = (byte[]) f20327a.getAndSet(null);
        if (options.inTempStorage == null) {
            options.inTempStorage = new byte[16384];
        }
        options.inSampleSize = 1;
        if (VERSION.SDK_INT >= 11) {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeStream(b, null, options);
            options.inJustDecodeBounds = false;
            byteBuffer.rewind();
            if (options.outWidth > 0 && options.outHeight > 0 && (VERSION.SDK_INT >= 19 || "image/jpeg".equalsIgnoreCase(options.outMimeType) || "image/png".equalsIgnoreCase(options.outMimeType))) {
                options.inBitmap = jkj.f20096a.mo3537a(options.outWidth, options.outHeight);
            }
        }
        String str = options.outMimeType;
        long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
        try {
            decodeStream = BitmapFactory.decodeStream(b, null, options);
        } catch (Throwable e) {
            if (jkj.m24250p()) {
                jkj.m24236a("Failed to reuse bitmap", e);
            }
            byteBuffer.rewind();
            Bitmap bitmap = options.inBitmap;
            options.inBitmap = null;
            decodeStream = BitmapFactory.decodeStream(b, null, options);
        }
        byteBuffer.rewind();
        f20327a.set(options.inTempStorage);
        jkj.m24261a(currentThreadTimeMillis, options.outMimeType, byteBuffer.remaining(), options.outWidth, options.outHeight, decodeStream);
        return decodeStream;
    }
}

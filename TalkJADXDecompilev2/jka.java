package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.os.Build.VERSION;
import android.os.SystemClock;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

final class jka implements jkh {
    private static final AtomicReference<byte[]> a = new AtomicReference();
    private static final kad b = new kad("debug.bitmap.reuse");

    jka() {
    }

    public Object a(jkj jkj, ByteBuffer byteBuffer) {
        Bitmap decodeStream;
        Options options = new Options();
        InputStream b = gwb.b(byteBuffer);
        options.inTempStorage = (byte[]) a.getAndSet(null);
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
                options.inBitmap = jkj.a.a(options.outWidth, options.outHeight);
            }
        }
        String str = options.outMimeType;
        long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
        try {
            decodeStream = BitmapFactory.decodeStream(b, null, options);
        } catch (Throwable e) {
            if (jkj.p()) {
                jkj.a("Failed to reuse bitmap", e);
            }
            byteBuffer.rewind();
            Bitmap bitmap = options.inBitmap;
            options.inBitmap = null;
            decodeStream = BitmapFactory.decodeStream(b, null, options);
        }
        byteBuffer.rewind();
        a.set(options.inTempStorage);
        jkj.a(currentThreadTimeMillis, options.outMimeType, byteBuffer.remaining(), options.outWidth, options.outHeight, decodeStream);
        return decodeStream;
    }
}

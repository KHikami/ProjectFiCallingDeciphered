package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.net.Uri;
import android.util.Log;
import java.io.InputStream;

/* renamed from: jpw */
public final class jpw implements jpz {
    private final Context a;

    public jpw(Context context) {
        this.a = context;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static byte[] a(android.graphics.Bitmap r4) {
        /*
        r1 = new java.io.ByteArrayOutputStream;
        r1.<init>();
        r0 = android.graphics.Bitmap.CompressFormat.JPEG;	 Catch:{ IOException -> 0x0034, all -> 0x003b }
        r2 = 90;
        r4.compress(r0, r2, r1);	 Catch:{ IOException -> 0x0034, all -> 0x003b }
        r1.flush();	 Catch:{ IOException -> 0x0034, all -> 0x003b }
        r1.close();	 Catch:{ IOException -> 0x0040 }
    L_0x0012:
        r4.recycle();
        r0 = r1.toByteArray();
        r1 = "DownsamplingImagePrep";
        r2 = 3;
        r1 = android.util.Log.isLoggable(r1, r2);
        if (r1 == 0) goto L_0x0033;
    L_0x0022:
        r1 = r0.length;
        r2 = new java.lang.StringBuilder;
        r3 = 39;
        r2.<init>(r3);
        r3 = "compressBitmap: Image size: ";
        r2 = r2.append(r3);
        r2.append(r1);
    L_0x0033:
        return r0;
    L_0x0034:
        r0 = move-exception;
        r1.close();	 Catch:{ IOException -> 0x0039 }
        goto L_0x0012;
    L_0x0039:
        r0 = move-exception;
        goto L_0x0012;
    L_0x003b:
        r0 = move-exception;
        r1.close();	 Catch:{ IOException -> 0x0042 }
    L_0x003f:
        throw r0;
    L_0x0040:
        r0 = move-exception;
        goto L_0x0012;
    L_0x0042:
        r1 = move-exception;
        goto L_0x003f;
        */
        throw new UnsupportedOperationException("Method not decompiled: jpw.a(android.graphics.Bitmap):byte[]");
    }

    private static boolean b(int i, int i2) {
        float f = ((float) i) / ((float) i2);
        return f > 2.0f || f < 0.5f;
    }

    public boolean a(int i, int i2) {
        boolean b = jpw.b(i, i2);
        boolean z = b && i * i2 > 3145728;
        boolean z2;
        if (b || (i <= 2048 && i2 <= 2048)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!(!Log.isLoggable("DownsamplingImagePrep", 4) || z || r0)) {
            String str = b ? "pano" : "image";
            new StringBuilder(String.valueOf(str).length() + 61).append("Don't resize; ").append(str).append(" is too small; size: (").append(i).append(", ").append(i2).append(")");
        }
        if (z || r0) {
            return true;
        }
        return false;
    }

    public jqa a(int i, int i2, Uri uri) {
        Bitmap createScaledBitmap;
        InputStream openInputStream = this.a.getContentResolver().openInputStream(uri);
        int i3;
        if (jpw.b(i, i2)) {
            i3 = 1;
            while (((double) (i * i2)) / Math.pow((double) i3, 2.0d) > 3145728.0d) {
                i3++;
            }
            i3--;
            Options options = new Options();
            options.inSampleSize = i3;
            Bitmap decodeStream = BitmapFactory.decodeStream(openInputStream, null, options);
            double sqrt = Math.sqrt(3145728.0d * (((double) i2) / ((double) i)));
            double d = (sqrt / ((double) i2)) * ((double) i);
            createScaledBitmap = Bitmap.createScaledBitmap(decodeStream, (int) d, (int) sqrt, true);
            if (decodeStream != createScaledBitmap) {
                decodeStream.recycle();
            }
            if (Log.isLoggable("DownsamplingImagePrep", 4)) {
                new StringBuilder(104).append("RESIZE pano; orig: (").append(i).append(", ").append(i2).append("), new: (").append(d).append(", ").append(sqrt).append(")");
            }
        } else {
            int i4;
            Options options2 = new Options();
            options2.inSampleSize = Math.max(i / 2048, i2 / 2048);
            Bitmap decodeStream2 = BitmapFactory.decodeStream(openInputStream, null, options2);
            float f = ((float) i) / ((float) i2);
            if (i > i2) {
                i4 = 2048;
                i3 = (int) (2048.0f / f);
            } else if (i < i2) {
                i4 = (int) (f * 2048.0f);
                i3 = 2048;
            } else {
                i3 = 2048;
                i4 = 2048;
            }
            Bitmap createScaledBitmap2 = Bitmap.createScaledBitmap(decodeStream2, i4, i3, true);
            if (decodeStream2 != createScaledBitmap2) {
                decodeStream2.recycle();
            }
            if (Log.isLoggable("DownsamplingImagePrep", 4)) {
                new StringBuilder(79).append("RESIZE image; orig: (").append(i).append(", ").append(i2).append("), new: (").append(i4).append(", ").append(i3).append(")");
            }
            createScaledBitmap = createScaledBitmap2;
        }
        jqa a = jqa.newBuilder().a(createScaledBitmap.getWidth()).b(createScaledBitmap.getHeight()).a(jpw.a(createScaledBitmap)).a();
        createScaledBitmap.recycle();
        return a;
    }
}

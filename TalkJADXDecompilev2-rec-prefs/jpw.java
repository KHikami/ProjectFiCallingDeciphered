package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.net.Uri;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class jpw implements jpz {
    private final Context f20756a;

    public jpw(Context context) {
        this.f20756a = context;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static byte[] m24971a(Bitmap bitmap) {
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            bitmap.compress(CompressFormat.JPEG, 90, byteArrayOutputStream);
            byteArrayOutputStream.flush();
            try {
                byteArrayOutputStream.close();
            } catch (IOException e) {
            }
        } catch (IOException e2) {
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (IOException e3) {
            }
        }
        bitmap.recycle();
        byte[] toByteArray = byteArrayOutputStream.toByteArray();
        if (Log.isLoggable("DownsamplingImagePrep", 3)) {
            new StringBuilder(39).append("compressBitmap: Image size: ").append(toByteArray.length);
        }
        return toByteArray;
    }

    private static boolean m24972b(int i, int i2) {
        float f = ((float) i) / ((float) i2);
        return f > 2.0f || f < 0.5f;
    }

    public boolean mo3589a(int i, int i2) {
        boolean b = jpw.m24972b(i, i2);
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

    public jqa mo3588a(int i, int i2, Uri uri) {
        Bitmap createScaledBitmap;
        InputStream openInputStream = this.f20756a.getContentResolver().openInputStream(uri);
        int i3;
        if (jpw.m24972b(i, i2)) {
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
        jqa a = jqa.newBuilder().m24988a(createScaledBitmap.getWidth()).m24990b(createScaledBitmap.getHeight()).m24989a(jpw.m24971a(createScaledBitmap)).m24987a();
        createScaledBitmap.recycle();
        return a;
    }
}

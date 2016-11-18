package defpackage;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public final class avy implements aob<Bitmap> {
    public static final anw<Integer> a = anw.a("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", Integer.valueOf(90));
    public static final anw<CompressFormat> b = new anw("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, anw.a);

    private boolean a(aqr<Bitmap> aqr_android_graphics_Bitmap, File file, anz anz) {
        CompressFormat compressFormat;
        OutputStream fileOutputStream;
        String valueOf;
        int a;
        Throwable th;
        Bitmap bitmap = (Bitmap) aqr_android_graphics_Bitmap.c();
        long a2 = bam.a();
        CompressFormat compressFormat2 = (CompressFormat) anz.a(b);
        if (compressFormat2 != null) {
            compressFormat = compressFormat2;
        } else if (bitmap.hasAlpha()) {
            compressFormat = CompressFormat.PNG;
        } else {
            compressFormat = CompressFormat.JPEG;
        }
        int intValue = ((Integer) anz.a(a)).intValue();
        boolean z = false;
        try {
            fileOutputStream = new FileOutputStream(file);
            try {
                bitmap.compress(compressFormat, intValue, fileOutputStream);
                fileOutputStream.close();
                z = true;
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                }
            } catch (IOException e2) {
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException e3) {
                    }
                }
                if (Log.isLoggable("BitmapEncoder", 2)) {
                    valueOf = String.valueOf(compressFormat);
                    a = baq.a(bitmap);
                    new StringBuilder(String.valueOf(valueOf).length() + 70).append("Compressed with type: ").append(valueOf).append(" of size ").append(a).append(" in ").append(bam.a(a2));
                }
                return z;
            } catch (Throwable th2) {
                th = th2;
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException e4) {
                    }
                }
                throw th;
            }
        } catch (IOException e5) {
            fileOutputStream = null;
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
            if (Log.isLoggable("BitmapEncoder", 2)) {
                valueOf = String.valueOf(compressFormat);
                a = baq.a(bitmap);
                new StringBuilder(String.valueOf(valueOf).length() + 70).append("Compressed with type: ").append(valueOf).append(" of size ").append(a).append(" in ").append(bam.a(a2));
            }
            return z;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
            throw th;
        }
        if (Log.isLoggable("BitmapEncoder", 2)) {
            valueOf = String.valueOf(compressFormat);
            a = baq.a(bitmap);
            new StringBuilder(String.valueOf(valueOf).length() + 70).append("Compressed with type: ").append(valueOf).append(" of size ").append(a).append(" in ").append(bam.a(a2));
        }
        return z;
    }

    public ans a(anz anz) {
        return ans.TRANSFORMED;
    }
}

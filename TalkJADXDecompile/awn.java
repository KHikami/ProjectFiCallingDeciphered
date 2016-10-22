import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.resource.bitmap.ImageHeaderParser;
import com.bumptech.glide.load.resource.bitmap.ImageHeaderParser.ImageType;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

public final class awn {
    public static final anw<anr> a;
    public static final anw<awf> b;
    private static final Set<String> c;
    private static final awp d;
    private static final Set<ImageType> e;
    private static final Queue<Options> f;
    private final ard g;
    private final DisplayMetrics h;
    private final aqy i;

    static {
        a = anw.a("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", anr.c);
        b = anw.a("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", awf.c);
        c = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"image/vnd.wap.wbmp", "image/x-ico"})));
        d = new awo();
        e = Collections.unmodifiableSet(EnumSet.of(ImageType.JPEG, ImageType.PNG_A, ImageType.PNG));
        f = baq.a(0);
    }

    public awn(DisplayMetrics displayMetrics, ard ard, aqy aqy) {
        this.h = (DisplayMetrics) gwb.I((Object) displayMetrics);
        this.g = (ard) gwb.I((Object) ard);
        this.i = (aqy) gwb.I((Object) aqy);
    }

    public static boolean a() {
        return true;
    }

    public static boolean b() {
        return true;
    }

    public aqr<Bitmap> a(InputStream inputStream, int i, int i2, anz anz) {
        return a(inputStream, i, i2, anz, d);
    }

    public aqr<Bitmap> a(InputStream inputStream, int i, int i2, anz anz, awp awp) {
        gwb.a(inputStream.markSupported(), "You must provide an InputStream that supports mark()");
        Object obj = (byte[]) this.i.a(65536, byte[].class);
        Options c = c();
        c.inTempStorage = obj;
        anr anr = (anr) anz.a(a);
        awf awf = (awf) anz.a(b);
        try {
            int i3;
            int i4;
            int i5;
            c.inJustDecodeBounds = true;
            a(inputStream, c, awp);
            c.inJustDecodeBounds = false;
            int[] iArr = new int[]{c.outWidth, c.outHeight};
            int i6 = iArr[0];
            int i7 = iArr[1];
            String str = c.outMimeType;
            int a = a(inputStream);
            int a2 = axa.a(a);
            c.inPreferredConfig = a(inputStream, anr);
            if (c.inPreferredConfig != Config.ARGB_8888) {
                c.inDither = true;
            }
            if (i6 > 0 && i7 > 0) {
                float a3;
                i3 = i2 == Integer.MIN_VALUE ? i7 : i2;
                if (i == Integer.MIN_VALUE) {
                    i4 = i6;
                } else {
                    i4 = i;
                }
                if (a2 == 90 || a2 == 270) {
                    a3 = awf.a(i7, i6, i4, i3);
                } else {
                    a3 = awf.a(i6, i7, i4, i3);
                }
                if (a3 <= 0.0f) {
                    String valueOf = String.valueOf(awf);
                    throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 48).append("Cannot scale with factor: ").append(a3).append(" from: ").append(valueOf).toString());
                }
                int a4 = awf.a();
                if (a4 == 0) {
                    throw new IllegalArgumentException("Cannot round with null rounding");
                }
                int i8 = i6 / ((int) ((((float) i6) * a3) + 0.5f));
                i5 = i7 / ((int) ((((float) i7) * a3) + 0.5f));
                if (a4 == awm.a) {
                    i8 = Math.max(i8, i5);
                } else {
                    i8 = Math.min(i8, i5);
                }
                if (VERSION.SDK_INT > 23 || !c.contains(c.outMimeType)) {
                    i8 = Math.max(1, Integer.highestOneBit(i8));
                    if (a4 == awm.a && ((float) i8) < 1.0f / a3) {
                        i8 <<= 1;
                    }
                } else {
                    i8 = 1;
                }
                float f = ((float) i8) * a3;
                c.inSampleSize = i8;
                if (VERSION.SDK_INT >= 19) {
                    c.inTargetDensity = (int) ((1000.0f * f) + 0.5f);
                    c.inDensity = 1000;
                }
                if (a(c)) {
                    c.inScaled = true;
                } else {
                    c.inTargetDensity = 0;
                    c.inDensity = 0;
                }
                if (Log.isLoggable("Downsampler", 2)) {
                    new StringBuilder(252).append("Calculate scaling, source: [").append(i6).append("x").append(i7).append("], target: [").append(i4).append("x").append(i3).append("], exact scale factor: ").append(a3).append(", power of 2 sample size: ").append(i8).append(", adjusted scale factor: ").append(f).append(", target density: ").append(c.inTargetDensity).append(", density: ").append(c.inDensity);
                }
            }
            ard ard = this.g;
            if ((c.inSampleSize == 1 || 19 <= VERSION.SDK_INT) && b(inputStream)) {
                float f2 = a(c) ? ((float) c.inTargetDensity) / ((float) c.inDensity) : 1.0f;
                a2 = c.inSampleSize;
                i3 = (int) Math.ceil((double) (((float) i7) / ((float) a2)));
                i4 = Math.round(((float) ((int) Math.ceil((double) (((float) i6) / ((float) a2))))) * f2);
                i3 = Math.round(((float) i3) * f2);
                if (Log.isLoggable("Downsampler", 2)) {
                    new StringBuilder(192).append("Calculated target [").append(i4).append("x").append(i3).append("] for source [").append(i6).append("x").append(i7).append("], sampleSize: ").append(a2).append(", targetDensity: ").append(c.inTargetDensity).append(", density: ").append(c.inDensity).append(", density multiplier: ").append(f2);
                }
                if (i4 > 0 && i3 > 0) {
                    Config config = c.inPreferredConfig;
                    if (11 <= VERSION.SDK_INT) {
                        c.inBitmap = ard.b(i4, i3, config);
                    }
                }
            }
            Bitmap a5 = a(inputStream, c, awp);
            awp.a(this.g, a5);
            if (Log.isLoggable("Downsampler", 2)) {
                String valueOf2 = String.valueOf(a(a5));
                String valueOf3 = String.valueOf(b(c));
                i4 = c.inSampleSize;
                i3 = c.inDensity;
                i5 = c.inTargetDensity;
                String valueOf4 = String.valueOf(Thread.currentThread().getName());
                new StringBuilder((((String.valueOf(valueOf2).length() + 172) + String.valueOf(str).length()) + String.valueOf(valueOf3).length()) + String.valueOf(valueOf4).length()).append("Decoded ").append(valueOf2).append(" from [").append(i6).append("x").append(i7).append("] ").append(str).append(" with inBitmap ").append(valueOf3).append(" for [").append(i).append("x").append(i2).append("], sample size: ").append(i4).append(", density: ").append(i3).append(", target density: ").append(i5).append(", thread: ").append(valueOf4);
            }
            Bitmap bitmap = null;
            if (a5 != null) {
                a5.setDensity(this.h.densityDpi);
                bitmap = axa.a(this.g, a5, a);
                if (!a5.equals(bitmap)) {
                    this.g.a(a5);
                }
            }
            aqr<Bitmap> a6 = avz.a(bitmap, this.g);
            return a6;
        } finally {
            c(c);
            this.i.a(obj, byte[].class);
        }
    }

    private int a(InputStream inputStream) {
        inputStream.mark(5242880);
        int i = -1;
        try {
            i = new ImageHeaderParser(inputStream, this.i).c();
        } catch (IOException e) {
        } finally {
            inputStream.reset();
        }
        return i;
    }

    private boolean b(InputStream inputStream) {
        if (VERSION.SDK_INT >= 19) {
            return true;
        }
        inputStream.mark(5242880);
        boolean contains;
        try {
            contains = e.contains(new ImageHeaderParser(inputStream, this.i).b());
            return contains;
        } catch (IOException e) {
            contains = e;
            return false;
        } finally {
            inputStream.reset();
        }
    }

    private Config a(InputStream inputStream, anr anr) {
        if (anr == anr.PREFER_ARGB_8888 || VERSION.SDK_INT == 16) {
            return Config.ARGB_8888;
        }
        boolean z = false;
        inputStream.mark(5242880);
        try {
            z = new ImageHeaderParser(inputStream, this.i).a();
            inputStream.reset();
        } catch (IOException e) {
            if (Log.isLoggable("Downsampler", 3)) {
                String valueOf = String.valueOf(anr);
                new StringBuilder(String.valueOf(valueOf).length() + 72).append("Cannot determine whether the image has alpha or not from header, format ").append(valueOf);
            }
            inputStream.reset();
        } catch (Throwable th) {
            inputStream.reset();
        }
        if (z) {
            return Config.ARGB_8888;
        }
        return Config.RGB_565;
    }

    private static Bitmap a(InputStream inputStream, Options options, awp awp) {
        if (options.inJustDecodeBounds) {
            inputStream.mark(5242880);
        } else {
            awp.a();
        }
        int i = options.outWidth;
        int i2 = options.outHeight;
        String str = options.outMimeType;
        axa.a.lock();
        try {
            Bitmap decodeStream = BitmapFactory.decodeStream(inputStream, null, options);
            axa.a.unlock();
            if (options.inJustDecodeBounds) {
                inputStream.reset();
            }
            return decodeStream;
        } catch (Throwable e) {
            String valueOf = String.valueOf(b(options));
            throw new IOException(new StringBuilder((String.valueOf(str).length() + 99) + String.valueOf(valueOf).length()).append("Exception decoding bitmap, outWidth: ").append(i).append(", outHeight: ").append(i2).append(", outMimeType: ").append(str).append(", inBitmap: ").append(valueOf).toString(), e);
        } catch (Throwable th) {
            axa.a.unlock();
        }
    }

    private static boolean a(Options options) {
        return options.inTargetDensity > 0 && options.inDensity > 0 && options.inTargetDensity != options.inDensity;
    }

    private static String b(Options options) {
        return VERSION.SDK_INT >= 11 ? a(options.inBitmap) : null;
    }

    private static String a(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        String str;
        if (VERSION.SDK_INT >= 19) {
            str = " (" + bitmap.getAllocationByteCount() + ")";
        } else {
            str = "";
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        String valueOf = String.valueOf(bitmap.getConfig());
        return new StringBuilder((String.valueOf(valueOf).length() + 26) + String.valueOf(str).length()).append("[").append(width).append("x").append(height).append("] ").append(valueOf).append(str).toString();
    }

    private static synchronized Options c() {
        Options options;
        synchronized (awn.class) {
            synchronized (f) {
                options = (Options) f.poll();
            }
            if (options == null) {
                options = new Options();
                d(options);
            }
        }
        return options;
    }

    private static void c(Options options) {
        d(options);
        synchronized (f) {
            f.offer(options);
        }
    }

    private static void d(Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        if (11 <= VERSION.SDK_INT) {
            options.inBitmap = null;
            options.inMutable = true;
        }
    }
}

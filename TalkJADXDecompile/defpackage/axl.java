package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.load.resource.bitmap.ImageHeaderParser;
import com.bumptech.glide.load.resource.bitmap.ImageHeaderParser.ImageType;
import java.nio.ByteBuffer;

/* renamed from: axl */
public final class axl implements aoa<ByteBuffer, axo> {
    public static final anw<Boolean> a;
    private static final axm b;
    private static final axn c;
    private final Context d;
    private final axn e;
    private final ard f;
    private final axm g;
    private final anj h;

    public /* bridge */ /* synthetic */ aqr a(Object obj, int i, int i2, anz anz) {
        return a((ByteBuffer) obj, i, i2);
    }

    public /* synthetic */ boolean a(Object obj, anz anz) {
        return !((Boolean) anz.a(a)).booleanValue() && new ImageHeaderParser((ByteBuffer) obj, new aqy()).b() == ImageType.GIF;
    }

    static {
        b = new axm();
        a = anw.a("com.bumptech.glide.load.resource.gif.ByteBufferGifDecoder.DisableAnimation", Boolean.valueOf(false));
        c = new axn();
    }

    public axl(Context context, ard ard, aqy aqy) {
        this(context, ard, aqy, c, b);
    }

    private axl(Context context, ard ard, aqy aqy, axn axn, axm axm) {
        this.d = context.getApplicationContext();
        this.f = ard;
        this.g = axm;
        this.h = new anj(ard, aqy);
        this.e = axn;
    }

    private axj a(ByteBuffer byteBuffer, int i, int i2) {
        axj axj = null;
        anm a = this.e.a(byteBuffer);
        try {
            long a2 = bam.a();
            anl b = a.b();
            if (b.c() > 0 && b.d() == 0) {
                int min = Math.min(b.a() / i2, b.b() / i);
                min = Math.max(1, min == 0 ? 0 : Integer.highestOneBit(min));
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    new StringBuilder(125).append("Downsampling GIF, sampleSize: ").append(min).append(", target dimens: [").append(i).append("x").append(i2).append("], actual dimens: [").append(b.b()).append("x").append(b.a()).append("]");
                }
                ani ann = new ann(this.h, b, byteBuffer, min);
                ann.b();
                Bitmap g = ann.g();
                if (g != null) {
                    axo axo = new axo(this.d, ann, this.f, (avu) avu.b, i, i2, g);
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        new StringBuilder(51).append("Decoded GIF from stream in ").append(bam.a(a2));
                    }
                    axj = new axj(axo);
                }
            }
            this.e.a(a);
            return axj;
        } catch (Throwable th) {
            this.e.a(a);
        }
    }
}

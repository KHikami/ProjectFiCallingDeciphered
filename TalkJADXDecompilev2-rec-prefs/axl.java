package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.load.resource.bitmap.ImageHeaderParser;
import com.bumptech.glide.load.resource.bitmap.ImageHeaderParser.ImageType;
import java.nio.ByteBuffer;

public final class axl implements aoa<ByteBuffer, axo> {
    public static final anw<Boolean> f2479a = anw.m3521a("com.bumptech.glide.load.resource.gif.ByteBufferGifDecoder.DisableAnimation", Boolean.valueOf(false));
    private static final axm f2480b = new axm();
    private static final axn f2481c = new axn();
    private final Context f2482d;
    private final axn f2483e;
    private final ard f2484f;
    private final axm f2485g;
    private final anj f2486h;

    public /* bridge */ /* synthetic */ aqr mo394a(Object obj, int i, int i2, anz anz) {
        return m4274a((ByteBuffer) obj, i, i2);
    }

    public /* synthetic */ boolean mo395a(Object obj, anz anz) {
        return !((Boolean) anz.m3528a(f2479a)).booleanValue() && new ImageHeaderParser((ByteBuffer) obj, new aqy()).m8217b() == ImageType.GIF;
    }

    public axl(Context context, ard ard, aqy aqy) {
        this(context, ard, aqy, f2481c, f2480b);
    }

    private axl(Context context, ard ard, aqy aqy, axn axn, axm axm) {
        this.f2482d = context.getApplicationContext();
        this.f2484f = ard;
        this.f2485g = axm;
        this.f2486h = new anj(ard, aqy);
        this.f2483e = axn;
    }

    private axj m4274a(ByteBuffer byteBuffer, int i, int i2) {
        axj axj = null;
        anm a = this.f2483e.m4277a(byteBuffer);
        try {
            long a2 = bam.m4675a();
            anl b = a.m3499b();
            if (b.m3487c() > 0 && b.m3488d() == 0) {
                int min = Math.min(b.m3485a() / i2, b.m3486b() / i);
                min = Math.max(1, min == 0 ? 0 : Integer.highestOneBit(min));
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    new StringBuilder(125).append("Downsampling GIF, sampleSize: ").append(min).append(", target dimens: [").append(i).append("x").append(i2).append("], actual dimens: [").append(b.m3486b()).append("x").append(b.m3485a()).append("]");
                }
                ani ann = new ann(this.f2486h, b, byteBuffer, min);
                ann.mo298b();
                Bitmap g = ann.mo303g();
                if (g != null) {
                    axo axo = new axo(this.f2482d, ann, this.f2484f, (avu) avu.f2407b, i, i2, g);
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        new StringBuilder(51).append("Decoded GIF from stream in ").append(bam.m4674a(a2));
                    }
                    axj = new axj(axo);
                }
            }
            this.f2483e.m4278a(a);
            return axj;
        } catch (Throwable th) {
            this.f2483e.m4278a(a);
        }
    }
}

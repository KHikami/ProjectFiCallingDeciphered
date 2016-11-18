package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import java.security.MessageDigest;

public final class axr implements aoc<axo> {
    private final aoc<Bitmap> b;
    private final ard c;

    public axr(Context context, aoc<Bitmap> aoc_android_graphics_Bitmap) {
        this((aoc) aoc_android_graphics_Bitmap, ami.a(context).a());
    }

    private axr(aoc<Bitmap> aoc_android_graphics_Bitmap, ard ard) {
        this.b = (aoc) gwb.I((Object) aoc_android_graphics_Bitmap);
        this.c = (ard) gwb.I((Object) ard);
    }

    public aqr<axo> a(aqr<axo> aqr_axo, int i, int i2) {
        axo axo = (axo) aqr_axo.c();
        aqr avz = new avz(axo.b(), this.c);
        aqr a = this.b.a(avz, i, i2);
        if (!avz.equals(a)) {
            avz.e();
        }
        axo.a(this.b, (Bitmap) a.c());
        return aqr_axo;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof axr)) {
            return false;
        }
        return this.b.equals(((axr) obj).b);
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public void a(MessageDigest messageDigest) {
        this.b.a(messageDigest);
    }
}

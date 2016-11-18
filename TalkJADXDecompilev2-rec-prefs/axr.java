package p000;

import android.content.Context;
import android.graphics.Bitmap;
import java.security.MessageDigest;

public final class axr implements aoc<axo> {
    private final aoc<Bitmap> f2500b;
    private final ard f2501c;

    public axr(Context context, aoc<Bitmap> aoc_android_graphics_Bitmap) {
        this((aoc) aoc_android_graphics_Bitmap, ami.m2900a(context).m2902a());
    }

    private axr(aoc<Bitmap> aoc_android_graphics_Bitmap, ard ard) {
        this.f2500b = (aoc) gwb.m1404I((Object) aoc_android_graphics_Bitmap);
        this.f2501c = (ard) gwb.m1404I((Object) ard);
    }

    public aqr<axo> mo393a(aqr<axo> aqr_axo, int i, int i2) {
        axo axo = (axo) aqr_axo.mo346c();
        aqr avz = new avz(axo.m4286b(), this.f2501c);
        aqr a = this.f2500b.mo393a(avz, i, i2);
        if (!avz.equals(a)) {
            avz.mo348e();
        }
        axo.m4285a(this.f2500b, (Bitmap) a.mo346c());
        return aqr_axo;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof axr)) {
            return false;
        }
        return this.f2500b.equals(((axr) obj).f2500b);
    }

    public int hashCode() {
        return this.f2500b.hashCode();
    }

    public void mo308a(MessageDigest messageDigest) {
        this.f2500b.mo308a(messageDigest);
    }
}

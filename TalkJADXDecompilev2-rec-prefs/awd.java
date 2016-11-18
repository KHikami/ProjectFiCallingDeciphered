package p000;

import android.content.Context;
import android.graphics.Bitmap;
import java.security.MessageDigest;

public final class awd extends awa {
    private static final byte[] f2424b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(a);

    public awd(Context context) {
        super(context);
    }

    protected Bitmap mo397a(ard ard, Bitmap bitmap, int i, int i2) {
        return axa.m4248c(ard, bitmap, i, i2);
    }

    public boolean equals(Object obj) {
        return obj instanceof awd;
    }

    public int hashCode() {
        return "com.bumptech.glide.load.resource.bitmap.CenterInside".hashCode();
    }

    public void mo308a(MessageDigest messageDigest) {
        messageDigest.update(f2424b);
    }
}

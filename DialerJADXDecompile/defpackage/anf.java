package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* renamed from: anf */
public final class anf {
    public final Drawable a;
    public final Drawable b;
    public final Drawable c;
    public final Drawable d;
    public final Drawable e;
    public final Drawable f;
    public final int g;

    public anf(Context context) {
        Resources resources = context.getResources();
        this.a = resources.getDrawable(cob.aq);
        this.a.setColorFilter(resources.getColor(cob.U), Mode.MULTIPLY);
        this.b = buf.a(resources, cob.aq, 180.0f);
        this.b.setColorFilter(resources.getColor(cob.U), Mode.MULTIPLY);
        this.c = resources.getDrawable(cob.aq).mutate();
        this.c.setColorFilter(resources.getColor(cob.af), Mode.MULTIPLY);
        this.d = resources.getDrawable(cob.ar);
        this.e = anf.a(context, cob.ao);
        this.e.setColorFilter(resources.getColor(cob.W), Mode.MULTIPLY);
        this.f = anf.a(context, cob.aL);
        this.f.setColorFilter(resources.getColor(cob.ae), Mode.MULTIPLY);
        this.g = resources.getDimensionPixelSize(buf.hj);
    }

    private static Drawable a(Context context, int i) {
        Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), i);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(buf.hk);
        return new BitmapDrawable(context.getResources(), Bitmap.createScaledBitmap(decodeResource, (int) (((float) decodeResource.getWidth()) * (((float) dimensionPixelSize) / ((float) decodeResource.getHeight()))), dimensionPixelSize, false));
    }
}

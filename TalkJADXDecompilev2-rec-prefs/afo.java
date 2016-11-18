package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

final class afo extends aeu {
    private final WeakReference<Context> f547a;

    public afo(Context context, Resources resources) {
        super(resources);
        this.f547a = new WeakReference(context);
    }

    public Drawable getDrawable(int i) {
        Drawable drawable = super.getDrawable(i);
        Context context = (Context) this.f547a.get();
        if (!(drawable == null || context == null)) {
            aai.m66a();
            aai.m73a(context, i, drawable);
        }
        return drawable;
    }
}

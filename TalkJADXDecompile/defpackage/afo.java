package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* renamed from: afo */
final class afo extends aeu {
    private final WeakReference<Context> a;

    public afo(Context context, Resources resources) {
        super(resources);
        this.a = new WeakReference(context);
    }

    public Drawable getDrawable(int i) {
        Drawable drawable = super.getDrawable(i);
        Context context = (Context) this.a.get();
        if (!(drawable == null || context == null)) {
            aai.a();
            aai.a(context, i, drawable);
        }
        return drawable;
    }
}

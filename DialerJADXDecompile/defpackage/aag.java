package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* renamed from: aag */
final class aag extends zn {
    private final WeakReference a;

    public aag(Context context, Resources resources) {
        super(resources);
        this.a = new WeakReference(context);
    }

    public final Drawable getDrawable(int i) {
        Drawable drawable = super.getDrawable(i);
        Context context = (Context) this.a.get();
        if (!(drawable == null || context == null)) {
            vi.a();
            vi.a(context, i, drawable);
        }
        return drawable;
    }
}

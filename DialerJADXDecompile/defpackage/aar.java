package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* renamed from: aar */
public final class aar extends Resources {
    private final WeakReference a;

    public static boolean a() {
        return false;
    }

    public aar(Context context, Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.a = new WeakReference(context);
    }

    public final Drawable getDrawable(int i) {
        Context context = (Context) this.a.get();
        if (context == null) {
            return super.getDrawable(i);
        }
        vi a = vi.a();
        Drawable a2 = a.a(context, i);
        if (a2 == null) {
            a2 = super.getDrawable(i);
        }
        if (a2 != null) {
            return a.a(context, i, false, a2);
        }
        return null;
    }
}

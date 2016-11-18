package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;

public final class wk {
    private static final ThreadLocal<TypedValue> f35532a = new ThreadLocal();
    private static final WeakHashMap<Context, SparseArray<wl>> f35533b = new WeakHashMap(0);
    private static final Object f35534c = new Object();

    public static ColorStateList m41195a(Context context, int i) {
        if (VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        ColorStateList d = wk.m41198d(context, i);
        if (d != null) {
            return d;
        }
        ColorStateList c = wk.m41197c(context, i);
        if (c == null) {
            return ia.b(context, i);
        }
        synchronized (f35534c) {
            SparseArray sparseArray = (SparseArray) f35533b.get(context);
            if (sparseArray == null) {
                sparseArray = new SparseArray();
                f35533b.put(context, sparseArray);
            }
            sparseArray.append(i, new wl(c, context.getResources().getConfiguration()));
        }
        return c;
    }

    public static Drawable m41196b(Context context, int i) {
        return aai.a().a(context, i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static ColorStateList m41198d(Context context, int i) {
        synchronized (f35534c) {
            SparseArray sparseArray = (SparseArray) f35533b.get(context);
            if (sparseArray != null && sparseArray.size() > 0) {
                wl wlVar = (wl) sparseArray.get(i);
                if (wlVar != null) {
                    if (wlVar.f35536b.equals(context.getResources().getConfiguration())) {
                        ColorStateList colorStateList = wlVar.f35535a;
                        return colorStateList;
                    }
                    sparseArray.remove(i);
                }
            }
        }
    }

    private static ColorStateList m41197c(Context context, int i) {
        boolean z;
        Resources resources = context.getResources();
        TypedValue typedValue = (TypedValue) f35532a.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            f35532a.set(typedValue);
        }
        resources.getValue(i, typedValue, true);
        if (typedValue.type < 28 || typedValue.type > 31) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        Resources resources2 = context.getResources();
        try {
            return gwb.a(resources2, resources2.getXml(i), context.getTheme());
        } catch (Throwable e) {
            Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", e);
            return null;
        }
    }
}

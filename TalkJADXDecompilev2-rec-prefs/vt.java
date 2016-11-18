package p000;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;
import java.util.Map;

final class vt {
    private static final Class<?>[] f35397a = new Class[]{Context.class, AttributeSet.class};
    private static final int[] f35398b = new int[]{16843375};
    private static final String[] f35399c = new String[]{"android.widget.", "android.view.", "android.webkit."};
    private static final Map<String, Constructor<? extends View>> f35400d = new ky();
    private final Object[] f35401e = new Object[2];

    vt() {
    }

    View m41059a(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            this.f35401e[0] = context;
            this.f35401e[1] = attributeSet;
            View a;
            if (-1 == str.indexOf(46)) {
                for (String a2 : f35399c) {
                    a = m41057a(context, str, a2);
                    if (a != null) {
                        return a;
                    }
                }
                this.f35401e[0] = null;
                this.f35401e[1] = null;
                return null;
            }
            a = m41057a(context, str, null);
            this.f35401e[0] = null;
            this.f35401e[1] = null;
            return a;
        } catch (Exception e) {
            return null;
        } finally {
            this.f35401e[0] = null;
            this.f35401e[1] = null;
        }
    }

    static void m41058a(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if (!(context instanceof ContextWrapper)) {
            return;
        }
        if (VERSION.SDK_INT < 15 || oa.f31462a.mo4110i(view)) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f35398b);
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new vu(view, string));
            }
            obtainStyledAttributes.recycle();
        }
    }

    private View m41057a(Context context, String str, String str2) {
        Constructor constructor = (Constructor) f35400d.get(str);
        if (constructor == null) {
            try {
                constructor = context.getClassLoader().loadClass(str2 != null ? str2 + str : str).asSubclass(View.class).getConstructor(f35397a);
                f35400d.put(str, constructor);
            } catch (Exception e) {
                return null;
            }
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f35401e);
    }

    static Context m41056a(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        int resourceId;
        int resourceId2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wi.dO, 0, 0);
        if (z) {
            resourceId = obtainStyledAttributes.getResourceId(wi.dP, 0);
        } else {
            resourceId = 0;
        }
        if (z2 && resourceId == 0) {
            resourceId2 = obtainStyledAttributes.getResourceId(wi.dQ, 0);
        } else {
            resourceId2 = resourceId;
        }
        obtainStyledAttributes.recycle();
        if (resourceId2 == 0) {
            return context;
        }
        if ((context instanceof xa) && ((xa) context).m41264a() == resourceId2) {
            return context;
        }
        return new xa(context, resourceId2);
    }
}

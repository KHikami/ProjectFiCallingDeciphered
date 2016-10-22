package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;
import java.util.Map;

/* compiled from: PG */
/* renamed from: qy */
final class qy {
    private static final Class[] a;
    private static final int[] b;
    private static final String[] c;
    private static final Map d;
    private final Object[] e;

    qy() {
        this.e = new Object[2];
    }

    static {
        a = new Class[]{Context.class, AttributeSet.class};
        b = new int[]{16843375};
        c = new String[]{"android.widget.", "android.view.", "android.webkit."};
        d = new hv();
    }

    final View a(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            this.e[0] = context;
            this.e[1] = attributeSet;
            View a;
            if (-1 == str.indexOf(46)) {
                for (String a2 : c) {
                    a = a(context, str, a2);
                    if (a != null) {
                        return a;
                    }
                }
                this.e[0] = null;
                this.e[1] = null;
                return null;
            }
            a = a(context, str, null);
            this.e[0] = null;
            this.e[1] = null;
            return a;
        } catch (Exception e) {
            return null;
        } finally {
            this.e[0] = null;
            this.e[1] = null;
        }
    }

    static void a(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if (!(context instanceof ContextWrapper)) {
            return;
        }
        if (VERSION.SDK_INT < 15 || kn.a.j(view)) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b);
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new qz(view, string));
            }
            obtainStyledAttributes.recycle();
        }
    }

    private final View a(Context context, String str, String str2) {
        Constructor constructor = (Constructor) d.get(str);
        if (constructor == null) {
            try {
                constructor = context.getClassLoader().loadClass(str2 != null ? str2 + str : str).asSubclass(View.class).getConstructor(a);
                d.put(str, constructor);
            } catch (Exception e) {
                return null;
            }
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.e);
    }

    static Context a(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        int resourceId;
        int resourceId2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rk.cd, 0, 0);
        if (z) {
            resourceId = obtainStyledAttributes.getResourceId(rk.cm, 0);
        } else {
            resourceId = 0;
        }
        if (z2 && resourceId == 0) {
            resourceId2 = obtainStyledAttributes.getResourceId(rk.cn, 0);
        } else {
            resourceId2 = resourceId;
        }
        obtainStyledAttributes.recycle();
        if (resourceId2 == 0) {
            return context;
        }
        if ((context instanceof rw) && ((rw) context).a == resourceId2) {
            return context;
        }
        return new rw(context, resourceId2);
    }
}

package defpackage;

import android.view.View;
import java.lang.reflect.Field;
import java.util.WeakHashMap;

class od extends ob {
    static Field a;
    static boolean b = false;

    od() {
    }

    public boolean c(View view, int i) {
        return gwb.c(view, i);
    }

    public boolean d(View view, int i) {
        return gwb.d(view, i);
    }

    public void a(View view, lt ltVar) {
        Object obj;
        if (ltVar == null) {
            obj = null;
        } else {
            obj = ltVar.a();
        }
        gwb.a(view, obj);
    }

    public boolean j(View view) {
        if (b) {
            return false;
        }
        if (a == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                a = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable th) {
                b = true;
                return false;
            }
        }
        try {
            if (a.get(view) != null) {
                return true;
            }
            return false;
        } catch (Throwable th2) {
            b = true;
            return false;
        }
    }

    public pn k(View view) {
        if (this.c == null) {
            this.c = new WeakHashMap();
        }
        pn pnVar = (pn) this.c.get(view);
        if (pnVar != null) {
            return pnVar;
        }
        pnVar = new pn(view);
        this.c.put(view, pnVar);
        return pnVar;
    }

    public void c(View view, boolean z) {
        gwb.a(view, z);
    }
}

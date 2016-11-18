package p000;

import android.view.View;
import java.lang.reflect.Field;
import java.util.WeakHashMap;

class od extends ob {
    static Field f32154a;
    static boolean f32155b = false;

    od() {
    }

    public boolean mo4106c(View view, int i) {
        return gwb.c(view, i);
    }

    public boolean mo4107d(View view, int i) {
        return gwb.d(view, i);
    }

    public void mo4104a(View view, lt ltVar) {
        Object obj;
        if (ltVar == null) {
            obj = null;
        } else {
            obj = ltVar.a();
        }
        gwb.a(view, obj);
    }

    public boolean mo4108j(View view) {
        if (f32155b) {
            return false;
        }
        if (f32154a == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f32154a = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable th) {
                f32155b = true;
                return false;
            }
        }
        try {
            if (f32154a.get(view) != null) {
                return true;
            }
            return false;
        } catch (Throwable th2) {
            f32155b = true;
            return false;
        }
    }

    public pn mo4109k(View view) {
        if (this.f31886c == null) {
            this.f31886c = new WeakHashMap();
        }
        pn pnVar = (pn) this.f31886c.get(view);
        if (pnVar != null) {
            return pnVar;
        }
        pnVar = new pn(view);
        this.f31886c.put(view, pnVar);
        return pnVar;
    }

    public void mo4105c(View view, boolean z) {
        gwb.a(view, z);
    }
}

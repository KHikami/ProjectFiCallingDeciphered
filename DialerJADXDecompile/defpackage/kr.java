package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import java.lang.reflect.Field;
import java.util.WeakHashMap;

/* compiled from: PG */
/* renamed from: kr */
class kr extends kp {
    private static Field b;
    private static boolean c;

    kr() {
    }

    static {
        c = false;
    }

    public final boolean c(View view, int i) {
        return buf.c(view, i);
    }

    public final boolean d(View view, int i) {
        return buf.d(view, i);
    }

    public final void a(View view, AccessibilityEvent accessibilityEvent) {
        buf.a(view, accessibilityEvent);
    }

    public final void a(View view, in inVar) {
        Object obj;
        if (inVar == null) {
            obj = null;
        } else {
            obj = inVar.getBridge();
        }
        buf.a(view, obj);
    }

    public final boolean k(View view) {
        if (c) {
            return false;
        }
        if (b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable th) {
                c = true;
                return false;
            }
        }
        try {
            if (b.get(view) != null) {
                return true;
            }
            return false;
        } catch (Throwable th2) {
            c = true;
            return false;
        }
    }

    public final lv l(View view) {
        if (this.a == null) {
            this.a = new WeakHashMap();
        }
        lv lvVar = (lv) this.a.get(view);
        if (lvVar != null) {
            return lvVar;
        }
        lvVar = new lv(view);
        this.a.put(view, lvVar);
        return lvVar;
    }

    public final void c(View view, boolean z) {
        buf.a(view, z);
    }

    public final void a(View view, mr mrVar) {
        buf.b(view, mrVar.b);
    }
}

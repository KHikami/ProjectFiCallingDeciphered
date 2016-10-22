import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* compiled from: PG */
public final class wj implements wn {
    public final void a(wk wkVar, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        wkVar.a(new zo(colorStateList, f));
        View d = wkVar.d();
        d.setClipToOutline(true);
        d.setElevation(f2);
        zo c = c(wkVar);
        boolean b = wkVar.b();
        boolean c2 = wkVar.c();
        if (!(f3 == c.b && c.c == b && c.d == c2)) {
            c.b = f3;
            c.c = b;
            c.d = c2;
            c.a(null);
            c.invalidateSelf();
        }
        if (wkVar.b()) {
            float f4 = c(wkVar).b;
            float f5 = c(wkVar).a;
            int ceil = (int) Math.ceil((double) zp.b(f4, f5, wkVar.c()));
            int ceil2 = (int) Math.ceil((double) zp.a(f4, f5, wkVar.c()));
            wkVar.a(ceil, ceil2, ceil, ceil2);
            return;
        }
        wkVar.a(0, 0, 0, 0);
    }

    public final void a() {
    }

    private static zo c(wk wkVar) {
        return (zo) wkVar.a();
    }

    public final float a(wk wkVar) {
        return c(wkVar).a * 2.0f;
    }

    public final float b(wk wkVar) {
        return c(wkVar).a * 2.0f;
    }
}

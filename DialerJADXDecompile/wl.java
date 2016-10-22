import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
public class wl implements wn {
    final RectF a;

    public wl() {
        this.a = new RectF();
    }

    public void a() {
        zp.b = new wm(this);
    }

    public final void a(wk wkVar, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        Drawable zpVar = new zp(context.getResources(), colorStateList, f, f2, f3);
        zpVar.e = wkVar.c();
        zpVar.invalidateSelf();
        wkVar.a(zpVar);
        Rect rect = new Rect();
        c(wkVar).getPadding(rect);
        zp c = c(wkVar);
        int ceil = (int) Math.ceil((double) (((((float) c.a) + c.d) * 2.0f) + (Math.max(c.d, (c.c + ((float) c.a)) + (c.d / 2.0f)) * 2.0f)));
        zp c2 = c(wkVar);
        wkVar.a(ceil, (int) Math.ceil((double) (((((float) c2.a) + (c2.d * 1.5f)) * 2.0f) + (Math.max(c2.d, (c2.c + ((float) c2.a)) + ((c2.d * 1.5f) / 2.0f)) * 2.0f))));
        wkVar.a(rect.left, rect.top, rect.right, rect.bottom);
    }

    public final float a(wk wkVar) {
        zp c = c(wkVar);
        return ((((float) c.a) + c.d) * 2.0f) + (Math.max(c.d, (c.c + ((float) c.a)) + (c.d / 2.0f)) * 2.0f);
    }

    public final float b(wk wkVar) {
        zp c = c(wkVar);
        return ((((float) c.a) + (c.d * 1.5f)) * 2.0f) + (Math.max(c.d, (c.c + ((float) c.a)) + ((c.d * 1.5f) / 2.0f)) * 2.0f);
    }

    private static zp c(wk wkVar) {
        return (zp) wkVar.a();
    }
}

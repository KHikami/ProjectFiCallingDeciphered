package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

class abl implements abn {
    final RectF f166a = new RectF();

    abl() {
    }

    public void mo19a() {
        aew.f470c = new abm(this);
    }

    public void m222c(abk abk) {
        Rect rect = new Rect();
        abl.m217d(abk).m898a(rect);
        abk.m211a((int) Math.ceil((double) mo18a(abk)), (int) Math.ceil((double) mo21b(abk)));
        abk.m212a(rect.left, rect.top, rect.right, rect.bottom);
    }

    public float mo18a(abk abk) {
        return abl.m217d(abk).m897a();
    }

    public float mo21b(abk abk) {
        return abl.m217d(abk).m900b();
    }

    private static aew m217d(abk abk) {
        return (aew) abk.m210a();
    }

    public void mo20a(abk abk, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        Drawable aew = new aew(context.getResources(), colorStateList, f, f2, f3);
        aew.m899a(abk.m215c());
        abk.m213a(aew);
        m222c(abk);
    }
}

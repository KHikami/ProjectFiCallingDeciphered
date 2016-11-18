package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

class abl implements abn {
    final RectF a = new RectF();

    abl() {
    }

    public void a() {
        aew.c = new abm(this);
    }

    public void c(abk abk) {
        Rect rect = new Rect();
        abl.d(abk).a(rect);
        abk.a((int) Math.ceil((double) a(abk)), (int) Math.ceil((double) b(abk)));
        abk.a(rect.left, rect.top, rect.right, rect.bottom);
    }

    public float a(abk abk) {
        return abl.d(abk).a();
    }

    public float b(abk abk) {
        return abl.d(abk).b();
    }

    private static aew d(abk abk) {
        return (aew) abk.a();
    }

    public void a(abk abk, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        Drawable aew = new aew(context.getResources(), colorStateList, f, f2, f3);
        aew.a(abk.c());
        abk.a(aew);
        c(abk);
    }
}

package defpackage;

import android.graphics.Rect;
import android.support.v4.view.ViewPager;
import android.view.View;

public final class ox implements no {
    final /* synthetic */ ViewPager a;
    private final Rect b = new Rect();

    public ox(ViewPager viewPager) {
        this.a = viewPager;
    }

    public qb a(View view, qb qbVar) {
        qb a = oa.a(view, qbVar);
        if (a.e()) {
            return a;
        }
        Rect rect = this.b;
        rect.left = a.a();
        rect.top = a.b();
        rect.right = a.c();
        rect.bottom = a.d();
        int childCount = this.a.getChildCount();
        for (int i = 0; i < childCount; i++) {
            qb b = oa.a.b(this.a.getChildAt(i), a);
            rect.left = Math.min(b.a(), rect.left);
            rect.top = Math.min(b.b(), rect.top);
            rect.right = Math.min(b.c(), rect.right);
            rect.bottom = Math.min(b.d(), rect.bottom);
        }
        return a.a(rect.left, rect.top, rect.right, rect.bottom);
    }
}

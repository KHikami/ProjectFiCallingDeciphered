package p000;

import android.graphics.Rect;
import android.support.v4.view.ViewPager;
import android.view.View;

public final class ox implements no {
    final /* synthetic */ ViewPager f34475a;
    private final Rect f34476b = new Rect();

    public ox(ViewPager viewPager) {
        this.f34475a = viewPager;
    }

    public qb mo4245a(View view, qb qbVar) {
        qb a = oa.m37333a(view, qbVar);
        if (a.e()) {
            return a;
        }
        Rect rect = this.f34476b;
        rect.left = a.a();
        rect.top = a.b();
        rect.right = a.c();
        rect.bottom = a.d();
        int childCount = this.f34475a.getChildCount();
        for (int i = 0; i < childCount; i++) {
            qb b = oa.f31462a.mo4144b(this.f34475a.getChildAt(i), a);
            rect.left = Math.min(b.a(), rect.left);
            rect.top = Math.min(b.b(), rect.top);
            rect.right = Math.min(b.c(), rect.right);
            rect.bottom = Math.min(b.d(), rect.bottom);
        }
        return a.a(rect.left, rect.top, rect.right, rect.bottom);
    }
}

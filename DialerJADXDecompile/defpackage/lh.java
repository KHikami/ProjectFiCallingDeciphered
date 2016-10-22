package defpackage;

import android.graphics.Rect;
import android.support.v4.view.ViewPager;
import android.view.View;

/* compiled from: PG */
/* renamed from: lh */
public final class lh implements kf {
    private final Rect a;
    private /* synthetic */ ViewPager b;

    public lh(ViewPager viewPager) {
        this.b = viewPager;
        this.a = new Rect();
    }

    public final mj a(View view, mj mjVar) {
        mj a = kn.a(view, mjVar);
        if (a.e()) {
            return a;
        }
        Rect rect = this.a;
        rect.left = a.a();
        rect.top = a.b();
        rect.right = a.c();
        rect.bottom = a.d();
        int childCount = this.b.getChildCount();
        for (int i = 0; i < childCount; i++) {
            mj b = kn.a.b(this.b.getChildAt(i), a);
            rect.left = Math.min(b.a(), rect.left);
            rect.top = Math.min(b.b(), rect.top);
            rect.right = Math.min(b.c(), rect.right);
            rect.bottom = Math.min(b.d(), rect.bottom);
        }
        return a.a(rect.left, rect.top, rect.right, rect.bottom);
    }
}

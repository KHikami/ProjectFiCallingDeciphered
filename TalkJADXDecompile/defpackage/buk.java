package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.Map;

/* renamed from: buk */
final class buk {
    public final View a;
    public final Map<View, bul> b;

    public buk(View view) {
        this.b = new ky();
        this.a = view;
    }

    public void a(View view) {
        if (view == this.a) {
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
            return;
        }
        view.setAlpha(((bul) this.b.get(view)).b);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    public void b(View view) {
        if (view != this.a && ((bul) this.b.get(view)).a == bum.a && view.getParent() != null) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup.getChildCount() > 1) {
                viewGroup.removeViewInLayout(view);
            } else {
                viewGroup.removeView(view);
            }
        }
    }

    public void a() {
        a(this.a);
        b(this.a);
        for (View view : this.b.keySet()) {
            a(view);
            b(view);
        }
    }

    public void b() {
        this.a.animate().cancel();
        for (View animate : this.b.keySet()) {
            animate.animate().cancel();
        }
    }
}

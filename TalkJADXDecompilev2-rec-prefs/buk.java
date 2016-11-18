package p000;

import android.view.View;
import android.view.ViewGroup;
import java.util.Map;

final class buk {
    public final View f4513a;
    public final Map<View, bul> f4514b = new ky();

    public buk(View view) {
        this.f4513a = view;
    }

    public void m6715a(View view) {
        if (view == this.f4513a) {
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
            return;
        }
        view.setAlpha(((bul) this.f4514b.get(view)).f4516b);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    public void m6717b(View view) {
        if (view != this.f4513a && ((bul) this.f4514b.get(view)).f4515a == bum.f4517a && view.getParent() != null) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup.getChildCount() > 1) {
                viewGroup.removeViewInLayout(view);
            } else {
                viewGroup.removeView(view);
            }
        }
    }

    public void m6714a() {
        m6715a(this.f4513a);
        m6717b(this.f4513a);
        for (View view : this.f4514b.keySet()) {
            m6715a(view);
            m6717b(view);
        }
    }

    public void m6716b() {
        this.f4513a.animate().cancel();
        for (View animate : this.f4514b.keySet()) {
            animate.animate().cancel();
        }
    }
}

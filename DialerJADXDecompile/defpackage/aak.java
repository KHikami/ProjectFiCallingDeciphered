package defpackage;

import android.content.Context;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageButton;

/* compiled from: PG */
/* renamed from: aak */
public final class aak implements tj {
    public sy a;
    private su b;
    private /* synthetic */ Toolbar c;

    aak(Toolbar toolbar) {
        this.c = toolbar;
    }

    public final void a(Context context, su suVar) {
        if (!(this.b == null || this.a == null)) {
            this.b.b(this.a);
        }
        this.b = suVar;
    }

    public final void b(boolean z) {
        Object obj = null;
        if (this.a != null) {
            if (this.b != null) {
                int size = this.b.size();
                for (int i = 0; i < size; i++) {
                    if (this.b.getItem(i) == this.a) {
                        obj = 1;
                        break;
                    }
                }
            }
            if (obj == null) {
                c(this.a);
            }
        }
    }

    public final void a(tk tkVar) {
    }

    public final boolean a(tr trVar) {
        return false;
    }

    public final void a(su suVar, boolean z) {
    }

    public final boolean a() {
        return false;
    }

    public final boolean b(sy syVar) {
        Toolbar toolbar = this.c;
        if (toolbar.g == null) {
            toolbar.g = new ImageButton(toolbar.getContext(), null, buf.Y);
            toolbar.g.setImageDrawable(toolbar.e);
            toolbar.g.setContentDescription(toolbar.f);
            LayoutParams h = Toolbar.h();
            h.a = (toolbar.m & 112) | 8388611;
            h.b = 2;
            toolbar.g.setLayoutParams(h);
            toolbar.g.setOnClickListener(new aaj(toolbar));
        }
        if (this.c.g.getParent() != this.c) {
            this.c.addView(this.c.g);
        }
        this.c.h = syVar.getActionView();
        this.a = syVar;
        if (this.c.h.getParent() != this.c) {
            LayoutParams h2 = Toolbar.h();
            h2.a = (this.c.m & 112) | 8388611;
            h2.b = 2;
            this.c.h.setLayoutParams(h2);
            this.c.addView(this.c.h);
        }
        this.c.j();
        this.c.requestLayout();
        syVar.e(true);
        if (this.c.h instanceof rv) {
            ((rv) this.c.h).a();
        }
        return true;
    }

    public final boolean c(sy syVar) {
        if (this.c.h instanceof rv) {
            ((rv) this.c.h).b();
        }
        this.c.removeView(this.c.h);
        this.c.removeView(this.c.g);
        this.c.h = null;
        Toolbar toolbar = this.c;
        for (int size = toolbar.q.size() - 1; size >= 0; size--) {
            toolbar.addView((View) toolbar.q.get(size));
        }
        toolbar.q.clear();
        this.a = null;
        this.c.requestLayout();
        syVar.e(false);
        return true;
    }
}

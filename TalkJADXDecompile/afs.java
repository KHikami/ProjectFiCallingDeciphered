import android.content.Context;
import android.support.v7.widget.Toolbar;

public final class afs implements yn {
    xy a;
    public yc b;
    final /* synthetic */ Toolbar c;

    public afs(Toolbar toolbar) {
        this.c = toolbar;
    }

    public void a(Context context, xy xyVar) {
        if (!(this.a == null || this.b == null)) {
            this.a.b(this.b);
        }
        this.a = xyVar;
    }

    public void b(boolean z) {
        Object obj = null;
        if (this.b != null) {
            if (this.a != null) {
                int size = this.a.size();
                for (int i = 0; i < size; i++) {
                    if (this.a.getItem(i) == this.b) {
                        obj = 1;
                        break;
                    }
                }
            }
            if (obj == null) {
                c(this.b);
            }
        }
    }

    public void a(yo yoVar) {
    }

    public boolean a(yv yvVar) {
        return false;
    }

    public void a(xy xyVar, boolean z) {
    }

    public boolean b() {
        return false;
    }

    public boolean b(yc ycVar) {
        Toolbar toolbar = this.c;
        if (toolbar.c == null) {
            toolbar.c = new aan(toolbar.getContext(), null, gwb.ac);
            toolbar.c.setImageDrawable(toolbar.a);
            toolbar.c.setContentDescription(toolbar.b);
            aft t = toolbar.t();
            t.a = (toolbar.e & 112) | 8388611;
            t.b = 2;
            toolbar.c.setLayoutParams(t);
            toolbar.c.setOnClickListener(new afr(toolbar));
        }
        if (this.c.c.getParent() != this.c) {
            this.c.addView(this.c.c);
        }
        this.c.d = ycVar.getActionView();
        this.b = ycVar;
        if (this.c.d.getParent() != this.c) {
            aft t2 = this.c.t();
            t2.a = (this.c.e & 112) | 8388611;
            t2.b = 2;
            this.c.d.setLayoutParams(t2);
            this.c.addView(this.c.d);
        }
        this.c.v();
        this.c.requestLayout();
        ycVar.e(true);
        if (this.c.d instanceof wz) {
            ((wz) this.c.d).a();
        }
        return true;
    }

    public boolean c(yc ycVar) {
        if (this.c.d instanceof wz) {
            ((wz) this.c.d).b();
        }
        this.c.removeView(this.c.d);
        this.c.removeView(this.c.c);
        this.c.d = null;
        this.c.w();
        this.b = null;
        this.c.requestLayout();
        ycVar.e(false);
        return true;
    }
}

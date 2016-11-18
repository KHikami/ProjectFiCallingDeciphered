package p000;

import android.content.Context;
import android.support.v7.widget.Toolbar;
import android.view.ViewGroup.LayoutParams;

public final class afs implements yn {
    xy f552a;
    public yc f553b;
    final /* synthetic */ Toolbar f554c;

    public afs(Toolbar toolbar) {
        this.f554c = toolbar;
    }

    public void m945a(Context context, xy xyVar) {
        if (!(this.f552a == null || this.f553b == null)) {
            this.f552a.b(this.f553b);
        }
        this.f552a = xyVar;
    }

    public void m949b(boolean z) {
        Object obj = null;
        if (this.f553b != null) {
            if (this.f552a != null) {
                int size = this.f552a.size();
                for (int i = 0; i < size; i++) {
                    if (this.f552a.getItem(i) == this.f553b) {
                        obj = 1;
                        break;
                    }
                }
            }
            if (obj == null) {
                m952c(this.f553b);
            }
        }
    }

    public void m947a(yo yoVar) {
    }

    public boolean m948a(yv yvVar) {
        return false;
    }

    public void m946a(xy xyVar, boolean z) {
    }

    public boolean m950b() {
        return false;
    }

    public boolean m951b(yc ycVar) {
        Toolbar toolbar = this.f554c;
        if (toolbar.f1831c == null) {
            toolbar.f1831c = new aan(toolbar.getContext(), null, gwb.ac);
            toolbar.f1831c.setImageDrawable(toolbar.f1829a);
            toolbar.f1831c.setContentDescription(toolbar.f1830b);
            LayoutParams t = toolbar.m3459t();
            t.a = (toolbar.f1833e & 112) | 8388611;
            t.f555b = 2;
            toolbar.f1831c.setLayoutParams(t);
            toolbar.f1831c.setOnClickListener(new afr(toolbar));
        }
        if (this.f554c.f1831c.getParent() != this.f554c) {
            this.f554c.addView(this.f554c.f1831c);
        }
        this.f554c.f1832d = ycVar.getActionView();
        this.f553b = ycVar;
        if (this.f554c.f1832d.getParent() != this.f554c) {
            LayoutParams t2 = this.f554c.m3459t();
            t2.a = (this.f554c.f1833e & 112) | 8388611;
            t2.f555b = 2;
            this.f554c.f1832d.setLayoutParams(t2);
            this.f554c.addView(this.f554c.f1832d);
        }
        this.f554c.m3461v();
        this.f554c.requestLayout();
        ycVar.e(true);
        if (this.f554c.f1832d instanceof wz) {
            ((wz) this.f554c.f1832d).a();
        }
        return true;
    }

    public boolean m952c(yc ycVar) {
        if (this.f554c.f1832d instanceof wz) {
            ((wz) this.f554c.f1832d).b();
        }
        this.f554c.removeView(this.f554c.f1832d);
        this.f554c.removeView(this.f554c.f1831c);
        this.f554c.f1832d = null;
        this.f554c.m3462w();
        this.f553b = null;
        this.f554c.requestLayout();
        ycVar.e(false);
        return true;
    }
}

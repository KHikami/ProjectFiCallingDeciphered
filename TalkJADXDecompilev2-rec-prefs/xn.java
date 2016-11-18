package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

public abstract class xn implements yn {
    public Context f35697a;
    public Context f35698b;
    public xy f35699c;
    public LayoutInflater f35700d;
    public LayoutInflater f35701e;
    public yp f35702f;
    private yo f35703g;
    private int f35704h;
    private int f35705i;
    private int f35706j;

    public abstract void mo4546a(yc ycVar, yq yqVar);

    public xn(Context context, int i, int i2) {
        this.f35697a = context;
        this.f35700d = LayoutInflater.from(context);
        this.f35704h = i;
        this.f35705i = i2;
    }

    public void mo4509a(Context context, xy xyVar) {
        this.f35698b = context;
        this.f35701e = LayoutInflater.from(this.f35698b);
        this.f35699c = xyVar;
    }

    public yp mo4545a(ViewGroup viewGroup) {
        if (this.f35702f == null) {
            this.f35702f = (yp) this.f35700d.inflate(this.f35704h, viewGroup, false);
            this.f35702f.m41521a(this.f35699c);
            mo4513b(true);
        }
        return this.f35702f;
    }

    public void mo4513b(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.f35702f;
        if (viewGroup != null) {
            int i;
            if (this.f35699c != null) {
                this.f35699c.m41441l();
                ArrayList k = this.f35699c.m41440k();
                int size = k.size();
                int i2 = 0;
                i = 0;
                while (i2 < size) {
                    int i3;
                    yc ycVar = (yc) k.get(i2);
                    if (mo4548a(ycVar)) {
                        View childAt = viewGroup.getChildAt(i);
                        yc a = childAt instanceof yq ? ((yq) childAt).m41522a() : null;
                        View a2 = mo4544a(ycVar, childAt, viewGroup);
                        if (ycVar != a) {
                            a2.setPressed(false);
                            oa.f31462a.mo4103h(a2);
                        }
                        if (a2 != childAt) {
                            m41328a(a2, i);
                        }
                        i3 = i + 1;
                    } else {
                        i3 = i;
                    }
                    i2++;
                    i = i3;
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (!mo4547a(viewGroup, i)) {
                    i++;
                }
            }
        }
    }

    protected void m41328a(View view, int i) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f35702f).addView(view, i);
    }

    public boolean mo4547a(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    public void mo4511a(yo yoVar) {
        this.f35703g = yoVar;
    }

    public yo m41324a() {
        return this.f35703g;
    }

    public yq m41335b(ViewGroup viewGroup) {
        return (yq) this.f35700d.inflate(this.f35705i, viewGroup, false);
    }

    public View mo4544a(yc ycVar, View view, ViewGroup viewGroup) {
        yq yqVar;
        if (view instanceof yq) {
            yqVar = (yq) view;
        } else {
            yqVar = m41335b(viewGroup);
        }
        mo4546a(ycVar, yqVar);
        return (View) yqVar;
    }

    public boolean mo4548a(yc ycVar) {
        return true;
    }

    public void mo4510a(xy xyVar, boolean z) {
        if (this.f35703g != null) {
            this.f35703g.mo4441a(xyVar, z);
        }
    }

    public boolean mo4512a(yv yvVar) {
        if (this.f35703g != null) {
            return this.f35703g.mo4442a(yvVar);
        }
        return false;
    }

    public boolean mo4514b() {
        return false;
    }

    public boolean mo4515b(yc ycVar) {
        return false;
    }

    public boolean mo4516c(yc ycVar) {
        return false;
    }

    public void m41326a(int i) {
        this.f35706j = i;
    }
}

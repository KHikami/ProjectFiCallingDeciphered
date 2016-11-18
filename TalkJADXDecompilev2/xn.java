package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

public abstract class xn implements yn {
    public Context a;
    public Context b;
    public xy c;
    public LayoutInflater d;
    public LayoutInflater e;
    public yp f;
    private yo g;
    private int h;
    private int i;
    private int j;

    public abstract void a(yc ycVar, yq yqVar);

    public xn(Context context, int i, int i2) {
        this.a = context;
        this.d = LayoutInflater.from(context);
        this.h = i;
        this.i = i2;
    }

    public void a(Context context, xy xyVar) {
        this.b = context;
        this.e = LayoutInflater.from(this.b);
        this.c = xyVar;
    }

    public yp a(ViewGroup viewGroup) {
        if (this.f == null) {
            this.f = (yp) this.d.inflate(this.h, viewGroup, false);
            this.f.a(this.c);
            b(true);
        }
        return this.f;
    }

    public void b(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.f;
        if (viewGroup != null) {
            int i;
            if (this.c != null) {
                this.c.l();
                ArrayList k = this.c.k();
                int size = k.size();
                int i2 = 0;
                i = 0;
                while (i2 < size) {
                    int i3;
                    yc ycVar = (yc) k.get(i2);
                    if (a(ycVar)) {
                        View childAt = viewGroup.getChildAt(i);
                        yc a = childAt instanceof yq ? ((yq) childAt).a() : null;
                        View a2 = a(ycVar, childAt, viewGroup);
                        if (ycVar != a) {
                            a2.setPressed(false);
                            oa.a.h(a2);
                        }
                        if (a2 != childAt) {
                            a(a2, i);
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
                if (!a(viewGroup, i)) {
                    i++;
                }
            }
        }
    }

    protected void a(View view, int i) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f).addView(view, i);
    }

    public boolean a(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    public void a(yo yoVar) {
        this.g = yoVar;
    }

    public yo a() {
        return this.g;
    }

    public yq b(ViewGroup viewGroup) {
        return (yq) this.d.inflate(this.i, viewGroup, false);
    }

    public View a(yc ycVar, View view, ViewGroup viewGroup) {
        yq yqVar;
        if (view instanceof yq) {
            yqVar = (yq) view;
        } else {
            yqVar = b(viewGroup);
        }
        a(ycVar, yqVar);
        return (View) yqVar;
    }

    public boolean a(yc ycVar) {
        return true;
    }

    public void a(xy xyVar, boolean z) {
        if (this.g != null) {
            this.g.a(xyVar, z);
        }
    }

    public boolean a(yv yvVar) {
        if (this.g != null) {
            return this.g.a(yvVar);
        }
        return false;
    }

    public boolean b() {
        return false;
    }

    public boolean b(yc ycVar) {
        return false;
    }

    public boolean c(yc ycVar) {
        return false;
    }

    public void a(int i) {
        this.j = i;
    }
}

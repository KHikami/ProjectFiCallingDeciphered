import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: PG */
public abstract class sj implements tj {
    public Context a;
    public Context b;
    public su c;
    public tk d;
    public tl e;
    private LayoutInflater f;
    private int g;
    private int h;

    public abstract void a(sy syVar, tm tmVar);

    public sj(Context context, int i, int i2) {
        this.a = context;
        this.f = LayoutInflater.from(context);
        this.g = i;
        this.h = i2;
    }

    public void a(Context context, su suVar) {
        this.b = context;
        LayoutInflater.from(this.b);
        this.c = suVar;
    }

    public tl a(ViewGroup viewGroup) {
        if (this.e == null) {
            this.e = (tl) this.f.inflate(this.g, viewGroup, false);
            this.e.a(this.c);
            b(true);
        }
        return this.e;
    }

    public void b(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.e;
        if (viewGroup != null) {
            int i;
            if (this.c != null) {
                this.c.i();
                ArrayList h = this.c.h();
                int size = h.size();
                int i2 = 0;
                i = 0;
                while (i2 < size) {
                    int i3;
                    sy syVar = (sy) h.get(i2);
                    if (a(syVar)) {
                        View childAt = viewGroup.getChildAt(i);
                        sy a = childAt instanceof tm ? ((tm) childAt).a() : null;
                        View a2 = a(syVar, childAt, viewGroup);
                        if (syVar != a) {
                            a2.setPressed(false);
                            kn.a.i(a2);
                        }
                        if (a2 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) a2.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(a2);
                            }
                            ((ViewGroup) this.e).addView(a2, i);
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

    public boolean a(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    public final void a(tk tkVar) {
        this.d = tkVar;
    }

    public View a(sy syVar, View view, ViewGroup viewGroup) {
        tm tmVar;
        if (view instanceof tm) {
            tmVar = (tm) view;
        } else {
            tmVar = (tm) this.f.inflate(this.h, viewGroup, false);
        }
        a(syVar, tmVar);
        return (View) tmVar;
    }

    public boolean a(sy syVar) {
        return true;
    }

    public void a(su suVar, boolean z) {
        if (this.d != null) {
            this.d.a(suVar, z);
        }
    }

    public boolean a(tr trVar) {
        if (this.d != null) {
            return this.d.a(trVar);
        }
        return false;
    }

    public boolean a() {
        return false;
    }

    public final boolean b(sy syVar) {
        return false;
    }

    public final boolean c(sy syVar) {
        return false;
    }
}

package defpackage;

import android.content.Context;
import android.support.v7.view.menu.ExpandedMenuView;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;

public final class xv implements OnItemClickListener, yn {
    Context a;
    LayoutInflater b;
    xy c;
    ExpandedMenuView d;
    int e;
    int f;
    int g;
    xw h;
    private yo i;

    public xv(Context context, int i) {
        this(i, 0);
        this.a = context;
        this.b = LayoutInflater.from(this.a);
    }

    private xv(int i, int i2) {
        this.g = i;
        this.f = 0;
    }

    public void a(Context context, xy xyVar) {
        if (this.f != 0) {
            this.a = new ContextThemeWrapper(context, this.f);
            this.b = LayoutInflater.from(this.a);
        } else if (this.a != null) {
            this.a = context;
            if (this.b == null) {
                this.b = LayoutInflater.from(this.a);
            }
        }
        this.c = xyVar;
        if (this.h != null) {
            this.h.notifyDataSetChanged();
        }
    }

    public yp a(ViewGroup viewGroup) {
        if (this.d == null) {
            this.d = (ExpandedMenuView) this.b.inflate(gwb.bS, viewGroup, false);
            if (this.h == null) {
                this.h = new xw(this);
            }
            this.d.setAdapter(this.h);
            this.d.setOnItemClickListener(this);
        }
        return this.d;
    }

    public ListAdapter a() {
        if (this.h == null) {
            this.h = new xw(this);
        }
        return this.h;
    }

    public void b(boolean z) {
        if (this.h != null) {
            this.h.notifyDataSetChanged();
        }
    }

    public void a(yo yoVar) {
        this.i = yoVar;
    }

    public boolean a(yv yvVar) {
        if (!yvVar.hasVisibleItems()) {
            return false;
        }
        new yb(yvVar).a(null);
        if (this.i != null) {
            this.i.a(yvVar);
        }
        return true;
    }

    public void a(xy xyVar, boolean z) {
        if (this.i != null) {
            this.i.a(xyVar, z);
        }
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.c.a(this.h.a(i), (yn) this, 0);
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
}

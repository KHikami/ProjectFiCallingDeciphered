package p000;

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
    Context f35742a;
    LayoutInflater f35743b;
    xy f35744c;
    ExpandedMenuView f35745d;
    int f35746e;
    int f35747f;
    int f35748g;
    xw f35749h;
    private yo f35750i;

    public xv(Context context, int i) {
        this(i, 0);
        this.f35742a = context;
        this.f35743b = LayoutInflater.from(this.f35742a);
    }

    private xv(int i, int i2) {
        this.f35748g = i;
        this.f35747f = 0;
    }

    public void mo4509a(Context context, xy xyVar) {
        if (this.f35747f != 0) {
            this.f35742a = new ContextThemeWrapper(context, this.f35747f);
            this.f35743b = LayoutInflater.from(this.f35742a);
        } else if (this.f35742a != null) {
            this.f35742a = context;
            if (this.f35743b == null) {
                this.f35743b = LayoutInflater.from(this.f35742a);
            }
        }
        this.f35744c = xyVar;
        if (this.f35749h != null) {
            this.f35749h.notifyDataSetChanged();
        }
    }

    public yp m41385a(ViewGroup viewGroup) {
        if (this.f35745d == null) {
            this.f35745d = (ExpandedMenuView) this.f35743b.inflate(gwb.bS, viewGroup, false);
            if (this.f35749h == null) {
                this.f35749h = new xw(this);
            }
            this.f35745d.setAdapter(this.f35749h);
            this.f35745d.setOnItemClickListener(this);
        }
        return this.f35745d;
    }

    public ListAdapter m41384a() {
        if (this.f35749h == null) {
            this.f35749h = new xw(this);
        }
        return this.f35749h;
    }

    public void mo4513b(boolean z) {
        if (this.f35749h != null) {
            this.f35749h.notifyDataSetChanged();
        }
    }

    public void mo4511a(yo yoVar) {
        this.f35750i = yoVar;
    }

    public boolean mo4512a(yv yvVar) {
        if (!yvVar.hasVisibleItems()) {
            return false;
        }
        new yb(yvVar).m41466a(null);
        if (this.f35750i != null) {
            this.f35750i.mo4442a(yvVar);
        }
        return true;
    }

    public void mo4510a(xy xyVar, boolean z) {
        if (this.f35750i != null) {
            this.f35750i.mo4441a(xyVar, z);
        }
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f35744c.m41419a(this.f35749h.m41395a(i), (yn) this, 0);
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
}

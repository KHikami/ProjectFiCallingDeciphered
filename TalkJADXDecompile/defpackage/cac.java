package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* renamed from: cac */
final class cac extends byo implements byr, jza, kcq {
    private final Context a;
    private final kbu b;
    private final List<cae> c;
    private final List<Boolean> d;
    private ViewGroup e;

    public cac(Context context, kbu kbu, Iterable<byn> iterable) {
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.a = context;
        this.b = kbu;
        kbu.a((kcq) this);
        for (byn byn : iterable) {
            Object cab;
            if (byn instanceof bym) {
                cab = new cab(this.a, this.b, (bym) byn);
            } else {
                cab = new cae(this.a, this.b, byn);
            }
            this.c.add(cab);
            this.d.add(Boolean.valueOf(byn.e()));
        }
    }

    public void a(Context context, jyn jyn, Bundle bundle) {
        ((byq) jyn.a(byq.class)).a((byr) this);
    }

    public int getCount() {
        return this.c.size();
    }

    public Object getItem(int i) {
        return ((cae) this.c.get(i)).a();
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        this.e = viewGroup;
        this.d.set(i, Boolean.valueOf(((cae) this.c.get(i)).a().e()));
        return ((cae) this.c.get(i)).a(view, viewGroup);
    }

    public void a() {
        int i;
        int i2 = 0;
        for (int i3 = 0; i3 < this.c.size(); i3++) {
            if (((cae) this.c.get(i3)).a().e() != gwb.b((Boolean) this.d.get(i3))) {
                i = 1;
                break;
            }
        }
        i = 0;
        if (i != 0) {
            notifyDataSetChanged();
        } else if (this.e != null) {
            while (i2 < this.e.getChildCount()) {
                View childAt = this.e.getChildAt(i2);
                if (childAt.getTag() instanceof caf) {
                    ((caf) childAt.getTag()).a();
                }
                i2++;
            }
        }
    }
}

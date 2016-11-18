package p000;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

final class cac extends byo implements byr, jza, kcq {
    private final Context f4898a;
    private final kbu f4899b;
    private final List<cae> f4900c = new ArrayList();
    private final List<Boolean> f4901d = new ArrayList();
    private ViewGroup f4902e;

    public cac(Context context, kbu kbu, Iterable<byn> iterable) {
        this.f4898a = context;
        this.f4899b = kbu;
        kbu.m25514a((kcq) this);
        for (byn byn : iterable) {
            Object cab;
            if (byn instanceof bym) {
                cab = new cab(this.f4898a, this.f4899b, (bym) byn);
            } else {
                cab = new cae(this.f4898a, this.f4899b, byn);
            }
            this.f4900c.add(cab);
            this.f4901d.add(Boolean.valueOf(byn.mo780e()));
        }
    }

    public void mo479a(Context context, jyn jyn, Bundle bundle) {
        ((byq) jyn.m25443a(byq.class)).m6924a((byr) this);
    }

    public int getCount() {
        return this.f4900c.size();
    }

    public Object getItem(int i) {
        return ((cae) this.f4900c.get(i)).m7072a();
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        this.f4902e = viewGroup;
        this.f4901d.set(i, Boolean.valueOf(((cae) this.f4900c.get(i)).m7072a().mo780e()));
        return ((cae) this.f4900c.get(i)).m7071a(view, viewGroup);
    }

    public void mo798a() {
        int i;
        int i2 = 0;
        for (int i3 = 0; i3 < this.f4900c.size(); i3++) {
            if (((cae) this.f4900c.get(i3)).m7072a().mo780e() != gwb.m2061b((Boolean) this.f4901d.get(i3))) {
                i = 1;
                break;
            }
        }
        i = 0;
        if (i != 0) {
            notifyDataSetChanged();
        } else if (this.f4902e != null) {
            while (i2 < this.f4902e.getChildCount()) {
                View childAt = this.f4902e.getChildAt(i2);
                if (childAt.getTag() instanceof caf) {
                    ((caf) childAt.getTag()).m7079a();
                }
                i2++;
            }
        }
    }
}

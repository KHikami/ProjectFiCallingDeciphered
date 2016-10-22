package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: dch */
final class dch extends dbz implements dcg {
    final /* synthetic */ dca a;
    private View b;

    public dch(dca dca, Resources resources) {
        this.a = dca;
        super(resources, dca.c);
        dca.a.a((dcg) this);
    }

    public void a(View view) {
        this.b = view;
    }

    public int getCount() {
        return Math.min(this.a.a.a().size(), this.a.d);
    }

    public long getItemId(int i) {
        return (long) gwb.a((Integer) this.a.a.a().get(i));
    }

    public void x_() {
        if (this.b != null && this.a.a.a().size() > 0) {
            this.b.findViewById(ba.aX).setVisibility(0);
            ViewGroup viewGroup = (ViewGroup) this.b.findViewById(ba.eH);
            viewGroup.setVisibility(8);
            viewGroup.removeViewAt(0);
            this.b = null;
            notifyDataSetChanged();
        }
    }
}

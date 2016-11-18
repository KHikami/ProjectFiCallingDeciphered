package p000;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;

final class dch extends dbz implements dcg {
    final /* synthetic */ dca f9512a;
    private View f9513b;

    public dch(dca dca, Resources resources) {
        this.f9512a = dca;
        super(resources, dca.f9492c);
        dca.f9490a.m11443a((dcg) this);
    }

    public void m11447a(View view) {
        this.f9513b = view;
    }

    public int getCount() {
        return Math.min(this.f9512a.f9490a.m11441a().size(), this.f9512a.f9493d);
    }

    public long getItemId(int i) {
        return (long) gwb.m1507a((Integer) this.f9512a.f9490a.m11441a().get(i));
    }

    public void x_() {
        if (this.f9513b != null && this.f9512a.f9490a.m11441a().size() > 0) {
            this.f9513b.findViewById(ba.aX).setVisibility(0);
            ViewGroup viewGroup = (ViewGroup) this.f9513b.findViewById(ba.eH);
            viewGroup.setVisibility(8);
            viewGroup.removeViewAt(0);
            this.f9513b = null;
            notifyDataSetChanged();
        }
    }
}

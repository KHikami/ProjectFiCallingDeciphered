package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public final class dqw {
    public final int f10371a;
    public final int f10372b;
    private final int f10373c;

    public dqw(int i, int i2, int i3) {
        this.f10371a = i3;
        this.f10372b = i;
        this.f10373c = i2;
    }

    public View m12524a(ViewGroup viewGroup, dqs dqs) {
        View inflate = ((LayoutInflater) viewGroup.getContext().getSystemService("layout_inflater")).inflate(this.f10373c, viewGroup, false);
        ((TextView) inflate.findViewById(gwb.qK)).setText(this.f10372b);
        View findViewById = inflate.findViewById(gwb.qA);
        if (findViewById != null) {
            findViewById.setOnClickListener(new dqx(this, dqs));
        }
        findViewById = inflate.findViewById(gwb.qz);
        if (findViewById != null) {
            findViewById.setOnClickListener(new dqy(this, dqs));
        }
        return inflate;
    }
}

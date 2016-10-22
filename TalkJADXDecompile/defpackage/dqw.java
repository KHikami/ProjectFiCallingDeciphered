package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* renamed from: dqw */
public final class dqw {
    public final int a;
    public final int b;
    private final int c;

    public dqw(int i, int i2, int i3) {
        this.a = i3;
        this.b = i;
        this.c = i2;
    }

    public View a(ViewGroup viewGroup, dqs dqs) {
        View inflate = ((LayoutInflater) viewGroup.getContext().getSystemService("layout_inflater")).inflate(this.c, viewGroup, false);
        ((TextView) inflate.findViewById(gwb.qK)).setText(this.b);
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

package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.people.accountswitcherview.ExpanderView;
import com.google.android.gms.people.accountswitcherview.SelectedAccountNavigationView;

public final class htr implements htv {
    final /* synthetic */ SelectedAccountNavigationView f17261a;

    public htr(SelectedAccountNavigationView selectedAccountNavigationView) {
        this.f17261a = selectedAccountNavigationView;
    }

    public htu mo1776a(View view) {
        htu htu = new htu();
        htu.f10856l = view;
        htu.f10857m = view.findViewById(gwb.xr);
        htu.f10860p = view.findViewById(gwb.xs);
        htu.f10866v = (ImageView) htu.f10860p;
        htu.f10861q = (TextView) view.findViewById(gwb.xn);
        htu.f10862r = (TextView) view.findViewById(gwb.xm);
        htu.f10865u = (ImageView) view.findViewById(gwb.xx);
        htu.f10858n = (ExpanderView) view.findViewById(gwb.xo);
        htu.f10859o = view.findViewById(gwb.xp);
        htu.f10855k = view.findViewById(gwb.xF);
        htu.f10854I = this.f17261a.findViewById(gwb.xq);
        if (this.f17261a.f7778g) {
            htu.f10863s = view.findViewById(gwb.xt);
            htu.f10867w = (ImageView) view.findViewById(gwb.xu);
            htu.f10864t = view.findViewById(gwb.xv);
            htu.f10868x = (ImageView) view.findViewById(gwb.xw);
            if (htu.f10867w == null && (htu.f10863s instanceof ImageView)) {
                htu.f10867w = (ImageView) htu.f10863s;
            }
            if (htu.f10868x == null && (htu.f10864t instanceof ImageView)) {
                htu.f10868x = (ImageView) htu.f10864t;
            }
            htu.f10847B = view.findViewById(gwb.xC);
            htu.f10851F = (ImageView) htu.f10847B;
            htu.f10848C = (ImageView) view.findViewById(gwb.xD);
            htu.f10869y = view.findViewById(gwb.xE);
            htu.f10870z = (TextView) view.findViewById(gwb.xB);
            htu.f10846A = (TextView) view.findViewById(gwb.xA);
            htu.f10849D = view.findViewById(gwb.xy);
            htu.f10852G = (ImageView) htu.f10849D;
            htu.f10850E = view.findViewById(gwb.xz);
            htu.f10853H = (ImageView) htu.f10850E;
        }
        return htu;
    }
}

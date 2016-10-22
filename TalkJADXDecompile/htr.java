import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.people.accountswitcherview.ExpanderView;
import com.google.android.gms.people.accountswitcherview.SelectedAccountNavigationView;

public final class htr implements htv {
    final /* synthetic */ SelectedAccountNavigationView a;

    public htr(SelectedAccountNavigationView selectedAccountNavigationView) {
        this.a = selectedAccountNavigationView;
    }

    public htu a(View view) {
        htu htu = new htu();
        htu.l = view;
        htu.m = view.findViewById(gwb.xr);
        htu.p = view.findViewById(gwb.xs);
        htu.v = (ImageView) htu.p;
        htu.q = (TextView) view.findViewById(gwb.xn);
        htu.r = (TextView) view.findViewById(gwb.xm);
        htu.u = (ImageView) view.findViewById(gwb.xx);
        htu.n = (ExpanderView) view.findViewById(gwb.xo);
        htu.o = view.findViewById(gwb.xp);
        htu.k = view.findViewById(gwb.xF);
        htu.I = this.a.findViewById(gwb.xq);
        if (this.a.g) {
            htu.s = view.findViewById(gwb.xt);
            htu.w = (ImageView) view.findViewById(gwb.xu);
            htu.t = view.findViewById(gwb.xv);
            htu.x = (ImageView) view.findViewById(gwb.xw);
            if (htu.w == null && (htu.s instanceof ImageView)) {
                htu.w = (ImageView) htu.s;
            }
            if (htu.x == null && (htu.t instanceof ImageView)) {
                htu.x = (ImageView) htu.t;
            }
            htu.B = view.findViewById(gwb.xC);
            htu.F = (ImageView) htu.B;
            htu.C = (ImageView) view.findViewById(gwb.xD);
            htu.y = view.findViewById(gwb.xE);
            htu.z = (TextView) view.findViewById(gwb.xB);
            htu.A = (TextView) view.findViewById(gwb.xA);
            htu.D = view.findViewById(gwb.xy);
            htu.G = (ImageView) htu.D;
            htu.E = view.findViewById(gwb.xz);
            htu.H = (ImageView) htu.E;
        }
        return htu;
    }
}

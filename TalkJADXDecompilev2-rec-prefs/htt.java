package p000;

import com.google.android.apps.hangouts.navigation.NavigationDrawerFragment;
import java.util.List;

public class htt {
    public final /* synthetic */ NavigationDrawerFragment f17262a;

    public void m20831a(htu htu, hwn hwn, List<hwn> list) {
        dyv dyv = (dyv) htu;
        bko a = fde.m14994a(hwn.mo1778a());
        if (a == null || !a.m5644m()) {
            dyv.f10871a.setVisibility(8);
            dyv.f10872b.setVisibility(8);
        } else {
            dyv.f10871a.setVisibility(0);
            dyv.f10872b.setVisibility(0);
            StringBuilder stringBuilder = new StringBuilder();
            gld.m17929a(stringBuilder, this.f17262a.getString(bc.kb, hwn.mo1778a()));
            gld.m17929a(stringBuilder, this.f17262a.getContext().getResources().getText(bc.kI));
            dyv.l.setContentDescription(stringBuilder.toString());
        }
        if (hwn.mo1779b() || hwn == this.f17262a.aq) {
            htu.f10862r.setText(null);
        }
        if (list.size() > 0) {
            this.f17262a.m8745a((hwn) list.get(0), dyv.s, dyv.f10874d, dyv.f10876f, dyv.f10873c, dyv.f10875e);
        }
        if (list.size() > 1) {
            this.f17262a.m8745a((hwn) list.get(1), dyv.t, dyv.f10878h, dyv.f10880j, dyv.f10877g, dyv.f10879i);
        }
    }

    public htt(NavigationDrawerFragment navigationDrawerFragment) {
        this.f17262a = navigationDrawerFragment;
    }
}

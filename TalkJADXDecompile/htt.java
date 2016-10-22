import com.google.android.apps.hangouts.navigation.NavigationDrawerFragment;
import java.util.List;

public class htt {
    public final /* synthetic */ NavigationDrawerFragment a;

    public void a(htu htu, hwn hwn, List<hwn> list) {
        dyv dyv = (dyv) htu;
        bko a = fde.a(hwn.a());
        if (a == null || !a.m()) {
            dyv.a.setVisibility(8);
            dyv.b.setVisibility(8);
        } else {
            dyv.a.setVisibility(0);
            dyv.b.setVisibility(0);
            StringBuilder stringBuilder = new StringBuilder();
            gld.a(stringBuilder, this.a.getString(bc.kb, hwn.a()));
            gld.a(stringBuilder, this.a.getContext().getResources().getText(bc.kI));
            dyv.l.setContentDescription(stringBuilder.toString());
        }
        if (hwn.b() || hwn == this.a.aq) {
            htu.r.setText(null);
        }
        if (list.size() > 0) {
            this.a.a((hwn) list.get(0), dyv.s, dyv.d, dyv.f, dyv.c, dyv.e);
        }
        if (list.size() > 1) {
            this.a.a((hwn) list.get(1), dyv.t, dyv.h, dyv.j, dyv.g, dyv.i);
        }
    }

    public htt(NavigationDrawerFragment navigationDrawerFragment) {
        this.a = navigationDrawerFragment;
    }
}

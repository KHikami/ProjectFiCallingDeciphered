package p000;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import com.google.android.apps.hangouts.navigation.NavigationDrawerFragment;

public class hte {
    public final /* synthetic */ NavigationDrawerFragment f17251a;

    public void m20828a(htf htf, hwn hwn) {
        if (this.f17251a.isAdded()) {
            Resources resources = this.f17251a.context.getResources();
            dys dys = (dys) htf;
            bko a = fde.m14994a(hwn.mo1778a());
            boolean z = a != null && a.m5644m();
            if (z) {
                dys.f10843b.setVisibility(0);
            } else {
                dys.f10843b.setVisibility(8);
            }
            if (hwn.mo1779b()) {
                dys.f10843b.setVisibility(8);
                dys.d.setText(hwn.mo1780c());
                dys.e.setImageDrawable(new BitmapDrawable(resources, ((boz) jyn.m25426a(this.f17251a.context, boz.class)).mo638b()));
            }
            boolean d = fde.m15015d(a);
            if (d) {
                dys.f10844c.setVisibility(0);
                dys.d.setTextAppearance(this.f17251a.context, gwb.iy);
                dys.d.setText(resources.getString(bc.hd, new Object[]{dys.d.getText()}));
            } else {
                dys.f10844c.setVisibility(4);
                dys.d.setTextAppearance(this.f17251a.context, gwb.iz);
            }
            dys.f10842a.setContentDescription(this.f17251a.m8747a(hwn.mo1778a(), d, z));
        }
    }

    public hte(NavigationDrawerFragment navigationDrawerFragment) {
        this.f17251a = navigationDrawerFragment;
    }
}

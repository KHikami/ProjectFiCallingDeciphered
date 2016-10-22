package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import com.google.android.apps.hangouts.navigation.NavigationDrawerFragment;

/* renamed from: hte */
public class hte {
    public final /* synthetic */ NavigationDrawerFragment a;

    public void a(htf htf, hwn hwn) {
        if (this.a.isAdded()) {
            Resources resources = this.a.context.getResources();
            dys dys = (dys) htf;
            bko a = fde.a(hwn.a());
            boolean z = a != null && a.m();
            if (z) {
                dys.b.setVisibility(0);
            } else {
                dys.b.setVisibility(8);
            }
            if (hwn.b()) {
                dys.b.setVisibility(8);
                dys.d.setText(hwn.c());
                dys.e.setImageDrawable(new BitmapDrawable(resources, ((boz) jyn.a(this.a.context, boz.class)).b()));
            }
            boolean d = fde.d(a);
            if (d) {
                dys.c.setVisibility(0);
                dys.d.setTextAppearance(this.a.context, gwb.iy);
                dys.d.setText(resources.getString(bc.hd, new Object[]{dys.d.getText()}));
            } else {
                dys.c.setVisibility(4);
                dys.d.setTextAppearance(this.a.context, gwb.iz);
            }
            dys.a.setContentDescription(this.a.a(hwn.a(), d, z));
        }
    }

    public hte(NavigationDrawerFragment navigationDrawerFragment) {
        this.a = navigationDrawerFragment;
    }
}

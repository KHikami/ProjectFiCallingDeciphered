package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.hangouts.navigation.NavigationDrawerFragment;

/* renamed from: dyr */
public final class dyr implements htg {
    final /* synthetic */ NavigationDrawerFragment a;

    public dyr(NavigationDrawerFragment navigationDrawerFragment) {
        this.a = navigationDrawerFragment;
    }

    public htf a(View view) {
        htf dys = new dys();
        dys.a = view;
        dys.e = (ImageView) view.findViewById(ba.A);
        dys.d = (TextView) view.findViewById(ba.l);
        dys.b = (ImageView) view.findViewById(ba.fk);
        dys.c = (ImageView) view.findViewById(ba.E);
        return dys;
    }
}

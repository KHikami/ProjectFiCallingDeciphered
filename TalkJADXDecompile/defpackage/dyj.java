package defpackage;

import android.os.Build.VERSION;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewStub.OnInflateListener;
import android.widget.FrameLayout;
import android.widget.ListView;
import com.google.android.apps.hangouts.navigation.NavigationDrawerFragment;
import com.google.android.gms.people.accountswitcherview.SelectedAccountNavigationView;

/* renamed from: dyj */
public final class dyj implements OnInflateListener {
    final /* synthetic */ LayoutInflater a;
    final /* synthetic */ ViewGroup b;
    final /* synthetic */ NavigationDrawerFragment c;

    public dyj(NavigationDrawerFragment navigationDrawerFragment, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.c = navigationDrawerFragment;
        this.a = layoutInflater;
        this.b = viewGroup;
    }

    public void onInflate(ViewStub viewStub, View view) {
        this.c.aj = (ListView) view;
        this.c.e = (SelectedAccountNavigationView) this.a.inflate(gwb.fG, this.b);
        this.c.e.a(true);
        this.c.e.a(this.c.f);
        this.c.e.a(this.c.g);
        this.c.e.a(this.c);
        this.c.e.a(this.c);
        this.c.e.a(gwb.hs, this.c.ay, this.c.az);
        this.c.e.c(0);
        if (this.c.al != null) {
            this.c.e.a(this.c.al);
        }
        this.c.e.a(this.c.am, this.c.an);
        NavigationDrawerFragment navigationDrawerFragment = this.c;
        SelectedAccountNavigationView selectedAccountNavigationView = this.c.e;
        if (VERSION.SDK_INT >= 21) {
            FrameLayout frameLayout = selectedAccountNavigationView;
            frameLayout.setFitsSystemWindows(true);
            frameLayout.setOnApplyWindowInsetsListener(new dyw(navigationDrawerFragment));
            frameLayout.setForegroundGravity(55);
            navigationDrawerFragment.au = new hth();
            frameLayout.setForeground(navigationDrawerFragment.au);
        }
        this.c.aj.addHeaderView(this.c.e);
        this.c.aj.setAdapter(this.c.h);
        this.c.aj.addHeaderView(this.a.inflate(gwb.hh, this.c.aj, false));
        this.c.aj.setOnItemClickListener(this.c.av);
    }
}

package p000;

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

public final class dyj implements OnInflateListener {
    final /* synthetic */ LayoutInflater f10826a;
    final /* synthetic */ ViewGroup f10827b;
    final /* synthetic */ NavigationDrawerFragment f10828c;

    public dyj(NavigationDrawerFragment navigationDrawerFragment, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.f10828c = navigationDrawerFragment;
        this.f10826a = layoutInflater;
        this.f10827b = viewGroup;
    }

    public void onInflate(ViewStub viewStub, View view) {
        this.f10828c.aj = (ListView) view;
        this.f10828c.f6506e = (SelectedAccountNavigationView) this.f10826a.inflate(gwb.fG, this.f10827b);
        this.f10828c.f6506e.m9971a(true);
        this.f10828c.f6506e.m9962a(this.f10828c.f6507f);
        this.f10828c.f6506e.m9963a(this.f10828c.f6508g);
        this.f10828c.f6506e.m9965a(this.f10828c);
        this.f10828c.f6506e.m9966a(this.f10828c);
        this.f10828c.f6506e.m9961a(gwb.hs, this.f10828c.ay, this.f10828c.az);
        this.f10828c.f6506e.m9975c(0);
        if (this.f10828c.al != null) {
            this.f10828c.f6506e.m9968a(this.f10828c.al);
        }
        this.f10828c.f6506e.m9970a(this.f10828c.am, this.f10828c.an);
        NavigationDrawerFragment navigationDrawerFragment = this.f10828c;
        SelectedAccountNavigationView selectedAccountNavigationView = this.f10828c.f6506e;
        if (VERSION.SDK_INT >= 21) {
            FrameLayout frameLayout = selectedAccountNavigationView;
            frameLayout.setFitsSystemWindows(true);
            frameLayout.setOnApplyWindowInsetsListener(new dyw(navigationDrawerFragment));
            frameLayout.setForegroundGravity(55);
            navigationDrawerFragment.au = new hth();
            frameLayout.setForeground(navigationDrawerFragment.au);
        }
        this.f10828c.aj.addHeaderView(this.f10828c.f6506e);
        this.f10828c.aj.setAdapter(this.f10828c.f6509h);
        this.f10828c.aj.addHeaderView(this.f10826a.inflate(gwb.hh, this.f10828c.aj, false));
        this.f10828c.aj.setOnItemClickListener(this.f10828c.av);
    }
}

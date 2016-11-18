package p000;

import android.widget.TabHost.OnTabChangeListener;
import com.google.android.apps.hangouts.util.TabHostEx;

public final class gkz implements OnTabChangeListener {
    final /* synthetic */ TabHostEx f15529a;

    public gkz(TabHostEx tabHostEx) {
        this.f15529a = tabHostEx;
    }

    public void onTabChanged(String str) {
        goz h = this.f15529a.f6838a.mo1269h();
        int a = h.m18242a(str);
        this.f15529a.f6838a.m3190b(a);
        this.f15529a.m9215a(a);
        gwb.m1823a(fde.m15018e(this.f15529a.f6839b.mo2317a()), h.m18247d(a).f15837c);
    }
}

package defpackage;

import com.google.android.apps.hangouts.util.TabHostEx;

public final class gky extends ph {
    final /* synthetic */ TabHostEx a;

    public gky(TabHostEx tabHostEx) {
        this.a = tabHostEx;
    }

    public void a(int i) {
        this.a.setOnTabChangedListener(null);
        this.a.setCurrentTab(i);
        this.a.a(i);
        this.a.setOnTabChangedListener(this.a.c);
    }
}

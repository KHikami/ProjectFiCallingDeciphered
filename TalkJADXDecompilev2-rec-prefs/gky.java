package p000;

import com.google.android.apps.hangouts.util.TabHostEx;

public final class gky extends ph {
    final /* synthetic */ TabHostEx f15528a;

    public gky(TabHostEx tabHostEx) {
        this.f15528a = tabHostEx;
    }

    public void m17916a(int i) {
        this.f15528a.setOnTabChangedListener(null);
        this.f15528a.setCurrentTab(i);
        this.f15528a.m9215a(i);
        this.f15528a.setOnTabChangedListener(this.f15528a.f6840c);
    }
}

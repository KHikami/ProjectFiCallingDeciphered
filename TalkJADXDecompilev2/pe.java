package defpackage;

import android.database.DataSetObserver;
import android.support.v4.view.ViewPager;

public final class pe extends DataSetObserver {
    final /* synthetic */ ViewPager a;

    public pe(ViewPager viewPager) {
        this.a = viewPager;
    }

    public void onChanged() {
        this.a.d();
    }

    public void onInvalidated() {
        this.a.d();
    }
}

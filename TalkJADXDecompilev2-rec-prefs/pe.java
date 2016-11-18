package p000;

import android.database.DataSetObserver;
import android.support.v4.view.ViewPager;

public final class pe extends DataSetObserver {
    final /* synthetic */ ViewPager f34985a;

    public pe(ViewPager viewPager) {
        this.f34985a = viewPager;
    }

    public void onChanged() {
        this.f34985a.d();
    }

    public void onInvalidated() {
        this.f34985a.d();
    }
}

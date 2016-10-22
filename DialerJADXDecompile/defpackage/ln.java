package defpackage;

import android.database.DataSetObserver;
import android.support.v4.view.ViewPager;

/* compiled from: PG */
/* renamed from: ln */
public final class ln extends DataSetObserver {
    private /* synthetic */ ViewPager a;

    public ln(ViewPager viewPager) {
        this.a = viewPager;
    }

    public final void onChanged() {
        this.a.a();
    }

    public final void onInvalidated() {
        this.a.a();
    }
}

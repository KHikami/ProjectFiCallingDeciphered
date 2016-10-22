package defpackage;

import android.database.DataSetObserver;
import android.support.v7.widget.ActivityChooserView;

/* compiled from: PG */
/* renamed from: uu */
public final class uu extends DataSetObserver {
    private /* synthetic */ ActivityChooserView a;

    public uu(ActivityChooserView activityChooserView) {
        this.a = activityChooserView;
    }

    public final void onChanged() {
        super.onChanged();
        this.a.a.notifyDataSetChanged();
    }

    public final void onInvalidated() {
        super.onInvalidated();
        this.a.a.notifyDataSetInvalidated();
    }
}

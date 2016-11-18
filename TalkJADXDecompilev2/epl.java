package defpackage;

import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import com.google.android.apps.hangouts.phone.ViewVCardActivity;

public final class epl implements OnChildClickListener {
    final /* synthetic */ ViewVCardActivity a;

    public epl(ViewVCardActivity viewVCardActivity) {
        this.a = viewVCardActivity;
    }

    public boolean onChildClick(ExpandableListView expandableListView, View view, int i, int i2, long j) {
        return !this.a.o;
    }
}

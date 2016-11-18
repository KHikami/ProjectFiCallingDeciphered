package p000;

import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import com.google.android.apps.hangouts.phone.ViewVCardActivity;

public final class epl implements OnChildClickListener {
    final /* synthetic */ ViewVCardActivity f11989a;

    public epl(ViewVCardActivity viewVCardActivity) {
        this.f11989a = viewVCardActivity;
    }

    public boolean onChildClick(ExpandableListView expandableListView, View view, int i, int i2, long j) {
        return !this.f11989a.f6706o;
    }
}

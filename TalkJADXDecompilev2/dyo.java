package defpackage;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.google.android.apps.hangouts.navigation.NavigationDrawerFragment;

public final class dyo implements OnItemClickListener {
    final /* synthetic */ NavigationDrawerFragment a;

    public dyo(NavigationDrawerFragment navigationDrawerFragment) {
        this.a = navigationDrawerFragment;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        iil.a("Expected null", this.a.ao);
        this.a.b.i(this.a.getView());
        int a = this.a.e.a();
        switch (this.a.e.a()) {
            case 0:
                Object obj = (dyy) this.a.aj.getItemAtPosition(i);
                iil.b("Expected non-null", obj);
                this.a.ao = new dyp(this, obj);
                return;
            case 1:
                a = i - this.a.aj.getHeaderViewsCount();
                int itemViewType = this.a.i.getItemViewType(a);
                hwn a2 = this.a.i.a(a);
                this.a.ao = new dyq(this, itemViewType, a2);
                return;
            default:
                this.a.ao = null;
                iil.a("Unknown navigation mode: " + a);
                return;
        }
    }
}

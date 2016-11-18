package p000;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.google.android.apps.hangouts.navigation.NavigationDrawerFragment;

public final class dyo implements OnItemClickListener {
    final /* synthetic */ NavigationDrawerFragment f10833a;

    public dyo(NavigationDrawerFragment navigationDrawerFragment) {
        this.f10833a = navigationDrawerFragment;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        iil.m21872a("Expected null", this.f10833a.ao);
        this.f10833a.f6503b.m3243i(this.f10833a.getView());
        int a = this.f10833a.f6506e.m9959a();
        switch (this.f10833a.f6506e.m9959a()) {
            case 0:
                Object obj = (dyy) this.f10833a.aj.getItemAtPosition(i);
                iil.m21875b("Expected non-null", obj);
                this.f10833a.ao = new dyp(this, obj);
                return;
            case 1:
                a = i - this.f10833a.aj.getHeaderViewsCount();
                int itemViewType = this.f10833a.f6510i.getItemViewType(a);
                hwn a2 = this.f10833a.f6510i.m20821a(a);
                this.f10833a.ao = new dyq(this, itemViewType, a2);
                return;
            default:
                this.f10833a.ao = null;
                iil.m21870a("Unknown navigation mode: " + a);
                return;
        }
    }
}

package p000;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.apps.hangouts.elane.SelfMenuViewController;
import java.util.ArrayList;
import java.util.List;

public final class cwf implements OnClickListener {
    final /* synthetic */ eia f9228a;
    final /* synthetic */ SelfMenuViewController f9229b;

    public cwf(SelfMenuViewController selfMenuViewController, eia eia) {
        this.f9229b = selfMenuViewController;
        this.f9228a = eia;
    }

    public void onClick(View view) {
        if (!this.f9229b.f6180a.m10975g().m11058c() || this.f9229b.f6180a.m10975g().m11062g()) {
            this.f9229b.f6180a.m10975g().m11059d();
        } else {
            List arrayList = new ArrayList();
            arrayList.add("android.permission.CAMERA");
            this.f9228a.mo1886a(new eie(gwb.oV, 2657), arrayList);
        }
        gwb.m2251i(this.f9229b.getContext(), 1579);
    }
}

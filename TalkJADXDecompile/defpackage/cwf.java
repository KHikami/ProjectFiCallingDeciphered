package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.apps.hangouts.elane.SelfMenuViewController;
import java.util.ArrayList;
import java.util.List;

/* renamed from: cwf */
public final class cwf implements OnClickListener {
    final /* synthetic */ eia a;
    final /* synthetic */ SelfMenuViewController b;

    public cwf(SelfMenuViewController selfMenuViewController, eia eia) {
        this.b = selfMenuViewController;
        this.a = eia;
    }

    public void onClick(View view) {
        if (!this.b.a.g().c() || this.b.a.g().g()) {
            this.b.a.g().d();
        } else {
            List arrayList = new ArrayList();
            arrayList.add("android.permission.CAMERA");
            this.a.a(new eie(gwb.oV, 2657), arrayList);
        }
        gwb.i(this.b.getContext(), 1579);
    }
}

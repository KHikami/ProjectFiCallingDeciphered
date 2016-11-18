package p000;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.ArrayList;
import java.util.List;

final class egy implements OnClickListener {
    final /* synthetic */ View f11479a;
    final /* synthetic */ egv f11480b;

    egy(egv egv, View view) {
        this.f11480b = egv;
        this.f11479a = view;
    }

    public void onClick(View view) {
        this.f11479a.setVisibility(8);
        eia eia = (eia) this.f11480b.binder.m25443a(eia.class);
        List arrayList = new ArrayList();
        arrayList.add("android.permission.READ_CONTACTS");
        arrayList.add("android.permission.WRITE_CONTACTS");
        eia.mo1886a(new eie(bm.ai, 2653), arrayList);
    }
}

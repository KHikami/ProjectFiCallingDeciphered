package p000;

import android.view.View;
import android.view.View.OnClickListener;

final class bxm implements OnClickListener {
    final /* synthetic */ String f4736a;
    final /* synthetic */ bxl f4737b;

    bxm(bxl bxl, String str) {
        this.f4737b = bxl;
        this.f4736a = str;
    }

    public void onClick(View view) {
        this.f4737b.getContext().startActivity(gwb.m1375C(this.f4736a));
    }
}

package p000;

import android.view.View;
import android.view.View.OnClickListener;

final class gok implements OnClickListener {
    final /* synthetic */ dr f15791a;
    final /* synthetic */ String f15792b;
    final /* synthetic */ goj f15793c;

    gok(goj goj, dr drVar, String str) {
        this.f15793c = goj;
        this.f15791a = drVar;
        this.f15792b = str;
    }

    public void onClick(View view) {
        this.f15791a.startActivity(gwb.m1375C(this.f15792b));
    }
}

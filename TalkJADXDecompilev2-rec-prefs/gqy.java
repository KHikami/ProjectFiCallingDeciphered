package p000;

import android.view.View;
import android.view.View.OnClickListener;

final class gqy implements OnClickListener {
    final /* synthetic */ bko f15940a;
    final /* synthetic */ dr f15941b;
    final /* synthetic */ gqx f15942c;

    gqy(gqx gqx, bko bko, dr drVar) {
        this.f15942c = gqx;
        this.f15940a = bko;
        this.f15941b = drVar;
    }

    public void onClick(View view) {
        this.f15941b.startActivity(gwb.m2163e(this.f15940a, this.f15942c.f15939a));
    }
}

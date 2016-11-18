package p000;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

final class deg implements OnClickListener {
    final /* synthetic */ int f9554a;
    final /* synthetic */ def f9555b;

    deg(def def, int i) {
        this.f9555b = def;
        this.f9554a = i;
    }

    public void onClick(View view) {
        this.f9555b.f9553a.m7002a();
        ded ded = (ded) this.f9555b.f9553a.getTargetFragment();
        int i = this.f9554a;
        ew a = ded.getFragmentManager().mo1845a();
        deh deh = new deh();
        Bundle bundle = new Bundle();
        bundle.putInt("action_index", i);
        deh.setArguments(bundle);
        deh.setTargetFragment(ded, 0);
        deh.m7000a(a, null);
    }
}

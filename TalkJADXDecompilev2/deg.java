package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

final class deg implements OnClickListener {
    final /* synthetic */ int a;
    final /* synthetic */ def b;

    deg(def def, int i) {
        this.b = def;
        this.a = i;
    }

    public void onClick(View view) {
        this.b.a.a();
        ded ded = (ded) this.b.a.getTargetFragment();
        int i = this.a;
        ew a = ded.getFragmentManager().a();
        deh deh = new deh();
        Bundle bundle = new Bundle();
        bundle.putInt("action_index", i);
        deh.setArguments(bundle);
        deh.setTargetFragment(ded, 0);
        deh.a(a, null);
    }
}

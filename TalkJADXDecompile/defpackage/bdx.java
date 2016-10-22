package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: bdx */
final class bdx implements OnClickListener {
    final /* synthetic */ bdw a;

    bdx(bdw bdw) {
        this.a = bdw;
    }

    public void onClick(View view) {
        this.a.a.b().c(3132);
        bdm bdm = (bdm) this.a.binder.a(bdm.class);
        this.a.context.startActivity(gwb.z(bdm.b(((jca) this.a.binder.a(jca.class)).a())));
        this.a.getActivity().finishAffinity();
    }
}

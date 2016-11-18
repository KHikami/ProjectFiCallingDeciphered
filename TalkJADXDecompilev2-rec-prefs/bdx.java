package p000;

import android.view.View;
import android.view.View.OnClickListener;

final class bdx implements OnClickListener {
    final /* synthetic */ bdw f3133a;

    bdx(bdw bdw) {
        this.f3133a = bdw;
    }

    public void onClick(View view) {
        this.f3133a.f3132a.mo1693b().mo1714c(3132);
        bdm bdm = (bdm) this.f3133a.binder.m25443a(bdm.class);
        this.f3133a.context.startActivity(gwb.m2397z(bdm.mo503b(((jca) this.f3133a.binder.m25443a(jca.class)).mo2317a())));
        this.f3133a.getActivity().finishAffinity();
    }
}

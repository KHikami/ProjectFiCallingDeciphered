package p000;

import android.view.View;
import android.widget.Toast;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

final class cza implements gan {
    final /* synthetic */ cyz f9367a;

    cza(cyz cyz) {
        this.f9367a = cyz;
    }

    public void onClick(View view) {
        edk r = ((czb) this.f9367a.c).mo870r();
        if (r != null) {
            RealTimeChatService.m9047a(((fmf) jyn.m25426a(this.f9367a.b, fmf.class)).mo2036a(-1), ((czb) this.f9367a.c).mo495a().m5638g(), r.f11213b.f11244a, r.f11213b.f11245b, r.f11216e, false, true);
            Toast.makeText(this.f9367a.b, this.f9367a.b.getString(bc.jJ, new Object[]{r.f11216e}), 0).show();
            ((czb) this.f9367a.c).mo837a(null);
            ((czb) this.f9367a.c).mo834a(((czb) this.f9367a.c).mo869q() - 1);
            gwb.m1823a(fde.m15018e(((jca) jyn.m25426a(this.f9367a.b, jca.class)).mo2317a()), 1816);
        }
    }

    public void mo1483a() {
    }
}

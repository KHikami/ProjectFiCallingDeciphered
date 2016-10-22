package defpackage;

import android.view.View;
import android.widget.Toast;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

/* renamed from: cza */
final class cza implements gan {
    final /* synthetic */ cyz a;

    cza(cyz cyz) {
        this.a = cyz;
    }

    public void onClick(View view) {
        edk r = ((czb) this.a.c).r();
        if (r != null) {
            RealTimeChatService.a(((fmf) jyn.a(this.a.b, fmf.class)).a(-1), ((czb) this.a.c).a().g(), r.b.a, r.b.b, r.e, false, true);
            Toast.makeText(this.a.b, this.a.b.getString(bc.jJ, new Object[]{r.e}), 0).show();
            ((czb) this.a.c).a(null);
            ((czb) this.a.c).a(((czb) this.a.c).q() - 1);
            gwb.a(fde.e(((jca) jyn.a(this.a.b, jca.class)).a()), 1816);
        }
    }

    public void a() {
    }
}

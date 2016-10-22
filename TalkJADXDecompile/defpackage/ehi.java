package defpackage;

import android.content.Context;
import android.widget.Toast;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

/* renamed from: ehi */
final class ehi extends fip {
    final /* synthetic */ egv a;

    ehi(egv egv) {
        this.a = egv;
    }

    public void a(int i, bko bko, fiu fiu) {
        if ((fiu.c() instanceof ewo) && gwb.a(this.a.ap, i)) {
            egv egv = this.a;
            egv.ap.remove(i);
            if (gwb.a(egv.ap)) {
                RealTimeChatService.b(egv.an);
            }
        }
    }

    public void a(int i, bko bko, fok fok, fdo fdo) {
        if (gwb.a(this.a.ap, i) && (fok instanceof eus)) {
            Context activity = this.a.getActivity();
            String str = (String) this.a.ap.get(i);
            egv egv = this.a;
            egv.ap.remove(i);
            if (gwb.a(egv.ap)) {
                RealTimeChatService.b(egv.an);
            }
            Toast.makeText(activity, activity.getString(czj.i() ? gwb.sT : gwb.sS, new Object[]{str}), 0).show();
        }
    }
}

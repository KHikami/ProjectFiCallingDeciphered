package p000;

import android.content.Context;
import android.widget.Toast;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

final class ehi extends fip {
    final /* synthetic */ egv f11499a;

    ehi(egv egv) {
        this.f11499a = egv;
    }

    public void mo610a(int i, bko bko, fiu fiu) {
        if ((fiu.m15392c() instanceof ewo) && gwb.m1914a(this.f11499a.ap, i)) {
            egv egv = this.f11499a;
            egv.ap.remove(i);
            if (gwb.m1913a(egv.ap)) {
                RealTimeChatService.m9077b(egv.an);
            }
        }
    }

    public void mo640a(int i, bko bko, fok fok, fdo fdo) {
        if (gwb.m1914a(this.f11499a.ap, i) && (fok instanceof eus)) {
            Context activity = this.f11499a.getActivity();
            String str = (String) this.f11499a.ap.get(i);
            egv egv = this.f11499a;
            egv.ap.remove(i);
            if (gwb.m1913a(egv.ap)) {
                RealTimeChatService.m9077b(egv.an);
            }
            Toast.makeText(activity, activity.getString(czj.m11296i() ? gwb.sT : gwb.sS, new Object[]{str}), 0).show();
        }
    }
}

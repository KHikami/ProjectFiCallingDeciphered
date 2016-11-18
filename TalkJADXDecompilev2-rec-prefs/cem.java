package p000;

import android.os.SystemClock;
import java.util.Observable;
import java.util.Observer;

final class cem implements Observer {
    final /* synthetic */ cdr f5130a;

    cem(cdr cdr) {
        this.f5130a = cdr;
    }

    public void update(Observable observable, Object obj) {
        boolean a = ((glm) observable).m17985a();
        if (!this.f5130a.aQ && a) {
            cdr cdr = this.f5130a;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            cdr.aw.mo1669a(cdr.av.m5638g(), "hangout_launch_remote_notification", elapsedRealtime, 1002);
            cdr.aw.mo1669a(cdr.av.m5638g(), "click_contact_list", elapsedRealtime, 1004);
            cdr.aw.mo1669a(cdr.av.m5638g(), "click_conversation_list", elapsedRealtime, 1005);
            cdr.aw.mo1670a("conversation_watermark_load");
            ((bct) this.f5130a.binder.m25443a(bct.class)).mo472a();
        }
        this.f5130a.aQ = a;
        if (this.f5130a.getActivity() != null) {
            this.f5130a.m7423v();
        }
    }
}

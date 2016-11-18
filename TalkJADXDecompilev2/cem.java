package defpackage;

import android.os.SystemClock;
import java.util.Observable;
import java.util.Observer;

final class cem implements Observer {
    final /* synthetic */ cdr a;

    cem(cdr cdr) {
        this.a = cdr;
    }

    public void update(Observable observable, Object obj) {
        boolean a = ((glm) observable).a();
        if (!this.a.aQ && a) {
            cdr cdr = this.a;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            cdr.aw.a(cdr.av.g(), "hangout_launch_remote_notification", elapsedRealtime, 1002);
            cdr.aw.a(cdr.av.g(), "click_contact_list", elapsedRealtime, 1004);
            cdr.aw.a(cdr.av.g(), "click_conversation_list", elapsedRealtime, 1005);
            cdr.aw.a("conversation_watermark_load");
            ((bct) this.a.binder.a(bct.class)).a();
        }
        this.a.aQ = a;
        if (this.a.getActivity() != null) {
            this.a.v();
        }
    }
}

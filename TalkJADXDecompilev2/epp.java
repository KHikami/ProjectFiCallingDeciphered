package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.widget.SimpleExpandableListAdapter;
import com.google.android.apps.hangouts.phone.ViewVCardActivity;

public final class epp extends Handler {
    private ViewVCardActivity a;

    public epp(ViewVCardActivity viewVCardActivity) {
        super(Looper.getMainLooper());
        this.a = viewVCardActivity;
    }

    public void handleMessage(Message message) {
        switch (message.what) {
            case 1001:
                this.a.o = true;
                if (this.a.r.isEmpty()) {
                    this.a.finish();
                }
                this.a.F_();
                return;
            case 1003:
                this.a.a((ajr) message.obj, this.a.r, this.a.s);
                Context context = this.a;
                context.t.setAdapter(new SimpleExpandableListAdapter(context, context.r, gwb.hF, new String[]{"data"}, new int[]{16908308}, context.s, gwb.hG, new String[]{"type", "data"}, new int[]{16908308, 16908309}));
                context.t.setFocusable(true);
                context.t.getEmptyView().setVisibility(8);
                context.t.setVisibility(0);
                return;
            default:
                return;
        }
    }
}

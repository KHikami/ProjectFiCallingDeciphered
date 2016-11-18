package p000;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.widget.SimpleExpandableListAdapter;
import com.google.android.apps.hangouts.phone.ViewVCardActivity;

public final class epp extends Handler {
    private ViewVCardActivity f11995a;

    public epp(ViewVCardActivity viewVCardActivity) {
        super(Looper.getMainLooper());
        this.f11995a = viewVCardActivity;
    }

    public void handleMessage(Message message) {
        switch (message.what) {
            case 1001:
                this.f11995a.f6706o = true;
                if (this.f11995a.f6708r.isEmpty()) {
                    this.f11995a.finish();
                }
                this.f11995a.F_();
                return;
            case 1003:
                this.f11995a.m8962a((ajr) message.obj, this.f11995a.f6708r, this.f11995a.f6709s);
                Context context = this.f11995a;
                context.f6710t.setAdapter(new SimpleExpandableListAdapter(context, context.f6708r, gwb.hF, new String[]{"data"}, new int[]{16908308}, context.f6709s, gwb.hG, new String[]{"type", "data"}, new int[]{16908308, 16908309}));
                context.f6710t.setFocusable(true);
                context.f6710t.getEmptyView().setVisibility(8);
                context.f6710t.setVisibility(0);
                return;
            default:
                return;
        }
    }
}

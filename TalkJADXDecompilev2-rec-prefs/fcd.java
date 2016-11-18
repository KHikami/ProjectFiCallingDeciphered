package p000;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.apps.hangouts.quickreply.impl.QuickReplyActivity;

public final class fcd implements OnClickListener {
    final /* synthetic */ QuickReplyActivity f12679a;

    public fcd(QuickReplyActivity quickReplyActivity) {
        this.f12679a = quickReplyActivity;
    }

    public void onClick(View view) {
        this.f12679a.finish();
        QuickReplyActivity quickReplyActivity = this.f12679a;
        if (quickReplyActivity.f6727u == 1) {
            quickReplyActivity.f6720n.mo550a(new fko(quickReplyActivity.f6724r, quickReplyActivity.f6725s, 3));
        }
    }
}

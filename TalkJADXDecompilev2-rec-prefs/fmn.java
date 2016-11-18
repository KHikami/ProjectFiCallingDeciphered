package p000;

import android.content.Context;
import android.widget.LinearLayout;
import com.google.android.apps.hangouts.realtimechat.wakelock.impl.DebugWakelocksActivity;

public final class fmn extends LinearLayout {
    final /* synthetic */ DebugWakelocksActivity f13467a;

    public fmn(DebugWakelocksActivity debugWakelocksActivity, Context context) {
        this.f13467a = debugWakelocksActivity;
        super(context);
        setOrientation(1);
        addView(new fmo(this, this.f13467a));
        addView(this.f13467a.f6771b);
    }
}

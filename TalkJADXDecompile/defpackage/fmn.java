package defpackage;

import android.content.Context;
import android.widget.LinearLayout;
import com.google.android.apps.hangouts.realtimechat.wakelock.impl.DebugWakelocksActivity;

/* renamed from: fmn */
public final class fmn extends LinearLayout {
    final /* synthetic */ DebugWakelocksActivity a;

    public fmn(DebugWakelocksActivity debugWakelocksActivity, Context context) {
        this.a = debugWakelocksActivity;
        super(context);
        setOrientation(1);
        addView(new fmo(this, this.a));
        addView(this.a.b);
    }
}

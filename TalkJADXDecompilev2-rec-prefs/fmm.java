package p000;

import android.content.Context;
import android.widget.ListView;
import com.google.android.apps.hangouts.realtimechat.wakelock.impl.DebugWakelocksActivity;

public final class fmm extends ListView {
    final /* synthetic */ DebugWakelocksActivity f13466a;

    public fmm(DebugWakelocksActivity debugWakelocksActivity, Context context) {
        this.f13466a = debugWakelocksActivity;
        super(context);
        setOnItemClickListener(new fmq(this.f13466a));
    }
}

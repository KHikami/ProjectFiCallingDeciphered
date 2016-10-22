import android.content.Context;
import android.widget.ListView;
import com.google.android.apps.hangouts.realtimechat.wakelock.impl.DebugWakelocksActivity;

public final class fmm extends ListView {
    final /* synthetic */ DebugWakelocksActivity a;

    public fmm(DebugWakelocksActivity debugWakelocksActivity, Context context) {
        this.a = debugWakelocksActivity;
        super(context);
        setOnItemClickListener(new fmq(this.a));
    }
}

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.hangouts.realtimechat.wakelock.impl.DebugWakelocksActivity;

final class fmw extends emv {
    final /* synthetic */ Context a;
    final /* synthetic */ fmv b;

    fmw(fmv fmv, String str, Context context) {
        this.b = fmv;
        this.a = context;
        super(str);
    }

    public void a() {
        this.a.startActivity(new Intent(this.a, DebugWakelocksActivity.class).addFlags(268435456));
    }
}

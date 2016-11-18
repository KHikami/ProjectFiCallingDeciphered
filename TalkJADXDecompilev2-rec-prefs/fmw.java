package p000;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.hangouts.realtimechat.wakelock.impl.DebugWakelocksActivity;

final class fmw extends emv {
    final /* synthetic */ Context f13479a;
    final /* synthetic */ fmv f13480b;

    fmw(fmv fmv, String str, Context context) {
        this.f13480b = fmv;
        this.f13479a = context;
        super(str);
    }

    public void mo811a() {
        this.f13479a.startActivity(new Intent(this.f13479a, DebugWakelocksActivity.class).addFlags(268435456));
    }
}

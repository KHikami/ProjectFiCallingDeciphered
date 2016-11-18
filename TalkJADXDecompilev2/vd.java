package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class vd extends BroadcastReceiver {
    final /* synthetic */ vc a;

    vd(vc vcVar) {
        this.a = vcVar;
    }

    public void onReceive(Context context, Intent intent) {
        vc vcVar = this.a;
        boolean a = vcVar.a.a();
        if (a != vcVar.b) {
            vcVar.b = a;
            vcVar.e.k();
        }
    }
}

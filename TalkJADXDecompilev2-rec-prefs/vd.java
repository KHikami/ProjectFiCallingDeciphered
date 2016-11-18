package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class vd extends BroadcastReceiver {
    final /* synthetic */ vc f35366a;

    vd(vc vcVar) {
        this.f35366a = vcVar;
    }

    public void onReceive(Context context, Intent intent) {
        vc vcVar = this.f35366a;
        boolean a = vcVar.f35361a.m41106a();
        if (a != vcVar.f35362b) {
            vcVar.f35362b = a;
            vcVar.f35365e.mo4402k();
        }
    }
}

package p000;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.view.View;
import com.google.android.apps.hangouts.hangout.IncomingRingActivity;
import com.google.android.apps.hangouts.hangout.multiwaveview.GlowPadView.OnTriggerListener;

public final class djc implements OnTriggerListener {
    final /* synthetic */ IncomingRingActivity f9917a;

    public djc(IncomingRingActivity incomingRingActivity) {
        this.f9917a = incomingRingActivity;
    }

    public void onGrabbed(View view, int i) {
    }

    public void onReleased(View view, int i) {
    }

    public void onTrigger(View view, int i) {
        boolean z = true;
        switch (i) {
            case 0:
                boolean z2;
                Context context = this.f9917a;
                if (context.f6389n.m8639h()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (!z2 || context.checkCallingOrSelfPermission("android.permission.CAMERA") == 0) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                boolean z3;
                if (context.checkCallingOrSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!(context.m8651g() && (r0 || r3))) {
                    z = false;
                }
                if (z) {
                    new Builder(context).setMessage(context.getResources().getString(bc.fc)).setCancelable(false).setPositiveButton(17039370, new djb(context)).show();
                    gwb.m1823a(context.f6389n.m8631b(), 2682);
                    return;
                }
                context.f6389n.m8642k();
                return;
            case 2:
                this.f9917a.f6389n.m8643l();
                return;
            default:
                gwb.m2358t("Unexpected trigger for GlowPadView widget value: " + i);
                return;
        }
    }

    public void onGrabbedStateChange(View view, int i) {
    }

    public void onFinishFinalAnimation() {
    }
}

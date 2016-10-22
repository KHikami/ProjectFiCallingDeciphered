import android.app.AlertDialog.Builder;
import android.content.Context;
import android.view.View;
import com.google.android.apps.hangouts.hangout.IncomingRingActivity;
import com.google.android.apps.hangouts.hangout.multiwaveview.GlowPadView.OnTriggerListener;

public final class djc implements OnTriggerListener {
    final /* synthetic */ IncomingRingActivity a;

    public djc(IncomingRingActivity incomingRingActivity) {
        this.a = incomingRingActivity;
    }

    public void onGrabbed(View view, int i) {
    }

    public void onReleased(View view, int i) {
    }

    public void onTrigger(View view, int i) {
        boolean z = true;
        switch (i) {
            case wi.w /*0*/:
                boolean z2;
                Context context = this.a;
                if (context.n.h()) {
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
                if (!(context.g() && (r0 || r3))) {
                    z = false;
                }
                if (z) {
                    new Builder(context).setMessage(context.getResources().getString(bc.fc)).setCancelable(false).setPositiveButton(17039370, new djb(context)).show();
                    gwb.a(context.n.b(), 2682);
                    return;
                }
                context.n.k();
            case wi.l /*2*/:
                this.a.n.l();
            default:
                gwb.t("Unexpected trigger for GlowPadView widget value: " + i);
        }
    }

    public void onGrabbedStateChange(View view, int i) {
    }

    public void onFinishFinalAnimation() {
    }
}

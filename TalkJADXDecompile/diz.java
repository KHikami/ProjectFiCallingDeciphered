import android.app.AlertDialog.Builder;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.apps.hangouts.hangout.IncomingRingActivity;

public final class diz implements OnClickListener {
    final /* synthetic */ IncomingRingActivity a;

    public diz(IncomingRingActivity incomingRingActivity) {
        this.a = incomingRingActivity;
    }

    public void onClick(View view) {
        boolean z = true;
        if (!this.a.isFinishing()) {
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
        }
    }
}

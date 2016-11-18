package defpackage;

import android.os.Handler;
import android.os.Message;
import android.widget.Toast;
import com.google.android.apps.hangouts.phone.ApnSettingsActivity;

public final class eja extends Handler {
    private ApnSettingsActivity a;

    public eja(ApnSettingsActivity apnSettingsActivity) {
        this.a = apnSettingsActivity;
    }

    public void handleMessage(Message message) {
        switch (message.what) {
            case 2:
                this.a.a();
                this.a.getPreferenceScreen().setEnabled(true);
                ApnSettingsActivity.b = false;
                this.a.dismissDialog(1001);
                Toast.makeText(this.a, this.a.getResources().getString(bc.jS), 0).show();
                return;
            default:
                return;
        }
    }
}

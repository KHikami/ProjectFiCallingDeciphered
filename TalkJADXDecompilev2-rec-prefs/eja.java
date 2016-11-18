package p000;

import android.os.Handler;
import android.os.Message;
import android.widget.Toast;
import com.google.android.apps.hangouts.phone.ApnSettingsActivity;

public final class eja extends Handler {
    private ApnSettingsActivity f11635a;

    public eja(ApnSettingsActivity apnSettingsActivity) {
        this.f11635a = apnSettingsActivity;
    }

    public void handleMessage(Message message) {
        switch (message.what) {
            case 2:
                this.f11635a.m8781a();
                this.f11635a.getPreferenceScreen().setEnabled(true);
                ApnSettingsActivity.f6558b = false;
                this.f11635a.dismissDialog(1001);
                Toast.makeText(this.f11635a, this.f11635a.getResources().getString(bc.jS), 0).show();
                return;
            default:
                return;
        }
    }
}

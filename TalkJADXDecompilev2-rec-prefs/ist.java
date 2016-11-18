package p000;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class ist extends BroadcastReceiver {
    final /* synthetic */ ism f18910a;

    ist(ism ism) {
        this.f18910a = ism;
    }

    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action.equals("android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED")) {
            int intExtra = intent.getIntExtra("android.bluetooth.profile.extra.STATE", 10);
            if (intExtra == 12) {
                itx.m23277a(3, "vclib", "ACTION_AUDIO_STATE_CHANGED : STATE_AUDIO_CONNECTED");
                this.f18910a.f18880h = isr.BLUETOOTH_ON;
                this.f18910a.m23135i();
                this.f18910a.m23131e();
            } else if (intExtra == 10) {
                itx.m23277a(3, "vclib", "ACTION_AUDIO_STATE_CHANGED : STATE_AUDIO_DISCONNECTED");
                if (!isInitialStickyBroadcast()) {
                    this.f18910a.m23135i();
                    m23139a();
                    this.f18910a.m23131e();
                }
            }
        } else if (action.equals("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED")) {
            int intExtra2 = intent.getIntExtra("android.bluetooth.profile.extra.STATE", 0);
            itx.m23277a(3, "vclib", "BluetoothReceiver.onReceive: got ACTION_CONNECTION_STATE_CHANGED, profileState=" + intExtra2 + ", isInitialSticky=" + isInitialStickyBroadcast());
            BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            switch (intExtra2) {
                case 0:
                    itx.m23277a(3, "vclib", "ACTION_CONNECTION_STATE_CHANGED : STATE_DISCONNECTED");
                    this.f18910a.m23133g();
                    m23139a();
                    this.f18910a.f18886n = null;
                    if (this.f18910a.f18881i.contains(isq.BLUETOOTH_HEADSET)) {
                        this.f18910a.f18881i.remove(isq.BLUETOOTH_HEADSET);
                        this.f18910a.m23131e();
                        return;
                    }
                    return;
                case 2:
                    itx.m23277a(3, "vclib", "ACTION_CONNECTION_STATE_CHANGED : STATE_CONNECTED");
                    this.f18910a.f18881i.add(isq.BLUETOOTH_HEADSET);
                    this.f18910a.m23131e();
                    if (this.f18910a.f18886n == null) {
                        this.f18910a.f18886n = bluetoothDevice;
                        this.f18910a.m23124a(isq.BLUETOOTH_HEADSET);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    private void m23139a() {
        if (this.f18910a.f18880h == isr.BLUETOOTH_ON || this.f18910a.f18880h == isr.BLUETOOTH_TURNING_ON || this.f18910a.f18880h == isr.BLUETOOTH_TURNING_OFF) {
            this.f18910a.m23137k();
        }
    }
}

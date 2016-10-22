package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: ist */
final class ist extends BroadcastReceiver {
    final /* synthetic */ ism a;

    ist(ism ism) {
        this.a = ism;
    }

    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action.equals("android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED")) {
            int intExtra = intent.getIntExtra("android.bluetooth.profile.extra.STATE", 10);
            if (intExtra == 12) {
                itx.a(3, "vclib", "ACTION_AUDIO_STATE_CHANGED : STATE_AUDIO_CONNECTED");
                this.a.h = isr.BLUETOOTH_ON;
                this.a.i();
                this.a.e();
            } else if (intExtra == 10) {
                itx.a(3, "vclib", "ACTION_AUDIO_STATE_CHANGED : STATE_AUDIO_DISCONNECTED");
                if (!isInitialStickyBroadcast()) {
                    this.a.i();
                    a();
                    this.a.e();
                }
            }
        } else if (action.equals("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED")) {
            int intExtra2 = intent.getIntExtra("android.bluetooth.profile.extra.STATE", 0);
            itx.a(3, "vclib", "BluetoothReceiver.onReceive: got ACTION_CONNECTION_STATE_CHANGED, profileState=" + intExtra2 + ", isInitialSticky=" + isInitialStickyBroadcast());
            BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            switch (intExtra2) {
                case wi.w /*0*/:
                    itx.a(3, "vclib", "ACTION_CONNECTION_STATE_CHANGED : STATE_DISCONNECTED");
                    this.a.g();
                    a();
                    this.a.n = null;
                    if (this.a.i.contains(isq.BLUETOOTH_HEADSET)) {
                        this.a.i.remove(isq.BLUETOOTH_HEADSET);
                        this.a.e();
                    }
                case wi.l /*2*/:
                    itx.a(3, "vclib", "ACTION_CONNECTION_STATE_CHANGED : STATE_CONNECTED");
                    this.a.i.add(isq.BLUETOOTH_HEADSET);
                    this.a.e();
                    if (this.a.n == null) {
                        this.a.n = bluetoothDevice;
                        this.a.a(isq.BLUETOOTH_HEADSET);
                    }
                default:
            }
        }
    }

    private void a() {
        if (this.a.h == isr.BLUETOOTH_ON || this.a.h == isr.BLUETOOTH_TURNING_ON || this.a.h == isr.BLUETOOTH_TURNING_OFF) {
            this.a.k();
        }
    }
}

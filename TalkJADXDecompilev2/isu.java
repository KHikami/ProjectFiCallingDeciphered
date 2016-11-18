package defpackage;

import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothProfile;
import android.bluetooth.BluetoothProfile.ServiceListener;

final class isu implements ServiceListener {
    final /* synthetic */ ism a;

    isu(ism ism) {
        this.a = ism;
    }

    public void onServiceConnected(int i, BluetoothProfile bluetoothProfile) {
        if (i == 1) {
            itx.a(3, "vclib", "BluetoothProfile.ServiceListener : onServiceConnected");
            this.a.l = (BluetoothHeadset) bluetoothProfile;
            if (this.a.h == isr.BLUETOOTH_TURNING_ON) {
                this.a.f();
            }
        }
    }

    public void onServiceDisconnected(int i) {
        if (i == 1) {
            itx.a(3, "vclib", "BluetoothProfile.ServiceListener : onServiceDisconnected");
            this.a.g();
            this.a.n = null;
            this.a.l = null;
            if (this.a.i.remove(isq.BLUETOOTH_HEADSET)) {
                this.a.e();
            }
        }
    }
}

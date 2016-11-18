package p000;

import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothProfile;
import android.bluetooth.BluetoothProfile.ServiceListener;

final class isu implements ServiceListener {
    final /* synthetic */ ism f18911a;

    isu(ism ism) {
        this.f18911a = ism;
    }

    public void onServiceConnected(int i, BluetoothProfile bluetoothProfile) {
        if (i == 1) {
            itx.m23277a(3, "vclib", "BluetoothProfile.ServiceListener : onServiceConnected");
            this.f18911a.f18884l = (BluetoothHeadset) bluetoothProfile;
            if (this.f18911a.f18880h == isr.BLUETOOTH_TURNING_ON) {
                this.f18911a.m23132f();
            }
        }
    }

    public void onServiceDisconnected(int i) {
        if (i == 1) {
            itx.m23277a(3, "vclib", "BluetoothProfile.ServiceListener : onServiceDisconnected");
            this.f18911a.m23133g();
            this.f18911a.f18886n = null;
            this.f18911a.f18884l = null;
            if (this.f18911a.f18881i.remove(isq.BLUETOOTH_HEADSET)) {
                this.f18911a.m23131e();
            }
        }
    }
}

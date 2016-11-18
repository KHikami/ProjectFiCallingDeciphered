package p000;

import android.bluetooth.BluetoothAdapter;
import android.content.IntentFilter;

final class iss implements Runnable {
    final /* synthetic */ ism f18909a;

    iss(ism ism) {
        this.f18909a = ism;
    }

    public void run() {
        Object obj = 1;
        synchronized (this.f18909a.f18876d) {
            iil.m21879b("Expected condition to be false", this.f18909a.f18877e);
            this.f18909a.f18878f = this.f18909a.f18874b.isSpeakerphoneOn();
            itx.m23277a(3, "vclib", "initAudio: speakerphone = " + this.f18909a.f18878f);
            this.f18909a.f18874b.requestAudioFocus(null, 0, 2);
            this.f18909a.f18874b.setMode(3);
            ism ism = this.f18909a;
            itx.m23277a(3, "vclib", "initWiredHeadsetAudio");
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.HEADSET_PLUG");
            ism.f18873a.registerReceiver(ism.f18875c, intentFilter);
            this.f18909a.f18877e = true;
            ism = this.f18909a;
            itx.m23277a(3, "vclib", "initBluetoothAudio");
            if (ism.f18883k == null) {
                ism.f18883k = BluetoothAdapter.getDefaultAdapter();
            }
            if (ism.f18883k != null) {
                ism.f18883k.getProfileProxy(ism.f18873a, new isu(ism), 1);
                intentFilter = new IntentFilter();
                intentFilter.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
                intentFilter.addAction("android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED");
                ism.f18885m = new ist(ism);
                ism.f18873a.registerReceiver(ism.f18885m, intentFilter);
                if (2 == ism.f18883k.getProfileConnectionState(1)) {
                    ism.f18881i.add(isq.BLUETOOTH_HEADSET);
                    ism.m23134h();
                    ism.f18880h = isr.BLUETOOTH_TURNING_ON;
                    ism.m23131e();
                    if (obj == null) {
                        itx.m23277a(4, "vclib", "Bluetooth is not connected, using default device.");
                        if (this.f18909a.f18887o != null) {
                            this.f18909a.m23124a(this.f18909a.f18879g);
                        } else {
                            this.f18909a.m23137k();
                        }
                    }
                }
            }
            obj = null;
            if (obj == null) {
                itx.m23277a(4, "vclib", "Bluetooth is not connected, using default device.");
                if (this.f18909a.f18887o != null) {
                    this.f18909a.m23137k();
                } else {
                    this.f18909a.m23124a(this.f18909a.f18879g);
                }
            }
        }
    }
}

package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.content.IntentFilter;

/* renamed from: iss */
final class iss implements Runnable {
    final /* synthetic */ ism a;

    iss(ism ism) {
        this.a = ism;
    }

    public void run() {
        Object obj = 1;
        synchronized (this.a.d) {
            iil.b("Expected condition to be false", this.a.e);
            this.a.f = this.a.b.isSpeakerphoneOn();
            itx.a(3, "vclib", "initAudio: speakerphone = " + this.a.f);
            this.a.b.requestAudioFocus(null, 0, 2);
            this.a.b.setMode(3);
            ism ism = this.a;
            itx.a(3, "vclib", "initWiredHeadsetAudio");
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.HEADSET_PLUG");
            ism.a.registerReceiver(ism.c, intentFilter);
            this.a.e = true;
            ism = this.a;
            itx.a(3, "vclib", "initBluetoothAudio");
            if (ism.k == null) {
                ism.k = BluetoothAdapter.getDefaultAdapter();
            }
            if (ism.k != null) {
                ism.k.getProfileProxy(ism.a, new isu(ism), 1);
                intentFilter = new IntentFilter();
                intentFilter.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
                intentFilter.addAction("android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED");
                ism.m = new ist(ism);
                ism.a.registerReceiver(ism.m, intentFilter);
                if (2 == ism.k.getProfileConnectionState(1)) {
                    ism.i.add(isq.BLUETOOTH_HEADSET);
                    ism.h();
                    ism.h = isr.BLUETOOTH_TURNING_ON;
                    ism.e();
                    if (obj == null) {
                        itx.a(4, "vclib", "Bluetooth is not connected, using default device.");
                        if (this.a.o != null) {
                            this.a.a(this.a.g);
                        } else {
                            this.a.k();
                        }
                    }
                }
            }
            obj = null;
            if (obj == null) {
                itx.a(4, "vclib", "Bluetooth is not connected, using default device.");
                if (this.a.o != null) {
                    this.a.k();
                } else {
                    this.a.a(this.a.g);
                }
            }
        }
    }
}

package p000;

import android.media.AudioManager;

final class eln extends emv {
    final /* synthetic */ AudioManager f11818a;
    final /* synthetic */ elk f11819b;

    eln(elk elk, String str, AudioManager audioManager) {
        this.f11819b = elk;
        this.f11818a = audioManager;
        super(str);
    }

    public void mo811a() {
        this.f11818a.setMicrophoneMute(false);
    }
}

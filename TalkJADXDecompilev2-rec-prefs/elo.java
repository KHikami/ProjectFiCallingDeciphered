package p000;

import android.media.AudioManager;

final class elo extends emv {
    final /* synthetic */ AudioManager f11820a;
    final /* synthetic */ elk f11821b;

    elo(elk elk, String str, AudioManager audioManager) {
        this.f11821b = elk;
        this.f11820a = audioManager;
        super(str);
    }

    public void mo811a() {
        this.f11820a.setMicrophoneMute(true);
    }
}

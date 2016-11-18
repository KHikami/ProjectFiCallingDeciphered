package defpackage;

import android.media.AudioManager;

final class eln extends emv {
    final /* synthetic */ AudioManager a;
    final /* synthetic */ elk b;

    eln(elk elk, String str, AudioManager audioManager) {
        this.b = elk;
        this.a = audioManager;
        super(str);
    }

    public void a() {
        this.a.setMicrophoneMute(false);
    }
}

package defpackage;

import android.media.AudioManager;

/* renamed from: elo */
final class elo extends emv {
    final /* synthetic */ AudioManager a;
    final /* synthetic */ elk b;

    elo(elk elk, String str, AudioManager audioManager) {
        this.b = elk;
        this.a = audioManager;
        super(str);
    }

    public void a() {
        this.a.setMicrophoneMute(true);
    }
}

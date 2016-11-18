package p000;

import android.media.MediaPlayer;
import android.net.Uri;
import java.io.IOException;

final class dju {
    private static final Uri f9971a = gld.m17944c(gwb.iv);
    private static final Uri f9972b = gld.m17944c(gwb.is);
    private final MediaPlayer f9973c = new MediaPlayer();
    private boolean f9974d = false;

    dju(boolean z) {
        Uri uri;
        this.f9973c.setLooping(true);
        this.f9973c.setAudioStreamType(0);
        if (z) {
            try {
                uri = f9972b;
            } catch (IOException e) {
                String valueOf = String.valueOf(e);
                itx.m23277a(6, "Babel_calls", new StringBuilder(String.valueOf(valueOf).length() + 27).append("Failed to set data source: ").append(valueOf).toString());
            }
        } else {
            uri = f9971a;
        }
        this.f9973c.setDataSource(gwb.m1400H(), uri);
        int a = gwb.m1492a(gwb.m1400H(), "babel_hangout_outgoing_ringtone_volume_percentage", 100);
        if (a >= 0 && a <= 100) {
            float f = ((float) a) / 100.0f;
            this.f9973c.setVolume(f, f);
        }
    }

    void m12082a() {
        synchronized (this) {
            if (m12081c()) {
                if (this.f9973c.isPlaying()) {
                    this.f9973c.pause();
                }
                this.f9973c.seekTo(0);
                this.f9973c.start();
            }
            this.f9973c.start();
        }
    }

    void m12083b() {
        synchronized (this) {
            if (this.f9973c.isPlaying()) {
                this.f9973c.stop();
            }
        }
    }

    private boolean m12081c() {
        if (this.f9974d) {
            return true;
        }
        try {
            this.f9973c.prepare();
            this.f9974d = true;
            return true;
        } catch (Exception e) {
            String valueOf = String.valueOf(e);
            itx.m23277a(6, "Babel_calls", new StringBuilder(String.valueOf(valueOf).length() + 26).append("Failed to prepare ringer: ").append(valueOf).toString());
            return false;
        }
    }
}

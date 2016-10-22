import android.media.MediaPlayer;
import android.net.Uri;
import java.io.IOException;

final class dju {
    private static final Uri a;
    private static final Uri b;
    private final MediaPlayer c;
    private boolean d;

    static {
        a = gld.c(gwb.iv);
        b = gld.c(gwb.is);
    }

    dju(boolean z) {
        Uri uri;
        this.d = false;
        this.c = new MediaPlayer();
        this.c.setLooping(true);
        this.c.setAudioStreamType(0);
        if (z) {
            try {
                uri = b;
            } catch (IOException e) {
                String valueOf = String.valueOf(e);
                itx.a(6, "Babel_calls", new StringBuilder(String.valueOf(valueOf).length() + 27).append("Failed to set data source: ").append(valueOf).toString());
            }
        } else {
            uri = a;
        }
        this.c.setDataSource(gwb.H(), uri);
        int a = gwb.a(gwb.H(), "babel_hangout_outgoing_ringtone_volume_percentage", 100);
        if (a >= 0 && a <= 100) {
            float f = ((float) a) / 100.0f;
            this.c.setVolume(f, f);
        }
    }

    void a() {
        synchronized (this) {
            if (c()) {
                if (this.c.isPlaying()) {
                    this.c.pause();
                }
                this.c.seekTo(0);
                this.c.start();
            }
            this.c.start();
        }
    }

    void b() {
        synchronized (this) {
            if (this.c.isPlaying()) {
                this.c.stop();
            }
        }
    }

    private boolean c() {
        if (this.d) {
            return true;
        }
        try {
            this.c.prepare();
            this.d = true;
            return true;
        } catch (Exception e) {
            String valueOf = String.valueOf(e);
            itx.a(6, "Babel_calls", new StringBuilder(String.valueOf(valueOf).length() + 26).append("Failed to prepare ringer: ").append(valueOf).toString());
            return false;
        }
    }
}

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import java.io.IOException;

final class cve {
    ctn a;
    MediaPlayer b;
    final ctt c;
    private final Context d;
    private final csm e;

    cve(Context context, csl csl) {
        this.c = new cvf(this);
        this.e = new csm(this);
        this.d = context;
        csl.a(this.e);
        this.a = csl.a();
    }

    void a() {
        if (this.b == null) {
            this.b = new MediaPlayer();
            this.b.setOnErrorListener(new cvg(this));
            this.b.setLooping(true);
            this.b.setAudioStreamType(0);
            try {
                int i;
                if (this.a.m()) {
                    i = gwb.is;
                } else {
                    i = gwb.iv;
                }
                Uri c = gld.c(i);
                String valueOf = String.valueOf(c);
                glk.c("Babel_explane", new StringBuilder(String.valueOf(valueOf).length() + 30).append("[Outgoing ringtone] Using URI ").append(valueOf).toString(), new Object[0]);
                this.b.setDataSource(this.d, c);
                i = gwb.a(this.d, "babel_hangout_outgoing_ringtone_volume_percentage", 100);
                if (i >= 0 && i <= 100) {
                    this.b.setVolume(((float) i) / 100.0f, ((float) i) / 100.0f);
                }
            } catch (IOException e) {
                String valueOf2 = String.valueOf(e);
                glk.e("Babel_explane", new StringBuilder(String.valueOf(valueOf2).length() + 47).append("[Outgoing ringtone] Failed to set data source: ").append(valueOf2).toString(), new Object[0]);
            }
            if (b()) {
                glk.c("Babel_explane", "[Outgoing ringtone] Starting playback", new Object[0]);
                this.b.start();
                return;
            }
            this.b.release();
            this.b = null;
        }
    }

    private boolean b() {
        try {
            this.b.prepare();
            return true;
        } catch (Exception e) {
            String valueOf = String.valueOf(e);
            glk.e("Babel_explane", new StringBuilder(String.valueOf(valueOf).length() + 52).append("[Outgoing ringtone] Failed to prepare media player: ").append(valueOf).toString(), new Object[0]);
            return false;
        }
    }
}

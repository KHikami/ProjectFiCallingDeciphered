package p000;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import java.io.IOException;

final class cve {
    ctn f9153a;
    MediaPlayer f9154b;
    final ctt f9155c = new cvf(this);
    private final Context f9156d;
    private final csm f9157e = new csm(this);

    cve(Context context, csl csl) {
        this.f9156d = context;
        csl.mo1399a(this.f9157e);
        this.f9153a = csl.mo1398a();
    }

    void m11088a() {
        if (this.f9154b == null) {
            this.f9154b = new MediaPlayer();
            this.f9154b.setOnErrorListener(new cvg(this));
            this.f9154b.setLooping(true);
            this.f9154b.setAudioStreamType(0);
            try {
                int i;
                if (this.f9153a.m10981m()) {
                    i = gwb.is;
                } else {
                    i = gwb.iv;
                }
                Uri c = gld.m17944c(i);
                String valueOf = String.valueOf(c);
                glk.m17979c("Babel_explane", new StringBuilder(String.valueOf(valueOf).length() + 30).append("[Outgoing ringtone] Using URI ").append(valueOf).toString(), new Object[0]);
                this.f9154b.setDataSource(this.f9156d, c);
                i = gwb.m1492a(this.f9156d, "babel_hangout_outgoing_ringtone_volume_percentage", 100);
                if (i >= 0 && i <= 100) {
                    this.f9154b.setVolume(((float) i) / 100.0f, ((float) i) / 100.0f);
                }
            } catch (IOException e) {
                String valueOf2 = String.valueOf(e);
                glk.m17982e("Babel_explane", new StringBuilder(String.valueOf(valueOf2).length() + 47).append("[Outgoing ringtone] Failed to set data source: ").append(valueOf2).toString(), new Object[0]);
            }
            if (m11087b()) {
                glk.m17979c("Babel_explane", "[Outgoing ringtone] Starting playback", new Object[0]);
                this.f9154b.start();
                return;
            }
            this.f9154b.release();
            this.f9154b = null;
        }
    }

    private boolean m11087b() {
        try {
            this.f9154b.prepare();
            return true;
        } catch (Exception e) {
            String valueOf = String.valueOf(e);
            glk.m17982e("Babel_explane", new StringBuilder(String.valueOf(valueOf).length() + 52).append("[Outgoing ringtone] Failed to prepare media player: ").append(valueOf).toString(), new Object[0]);
            return false;
        }
    }
}

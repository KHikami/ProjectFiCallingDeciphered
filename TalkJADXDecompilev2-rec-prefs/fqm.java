package p000;

import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.AudioManager.OnAudioFocusChangeListener;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.net.Uri;
import android.os.Handler;
import com.google.android.apps.hangouts.service.AudioPlayerService;

public final class fqm implements OnAudioFocusChangeListener, OnCompletionListener, OnErrorListener, OnPreparedListener {
    final /* synthetic */ AudioPlayerService f13745a;
    private final MediaPlayer f13746b;
    private final AudioManager f13747c;
    private final String f13748d;
    private boolean f13749e;
    private boolean f13750f;
    private boolean f13751g;
    private int f13752h;
    private final Object f13753i = new Object();
    private final Handler f13754j = new Handler();
    private final Runnable f13755k = new fqn(this);

    public fqm(AudioPlayerService audioPlayerService, Context context, String str, String str2) {
        this.f13745a = audioPlayerService;
        this.f13748d = str2;
        this.f13747c = (AudioManager) context.getSystemService("audio");
        this.f13746b = new MediaPlayer();
        this.f13752h = 0;
        try {
            this.f13746b.setOnPreparedListener(this);
            this.f13746b.setOnCompletionListener(this);
            this.f13746b.setOnErrorListener(this);
            this.f13746b.setAudioStreamType(0);
            this.f13746b.setDataSource(context, Uri.parse(str));
            this.f13751g = false;
            this.f13749e = true;
            this.f13746b.prepareAsync();
        } catch (Throwable e) {
            glk.m17978c("Babel", "AudioPlayerService got an IOException in PlayOperation constructor.", e);
            this.f13746b.release();
            throw e;
        }
    }

    public String m15969a() {
        return this.f13748d;
    }

    public void m15971b() {
        if (this.f13751g || this.f13747c.requestAudioFocus(this, 0, 1) == 1) {
            this.f13751g = true;
            this.f13746b.start();
            this.f13745a.sendBroadcast(m15967a("play_started"));
            return;
        }
        glk.m17981d("Babel", "Unable to get audio focus.", new Object[0]);
        m15976g();
    }

    public void m15972c() {
        if (this.f13751g) {
            this.f13747c.abandonAudioFocus(this);
            this.f13751g = false;
        }
        this.f13746b.pause();
        this.f13745a.sendBroadcast(m15967a("play_paused"));
    }

    public void m15970a(int i) {
        this.f13746b.seekTo(i);
    }

    public void m15973d() {
        Object obj = 1;
        synchronized (this.f13753i) {
            this.f13752h++;
            if (this.f13752h != 1) {
                obj = null;
            }
        }
        if (obj != null) {
            m15975f();
        } else {
            m15968h();
        }
    }

    public void m15974e() {
        synchronized (this.f13753i) {
            if (this.f13752h > 0) {
                this.f13752h--;
            } else {
                glk.m17982e("Babel", "unregisterForCurrentPositionNotification: currentPositionListenerCount <= 0!", new Object[0]);
            }
        }
    }

    private void m15968h() {
        synchronized (this.f13753i) {
            if (this.f13752h == 0) {
                return;
            }
            Intent a = m15967a("current_position");
            a.putExtra("position_in_milliseconds", this.f13746b.getCurrentPosition());
            a.putExtra("duration_in_milliseconds", this.f13746b.getDuration());
            this.f13745a.sendBroadcast(a);
        }
    }

    void m15975f() {
        m15968h();
        synchronized (this.f13753i) {
            if (this.f13752h != 0) {
                this.f13754j.postDelayed(this.f13755k, 250);
            }
        }
    }

    public void m15976g() {
        synchronized (this.f13753i) {
            this.f13752h = 0;
        }
        if (this.f13749e) {
            this.f13750f = true;
            return;
        }
        if (this.f13751g) {
            this.f13747c.abandonAudioFocus(this);
            this.f13751g = false;
        }
        this.f13746b.stop();
        this.f13746b.reset();
        this.f13746b.release();
        this.f13745a.sendBroadcast(m15967a("play_stopped"));
        if (this == this.f13745a.f6802b) {
            this.f13745a.f6802b = null;
        }
    }

    public void onPrepared(MediaPlayer mediaPlayer) {
        this.f13749e = false;
        if (this.f13750f) {
            m15976g();
            return;
        }
        Intent a = m15967a("ready_to_play");
        a.putExtra("duration_in_milliseconds", mediaPlayer.getDuration());
        this.f13745a.sendBroadcast(a);
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        m15976g();
    }

    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        glk.m17981d("Babel", "AudioPlayerService: MediaPlayer error. what: " + i + " extra: " + i2, new Object[0]);
        if (this.f13749e) {
            mediaPlayer.reset();
            mediaPlayer.release();
            this.f13745a.sendBroadcast(m15967a("play_stopped"));
        } else {
            m15976g();
        }
        return true;
    }

    public void onAudioFocusChange(int i) {
        boolean z;
        switch (i) {
            case -3:
                z = AudioPlayerService.f6801a;
                if (this.f13746b.isPlaying()) {
                    this.f13746b.setVolume(0.1f, 0.1f);
                    return;
                }
                return;
            case -2:
                z = AudioPlayerService.f6801a;
                m15972c();
                return;
            case -1:
                z = AudioPlayerService.f6801a;
                m15976g();
                return;
            case 1:
                z = AudioPlayerService.f6801a;
                this.f13746b.setVolume(1.0f, 1.0f);
                return;
            default:
                return;
        }
    }

    private Intent m15967a(String str) {
        if (AudioPlayerService.f6801a) {
            String str2 = this.f13748d;
            new StringBuilder((String.valueOf(str).length() + 30) + String.valueOf(str2).length()).append("Sending Action: ").append(str).append(" for play_id: ").append(str2);
        }
        return AudioPlayerService.m9168a(str, this.f13748d);
    }
}

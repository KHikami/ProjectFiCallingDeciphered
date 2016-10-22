import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.media.AudioManager.OnAudioFocusChangeListener;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
public class asp implements OnCompletionListener, OnErrorListener, OnPreparedListener {
    private static final String a;
    public static asp b;
    private static final String q;
    private static final String r;
    private static final String s;
    private static final String t;
    private static ScheduledExecutorService u;
    final AtomicInteger c;
    final art d;
    public Context e;
    public Uri f;
    public MediaPlayer g;
    public avm h;
    public asy i;
    public int j;
    public boolean k;
    public boolean l;
    public boolean m;
    boolean n;
    public asb o;
    public asx p;
    private final List v;
    private Activity w;
    private int x;
    private asu y;
    private WakeLock z;

    static {
        String[] strArr = new String[]{"has_content", "duration"};
        a = String.valueOf(asp.class.getName()).concat(".VOICEMAIL_URI");
        q = String.valueOf(asp.class.getName()).concat(".IS_PREPARED");
        r = String.valueOf(asp.class.getName()).concat(".IS_PLAYING_STATE_KEY");
        s = String.valueOf(asp.class.getName()).concat(".CLIP_POSITION_KEY");
        t = String.valueOf(asp.class.getName()).concat(".IS_SPEAKER_PHONE_ON");
    }

    public asp(Activity activity) {
        this.c = new AtomicInteger(0);
        this.v = new ArrayList();
        Handler handler = new Handler();
        Context applicationContext = activity.getApplicationContext();
        this.h = avn.a();
        this.o = new asb(applicationContext, this);
        this.d = new art(applicationContext.getContentResolver());
        PowerManager powerManager = (PowerManager) applicationContext.getSystemService("power");
        if (powerManager.isWakeLockLevelSupported(32)) {
            this.z = powerManager.newWakeLock(32, "VmPlaybackPresenter");
        }
    }

    private static synchronized ScheduledExecutorService g() {
        ScheduledExecutorService scheduledExecutorService;
        synchronized (asp.class) {
            if (u == null) {
                u = Executors.newScheduledThreadPool(2);
            }
            scheduledExecutorService = u;
        }
        return scheduledExecutorService;
    }

    public final void a(Activity activity, Bundle bundle) {
        this.w = activity;
        this.e = activity;
        this.x = this.e.getResources().getConfiguration().orientation;
        this.w.setVolumeControlStream(0);
        if (bundle != null) {
            this.f = (Uri) bundle.getParcelable(a);
            this.l = bundle.getBoolean(q);
            this.j = bundle.getInt(s, 0);
            this.k = bundle.getBoolean(r, false);
            this.m = bundle.getBoolean(t, false);
        }
        if (this.g == null) {
            this.l = false;
            this.k = false;
        }
    }

    public final void a(Bundle bundle) {
        if (this.i != null) {
            bundle.putParcelable(a, this.f);
            bundle.putBoolean(q, this.l);
            bundle.putInt(s, this.i.h());
            bundle.putBoolean(r, this.k);
            bundle.putBoolean(t, this.m);
        }
    }

    public final void a() {
        b(true);
        this.i = null;
        this.f = null;
    }

    private void b(boolean z) {
        if (this.g != null) {
            this.g.release();
            this.g = null;
        }
        c(false);
        this.l = false;
        this.k = false;
        if (z) {
            this.j = 0;
        }
        if (this.i != null) {
            this.i.c();
            if (z) {
                this.i.a(0, this.c.get());
            } else {
                this.j = this.i.h();
            }
        }
    }

    public final void b() {
        ata ata = this.o.b;
        ata.e.unregisterReceiver(ata.b);
        if (this.e == null || !this.l || this.x == this.e.getResources().getConfiguration().orientation) {
            b(false);
            if (this.w != null) {
                this.w.getWindow().clearFlags(128);
            }
        }
    }

    public final void c() {
        this.w = null;
        this.e = null;
        if (u != null) {
            u.shutdown();
            u = null;
        }
        if (!this.v.isEmpty()) {
            for (asu a : this.v) {
                a.a();
            }
            this.v.clear();
        }
        if (this.y != null) {
            this.y.a();
            this.y = null;
        }
    }

    public void a(asw asw) {
        avm avm = this.h;
        asz asz = asz.CHECK_FOR_CONTENT;
        avm.a(new asr(this, asw), new Void[0]);
    }

    final boolean a(Uri uri) {
        if (uri == null || this.e == null) {
            return false;
        }
        Cursor query = this.e.getContentResolver().query(uri, null, null, null, null);
        if (query != null) {
            try {
                if (query.moveToNext()) {
                    boolean z;
                    int i = query.getInt(query.getColumnIndex("duration"));
                    AtomicInteger atomicInteger = this.c;
                    if (i > 0) {
                        i *= 1000;
                    } else {
                        i = 0;
                    }
                    atomicInteger.set(i);
                    if (query.getInt(query.getColumnIndex("has_content")) == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    buf.a(query);
                    return z;
                }
            } catch (Throwable th) {
                buf.a(query);
            }
        }
        buf.a(query);
        return false;
    }

    protected boolean a(int i) {
        if (this.e == null || this.f == null) {
            return false;
        }
        asu asu = new asu(this, new Handler(), this.f, i);
        switch (i) {
            case rq.b /*1*/:
                this.v.add(asu);
                break;
            default:
                if (this.y != null) {
                    this.y.a();
                }
                this.i.f();
                this.y = asu;
                break;
        }
        this.e.sendBroadcast(new Intent("android.intent.action.FETCH_VOICEMAIL", this.f));
        return true;
    }

    protected final void d() {
        if (this.i != null) {
            if (this.g != null) {
                this.g.release();
                this.g = null;
            }
            this.i.i();
            this.l = false;
            try {
                this.g = new MediaPlayer();
                this.g.setOnPreparedListener(this);
                this.g.setOnErrorListener(this);
                this.g.setOnCompletionListener(this);
                this.g.reset();
                this.g.setDataSource(this.e, this.f);
                this.g.setAudioStreamType(0);
                this.g.prepareAsync();
            } catch (Exception e) {
                a(e);
            }
        }
    }

    public void onPrepared(MediaPlayer mediaPlayer) {
        if (this.i != null) {
            this.l = true;
            Context context = this.e;
            Uri uri = this.f;
            long toSeconds = TimeUnit.MILLISECONDS.toSeconds((long) this.g.getDuration());
            if (toSeconds > 0 && buf.h(context)) {
                if (ame.b == null) {
                    ame.b = avn.b();
                }
                avm avm = ame.b;
                amn amn = amn.UPDATE_DURATION;
                avm.a(new amk(context, uri, toSeconds), new Void[0]);
            }
            this.c.set(this.g.getDuration());
            new StringBuilder(33).append("onPrepared: mPosition=").append(this.j);
            this.i.a(this.j, this.c.get());
            this.i.j();
            this.i.e();
            this.g.seekTo(this.j);
            if (this.k) {
                e();
            } else {
                f();
            }
        }
    }

    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        a(new IllegalStateException("MediaPlayer error listener invoked: " + i2));
        return true;
    }

    protected final void a(Exception exception) {
        String valueOf = String.valueOf(exception);
        new StringBuilder(String.valueOf(valueOf).length() + 38).append("handleError: Could not play voicemail ").append(valueOf);
        if (this.l) {
            this.g.release();
            this.g = null;
            this.l = false;
        }
        if (this.i != null) {
            this.i.d();
        }
        this.j = 0;
        this.k = false;
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        f();
        this.j = 0;
        if (this.i != null) {
            this.i.a(0, this.c.get());
        }
    }

    public final void e() {
        if (this.i != null) {
            if (this.l) {
                this.k = true;
                if (!(this.g == null || this.g.isPlaying())) {
                    this.j = Math.max(0, Math.min(this.j, this.c.get()));
                    this.g.seekTo(this.j);
                    try {
                        OnAudioFocusChangeListener onAudioFocusChangeListener = this.o;
                        if (onAudioFocusChangeListener.a.requestAudioFocus(onAudioFocusChangeListener, 0, 2) != 1) {
                            throw new RejectedExecutionException("Could not capture audio focus.");
                        }
                        this.g.start();
                        a(this.m);
                    } catch (Exception e) {
                        a(e);
                    }
                }
                new StringBuilder(32).append("Resumed playback at ").append(this.j).append(".");
                this.i.a(this.c.get(), g());
                return;
            }
            a(new ass(this));
        }
    }

    public final void f() {
        int i = 0;
        if (this.l) {
            this.k = false;
            if (this.g != null && this.g.isPlaying()) {
                this.g.pause();
            }
            if (this.g != null) {
                i = this.g.getCurrentPosition();
            }
            this.j = i;
            new StringBuilder(31).append("Paused playback at ").append(this.j).append(".");
            if (this.i != null) {
                this.i.c();
            }
            OnAudioFocusChangeListener onAudioFocusChangeListener = this.o;
            onAudioFocusChangeListener.a.abandonAudioFocus(onAudioFocusChangeListener);
            if (this.w != null) {
                this.w.getWindow().clearFlags(128);
            }
            c(true);
        }
    }

    private final void c(boolean z) {
        if (this.z != null && this.z.isHeld()) {
            this.z.release(z ? 1 : 0);
        }
    }

    public final void b(Uri uri, boolean z) {
        if (this.i != null) {
            if (z) {
                this.i.a(uri);
            } else {
                this.i.b(uri);
            }
        }
    }

    public final void c(Uri uri, boolean z) {
        a(new ast(this, z, uri));
    }

    protected void a(Uri uri, boolean z) {
        art art = this.d;
        arx arx = new arx(this, uri, z);
        Objects.requireNonNull(arx);
        Objects.requireNonNull(uri);
        avm avm = art.b;
        asa asa = asa.ARCHIVE_VOICEMAIL_CONTENT;
        avm.a(new arw(art, uri, arx), new Void[0]);
    }

    protected final void b(Uri uri) {
        art art = this.d;
        ary ary = new ary(this);
        Objects.requireNonNull(ary);
        Objects.requireNonNull(uri);
        avm avm = art.b;
        asa asa = asa.GET_VOICEMAIL_FILE_PATH;
        avm.a(new aru(art, uri, ary), new Void[0]);
    }

    public final void a(boolean z) {
        if (this.i != null) {
            this.i.a(z);
            this.m = z;
            if (!this.k) {
                return;
            }
            if (z || this.o.b.c) {
                c(false);
                if (this.l && this.g != null && this.g.isPlaying()) {
                    this.w.getWindow().addFlags(128);
                    return;
                }
                return;
            }
            if (!(this.z == null || this.m || !this.l || this.g == null || !this.g.isPlaying() || this.z.isHeld())) {
                this.z.acquire();
            }
            if (this.w != null) {
                this.w.getWindow().clearFlags(128);
            }
        }
    }
}

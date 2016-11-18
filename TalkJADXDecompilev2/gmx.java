package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.apps.hangouts.service.AudioPlayerService;
import com.google.android.apps.hangouts.views.AudioAttachmentView;

public final class gmx {
    public static gmx a;
    public static gna b;
    public final Context c;
    String d;
    int e;
    private final String f;
    private String g;
    private int h;
    private long i;
    private AudioManager j;
    private AudioAttachmentView k;
    private int l;
    private int m;
    private BroadcastReceiver n;
    private final Runnable o;

    public gmx(AudioAttachmentView audioAttachmentView, String str, String str2, long j) {
        this.c = audioAttachmentView.getContext().getApplicationContext();
        this.f = str;
        if (gmx.b(str2, j)) {
            this.d = str2;
            this.i = j;
        }
        this.j = (AudioManager) this.c.getSystemService("audio");
        this.e = 0;
        this.o = new gmy(this);
    }

    private static void a(gmx gmx) {
        if (a != gmx) {
            a = gmx;
            if (b != null) {
                b.a(1);
            }
        }
    }

    private static boolean b(String str, long j) {
        return !TextUtils.isEmpty(str) && (j == 0 || glj.a() < j);
    }

    public String a() {
        return this.f;
    }

    public void a(AudioAttachmentView audioAttachmentView) {
        this.k = audioAttachmentView;
    }

    public int b() {
        return this.e;
    }

    private void b(int i) {
        if (this.e != i) {
            if (AudioAttachmentView.a) {
                String str = "setState";
                String str2 = "new state:";
                String valueOf = String.valueOf(gmx.c(i));
                a(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            }
            this.e = i;
            if (this.k != null) {
                this.k.e();
            }
        }
    }

    public void a(gnb gnb) {
        a("preloadAudioDataSourceIfNecessary", "");
        if (b() == 0 && gnb != null && !gmx.b(this.d, this.i)) {
            b(1);
            gnb.a();
        }
    }

    public String c() {
        return this.c.getSharedPreferences("AudioAttachment", 0).getString("output", "speaker");
    }

    private void a(String str) {
        this.c.getSharedPreferences("AudioAttachment", 0).edit().putString("output", str).apply();
    }

    private void m() {
        this.j.setSpeakerphoneOn("speaker".equals(c()));
    }

    public void d() {
        if (this.j.isWiredHeadsetOn()) {
            glk.d("Babel", "toggleAudioOutput: isWiredHeadset is true.", new Object[0]);
            return;
        }
        if ("speaker".equals(c())) {
            a("earpiece");
            this.j.setSpeakerphoneOn(false);
        } else {
            a("speaker");
            this.j.setSpeakerphoneOn(true);
        }
        if (b != null) {
            b.a(2);
        }
    }

    public boolean e() {
        int b = b();
        if ((b == 1 || b == 4 || b == 3) && !this.j.isWiredHeadsetOn()) {
            return true;
        }
        return false;
    }

    public void a(boolean z) {
        if (!this.j.isWiredHeadsetOn()) {
            if (z) {
                this.j.setSpeakerphoneOn(false);
            } else {
                m();
            }
        }
    }

    public boolean f() {
        return this.j.isWiredHeadsetOn();
    }

    public boolean g() {
        return b() == 4;
    }

    public int h() {
        return this.l;
    }

    public int i() {
        return this.m;
    }

    public Intent a(int i) {
        Intent intent = new Intent(this.c, AudioPlayerService.class);
        intent.putExtra("op", i);
        intent.putExtra("play_id", this.g);
        return intent;
    }

    private void n() {
        a("sendPrepare", "");
        Intent a = a(1);
        a.putExtra("audio_stream_url", this.d);
        this.c.startService(a);
    }

    private void o() {
        a("sendPlay", "");
        this.c.startService(a(2));
    }

    private void p() {
        a("sendPause", "");
        this.c.startService(a(3));
    }

    public void j() {
        a("stopPlayback", "");
        u();
        a("sendStop", "");
        this.c.startService(a(5));
    }

    public void a(Intent intent) {
        String action = intent.getAction();
        if (action.equals("android.intent.action.HEADSET_PLUG")) {
            if (intent.getIntExtra("state", 0) == 0) {
                m();
            } else {
                this.j.setSpeakerphoneOn(false);
            }
            if (b != null) {
                b.a(2);
            }
            if (this.k != null) {
                this.k.e();
            }
        } else if (!this.g.equals(intent.getStringExtra("play_id"))) {
        } else {
            if (action.equals("ready_to_play")) {
                b(intent);
            } else if (action.equals("play_started")) {
                q();
            } else if (action.equals("play_paused")) {
                r();
            } else if (action.equals("play_stopped")) {
                s();
            } else if (action.equals("current_position")) {
                c(intent);
            } else {
                String str = "Babel";
                String str2 = "Received unrecognized broadcast action: ";
                action = String.valueOf(action);
                glk.d(str, action.length() != 0 ? str2.concat(action) : new String(str2), new Object[0]);
            }
        }
    }

    private void b(Intent intent) {
        a("onReadyToPlay", "");
        this.l = intent.getIntExtra("duration_in_milliseconds", 0);
        this.m = 0;
        o();
    }

    private void q() {
        a("onPlayStarted", "");
        a("sendRegister", "");
        this.c.startService(a(6));
        b(4);
        if (b != null) {
            b.a(3);
        }
    }

    private void r() {
        a("onPlayPaused", "");
        a("sendUnregister", "");
        this.c.startService(a(7));
        b(5);
        if (b != null) {
            b.a(4);
        }
    }

    private void s() {
        a("onPlayStopped", "");
        u();
    }

    private void c(Intent intent) {
        a("onCurrentPosition", "");
        this.m = intent.getIntExtra("position_in_milliseconds", 0);
        this.l = intent.getIntExtra("duration_in_milliseconds", 0);
        if (this.k != null) {
            this.k.e();
        }
    }

    private void t() {
        a("activateSelf", "");
        gmx gmx = a;
        if (gmx != null) {
            if (gmx.b() == 4) {
                gmx.p();
            }
            gmx.u();
        }
        AudioManager audioManager = this.j;
        boolean z = !this.j.isWiredHeadsetOn() && "speaker".equals(c());
        audioManager.setSpeakerphoneOn(z);
        String str = this.f;
        this.g = new StringBuilder(String.valueOf(str).length() + 19).append(str).append("+playId=").append(this.h).toString();
        this.h++;
        if (this.n == null) {
            this.n = new gmz(this);
            IntentFilter intentFilter = new IntentFilter("ready_to_play");
            intentFilter.addAction("play_started");
            intentFilter.addAction("play_paused");
            intentFilter.addAction("play_stopped");
            intentFilter.addAction("current_position");
            intentFilter.addAction("android.intent.action.HEADSET_PLUG");
            this.c.registerReceiver(this.n, intentFilter);
        }
        new Handler(this.c.getMainLooper()).postDelayed(this.o, 10000);
        gmx.a(this);
    }

    private void u() {
        a("deactivateSelf", "");
        if (this.n != null) {
            this.c.unregisterReceiver(this.n);
            this.n = null;
        }
        AudioManager audioManager = this.j;
        boolean z = !this.j.isWiredHeadsetOn() && "speaker".equals(c());
        audioManager.setSpeakerphoneOn(z);
        b(0);
        if (b != null) {
            b.a(4);
        }
        gmx.a(null);
    }

    public void k() {
        a("playAudio", "");
        switch (this.e) {
            case 0:
                if (gmx.b(this.d, this.i)) {
                    t();
                    n();
                    b(3);
                    return;
                } else if (this.k == null || this.k.c == null) {
                    glk.d("Babel", "No audioUrl, and no audioUrlFetcher.", new Object[0]);
                    b(0);
                    return;
                } else {
                    t();
                    this.k.c.a();
                    b(2);
                    return;
                }
            case 1:
                t();
                b(2);
                return;
            case 2:
            case 3:
                return;
            case 5:
                o();
                return;
            default:
                String str = "Babel";
                String str2 = "Unexpected state in playAudio: ";
                String valueOf = String.valueOf(gmx.c(this.e));
                if (valueOf.length() != 0) {
                    valueOf = str2.concat(valueOf);
                } else {
                    valueOf = new String(str2);
                }
                glk.d(str, valueOf, new Object[0]);
                return;
        }
    }

    public void l() {
        a("pauseAudio", "");
        if (this.e == 4) {
            p();
        }
    }

    private static String c(int i) {
        switch (i) {
            case 0:
                return "IDLE";
            case 1:
                return "PREFETCH";
            case 2:
                return "FETCH_FOR_PLAY";
            case 3:
                return "PREPARING";
            case 4:
                return "PLAYING";
            case 5:
                return "PAUSED";
            default:
                return "UNKNOWN:" + i;
        }
    }

    public void a(String str, long j) {
        if (AudioAttachmentView.a) {
            String str2 = this.d;
            a("setAudioDataSource", new StringBuilder((String.valueOf(str).length() + 41) + String.valueOf(str2).length()).append("new audioStreamUrl is ").append(str).append(" audioStreamUrl is ").append(str2).toString());
        }
        if (gmx.b(str, j)) {
            switch (this.e) {
                case 0:
                    this.d = str;
                    this.i = j;
                    return;
                case 1:
                    this.d = str;
                    this.i = j;
                    b(0);
                    return;
                case 2:
                    this.d = str;
                    this.i = j;
                    n();
                    b(3);
                    return;
                case 4:
                case 5:
                    return;
                default:
                    str2 = "Babel";
                    String str3 = "Unexpected state in setAudioDataSource: ";
                    String valueOf = String.valueOf(gmx.c(this.e));
                    if (valueOf.length() != 0) {
                        valueOf = str3.concat(valueOf);
                    } else {
                        valueOf = new String(str3);
                    }
                    glk.d(str2, valueOf, new Object[0]);
                    return;
            }
        }
        this.d = null;
    }

    public void a(String str, String str2) {
        if (AudioAttachmentView.a) {
            String str3 = this.f;
            String str4 = this.g;
            String valueOf = String.valueOf(gmx.c(this.e));
            new StringBuilder(((((String.valueOf(str).length() + 27) + String.valueOf(str3).length()) + String.valueOf(str4).length()) + String.valueOf(valueOf).length()) + String.valueOf(str2).length()).append(str).append(" messageId:").append(str3).append(" playId:").append(str4).append(" state:").append(valueOf).append(" ").append(str2);
        }
    }
}

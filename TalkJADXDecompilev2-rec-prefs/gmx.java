package p000;

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
    public static gmx f15669a;
    public static gna f15670b;
    public final Context f15671c;
    String f15672d;
    int f15673e;
    private final String f15674f;
    private String f15675g;
    private int f15676h;
    private long f15677i;
    private AudioManager f15678j;
    private AudioAttachmentView f15679k;
    private int f15680l;
    private int f15681m;
    private BroadcastReceiver f15682n;
    private final Runnable f15683o;

    public gmx(AudioAttachmentView audioAttachmentView, String str, String str2, long j) {
        this.f15671c = audioAttachmentView.getContext().getApplicationContext();
        this.f15674f = str;
        if (gmx.m18115b(str2, j)) {
            this.f15672d = str2;
            this.f15677i = j;
        }
        this.f15678j = (AudioManager) this.f15671c.getSystemService("audio");
        this.f15673e = 0;
        this.f15683o = new gmy(this);
    }

    private static void m18111a(gmx gmx) {
        if (f15669a != gmx) {
            f15669a = gmx;
            if (f15670b != null) {
                f15670b.m18149a(1);
            }
        }
    }

    private static boolean m18115b(String str, long j) {
        return !TextUtils.isEmpty(str) && (j == 0 || glj.m17956a() < j);
    }

    public String m18128a() {
        return this.f15674f;
    }

    public void m18130a(AudioAttachmentView audioAttachmentView) {
        this.f15679k = audioAttachmentView;
    }

    public int m18135b() {
        return this.f15673e;
    }

    private void m18113b(int i) {
        if (this.f15673e != i) {
            if (AudioAttachmentView.f6024a) {
                String str = "setState";
                String str2 = "new state:";
                String valueOf = String.valueOf(gmx.m18116c(i));
                m18133a(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            }
            this.f15673e = i;
            if (this.f15679k != null) {
                this.f15679k.m8291e();
            }
        }
    }

    public void m18131a(gnb gnb) {
        m18133a("preloadAudioDataSourceIfNecessary", "");
        if (m18135b() == 0 && gnb != null && !gmx.m18115b(this.f15672d, this.f15677i)) {
            m18113b(1);
            gnb.m18150a();
        }
    }

    public String m18136c() {
        return this.f15671c.getSharedPreferences("AudioAttachment", 0).getString("output", "speaker");
    }

    private void m18112a(String str) {
        this.f15671c.getSharedPreferences("AudioAttachment", 0).edit().putString("output", str).apply();
    }

    private void m18118m() {
        this.f15678j.setSpeakerphoneOn("speaker".equals(m18136c()));
    }

    public void m18137d() {
        if (this.f15678j.isWiredHeadsetOn()) {
            glk.m17981d("Babel", "toggleAudioOutput: isWiredHeadset is true.", new Object[0]);
            return;
        }
        if ("speaker".equals(m18136c())) {
            m18112a("earpiece");
            this.f15678j.setSpeakerphoneOn(false);
        } else {
            m18112a("speaker");
            this.f15678j.setSpeakerphoneOn(true);
        }
        if (f15670b != null) {
            f15670b.m18149a(2);
        }
    }

    public boolean m18138e() {
        int b = m18135b();
        if ((b == 1 || b == 4 || b == 3) && !this.f15678j.isWiredHeadsetOn()) {
            return true;
        }
        return false;
    }

    public void m18134a(boolean z) {
        if (!this.f15678j.isWiredHeadsetOn()) {
            if (z) {
                this.f15678j.setSpeakerphoneOn(false);
            } else {
                m18118m();
            }
        }
    }

    public boolean m18139f() {
        return this.f15678j.isWiredHeadsetOn();
    }

    public boolean m18140g() {
        return m18135b() == 4;
    }

    public int m18141h() {
        return this.f15680l;
    }

    public int m18142i() {
        return this.f15681m;
    }

    public Intent m18127a(int i) {
        Intent intent = new Intent(this.f15671c, AudioPlayerService.class);
        intent.putExtra("op", i);
        intent.putExtra("play_id", this.f15675g);
        return intent;
    }

    private void m18119n() {
        m18133a("sendPrepare", "");
        Intent a = m18127a(1);
        a.putExtra("audio_stream_url", this.f15672d);
        this.f15671c.startService(a);
    }

    private void m18120o() {
        m18133a("sendPlay", "");
        this.f15671c.startService(m18127a(2));
    }

    private void m18121p() {
        m18133a("sendPause", "");
        this.f15671c.startService(m18127a(3));
    }

    public void m18143j() {
        m18133a("stopPlayback", "");
        m18126u();
        m18133a("sendStop", "");
        this.f15671c.startService(m18127a(5));
    }

    public void m18129a(Intent intent) {
        String action = intent.getAction();
        if (action.equals("android.intent.action.HEADSET_PLUG")) {
            if (intent.getIntExtra("state", 0) == 0) {
                m18118m();
            } else {
                this.f15678j.setSpeakerphoneOn(false);
            }
            if (f15670b != null) {
                f15670b.m18149a(2);
            }
            if (this.f15679k != null) {
                this.f15679k.m8291e();
            }
        } else if (!this.f15675g.equals(intent.getStringExtra("play_id"))) {
        } else {
            if (action.equals("ready_to_play")) {
                m18114b(intent);
            } else if (action.equals("play_started")) {
                m18122q();
            } else if (action.equals("play_paused")) {
                m18123r();
            } else if (action.equals("play_stopped")) {
                m18124s();
            } else if (action.equals("current_position")) {
                m18117c(intent);
            } else {
                String str = "Babel";
                String str2 = "Received unrecognized broadcast action: ";
                action = String.valueOf(action);
                glk.m17981d(str, action.length() != 0 ? str2.concat(action) : new String(str2), new Object[0]);
            }
        }
    }

    private void m18114b(Intent intent) {
        m18133a("onReadyToPlay", "");
        this.f15680l = intent.getIntExtra("duration_in_milliseconds", 0);
        this.f15681m = 0;
        m18120o();
    }

    private void m18122q() {
        m18133a("onPlayStarted", "");
        m18133a("sendRegister", "");
        this.f15671c.startService(m18127a(6));
        m18113b(4);
        if (f15670b != null) {
            f15670b.m18149a(3);
        }
    }

    private void m18123r() {
        m18133a("onPlayPaused", "");
        m18133a("sendUnregister", "");
        this.f15671c.startService(m18127a(7));
        m18113b(5);
        if (f15670b != null) {
            f15670b.m18149a(4);
        }
    }

    private void m18124s() {
        m18133a("onPlayStopped", "");
        m18126u();
    }

    private void m18117c(Intent intent) {
        m18133a("onCurrentPosition", "");
        this.f15681m = intent.getIntExtra("position_in_milliseconds", 0);
        this.f15680l = intent.getIntExtra("duration_in_milliseconds", 0);
        if (this.f15679k != null) {
            this.f15679k.m8291e();
        }
    }

    private void m18125t() {
        m18133a("activateSelf", "");
        gmx gmx = f15669a;
        if (gmx != null) {
            if (gmx.m18135b() == 4) {
                gmx.m18121p();
            }
            gmx.m18126u();
        }
        AudioManager audioManager = this.f15678j;
        boolean z = !this.f15678j.isWiredHeadsetOn() && "speaker".equals(m18136c());
        audioManager.setSpeakerphoneOn(z);
        String str = this.f15674f;
        this.f15675g = new StringBuilder(String.valueOf(str).length() + 19).append(str).append("+playId=").append(this.f15676h).toString();
        this.f15676h++;
        if (this.f15682n == null) {
            this.f15682n = new gmz(this);
            IntentFilter intentFilter = new IntentFilter("ready_to_play");
            intentFilter.addAction("play_started");
            intentFilter.addAction("play_paused");
            intentFilter.addAction("play_stopped");
            intentFilter.addAction("current_position");
            intentFilter.addAction("android.intent.action.HEADSET_PLUG");
            this.f15671c.registerReceiver(this.f15682n, intentFilter);
        }
        new Handler(this.f15671c.getMainLooper()).postDelayed(this.f15683o, 10000);
        gmx.m18111a(this);
    }

    private void m18126u() {
        m18133a("deactivateSelf", "");
        if (this.f15682n != null) {
            this.f15671c.unregisterReceiver(this.f15682n);
            this.f15682n = null;
        }
        AudioManager audioManager = this.f15678j;
        boolean z = !this.f15678j.isWiredHeadsetOn() && "speaker".equals(m18136c());
        audioManager.setSpeakerphoneOn(z);
        m18113b(0);
        if (f15670b != null) {
            f15670b.m18149a(4);
        }
        gmx.m18111a(null);
    }

    public void m18144k() {
        m18133a("playAudio", "");
        switch (this.f15673e) {
            case 0:
                if (gmx.m18115b(this.f15672d, this.f15677i)) {
                    m18125t();
                    m18119n();
                    m18113b(3);
                    return;
                } else if (this.f15679k == null || this.f15679k.f6026c == null) {
                    glk.m17981d("Babel", "No audioUrl, and no audioUrlFetcher.", new Object[0]);
                    m18113b(0);
                    return;
                } else {
                    m18125t();
                    this.f15679k.f6026c.m18150a();
                    m18113b(2);
                    return;
                }
            case 1:
                m18125t();
                m18113b(2);
                return;
            case 2:
            case 3:
                return;
            case 5:
                m18120o();
                return;
            default:
                String str = "Babel";
                String str2 = "Unexpected state in playAudio: ";
                String valueOf = String.valueOf(gmx.m18116c(this.f15673e));
                if (valueOf.length() != 0) {
                    valueOf = str2.concat(valueOf);
                } else {
                    valueOf = new String(str2);
                }
                glk.m17981d(str, valueOf, new Object[0]);
                return;
        }
    }

    public void m18145l() {
        m18133a("pauseAudio", "");
        if (this.f15673e == 4) {
            m18121p();
        }
    }

    private static String m18116c(int i) {
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

    public void m18132a(String str, long j) {
        if (AudioAttachmentView.f6024a) {
            String str2 = this.f15672d;
            m18133a("setAudioDataSource", new StringBuilder((String.valueOf(str).length() + 41) + String.valueOf(str2).length()).append("new audioStreamUrl is ").append(str).append(" audioStreamUrl is ").append(str2).toString());
        }
        if (gmx.m18115b(str, j)) {
            switch (this.f15673e) {
                case 0:
                    this.f15672d = str;
                    this.f15677i = j;
                    return;
                case 1:
                    this.f15672d = str;
                    this.f15677i = j;
                    m18113b(0);
                    return;
                case 2:
                    this.f15672d = str;
                    this.f15677i = j;
                    m18119n();
                    m18113b(3);
                    return;
                case 4:
                case 5:
                    return;
                default:
                    str2 = "Babel";
                    String str3 = "Unexpected state in setAudioDataSource: ";
                    String valueOf = String.valueOf(gmx.m18116c(this.f15673e));
                    if (valueOf.length() != 0) {
                        valueOf = str3.concat(valueOf);
                    } else {
                        valueOf = new String(str3);
                    }
                    glk.m17981d(str2, valueOf, new Object[0]);
                    return;
            }
        }
        this.f15672d = null;
    }

    public void m18133a(String str, String str2) {
        if (AudioAttachmentView.f6024a) {
            String str3 = this.f15674f;
            String str4 = this.f15675g;
            String valueOf = String.valueOf(gmx.m18116c(this.f15673e));
            new StringBuilder(((((String.valueOf(str).length() + 27) + String.valueOf(str3).length()) + String.valueOf(str4).length()) + String.valueOf(valueOf).length()) + String.valueOf(str2).length()).append(str).append(" messageId:").append(str3).append(" playId:").append(str4).append(" state:").append(valueOf).append(" ").append(str2);
        }
    }
}

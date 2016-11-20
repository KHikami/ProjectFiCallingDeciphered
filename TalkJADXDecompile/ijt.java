import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences.Editor;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.net.wifi.WifiManager.WifiLock;
import android.os.Build.VERSION;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.text.TextUtils;
import com.google.android.libraries.hangouts.video.internal.CallService;
import com.google.android.libraries.hangouts.video.internal.DecoderManager;
import com.google.android.libraries.hangouts.video.internal.EncoderManager;
import com.google.android.libraries.hangouts.video.internal.Libjingle;
import com.google.android.libraries.hangouts.video.internal.MediaSources;
import com.google.android.libraries.hangouts.video.internal.NamedSource;
import com.google.android.libraries.hangouts.video.internal.RendererManager;
import com.google.android.libraries.hangouts.video.internal.Stats;
import com.google.android.libraries.hangouts.video.internal.Stats.BandwidthEstimationStats;
import com.google.android.libraries.hangouts.video.internal.Stats.ConnectionInfoStats;
import com.google.android.libraries.hangouts.video.internal.Stats.VideoReceiverStats;
import com.google.android.libraries.hangouts.video.internal.Stats.VideoSenderStats;
import com.google.android.libraries.hangouts.video.internal.Stats.VoiceReceiverStats;
import com.google.android.libraries.hangouts.video.internal.Stats.VoiceSenderStats;
import com.google.android.libraries.hangouts.video.internal.VideoViewRequest;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import org.webrtc.voiceengine.AudioEffectsJB;
import org.webrtc.voiceengine.WebRtcAudioUtils;

public final class ijt implements ilp {
    private static final long B;
    private static final String[][] d;
    private final ilr A;
    private final Runnable C;
    private final Set<Integer> D;
    private boolean E;
    final Libjingle a;
    final ConnectivityManager b;
    ikd c;
    private final Context e;
    private final ijn f;
    private final iln g;
    private final ilq h;
    private final List<ikf> i;
    private final WifiManager j;
    private final WifiLock k;
    private ika l;
    private final iim m;
    private final ill n;
    private BandwidthEstimationStats o;
    private final ipg p;
    private final ijk q;
    private iqw r;
    private WakeLock s;
    private final ire t;
    private final inc u;
    private final Map<Integer, VideoViewRequest> v;
    private final Map<Integer, String> w;
    private final Map<Integer, irg> x;
    private final irg y;
    private boolean z;

    static {
        r0 = new String[20][];
        r0[0] = new String[]{"babel_hangout_blocked_interface_names", "USE_DEFAULT_NETWORKS_ONLY"};
        r0[1] = new String[]{"babel_hangout_ec_comfort_noise_generation", "EC_COMFORT_NOISE_GENERATION"};
        r0[2] = new String[]{"babel_hangout_agc_mode", "AGC_MODE"};
        r0[3] = new String[]{"babel_hangout_agc_config_target_level", "AGC_CONFIG_TARGET_LEVEL"};
        r0[4] = new String[]{"babel_hangout_agc_config_comp_gain", "AGC_CONFIG_COMP_GAIN"};
        r0[5] = new String[]{"babel_hangout_agc_config_limiter_enable", "AGC_CONFIG_LIMITER_ENABLE"};
        r0[6] = new String[]{"babel_hangout_enable_rx_auto_gain_control", "ENABLE_RX_AUTO_GAIN_CONTROL"};
        r0[7] = new String[]{"babel_hangout_rx_agc_config_target_level", "RX_AGC_CONFIG_TARGET_LEVEL"};
        r0[8] = new String[]{"babel_hangout_rx_agc_config_comp_gain", "RX_AGC_CONFIG_COMP_GAIN"};
        r0[9] = new String[]{"babel_hangout_rx_agc_config_limiter_enable", "RX_AGC_CONFIG_LIMITER_ENABLE"};
        r0[10] = new String[]{"babel_hangout_audio_record_sampling_rate", "AUDIO_RECORDING_SAMPLING_RATE"};
        r0[11] = new String[]{"babel_hangout_audio_playback_sampling_rate", "AUDIO_PLAYBACK_SAMPLING_RATE"};
        r0[12] = new String[]{"babel_hangout_audio_recording_device", "AUDIO_RECORDING_DEVICE"};
        r0[13] = new String[]{"babel_hangout_enter_step_timeout", "CALL_ENTER_STEP_TIMEOUT_MILLIS"};
        r0[14] = new String[]{"babel_hangout_log_file_size", "DIAGNOSTIC_RAW_LOG_FILE_SIZE_BYTES"};
        r0[15] = new String[]{"babel_hangout_enable_h264_bitstream_rewriter", "ENABLE_H264_BITSTREAM_REWRITER"};
        r0[16] = new String[]{"babel_nova_handoff_expand_rate_threshold", "NOVA_HANDOFF_EXPAND_RATE_THRESHOLD"};
        r0[17] = new String[]{"babel_nova_handoff_recv_fraction_lost_threshold", "NOVA_HANDOFF_RECV_FRACTION_LOST_THRESHOLD"};
        r0[18] = new String[]{"babel_nova_handoff_send_fraction_lost_threshold", "NOVA_HANDOFF_SEND_FRACTION_LOST_THRESHOLD"};
        r0[19] = new String[]{"babel_nova_enable_receive_bitrate_handoff", "NOVA_ENABLE_RECV_BITRATE_HANDOFF"};
        d = r0;
        B = TimeUnit.SECONDS.toMillis(15);
    }

    public ijt(ijn ijn) {
        this.v = new HashMap();
        this.w = new HashMap();
        this.x = new HashMap();
        this.y = new irg("Encode");
        this.z = false;
        this.C = new iju(this);
        this.D = new HashSet();
        this.e = ijn.a();
        this.f = ijn;
        this.h = new ilq(this.e.getMainLooper());
        this.h.a((ilp) this);
        this.g = new iln(this.e.getContentResolver());
        this.a = new Libjingle(this.e, this.h, this.g);
        this.p = new ipg(this.e, ijn.b(), null);
        this.q = new ijk(new ipu(), this.p);
        AudioEffectsJB.initialize(this.g.a("babel_hangout_ns_mode"), this.g.a("babel_hangout_aec_mode"), this.g.a("babel_hangout_agc_mode"));
        this.a.a(AudioEffectsJB.shouldUseWebRTCNoiseSuppressor());
        this.a.b(AudioEffectsJB.shouldUseWebRTCAcousticEchoCanceler());
        this.a.c(AudioEffectsJB.shouldUseWebRTCAutomaticGainControl());
        String property;
        if (VERSION.SDK_INT >= 17) {
            int i;
            int a = this.g.a("babel_hangout_audio_record_sampling_rate", -1);
            property = ((AudioManager) this.e.getSystemService("audio")).getProperty("android.media.property.OUTPUT_SAMPLE_RATE");
            if (a != -1) {
                i = a;
            } else {
                if (property != null) {
                    try {
                        i = Integer.parseInt(property);
                    } catch (Throwable e) {
                        itx.b("vclib", "AudioManager sample rate is invalid.", e);
                    }
                }
                i = 16000;
            }
            WebRtcAudioUtils.setDefaultSampleRateHz(i);
        } else {
            property = ((AudioManager) this.e.getSystemService("audio")).getParameters("ec_supported");
            if (property != null) {
                String[] split = property.split("=");
                if (split.length == 2) {
                    property = split[1].toLowerCase(Locale.US);
                    if ("yes".equals(property) || "true".equals(property) || "1".equals(property)) {
                        this.a.b(false);
                    }
                }
            }
            WebRtcAudioUtils.setDefaultSampleRateHz(this.g.a("babel_hangout_audio_record_sampling_rate", 16000));
        }
        this.a.a(7);
        Libjingle libjingle = this.a;
        String l = Long.toString(CallService.a(this.e));
        String[][] strArr = d;
        String valueOf = String.valueOf(this.e.getCacheDir());
        libjingle.a(l, strArr, new StringBuilder(String.valueOf(valueOf).length() + 14).append(valueOf).append("/raw_call_logs").toString());
        this.i = new CopyOnWriteArrayList();
        this.b = (ConnectivityManager) this.e.getSystemService("connectivity");
        this.j = (WifiManager) this.e.getSystemService("wifi");
        this.k = this.j.createWifiLock(3, "VideoChatWifiLock");
        this.k.setReferenceCounted(false);
        this.A = new ilr();
        this.m = new iim(this.e);
        this.n = new ill(this.e);
        this.t = ijn.c();
        this.u = new inc(this.e, ijn);
    }

    @Deprecated
    ikd a() {
        gwb.aJ();   // ensures on UI thread (else exception is thrown)
        return this.c;
    }

    @Deprecated
    ilr b() {
        gwb.aJ();
        return this.A;
    }

    boolean c() {
        return this.c != null;
    }

    public boolean d() {
        return this.c != null && this.c.d();
    }

    private boolean f(String str) {
        return this.c != null && this.c.e().equals(str);
    }

    private void c(itf itf) {
        this.c = new ikd(itf);
        this.c.b(this.m.a());
    }

    boolean a(itf itf) {
        gwb.aJ();
        if (this.c != null) {
            this.c.a(itf);
        }
        NetworkInfo activeNetworkInfo = this.b.getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            itx.a(6, "vclib", "No network connected");
            if (this.c == null) {
                c(itf);
            }
            this.c.d(11001);
            i();
            return false;
        }
        iil.a("Expected null", this.s);
        gwb.aJ();
        this.s = ((PowerManager) this.e.getSystemService("power")).newWakeLock(536870913, "vclib");
        itx.a(4, "vclib", "Acquiring WakeLock");
        this.s.acquire();
        if (activeNetworkInfo.getType() == 1) {
            itx.a(4, "vclib", "Acquiring WiFi lock");
            this.k.acquire();
        }
        if (itf.u()) {
            IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
            this.l = new ika(this);
            this.e.registerReceiver(this.l, intentFilter);
        }
        switch (this.A.a()) {
            case wi.w /*0*/:
                a("We're not yet signed in; signing in and postponing initiation until done", new Object[0]);
                b(itf);
                this.c.a(true);
                break;
            case wi.j /*1*/:
                a("Sign-in in progress. Postponing initiation until done", new Object[0]);
                this.c.a(true);
                break;
            case wi.l /*2*/:
                h();
                break;
            default:
                iil.a("Unexpected sign-in state: " + this.A.a());
                return false;
        }
        this.c.b(true);
        return true;
    }

    private String g() {
        NetworkInfo activeNetworkInfo = this.b.getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return "networkType";
        }
        String valueOf = String.valueOf("networkType");
        return new StringBuilder(String.valueOf(valueOf).length() + 11).append(valueOf).append(activeNetworkInfo.getType()).toString();
    }

    private void h() {
        iil.a("Expected condition to be true", this.s.isHeld());
        gwb.aJ();
        Libjingle libjingle = this.a;
        String str = "apiaryUri: ";
        String valueOf = String.valueOf(this.p.b().a());
        if (valueOf.length() != 0) {
            valueOf = str.concat(valueOf);
        } else {
            valueOf = new String(str);
        }
        libjingle.c(valueOf);
        valueOf = this.c.e();
        itf h = this.c.h();
        if (iqw.a(h)) {
            this.r = new iqw(this.e, this.p, h, new ijv(this, valueOf, h));
            this.r.b();
            return;
        }
        str = "initiateCall for ";
        valueOf = String.valueOf(valueOf);
        a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), new Object[0]);
        valueOf = h.f();
        this.c.a(valueOf);
        this.a.a(h, valueOf);
    }

    void b(itf itf) {
        iiu a = ((iiv) jyn.a(this.e, iiv.class)).a(itf.o());
        loh loh = new loh();
        if (gwb.a(itf.z().isPstnOnlyClient, false)) {
            loh.a = Integer.valueOf(27);
        } else {
            loh.a = Integer.valueOf(1);
        }
        loh.d = Long.valueOf(CallService.a(this.e));
        this.p.a(loh);
        loe loe = new loe();
        loe.a = itf.q();
        loe.b = itf.p();
        loe.d = itf.b();
        this.p.a(loe);
        this.p.a(itf.d());
        this.p.a(a, this.f.k());
        c(itf);
        this.A.a(a);
        this.A.a(1);
        nzf z = itf.z();
        DecoderManager i = this.f.i();
        EncoderManager h = this.f.h();
        if (!gwb.a(z.allowH264, false)) {
            i.a(-3);
            h.a(-3);
        }
        int a2 = gwb.a(z.startBitrate, 1);
        if (a2 <= 1) {
            a2 = this.e.getSharedPreferences("startBitrate", 0).getInt(g(), -1);
        }
        z.startBitrate = Integer.valueOf(a2);
        z.reportRtpPushes = Boolean.valueOf(this.g.a("babel_vclib_report_rtp_pushes", true));
        this.a.a(nzf.a(z));
        this.a.b(nzf.a(itf.d()));
        this.a.a(itf, i.b(), h.b());
        this.p.c().a(new ipl(this.e, new ijz(this), itf.a(), itf.b(), true));
    }

    void a(int i) {
        gwb.aJ();
        if (this.E) {
            itx.a(5, "vclib", "Terminate already started; ignoring.");
            return;
        }
        this.E = true;
        if (this.c != null) {
            this.c.d(i);
        }
        if (this.r != null) {
            this.r.a();
            this.r = null;
        }
        if (a(this.c)) {
            itx.a(3, "vclib", "terminateCall sessionId: %s endCause: %d", this.c.e(), Integer.valueOf(i));
            if (this.o != null) {
                int i2 = this.o.a;
                Editor edit = this.e.getSharedPreferences("startBitrate", 0).edit();
                edit.putInt(g(), i2);
                edit.apply();
            }
            if (this.A.a() == 2) {
                this.a.e();
                gwb.a(this.C, B);
                return;
            }
            i();
            return;
        }
        itx.a(4, "vclib", "terminateCall: abandoned");
        i();
    }

    public irg e() {
        return this.y;
    }

    public void a(byte[] bArr) {
        gwb.aJ();
        if (this.a.c()) {
            this.a.handlePushNotification(bArr);
        }
    }

    void a(boolean z, String[] strArr, int i, boolean z2, boolean z3, String str) {
        gwb.aJ();
        this.a.a(z, strArr, i, z2, z3, str);
    }

    void a(String str, String str2, boolean z, boolean z2, boolean z3, byte[] bArr) {
        gwb.aJ();
        this.a.a(str, str2, z, z2, z3, bArr);
    }

    void a(char c, int i, String str) {
        gwb.aJ();
        this.a.a(c, i, str);
    }

    void a(VideoViewRequest[] videoViewRequestArr) {
        gwb.aJ();
        if (this.E) {
            itx.a(5, "vclib", "Ignoring view request issued while leaving a call.");
            return;
        }
        for (VideoViewRequest videoViewRequest : videoViewRequestArr) {
            if (videoViewRequest.width == 0 && videoViewRequest.height == 0) {
                this.v.remove(Integer.valueOf(videoViewRequest.ssrc));
            } else {
                this.v.put(Integer.valueOf(videoViewRequest.ssrc), videoViewRequest);
            }
        }
        this.a.a(videoViewRequestArr);
    }

    void a(String str) {
        gwb.aJ();
        this.a.a(str);
    }

    void b(String str) {
        gwb.aJ();
        nzf lyt = new lyt();
        lyt.a = this.c.a();
        lyt.b = str;
        lyt.c = Integer.valueOf(43);
        ((ijd) this.q.a(ijd.class)).c(lyt, new ijw(this, str));
    }

    void a(boolean z) {
        gwb.aJ();
        if (z != this.z) {
            this.a.f(z);
            this.z = z;
        }
    }

    void c(String str) {
        gwb.aJ();
        this.a.b(str);
    }

    void b(boolean z) {
        gwb.aJ();
        if (a(this.c)) {
            if (this.c.d()) {
                this.a.d(z);
            }
            if (this.c.k() == null) {
                throw new IllegalStateException("Mute is allowed only after STATE_INPROGRESS");
            }
            this.c.k().a(z);
            gwb.a(new ijx(this, z));
        }
    }

    void c(boolean z) {
        this.a.e(z);
    }

    void a(ikf ikf) {
        gwb.aJ();
        if (!this.i.contains(ikf)) {
            this.i.add(ikf);
        }
    }

    void b(ikf ikf) {
        gwb.aJ();
        this.i.remove(ikf);
    }

    private void c(String str, int i) {
        iil.a(this.c.e(), (Object) str);
        this.c.a(i);
    }

    private void a(iqo iqo, ayo ayo) {
        gwb.aJ();
        for (ikf a : this.i) {
            a.a(iqo, ayo);
        }
    }

    private void a(NamedSource[] namedSourceArr, int i) {
        gwb.aJ();
        for (NamedSource namedSource : namedSourceArr) {
            if (this.c.k() == null || !namedSource.a.equals(this.c.k().a())) {
                iqo c = this.c.c(namedSource.a);
                if (c == null) {
                    String str = "vclib";
                    String str2 = "Received a media source update for an unknown participant: ";
                    String valueOf = String.valueOf(namedSource.a);
                    if (valueOf.length() != 0) {
                        valueOf = str2.concat(valueOf);
                    } else {
                        valueOf = new String(str2);
                    }
                    itx.a(6, str, valueOf);
                } else {
                    switch (i) {
                        case wi.w /*0*/:
                            c.b(namedSource.c);
                            break;
                        case wi.j /*1*/:
                            c.c(namedSource.c);
                            break;
                        case wi.l /*2*/:
                            this.w.put(Integer.valueOf(namedSource.c), namedSource.a);
                            c.d(namedSource.c);
                            break;
                        case wi.z /*3*/:
                            this.w.remove(Integer.valueOf(namedSource.c));
                            c.e(namedSource.c);
                            break;
                        default:
                            iil.a("Unexpected MediaSourceEvent type");
                            break;
                    }
                    a(c, new iqt(i, namedSource.c));
                }
            }
        }
    }

    private void i() {
        int i = 0;
        a("CallManager.finishCall", new Object[0]);
        gwb.b(this.C);
        gwb.aJ();
        a("CallManager.endCallAndSignOut", new Object[0]);
        if (this.A.a() == 0) {
            itx.a(4, "vclib", "Ignoring endCallAndSignOut; call never joined.");
        } else {
            this.A.a(3);
            this.A.b(0);
            this.a.d();
        }
        if (this.A.a() != 0) {
            this.A.a(0);
        }
        gwb.aJ();
        if (this.s != null) {
            itx.a(4, "vclib", "Releasing WakeLock");
            this.s.release();
            this.s = null;
        }
        if (this.k.isHeld()) {
            itx.a(4, "vclib", "Releasing WiFi lock");
            this.k.release();
        }
        this.h.a(null);
        this.a.b();
        if (a(this.c)) {
            int i2;
            if (this.c == null || this.c.h() == null || this.c.h().g() == null) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            if (i2 != 0 || this.c.l() == 11015 || this.c.a() == null) {
                itx.a(3, "vclib", "Skipping LeaveHandler, endCause: %d, resolveHangoutId: %s", Integer.valueOf(this.c.l()), this.c.a());
                i = 1;
            } else {
                iiq.a(new ijy((ijd) this.q.a(ijd.class), this.c.a(), this.p));
            }
        } else {
            itx.a(3, "vclib", "currentCall is null; leave not required.");
            i = 1;
        }
        if (this.l != null) {
            this.e.unregisterReceiver(this.l);
            this.l = null;
        }
        this.n.a();
        this.u.a();
        for (ikf b : this.i) {
            b.b(this.c);
        }
        this.c = null;
        this.p.c().a(null);
        if (i != 0) {
            this.p.a();
        }
    }

    void a(PrintWriter printWriter) {
        if (a(this.c)) {
            this.c.i().a(printWriter);
            if (c()) {
                printWriter.println("Call info");
                String str = "     media state: ";
                String valueOf = String.valueOf(d() ? "connected" : "-");
                printWriter.println(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                str = "  localSessionId: ";
                valueOf = String.valueOf(this.c.e());
                printWriter.println(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                if (this.c.a() != null) {
                    str = "     hangoutId: ";
                    valueOf = String.valueOf(this.c.a());
                    printWriter.println(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                }
            }
            RendererManager.a(printWriter);
        }
    }

    void d(String str) {
        this.a.c(str);
    }

    ijk f() {
        return this.q;
    }

    public void a(Stats stats) {
        if (stats instanceof VideoReceiverStats) {
            VideoReceiverStats videoReceiverStats = (VideoReceiverStats) stats;
            int i = videoReceiverStats.a;
            if (this.v.containsKey(Integer.valueOf(i))) {
                VideoViewRequest videoViewRequest = (VideoViewRequest) this.v.get(Integer.valueOf(i));
                videoReceiverStats.b(videoViewRequest.width);
                videoReceiverStats.c(videoViewRequest.height);
            }
            a(videoReceiverStats, true);
        } else if (stats instanceof VideoSenderStats) {
            VideoSenderStats videoSenderStats = (VideoSenderStats) stats;
            if (this.y.a() > 0) {
                videoSenderStats.a(this.y.b());
                this.y.c();
            }
        }
        this.c.i().b(stats);
    }

    public void b(Stats stats) {
        if (stats instanceof ConnectionInfoStats) {
            ConnectionInfoStats connectionInfoStats = (ConnectionInfoStats) stats;
            int a = this.m.a();
            connectionInfoStats.setMediaNetworkType(a);
            connectionInfoStats.setSignalStrength(this.m.a(a));
        } else if (stats instanceof inv) {
            this.n.a((inv) stats);
        }
        this.c.i().a(stats);
        lkq lkq = new lkq();
        itg k = this.f.k();
        if (stats instanceof VoiceSenderStats) {
            ((VoiceSenderStats) stats).addTo(lkq);
            k.a(lkq);
        } else if (stats instanceof VoiceReceiverStats) {
            ((VoiceReceiverStats) stats).addTo(lkq);
            k.a(lkq);
        } else if (stats instanceof VideoSenderStats) {
            ((VideoSenderStats) stats).addTo(lkq);
            k.a(lkq);
        } else if (stats instanceof VideoReceiverStats) {
            VideoReceiverStats videoReceiverStats = (VideoReceiverStats) stats;
            a(videoReceiverStats, false);
            videoReceiverStats.addTo(lkq);
            k.a(lkq);
        } else if (stats instanceof BandwidthEstimationStats) {
            BandwidthEstimationStats bandwidthEstimationStats = (BandwidthEstimationStats) stats;
            this.o = bandwidthEstimationStats;
            bandwidthEstimationStats.addTo(lkq);
            k.a(lkq);
            int i = bandwidthEstimationStats.a;
            if (i >= 500000 && !this.D.contains(Integer.valueOf(500000))) {
                this.t.a(2694);
                this.D.add(Integer.valueOf(500000));
                this.u.a(10);
            }
            if (i >= 1000000 && !this.D.contains(Integer.valueOf(1000000))) {
                this.t.a(2695);
                this.D.add(Integer.valueOf(1000000));
                this.u.a(11);
            }
            if (i >= 1500000 && !this.D.contains(Integer.valueOf(1500000))) {
                this.t.a(2696);
                this.D.add(Integer.valueOf(1500000));
                this.u.a(12);
            }
        }
    }

    private void a(VideoReceiverStats videoReceiverStats, boolean z) {
        int i = videoReceiverStats.a;
        if (!this.x.containsKey(Integer.valueOf(i))) {
            this.x.put(Integer.valueOf(i), new irg(String.format("OneWayDelay(%s)", new Object[]{Integer.valueOf(i)})));
        }
        ((irg) this.x.get(Integer.valueOf(i))).a((long) videoReceiverStats.n);
        if (z && this.x.containsKey(Integer.valueOf(i))) {
            videoReceiverStats.a(((irg) this.x.get(Integer.valueOf(i))).b());
            ((irg) this.x.get(Integer.valueOf(i))).c();
        }
    }

    public void a(String str, MediaSources mediaSources) {
        gwb.aJ();
        if (f(str)) {
            a(mediaSources.a, 0);
            a(mediaSources.b, 1);
            a(mediaSources.c, 2);
            a(mediaSources.d, 3);
        }
    }

    public void a(long j, String str, byte[] bArr, int i) {
        this.p.c().a(j, str, bArr, i);
    }

    public void d(boolean z) {
        a("handleSignedInStateUpdate: signedIn=" + z, new Object[0]);
        gwb.aJ();
        iil.a("Expected condition to be true", z);
        this.A.a(2);
        if (this.c != null && this.c.b()) {
            this.c.a(false);
            h();
        }
    }

    public void a(int i, int i2, byte[] bArr) {
        gwb.aJ();
        if (this.q != null) {
            this.q.a(i, i2, bArr);
        }
    }

    public void a(String str, int i) {
        gwb.aJ();
        if (f(str)) {
            for (ikf a : this.i) {
                a.a(str, i);
            }
        }
    }

    public void a(int i, String str) {
        Object[] objArr = new Object[]{Integer.valueOf(i), str};
        gwb.aJ();
        this.f.k().a(i, str);
    }

    public void e(String str) {
        itx.a(3, "vclib", "Handling remoteSessionConnected, remoteSessionId: %s", str);
        this.c.d(str);
        this.c.i().a();
        this.f.k().c(str);
    }

    public void b(int i) {
        if (i == 1) {
            this.f.k().b();
        }
    }

    public void b(int i, String str) {
        itx.a("vclib", "CallManager.handleCallEnd: %d/%s", Integer.valueOf(i), str);
        gwb.aJ();
        if (a(this.c)) {
            this.c.a(i, str);
            a("CallManager.handleCallEnd - finishing call", new Object[0]);
            i();
            return;
        }
        iil.a("Expected condition to be true", gwb.C(i));
    }

    public void b(String str, int i) {
        gwb.aJ();
        String str2;
        String valueOf;
        if (f(str)) {
            switch (i) {
                case wi.w /*0*/:
                    return;
                case wi.j /*1*/:
                    this.c.i().c();
                    c(str, i);
                    return;
                case wi.l /*2*/:
                    c(str, i);
                    this.c.i().b();
                    for (ikf a : this.i) {
                        a.a(this.c);
                    }
                    return;
                case wi.z /*3*/:
                    str2 = "STATE_DEINIT sessionid: ";
                    valueOf = String.valueOf(str);
                    if (valueOf.length() != 0) {
                        valueOf = str2.concat(valueOf);
                    } else {
                        valueOf = new String(str2);
                    }
                    a(valueOf, new Object[0]);
                    c(str, i);
                    b(10001, null);
                    return;
                default:
                    return;
            }
        }
        str2 = "vclib";
        String str3 = "Received state change for unknown call: ";
        valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            valueOf = str3.concat(valueOf);
        } else {
            valueOf = new String(str3);
        }
        itx.a(5, str2, valueOf);
    }

    public void b(byte[] bArr) {
        if (a(this.c)) {
            this.c.c(true);
            a(bArr, false, 10000);
        }
    }

    public void c(byte[] bArr) {
        if (a(this.c)) {
            int i;
            this.c.c(false);
            if (this.c.j().size() > 1) {
                i = 51;
            } else {
                i = 10023;
            }
            a(bArr, true, i);
        }
    }

    private void a(byte[] bArr, boolean z, int i) {
        iil.b("Expected non-null", this.c);
        try {
            lld lld = (lld) nzf.a(new lld(), bArr);
            iil.b("Expected condition to be false", TextUtils.isEmpty(lld.d));
            this.c.e(lld.d);
            if (!z) {
                this.c.i().a(lld.d);
            } else if (!TextUtils.isEmpty(lld.c)) {
                this.c.i().a(lld.d, lld.c, i);
            }
        } catch (Throwable e) {
            itx.a("vclib", "Unable to parse HandoffLogEntry proto from bytes", e);
        }
    }

    public void c(int i) {
        this.f.k().a(new itm(i));
    }

    public void d(int i) {
        a(i);
    }

    public void a(long j, int i, int i2) {
        this.t.a(j, i, i2);
    }

    public void e(boolean z) {
        for (ikf a : this.i) {
            a.a(z);
        }
    }

    public void c(int i, String str) {
        this.t.a(i, str);
    }

    public void a(String str, byte[] bArr) {
        new Object[1][0] = str;
        this.f.k().a(str, bArr);
    }

    static boolean a(ikd ikd) {
        return ikd != null && ikd.c();
    }

    static void a(String str, Object... objArr) {
        if (itx.a(3)) {
            itx.a(3, "vclib", String.format(str, objArr));
        }
    }

    public void a(String str, int i, int i2, String str2, String str3, String str4, byte[] bArr) {
        lym lym;
        Throwable e;
        lym lym2;
        String str5;
        boolean z;
        iqo iqu;
        boolean z2;
        iqq iqq;
        ayo ayo;
        Object obj;
        if (itx.a(3)) {
            a("handleEndpointEvent: participantId=%s eventType=%s, args=%d, %s, %s, %s, participantProto? %b", str, ilq.a(i), Integer.valueOf(i2), str2, str3, str4, bArr);
        }
        if (a(this.c)) {
            iqo b = this.c.b(str);
            if (i == 0 || i == 1) {
                if (b == null) {
                    String str6;
                    int i3;
                    nzf nzf;
                    nzf lym3 = new lym();
                    if (bArr != null) {
                        try {
                            lym = (lym) nzf.a(lym3, bArr);
                            try {
                                str6 = lym.e;
                            } catch (nzd e2) {
                                e = e2;
                                itx.b("vclib", "Could not parse participantProto", e);
                                lym2 = lym;
                                str5 = null;
                                z = false;
                                if (lym2.q.booleanValue()) {
                                    i3 = 1;
                                } else {
                                    i3 = i2;
                                }
                                if (gwb.a(lym2.n) == 5) {
                                    iil.a(Integer.valueOf(i), Integer.valueOf(1));
                                    iqu = new iqu(str, str3, null, i3, str2);
                                } else {
                                    z = i == 0;
                                    if (!z) {
                                    }
                                    z2 = z;
                                    iqu = new iqs(str, str3, str5, i3, str2, z, z2);
                                }
                                if (z) {
                                    this.c.a((iqs) iqu);
                                } else {
                                    this.c.a(iqu);
                                }
                                iqq = new iqq();
                                if (i == 0) {
                                    if (lym2 != null) {
                                        this.q.a(ijd.a.a(lym2));
                                        this.u.a(2);
                                    } else {
                                        lym2 = null;
                                    }
                                    if (lym2 != null) {
                                        a("Updating privileges from proto", new Object[0]);
                                        for (int i4 : lym2.r) {
                                            switch (i4) {
                                                case wi.z /*3*/:
                                                    iqu.c(true);
                                                    break;
                                                case wi.h /*4*/:
                                                    iqu.d(true);
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }
                                        b = iqu;
                                        ayo = iqq;
                                        a(b, ayo);
                                        return;
                                    }
                                    a("Fallback to legacy privileges", new Object[0]);
                                    iqu.c(true);
                                }
                                b = iqu;
                                obj = iqq;
                                a(b, ayo);
                                return;
                            }
                        } catch (Throwable e3) {
                            Throwable th = e3;
                            lym = lym3;
                            e = th;
                            itx.b("vclib", "Could not parse participantProto", e);
                            lym2 = lym;
                            str5 = null;
                            z = false;
                            if (lym2.q.booleanValue()) {
                                i3 = i2;
                            } else {
                                i3 = 1;
                            }
                            if (gwb.a(lym2.n) == 5) {
                                if (i == 0) {
                                }
                                if (z) {
                                }
                                z2 = z;
                                iqu = new iqs(str, str3, str5, i3, str2, z, z2);
                            } else {
                                iil.a(Integer.valueOf(i), Integer.valueOf(1));
                                iqu = new iqu(str, str3, null, i3, str2);
                            }
                            if (z) {
                                this.c.a(iqu);
                            } else {
                                this.c.a((iqs) iqu);
                            }
                            iqq = new iqq();
                            if (i == 0) {
                                if (lym2 != null) {
                                    lym2 = null;
                                } else {
                                    this.q.a(ijd.a.a(lym2));
                                    this.u.a(2);
                                }
                                if (lym2 != null) {
                                    a("Fallback to legacy privileges", new Object[0]);
                                    iqu.c(true);
                                } else {
                                    a("Updating privileges from proto", new Object[0]);
                                    while (r3 < i3) {
                                        switch (i4) {
                                            case wi.z /*3*/:
                                                iqu.c(true);
                                                break;
                                            case wi.h /*4*/:
                                                iqu.d(true);
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                    b = iqu;
                                    ayo = iqq;
                                    a(b, ayo);
                                    return;
                                }
                            }
                            b = iqu;
                            obj = iqq;
                            a(b, ayo);
                            return;
                        }
                    }
                    nzf = lym3;
                    str6 = null;
                    lym2 = nzf;
                    str5 = str6;
                    z = false;
                    if (lym2.q.booleanValue()) {
                        i3 = 1;
                    } else {
                        i3 = i2;
                    }
                    if (gwb.a(lym2.n) == 5) {
                        iil.a(Integer.valueOf(i), Integer.valueOf(1));
                        iqu = new iqu(str, str3, null, i3, str2);
                    } else {
                        if (i == 0) {
                        }
                        if (z || this.c.k() == null) {
                            z2 = z;
                        } else {
                            z2 = this.c.k().s().equals(str2);
                        }
                        iqu = new iqs(str, str3, str5, i3, str2, z, z2);
                    }
                    if (z) {
                        this.c.a((iqs) iqu);
                    } else {
                        this.c.a(iqu);
                    }
                    iqq = new iqq();
                    if (i == 0) {
                        if (lym2 != null) {
                            this.q.a(ijd.a.a(lym2));
                            this.u.a(2);
                        } else {
                            lym2 = null;
                        }
                        if (lym2 != null) {
                            a("Updating privileges from proto", new Object[0]);
                            while (r3 < i3) {
                                switch (i4) {
                                    case wi.z /*3*/:
                                        iqu.c(true);
                                        break;
                                    case wi.h /*4*/:
                                        iqu.d(true);
                                        break;
                                    default:
                                        break;
                                }
                            }
                            b = iqu;
                            ayo = iqq;
                        } else {
                            a("Fallback to legacy privileges", new Object[0]);
                            iqu.c(true);
                        }
                    }
                    b = iqu;
                    obj = iqq;
                } else {
                    return;
                }
            } else if (i == 2) {
                if (b == null) {
                    itx.b("vclib", "Got an ENDPOINT_EXITED event for %s, which doesn't exist in endpoints", str);
                    return;
                }
                Integer valueOf;
                if (!TextUtils.isEmpty(str2)) {
                    try {
                        valueOf = Integer.valueOf(Integer.parseInt(str2));
                    } catch (NumberFormatException e4) {
                        str5 = "vclib";
                        String str7 = "CallState - unexpected endpoint exit error string:";
                        String valueOf2 = String.valueOf(str2);
                        if (valueOf2.length() != 0) {
                            valueOf2 = str7.concat(valueOf2);
                        } else {
                            valueOf2 = new String(str7);
                        }
                        itx.a(5, str5, valueOf2);
                    }
                    this.c.b(b);
                    ayo = new iqr(valueOf);
                }
                valueOf = null;
                this.c.b(b);
                ayo = new iqr(valueOf);
            } else if (b != null) {
                switch (i) {
                    case wi.z /*3*/:
                        if (b.a(i2)) {
                            ayo = new iqn();
                            break;
                        }
                        return;
                    case wi.h /*4*/:
                        iqo iqo;
                        boolean z3 = i2 != 0;
                        if (str2 == null) {
                            iqo = null;
                        } else {
                            iqo = this.c.b(str2);
                        }
                        if (b != iqo) {
                            ayo = new iqm(z3, iqo);
                            if (b.k()) {
                                if (iqo != null) {
                                    iil.a("Expected condition to be true", ((iqm) ayo).a());
                                    b.a(z3);
                                    break;
                                }
                            }
                            b.a(z3);
                            break;
                        }
                        itx.a(5, "vclib", "Got a remote mute request with the wrong by_participant_id, ignoring.");
                        return;
                        break;
                    case wi.p /*5*/:
                        boolean z4;
                        if (i2 != 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        iil.a("Expected condition to be true", b instanceof iqs);
                        ((iqs) b).b(z4);
                        obj = new iqv(z4);
                        break;
                    default:
                        iil.a("Unexpected event type");
                        ayo = null;
                        break;
                }
            } else {
                return;
            }
            a(b, ayo);
            return;
        }
        a("Got endpoint event, but there's no current call. Ignore.", new Object[0]);
    }

    public void d(byte[] bArr) {
        try {
            mat mat = (mat) nzf.a(new mat(), bArr);
            for (ikf a : this.i) {
                a.a(mat);
            }
        } catch (Throwable e) {
            itx.b("vclib", "Cannot parse StreamRequest.", e);
        }
    }

    public void e(byte[] bArr) {
        try {
            this.f.k().a(new itm((lkl) nzf.a(new lkl(), bArr)));
        } catch (Throwable e) {
            itx.b("vclib", "Cannot parse Media Event.", e);
        }
    }

    public void a(byte[] bArr, long j) {
        try {
            this.t.a((mdq) nzf.a(new mdq(), bArr), j);
        } catch (Throwable e) {
            itx.b("vclib", "Cannot parse Transport Event.", e);
        }
    }

    public void f(byte[] bArr) {
        try {
            this.f.k().a(((mbp) nzf.a(new mbp(), bArr)).k);
        } catch (Throwable e) {
            itx.b("vclib", "Cannot parse Transport Event.", e);
        }
    }

    public void a(byte[] bArr, String str) {
        try {
            this.t.a((mdh) nzf.a(new mdh(), bArr), str);
        } catch (Throwable e) {
            itx.b("vclib", "Cannot parse TimingLogEntry.", e);
        }
    }
}

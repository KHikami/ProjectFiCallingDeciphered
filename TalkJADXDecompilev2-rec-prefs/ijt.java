package p000;

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
    private static final long f17796B = TimeUnit.SECONDS.toMillis(15);
    private static final String[][] f17797d;
    private final ilr f17798A;
    private final Runnable f17799C = new iju(this);
    private final Set<Integer> f17800D = new HashSet();
    private boolean f17801E;
    final Libjingle f17802a;
    final ConnectivityManager f17803b;
    ikd f17804c;
    private final Context f17805e;
    private final ijn f17806f;
    private final iln f17807g;
    private final ilq f17808h;
    private final List<ikf> f17809i;
    private final WifiManager f17810j;
    private final WifiLock f17811k;
    private ika f17812l;
    private final iim f17813m;
    private final ill f17814n;
    private BandwidthEstimationStats f17815o;
    private final ipg f17816p;
    private final ijk f17817q;
    private iqw f17818r;
    private WakeLock f17819s;
    private final ire f17820t;
    private final inc f17821u;
    private final Map<Integer, VideoViewRequest> f17822v = new HashMap();
    private final Map<Integer, String> f17823w = new HashMap();
    private final Map<Integer, irg> f17824x = new HashMap();
    private final irg f17825y = new irg("Encode");
    private boolean f17826z = false;

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
        f17797d = r0;
    }

    public ijt(ijn ijn) {
        this.f17805e = ijn.m21949a();
        this.f17806f = ijn;
        this.f17808h = new ilq(this.f17805e.getMainLooper());
        this.f17808h.m22253a((ilp) this);
        this.f17807g = new iln(this.f17805e.getContentResolver());
        this.f17802a = new Libjingle(this.f17805e, this.f17808h, this.f17807g);
        this.f17816p = new ipg(this.f17805e, ijn.m21961b(), null);
        this.f17817q = new ijk(new ipu(), this.f17816p);
        AudioEffectsJB.initialize(this.f17807g.m22249a("babel_hangout_ns_mode"), this.f17807g.m22249a("babel_hangout_aec_mode"), this.f17807g.m22249a("babel_hangout_agc_mode"));
        this.f17802a.m10335a(AudioEffectsJB.shouldUseWebRTCNoiseSuppressor());
        this.f17802a.m10341b(AudioEffectsJB.shouldUseWebRTCAcousticEchoCanceler());
        this.f17802a.m10344c(AudioEffectsJB.shouldUseWebRTCAutomaticGainControl());
        String property;
        if (VERSION.SDK_INT >= 17) {
            int i;
            int a = this.f17807g.m22248a("babel_hangout_audio_record_sampling_rate", -1);
            property = ((AudioManager) this.f17805e.getSystemService("audio")).getProperty("android.media.property.OUTPUT_SAMPLE_RATE");
            if (a != -1) {
                i = a;
            } else {
                if (property != null) {
                    try {
                        i = Integer.parseInt(property);
                    } catch (Throwable e) {
                        itx.m23286b("vclib", "AudioManager sample rate is invalid.", e);
                    }
                }
                i = 16000;
            }
            WebRtcAudioUtils.setDefaultSampleRateHz(i);
        } else {
            property = ((AudioManager) this.f17805e.getSystemService("audio")).getParameters("ec_supported");
            if (property != null) {
                String[] split = property.split("=");
                if (split.length == 2) {
                    property = split[1].toLowerCase(Locale.US);
                    if ("yes".equals(property) || "true".equals(property) || "1".equals(property)) {
                        this.f17802a.m10341b(false);
                    }
                }
            }
            WebRtcAudioUtils.setDefaultSampleRateHz(this.f17807g.m22248a("babel_hangout_audio_record_sampling_rate", 16000));
        }
        this.f17802a.m10329a(7);
        Libjingle libjingle = this.f17802a;
        String l = Long.toString(CallService.m10301a(this.f17805e));
        String[][] strArr = f17797d;
        String valueOf = String.valueOf(this.f17805e.getCacheDir());
        libjingle.m10334a(l, strArr, new StringBuilder(String.valueOf(valueOf).length() + 14).append(valueOf).append("/raw_call_logs").toString());
        this.f17809i = new CopyOnWriteArrayList();
        this.f17803b = (ConnectivityManager) this.f17805e.getSystemService("connectivity");
        this.f17810j = (WifiManager) this.f17805e.getSystemService("wifi");
        this.f17811k = this.f17810j.createWifiLock(3, "VideoChatWifiLock");
        this.f17811k.setReferenceCounted(false);
        this.f17798A = new ilr();
        this.f17813m = new iim(this.f17805e);
        this.f17814n = new ill(this.f17805e);
        this.f17820t = ijn.m21965c();
        this.f17821u = new inc(this.f17805e, ijn);
    }

    @Deprecated
    ikd m22029a() {
        gwb.aJ();
        return this.f17804c;
    }

    @Deprecated
    ilr m22052b() {
        gwb.aJ();
        return this.f17798A;
    }

    boolean m22067c() {
        return this.f17804c != null;
    }

    public boolean m22072d() {
        return this.f17804c != null && this.f17804c.m22131d();
    }

    private boolean m22025f(String str) {
        return this.f17804c != null && this.f17804c.m22132e().equals(str);
    }

    private void m22023c(itf itf) {
        this.f17804c = new ikd(itf);
        this.f17804c.m22121b(this.f17813m.m21884a());
    }

    boolean m22051a(itf itf) {
        gwb.aJ();
        if (this.f17804c != null) {
            this.f17804c.m22117a(itf);
        }
        NetworkInfo activeNetworkInfo = this.f17803b.getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            itx.m23277a(6, "vclib", "No network connected");
            if (this.f17804c == null) {
                m22023c(itf);
            }
            this.f17804c.m22129d(11001);
            m22028i();
            return false;
        }
        iil.m21872a("Expected null", this.f17819s);
        gwb.aJ();
        this.f17819s = ((PowerManager) this.f17805e.getSystemService("power")).newWakeLock(536870913, "vclib");
        itx.m23277a(4, "vclib", "Acquiring WakeLock");
        this.f17819s.acquire();
        if (activeNetworkInfo.getType() == 1) {
            itx.m23277a(4, "vclib", "Acquiring WiFi lock");
            this.f17811k.acquire();
        }
        if (itf.m23195u()) {
            IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
            this.f17812l = new ika(this);
            this.f17805e.registerReceiver(this.f17812l, intentFilter);
        }
        switch (this.f17798A.m22254a()) {
            case 0:
                ijt.m22019a("We're not yet signed in; signing in and postponing initiation until done", new Object[0]);
                m22057b(itf);
                this.f17804c.m22119a(true);
                break;
            case 1:
                ijt.m22019a("Sign-in in progress. Postponing initiation until done", new Object[0]);
                this.f17804c.m22119a(true);
                break;
            case 2:
                m22027h();
                break;
            default:
                iil.m21870a("Unexpected sign-in state: " + this.f17798A.m22254a());
                return false;
        }
        this.f17804c.m22123b(true);
        return true;
    }

    private String m22026g() {
        NetworkInfo activeNetworkInfo = this.f17803b.getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return "networkType";
        }
        String valueOf = String.valueOf("networkType");
        return new StringBuilder(String.valueOf(valueOf).length() + 11).append(valueOf).append(activeNetworkInfo.getType()).toString();
    }

    private void m22027h() {
        iil.m21874a("Expected condition to be true", this.f17819s.isHeld());
        gwb.aJ();
        Libjingle libjingle = this.f17802a;
        String str = "apiaryUri: ";
        String valueOf = String.valueOf(this.f17816p.m22843b().m23217a());
        if (valueOf.length() != 0) {
            valueOf = str.concat(valueOf);
        } else {
            valueOf = new String(str);
        }
        libjingle.m10343c(valueOf);
        valueOf = this.f17804c.m22132e();
        itf h = this.f17804c.m22136h();
        if (iqw.m22980a(h)) {
            this.f17818r = new iqw(this.f17805e, this.f17816p, h, new ijv(this, valueOf, h));
            this.f17818r.m22984b();
            return;
        }
        str = "initiateCall for ";
        valueOf = String.valueOf(valueOf);
        ijt.m22019a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), new Object[0]);
        valueOf = h.m23173f();
        this.f17804c.m22118a(valueOf);
        this.f17802a.m10331a(h, valueOf);
    }

    void m22057b(itf itf) {
        iiu a = ((iiv) jyn.m25426a(this.f17805e, iiv.class)).m21904a(itf.m23189o());
        loh loh = new loh();
        if (gwb.m1929a(itf.m23200z().isPstnOnlyClient, false)) {
            loh.f25866a = Integer.valueOf(27);
        } else {
            loh.f25866a = Integer.valueOf(1);
        }
        loh.f25869d = Long.valueOf(CallService.m10301a(this.f17805e));
        this.f17816p.mo3361a(loh);
        loe loe = new loe();
        loe.f25857a = itf.m23191q();
        loe.f25858b = itf.m23190p();
        loe.f25860d = itf.m23163b();
        this.f17816p.mo3360a(loe);
        this.f17816p.mo3362a(itf.m23169d());
        this.f17816p.m22837a(a, this.f17806f.m21973k());
        m22023c(itf);
        this.f17798A.m22256a(a);
        this.f17798A.m22255a(1);
        nzf z = itf.m23200z();
        DecoderManager i = this.f17806f.m21971i();
        EncoderManager h = this.f17806f.m21970h();
        if (!gwb.m1929a(z.allowH264, false)) {
            i.m10306a(-3);
            h.m10313a(-3);
        }
        int a2 = gwb.m1508a(z.startBitrate, 1);
        if (a2 <= 1) {
            a2 = this.f17805e.getSharedPreferences("startBitrate", 0).getInt(m22026g(), -1);
        }
        z.startBitrate = Integer.valueOf(a2);
        z.reportRtpPushes = Boolean.valueOf(this.f17807g.m22250a("babel_vclib_report_rtp_pushes", true));
        this.f17802a.m10337a(nzf.m1029a(z));
        this.f17802a.m10342b(nzf.m1029a(itf.m23169d()));
        this.f17802a.m10330a(itf, i.m10307b(), h.m10314b());
        this.f17816p.m22844c().mo3348a(new ipl(this.f17805e, new ijz(this), itf.m23159a(), itf.m23163b(), true));
    }

    void m22031a(int i) {
        gwb.aJ();
        if (this.f17801E) {
            itx.m23277a(5, "vclib", "Terminate already started; ignoring.");
            return;
        }
        this.f17801E = true;
        if (this.f17804c != null) {
            this.f17804c.m22129d(i);
        }
        if (this.f17818r != null) {
            this.f17818r.m22983a();
            this.f17818r = null;
        }
        if (ijt.m22022a(this.f17804c)) {
            itx.m23279a(3, "vclib", "terminateCall sessionId: %s endCause: %d", this.f17804c.m22132e(), Integer.valueOf(i));
            if (this.f17815o != null) {
                int i2 = this.f17815o.f8495a;
                Editor edit = this.f17805e.getSharedPreferences("startBitrate", 0).edit();
                edit.putInt(m22026g(), i2);
                edit.apply();
            }
            if (this.f17798A.m22254a() == 2) {
                this.f17802a.m10348e();
                gwb.m1864a(this.f17799C, f17796B);
                return;
            }
            m22028i();
            return;
        }
        itx.m23277a(4, "vclib", "terminateCall: abandoned");
        m22028i();
    }

    public irg m22073e() {
        return this.f17825y;
    }

    public void m22047a(byte[] bArr) {
        gwb.aJ();
        if (this.f17802a.m10345c()) {
            this.f17802a.handlePushNotification(bArr);
        }
    }

    void m22046a(boolean z, String[] strArr, int i, boolean z2, boolean z3, String str) {
        gwb.aJ();
        this.f17802a.m10336a(z, strArr, i, z2, z3, str);
    }

    void m22043a(String str, String str2, boolean z, boolean z2, boolean z3, byte[] bArr) {
        gwb.aJ();
        this.f17802a.m10333a(str, str2, z, z2, z3, bArr);
    }

    void m22030a(char c, int i, String str) {
        gwb.aJ();
        this.f17802a.m10328a(c, i, str);
    }

    void m22050a(VideoViewRequest[] videoViewRequestArr) {
        gwb.aJ();
        if (this.f17801E) {
            itx.m23277a(5, "vclib", "Ignoring view request issued while leaving a call.");
            return;
        }
        for (VideoViewRequest videoViewRequest : videoViewRequestArr) {
            if (videoViewRequest.width == 0 && videoViewRequest.height == 0) {
                this.f17822v.remove(Integer.valueOf(videoViewRequest.ssrc));
            } else {
                this.f17822v.put(Integer.valueOf(videoViewRequest.ssrc), videoViewRequest);
            }
        }
        this.f17802a.m10338a(videoViewRequestArr);
    }

    void m22039a(String str) {
        gwb.aJ();
        this.f17802a.m10332a(str);
    }

    void m22058b(String str) {
        gwb.aJ();
        nzf lyt = new lyt();
        lyt.f26950a = this.f17804c.m22110a();
        lyt.f26951b = str;
        lyt.f26952c = Integer.valueOf(43);
        ((ijd) this.f17817q.m21926a(ijd.class)).mo3368c(lyt, new ijw(this, str));
    }

    void m22045a(boolean z) {
        gwb.aJ();
        if (z != this.f17826z) {
            this.f17802a.m10350f(z);
            this.f17826z = z;
        }
    }

    void m22064c(String str) {
        gwb.aJ();
        this.f17802a.m10340b(str);
    }

    void m22060b(boolean z) {
        gwb.aJ();
        if (ijt.m22022a(this.f17804c)) {
            if (this.f17804c.m22131d()) {
                this.f17802a.m10347d(z);
            }
            if (this.f17804c.m22139k() == null) {
                throw new IllegalStateException("Mute is allowed only after STATE_INPROGRESS");
            }
            this.f17804c.m22139k().m22951a(z);
            gwb.m1863a(new ijx(this, z));
        }
    }

    void m22065c(boolean z) {
        this.f17802a.m10349e(z);
    }

    void m22037a(ikf ikf) {
        gwb.aJ();
        if (!this.f17809i.contains(ikf)) {
            this.f17809i.add(ikf);
        }
    }

    void m22056b(ikf ikf) {
        gwb.aJ();
        this.f17809i.remove(ikf);
    }

    private void m22024c(String str, int i) {
        iil.m21869a(this.f17804c.m22132e(), (Object) str);
        this.f17804c.m22112a(i);
    }

    private void m22018a(iqo iqo, ayo ayo) {
        gwb.aJ();
        for (ikf a : this.f17809i) {
            a.mo1552a(iqo, ayo);
        }
    }

    private void m22021a(NamedSource[] namedSourceArr, int i) {
        gwb.aJ();
        for (NamedSource namedSource : namedSourceArr) {
            if (this.f17804c.m22139k() == null || !namedSource.f8486a.equals(this.f17804c.m22139k().m22949a())) {
                iqo c = this.f17804c.m22125c(namedSource.f8486a);
                if (c == null) {
                    String str = "vclib";
                    String str2 = "Received a media source update for an unknown participant: ";
                    String valueOf = String.valueOf(namedSource.f8486a);
                    if (valueOf.length() != 0) {
                        valueOf = str2.concat(valueOf);
                    } else {
                        valueOf = new String(str2);
                    }
                    itx.m23277a(6, str, valueOf);
                } else {
                    switch (i) {
                        case 0:
                            c.m22954b(namedSource.f8488c);
                            break;
                        case 1:
                            c.m22957c(namedSource.f8488c);
                            break;
                        case 2:
                            this.f17823w.put(Integer.valueOf(namedSource.f8488c), namedSource.f8486a);
                            c.m22959d(namedSource.f8488c);
                            break;
                        case 3:
                            this.f17823w.remove(Integer.valueOf(namedSource.f8488c));
                            c.m22962e(namedSource.f8488c);
                            break;
                        default:
                            iil.m21870a("Unexpected MediaSourceEvent type");
                            break;
                    }
                    m22018a(c, new iqt(i, namedSource.f8488c));
                }
            }
        }
    }

    private void m22028i() {
        int i = 0;
        ijt.m22019a("CallManager.finishCall", new Object[0]);
        gwb.m2042b(this.f17799C);
        gwb.aJ();
        ijt.m22019a("CallManager.endCallAndSignOut", new Object[0]);
        if (this.f17798A.m22254a() == 0) {
            itx.m23277a(4, "vclib", "Ignoring endCallAndSignOut; call never joined.");
        } else {
            this.f17798A.m22255a(3);
            this.f17798A.m22257b(0);
            this.f17802a.m10346d();
        }
        if (this.f17798A.m22254a() != 0) {
            this.f17798A.m22255a(0);
        }
        gwb.aJ();
        if (this.f17819s != null) {
            itx.m23277a(4, "vclib", "Releasing WakeLock");
            this.f17819s.release();
            this.f17819s = null;
        }
        if (this.f17811k.isHeld()) {
            itx.m23277a(4, "vclib", "Releasing WiFi lock");
            this.f17811k.release();
        }
        this.f17808h.m22253a(null);
        this.f17802a.m10339b();
        if (ijt.m22022a(this.f17804c)) {
            int i2;
            if (this.f17804c == null || this.f17804c.m22136h() == null || this.f17804c.m22136h().m23175g() == null) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            if (i2 != 0 || this.f17804c.m22140l() == 11015 || this.f17804c.m22110a() == null) {
                itx.m23279a(3, "vclib", "Skipping LeaveHandler, endCause: %d, resolveHangoutId: %s", Integer.valueOf(this.f17804c.m22140l()), this.f17804c.m22110a());
                i = 1;
            } else {
                iiq.m4948a(new ijy((ijd) this.f17817q.m21926a(ijd.class), this.f17804c.m22110a(), this.f17816p));
            }
        } else {
            itx.m23277a(3, "vclib", "currentCall is null; leave not required.");
            i = 1;
        }
        if (this.f17812l != null) {
            this.f17805e.unregisterReceiver(this.f17812l);
            this.f17812l = null;
        }
        this.f17814n.m22244a();
        this.f17821u.mo1401a();
        for (ikf b : this.f17809i) {
            b.mo1556b(this.f17804c);
        }
        this.f17804c = null;
        this.f17816p.m22844c().mo3348a(null);
        if (i != 0) {
            this.f17816p.mo3357a();
        }
    }

    void m22038a(PrintWriter printWriter) {
        if (ijt.m22022a(this.f17804c)) {
            this.f17804c.m22137i().m22160a(printWriter);
            if (m22067c()) {
                printWriter.println("Call info");
                String str = "     media state: ";
                String valueOf = String.valueOf(m22072d() ? "connected" : "-");
                printWriter.println(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                str = "  localSessionId: ";
                valueOf = String.valueOf(this.f17804c.m22132e());
                printWriter.println(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                if (this.f17804c.m22110a() != null) {
                    str = "     hangoutId: ";
                    valueOf = String.valueOf(this.f17804c.m22110a());
                    printWriter.println(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                }
            }
            RendererManager.m10402a(printWriter);
        }
    }

    void m22069d(String str) {
        this.f17802a.m10343c(str);
    }

    ijk m22077f() {
        return this.f17817q;
    }

    public void mo3235a(Stats stats) {
        if (stats instanceof VideoReceiverStats) {
            VideoReceiverStats videoReceiverStats = (VideoReceiverStats) stats;
            int i = videoReceiverStats.f8517a;
            if (this.f17822v.containsKey(Integer.valueOf(i))) {
                VideoViewRequest videoViewRequest = (VideoViewRequest) this.f17822v.get(Integer.valueOf(i));
                videoReceiverStats.m10413b(videoViewRequest.width);
                videoReceiverStats.m10414c(videoViewRequest.height);
            }
            m22016a(videoReceiverStats, true);
        } else if (stats instanceof VideoSenderStats) {
            VideoSenderStats videoSenderStats = (VideoSenderStats) stats;
            if (this.f17825y.m23029a() > 0) {
                videoSenderStats.m10415a(this.f17825y.m23032b());
                this.f17825y.m23034c();
            }
        }
        this.f17804c.m22137i().m22165b(stats);
    }

    public void mo3244b(Stats stats) {
        if (stats instanceof ConnectionInfoStats) {
            ConnectionInfoStats connectionInfoStats = (ConnectionInfoStats) stats;
            int a = this.f17813m.m21884a();
            connectionInfoStats.setMediaNetworkType(a);
            connectionInfoStats.setSignalStrength(this.f17813m.m21885a(a));
        } else if (stats instanceof inv) {
            this.f17814n.m22245a((inv) stats);
        }
        this.f17804c.m22137i().m22159a(stats);
        lkq lkq = new lkq();
        itg k = this.f17806f.m21973k();
        if (stats instanceof VoiceSenderStats) {
            ((VoiceSenderStats) stats).addTo(lkq);
            k.mo1542a(lkq);
        } else if (stats instanceof VoiceReceiverStats) {
            ((VoiceReceiverStats) stats).addTo(lkq);
            k.mo1542a(lkq);
        } else if (stats instanceof VideoSenderStats) {
            ((VideoSenderStats) stats).addTo(lkq);
            k.mo1542a(lkq);
        } else if (stats instanceof VideoReceiverStats) {
            VideoReceiverStats videoReceiverStats = (VideoReceiverStats) stats;
            m22016a(videoReceiverStats, false);
            videoReceiverStats.addTo(lkq);
            k.mo1542a(lkq);
        } else if (stats instanceof BandwidthEstimationStats) {
            BandwidthEstimationStats bandwidthEstimationStats = (BandwidthEstimationStats) stats;
            this.f17815o = bandwidthEstimationStats;
            bandwidthEstimationStats.addTo(lkq);
            k.mo1542a(lkq);
            int i = bandwidthEstimationStats.f8495a;
            if (i >= 500000 && !this.f17800D.contains(Integer.valueOf(500000))) {
                this.f17820t.m23011a(2694);
                this.f17800D.add(Integer.valueOf(500000));
                this.f17821u.mo1403a(10);
            }
            if (i >= 1000000 && !this.f17800D.contains(Integer.valueOf(1000000))) {
                this.f17820t.m23011a(2695);
                this.f17800D.add(Integer.valueOf(1000000));
                this.f17821u.mo1403a(11);
            }
            if (i >= 1500000 && !this.f17800D.contains(Integer.valueOf(1500000))) {
                this.f17820t.m23011a(2696);
                this.f17800D.add(Integer.valueOf(1500000));
                this.f17821u.mo1403a(12);
            }
        }
    }

    private void m22016a(VideoReceiverStats videoReceiverStats, boolean z) {
        int i = videoReceiverStats.f8517a;
        if (!this.f17824x.containsKey(Integer.valueOf(i))) {
            this.f17824x.put(Integer.valueOf(i), new irg(String.format("OneWayDelay(%s)", new Object[]{Integer.valueOf(i)})));
        }
        ((irg) this.f17824x.get(Integer.valueOf(i))).m23030a((long) videoReceiverStats.f8530n);
        if (z && this.f17824x.containsKey(Integer.valueOf(i))) {
            videoReceiverStats.m10412a(((irg) this.f17824x.get(Integer.valueOf(i))).m23032b());
            ((irg) this.f17824x.get(Integer.valueOf(i))).m23034c();
        }
    }

    public void mo3238a(String str, MediaSources mediaSources) {
        gwb.aJ();
        if (m22025f(str)) {
            m22021a(mediaSources.f8482a, 0);
            m22021a(mediaSources.f8483b, 1);
            m22021a(mediaSources.f8484c, 2);
            m22021a(mediaSources.f8485d, 3);
        }
    }

    public void mo3234a(long j, String str, byte[] bArr, int i) {
        this.f17816p.m22844c().mo3347a(j, str, bArr, i);
    }

    public void mo3251d(boolean z) {
        ijt.m22019a("handleSignedInStateUpdate: signedIn=" + z, new Object[0]);
        gwb.aJ();
        iil.m21874a("Expected condition to be true", z);
        this.f17798A.m22255a(2);
        if (this.f17804c != null && this.f17804c.m22124b()) {
            this.f17804c.m22119a(false);
            m22027h();
        }
    }

    public void mo3231a(int i, int i2, byte[] bArr) {
        gwb.aJ();
        if (this.f17817q != null) {
            this.f17817q.m21927a(i, i2, bArr);
        }
    }

    public void mo3236a(String str, int i) {
        gwb.aJ();
        if (m22025f(str)) {
            for (ikf a : this.f17809i) {
                a.mo1553a(str, i);
            }
        }
    }

    public void mo3232a(int i, String str) {
        Object[] objArr = new Object[]{Integer.valueOf(i), str};
        gwb.aJ();
        this.f17806f.m21973k().mo1439a(i, str);
    }

    public void mo3253e(String str) {
        itx.m23279a(3, "vclib", "Handling remoteSessionConnected, remoteSessionId: %s", str);
        this.f17804c.m22130d(str);
        this.f17804c.m22137i().m22156a();
        this.f17806f.m21973k().mo1548c(str);
    }

    public void mo3242b(int i) {
        if (i == 1) {
            this.f17806f.m21973k().mo1545b();
        }
    }

    public void mo3243b(int i, String str) {
        itx.m23282a("vclib", "CallManager.handleCallEnd: %d/%s", Integer.valueOf(i), str);
        gwb.aJ();
        if (ijt.m22022a(this.f17804c)) {
            this.f17804c.m22113a(i, str);
            ijt.m22019a("CallManager.handleCallEnd - finishing call", new Object[0]);
            m22028i();
            return;
        }
        iil.m21874a("Expected condition to be true", gwb.m1377C(i));
    }

    public void mo3245b(String str, int i) {
        gwb.aJ();
        String str2;
        String valueOf;
        if (m22025f(str)) {
            switch (i) {
                case 0:
                    return;
                case 1:
                    this.f17804c.m22137i().m22166c();
                    m22024c(str, i);
                    return;
                case 2:
                    m22024c(str, i);
                    this.f17804c.m22137i().m22163b();
                    for (ikf a : this.f17809i) {
                        a.mo1551a(this.f17804c);
                    }
                    return;
                case 3:
                    str2 = "STATE_DEINIT sessionid: ";
                    valueOf = String.valueOf(str);
                    if (valueOf.length() != 0) {
                        valueOf = str2.concat(valueOf);
                    } else {
                        valueOf = new String(str2);
                    }
                    ijt.m22019a(valueOf, new Object[0]);
                    m22024c(str, i);
                    mo3243b(10001, null);
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
        itx.m23277a(5, str2, valueOf);
    }

    public void mo3246b(byte[] bArr) {
        if (ijt.m22022a(this.f17804c)) {
            this.f17804c.m22127c(true);
            m22020a(bArr, false, 10000);
        }
    }

    public void mo3249c(byte[] bArr) {
        if (ijt.m22022a(this.f17804c)) {
            int i;
            this.f17804c.m22127c(false);
            if (this.f17804c.m22138j().size() > 1) {
                i = 51;
            } else {
                i = 10023;
            }
            m22020a(bArr, true, i);
        }
    }

    private void m22020a(byte[] bArr, boolean z, int i) {
        iil.m21875b("Expected non-null", this.f17804c);
        try {
            lld lld = (lld) nzf.m1027a(new lld(), bArr);
            iil.m21879b("Expected condition to be false", TextUtils.isEmpty(lld.f25322d));
            this.f17804c.m22133e(lld.f25322d);
            if (!z) {
                this.f17804c.m22137i().m22161a(lld.f25322d);
            } else if (!TextUtils.isEmpty(lld.f25321c)) {
                this.f17804c.m22137i().m22162a(lld.f25322d, lld.f25321c, i);
            }
        } catch (Throwable e) {
            itx.m23281a("vclib", "Unable to parse HandoffLogEntry proto from bytes", e);
        }
    }

    public void mo3247c(int i) {
        this.f17806f.m21973k().mo1540a(new itm(i));
    }

    public void mo3250d(int i) {
        m22031a(i);
    }

    public void mo3233a(long j, int i, int i2) {
        this.f17820t.m23013a(j, i, i2);
    }

    public void mo3254e(boolean z) {
        for (ikf a : this.f17809i) {
            a.mo1555a(z);
        }
    }

    public void mo3248c(int i, String str) {
        this.f17820t.m23012a(i, str);
    }

    public void mo3239a(String str, byte[] bArr) {
        new Object[1][0] = str;
        this.f17806f.m21973k().mo1541a(str, bArr);
    }

    static boolean m22022a(ikd ikd) {
        return ikd != null && ikd.m22128c();
    }

    static void m22019a(String str, Object... objArr) {
        if (itx.m23284a(3)) {
            itx.m23277a(3, "vclib", String.format(str, objArr));
        }
    }

    public void mo3237a(String str, int i, int i2, String str2, String str3, String str4, byte[] bArr) {
        lym lym;
        Throwable e;
        lym lym2;
        boolean z;
        int i3;
        iqo iqu;
        iqq iqq;
        ayo ayo;
        Object obj;
        if (itx.m23284a(3)) {
            ijt.m22019a("handleEndpointEvent: participantId=%s eventType=%s, args=%d, %s, %s, %s, participantProto? %b", str, ilq.m22252a(i), Integer.valueOf(i2), str2, str3, str4, bArr);
        }
        if (ijt.m22022a(this.f17804c)) {
            iqo b = this.f17804c.m22120b(str);
            String str5;
            if (i == 0 || i == 1) {
                if (b == null) {
                    String str6;
                    boolean z2;
                    nzf nzf;
                    nzf lym3 = new lym();
                    if (bArr != null) {
                        try {
                            lym = (lym) nzf.m1027a(lym3, bArr);
                            try {
                                str6 = lym.f26910e;
                            } catch (nzd e2) {
                                e = e2;
                                itx.m23286b("vclib", "Could not parse participantProto", e);
                                lym2 = lym;
                                str5 = null;
                                z = false;
                                if (lym2.f26922q.booleanValue()) {
                                    i3 = 1;
                                } else {
                                    i3 = i2;
                                }
                                if (gwb.m1507a(lym2.f26919n) == 5) {
                                    iil.m21869a(Integer.valueOf(i), Integer.valueOf(1));
                                    iqu = new iqu(str, str3, null, i3, str2);
                                } else {
                                    z = i == 0;
                                    if (!z) {
                                    }
                                    z2 = z;
                                    iqu = new iqs(str, str3, str5, i3, str2, z, z2);
                                }
                                if (z) {
                                    this.f17804c.m22116a((iqs) iqu);
                                } else {
                                    this.f17804c.m22115a(iqu);
                                }
                                iqq = new iqq();
                                if (i == 0) {
                                    if (lym2 != null) {
                                        this.f17817q.m21928a(ijd.f17756a.mo3211a(lym2));
                                        this.f17821u.mo1403a(2);
                                    } else {
                                        lym2 = null;
                                    }
                                    if (lym2 != null) {
                                        ijt.m22019a("Updating privileges from proto", new Object[0]);
                                        for (int i4 : lym2.f26923r) {
                                            switch (i4) {
                                                case 3:
                                                    iqu.m22958c(true);
                                                    break;
                                                case 4:
                                                    iqu.m22960d(true);
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }
                                        b = iqu;
                                        ayo = iqq;
                                        m22018a(b, ayo);
                                        return;
                                    }
                                    ijt.m22019a("Fallback to legacy privileges", new Object[0]);
                                    iqu.m22958c(true);
                                }
                                b = iqu;
                                obj = iqq;
                                m22018a(b, ayo);
                                return;
                            }
                        } catch (Throwable e3) {
                            Throwable th = e3;
                            lym = lym3;
                            e = th;
                            itx.m23286b("vclib", "Could not parse participantProto", e);
                            lym2 = lym;
                            str5 = null;
                            z = false;
                            if (lym2.f26922q.booleanValue()) {
                                i3 = i2;
                            } else {
                                i3 = 1;
                            }
                            if (gwb.m1507a(lym2.f26919n) == 5) {
                                if (i == 0) {
                                }
                                if (z) {
                                }
                                z2 = z;
                                iqu = new iqs(str, str3, str5, i3, str2, z, z2);
                            } else {
                                iil.m21869a(Integer.valueOf(i), Integer.valueOf(1));
                                iqu = new iqu(str, str3, null, i3, str2);
                            }
                            if (z) {
                                this.f17804c.m22115a(iqu);
                            } else {
                                this.f17804c.m22116a((iqs) iqu);
                            }
                            iqq = new iqq();
                            if (i == 0) {
                                if (lym2 != null) {
                                    lym2 = null;
                                } else {
                                    this.f17817q.m21928a(ijd.f17756a.mo3211a(lym2));
                                    this.f17821u.mo1403a(2);
                                }
                                if (lym2 != null) {
                                    ijt.m22019a("Fallback to legacy privileges", new Object[0]);
                                    iqu.m22958c(true);
                                } else {
                                    ijt.m22019a("Updating privileges from proto", new Object[0]);
                                    while (r3 < i3) {
                                        switch (i4) {
                                            case 3:
                                                iqu.m22958c(true);
                                                break;
                                            case 4:
                                                iqu.m22960d(true);
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                    b = iqu;
                                    ayo = iqq;
                                    m22018a(b, ayo);
                                    return;
                                }
                            }
                            b = iqu;
                            obj = iqq;
                            m22018a(b, ayo);
                            return;
                        }
                    }
                    nzf = lym3;
                    str6 = null;
                    lym2 = nzf;
                    str5 = str6;
                    z = false;
                    if (lym2.f26922q.booleanValue()) {
                        i3 = 1;
                    } else {
                        i3 = i2;
                    }
                    if (gwb.m1507a(lym2.f26919n) == 5) {
                        iil.m21869a(Integer.valueOf(i), Integer.valueOf(1));
                        iqu = new iqu(str, str3, null, i3, str2);
                    } else {
                        if (i == 0) {
                        }
                        if (z || this.f17804c.m22139k() == null) {
                            z2 = z;
                        } else {
                            z2 = this.f17804c.m22139k().m22978s().equals(str2);
                        }
                        iqu = new iqs(str, str3, str5, i3, str2, z, z2);
                    }
                    if (z) {
                        this.f17804c.m22116a((iqs) iqu);
                    } else {
                        this.f17804c.m22115a(iqu);
                    }
                    iqq = new iqq();
                    if (i == 0) {
                        if (lym2 != null) {
                            this.f17817q.m21928a(ijd.f17756a.mo3211a(lym2));
                            this.f17821u.mo1403a(2);
                        } else {
                            lym2 = null;
                        }
                        if (lym2 != null) {
                            ijt.m22019a("Updating privileges from proto", new Object[0]);
                            while (r3 < i3) {
                                switch (i4) {
                                    case 3:
                                        iqu.m22958c(true);
                                        break;
                                    case 4:
                                        iqu.m22960d(true);
                                        break;
                                    default:
                                        break;
                                }
                            }
                            b = iqu;
                            ayo = iqq;
                        } else {
                            ijt.m22019a("Fallback to legacy privileges", new Object[0]);
                            iqu.m22958c(true);
                        }
                    }
                    b = iqu;
                    obj = iqq;
                } else {
                    return;
                }
            } else if (i == 2) {
                if (b == null) {
                    itx.m23287b("vclib", "Got an ENDPOINT_EXITED event for %s, which doesn't exist in endpoints", str);
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
                        itx.m23277a(5, str5, valueOf2);
                    }
                    this.f17804c.m22122b(b);
                    ayo = new iqr(valueOf);
                }
                valueOf = null;
                this.f17804c.m22122b(b);
                ayo = new iqr(valueOf);
            } else if (b != null) {
                switch (i) {
                    case 3:
                        if (b.m22952a(i2)) {
                            ayo = new iqn();
                            break;
                        }
                        return;
                    case 4:
                        iqo iqo;
                        boolean z3 = i2 != 0;
                        if (str2 == null) {
                            iqo = null;
                        } else {
                            iqo = this.f17804c.m22120b(str2);
                        }
                        if (b != iqo) {
                            ayo = new iqm(z3, iqo);
                            if (b.m22969k()) {
                                if (iqo != null) {
                                    iil.m21874a("Expected condition to be true", ((iqm) ayo).m22948a());
                                    b.m22951a(z3);
                                    break;
                                }
                            }
                            b.m22951a(z3);
                            break;
                        }
                        itx.m23277a(5, "vclib", "Got a remote mute request with the wrong by_participant_id, ignoring.");
                        return;
                        break;
                    case 5:
                        boolean z4;
                        if (i2 != 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        iil.m21874a("Expected condition to be true", b instanceof iqs);
                        ((iqs) b).m22955b(z4);
                        obj = new iqv(z4);
                        break;
                    default:
                        iil.m21870a("Unexpected event type");
                        ayo = null;
                        break;
                }
            } else {
                return;
            }
            m22018a(b, ayo);
            return;
        }
        ijt.m22019a("Got endpoint event, but there's no current call. Ignore.", new Object[0]);
    }

    public void mo3252d(byte[] bArr) {
        try {
            mat mat = (mat) nzf.m1027a(new mat(), bArr);
            for (ikf a : this.f17809i) {
                a.mo1554a(mat);
            }
        } catch (Throwable e) {
            itx.m23286b("vclib", "Cannot parse StreamRequest.", e);
        }
    }

    public void mo3255e(byte[] bArr) {
        try {
            this.f17806f.m21973k().mo1540a(new itm((lkl) nzf.m1027a(new lkl(), bArr)));
        } catch (Throwable e) {
            itx.m23286b("vclib", "Cannot parse Media Event.", e);
        }
    }

    public void mo3240a(byte[] bArr, long j) {
        try {
            this.f17820t.m23015a((mdq) nzf.m1027a(new mdq(), bArr), j);
        } catch (Throwable e) {
            itx.m23286b("vclib", "Cannot parse Transport Event.", e);
        }
    }

    public void mo3256f(byte[] bArr) {
        try {
            this.f17806f.m21973k().mo1544a(((mbp) nzf.m1027a(new mbp(), bArr)).f27251k);
        } catch (Throwable e) {
            itx.m23286b("vclib", "Cannot parse Transport Event.", e);
        }
    }

    public void mo3241a(byte[] bArr, String str) {
        try {
            this.f17820t.m23014a((mdh) nzf.m1027a(new mdh(), bArr), str);
        } catch (Throwable e) {
            itx.m23286b("vclib", "Cannot parse TimingLogEntry.", e);
        }
    }
}

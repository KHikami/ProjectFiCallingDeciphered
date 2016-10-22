import android.content.Context;
import android.graphics.Point;
import android.os.Handler;
import android.telecom.Call.Details;
import android.telecom.InCallService.VideoCall;
import android.telecom.VideoProfile;
import android.view.Window;
import java.util.Objects;

/* compiled from: PG */
public final class bdt extends bdj implements bcr, bcs, bct, bcv, bcx, bdc, bdd {
    static boolean a;
    public float b;
    public Context c;
    ayo d;
    VideoCall e;
    int f;
    aaz g;
    bbe h;
    public Handler j;
    public boolean k;
    public int l;
    boolean m;
    private int n;
    private int o;
    private int p;
    private Runnable q;

    public bdt() {
        this.o = 0;
        this.p = 0;
        this.f = 0;
        this.g = null;
        this.h = null;
        this.k = false;
        this.l = 0;
        this.m = false;
        this.q = new bdu(this);
    }

    public final /* synthetic */ void a(bdq bdq) {
        super.a((bdw) bdq);
        bdf.a((Object) this, "onUiUnready:");
        if (abw.c()) {
            a();
            bcj.b().b((bcv) this);
            bcj.b().b((bcr) this);
            bcj.b().b((bcx) this);
            bcj b = bcj.b();
            if (this != null) {
                b.d.remove(this);
            }
            bcj.b().b((bcs) this);
            bda bda = bda.a;
            if (this != null) {
                bda.d.remove(this);
            }
            bda = bda.a;
            if (this != null) {
                bda.c.remove(this);
            }
        }
    }

    public final /* synthetic */ void b(bdq bdq) {
        super.b((bdw) bdq);
        bdf.a((Object) this, "onUiReady:");
        if (abw.c()) {
            bcj.b().a((bcv) this);
            bcj.b().a((bcr) this);
            bcj.b().a((bcx) this);
            bcj b = bcj.b();
            Objects.requireNonNull(this);
            b.d.add(this);
            bcj.b().a((bcr) this);
            bcj.b().a((bcs) this);
            bda bda = bda.a;
            Objects.requireNonNull(this);
            bda.d.add(this);
            bda = bda.a;
            Objects.requireNonNull(this);
            bda.c.add(this);
            this.n = 0;
            this.o = 0;
            bcu bcu = bcj.b().o;
            a(bcu, bcu, azs.a);
        }
    }

    static {
        a = false;
    }

    static boolean c(int i) {
        return VideoProfile.isBidirectional(i) || VideoProfile.isTransmissionEnabled(i);
    }

    public static boolean a(int i, int i2) {
        if (!abw.c()) {
            return false;
        }
        boolean isPaused = VideoProfile.isPaused(i);
        boolean z;
        if (i2 == 3) {
            z = true;
        } else {
            z = false;
        }
        if (!isPaused && r2 && VideoProfile.isReceptionEnabled(i)) {
            return true;
        }
        return false;
    }

    private static void a(ayo ayo) {
        Object obj;
        int i;
        String valueOf = String.valueOf(ayo);
        bdf.a("VideoCallPresenter", new StringBuilder(String.valueOf(valueOf).length() + 28).append("updateCameraSelection: call=").append(valueOf).toString());
        valueOf = "VideoCallPresenter";
        String str = "updateCameraSelection: call=";
        if (ayo == null) {
            obj = null;
        } else {
            obj = ayo.l();
        }
        String valueOf2 = String.valueOf(obj);
        if (valueOf2.length() != 0) {
            valueOf2 = str.concat(valueOf2);
        } else {
            valueOf2 = new String(str);
        }
        bdf.a(valueOf, valueOf2);
        ayo e = azs.a.e();
        if (ayo == null) {
            bdf.b("VideoCallPresenter", "updateCameraSelection: Call object is null. Setting camera direction to default value (CAMERA_DIRECTION_UNKNOWN)");
            i = -1;
        } else if (buf.g(ayo)) {
            ayo.f.a(-1);
            i = -1;
        } else if (buf.a(e) && buf.d(ayo)) {
            i = e.f.a;
        } else if (buf.f(ayo) && !b(ayo)) {
            i = d(ayo.k());
            ayo.f.a(i);
        } else if (buf.f(ayo)) {
            i = ayo.f.a;
        } else if (buf.e(ayo) && !b(ayo)) {
            i = d(ayo.k());
            ayo.f.a(i);
        } else if (buf.e(ayo)) {
            i = ayo.f.a;
        } else {
            i = d(ayo.k());
        }
        valueOf = String.valueOf(ayo);
        bdf.a("VideoCallPresenter", new StringBuilder(String.valueOf(valueOf).length() + 68).append("updateCameraSelection: Setting camera direction to ").append(i).append(" Call=").append(valueOf).toString());
        bcj.b().k().a(i == 0);
    }

    private static int d(int i) {
        if (!VideoProfile.isTransmissionEnabled(i) || VideoProfile.isBidirectional(i)) {
            return 0;
        }
        return 1;
    }

    private static boolean b(ayo ayo) {
        return buf.a(ayo) && ayo.f.a != -1;
    }

    public final void a(bcu bcu, bcu bcu2, azs azs) {
        ayo j;
        boolean z;
        ayo ayo = null;
        String valueOf = String.valueOf(bcu);
        String valueOf2 = String.valueOf(bcu2);
        bdf.a((Object) this, new StringBuilder((String.valueOf(valueOf).length() + 50) + String.valueOf(valueOf2).length()).append("onStateChange oldState").append(valueOf).append(" newState=").append(valueOf2).append(" isVideoMode=").append(a).toString());
        if (bcu2 == bcu.NO_CALLS) {
            if (a) {
                b();
            }
            bdw bdw = (bdw) this.i;
            if (bdw == null) {
                bdf.e(this, "cleanupSurfaces");
            } else {
                bdw.b();
            }
        }
        if (bcu2 == bcu.INCOMING) {
            ayo = azs.e();
            j = azs.j();
            if (!buf.e(ayo)) {
                ayo = azs.j();
            }
        } else if (bcu2 == bcu.OUTGOING) {
            j = azs.d();
            ayo = j;
        } else if (bcu2 == bcu.PENDING_OUTGOING) {
            j = azs.c();
            ayo = j;
        } else if (bcu2 == bcu.INCALL) {
            j = azs.e();
            ayo = j;
        } else {
            j = null;
        }
        if (Objects.equals(this.d, ayo)) {
            z = false;
        } else {
            z = true;
        }
        bdf.a((Object) this, "onStateChange primaryChanged=" + z);
        String valueOf3 = String.valueOf(ayo);
        bdf.a((Object) this, new StringBuilder(String.valueOf(valueOf3).length() + 23).append("onStateChange primary= ").append(valueOf3).toString());
        valueOf3 = String.valueOf(this.d);
        bdf.a((Object) this, new StringBuilder(String.valueOf(valueOf3).length() + 29).append("onStateChange mPrimaryCall = ").append(valueOf3).toString());
        if (z) {
            z = buf.a(ayo);
            boolean z2 = a;
            bdf.a((Object) this, "onPrimaryCallChanged: isVideoCall=" + z + " isVideoMode=" + z2);
            if (!z && z2) {
                bdf.a((Object) this, "onPrimaryCallChanged: Exiting video mode...");
                b();
            } else if (z) {
                bdf.a((Object) this, "onPrimaryCallChanged: Entering video mode...");
                a(ayo);
                e(ayo);
            }
        } else if (this.d != null) {
            d(ayo);
        }
        c(ayo);
        if (j != null && (!buf.a(j) || j.c() == 4)) {
            bcj.b().a(false, false);
        }
        f(j);
    }

    public final void a(boolean z) {
        a();
    }

    public final void a(boolean z, int i) {
        bdf.a((Object) this, "onSecondaryCallerInfoVisibilityChanged : isVisible = " + z + " height = " + i);
        ((bdw) this.i).a(z, i);
    }

    private final void c(ayo ayo) {
        if (ayo == null) {
            this.n = 0;
            this.o = 0;
            this.e = null;
            this.d = null;
            return;
        }
        this.n = ayo.k();
        this.e = ayo.j();
        this.o = ayo.c();
        this.d = ayo;
    }

    public final void a(ayo ayo, Details details) {
        String valueOf = String.valueOf(ayo);
        String valueOf2 = String.valueOf(details);
        String valueOf3 = String.valueOf(this.d);
        bdf.a((Object) this, new StringBuilder(((String.valueOf(valueOf).length() + 46) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()).append(" onDetailsChanged call=").append(valueOf).append(" details=").append(valueOf2).append(" mPrimaryCall=").append(valueOf3).toString());
        if (ayo != null) {
            if (ayo.equals(this.d)) {
                d(ayo);
                c(ayo);
                return;
            }
            bdf.a((Object) this, " onDetailsChanged: Details not for current active call so returning. ");
        }
    }

    private final void d(ayo ayo) {
        boolean z;
        boolean z2 = false;
        VideoCall videoCall = ayo.b.getVideoCall();
        String valueOf = String.valueOf(videoCall);
        String valueOf2 = String.valueOf(this.e);
        bdf.a((Object) this, new StringBuilder((String.valueOf(valueOf).length() + 47) + String.valueOf(valueOf2).length()).append("checkForVideoCallChange: videoCall=").append(valueOf).append(" mVideoCall=").append(valueOf2).toString());
        if (!Objects.equals(videoCall, this.e)) {
            VideoCall videoCall2 = ayo.b.getVideoCall();
            String valueOf3 = String.valueOf(videoCall2);
            valueOf2 = String.valueOf(this.e);
            bdf.a((Object) this, new StringBuilder((String.valueOf(valueOf3).length() + 41) + String.valueOf(valueOf2).length()).append("changeVideoCall to videoCall=").append(valueOf3).append(" mVideoCall=").append(valueOf2).toString());
            z = this.e == null && videoCall2 != null;
            this.e = videoCall2;
            if (this.e == null || ayo == null) {
                bdf.a((Object) this, "Video call or primary call is null. Return");
            } else if (buf.a(ayo) && z) {
                e(ayo);
            }
        }
        boolean a = buf.a(ayo);
        if (this.n != ayo.k()) {
            z = true;
        } else {
            z = false;
        }
        boolean z3 = a;
        String valueOf4 = String.valueOf(VideoProfile.videoStateToString(this.n));
        String valueOf5 = String.valueOf(VideoProfile.videoStateToString(ayo.k()));
        bdf.a((Object) this, new StringBuilder((String.valueOf(valueOf4).length() + 126) + String.valueOf(valueOf5).length()).append("checkForVideoStateChange: isVideoCall= ").append(a).append(" hasVideoStateChanged=").append(z).append(" isVideoMode=").append(z3).append(" previousVideoState: ").append(valueOf4).append(" newVideoState: ").append(valueOf5).toString());
        if (z) {
            a(ayo);
            if (a) {
                e(ayo);
            } else if (a) {
                b();
            }
        }
        z = buf.a(ayo);
        if (this.o != ayo.c()) {
            z2 = true;
        }
        bdf.a((Object) this, "checkForCallStateChange: isVideoCall= " + z + " hasCallStateChanged=" + z2 + " isVideoMode=" + a);
        if (z2) {
            if (z) {
                bcd k = bcj.b().k();
                String a2 = k.a();
                a(ayo);
                if (!Objects.equals(a2, k.a()) && buf.e(ayo)) {
                    a(ayo.j(), true);
                }
            }
            b(ayo.k(), ayo.c());
        }
        Object b = bcj.b();
        boolean a3 = buf.a(ayo);
        if (b.m == null) {
            bdf.c(b, "InCallActivity is null. Can't set requested orientation.");
            return;
        }
        if (a3) {
            b.m.setRequestedOrientation(bci.d);
        } else {
            b.m.setRequestedOrientation(bci.e);
        }
        b.m.e(a3);
    }

    private final void e(ayo ayo) {
        VideoCall j = ayo.j();
        int k = ayo.k();
        String valueOf = String.valueOf(j);
        bdf.a((Object) this, new StringBuilder(String.valueOf(valueOf).length() + 51).append("adjustVideoMode videoCall= ").append(valueOf).append(" videoState: ").append(k).toString());
        bdw bdw = (bdw) this.i;
        if (bdw == null) {
            bdf.c((Object) this, "Error VideoCallUi is null so returning");
            return;
        }
        b(k, ayo.c());
        if (j != null) {
            if (bdw.d()) {
                String valueOf2 = String.valueOf(bdw.f());
                bdf.a((Object) this, new StringBuilder(String.valueOf(valueOf2).length() + 31).append("Calling setDisplaySurface with ").append(valueOf2).toString());
                j.setDisplaySurface(bdw.f());
            }
            j.setDeviceOrientation(this.p);
            a(j, c(k));
        }
        int i = this.n;
        this.n = k;
        a = true;
        if (!buf.h(i) && buf.h(k)) {
            f(ayo);
        }
    }

    final void a(VideoCall videoCall, boolean z) {
        String valueOf = String.valueOf(videoCall);
        bdf.a((Object) this, new StringBuilder(String.valueOf(valueOf).length() + 39).append("enableCamera: VideoCall=").append(valueOf).append(" enabling=").append(z).toString());
        if (videoCall == null) {
            bdf.e(this, "enableCamera: VideoCall is null.");
        } else if (z) {
            videoCall.setCamera(bcj.b().k().a());
            this.f = 1;
            videoCall.requestCameraCapabilities();
        } else {
            this.f = 0;
            videoCall.setCamera(null);
        }
    }

    private final void b() {
        bdf.a((Object) this, "exitVideoMode");
        b(0, 3);
        a(this.e, false);
        bcj.b().a(false, false);
        a = false;
    }

    private final void b(int i, int i2) {
        bdw bdw = (bdw) this.i;
        if (bdw == null) {
            bdf.c((Object) this, "showVideoUi, VideoCallUi is null returning");
            return;
        }
        boolean isTransmissionEnabled;
        boolean a = a(i, i2);
        if (abw.c()) {
            isTransmissionEnabled = VideoProfile.isTransmissionEnabled(i);
        } else {
            isTransmissionEnabled = false;
        }
        bdf.b((Object) this, "showVideoUi : showIncoming = " + a + " showOutgoing = " + isTransmissionEnabled);
        if (a || isTransmissionEnabled) {
            bdw.a(isTransmissionEnabled, a);
            if (VideoProfile.isReceptionEnabled(i)) {
                bdw = (bdw) this.i;
                if (bdw != null) {
                    new bdv(this, bdw).execute(new Void[0]);
                }
            }
        } else {
            bdw.a();
        }
        Object b = bcj.b();
        isTransmissionEnabled = VideoProfile.isAudioOnly(i);
        bdf.b(b, "enableScreenTimeout: value=" + isTransmissionEnabled);
        if (b.m == null) {
            bdf.c(b, "enableScreenTimeout: InCallActivity is null.");
            return;
        }
        Window window = b.m.getWindow();
        if (isTransmissionEnabled) {
            window.clearFlags(128);
        } else {
            window.addFlags(128);
        }
    }

    public final void a(ayo ayo, int i, int i2) {
        bdf.a((Object) this, "onUpdatePeerDimensions: width= " + i + " height= " + i2);
        if (((bdw) this.i) == null) {
            bdf.c((Object) this, "VideoCallUi is null. Bail out");
        } else if (!ayo.equals(this.d)) {
            bdf.c((Object) this, "Current call is not equal to primary call. Bail out");
        } else if (i > 0 && i2 > 0) {
            bdf.b((Object) this, "setDisplayVideoSize: Received peer width=" + i + " height=" + i2);
            bdw bdw = (bdw) this.i;
            if (bdw != null) {
                Point j = bdw.j();
                int i3 = j.x;
                bdf.b((Object) this, "setDisplayVideoSize: windowmgr width=" + i3 + " windowmgr height=" + j.y);
                if (j.y * i > j.x * i2) {
                    j.y = (j.x * i2) / i;
                } else if (j.y * i < j.x * i2) {
                    j.x = (j.y * i) / i2;
                }
                bdw.c(j.x, j.y);
            }
        }
    }

    public final void b(ayo ayo, int i, int i2) {
        String valueOf = String.valueOf(ayo);
        bdf.a((Object) this, new StringBuilder(String.valueOf(valueOf).length() + 67).append("onCameraDimensionsChange call=").append(valueOf).append(" width=").append(i).append(" height=").append(i2).toString());
        bdw bdw = (bdw) this.i;
        if (bdw == null) {
            bdf.c((Object) this, "onCameraDimensionsChange ui is null");
        } else if (ayo.equals(this.d)) {
            this.f = 2;
            c(i, i2);
            if (bdw.e()) {
                this.f = 3;
                this.e.setPreviewSurface(bdw.i());
            }
        } else {
            bdf.c((Object) this, "Call is not primary call");
        }
    }

    public final void b(int i) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("onCallSessionEvent = ");
        switch (i) {
            case rq.b /*1*/:
                stringBuilder.append("rx_pause");
                break;
            case rq.c /*2*/:
                stringBuilder.append("rx_resume");
                break;
            case rl.g /*5*/:
                stringBuilder.append("camera_failure");
                break;
            case rl.i /*6*/:
                stringBuilder.append("camera_ready");
                break;
            default:
                stringBuilder.append("unknown event = ");
                stringBuilder.append(i);
                break;
        }
        bdf.a((Object) this, stringBuilder.toString());
    }

    public final void a(long j) {
        bdf.a((Object) this, "onCallDataUsageChange dataUsage=" + j);
    }

    public final void a(int i) {
        this.p = i;
        bdw bdw = (bdw) this.i;
        if (bdw == null) {
            bdf.c((Object) this, "onDeviceOrientationChanged: VideoCallUi is null");
            return;
        }
        Point k = bdw.k();
        if (k != null) {
            String valueOf = String.valueOf(k);
            bdf.a((Object) this, new StringBuilder(String.valueOf(valueOf).length() + 58).append("onDeviceOrientationChanged: orientation=").append(i).append(" size: ").append(valueOf).toString());
            c(k.x, k.y);
            bdw.a(this.p);
        }
    }

    private void f(ayo ayo) {
        if (!this.k) {
            return;
        }
        if (ayo == null || !((ayo == null || (ayo.c() == 3 && buf.a(ayo))) && !bcj.b().v && buf.b(ayo))) {
            a();
        } else if (this.m) {
            bdf.b((Object) this, "maybeAutoEnterFullscreen : already pending.");
        } else {
            bdf.b((Object) this, "maybeAutoEnterFullscreen : scheduled");
            this.m = true;
            this.j.postDelayed(this.q, (long) this.l);
        }
    }

    public final void a() {
        if (this.m) {
            bdf.b((Object) this, "cancelAutoFullScreen : cancelling pending");
            this.m = false;
            return;
        }
        bdf.b((Object) this, "cancelAutoFullScreen : none pending.");
    }

    public final void a(bcu bcu, bcu bcu2, ayo ayo) {
        a(bcu, bcu2, azs.a);
    }

    private final void c(int i, int i2) {
        bdw bdw = (bdw) this.i;
        if (bdw != null) {
            float f;
            bdw.b(i, i2);
            if (i <= 0 || i2 <= 0) {
                f = 1.0f;
            } else {
                f = ((float) i) / ((float) i2);
            }
            int i3 = this.p;
            bdw = (bdw) this.i;
            if (bdw != null) {
                int i4;
                if (i3 == bci.b || i3 == bci.c) {
                    i4 = (int) (f * this.b);
                    i3 = (int) this.b;
                } else {
                    int i5 = (int) this.b;
                    i3 = (int) (f * this.b);
                    i4 = i5;
                }
                bdw.a(i4, i3);
            }
        }
    }
}

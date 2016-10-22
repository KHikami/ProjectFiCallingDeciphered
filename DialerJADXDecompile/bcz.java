import android.telecom.InCallService.VideoCall.Callback;
import android.telecom.VideoProfile;
import android.telecom.VideoProfile.CameraCapabilities;
import java.util.Iterator;

/* compiled from: PG */
public final class bcz extends Callback {
    private ayo a;

    public bcz(ayo ayo) {
        this.a = ayo;
    }

    public final void onSessionModifyRequestReceived(VideoProfile videoProfile) {
        String valueOf = String.valueOf(videoProfile);
        bdf.a((Object) this, new StringBuilder(String.valueOf(valueOf).length() + 45).append(" onSessionModifyRequestReceived videoProfile=").append(valueOf).toString());
        int i = buf.i(this.a.k());
        int i2 = buf.i(videoProfile.getVideoState());
        boolean h = buf.h(i);
        boolean h2 = buf.h(i2);
        if (!h && h2 && i != i2) {
            bda.a.a(this.a, i2);
        }
    }

    public final void onSessionModifyResponseReceived(int i, VideoProfile videoProfile, VideoProfile videoProfile2) {
        String valueOf = String.valueOf(videoProfile);
        String valueOf2 = String.valueOf(videoProfile2);
        bdf.a((Object) this, new StringBuilder((String.valueOf(valueOf).length() + 85) + String.valueOf(valueOf2).length()).append("onSessionModifyResponseReceived status=").append(i).append(" requestedProfile=").append(valueOf).append(" responseProfile=").append(valueOf2).toString());
        if (i != 1) {
            if (i == 4) {
                this.a.d(4);
            } else if (i == 5) {
                this.a.d(5);
            } else {
                this.a.d(2);
            }
        }
        this.a.d(0);
    }

    public final void onCallDataUsageChanged(long j) {
        bdf.a((Object) this, "onCallDataUsageChanged: dataUsage = " + j);
        bda.a.a(j);
    }

    public final void onCameraCapabilitiesChanged(CameraCapabilities cameraCapabilities) {
        if (cameraCapabilities != null) {
            bda bda = bda.a;
            ayo ayo = this.a;
            int width = cameraCapabilities.getWidth();
            int height = cameraCapabilities.getHeight();
            for (bdc b : bda.d) {
                b.b(ayo, width, height);
            }
        }
    }

    public final void onCallSessionEvent(int i) {
        for (bdd b : bda.a.c) {
            b.b(i);
        }
    }

    public final void onPeerDimensionsChanged(int i, int i2) {
        bda bda = bda.a;
        ayo ayo = this.a;
        for (bdc a : bda.d) {
            a.a(ayo, i, i2);
        }
    }

    public final void onVideoQualityChanged(int i) {
        bda bda = bda.a;
        ayo ayo = this.a;
        Iterator it = bda.c.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }
}

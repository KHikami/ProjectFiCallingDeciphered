import android.telecom.Call;
import android.telecom.Call.Callback;
import android.telecom.Call.Details;
import android.telecom.InCallService.VideoCall;
import java.util.List;

/* compiled from: PG */
final class ayp extends Callback {
    private /* synthetic */ ayo a;

    ayp(ayo ayo) {
        this.a = ayo;
    }

    public final void onStateChanged(Call call, int i) {
        String valueOf = String.valueOf(call);
        bdf.a((Object) this, new StringBuilder(String.valueOf(valueOf).length() + 61).append("TelecomCallCallback onStateChanged call=").append(valueOf).append(" newState=").append(i).toString());
        this.a.a();
    }

    public final void onParentChanged(Call call, Call call2) {
        String valueOf = String.valueOf(call);
        String valueOf2 = String.valueOf(call2);
        bdf.a((Object) this, new StringBuilder((String.valueOf(valueOf).length() + 52) + String.valueOf(valueOf2).length()).append("TelecomCallCallback onParentChanged call=").append(valueOf).append(" newParent=").append(valueOf2).toString());
        this.a.a();
    }

    public final void onChildrenChanged(Call call, List list) {
        this.a.a();
    }

    public final void onDetailsChanged(Call call, Details details) {
        String valueOf = String.valueOf(call);
        String valueOf2 = String.valueOf(details);
        bdf.a((Object) this, new StringBuilder((String.valueOf(valueOf).length() + 49) + String.valueOf(valueOf2).length()).append("TelecomCallCallback onStateChanged call=").append(valueOf).append(" details=").append(valueOf2).toString());
        this.a.a();
    }

    public final void onCannedTextResponsesLoaded(Call call, List list) {
        String valueOf = String.valueOf(call);
        String valueOf2 = String.valueOf(list);
        bdf.a((Object) this, new StringBuilder((String.valueOf(valueOf).length() + 61) + String.valueOf(valueOf2).length()).append("TelecomCallCallback onStateChanged call=").append(valueOf).append(" cannedTextResponses=").append(valueOf2).toString());
        this.a.a();
    }

    public final void onPostDialWait(Call call, String str) {
        String valueOf = String.valueOf(call);
        bdf.a((Object) this, new StringBuilder((String.valueOf(valueOf).length() + 67) + String.valueOf(str).length()).append("TelecomCallCallback onStateChanged call=").append(valueOf).append(" remainingPostDialSequence=").append(str).toString());
        this.a.a();
    }

    public final void onVideoCallChanged(Call call, VideoCall videoCall) {
        String valueOf = String.valueOf(call);
        String valueOf2 = String.valueOf(videoCall);
        bdf.a((Object) this, new StringBuilder((String.valueOf(valueOf).length() + 51) + String.valueOf(valueOf2).length()).append("TelecomCallCallback onStateChanged call=").append(valueOf).append(" videoCall=").append(valueOf2).toString());
        this.a.a();
    }

    public final void onCallDestroyed(Call call) {
        String valueOf = String.valueOf(call);
        bdf.a((Object) this, new StringBuilder(String.valueOf(valueOf).length() + 40).append("TelecomCallCallback onStateChanged call=").append(valueOf).toString());
        call.unregisterCallback(this);
    }

    public final void onConferenceableCallsChanged(Call call, List list) {
        this.a.a();
    }
}

import android.telecom.Call;
import android.telecom.Call.Callback;
import android.telecom.Call.Details;
import java.util.List;

/* compiled from: PG */
final class bcl extends Callback {
    private /* synthetic */ bcj a;

    bcl(bcj bcj) {
        this.a = bcj;
    }

    public final void onPostDialWait(Call call, String str) {
        ayo a = this.a.k.a(call);
        if (a == null) {
            String valueOf = String.valueOf(call);
            bdf.e(this, new StringBuilder(String.valueOf(valueOf).length() + 29).append("Call not found in call list: ").append(valueOf).toString());
            return;
        }
        bcj bcj = this.a;
        valueOf = a.d;
        if (bcj.e()) {
            bcj.m.a(valueOf, str);
        }
    }

    public final void onDetailsChanged(Call call, Details details) {
        ayo a = this.a.k.a(call);
        if (a == null) {
            String valueOf = String.valueOf(call);
            bdf.e(this, new StringBuilder(String.valueOf(valueOf).length() + 29).append("Call not found in call list: ").append(valueOf).toString());
            return;
        }
        for (bcr a2 : this.a.a) {
            a2.a(a, details);
        }
    }

    public final void onConferenceableCallsChanged(Call call, List list) {
        String valueOf = String.valueOf(call);
        bdf.d(this, new StringBuilder(String.valueOf(valueOf).length() + 30).append("onConferenceableCallsChanged: ").append(valueOf).toString());
        onDetailsChanged(call, call.getDetails());
    }
}

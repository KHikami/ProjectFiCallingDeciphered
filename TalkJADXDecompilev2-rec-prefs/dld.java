package p000;

import android.content.Context;
import android.os.Bundle;

public final class dld implements dlc {
    private final Context f10069a;

    public dld(Context context) {
        this.f10069a = context;
    }

    public lkm mo1596a(lkm lkm, Bundle bundle) {
        boolean z;
        boolean z2 = false;
        int i = bundle.getInt("account_id");
        lkm.isPstnOnlyClient = Boolean.valueOf(bundle.getBoolean("is_pstn_only"));
        if (gwb.m2061b(lkm.isPstnOnlyClient)) {
            lkm.participantFastPollPeriodMillis = Integer.valueOf(gwb.m1492a(this.f10069a, "babel_participant_fast_poll_period_millis", 0));
            lkm.sessionFastPollPeriodMillis = Integer.valueOf(gwb.m1492a(this.f10069a, "babel_session_fast_poll_period_millis", 0));
        }
        lkm.useGracefulCallDegradation = Boolean.valueOf(fdq.f12790f.m14370b(i));
        lkm.lowVideoBandwidthThreshold = Integer.valueOf((int) fdq.f12795k.m14371c(i));
        lkm.lowVideoBandwidthConsecutiveFramesRequired = Integer.valueOf((int) fdq.f12796l.m14371c(i));
        lkm.callStartStatsWarmupFrames = Integer.valueOf((int) fdq.f12797m.m14371c(i));
        lkm.enablePeerconnection = Boolean.valueOf(fdq.f12802r.m14370b(i));
        if (gwb.m1906a(this.f10069a, "babel_hangout_allow_singlecast", true) && fdq.f12801q.m14370b(i)) {
            z = true;
        } else {
            z = false;
        }
        lkm.enableSinglecast = Boolean.valueOf(z);
        lkm.enableOpusDtx = Boolean.valueOf(fdq.f12803s.m14370b(i));
        lkm.enableOpusFec = Boolean.valueOf(fdq.f12804t.m14370b(i));
        if (fdq.f12799o.m14370b(i) || fdq.f12800p.m14370b(i)) {
            z2 = true;
        }
        lkm.allowH264 = Boolean.valueOf(z2);
        lkm.enableDirectRendering = Boolean.valueOf(true);
        return lkm;
    }
}

package defpackage;

import android.content.Context;
import android.os.Bundle;

public final class dld implements dlc {
    private final Context a;

    public dld(Context context) {
        this.a = context;
    }

    public lkm a(lkm lkm, Bundle bundle) {
        boolean z;
        boolean z2 = false;
        int i = bundle.getInt("account_id");
        lkm.isPstnOnlyClient = Boolean.valueOf(bundle.getBoolean("is_pstn_only"));
        if (gwb.b(lkm.isPstnOnlyClient)) {
            lkm.participantFastPollPeriodMillis = Integer.valueOf(gwb.a(this.a, "babel_participant_fast_poll_period_millis", 0));
            lkm.sessionFastPollPeriodMillis = Integer.valueOf(gwb.a(this.a, "babel_session_fast_poll_period_millis", 0));
        }
        lkm.useGracefulCallDegradation = Boolean.valueOf(fdq.f.b(i));
        lkm.lowVideoBandwidthThreshold = Integer.valueOf((int) fdq.k.c(i));
        lkm.lowVideoBandwidthConsecutiveFramesRequired = Integer.valueOf((int) fdq.l.c(i));
        lkm.callStartStatsWarmupFrames = Integer.valueOf((int) fdq.m.c(i));
        lkm.enablePeerconnection = Boolean.valueOf(fdq.r.b(i));
        if (gwb.a(this.a, "babel_hangout_allow_singlecast", true) && fdq.q.b(i)) {
            z = true;
        } else {
            z = false;
        }
        lkm.enableSinglecast = Boolean.valueOf(z);
        lkm.enableOpusDtx = Boolean.valueOf(fdq.s.b(i));
        lkm.enableOpusFec = Boolean.valueOf(fdq.t.b(i));
        if (fdq.o.b(i) || fdq.p.b(i)) {
            z2 = true;
        }
        lkm.allowH264 = Boolean.valueOf(z2);
        lkm.enableDirectRendering = Boolean.valueOf(true);
        return lkm;
    }
}

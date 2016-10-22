package com.google.android.apps.hangouts.realtimechat;

import android.os.Bundle;
import android.os.SystemClock;
import bhl;
import ffc;
import flt;
import gjk;
import gjn;
import glk;
import gwb;
import gzc;
import jyn;
import kae;

public class GcmMessageReceiver extends gzc {
    private static final boolean a;

    static {
        kae kae = glk.o;
        a = false;
    }

    public void a(Bundle bundle) {
        if (!gwb.a(gwb.H(), "babel_enable_gcm_message_receiver", false)) {
            return;
        }
        if (bundle == null) {
            glk.e("Babel_GcmMsgReceiver", "GcmMessageReceiver.onMessageReceived called with null bundle", new Object[0]);
            return;
        }
        ((bhl) jyn.a(getApplicationContext(), bhl.class)).a(new ffc(bundle, 1000 * SystemClock.elapsedRealtime()));
    }

    public void a() {
        if (gwb.a(gwb.H(), "babel_enable_gcm_message_receiver", false)) {
            if (gjk.b) {
                new gjn().a("gcm_dirty_ping").b();
            }
            glk.a("Babel_GcmMsgReceiver", "Received dirty ping message from GcmMessageReceiver", new Object[0]);
            RealTimeChatService.a(flt.DIRTY_PING_SYNC);
        }
    }
}

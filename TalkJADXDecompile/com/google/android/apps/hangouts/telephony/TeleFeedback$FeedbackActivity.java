package com.google.android.apps.hangouts.telephony;

import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import bko;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import dw;
import fde;
import gcx;
import gcy;
import glk;
import gwb;
import ifl;
import jyn;
import lkx;
import mav;

public class TeleFeedback$FeedbackActivity extends dw {
    String n;

    public void onCreate(Bundle bundle) {
        glk.c("Babel_telephony", "TeleFeedback.FeedbackActivity.onCreate", new Object[0]);
        super.onCreate(bundle);
        ((NotificationManager) getSystemService("notification")).cancel("telephony_call_feedback", getIntent().getIntExtra("telephony_id", 0));
        int intExtra = getIntent().getIntExtra("telephony_rating", 0);
        if (intExtra == 5) {
            glk.c("Babel_telephony", "TeleFeedback.FeedbackActivity.onCreate, rated good, doing nothing", new Object[0]);
            c(intExtra);
            return;
        }
        b(false);
    }

    private void c(int i) {
        mav mav = new mav();
        mav.p = Integer.valueOf(59);
        mav.c = getIntent().getStringExtra("participant_log_id");
        mav.g = new lkx();
        String stringExtra = getIntent().getStringExtra("local_session_id");
        CharSequence stringExtra2 = getIntent().getStringExtra("remote_session_id");
        mav.d = stringExtra;
        lkx lkx = mav.g;
        if (!TextUtils.isEmpty(stringExtra2)) {
            CharSequence charSequence = stringExtra2;
        }
        lkx.a = stringExtra;
        mav.g.c = Integer.valueOf(i);
        bko e = fde.e(getIntent().getIntExtra("account_id", -1));
        if (e != null) {
            RealTimeChatService.a(e, mav.g.a, mav, true);
        }
        finish();
    }

    public void a(String str, boolean z) {
        if (z) {
            glk.c("Babel_telephony", "TeleFeedback.FeedbackActivity.onCallIssueSelected, good call, closing", new Object[0]);
            c(5);
            return;
        }
        glk.c("Babel_telephony", "TeleFeedback.FeedbackActivity.onCallIssueSelected, showing audio issues", new Object[0]);
        this.n = str;
        b(true);
    }

    public void a(String str) {
        String str2;
        gcy gcy;
        glk.c("Babel_telephony", "TeleFeedback.FeedbackActivity.onAudioIssueSelected, sending feedback", new Object[0]);
        String str3 = this.n;
        if (getIntent().getBooleanExtra("handoff_attempted", false)) {
            str2 = "[HANDOFF] ";
        } else if (getIntent().getIntExtra("call_type", 0) == 2) {
            int intExtra = getIntent().getIntExtra("network_type", -1);
            boolean booleanExtra = getIntent().getBooleanExtra("was_on_wifi", false);
            if (intExtra == -1) {
                str2 = "[WIFI] ";
            } else if (booleanExtra) {
                str2 = String.format("[WIFI + %s] ", new Object[]{gwb.v(intExtra)});
            } else {
                str2 = String.format("[%s] ", new Object[]{gwb.v(intExtra)});
            }
        } else {
            str2 = "[CELL] ";
        }
        if (!TextUtils.isEmpty(str3)) {
            if (TextUtils.isEmpty(str)) {
                str = str3;
            } else {
                str = new StringBuilder((String.valueOf(str3).length() + 2) + String.valueOf(str).length()).append(str3).append(", ").append(str).toString();
            }
        }
        if (TextUtils.isEmpty(str)) {
            str3 = str2;
        } else {
            str3 = String.valueOf(str2);
            str2 = String.valueOf(str);
            str3 = str2.length() != 0 ? str3.concat(str2) : new String(str3);
        }
        String str4 = "Babel_telephony";
        String str5 = "TeleFeedback.FeedbackActivity.sendFeedback: ";
        str2 = String.valueOf(str3);
        if (str2.length() != 0) {
            str2 = str5.concat(str2);
        } else {
            str2 = new String(str5);
        }
        glk.c(str4, str2, new Object[0]);
        Bundle bundleExtra = getIntent().getBundleExtra("telephony_call_info");
        int intExtra2 = getIntent().getIntExtra("telephony_rating", 0);
        if (gcy.d != null) {
            gcy = gcy.d;
        } else {
            gcy = new gcy(this);
        }
        gcy.a(((ifl) jyn.a((Context) this, ifl.class)).a(bundleExtra).a("rating", Integer.toString(intExtra2)).b(str3).c("com.google.android.talk.telephony").a(fde.a((Context) this, getIntent().getIntExtra("account_id", -1))).a());
        c(1);
    }

    private void b(boolean z) {
        int intExtra = getIntent().getIntExtra("telephony_rating", 0);
        boolean booleanExtra = getIntent().getBooleanExtra("is_incoming", false);
        gcx gcx = new gcx();
        Bundle bundle = new Bundle();
        bundle.putInt("rating", intExtra);
        bundle.putBoolean("should_show_audio_issues", z);
        bundle.putBoolean("is_incoming", booleanExtra);
        gcx.setArguments(bundle);
        gcx.a(J_(), z ? "audio_issue_chooser" : "call_issue_chooser");
    }
}

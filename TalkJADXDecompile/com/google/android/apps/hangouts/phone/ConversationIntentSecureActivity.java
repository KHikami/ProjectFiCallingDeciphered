package com.google.android.apps.hangouts.phone;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import dgg;
import glk;
import iih;
import java.util.Locale;
import jcb;
import jcc;
import jcf;
import jmj;
import jmu;
import jna;
import jzp;

public class ConversationIntentSecureActivity extends jzp implements jcc {
    private jmj n;

    public ConversationIntentSecureActivity() {
        this.n = new jmj(this, this.q).a("active-hangouts-account").a(this.p).b((jcc) this);
    }

    public void a(boolean z, jcb jcb, jcb jcb2, int i, int i2) {
        if (jcb2 == jcb.VALID) {
            c(i2);
        } else {
            finish();
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (g()) {
            Intent intent = getIntent();
            if (intent == null) {
                glk.d("Babel_ConvIntSecureAct", "No intent attached", new Object[0]);
                setResult(0);
                finish();
                return;
            }
            Object stringExtra = intent.getStringExtra("account_name");
            if (TextUtils.isEmpty(stringExtra)) {
                glk.e("Babel_ConvIntSecureAct", "No account name provided", new Object[0]);
            }
            String toLowerCase = stringExtra.toLowerCase(Locale.US);
            jcf jcf = (jcf) this.p.a(jcf.class);
            int b = jcf.b(toLowerCase);
            if (jcf.d(b)) {
                c(b);
                return;
            }
            this.n.a(new jmu().b().a(toLowerCase).a(jna.class));
            return;
        }
        setResult(0);
        finish();
    }

    private void c(int i) {
        Object obj;
        Intent intent = getIntent();
        String action = intent.getAction();
        String stringExtra = intent.getStringExtra("conversation_id");
        String stringExtra2 = intent.getStringExtra("participant_gaia");
        String stringExtra3 = intent.getStringExtra("participant_name");
        String stringExtra4 = intent.getStringExtra("auto_join_call_policy");
        CharSequence stringExtra5 = intent.getStringExtra("android.intent.extra.TEXT");
        long longExtra = intent.getLongExtra("watermark", 0);
        boolean booleanExtra = intent.getBooleanExtra("requires_mms", false);
        Uri uri = (Uri) intent.getParcelableExtra("hangout_uri");
        int intExtra = intent.getIntExtra("opened_from_impression", -1);
        if (intExtra != -1) {
            ((iih) this.p.a(iih.class)).a(i).b().c(intExtra);
        }
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("hangout_call_end_intent");
        if (stringExtra2 != null && uri != null) {
            String valueOf = String.valueOf(uri);
            glk.d("Babel_ConvIntSecureAct", new StringBuilder(String.valueOf(valueOf).length() + 36).append("Got intent with non-null gaiaId and ").append(valueOf).toString(), new Object[0]);
            obj = null;
        } else if ("android.intent.action.SENDTO".equals(action) && TextUtils.isEmpty(stringExtra5)) {
            glk.d("Babel_ConvIntSecureAct", "SENDTO action must include message text", new Object[0]);
            obj = null;
        } else {
            obj = 1;
        }
        if (obj == null) {
            setResult(0);
            finish();
        } else if (intent.getBooleanExtra("end_video", false)) {
            dgg a = dgg.a();
            if (a.s() != null) {
                a.a(11004);
            } else {
                glk.d("Babel_ConvIntSecureAct", "invalid request to end video call", new Object[0]);
            }
            setResult(-1);
            finish();
        } else {
            Intent a2;
            if (uri != null || intent.getBooleanExtra("start_video", false)) {
                int intExtra2 = intent.getIntExtra("hangout_start_source", 59);
                int intExtra3 = intent.getIntExtra("media_type", 0);
                if ("never".equals(stringExtra4)) {
                    a2 = BabelGatewayActivity.a(i, stringExtra2, stringExtra3, uri, pendingIntent, intExtra2, intExtra3);
                } else {
                    a2 = BabelGatewayActivity.b(i, stringExtra2, stringExtra3, uri, pendingIntent, intExtra2, intExtra3);
                }
                a2.putExtra("hangout_video_source", intent.getIntExtra("hangout_video_source", 0));
                a2.putExtra("hangout_mute_playback", intent.getBooleanExtra("hangout_mute_playback", false));
                a2.putExtra("hangout_mute_microphone", intent.getBooleanExtra("hangout_mute_microphone", false));
            } else if ("android.intent.action.SENDTO".equals(action)) {
                a2 = BabelGatewayActivity.a(this, i, stringExtra, stringExtra2, stringExtra3, stringExtra5, longExtra, booleanExtra);
                if (intent.hasExtra("otr_state")) {
                    a2.putExtra("otr_state", intent.getBooleanExtra("otr_state", false));
                }
            } else {
                a2 = "com.google.android.apps.babel.realtimechat.update-watermark".equals(action) ? BabelGatewayActivity.a(i, stringExtra) : !TextUtils.isEmpty(stringExtra) ? BabelGatewayActivity.a(this, i, stringExtra, stringExtra5) : !TextUtils.isEmpty(stringExtra2) ? BabelGatewayActivity.a(i, stringExtra2, stringExtra3, (String) stringExtra5, false, null) : BabelGatewayActivity.a((Context) this, i);
            }
            a2.putExtra("account_id", i);
            a2.addFlags(67108864);
            setResult(-1);
            startActivity(a2);
            finish();
        }
    }

    protected boolean g() {
        return true;
    }
}

package com.google.android.apps.hangouts.phone;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.widget.Toast;
import bc;
import bcf;
import bcn;
import bkk;
import bko;
import blo;
import bls;
import boy;
import cnt;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import dcl;
import dhz;
import dui;
import duj;
import ejb;
import ejc;
import fbw;
import fde;
import fei;
import fip;
import fme;
import fmf;
import glj;
import glk;
import glq;
import gwb;
import iih;
import iil;
import jcb;
import jcc;
import jcf;
import jcu;
import juh;
import jyn;
import kae;
import wi;

public class BabelGatewayActivity extends dcl implements OnCancelListener, OnClickListener, dui, jcc {
    public static final boolean r;
    public boolean A;
    public int B;
    public boolean C;
    public int D;
    private Intent G;
    private String H;
    private boolean I;
    private boolean J;
    private boolean K;
    private int L;
    private long M;
    private boolean N;
    private Uri O;
    private String P;
    private String Q;
    private final fip R;
    public bko s;
    public String[] t;
    public String[] u;
    public String v;
    public boolean w;
    public boolean x;
    public int y;
    public int z;

    public BabelGatewayActivity() {
        new jcu(this, this.F).a(this.E).a((jcc) this);
        this.t = new String[0];
        this.u = new String[0];
        this.R = new ejb(this);
    }

    static {
        kae kae = glk.k;
        r = false;
    }

    public static Intent a(Context context, int i) {
        Intent intent = new Intent(context, BabelGatewayActivity.class);
        intent.setAction("android.intent.action.VIEW");
        intent.putExtra("account_id", i);
        return intent;
    }

    public static Intent a(int i, String str, String str2, String str3, boolean z, String str4) {
        Intent intent = new Intent(gwb.H(), BabelGatewayActivity.class);
        intent.setType("text/plain");
        intent.setAction("android.intent.action.VIEW");
        intent.putExtra("account_id", i);
        intent.putExtra("participant_gaia", str);
        intent.putExtra("participant_name", str2);
        intent.putExtra("start_video", false);
        intent.putExtra("android.intent.extra.TEXT", str3);
        intent.putExtra("force_group", z);
        intent.putExtra("invite_token_url", str4);
        return intent;
    }

    public static Intent a(Context context, int i, String str, String str2, String str3, String str4, long j, boolean z) {
        Intent intent = new Intent(context, BabelGatewayActivity.class);
        intent.setType("text/plain");
        intent.setAction("android.intent.action.SENDTO");
        intent.putExtra("account_id", i);
        if (TextUtils.isEmpty(str)) {
            intent.putExtra("participant_gaia", str2);
            intent.putExtra("participant_name", str3);
        } else {
            intent.putExtra("conversation_id", str);
        }
        intent.putExtra("android.intent.extra.TEXT", str4);
        intent.putExtra("watermark", j);
        intent.putExtra("requires_mms", z);
        return intent;
    }

    public static Intent a(Context context, int i, String str, long j, boolean z, boolean z2) {
        Intent intent = new Intent(context, BabelGatewayActivity.class);
        intent.setAction("android.intent.action.SENDTO");
        intent.putExtra("account_id", i);
        intent.putExtra("conversation_id", str);
        intent.putExtra("watermark", j);
        intent.putExtra("otr_state", z2);
        intent.putExtra("requires_mms", z);
        return intent;
    }

    public static Intent a(Context context, int i, String str) {
        Intent intent = new Intent(context, BabelGatewayActivity.class);
        intent.setAction("android.intent.action.SENDTO");
        intent.putExtra("account_id", i);
        intent.putExtra("conversation_id", str);
        return intent;
    }

    public static Intent a(Context context, int i, String str, String str2, String str3) {
        Intent intent = new Intent(context, BabelGatewayActivity.class);
        intent.setType("text/plain");
        intent.setAction("android.intent.action.VIEW");
        intent.putExtra("account_id", i);
        if (TextUtils.isEmpty(str)) {
            intent.putExtra("participant_name", str2);
        } else {
            intent.putExtra("conversation_id", str);
        }
        intent.putExtra("android.intent.extra.TEXT", str3);
        return intent;
    }

    public static Intent a(int i, String str) {
        Intent intent = new Intent(gwb.H(), BabelGatewayActivity.class);
        intent.setAction("com.google.android.apps.babel.realtimechat.update-watermark");
        intent.putExtra("account_id", i);
        intent.putExtra("conversation_id", str);
        return intent;
    }

    public static Intent a(Context context, int i, String str, String str2) {
        Intent intent = new Intent(context, BabelGatewayActivity.class);
        intent.setType("text/plain");
        intent.setAction("android.intent.action.VIEW");
        intent.putExtra("account_id", i);
        intent.putExtra("conversation_id", str);
        intent.putExtra("android.intent.extra.TEXT", str2);
        return intent;
    }

    public static Intent b(Context context, int i, String str) {
        Intent intent = new Intent(context, BabelGatewayActivity.class);
        intent.setAction("android.intent.action.VIEW");
        intent.putExtra("account_id", i);
        intent.putExtra("group_conversation_link", str);
        return intent;
    }

    public static Intent a(int i, String str, String str2, Uri uri, PendingIntent pendingIntent, int i2, int i3) {
        Intent intent = new Intent(gwb.H(), BabelGatewayActivity.class);
        intent.setAction("android.intent.action.VIEW");
        intent.putExtra("account_id", i);
        if (str != null) {
            intent.putExtra("participant_gaia", str);
            intent.putExtra("participant_name", str2);
            intent.putExtra("start_video", true);
        } else {
            iil.b("Expected non-null", (Object) uri);
            intent.putExtra("hangout_uri", uri);
        }
        if (pendingIntent != null) {
            intent.putExtra("hangout_call_end_intent", pendingIntent);
        }
        intent.putExtra("hangout_auto_join", false);
        intent.putExtra("hangout_start_source", i2);
        intent.putExtra("media_type", i3);
        intent.putExtra("extra_hangout_start_time", glj.b());
        return intent;
    }

    public static Intent b(int i, String str, String str2, Uri uri, PendingIntent pendingIntent, int i2, int i3) {
        Intent a = a(i, str, str2, uri, pendingIntent, i2, i3);
        a.setAction("android.intent.action.VIEW");
        a.putExtra("hangout_auto_join", true);
        return a;
    }

    protected void onCreate(Bundle bundle) {
        String str;
        this.G = getIntent();
        if (r) {
            str = "intent.getType() = ";
            String valueOf = String.valueOf(this.G.getType());
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
        }
        Object stringExtra = this.G.getStringExtra("participant_gaia");
        if (!TextUtils.isEmpty(stringExtra)) {
            this.t = stringExtra.split("\\|");
        }
        stringExtra = this.G.getStringExtra("participant_name");
        if (!TextUtils.isEmpty(stringExtra)) {
            this.u = stringExtra.split("\\|");
        }
        this.v = this.G.getStringExtra("conversation_id");
        Intent intent = this.G;
        str = intent.getStringExtra("android.intent.extra.TEXT");
        if (str == null) {
            str = gwb.a(intent, "android.intent.extra.TEXT");
        }
        this.H = str;
        this.I = this.G.getAction().equals("android.intent.action.SENDTO");
        this.J = this.G.getAction().equals("com.google.android.apps.babel.realtimechat.update-watermark");
        if (!this.G.hasExtra("otr_state")) {
            this.L = 0;
        } else if (this.G.getBooleanExtra("otr_state", false)) {
            this.L = 2;
        } else {
            this.L = 1;
        }
        this.M = this.G.getLongExtra("watermark", 0);
        this.N = this.G.getBooleanExtra("requires_mms", false);
        this.w = this.G.getBooleanExtra("start_video", false);
        this.K = this.G.getBooleanExtra("force_group", false);
        this.O = (Uri) this.G.getParcelableExtra("hangout_uri");
        this.x = this.G.getBooleanExtra("hangout_auto_join", false);
        this.y = this.G.getIntExtra("hangout_start_source", 51);
        this.z = this.G.getIntExtra("hangout_video_source", 0);
        this.A = this.G.getBooleanExtra("hangout_mute_microphone", false);
        this.B = this.G.getIntExtra("media_type", 0);
        this.C = this.G.getBooleanExtra("hangout_mute_playback", false);
        this.P = this.G.getStringExtra("invite_token_url");
        this.Q = this.G.getStringExtra("group_conversation_link");
        super.onCreate(bundle);
        if (!m()) {
            setResult(0);
            finish();
        }
    }

    private boolean m() {
        if (!this.I || !TextUtils.isEmpty(this.H)) {
            return true;
        }
        glk.e("Babel_GatewayActivity", "Cannot autosend without message text", new Object[0]);
        return false;
    }

    private void a(Intent intent, int i) {
        startActivity(intent);
        setResult(i);
        finish();
    }

    public void a(boolean z, jcb jcb, jcb jcb2, int i, int i2) {
        if (jcb2 == jcb.VALID) {
            this.s = fde.e(i2);
            if (m()) {
                iil.b("Expected non-null", this.s);
                int intExtra = this.G.getIntExtra("opened_from_impression", 0);
                if (intExtra != 0) {
                    ((iih) this.E.a(iih.class)).a(this.s.g()).b().c(intExtra);
                }
                if (!(this.I || this.J)) {
                    ((jcf) this.E.a(jcf.class)).a("active-hangouts-account", this.s.g());
                }
                if (this.O != null) {
                    Uri uri = this.O;
                    PendingIntent pendingIntent = (PendingIntent) this.G.getParcelableExtra("hangout_call_end_intent");
                    dhz a = dhz.a(uri, this.s.a(), pendingIntent);
                    if (a == null) {
                        glk.e("Babel_GatewayActivity", "invalid hangout request", new Object[0]);
                        if (pendingIntent != null) {
                            try {
                                pendingIntent.send();
                            } catch (Throwable e) {
                                glk.c("Babel_GatewayActivity", "callCompletionIntent failed", e);
                            }
                        }
                        d(bc.dD);
                        return;
                    }
                    a(gwb.b(a, null, this.x, this.y, glj.b()), -1);
                } else if (!TextUtils.isEmpty(this.v) || this.t.length > 0 || this.u.length > 0) {
                    iil.b("Expected non-null", this.s);
                    if (!TextUtils.isEmpty(this.v)) {
                        ((duj) jyn.a(gwb.H(), duj.class)).a(this.s.g()).a(new bkk(this.v, this));
                    } else if (this.t.length > 0) {
                        if (this.u.length > 0) {
                            j();
                            return;
                        }
                        glk.d("Babel_GatewayActivity", "BabelGatewayActivity.createConversation: incoming intent has no participant name", new Object[0]);
                        new ejc(this).f();
                    } else if (this.u.length <= 0 || glq.e(gwb.H(), this.u[0]) == null) {
                        iil.a("BabelGatewayActivity.createConversation: Participant id is null and conversation id is null");
                    } else {
                        boy boy;
                        String e2 = glq.e(gwb.H(), this.u[0]);
                        bcf newBuilder = juh.newBuilder();
                        newBuilder.a(bcn.newBuilder().a(e2).a(fbw.a(gwb.H(), e2)).a());
                        RealTimeChatService.a(this.R);
                        if (this.K) {
                            boy = boy.LOCAL_ONLY;
                        } else {
                            boy = boy.LOCAL_AND_SERVER;
                        }
                        fme a2 = ((fmf) this.E.a(fmf.class)).a();
                        this.D = a2.a();
                        RealTimeChatService.a(a2, new fei(getApplicationContext()).a(this.s.g()).a(newBuilder.a()).a(boy).a(this.w).b(this.K).b(this.P).a());
                    }
                } else {
                    Intent g = gwb.g(this.s);
                    if (this.Q != null) {
                        g.setAction("com.google.android.apps.hangouts.invites.grouplinksharing.open");
                        g.putExtra("group_conversation_link", this.Q);
                    }
                    a(g, -1);
                }
            }
        } else if (this.O != null) {
            PendingIntent pendingIntent2 = (PendingIntent) this.G.getParcelableExtra("hangout_call_end_intent");
            if (pendingIntent2 != null) {
                try {
                    pendingIntent2.send();
                } catch (Throwable e3) {
                    glk.c("Babel", "Call complete intent could not be sent", e3);
                }
            }
        }
    }

    public void j() {
        if (this.t.length != this.u.length) {
            iil.a("BabelGatewayActivity.createConversationWithParticipants: different number of participant gaia ids and names");
            return;
        }
        bcf newBuilder = juh.newBuilder();
        for (int i = 0; i < this.t.length; i++) {
            newBuilder.a(bcn.newBuilder().a(this.u[i]).a(fbw.a(this.t[i], this.u[i])).a());
        }
        RealTimeChatService.a(this.R);
        fme a = ((fmf) this.E.a(fmf.class)).a();
        this.D = a.a();
        RealTimeChatService.a(a, new fei(getApplicationContext()).a(this.s.g()).a(newBuilder.a()).a(boy.LOCAL_AND_SERVER).a(this.w).b(this.K).b(this.P).a());
    }

    public void onDestroy() {
        RealTimeChatService.b(this.R);
        super.onDestroy();
    }

    public Dialog onCreateDialog(int i, Bundle bundle) {
        if (bundle == null) {
            CharSequence charSequence = null;
        } else {
            Object string = bundle.getString("error_title");
        }
        CharSequence string2 = bundle == null ? null : bundle.getString("error_message");
        switch (i) {
            case wi.w /*0*/:
                Builder builder = new Builder(this);
                builder.setTitle(charSequence);
                builder.setMessage(string2);
                builder.setNeutralButton(17039370, this);
                builder.setOnCancelListener(this);
                return builder.create();
            default:
                return null;
        }
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        setResult(0);
        finish();
    }

    public void onCancel(DialogInterface dialogInterface) {
        setResult(0);
        finish();
    }

    public void d(int i) {
        Toast.makeText(this, i, 0).show();
        a(gwb.g(this.s), 0);
    }

    public void a(bls bls) {
        this.v = bls.s;
        e(bls.b);
    }

    public void a(bkk bkk) {
        d(bc.cL);
    }

    public void e(int i) {
        if (this.I) {
            if (this.M > 0) {
                RealTimeChatService.b(this.s, this.v, this.M);
            }
            if (r) {
                String str = "Auto-sending message to conversation ";
                String valueOf = String.valueOf(this.v);
                if (valueOf.length() != 0) {
                    str.concat(valueOf);
                } else {
                    valueOf = new String(str);
                }
            }
            ((cnt) this.E.a(cnt.class)).a(this.s.g(), this.v, this.H, null, this.N, blo.a(this.s.g(), 6));
            setResult(-1);
            finish();
        } else if (this.J) {
            RealTimeChatService.b(this.s, this.v, this.M);
            setResult(-1);
            finish();
        } else {
            Intent a = gwb.a(this.s.g(), this.v, i);
            if (!TextUtils.isEmpty(this.H)) {
                Parcelable intent = new Intent();
                intent.setType("text/plain");
                intent.putExtra("android.intent.extra.TEXT", this.H);
                intent.putExtra("conversation_id", this.v);
                a.putExtra("share_intent", intent);
            }
            a(a, -1);
        }
    }
}

package com.google.android.apps.hangouts.invites.offnetwork.impl;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import ba;
import bko;
import com.google.android.apps.hangouts.phone.BabelGatewayActivity;
import dcl;
import dsl;
import fde;
import gwb;
import jca;
import jcu;

public class OffnetworkInviteActivity extends dcl {
    private final jca r;

    public OffnetworkInviteActivity() {
        this.r = new jcu(this, this.F).a(false).a(this.E);
    }

    protected void onCreate(Bundle bundle) {
        Intent d;
        super.onCreate(bundle);
        bko e = fde.e(this.r.a());
        String stringExtra = getIntent().getStringExtra("conversation_id");
        String stringExtra2 = getIntent().getStringExtra("phone_number");
        bko e2 = fde.e(getIntent().getIntExtra("account_to_use_in_invite", -1));
        if (e2 == null) {
            ba.b(e != null, (Object) "No account for sending off-network invite");
            e2 = e;
        }
        int intExtra = getIntent().getIntExtra("account_to_deliver_sms", -1);
        bko e3 = fde.e(intExtra);
        CharSequence stringExtra3 = getIntent().getStringExtra("offnetwork_invite_url");
        if (TextUtils.isEmpty(stringExtra3)) {
            stringExtra3 = dsl.a(e2);
        }
        String string = getResources().getString(ba.lP, new Object[]{stringExtra3});
        if (e3 == null) {
            gwb.a(e2, 1896);
            d = gwb.d(gwb.H(), string, stringExtra2);
        } else {
            String str;
            if (e3.equals(e)) {
                gwb.a(e2, 1898);
                str = stringExtra;
            } else {
                gwb.a(e2, 1897);
                str = null;
            }
            d = BabelGatewayActivity.a((Context) this, intExtra, str, stringExtra2, string);
        }
        startActivity(d);
        finish();
    }

    public static Intent a(String str, String str2, int i, int i2, String str3) {
        Intent intent = new Intent(gwb.H(), OffnetworkInviteActivity.class);
        intent.putExtra("conversation_id", str);
        intent.putExtra("phone_number", str2);
        intent.putExtra("account_to_use_in_invite", i);
        intent.putExtra("account_to_deliver_sms", i2);
        if (!TextUtils.isEmpty(str3)) {
            intent.putExtra("offnetwork_invite_url", str3);
        }
        return intent;
    }
}

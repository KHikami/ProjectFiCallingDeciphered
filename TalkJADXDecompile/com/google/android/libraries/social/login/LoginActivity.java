package com.google.android.libraries.social.login;

import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import jcb;
import jcc;
import jmj;
import jmp;
import jmu;
import jzp;

public final class LoginActivity extends jzp implements jcc {
    final jmj n;
    private jmp o;
    private boolean r;

    public LoginActivity() {
        this.n = new jmj(this, this.q).b((jcc) this);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.n.a((jmu) getIntent().getParcelableExtra("login_request"));
            return;
        }
        this.r = bundle.getBoolean("impression_logged", false);
    }

    protected void a(Bundle bundle) {
        super.a(bundle);
        this.o = (jmp) this.p.b(jmp.class);
    }

    protected void onResume() {
        super.onResume();
        if (!this.r && this.o != null) {
            this.r = true;
        }
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("impression_logged", this.r);
    }

    public void a(boolean z, jcb jcb, jcb jcb2, int i, int i2) {
        if (i2 != -1) {
            Intent intent = (Intent) getIntent().getParcelableExtra("redirect_intent");
            Bundle bundle = (Bundle) getIntent().getParcelableExtra("redirect_intent_options");
            if (intent != null) {
                intent.putExtra("account_id", this.n.a());
                intent.addFlags(41943040);
                if (VERSION.SDK_INT >= 16) {
                    startActivity(intent, bundle);
                } else {
                    startActivity(intent);
                }
            } else {
                intent = new Intent();
                intent.putExtra("account_id", this.n.a());
                setResult(-1, intent);
            }
        } else {
            setResult(0);
        }
        finish();
    }
}

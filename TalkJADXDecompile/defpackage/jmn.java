package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.libraries.social.login.LoginActivity;

/* renamed from: jmn */
public final class jmn {
    private final Context a;
    private jmu b;
    private Intent c;
    private Bundle d;

    public jmn(Context context) {
        this.a = context;
    }

    public jmn a(jmu jmu) {
        this.b = jmu;
        return this;
    }

    public Intent a() {
        Intent intent = new Intent(this.a, LoginActivity.class);
        intent.putExtra("login_request", this.b);
        intent.putExtra("redirect_intent", this.c);
        intent.putExtra("redirect_intent_options", this.d);
        return intent;
    }
}

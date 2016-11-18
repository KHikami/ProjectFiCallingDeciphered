package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.libraries.social.login.LoginActivity;

public final class jmn {
    private final Context f20487a;
    private jmu f20488b;
    private Intent f20489c;
    private Bundle f20490d;

    public jmn(Context context) {
        this.f20487a = context;
    }

    public jmn m24710a(jmu jmu) {
        this.f20488b = jmu;
        return this;
    }

    public Intent m24709a() {
        Intent intent = new Intent(this.f20487a, LoginActivity.class);
        intent.putExtra("login_request", this.f20488b);
        intent.putExtra("redirect_intent", this.f20489c);
        intent.putExtra("redirect_intent_options", this.f20490d);
        return intent;
    }
}

package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

/* renamed from: fei */
public final class fei {
    private final Context a;
    private int b;
    private String c;
    private juh d;
    private boy e;
    private boolean f;
    private boolean g;
    private int h;
    private String i;
    private int j;

    public fei(Context context) {
        this.h = 0;
        this.a = context;
    }

    public fei a(int i) {
        this.b = i;
        return this;
    }

    public fei a(String str) {
        this.c = str;
        return this;
    }

    public fei a(juh juh) {
        this.d = juh;
        return this;
    }

    public fei a(boy boy) {
        this.e = boy;
        return this;
    }

    public fei a(boolean z) {
        this.f = z;
        return this;
    }

    public fei b(boolean z) {
        this.g = z;
        return this;
    }

    public fei b(int i) {
        this.h = i;
        return this;
    }

    public fei b(String str) {
        this.i = str;
        return this;
    }

    public fei c(int i) {
        this.j = i;
        return this;
    }

    public Intent a() {
        Intent intent = new Intent(this.a, RealTimeChatService.class);
        intent.putExtra("op", 30);
        intent.putExtra("account_id", this.b);
        intent.putExtra("conversation_name", this.c);
        intent.putExtra("audience", this.d);
        intent.putExtra("conversation_lookup", this.e);
        intent.putExtra("force_group", this.g);
        intent.putExtra("transport_type", this.h);
        if (this.f) {
            intent.putExtra("conversation_hangout", true);
        }
        intent.putExtra("invite_token_url", this.i);
        intent.putExtra("opened_from_impression", this.j);
        return intent;
    }
}

package p000;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class fei {
    private final Context f12893a;
    private int f12894b;
    private String f12895c;
    private juh f12896d;
    private boy f12897e;
    private boolean f12898f;
    private boolean f12899g;
    private int f12900h = 0;
    private String f12901i;
    private int f12902j;

    public fei(Context context) {
        this.f12893a = context;
    }

    public fei m15158a(int i) {
        this.f12894b = i;
        return this;
    }

    public fei m15160a(String str) {
        this.f12895c = str;
        return this;
    }

    public fei m15161a(juh juh) {
        this.f12896d = juh;
        return this;
    }

    public fei m15159a(boy boy) {
        this.f12897e = boy;
        return this;
    }

    public fei m15162a(boolean z) {
        this.f12898f = z;
        return this;
    }

    public fei m15165b(boolean z) {
        this.f12899g = z;
        return this;
    }

    public fei m15163b(int i) {
        this.f12900h = i;
        return this;
    }

    public fei m15164b(String str) {
        this.f12901i = str;
        return this;
    }

    public fei m15166c(int i) {
        this.f12902j = i;
        return this;
    }

    public Intent m15157a() {
        Intent intent = new Intent(this.f12893a, RealTimeChatService.class);
        intent.putExtra("op", 30);
        intent.putExtra("account_id", this.f12894b);
        intent.putExtra("conversation_name", this.f12895c);
        intent.putExtra("audience", this.f12896d);
        intent.putExtra("conversation_lookup", this.f12897e);
        intent.putExtra("force_group", this.f12899g);
        intent.putExtra("transport_type", this.f12900h);
        if (this.f12898f) {
            intent.putExtra("conversation_hangout", true);
        }
        intent.putExtra("invite_token_url", this.f12901i);
        intent.putExtra("opened_from_impression", this.f12902j);
        return intent;
    }
}

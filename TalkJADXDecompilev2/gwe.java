package defpackage;

import android.content.Intent;

public final class gwe extends gwc {
    final /* synthetic */ hgb a;
    final /* synthetic */ Intent b;
    final /* synthetic */ int c;

    public gwe(hgb hgb, Intent intent, int i) {
        this.a = hgb;
        this.b = intent;
        this.c = i;
    }

    public void a() {
        this.a.startActivityForResult(this.b, this.c);
    }
}

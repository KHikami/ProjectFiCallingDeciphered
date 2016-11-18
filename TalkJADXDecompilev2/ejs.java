package defpackage;

import android.content.Intent;
import com.google.android.apps.hangouts.phone.BabelHomeActivity;

public final class ejs implements bpz {
    public Intent a;
    final /* synthetic */ BabelHomeActivity b;

    public ejs(BabelHomeActivity babelHomeActivity) {
        this.b = babelHomeActivity;
    }

    public void a(int i) {
        glk.c("Babel_HomeActivity", "SMS transport selected:" + i, new Object[0]);
        if (this.a != null) {
            Intent intent = this.a;
            this.a = null;
            intent.putExtra("transport_type", i);
            this.b.c(intent);
        }
    }

    public void a() {
        glk.c("Babel_HomeActivity", "SMS transport cancel", new Object[0]);
    }
}

package p000;

import android.content.Intent;
import com.google.android.apps.hangouts.phone.BabelHomeActivity;

public final class ejs implements bpz {
    public Intent f11662a;
    final /* synthetic */ BabelHomeActivity f11663b;

    public ejs(BabelHomeActivity babelHomeActivity) {
        this.f11663b = babelHomeActivity;
    }

    public void mo661a(int i) {
        glk.m17979c("Babel_HomeActivity", "SMS transport selected:" + i, new Object[0]);
        if (this.f11662a != null) {
            Intent intent = this.f11662a;
            this.f11662a = null;
            intent.putExtra("transport_type", i);
            this.f11663b.mo1157c(intent);
        }
    }

    public void mo660a() {
        glk.m17979c("Babel_HomeActivity", "SMS transport cancel", new Object[0]);
    }
}

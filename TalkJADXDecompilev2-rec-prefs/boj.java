package p000;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

public final class boj extends enl {
    private boolean f4096w;
    private Cursor f4097x;

    public /* synthetic */ void mo212b(Object obj) {
        mo626a((Cursor) obj);
    }

    public boj(Context context, bko bko, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        super(context, bko, uri, strArr, str, strArr2, str2);
    }

    protected void mo216k() {
        super.mo216k();
        if (this.f4097x != null) {
            this.f4097x.close();
            this.f4097x = null;
        }
    }

    protected void mo214i() {
        this.f4096w = false;
        super.mo214i();
    }

    protected void mo215j() {
        this.f4096w = false;
        super.mo215j();
    }

    public void m6293a(boolean z) {
        this.f4096w = z;
        if (!z && this.f4097x != null) {
            Cursor cursor = this.f4097x;
            this.f4097x = null;
            String valueOf = String.valueOf(cursor);
            glk.m17979c("Babel_db", new StringBuilder(String.valueOf(valueOf).length() + 44).append("Delivered cursor that came in while paused: ").append(valueOf).toString(), new Object[0]);
            mo626a(cursor);
        }
    }

    public void mo626a(Cursor cursor) {
        if (this.f4096w) {
            String valueOf;
            if (this.f4097x != null) {
                valueOf = String.valueOf(this.f4097x);
                glk.m17979c("Babel_db", new StringBuilder(String.valueOf(valueOf).length() + 49).append("Multiple cursors delivered while paused, closing ").append(valueOf).toString(), new Object[0]);
                this.f4097x.close();
            }
            valueOf = String.valueOf(cursor);
            glk.m17979c("Babel_db", new StringBuilder(String.valueOf(valueOf).length() + 57).append("Cursor delivered while paused, keeping to deliver later: ").append(valueOf).toString(), new Object[0]);
            this.f4097x = cursor;
            return;
        }
        super.mo626a(cursor);
    }
}

package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

/* renamed from: boj */
public final class boj extends enl {
    private boolean w;
    private Cursor x;

    public /* synthetic */ void b(Object obj) {
        a((Cursor) obj);
    }

    public boj(Context context, bko bko, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        super(context, bko, uri, strArr, str, strArr2, str2);
    }

    protected void k() {
        super.k();
        if (this.x != null) {
            this.x.close();
            this.x = null;
        }
    }

    protected void i() {
        this.w = false;
        super.i();
    }

    protected void j() {
        this.w = false;
        super.j();
    }

    public void a(boolean z) {
        this.w = z;
        if (!z && this.x != null) {
            Cursor cursor = this.x;
            this.x = null;
            String valueOf = String.valueOf(cursor);
            glk.c("Babel_db", new StringBuilder(String.valueOf(valueOf).length() + 44).append("Delivered cursor that came in while paused: ").append(valueOf).toString(), new Object[0]);
            a(cursor);
        }
    }

    public void a(Cursor cursor) {
        if (this.w) {
            String valueOf;
            if (this.x != null) {
                valueOf = String.valueOf(this.x);
                glk.c("Babel_db", new StringBuilder(String.valueOf(valueOf).length() + 49).append("Multiple cursors delivered while paused, closing ").append(valueOf).toString(), new Object[0]);
                this.x.close();
            }
            valueOf = String.valueOf(cursor);
            glk.c("Babel_db", new StringBuilder(String.valueOf(valueOf).length() + 57).append("Cursor delivered while paused, keeping to deliver later: ").append(valueOf).toString(), new Object[0]);
            this.x = cursor;
            return;
        }
        super.a(cursor);
    }
}

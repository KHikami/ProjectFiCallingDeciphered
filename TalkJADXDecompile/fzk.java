import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

final class fzk implements fzg {
    private Cursor a;
    private Cursor b;
    private fxn c;
    private fxn d;

    public fzk(long j, long j2) {
        this.a = null;
        this.b = null;
        try {
            String[] strArr;
            Context H = gwb.H();
            ContentResolver contentResolver = H.getContentResolver();
            Uri uri = fzb.g;
            if (fyi.f()) {
                strArr = fxr.a;
            } else {
                strArr = fxr.b;
            }
            this.a = gwb.a(contentResolver, uri, strArr, fzb.b(fzb.b, "date", j, j2), null, "date DESC");
            ContentResolver contentResolver2 = H.getContentResolver();
            Uri uri2 = fzb.f;
            String[] strArr2 = fxp.a;
            this.b = gwb.a(contentResolver2, uri2, r8, fzb.b(fzb.c, "date", j / 1000, (999 + j2) / 1000), null, "date DESC");
            this.c = c();
            this.d = d();
        } catch (Throwable e) {
            String valueOf = String.valueOf(e);
            glk.d("Babel_SMS", new StringBuilder(String.valueOf(valueOf).length() + 45).append("SmsSyncManager.queryMms: failed to query mms ").append(valueOf).toString(), e);
            throw e;
        }
    }

    public fxn a() {
        fxn fxn;
        if (this.c == null || this.d == null) {
            if (this.c != null) {
                fxn = this.c;
                this.c = c();
                return fxn;
            }
            fxn = this.d;
            this.d = d();
            return fxn;
        } else if (this.c.c() >= this.d.c()) {
            fxn = this.c;
            this.c = c();
            return fxn;
        } else {
            fxn = this.d;
            this.d = d();
            return fxn;
        }
    }

    private fxn c() {
        if (this.a == null || !this.a.moveToNext()) {
            return null;
        }
        Cursor cursor = this.a;
        fxn fxr = new fxr();
        fxr.a(cursor);
        return fxr;
    }

    private fxn d() {
        if (this.b == null || !this.b.moveToNext()) {
            return null;
        }
        return fxp.a(this.b);
    }

    public void b() {
        if (this.a != null) {
            this.a.close();
            this.a = null;
        }
        if (this.b != null) {
            this.b.close();
            this.b = null;
        }
    }
}

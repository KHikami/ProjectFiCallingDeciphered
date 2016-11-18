package defpackage;

import android.database.Cursor;

final class fzh implements fzg {
    private Cursor a;
    private final blo b;

    public fzh(blo blo, long j, long j2) {
        this.b = blo;
        try {
            bmv e = this.b.e();
            this.a = e.a("messages", fzj.a, fzb.b(fzb.d, "timestamp", 1000 * j, 1000 * j2), null, null, null, "timestamp DESC");
        } catch (Throwable e2) {
            int g = this.b.g().g();
            String valueOf = String.valueOf(e2);
            glk.d("Babel_SMS", new StringBuilder(String.valueOf(valueOf).length() + 60).append("SmsSyncManager A#").append(g).append(": failed to query local sms/mms ").append(valueOf).toString(), e2);
            throw e2;
        }
    }

    public fxn a() {
        if (this.a == null || !this.a.moveToNext()) {
            return null;
        }
        Cursor cursor = this.a;
        if (cursor == null) {
            return null;
        }
        return new fzi(cursor.getLong(0), cursor.getInt(3), fzb.a(fzb.a(cursor.getString(2))), cursor.getLong(1));
    }

    public void b() {
        if (this.a != null) {
            this.a.close();
            this.a = null;
        }
    }
}

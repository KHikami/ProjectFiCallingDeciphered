package p000;

import android.database.Cursor;

final class fzh implements fzg {
    private Cursor f14458a;
    private final blo f14459b;

    public fzh(blo blo, long j, long j2) {
        this.f14459b = blo;
        try {
            bmv e = this.f14459b.m6044e();
            this.f14458a = e.m6200a("messages", fzj.f14464a, fzb.m16678b(fzb.f14421d, "timestamp", 1000 * j, 1000 * j2), null, null, null, "timestamp DESC");
        } catch (Throwable e2) {
            int g = this.f14459b.m6056g().m5638g();
            String valueOf = String.valueOf(e2);
            glk.m17980d("Babel_SMS", new StringBuilder(String.valueOf(valueOf).length() + 60).append("SmsSyncManager A#").append(g).append(": failed to query local sms/mms ").append(valueOf).toString(), e2);
            throw e2;
        }
    }

    public fxn mo2140a() {
        if (this.f14458a == null || !this.f14458a.moveToNext()) {
            return null;
        }
        Cursor cursor = this.f14458a;
        if (cursor == null) {
            return null;
        }
        return new fzi(cursor.getLong(0), cursor.getInt(3), fzb.m16660a(fzb.m16662a(cursor.getString(2))), cursor.getLong(1));
    }

    public void mo2141b() {
        if (this.f14458a != null) {
            this.f14458a.close();
            this.f14458a = null;
        }
    }
}

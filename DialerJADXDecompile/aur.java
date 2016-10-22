import android.database.Cursor;

/* compiled from: PG */
final class aur extends auv {
    private /* synthetic */ String a;
    private /* synthetic */ aux b;
    private /* synthetic */ aup c;

    aur(aup aup, String str, aux aux) {
        this.c = aup;
        this.a = str;
        this.b = aux;
    }

    protected final void a(Cursor cursor) {
        if (cursor == null || cursor.getCount() == 0) {
            aup.a.put(this.a, Integer.valueOf(-1));
            this.b.a(null);
            return;
        }
        cursor.moveToFirst();
        if (buf.w(this.c.b) || cursor.getInt(cursor.getColumnIndex("type")) == 1) {
            Integer valueOf = Integer.valueOf(cursor.getInt(cursor.getColumnIndex("_id")));
            aup.a.put(this.a, valueOf);
            this.b.a(valueOf);
            return;
        }
        aup.a.put(this.a, Integer.valueOf(-1));
        this.b.a(null);
    }
}

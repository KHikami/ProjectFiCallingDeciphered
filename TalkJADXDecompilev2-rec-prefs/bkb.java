package p000;

import android.database.Cursor;
import android.database.CursorWrapper;

public final class bkb extends CursorWrapper {
    private Throwable f3609a;

    public bkb(Cursor cursor) {
        super(cursor);
    }

    public void close() {
        super.close();
        this.f3609a = new Throwable();
    }

    public long getLong(int i) {
        try {
            return super.getLong(i);
        } catch (RuntimeException e) {
            if (this.f3609a != null) {
                glk.m17980d("Babel_db", "Attempting to read from a closed cursor", this.f3609a);
            }
            throw e;
        }
    }

    public int getInt(int i) {
        try {
            return super.getInt(i);
        } catch (RuntimeException e) {
            if (this.f3609a != null) {
                glk.m17980d("Babel_db", "Attempting to read from a closed cursor", this.f3609a);
            }
            throw e;
        }
    }
}

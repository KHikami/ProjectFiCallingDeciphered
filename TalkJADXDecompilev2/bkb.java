package defpackage;

import android.database.Cursor;
import android.database.CursorWrapper;

public final class bkb extends CursorWrapper {
    private Throwable a;

    public bkb(Cursor cursor) {
        super(cursor);
    }

    public void close() {
        super.close();
        this.a = new Throwable();
    }

    public long getLong(int i) {
        try {
            return super.getLong(i);
        } catch (RuntimeException e) {
            if (this.a != null) {
                glk.d("Babel_db", "Attempting to read from a closed cursor", this.a);
            }
            throw e;
        }
    }

    public int getInt(int i) {
        try {
            return super.getInt(i);
        } catch (RuntimeException e) {
            if (this.a != null) {
                glk.d("Babel_db", "Attempting to read from a closed cursor", this.a);
            }
            throw e;
        }
    }
}

package defpackage;

import android.database.AbstractCursor;
import android.database.CursorIndexOutOfBoundsException;

/* compiled from: PG */
/* renamed from: acb */
public final class acb extends AbstractCursor {
    private String[] a;

    public acb(String[] strArr) {
        this.a = strArr;
    }

    public final int getCount() {
        return 0;
    }

    public final String[] getColumnNames() {
        return this.a;
    }

    public final String getString(int i) {
        throw acb.a();
    }

    public final short getShort(int i) {
        throw acb.a();
    }

    public final int getInt(int i) {
        throw acb.a();
    }

    public final long getLong(int i) {
        throw acb.a();
    }

    public final float getFloat(int i) {
        throw acb.a();
    }

    public final double getDouble(int i) {
        throw acb.a();
    }

    public final boolean isNull(int i) {
        throw acb.a();
    }

    private static CursorIndexOutOfBoundsException a() {
        return new CursorIndexOutOfBoundsException("Operation not permitted on an empty cursor.");
    }
}

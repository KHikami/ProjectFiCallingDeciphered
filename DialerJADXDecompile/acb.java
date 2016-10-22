import android.database.AbstractCursor;
import android.database.CursorIndexOutOfBoundsException;

/* compiled from: PG */
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
        throw a();
    }

    public final short getShort(int i) {
        throw a();
    }

    public final int getInt(int i) {
        throw a();
    }

    public final long getLong(int i) {
        throw a();
    }

    public final float getFloat(int i) {
        throw a();
    }

    public final double getDouble(int i) {
        throw a();
    }

    public final boolean isNull(int i) {
        throw a();
    }

    private static CursorIndexOutOfBoundsException a() {
        return new CursorIndexOutOfBoundsException("Operation not permitted on an empty cursor.");
    }
}

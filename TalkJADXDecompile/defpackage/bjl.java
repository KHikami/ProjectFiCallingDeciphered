package defpackage;

import android.database.AbstractCursor;
import java.util.List;

/* renamed from: bjl */
public final class bjl extends AbstractCursor implements fnb {
    private static final String[] a;
    private final List<bjg> b;

    static {
        a = new String[0];
    }

    public bjl(List<bjg> list) {
        this.b = list;
    }

    public int getCount() {
        return this.b.size();
    }

    public String[] getColumnNames() {
        return a;
    }

    public String getString(int i) {
        return null;
    }

    public short getShort(int i) {
        return (short) 0;
    }

    public int getInt(int i) {
        return 0;
    }

    public long getLong(int i) {
        return 0;
    }

    public float getFloat(int i) {
        return 0.0f;
    }

    public double getDouble(int i) {
        return 0.0d;
    }

    public boolean isNull(int i) {
        return false;
    }

    public boolean isClosed() {
        return false;
    }

    public bjg a() {
        return (bjg) this.b.get(getPosition());
    }
}

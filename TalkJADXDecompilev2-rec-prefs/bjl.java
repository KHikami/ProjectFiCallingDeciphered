package p000;

import android.database.AbstractCursor;
import java.util.List;

public final class bjl extends AbstractCursor implements fnb {
    private static final String[] f3532a = new String[0];
    private final List<bjg> f3533b;

    public bjl(List<bjg> list) {
        this.f3533b = list;
    }

    public int getCount() {
        return this.f3533b.size();
    }

    public String[] getColumnNames() {
        return f3532a;
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

    public bjg mo592a() {
        return (bjg) this.f3533b.get(getPosition());
    }
}

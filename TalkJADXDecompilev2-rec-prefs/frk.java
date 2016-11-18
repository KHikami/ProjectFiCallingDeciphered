package p000;

import android.app.ActivityManager;
import android.database.AbstractCursor;
import java.util.ArrayList;
import java.util.HashSet;

public final class frk extends AbstractCursor implements dab {
    private static final String[] f13811c = new String[]{"_id", "aggregated_person"};
    private hwl f13812a;
    private ArrayList<frl> f13813b = new ArrayList();

    public frk(hwl hwl) {
        if (!ActivityManager.isUserAMonkey()) {
            this.f13812a = hwl;
            m16039g();
        }
    }

    private void m16039g() {
        HashSet hashSet = new HashSet();
        this.f13813b.clear();
        if (this.f13812a != null) {
            for (int i = 0; i < this.f13812a.mo2074a(); i++) {
                hwk hwk = (hwk) this.f13812a.mo2075a(i);
                int i2 = 0;
                for (hwr hwr : hwk.mo2080d()) {
                    String valueOf = String.valueOf(hwk.mo2077a());
                    String valueOf2 = String.valueOf(hwr.mo2955b());
                    valueOf2 = new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(valueOf2).length()).append(valueOf).append(":").append(valueOf2).toString();
                    if (!hashSet.contains(valueOf2)) {
                        hashSet.add(valueOf2);
                        this.f13813b.add(new frl(i, i2));
                    }
                    i2++;
                }
            }
        }
    }

    private int m16038a(int i) {
        return ((frl) this.f13813b.get(i)).f13814a;
    }

    public hwk mo627a() {
        if (this.f13812a == null) {
            return null;
        }
        return (hwk) this.f13812a.mo2075a(m16038a(getPosition()));
    }

    public dak mo629b() {
        return null;
    }

    public dac mo630c() {
        hwk a = mo627a();
        if (a != null) {
            int i = ((frl) this.f13813b.get(getPosition())).f13815b;
            int i2 = 0;
            for (hwr hwr : a.mo2080d()) {
                int i3 = i2 + 1;
                if (i2 == i) {
                    return new dac(null, hwr.mo2955b(), 0, 0, null, true);
                }
                i2 = i3;
            }
        }
        return null;
    }

    public int getCount() {
        return this.f13813b.size();
    }

    public String[] getColumnNames() {
        return f13811c;
    }

    public String getString(int i) {
        throw new UnsupportedOperationException();
    }

    public short getShort(int i) {
        throw new UnsupportedOperationException();
    }

    public int getInt(int i) {
        throw new UnsupportedOperationException();
    }

    public long getLong(int i) {
        if (i == 0) {
            return (long) m16038a(getPosition());
        }
        throw new UnsupportedOperationException();
    }

    public float getFloat(int i) {
        throw new UnsupportedOperationException();
    }

    public double getDouble(int i) {
        throw new UnsupportedOperationException();
    }

    public boolean isNull(int i) {
        return false;
    }

    public void mo628a(czo czo) {
        throw new UnsupportedOperationException();
    }

    public int mo631d() {
        return 1;
    }

    public int mo632e() {
        return 0;
    }

    public boolean mo633f() {
        return ((frl) this.f13813b.get(getPosition())).f13815b == 0;
    }
}

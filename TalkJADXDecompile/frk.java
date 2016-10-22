import android.app.ActivityManager;
import android.database.AbstractCursor;
import java.util.ArrayList;
import java.util.HashSet;

public final class frk extends AbstractCursor implements dab {
    private static final String[] c;
    private hwl a;
    private ArrayList<frl> b;

    static {
        c = new String[]{"_id", "aggregated_person"};
    }

    public frk(hwl hwl) {
        this.b = new ArrayList();
        if (!ActivityManager.isUserAMonkey()) {
            this.a = hwl;
            g();
        }
    }

    private void g() {
        HashSet hashSet = new HashSet();
        this.b.clear();
        if (this.a != null) {
            for (int i = 0; i < this.a.a(); i++) {
                hwk hwk = (hwk) this.a.a(i);
                int i2 = 0;
                for (hwr hwr : hwk.d()) {
                    String valueOf = String.valueOf(hwk.a());
                    String valueOf2 = String.valueOf(hwr.b());
                    valueOf2 = new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(valueOf2).length()).append(valueOf).append(":").append(valueOf2).toString();
                    if (!hashSet.contains(valueOf2)) {
                        hashSet.add(valueOf2);
                        this.b.add(new frl(i, i2));
                    }
                    i2++;
                }
            }
        }
    }

    private int a(int i) {
        return ((frl) this.b.get(i)).a;
    }

    public hwk a() {
        if (this.a == null) {
            return null;
        }
        return (hwk) this.a.a(a(getPosition()));
    }

    public dak b() {
        return null;
    }

    public dac c() {
        hwk a = a();
        if (a != null) {
            int i = ((frl) this.b.get(getPosition())).b;
            int i2 = 0;
            for (hwr hwr : a.d()) {
                int i3 = i2 + 1;
                if (i2 == i) {
                    return new dac(null, hwr.b(), 0, 0, null, true);
                }
                i2 = i3;
            }
        }
        return null;
    }

    public int getCount() {
        return this.b.size();
    }

    public String[] getColumnNames() {
        return c;
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
            return (long) a(getPosition());
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

    public void a(czo czo) {
        throw new UnsupportedOperationException();
    }

    public int d() {
        return 1;
    }

    public int e() {
        return 0;
    }

    public boolean f() {
        return ((frl) this.b.get(getPosition())).b == 0;
    }
}

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

public final class bub {
    private final btf[] a;
    private final Collection<String> b;

    private bub(int i) {
        this.a = new btf[i];
        this.b = new ArrayList(i);
    }

    public btf[] a() {
        return this.a;
    }

    Collection<String> b() {
        return this.b;
    }

    public static bub a(Cursor cursor) {
        bub bub = new bub(cursor.getCount());
        int i = 0;
        while (cursor.moveToNext()) {
            boolean z;
            btf btf = new btf();
            btf.a = cursor.getLong(0);
            btf.b = cursor.getString(1);
            btf.c = cursor.getString(2);
            btf.d = cursor.getString(3);
            btf.e = cursor.getString(4);
            btf.f = cursor.getString(5);
            btf.g = cursor.getLong(6);
            btf.h = fwx.values()[cursor.getInt(7)];
            btf.i = fwy.values()[cursor.getInt(8)];
            btf.j = cursor.getLong(18);
            btf.k = cursor.getInt(19) != 0;
            if (cursor.getInt(28) != 0) {
                z = true;
            } else {
                z = false;
            }
            btf.l = z;
            btf.m = cursor.getString(34);
            btf.n = cursor.getString(35);
            btf.o = cursor.getInt(36);
            btf.p = cursor.getInt(37);
            btf.q = cursor.getInt(38);
            btf.r = cursor.getInt(46);
            btf.s.a = cursor.getString(9);
            btf.s.b = cursor.getString(10);
            btf.s.c = cursor.getInt(11);
            btf.s.d = cursor.getInt(12);
            btf.s.e = cursor.getString(13);
            btf.s.f = cursor.getDouble(14);
            btf.s.g = cursor.getDouble(15);
            btf.s.h = cursor.getString(16);
            btf.s.i = cursor.getString(17);
            btf.s.j = cursor.getString(20);
            btf.s.o = cursor.getBlob(41);
            btf.s.k = cursor.getString(30);
            btf.s.n = cursor.getInt(40);
            btf.s.l = cursor.getString(31);
            btf.s.m = cursor.getInt(47);
            int i2 = cursor.getInt(33);
            bta bta = btf.s;
            z = i2 == 0 || i2 == 1;
            bta.p = z;
            btf.s.q = cursor.getLong(32);
            btf.s.r = cursor.getInt(39);
            btf.t.a = cursor.getLong(21);
            btf.t.b = cursor.getInt(22);
            btf.t.c = cursor.getLong(23);
            btf.t.d = cursor.getString(24);
            btf.t.e = cursor.getString(25);
            btf.t.f = cursor.getString(26);
            btf.t.g = cursor.getString(27);
            btf.t.h = cursor.getInt(29);
            btf.t.i = i2;
            btf.v.a = cursor.getInt(42);
            btf.v.b = TimeUnit.NANOSECONDS.toMillis(cursor.getLong(43));
            btf.v.c = cursor.getInt(44);
            btf.v.d = cursor.getLong(45);
            bub.b.add(Long.toString(btf.a));
            int i3 = i + 1;
            bub.a[i] = btf;
            i = i3;
        }
        return bub;
    }
}

package p000;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

public final class bub {
    private final btf[] f4479a;
    private final Collection<String> f4480b;

    private bub(int i) {
        this.f4479a = new btf[i];
        this.f4480b = new ArrayList(i);
    }

    public btf[] m6673a() {
        return this.f4479a;
    }

    Collection<String> m6674b() {
        return this.f4480b;
    }

    public static bub m6672a(Cursor cursor) {
        bub bub = new bub(cursor.getCount());
        int i = 0;
        while (cursor.moveToNext()) {
            boolean z;
            btf btf = new btf();
            btf.f4388a = cursor.getLong(0);
            btf.f4389b = cursor.getString(1);
            btf.f4390c = cursor.getString(2);
            btf.f4391d = cursor.getString(3);
            btf.f4392e = cursor.getString(4);
            btf.f4393f = cursor.getString(5);
            btf.f4394g = cursor.getLong(6);
            btf.f4395h = fwx.values()[cursor.getInt(7)];
            btf.f4396i = fwy.values()[cursor.getInt(8)];
            btf.f4397j = cursor.getLong(18);
            btf.f4398k = cursor.getInt(19) != 0;
            if (cursor.getInt(28) != 0) {
                z = true;
            } else {
                z = false;
            }
            btf.f4399l = z;
            btf.f4400m = cursor.getString(34);
            btf.f4401n = cursor.getString(35);
            btf.f4402o = cursor.getInt(36);
            btf.f4403p = cursor.getInt(37);
            btf.f4404q = cursor.getInt(38);
            btf.f4405r = cursor.getInt(46);
            btf.f4406s.f4358a = cursor.getString(9);
            btf.f4406s.f4359b = cursor.getString(10);
            btf.f4406s.f4360c = cursor.getInt(11);
            btf.f4406s.f4361d = cursor.getInt(12);
            btf.f4406s.f4362e = cursor.getString(13);
            btf.f4406s.f4363f = cursor.getDouble(14);
            btf.f4406s.f4364g = cursor.getDouble(15);
            btf.f4406s.f4365h = cursor.getString(16);
            btf.f4406s.f4366i = cursor.getString(17);
            btf.f4406s.f4367j = cursor.getString(20);
            btf.f4406s.f4372o = cursor.getBlob(41);
            btf.f4406s.f4368k = cursor.getString(30);
            btf.f4406s.f4371n = cursor.getInt(40);
            btf.f4406s.f4369l = cursor.getString(31);
            btf.f4406s.f4370m = cursor.getInt(47);
            int i2 = cursor.getInt(33);
            bta bta = btf.f4406s;
            z = i2 == 0 || i2 == 1;
            bta.f4373p = z;
            btf.f4406s.f4374q = cursor.getLong(32);
            btf.f4406s.f4375r = cursor.getInt(39);
            btf.f4407t.f4417a = cursor.getLong(21);
            btf.f4407t.f4418b = cursor.getInt(22);
            btf.f4407t.f4419c = cursor.getLong(23);
            btf.f4407t.f4420d = cursor.getString(24);
            btf.f4407t.f4421e = cursor.getString(25);
            btf.f4407t.f4422f = cursor.getString(26);
            btf.f4407t.f4423g = cursor.getString(27);
            btf.f4407t.f4424h = cursor.getInt(29);
            btf.f4407t.f4425i = i2;
            btf.f4409v.f4413a = cursor.getInt(42);
            btf.f4409v.f4414b = TimeUnit.NANOSECONDS.toMillis(cursor.getLong(43));
            btf.f4409v.f4415c = cursor.getInt(44);
            btf.f4409v.f4416d = cursor.getLong(45);
            bub.f4480b.add(Long.toString(btf.f4388a));
            int i3 = i + 1;
            bub.f4479a[i] = btf;
            i = i3;
        }
        return bub;
    }
}

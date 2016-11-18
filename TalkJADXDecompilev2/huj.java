package defpackage;

import android.database.Cursor;
import android.text.TextUtils;
import java.util.ArrayList;

final class huj implements hwk {
    final /* synthetic */ hug a;
    private final int b;
    private boolean c;
    private ArrayList<Long> d;
    private ArrayList<hwm> e;
    private ArrayList<hwr> f;
    private hwm g;
    private final boolean h;

    public huj(hug hug, int i) {
        this.a = hug;
        this.b = i;
        this.h = !TextUtils.isEmpty(e());
    }

    private static Iterable<hwm> a(hwm hwm) {
        Iterable arrayList = new ArrayList(1);
        arrayList.add(hwm);
        return arrayList;
    }

    private String a(Cursor cursor, huk huk) {
        int i = this.a.c.getInt(4);
        return i == 0 ? cursor.getString(5) : huk.a(i);
    }

    private String a(String str) {
        if (!f()) {
            return null;
        }
        int a = this.a.d.a(this.b, 0);
        return this.a.b.b(str, a, this.a.b.a(a));
    }

    private int k() {
        return this.a.e.b(this.b);
    }

    private boolean l() {
        this.a.f();
        return k() > 0;
    }

    private void m() {
        if (!this.c) {
            this.c = true;
            int k = k();
            this.d = new ArrayList(k);
            this.e = new ArrayList();
            this.f = null;
            if (f() && this.a.j) {
                this.f = this.a.k.a(a("v_phones"), false);
            }
            if (this.f == null) {
                this.f = new ArrayList();
            }
            this.g = null;
            String e = e();
            for (int i = 0; i < k; i++) {
                if (this.a.c.moveToPosition(this.a.e.a(this.b, i))) {
                    this.d.add(Long.valueOf(this.a.c.getLong(0)));
                    do {
                        String string = this.a.c.getString(2);
                        Object string2;
                        if ("vnd.android.cursor.item/email_v2".equals(string) && this.g == null) {
                            string = a(this.a.c, this.a.h);
                            string2 = this.a.c.getString(3);
                            if (!TextUtils.isEmpty(string2)) {
                                hwm hun = new hun(string, string2);
                                if (!this.e.contains(hun)) {
                                    if (e != null && this.a.g.containsKey(hun.b()) && e.equals(this.a.g.get(hun.b()))) {
                                        this.g = hun;
                                        this.e.clear();
                                    } else {
                                        this.e.add(hun);
                                    }
                                }
                            }
                        } else if ("vnd.android.cursor.item/phone_v2".equals(string)) {
                            string = a(this.a.c, this.a.i);
                            string2 = this.a.c.getString(3);
                            if (!TextUtils.isEmpty(string2)) {
                                huw huw = new huw(string, string2);
                                if (!this.f.contains(huw)) {
                                    this.f.add(huw);
                                }
                            }
                        }
                    } while (hul.b(this.a.c));
                }
            }
        }
    }

    public String a() {
        this.a.f();
        if (f()) {
            return a("name");
        }
        this.a.c.moveToPosition(this.a.e.a(this.b, 0));
        return this.a.c.getString(1);
    }

    public Iterable<Long> b() {
        this.a.f();
        m();
        return this.d;
    }

    public Iterable<hwm> c() {
        this.a.f();
        Object c = hvx.c(g());
        if (!TextUtils.isEmpty(c)) {
            return huj.a(new hun("", c));
        }
        m();
        if (this.h) {
            return this.g != null ? huj.a(this.g) : hwm.a;
        } else {
            if (l()) {
                return this.e;
            }
            if (gwb.ap()) {
                String str = "PeopleAggregator";
                String str2 = "Row should have a contact: ";
                String valueOf = String.valueOf(g());
                gwb.i(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            }
            return hwm.a;
        }
    }

    public Iterable<hwr> d() {
        this.a.f();
        if (hvx.d(g())) {
            return hwr.a;
        }
        m();
        return this.f;
    }

    public String e() {
        this.a.f();
        return (String) this.a.f.get(this.b);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof huj)) {
            return false;
        }
        huj huj = (huj) obj;
        return this.b == huj.b && this.a == huj.a;
    }

    public boolean f() {
        this.a.f();
        return this.a.d.b(this.b) > 0;
    }

    public String g() {
        this.a.f();
        return a("qualified_id");
    }

    public String h() {
        this.a.f();
        return hvl.a.a(a("avatar"));
    }

    public String[] i() {
        this.a.f();
        return hvx.b(a("v_circle_ids"));
    }

    public String j() {
        this.a.f();
        return f() ? this.a.b.f().getString("account") : null;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }
}

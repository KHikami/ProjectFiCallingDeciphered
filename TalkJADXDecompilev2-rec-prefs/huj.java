package p000;

import android.database.Cursor;
import android.text.TextUtils;
import java.util.ArrayList;

final class huj implements hwk {
    final /* synthetic */ hug f17289a;
    private final int f17290b;
    private boolean f17291c;
    private ArrayList<Long> f17292d;
    private ArrayList<hwm> f17293e;
    private ArrayList<hwr> f17294f;
    private hwm f17295g;
    private final boolean f17296h;

    public huj(hug hug, int i) {
        this.f17289a = hug;
        this.f17290b = i;
        this.f17296h = !TextUtils.isEmpty(mo2081e());
    }

    private static Iterable<hwm> m20851a(hwm hwm) {
        Iterable arrayList = new ArrayList(1);
        arrayList.add(hwm);
        return arrayList;
    }

    private String m20852a(Cursor cursor, huk huk) {
        int i = this.f17289a.f17273c.getInt(4);
        return i == 0 ? cursor.getString(5) : huk.m20847a(i);
    }

    private String m20853a(String str) {
        if (!mo2082f()) {
            return null;
        }
        int a = this.f17289a.f17274d.m21053a(this.f17290b, 0);
        return this.f17289a.f17272b.m9678b(str, a, this.f17289a.f17272b.m9673a(a));
    }

    private int m20854k() {
        return this.f17289a.f17275e.m21056b(this.f17290b);
    }

    private boolean m20855l() {
        this.f17289a.m20846f();
        return m20854k() > 0;
    }

    private void m20856m() {
        if (!this.f17291c) {
            this.f17291c = true;
            int k = m20854k();
            this.f17292d = new ArrayList(k);
            this.f17293e = new ArrayList();
            this.f17294f = null;
            if (mo2082f() && this.f17289a.f17280j) {
                this.f17294f = this.f17289a.f17281k.m20839a(m20853a("v_phones"), false);
            }
            if (this.f17294f == null) {
                this.f17294f = new ArrayList();
            }
            this.f17295g = null;
            String e = mo2081e();
            for (int i = 0; i < k; i++) {
                if (this.f17289a.f17273c.moveToPosition(this.f17289a.f17275e.m21053a(this.f17290b, i))) {
                    this.f17292d.add(Long.valueOf(this.f17289a.f17273c.getLong(0)));
                    do {
                        String string = this.f17289a.f17273c.getString(2);
                        Object string2;
                        if ("vnd.android.cursor.item/email_v2".equals(string) && this.f17295g == null) {
                            string = m20852a(this.f17289a.f17273c, this.f17289a.f17278h);
                            string2 = this.f17289a.f17273c.getString(3);
                            if (!TextUtils.isEmpty(string2)) {
                                hwm hun = new hun(string, string2);
                                if (!this.f17293e.contains(hun)) {
                                    if (e != null && this.f17289a.f17277g.containsKey(hun.mo2951b()) && e.equals(this.f17289a.f17277g.get(hun.mo2951b()))) {
                                        this.f17295g = hun;
                                        this.f17293e.clear();
                                    } else {
                                        this.f17293e.add(hun);
                                    }
                                }
                            }
                        } else if ("vnd.android.cursor.item/phone_v2".equals(string)) {
                            string = m20852a(this.f17289a.f17273c, this.f17289a.f17279i);
                            string2 = this.f17289a.f17273c.getString(3);
                            if (!TextUtils.isEmpty(string2)) {
                                huw huw = new huw(string, string2);
                                if (!this.f17294f.contains(huw)) {
                                    this.f17294f.add(huw);
                                }
                            }
                        }
                    } while (hul.m20872b(this.f17289a.f17273c));
                }
            }
        }
    }

    public String mo2077a() {
        this.f17289a.m20846f();
        if (mo2082f()) {
            return m20853a("name");
        }
        this.f17289a.f17273c.moveToPosition(this.f17289a.f17275e.m21053a(this.f17290b, 0));
        return this.f17289a.f17273c.getString(1);
    }

    public Iterable<Long> mo2078b() {
        this.f17289a.m20846f();
        m20856m();
        return this.f17292d;
    }

    public Iterable<hwm> mo2079c() {
        this.f17289a.m20846f();
        Object c = hvx.m21121c(mo2083g());
        if (!TextUtils.isEmpty(c)) {
            return huj.m20851a(new hun("", c));
        }
        m20856m();
        if (this.f17296h) {
            return this.f17295g != null ? huj.m20851a(this.f17295g) : hwm.f17302a;
        } else {
            if (m20855l()) {
                return this.f17293e;
            }
            if (gwb.ap()) {
                String str = "PeopleAggregator";
                String str2 = "Row should have a contact: ";
                String valueOf = String.valueOf(mo2083g());
                gwb.m2253i(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            }
            return hwm.f17302a;
        }
    }

    public Iterable<hwr> mo2080d() {
        this.f17289a.m20846f();
        if (hvx.m21122d(mo2083g())) {
            return hwr.f17345a;
        }
        m20856m();
        return this.f17294f;
    }

    public String mo2081e() {
        this.f17289a.m20846f();
        return (String) this.f17289a.f17276f.get(this.f17290b);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof huj)) {
            return false;
        }
        huj huj = (huj) obj;
        return this.f17290b == huj.f17290b && this.f17289a == huj.f17289a;
    }

    public boolean mo2082f() {
        this.f17289a.m20846f();
        return this.f17289a.f17274d.m21056b(this.f17290b) > 0;
    }

    public String mo2083g() {
        this.f17289a.m20846f();
        return m20853a("qualified_id");
    }

    public String mo2084h() {
        this.f17289a.m20846f();
        return hvl.f17354a.m21068a(m20853a("avatar"));
    }

    public String[] mo2085i() {
        this.f17289a.m20846f();
        return hvx.m21120b(m20853a("v_circle_ids"));
    }

    public String mo2086j() {
        this.f17289a.m20846f();
        return mo2082f() ? this.f17289a.f17272b.m9683f().getString("account") : null;
    }

    public int hashCode() {
        return (this.f17289a.hashCode() * 31) + this.f17290b;
    }
}

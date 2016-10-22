import android.accounts.Account;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
public final class bfs {
    static final Map a;
    private static final List t;
    final bgd b;
    List c;
    List d;
    List e;
    List f;
    List g;
    List h;
    List i;
    List j;
    bfv k;
    bfu l;
    List m;
    final int n;
    final Account o;
    List p;
    private List q;
    private List r;
    private List s;

    static {
        Map hashMap = new HashMap();
        a = hashMap;
        hashMap.put("X-AIM", Integer.valueOf(0));
        a.put("X-MSN", Integer.valueOf(1));
        a.put("X-YAHOO", Integer.valueOf(2));
        a.put("X-ICQ", Integer.valueOf(6));
        a.put("X-JABBER", Integer.valueOf(7));
        a.put("X-SKYPE-USERNAME", Integer.valueOf(3));
        a.put("X-GOOGLE-TALK", Integer.valueOf(5));
        a.put("X-GOOGLE TALK", Integer.valueOf(5));
        t = Collections.unmodifiableList(new ArrayList(0));
    }

    public final void a(bfy bfy) {
        bfy.a();
        bgd bgd = this.b;
        bfy.a(bfz.NAME);
        bfy.a(this.b);
        bfy.c();
        a(this.q, bfy);
        a(this.c, bfy);
        a(this.d, bfy);
        a(this.r, bfy);
        a(this.e, bfy);
        a(this.f, bfy);
        a(this.g, bfy);
        a(this.s, bfy);
        a(this.h, bfy);
        a(this.i, bfy);
        a(this.j, bfy);
        if (this.k != null) {
            bfv bfv = this.k;
            bfy.a(bfz.BIRTHDAY);
            bfy.a(this.k);
            bfy.c();
        }
        if (this.l != null) {
            bfu bfu = this.l;
            bfy.a(bfz.ANNIVERSARY);
            bfy.a(this.l);
            bfy.c();
        }
        bfy.b();
    }

    private static void a(List list, bfy bfy) {
        if (list != null && list.size() > 0) {
            bfy.a(((bfx) list.get(0)).b());
            for (bfx a : list) {
                bfy.a(a);
            }
            bfy.c();
        }
    }

    public final String toString() {
        bfy bgl = new bgl(this);
        a(bgl);
        return bgl.toString();
    }

    public bfs() {
        this(-1073741824);
    }

    private bfs(int i) {
        this(-1073741824, null);
    }

    public bfs(int i, Account account) {
        this.b = new bgd();
        this.n = i;
        this.o = account;
    }

    final void a(int i, String str, String str2, boolean z) {
        String str3;
        Object obj = null;
        if (this.q == null) {
            this.q = new ArrayList();
        }
        StringBuilder stringBuilder = new StringBuilder();
        String trim = str.trim();
        if (i == 6 || bfr.k(this.n)) {
            str3 = trim;
        } else {
            int length = trim.length();
            int i2 = 0;
            while (i2 < length) {
                char charAt = trim.charAt(i2);
                if (charAt == 'p' || charAt == 'P') {
                    stringBuilder.append(',');
                    obj = 1;
                } else if (charAt == 'w' || charAt == 'W') {
                    stringBuilder.append(';');
                    int i3 = 1;
                } else if (('0' <= charAt && charAt <= '9') || (i2 == 0 && charAt == '+')) {
                    stringBuilder.append(charAt);
                }
                i2++;
            }
            if (obj == null) {
                str3 = buf.c(stringBuilder.toString(), bha.a(this.n));
            } else {
                str3 = stringBuilder.toString();
            }
        }
        this.q.add(new bgh(str3, i, str2, z));
    }

    private final void a(String str, String str2, String str3, String str4, int i, boolean z) {
        if (this.r == null) {
            this.r = new ArrayList();
        }
        this.r.add(new bgg(str, str2, str3, str4, i, z));
    }

    final void a(int i, List list, Map map, boolean z) {
        String str;
        Collection collection = (Collection) map.get("SORT-AS");
        if (collection == null || collection.size() == 0) {
            str = null;
        } else {
            if (collection.size() > 1) {
                String str2 = "vCard";
                str = "Incorrect multiple SORT_AS parameters detected: ";
                String valueOf = String.valueOf(Arrays.toString(collection.toArray()));
                Log.w(str2, valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            }
            List<String> a = bha.a((String) collection.iterator().next(), this.n);
            StringBuilder stringBuilder = new StringBuilder();
            for (String append : a) {
                String append2;
                stringBuilder.append(append2);
            }
            str = stringBuilder.toString();
        }
        if (list == null) {
            list = t;
        }
        int size = list.size();
        switch (size) {
            case rl.c /*0*/:
                str2 = null;
                valueOf = "";
                break;
            case rq.b /*1*/:
                str2 = null;
                valueOf = (String) list.get(0);
                break;
            default:
                append2 = (String) list.get(0);
                StringBuilder stringBuilder2 = new StringBuilder();
                for (int i2 = 1; i2 < size; i2++) {
                    if (i2 > 1) {
                        stringBuilder2.append(' ');
                    }
                    stringBuilder2.append((String) list.get(i2));
                }
                str2 = stringBuilder2.toString();
                valueOf = append2;
                break;
        }
        if (this.r == null) {
            a(valueOf, str2, null, str, 1, z);
            return;
        }
        for (bgg bgg : this.r) {
            if (bgg.a == null && bgg.b == null) {
                bgg.a = valueOf;
                bgg.b = str2;
                bgg.d = z;
                return;
            }
        }
        a(valueOf, str2, null, str, 1, z);
    }

    final void a(String str) {
        if (this.r == null) {
            a(null, null, str, null, 1, false);
            return;
        }
        for (bgg bgg : this.r) {
            if (bgg.c == null) {
                bgg.c = str;
                return;
            }
        }
        a(null, null, str, null, 1, false);
    }

    final void a(List list) {
        if (TextUtils.isEmpty(this.b.g) && TextUtils.isEmpty(this.b.i) && TextUtils.isEmpty(this.b.h) && list != null) {
            int size = list.size();
            if (size > 0) {
                int i;
                if (size > 3) {
                    i = 3;
                } else {
                    i = size;
                }
                if (((String) list.get(0)).length() > 0) {
                    for (int i2 = 1; i2 < i; i2++) {
                        if (((String) list.get(i2)).length() > 0) {
                            size = 0;
                            break;
                        }
                    }
                    size = 1;
                    if (size != 0) {
                        String[] split = ((String) list.get(0)).split(" ");
                        i = split.length;
                        if (i == 3) {
                            this.b.g = split[0];
                            this.b.i = split[1];
                            this.b.h = split[2];
                            return;
                        } else if (i == 2) {
                            this.b.g = split[0];
                            this.b.h = split[1];
                            return;
                        } else {
                            this.b.h = (String) list.get(0);
                            return;
                        }
                    }
                }
                switch (i) {
                    case rq.c /*2*/:
                        break;
                    case rl.e /*3*/:
                        this.b.i = (String) list.get(2);
                        break;
                }
                this.b.h = (String) list.get(1);
                this.b.g = (String) list.get(0);
            }
        }
    }

    final void a(String str, Collection collection) {
        if (!TextUtils.isEmpty(str)) {
            boolean z;
            int i;
            if (str.startsWith("sip:")) {
                str = str.substring(4);
                if (str.length() == 0) {
                    return;
                }
            }
            int i2 = -1;
            String str2 = null;
            if (collection != null) {
                z = false;
                for (String str3 : collection) {
                    String str32;
                    String toUpperCase = str32.toUpperCase();
                    if (toUpperCase.equals("PREF")) {
                        z = true;
                    } else if (toUpperCase.equals("HOME")) {
                        i2 = 1;
                    } else if (toUpperCase.equals("WORK")) {
                        i2 = 2;
                    } else {
                        int i3;
                        if (i2 < 0) {
                            if (toUpperCase.startsWith("X-")) {
                                str32 = str32.substring(2);
                            }
                            i3 = 0;
                        } else {
                            str32 = str2;
                            i3 = i2;
                        }
                        i2 = i3;
                        str2 = str32;
                    }
                }
                i = i2;
            } else {
                z = false;
                i = -1;
            }
            if (i < 0) {
                i = 3;
            }
            if (this.s == null) {
                this.s = new ArrayList();
            }
            this.s.add(new bgk(str, i, str2, z));
        }
    }

    final String a() {
        int i = 1;
        String str = null;
        if (TextUtils.isEmpty(this.b.f)) {
            int i2;
            bgd bgd = this.b;
            if (TextUtils.isEmpty(bgd.a) && TextUtils.isEmpty(bgd.b) && TextUtils.isEmpty(bgd.c) && TextUtils.isEmpty(bgd.d) && TextUtils.isEmpty(bgd.e)) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            if (i2 == 0) {
                str = bha.a(this.n, this.b.a, this.b.c, this.b.b, this.b.d, this.b.e);
            } else {
                bgd = this.b;
                if (!(TextUtils.isEmpty(bgd.g) && TextUtils.isEmpty(bgd.h) && TextUtils.isEmpty(bgd.i))) {
                    i = 0;
                }
                if (i == 0) {
                    str = bha.a(this.n, this.b.g, this.b.i, this.b.h);
                } else if (this.c != null && this.c.size() > 0) {
                    str = ((bfw) this.c.get(0)).a;
                } else if (this.q != null && this.q.size() > 0) {
                    str = ((bgh) this.q.get(0)).a;
                } else if (this.d != null && this.d.size() > 0) {
                    str = ((bgj) this.d.get(0)).a(this.n);
                } else if (this.r != null && this.r.size() > 0) {
                    bgg bgg = (bgg) this.r.get(0);
                    StringBuilder stringBuilder = new StringBuilder();
                    if (!TextUtils.isEmpty(bgg.a)) {
                        stringBuilder.append(bgg.a);
                    }
                    if (!TextUtils.isEmpty(bgg.b)) {
                        if (stringBuilder.length() > 0) {
                            stringBuilder.append(", ");
                        }
                        stringBuilder.append(bgg.b);
                    }
                    if (!TextUtils.isEmpty(bgg.c)) {
                        if (stringBuilder.length() > 0) {
                            stringBuilder.append(", ");
                        }
                        stringBuilder.append(bgg.c);
                    }
                    str = stringBuilder.toString();
                }
            }
        } else {
            str = this.b.f;
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    public final boolean b() {
        bfy bgc = new bgc(this);
        a(bgc);
        return bgc.a;
    }

    public final String c() {
        if (this.b.k == null) {
            this.b.k = a();
        }
        return this.b.k;
    }
}

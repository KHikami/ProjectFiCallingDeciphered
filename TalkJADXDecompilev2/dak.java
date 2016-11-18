package defpackage;

import android.content.Context;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import android.util.Patterns;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class dak implements Serializable {
    private static boolean a = false;
    private String b;
    private String c;
    private String d;
    private final List<Long> e;
    private List<dam> f;

    static {
        kae kae = glk.f;
    }

    public dak() {
        this.e = new ArrayList();
        this.f = new ArrayList();
    }

    public dak(dap dap) {
        this(null, null, null, Arrays.asList(new dap[]{dap}), null, null);
    }

    public dak(String str, String str2, String str3, Iterable<dap> iterable, Iterable<dan> iterable2, Iterable<Long> iterable3) {
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.b = str;
        this.c = str2;
        if (!TextUtils.isEmpty(this.c)) {
            c(this.c);
        }
        this.d = str3;
        if (iterable3 != null) {
            for (Long add : iterable3) {
                this.e.add(add);
            }
        }
        if (iterable2 != null) {
            for (dan add2 : iterable2) {
                this.f.add(add2);
            }
        }
        if (iterable != null) {
            for (dap add3 : iterable) {
                this.f.add(add3);
            }
        }
    }

    public static dak a(Context context, hwk hwk, String str) {
        List arrayList = new ArrayList();
        arrayList.add(hwk);
        return dak.a(context, arrayList, str);
    }

    private static dak a(Context context, List<hwk> list, String str) {
        if (list.size() == 0) {
            return null;
        }
        String str2;
        hwk hwk = (hwk) list.get(0);
        String a = hwk.a();
        String e = hwk.e();
        String h = hwk.h();
        Iterable arrayList = new ArrayList();
        Iterable arrayList2 = new ArrayList();
        Iterable arrayList3 = new ArrayList();
        if (str == null) {
            str2 = null;
        } else {
            str2 = glq.e(context, str);
        }
        HashSet hashSet = new HashSet();
        String str3 = a;
        Object obj = null;
        for (hwk hwk2 : list) {
            String valueOf;
            if (a) {
                valueOf = String.valueOf(hwk2.a());
                String valueOf2 = String.valueOf(hwk2.e());
                new StringBuilder(((String.valueOf(valueOf).length() + 37) + String.valueOf(valueOf2).length()) + String.valueOf(str).length()).append("Aggregated contact:").append(valueOf).append(" Gaia:").append(valueOf2).append(" Only phone:").append(str);
            }
            if (hwk2.f()) {
                valueOf = hwk2.a();
                CharSequence h2 = hwk2.h();
                if (!TextUtils.isEmpty(h2)) {
                    h = h2;
                }
            } else {
                valueOf = str3;
            }
            for (Long l : hwk2.b()) {
                if (TextUtils.isEmpty(h)) {
                    h = frm.a(l);
                }
                arrayList.add(l);
            }
            for (hwm hwm : hwk2.c()) {
                String str4;
                if (a) {
                    str4 = "Email:";
                    String valueOf3 = String.valueOf(hwm.b());
                    if (valueOf3.length() != 0) {
                        str4.concat(valueOf3);
                    } else {
                        String str5 = new String(str4);
                    }
                }
                arrayList3.add(new dan(hwm.b(), hwm.a()));
            }
            Object obj2 = obj;
            for (hwr hwr : hwk2.d()) {
                String str6;
                a = hwr.b();
                str4 = glq.e(context, a);
                if (!hashSet.contains(str4)) {
                    hashSet.add(str4);
                    if (str2 == null || str2.equals(str4)) {
                        arrayList2.add(new dap(a, hwr.a()));
                        obj2 = 1;
                    }
                } else if (a) {
                    str6 = "Skip duplicate phone:";
                    a = String.valueOf(a);
                    if (a.length() != 0) {
                        str6.concat(a);
                    } else {
                        a = new String(str6);
                    }
                }
            }
            obj = obj2;
            str3 = valueOf;
        }
        if (str2 != null && obj == null) {
            str2 = "Babel";
            a = "Only phone number to include not found:";
            str6 = String.valueOf(str);
            glk.e(str2, str6.length() != 0 ? a.concat(str6) : new String(a), new Object[0]);
        }
        return new dak(str3, e, h, arrayList2, arrayList3, arrayList);
    }

    public static dak a(Context context, Iterable<bjg> iterable) {
        return dak.a(context, (Iterable) iterable, null);
    }

    private static dak a(Context context, Iterable<bjg> iterable, String str) {
        if (iterable == null) {
            return null;
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        String str2;
        String str3;
        String str4;
        bjg bjg = (bjg) it.next();
        String e = bjg.e();
        String i = bjg.i();
        CharSequence f = bjg.f();
        Iterable arrayList = new ArrayList();
        Iterable arrayList2 = new ArrayList();
        Iterable arrayList3 = new ArrayList();
        if (str == null) {
            str2 = null;
        } else {
            str2 = glq.e(context, str);
        }
        HashSet hashSet = new HashSet();
        String str5 = e;
        Object obj = null;
        while (it.hasNext()) {
            String valueOf;
            bjg = (bjg) it.next();
            if (a) {
                valueOf = String.valueOf(bjg.e());
                String valueOf2 = String.valueOf(bjg.i());
                new StringBuilder(((String.valueOf(valueOf).length() + 35) + String.valueOf(valueOf2).length()) + String.valueOf(str).length()).append("hangouts contact:").append(valueOf).append(" Gaia:").append(valueOf2).append(" Only phone:").append(str);
            }
            if (bjg.y()) {
                valueOf = bjg.e();
                CharSequence f2 = bjg.f();
                if (!TextUtils.isEmpty(f2)) {
                    str3 = f2;
                }
            } else {
                valueOf = str5;
            }
            if (!TextUtils.isEmpty(bjg.p())) {
                Long valueOf3 = Long.valueOf(Long.parseLong(bjg.p()));
                if (TextUtils.isEmpty(f)) {
                    str3 = frm.a(valueOf3);
                }
                arrayList.add(valueOf3);
            }
            for (bje bje : bjg.d()) {
                String str6;
                if (a) {
                    str6 = "Email:";
                    String valueOf4 = String.valueOf(bje.c());
                    if (valueOf4.length() != 0) {
                        str6.concat(valueOf4);
                    } else {
                        String str7 = new String(str6);
                    }
                }
                arrayList3.add(new dan(bje.c(), bje.b()));
            }
            Object obj2 = obj;
            for (bjo bjo : bjg.b()) {
                e = bjo.d();
                str6 = bjo.e();
                if (!hashSet.contains(str6)) {
                    hashSet.add(str6);
                    if (str2 == null || str2.equals(str6)) {
                        arrayList2.add(new dap(e, bjo.b()));
                        obj2 = 1;
                    }
                } else if (a) {
                    str4 = "Skip duplicate phone:";
                    e = String.valueOf(e);
                    if (e.length() != 0) {
                        str4.concat(e);
                    } else {
                        e = new String(str4);
                    }
                }
            }
            obj = obj2;
            str5 = valueOf;
        }
        if (str2 != null && obj == null) {
            str2 = "Babel";
            e = "Only phone number to include not found:";
            str4 = String.valueOf(str);
            glk.e(str2, str4.length() != 0 ? e.concat(str4) : new String(e), new Object[0]);
        }
        return new dak(str5, i, str3, arrayList2, arrayList3, arrayList);
    }

    public static boolean a(hwk hwk) {
        return !gwb.e(hwk.d());
    }

    public long a() {
        if (this.e.isEmpty()) {
            return -1;
        }
        return gwb.a((Long) this.e.get(0));
    }

    public static String b(hwk hwk) {
        Iterator it = hwk.c().iterator();
        if (it.hasNext()) {
            return ((hwm) it.next()).b();
        }
        it = hwk.d().iterator();
        if (it.hasNext()) {
            return ((hwr) it.next()).b();
        }
        return null;
    }

    public String b() {
        return this.c;
    }

    public String c() {
        return this.b;
    }

    public String d() {
        return this.d;
    }

    private void c(String str) {
        this.f.add(new dao(str));
    }

    public dap e() {
        for (dam dam : this.f) {
            if (dam instanceof dap) {
                return (dap) dam;
            }
        }
        return null;
    }

    public List<dap> f() {
        List<dap> arrayList = new ArrayList();
        for (dam dam : this.f) {
            if (dam instanceof dap) {
                arrayList.add((dap) dam);
            }
        }
        return arrayList;
    }

    public List<dan> g() {
        List<dan> arrayList = new ArrayList();
        for (dam dam : this.f) {
            if (dam instanceof dan) {
                arrayList.add((dan) dam);
            }
        }
        return arrayList;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Number of details ").append(this.f.size()).append("\n");
        for (dam append : this.f) {
            stringBuilder.append(append).append("\n");
        }
        return stringBuilder.toString();
    }

    public static boolean a(String str) {
        return !TextUtils.isEmpty(str) && Patterns.EMAIL_ADDRESS.matcher(str).matches();
    }

    public static boolean b(String str) {
        if (TextUtils.isEmpty(str) || !PhoneNumberUtils.isWellFormedSmsAddress(str) || ajf.a().a(str)) {
            return true;
        }
        Object extractNetworkPortion = PhoneNumberUtils.extractNetworkPortion(str);
        if (TextUtils.isEmpty(extractNetworkPortion) || extractNetworkPortion.length() < 3) {
            return true;
        }
        return false;
    }

    public static dak a(Context context, bjg bjg) {
        return dak.a(context, Collections.singletonList(bjg), null);
    }
}

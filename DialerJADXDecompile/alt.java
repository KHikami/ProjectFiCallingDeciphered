import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Trace;
import android.preference.PreferenceManager;
import android.provider.ContactsContract.CommonDataKinds.Phone;
import android.support.v7.widget.CardView;
import android.telephony.PhoneNumberUtils;
import android.util.ArrayMap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.QuickContactBadge;
import android.widget.TextView;
import com.android.dialer.app.calllog.CallTypeIconsView;
import java.util.Map;

/* compiled from: PG */
public class alt extends ank implements amt, asx {
    private Map A;
    private final OnClickListener B;
    private final OnClickListener C;
    private AccessibilityDelegate D;
    public final Context c;
    public final asp d;
    public final aob e;
    final aup f;
    public final int g;
    final amu h;
    public aoe i;
    public boolean j;
    int k;
    long l;
    int m;
    public boolean n;
    SharedPreferences o;
    aic p;
    boolean q;
    private aog r;
    private final awt s;
    private final alz t;
    private final ams u;
    private final avm v;
    private final OnClickListener w;
    private Uri x;
    private boolean y;
    private amy z;

    public alt(Context context, alz alz, awt awt, asp asp, int i) {
        aob aod;
        super(context);
        this.r = new aog(this);
        this.v = avn.a();
        this.j = false;
        this.k = -1;
        this.l = -1;
        this.w = new alu(this);
        this.m = -1;
        this.x = null;
        this.y = false;
        this.A = new ArrayMap();
        this.n = true;
        this.B = new alv(this);
        this.C = new alw(this);
        this.D = new alx(this);
        this.c = context;
        this.t = alz;
        this.s = awt;
        this.d = asp;
        if (this.d != null) {
            this.d.p = this;
        }
        this.g = i;
        this.i = new aoe(this.s, this.r);
        if (!buf.i(context)) {
            this.i.e = true;
        }
        Resources resources = this.c.getResources();
        ane ane = new ane(resources);
        Context context2 = this.c;
        if (abw.a("android.telecom.PhoneAccountHandle")) {
            aod = new aod(context2);
        } else {
            aod = new aoc(context2);
        }
        this.e = aod;
        this.h = new amu(new anw(this.c, resources, this.e), resources, this.e);
        this.u = new ams(this);
        this.f = new aup(this.c);
        this.o = PreferenceManager.getDefaultSharedPreferences(context);
        this.p = new aic(this.c);
        boolean z = this.o.getBoolean("show_voicemail_promo_card", true);
        if (this.g == 2 || this.d == null || !z) {
            z = false;
        } else {
            z = true;
        }
        this.j = z;
        this.z = new alj(this.c, ((Activity) this.c).getFragmentManager(), this, this.f);
        if (this.a.a()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.b = true;
    }

    protected final void b() {
        this.t.a();
    }

    public final void c() {
        if (buf.c(this.c, "android.permission.READ_CONTACTS")) {
            aoe aoe = this.i;
            if (aoe.c == null) {
                aoe.f.sendEmptyMessageDelayed(2, 1000);
            }
        }
        this.p.a("android.contacts.DISPLAY_ORDER");
        this.q = buf.J(this.c).a();
    }

    protected final void a(Cursor cursor) {
        ams ams = this.u;
        int count = cursor.getCount();
        if (count != 0) {
            String string;
            String string2;
            ams.a.g();
            long currentTimeMillis = System.currentTimeMillis();
            cursor.moveToFirst();
            long j = cursor.getLong(2);
            long j2 = cursor.getLong(0);
            int a = ams.a(j, currentTimeMillis);
            ams.a.a(j2, a);
            String string3 = cursor.getString(1);
            if (buf.c()) {
                string = cursor.getString(awr.b);
            } else {
                string = "";
            }
            if (buf.c()) {
                string2 = cursor.getString(awr.c);
            } else {
                string2 = "";
            }
            int i = cursor.getInt(4);
            String string4 = cursor.getString(18);
            String str = string2;
            string2 = cursor.getString(19);
            int i2 = i;
            String str2 = string;
            int i3 = 1;
            while (cursor.moveToNext()) {
                String string5;
                String string6;
                boolean a2;
                String string7 = cursor.getString(1);
                if (buf.c()) {
                    string5 = cursor.getString(awr.b);
                } else {
                    string5 = "";
                }
                if (buf.c()) {
                    string6 = cursor.getString(awr.c);
                } else {
                    string6 = "";
                }
                int i4 = cursor.getInt(4);
                String string8 = cursor.getString(18);
                String string9 = cursor.getString(19);
                if (awy.a(string3) || awy.a(string7)) {
                    a2 = ams.a(string3, string7);
                } else {
                    a2 = PhoneNumberUtils.compare(string3, string7);
                }
                boolean equals = str2.equals(string5);
                boolean equals2 = str.equals(string6);
                boolean a3 = ams.a(string4, string8, string2, string9);
                if (a2 && a3 && equals && equals2 && ams.a(i4, r5) && (ams.b(i4, r5) || ams.c(i4, r5))) {
                    i3++;
                } else {
                    a = ams.a(cursor.getLong(2), currentTimeMillis);
                    ams.a.a(cursor.getPosition() - i3, i3);
                    i3 = 1;
                    string2 = string9;
                    string4 = string8;
                    i2 = i4;
                    str = string6;
                    str2 = string5;
                    string3 = string7;
                }
                ams.a.a(cursor.getLong(0), a);
            }
            ams.a.a(count - i3, i3);
        }
    }

    public final void b(Cursor cursor) {
        ams ams = this.u;
        if (cursor.getCount() != 0) {
            ams.a.g();
            long currentTimeMillis = System.currentTimeMillis();
            cursor.moveToPosition(-1);
            while (cursor.moveToNext()) {
                ams.a.a(cursor.getPosition(), 1);
                ams.a.a(cursor.getLong(0), ams.a(cursor.getLong(2), currentTimeMillis));
            }
        }
    }

    public zk a(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return any.a(LayoutInflater.from(this.c).inflate(buf.hQ, viewGroup, false));
        }
        boolean z;
        View inflate = LayoutInflater.from(this.c).inflate(buf.hD, viewGroup, false);
        Context context = this.c;
        amy amy = this.z;
        OnClickListener onClickListener = this.w;
        aob aob = this.e;
        amu amu = this.h;
        asp asp = this.d;
        if (this.g == 2) {
            z = true;
        } else {
            z = false;
        }
        Context context2 = context;
        amy amy2 = amy;
        OnClickListener onClickListener2 = onClickListener;
        aob aob2 = aob;
        amu amu2 = amu;
        anx anx = new anx((TextView) inflate.findViewById(aq.aM), inflate.findViewById(aq.B), (CallTypeIconsView) inflate.findViewById(aq.D), (TextView) inflate.findViewById(aq.w), (TextView) inflate.findViewById(aq.bK), (TextView) inflate.findViewById(aq.n));
        zk amv = new amv(context2, amy2, onClickListener2, aob2, amu2, asp, inflate, (QuickContactBadge) inflate.findViewById(aq.aZ), inflate.findViewById(aq.aY), r1, (CardView) inflate.findViewById(aq.A), (TextView) inflate.findViewById(aq.x), (ImageView) inflate.findViewById(aq.aX), z);
        amv.r.setTag(amv);
        amv.r.setAccessibilityDelegate(this.D);
        amv.o.setTag(amv);
        return amv;
    }

    public void a(zk zkVar, int i) {
        Trace.beginSection("onBindViewHolder: " + i);
        switch (a(i)) {
            case rq.b /*1*/:
                any any = (any) zkVar;
                any.o.setOnClickListener(this.C);
                any.n.setOnClickListener(this.B);
                break;
            default:
                Cursor cursor = (Cursor) d(i);
                if (cursor != null) {
                    CharSequence charSequence;
                    String str;
                    int i2;
                    AsyncTask aly;
                    amv amv = (amv) zkVar;
                    int e = e(i);
                    avl.a();
                    Object string = cursor.getString(1);
                    if (!buf.c() || this.g == 2) {
                        charSequence = "";
                    } else {
                        charSequence = cursor.getString(awr.b);
                    }
                    if (!buf.c() || this.g == 2) {
                        str = "";
                    } else {
                        str = cursor.getString(awr.c);
                    }
                    int i3 = cursor.getInt(17);
                    aws a = awt.a(cursor);
                    ala ala = new ala(string, i3, charSequence);
                    ala.c = str;
                    ala.e = cursor.getString(5);
                    ala.h = cursor.getLong(2);
                    ala.i = cursor.getLong(3);
                    ala.t = b(cursor, e);
                    ala.f = cursor.getString(7);
                    ala.v = cursor.getString(22);
                    ala.g = a(cursor, e);
                    ala.D = cursor.getString(18);
                    ala.E = cursor.getString(19);
                    ala.F = a;
                    if (!cursor.isNull(21)) {
                        ala.u = Long.valueOf(cursor.getLong(21));
                    }
                    amv.B = cursor.getLong(0);
                    amv.C = c(cursor, e);
                    int position = cursor.getPosition();
                    if (cursor.moveToPrevious()) {
                        if (this.j) {
                            i2 = position;
                        } else {
                            i2 = position - 1;
                        }
                        if (i2 != this.m || (i2 == this.m && cursor.moveToPrevious())) {
                            i2 = a(cursor.getLong(0));
                            cursor.moveToPosition(position);
                            ala.H = i2;
                            amv.D = string;
                            amv.I = ala.e;
                            amv.E = ala.b;
                            amv.G = i3;
                            amv.H = (String) Phone.getTypeLabel(this.c.getResources(), ala.m, ala.n);
                            if (this.g != 2) {
                                amv.J = 4;
                                ala.G = cursor.getInt(cursor.getColumnIndex("_id"));
                            } else {
                                if (ala.g[0] == 4 || ala.g[0] == 3) {
                                    ala.y = cursor.getInt(16) != 1;
                                }
                                amv.J = cursor.getInt(4);
                                amv.L = cursor.getString(6);
                            }
                            amv.Q = false;
                            amv.K = null;
                            amv.P = false;
                            aly = new aly(this, amv, ala, i);
                            amv.U = aly;
                            this.v.a(aly, new Void[0]);
                            break;
                        }
                    }
                    i2 = -1;
                    cursor.moveToPosition(position);
                    ala.H = i2;
                    amv.D = string;
                    amv.I = ala.e;
                    amv.E = ala.b;
                    amv.G = i3;
                    amv.H = (String) Phone.getTypeLabel(this.c.getResources(), ala.m, ala.n);
                    if (this.g != 2) {
                        if (cursor.getInt(16) != 1) {
                        }
                        ala.y = cursor.getInt(16) != 1;
                        amv.J = cursor.getInt(4);
                        amv.L = cursor.getString(6);
                    } else {
                        amv.J = 4;
                        ala.G = cursor.getInt(cursor.getColumnIndex("_id"));
                    }
                    amv.Q = false;
                    amv.K = null;
                    amv.P = false;
                    aly = new aly(this, amv, ala, i);
                    amv.U = aly;
                    this.v.a(aly, new Void[0]);
                }
                break;
        }
        Trace.endSection();
    }

    public int a() {
        int i = 1;
        int a = (this.j ? 1 : 0) + super.a();
        if (this.m == -1) {
            i = 0;
        }
        return a - i;
    }

    public int a(int i) {
        if (i == 0 && this.j) {
            return 1;
        }
        return 2;
    }

    public Object d(int i) {
        int i2 = 1;
        int i3 = i - (this.j ? 1 : 0);
        if (this.m == -1 || i < this.m) {
            i2 = 0;
        }
        return super.d(i3 + i2);
    }

    public final long b(int i) {
        Cursor cursor = (Cursor) d(i);
        if (cursor != null) {
            return cursor.getLong(0);
        }
        return 0;
    }

    public int e(int i) {
        return super.e(i - (this.j ? 1 : 0));
    }

    public final void a(Uri uri) {
        if (this.x == null) {
            this.m = this.k;
            this.a.b();
        } else {
            ame.a(this.c, this.x, null);
            this.y = true;
        }
        this.l = -1;
        this.k = -1;
        this.x = uri;
    }

    public final void e() {
        this.m = -1;
        this.x = null;
        this.y = false;
        this.a.b();
    }

    public final void f() {
        if (this.y) {
            this.m = this.k;
            this.y = false;
            return;
        }
        this.m = -1;
        this.x = null;
    }

    final int a(long j) {
        Integer num = (Integer) this.A.get(Long.valueOf(j));
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    private final int[] a(Cursor cursor, int i) {
        int i2 = 0;
        if (this.g == 2) {
            return new int[]{4};
        }
        int position = cursor.getPosition();
        int[] iArr = new int[i];
        while (i2 < i) {
            iArr[i2] = cursor.getInt(4);
            cursor.moveToNext();
            i2++;
        }
        cursor.moveToPosition(position);
        return iArr;
    }

    private static int b(Cursor cursor, int i) {
        int i2 = 0;
        int position = cursor.getPosition();
        int i3 = 0;
        while (i2 < i) {
            i3 |= cursor.getInt(20);
            cursor.moveToNext();
            i2++;
        }
        cursor.moveToPosition(position);
        return i3;
    }

    public final void a(long j, int i) {
        if (!this.A.containsKey(Long.valueOf(j))) {
            this.A.put(Long.valueOf(j), Integer.valueOf(i));
        }
    }

    public final void g() {
        this.A.clear();
    }

    private static long[] c(Cursor cursor, int i) {
        int position = cursor.getPosition();
        long[] jArr = new long[i];
        for (int i2 = 0; i2 < i; i2++) {
            jArr[i2] = cursor.getLong(0);
            cursor.moveToNext();
        }
        cursor.moveToPosition(position);
        return jArr;
    }

    public final void d() {
        this.i.b();
        this.e.a();
        if (this.x != null) {
            ame.a(this.c, this.x, null);
        }
    }

    public final void a(zk zkVar) {
        if (zkVar.e == 2) {
            amv amv = (amv) zkVar;
            if (amv.U != null) {
                amv.U.cancel(true);
            }
        }
    }

    public final void b(zk zkVar) {
        if (zkVar.e == 2) {
            ((amv) zkVar).T = true;
        }
    }

    public final void c(zk zkVar) {
        if (zkVar.e == 2) {
            ((amv) zkVar).T = false;
        }
    }
}

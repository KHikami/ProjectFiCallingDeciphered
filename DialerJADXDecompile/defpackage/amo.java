package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.app.KeyguardManager;
import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Handler;
import android.provider.CallLog;
import android.provider.ContactsContract.Contacts;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.dialer.app.calllog.CallLogNotificationsService;
import com.android.dialer.app.widget.EmptyContentView;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: amo */
public class amo extends Fragment implements alz, ath, avs, cc {
    final Handler a;
    RecyclerView b;
    public alt c;
    boolean d;
    private final ContentObserver e;
    private final ContentObserver f;
    private xr g;
    private avq h;
    private EmptyContentView i;
    private KeyguardManager j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private int p;
    private int q;
    private long r;
    private boolean s;
    private final Handler t;

    public amo() {
        this(-1, -1);
    }

    public amo(int i) {
        this(i, -1);
    }

    public amo(int i, boolean z) {
        this(i, -1);
        this.s = true;
    }

    private amo(int i, int i2) {
        this(i, -1, 0);
    }

    private amo(int i, int i2, long j) {
        this.a = new Handler();
        this.e = new amq(this);
        this.f = new amq(this);
        this.d = true;
        this.n = false;
        this.o = true;
        this.p = -1;
        this.q = -1;
        this.r = 0;
        this.s = false;
        this.t = new amp(this);
        this.p = i;
        this.q = i2;
        this.r = 0;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.p = bundle.getInt("filter_type", this.p);
            this.q = bundle.getInt("log_limit", this.q);
            this.r = bundle.getLong("date_limit", this.r);
            this.s = bundle.getBoolean("is_call_log_activity", this.s);
        }
        Context activity = getActivity();
        ContentResolver contentResolver = activity.getContentResolver();
        this.h = new avq(activity, contentResolver, this, this.q);
        this.j = (KeyguardManager) activity.getSystemService("keyguard");
        contentResolver.registerContentObserver(CallLog.CONTENT_URI, true, this.e);
        contentResolver.registerContentObserver(Contacts.CONTENT_URI, true, this.f);
        setHasOptionsMenu(true);
    }

    public final boolean a(Cursor cursor) {
        int i = 0;
        if (getActivity() == null || getActivity().isFinishing()) {
            return false;
        }
        int i2;
        alt alt = this.c;
        alt.k = -1;
        alt.m = -1;
        this.c.n = false;
        this.c.d(cursor);
        getActivity().invalidateOptionsMenu();
        boolean z = cursor != null && cursor.getCount() > 0;
        RecyclerView recyclerView = this.b;
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        recyclerView.setVisibility(i2);
        EmptyContentView emptyContentView = this.i;
        if (z) {
            i = 8;
        }
        emptyContentView.setVisibility(i);
        this.l = true;
        e();
        return true;
    }

    public final void b(Cursor cursor) {
        Activity activity = getActivity();
        if (activity != null && !activity.isFinishing()) {
            this.m = true;
            e();
        }
    }

    private final void e() {
        if (this.l && this.m && this.k) {
            this.k = false;
            getLoaderManager().destroyLoader(0);
        }
    }

    public final void c(Cursor cursor) {
    }

    public final void d(Cursor cursor) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(buf.hC, viewGroup, false);
        a(inflate, null);
        return inflate;
    }

    protected final void a(View view, asp asp) {
        int i = 1;
        this.b = (RecyclerView) view.findViewById(aq.ba);
        this.b.n = true;
        this.g = new xr(getActivity());
        this.b.a(this.g);
        this.i = (EmptyContentView) view.findViewById(aq.aq);
        this.i.b(cob.ak);
        this.i.d = this;
        if (!this.s) {
            i = 3;
        }
        String g = buf.g(getActivity());
        this.c = buf.m(getActivity()).a(getActivity(), this, new awt(getActivity(), g), asp, i);
        this.b.a(this.c);
        a();
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        a(this.p);
        alt alt = this.c;
        if (bundle != null) {
            alt.k = bundle.getInt("expanded_position", -1);
            alt.l = bundle.getLong("expanded_row_id", -1);
        }
    }

    public void onStart() {
        getLoaderManager().initLoader(0, null, new arn(getActivity()));
        this.k = true;
        super.onStart();
    }

    public void onResume() {
        super.onResume();
        boolean c = buf.c(getActivity(), "android.permission.READ_CALL_LOG");
        if (!this.n && c) {
            this.d = true;
            a(this.p);
        }
        this.n = c;
        alt alt = this.c;
        aup.a.clear();
        b();
        this.c.c();
        d();
    }

    public void onStop() {
        f();
        super.onStop();
    }

    public void onDestroy() {
        this.c.d(null);
        getActivity().getContentResolver().unregisterContentObserver(this.e);
        getActivity().getContentResolver().unregisterContentObserver(this.f);
        super.onDestroy();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("filter_type", this.p);
        bundle.putInt("log_limit", this.q);
        bundle.putLong("date_limit", this.r);
        bundle.putBoolean("is_call_log_activity", this.s);
        alt alt = this.c;
        bundle.putInt("expanded_position", alt.k);
        bundle.putLong("expanded_row_id", alt.l);
    }

    public void a() {
        avq avq = this.h;
        int i = this.p;
        long j = this.r;
        avq.cancelOperation(54);
        if (buf.h(avq.b)) {
            String stringBuilder;
            StringBuilder stringBuilder2 = new StringBuilder();
            List arrayList = new ArrayList();
            stringBuilder2.append("(").append("type").append(" != ?)");
            arrayList.add(Integer.toString(6));
            if (buf.i() >= 23) {
                stringBuilder2.append(" AND (").append("deleted").append(" = 0)");
            }
            if (i >= 0) {
                stringBuilder2.append(" AND (").append("type").append(" = ?)");
                arrayList.add(Integer.toString(i));
            } else {
                stringBuilder2.append(" AND NOT ");
                stringBuilder2.append("(type = 4)");
            }
            if (j > 0) {
                stringBuilder2.append(" AND (").append("date").append(" > ?)");
                arrayList.add(Long.toString(j));
            }
            i = avq.a == -1 ? 1000 : avq.a;
            if (stringBuilder2.length() > 0) {
                stringBuilder = stringBuilder2.toString();
            } else {
                stringBuilder = null;
            }
            avq.startQuery(54, null, axk.e(avq.b).buildUpon().appendQueryParameter("limit", Integer.toString(i)).build(), awr.a, stringBuilder, (String[]) arrayList.toArray(new String[arrayList.size()]), "date DESC");
        } else {
            avq.a(null);
        }
        if (!this.s) {
            ((aqg) getParentFragment()).a();
        }
    }

    private final void a(int i) {
        Context activity = getActivity();
        if (activity != null) {
            if (buf.c(activity, "android.permission.READ_CALL_LOG")) {
                int i2;
                switch (i) {
                    case oe.HOST_ID /*-1*/:
                        i2 = cob.bl;
                        break;
                    case rl.e /*3*/:
                        i2 = cob.bs;
                        break;
                    case rl.f /*4*/:
                        i2 = cob.bx;
                        break;
                    default:
                        throw new IllegalArgumentException("Unexpected filter type in CallLogFragment: " + i);
                }
                this.i.a(i2);
                if (this.s) {
                    this.i.c(0);
                    return;
                } else if (i == -1) {
                    this.i.c(cob.bm);
                    return;
                } else {
                    return;
                }
            }
            this.i.a(cob.cz);
            this.i.c(cob.cE);
        }
    }

    public void setMenuVisibility(boolean z) {
        super.setMenuVisibility(z);
        if (this.o != z) {
            this.o = z;
            if (!z) {
                f();
            } else if (isResumed()) {
                b();
            }
        }
    }

    final void b() {
        if (this.d) {
            aoe aoe = this.c.i;
            aoe.b.a.incrementAndGet();
            aoe.b();
            this.c.n = true;
            a();
            this.h.a();
            this.h.c();
            f();
            this.d = false;
            return;
        }
        this.c.a.b();
    }

    private final void f() {
        if (this.j != null && !this.j.inKeyguardRestrictedInputMode() && this.p == 4) {
            CallLogNotificationsService.a(getActivity(), null);
        }
    }

    public final void e_() {
        Context activity = getActivity();
        if (activity != null) {
            if (!buf.c(activity, "android.permission.READ_CALL_LOG")) {
                bv.a(this, new String[]{"android.permission.READ_CALL_LOG"}, 1);
            } else if (!this.s) {
                ((amr) activity).t();
            }
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 1 && iArr.length > 0 && iArr[0] == 0) {
            this.d = true;
        }
    }

    final void d() {
        if (!this.t.hasMessages(1)) {
            this.t.sendEmptyMessageDelayed(1, 60000 - (System.currentTimeMillis() % 60000));
        }
    }

    public void onPause() {
        this.t.removeMessages(1);
        this.c.d();
        super.onPause();
    }
}

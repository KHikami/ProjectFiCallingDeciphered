import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.android.contacts.common.list.PinnedHeaderListView;

/* compiled from: PG */
public class aqt extends aqv implements ath, cc {
    public String n;

    public aqt() {
        f(true);
        this.j = 5;
    }

    protected final void b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        super.b(layoutInflater, viewGroup);
        ((PinnedHeaderListView) this.i).b = true;
    }

    protected adh a() {
        adh aqu = new aqu(getActivity());
        aqu.f = true;
        aqu.z = this.l;
        aqu.A = this;
        return aqu;
    }

    protected final void b(int i) {
        awp a = buf.I(getContext()).a();
        if (a != null) {
            aqu aqu = (aqu) this.h;
            Context context = getContext();
            aws aws = new aws();
            awq a2 = a.a(aws);
            Cursor cursor = (Cursor) aqu.getItem(i);
            if (cursor != null) {
                aef aef = (aef) aqu.b(aqu.f(i));
                long j = aef.f;
                boolean c = aqu.c(j);
                aws.d = cursor.getString(7);
                aws.f = cursor.getInt(1);
                aws.g = cursor.getString(2);
                aws.h = cursor.getString(3);
                String string = cursor.getString(8);
                aws.l = string == null ? null : Uri.parse(string);
                long j2 = (c || !buf.c(j)) ? 0 : 1;
                aws.o = j2;
                a2.a(cursor.getString(5));
                string = aef.o;
                if (c) {
                    a2.b(string, j);
                } else {
                    a2.a(string, j);
                }
            }
            a.a(context, a2);
        }
    }

    public void f() {
        ath ath = null;
        int i = 0;
        if (this.o != null && getActivity() != null) {
            int i2;
            int i3;
            if (buf.c(getActivity(), "android.permission.READ_CONTACTS")) {
                this.n = null;
                i2 = 0;
                i3 = 0;
            } else {
                i2 = cob.al;
                i = cob.cE;
                int i4 = cob.cB;
                this.n = "android.permission.READ_CONTACTS";
                i3 = i2;
                i2 = i;
                i = i4;
                ath = this;
            }
            this.o.b(i3);
            this.o.c(i2);
            this.o.a(i);
            if (ath != null) {
                this.o.d = ath;
            }
        }
    }

    public void e_() {
        if (getActivity() != null && "android.permission.READ_CONTACTS".equals(this.n)) {
            bv.a(this, new String[]{this.n}, 1);
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 1) {
            f();
            if (iArr != null && iArr.length == 1 && iArr[0] == 0) {
                buf.d(getActivity(), this.n);
            }
        }
    }

    protected final int g(boolean z) {
        if (z) {
            return 4;
        }
        return 6;
    }
}

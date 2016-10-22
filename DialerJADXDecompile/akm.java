import android.provider.ContactsContract.CommonDataKinds.Phone;
import android.text.TextDirectionHeuristics;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.android.dialer.app.CallDetailActivity;

/* compiled from: PG */
public final class akm implements amm {
    final /* synthetic */ CallDetailActivity a;

    public akm(CallDetailActivity callDetailActivity) {
        this.a = callDetailActivity;
    }

    public final void a() {
        this.a.finish();
    }

    public final void b() {
        this.a.finish();
    }

    public final void a(ala[] alaArr) {
        if (alaArr == null) {
            Toast.makeText(this.a.i, cob.df, 0).show();
            this.a.finish();
            return;
        }
        this.a.q = alaArr[0];
        this.a.h = TextUtils.isEmpty(this.a.q.a) ? null : this.a.q.a.toString();
        if (this.a.h == null) {
            b(alaArr);
        } else {
            this.a.g.a(new akn(this, alaArr), new Void[0]);
        }
    }

    final void b(ala[] alaArr) {
        CharSequence string;
        CharSequence charSequence;
        String str;
        int i;
        int i2 = 8;
        this.a.r = TextUtils.isEmpty(this.a.q.b) ? "" : this.a.q.b;
        ala ala = this.a.q;
        if (ala.z) {
            string = this.a.p.getString(cob.cY);
        } else if (ala.A) {
            string = this.a.p.getString(cob.bf);
        } else if (TextUtils.isEmpty(ala.j)) {
            string = ala.f;
        } else {
            string = Phone.getTypeLabel(this.a.p, ala.m, ala.n);
        }
        if (TextUtils.isEmpty(this.a.q.b)) {
            charSequence = this.a.q.w;
        } else {
            String valueOf = String.valueOf(this.a.q.a);
            str = this.a.q.b;
            charSequence = new StringBuilder((String.valueOf(valueOf).length() + 0) + String.valueOf(str).length()).append(valueOf).append(str).toString();
        }
        charSequence = this.a.n.unicodeWrap(charSequence.toString(), TextDirectionHeuristics.LTR);
        this.a.q.l = this.a.k.b();
        if (TextUtils.isEmpty(this.a.q.a())) {
            this.a.u.setText(charSequence);
            if (TextUtils.isEmpty(string)) {
                this.a.v.setVisibility(8);
            } else {
                this.a.v.setText(string);
                this.a.v.setVisibility(0);
            }
        } else {
            this.a.u.setText(this.a.q.a());
            TextView textView = this.a.v;
            String valueOf2 = String.valueOf(string);
            textView.setText(new StringBuilder((String.valueOf(valueOf2).length() + 1) + String.valueOf(charSequence).length()).append(valueOf2).append(" ").append(charSequence).toString());
        }
        string = buf.a(this.a.i, this.a.q.s);
        charSequence = ala.a(this.a.p, this.a.q.c, string);
        if (!TextUtils.isEmpty(this.a.q.c)) {
            if (TextUtils.isEmpty(string)) {
                string = this.a.p.getString(cob.bv, new Object[]{this.a.q.c});
            } else {
                string = this.a.p.getString(cob.bw, new Object[]{string, this.a.q.c});
            }
        }
        if (TextUtils.isEmpty(string)) {
            this.a.w.setVisibility(8);
        } else {
            this.a.w.setText(string);
            this.a.w.setContentDescription(charSequence);
            this.a.w.setVisibility(0);
        }
        boolean a = awy.a(this.a.h, this.a.q.d);
        View view = this.a.x;
        if (a) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
        view = this.a.A;
        if (a) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
        boolean a2 = awy.a(this.a.h);
        boolean a3 = awy.a(this.a.i, this.a.q.s, this.a.h);
        if (!a || a2 || a3) {
            a2 = false;
        } else {
            a2 = true;
        }
        View view2 = this.a.y;
        if (a2) {
            i = 0;
        } else {
            i = 8;
        }
        view2.setVisibility(i);
        awt awt = this.a.j;
        int i3 = this.a.q.q;
        str = this.a.q.r;
        if (awt.c == null || !awt.c.a(i3, str)) {
            a2 = false;
        } else {
            a2 = true;
        }
        view2 = this.a.z;
        if (a2) {
            i2 = 0;
        }
        view2.setVisibility(i2);
        this.a.invalidateOptionsMenu();
        this.a.s.setAdapter(new alr(this.a.i, this.a.o, this.a.l, alaArr));
        CallDetailActivity callDetailActivity = this.a;
        a = this.a.q.z;
        if (callDetailActivity.q != null) {
            callDetailActivity.t.assignContactUri(callDetailActivity.q.o);
            if (TextUtils.isEmpty(callDetailActivity.q.j)) {
                valueOf2 = callDetailActivity.q.w;
            } else {
                valueOf2 = callDetailActivity.q.j.toString();
            }
            callDetailActivity.t.setContentDescription(callDetailActivity.p.getString(cob.bG, new Object[]{valueOf2}));
            boolean a4 = awy.a(callDetailActivity.i, callDetailActivity.q.s, callDetailActivity.h);
            if (a) {
                callDetailActivity.t.setImageDrawable(callDetailActivity.i.getDrawable(cob.aj));
            } else {
                a = callDetailActivity.j.a(callDetailActivity.q.q);
                if (a4) {
                    i3 = 3;
                } else if (a) {
                    i3 = 2;
                } else {
                    i3 = 1;
                }
                callDetailActivity.m.a(callDetailActivity.t, callDetailActivity.q.p, false, true, new abc(valueOf2, callDetailActivity.q.o == null ? null : buf.e(callDetailActivity.q.o), i3, true));
            }
        }
        this.a.findViewById(aq.r).setVisibility(0);
    }
}

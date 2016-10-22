package defpackage;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: ayc */
public class ayc extends ayn implements ayk {
    private final List a;
    private ArrayAdapter b;
    public Dialog c;
    public AlertDialog d;

    public ayc() {
        this.a = new ArrayList();
        this.c = null;
        this.d = null;
    }

    public final /* synthetic */ bdq g() {
        return this;
    }

    public final void a() {
        Builder builder = new Builder(getActivity());
        this.b = new ArrayAdapter(builder.getContext(), 17367043, 16908308, this.a);
        View listView = new ListView(getActivity());
        listView.setAdapter(this.b);
        listView.setOnItemClickListener(new ayi(this));
        builder.setCancelable(true).setView(listView).setOnCancelListener(new ayd(this));
        this.c = builder.create();
        this.c.getWindow().addFlags(524288);
        this.c.show();
    }

    public final void b() {
        if (this.c != null) {
            this.c.dismiss();
            this.c = null;
        }
    }

    public final void c() {
        if (this.d != null) {
            this.d.dismiss();
            this.d = null;
        }
    }

    public final boolean d() {
        return (this.c == null && this.d == null) ? false : true;
    }

    public final void a(List list) {
        this.a.clear();
        this.a.addAll(list);
        this.a.add(getResources().getString(aq.do));
        if (this.b != null) {
            this.b.notifyDataSetChanged();
        }
    }

    public Context getContext() {
        return getActivity();
    }

    public final void a(int i, Context context) {
        String valueOf = String.valueOf(context);
        bdf.a((Object) this, new StringBuilder(String.valueOf(valueOf).length() + 40).append("onAnswer videoState=").append(i).append(" context=").append(valueOf).toString());
        Object obj = (ayj) this.e;
        if (obj.a == null) {
            return;
        }
        if (obj.b.i == 3) {
            String str = obj.a;
            bdf.a(obj, new StringBuilder(String.valueOf(str).length() + 54).append("onAnswer (upgradeCall) mCallId=").append(str).append(" videoState=").append(i).toString());
            bcj.b().a(i, context);
            return;
        }
        str = obj.a;
        bdf.a(obj, new StringBuilder(String.valueOf(str).length() + 53).append("onAnswer (answerCall) mCallId=").append(str).append(" videoState=").append(i).toString());
        bdp.a().a(obj.b.d, i);
    }

    public void a(boolean z) {
    }

    public void a(int i) {
    }

    public void a(int i, int i2) {
    }

    protected void f() {
    }

    public final void a(Context context) {
        Object obj = (ayj) this.e;
        String str = "onDecline ";
        String valueOf = String.valueOf(obj.a);
        bdf.a(obj, valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        if (obj.b.i == 3) {
            bcj.b().c(context);
        } else {
            bdp.a().a(obj.b.d, false, null);
        }
    }

    public final void e() {
        ayj ayj = (ayj) this.e;
        if (ayj.i != null) {
            axk.a(((ayk) ayj.i).getContext());
            ((ayk) ayj.i).a();
        }
    }

    public final /* synthetic */ bdj h() {
        return bcj.b().s;
    }
}

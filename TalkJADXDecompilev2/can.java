package defpackage;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

final class can extends cbc implements OnClickListener, cam, jza {
    private static final lo<Integer, Integer> a;
    private List<Integer> b;
    private List<String> c;
    private jca d;
    private byq e;
    private fit f;
    private iih g;

    static {
        lo loVar = new lo();
        a = loVar;
        loVar.put(Integer.valueOf(10), Integer.valueOf(3293));
        a.put(Integer.valueOf(25), Integer.valueOf(3328));
        a.put(Integer.valueOf(30), Integer.valueOf(3292));
        a.put(Integer.valueOf(100), Integer.valueOf(3387));
    }

    protected can(Context context, kbu kbu) {
        super(context, kbu);
        this.g = (iih) jyn.a(context, iih.class);
    }

    private List<Integer> a() {
        if (this.b == null) {
            i();
        }
        return this.b;
    }

    private List<String> h() {
        if (this.c == null) {
            i();
        }
        return this.c;
    }

    private void i() {
        this.b = new ArrayList();
        this.c = new ArrayList();
        a(100, gwb.kU);
        a(30, gwb.kR);
        if (this.e.d() == 2 && gwb.j(this.e.e())) {
            a(25, gwb.kS);
        }
        a(10, gwb.kT);
    }

    private void a(int i, int i2) {
        this.b.add(Integer.valueOf(i));
        this.c.add(this.h.getString(i2));
    }

    public void a(Context context, jyn jyn, Bundle bundle) {
        this.d = (jca) jyn.a(jca.class);
        this.e = (byq) jyn.a(byq.class);
        this.f = (fit) jyn.a(fit.class);
        i();
    }

    public String b() {
        return this.h.getString(gwb.kQ);
    }

    public String c() {
        return (String) h().get(j());
    }

    public void g() {
        new Builder(this.h).setTitle(this.h.getString(gwb.kQ)).setSingleChoiceItems((CharSequence[]) h().toArray(new String[0]), j(), this).setNegativeButton(this.h.getString(bc.O), this).setPositiveButton(this.h.getString(bc.hR), this).create().show();
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (i == -1) {
            this.e.c(gwb.a((Integer) a().get(((AlertDialog) dialogInterface).getListView().getCheckedItemPosition())));
            bko e = fde.e(this.d.a());
            for (String a : this.e.b()) {
                this.f.a(e, a, this.e.f());
            }
            Integer num = (Integer) a.get(Integer.valueOf(this.e.f()));
            if (num != null) {
                this.g.a(this.d.a()).b().c(gwb.a(num));
            }
            this.e.u();
        }
    }

    private int j() {
        int indexOf = a().indexOf(Integer.valueOf(this.e.f()));
        return indexOf == -1 ? 0 : indexOf;
    }
}

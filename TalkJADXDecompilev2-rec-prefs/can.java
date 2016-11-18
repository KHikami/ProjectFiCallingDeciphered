package p000;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

final class can extends cbc implements OnClickListener, cam, jza {
    private static final lo<Integer, Integer> f4918a;
    private List<Integer> f4919b;
    private List<String> f4920c;
    private jca f4921d;
    private byq f4922e;
    private fit f4923f;
    private iih f4924g;

    static {
        lo loVar = new lo();
        f4918a = loVar;
        loVar.put(Integer.valueOf(10), Integer.valueOf(3293));
        f4918a.put(Integer.valueOf(25), Integer.valueOf(3328));
        f4918a.put(Integer.valueOf(30), Integer.valueOf(3292));
        f4918a.put(Integer.valueOf(100), Integer.valueOf(3387));
    }

    protected can(Context context, kbu kbu) {
        super(context, kbu);
        this.f4924g = (iih) jyn.m25426a(context, iih.class);
    }

    private List<Integer> m7089a() {
        if (this.f4919b == null) {
            m7092i();
        }
        return this.f4919b;
    }

    private List<String> m7091h() {
        if (this.f4920c == null) {
            m7092i();
        }
        return this.f4920c;
    }

    private void m7092i() {
        this.f4919b = new ArrayList();
        this.f4920c = new ArrayList();
        m7090a(100, gwb.kU);
        m7090a(30, gwb.kR);
        if (this.f4922e.m6938d() == 2 && gwb.m2267j(this.f4922e.m6942e())) {
            m7090a(25, gwb.kS);
        }
        m7090a(10, gwb.kT);
    }

    private void m7090a(int i, int i2) {
        this.f4919b.add(Integer.valueOf(i));
        this.f4920c.add(this.h.getString(i2));
    }

    public void mo479a(Context context, jyn jyn, Bundle bundle) {
        this.f4921d = (jca) jyn.m25443a(jca.class);
        this.f4922e = (byq) jyn.m25443a(byq.class);
        this.f4923f = (fit) jyn.m25443a(fit.class);
        m7092i();
    }

    public String mo783b() {
        return this.h.getString(gwb.kQ);
    }

    public String mo778c() {
        return (String) m7091h().get(m7093j());
    }

    public void mo782g() {
        new Builder(this.h).setTitle(this.h.getString(gwb.kQ)).setSingleChoiceItems((CharSequence[]) m7091h().toArray(new String[0]), m7093j(), this).setNegativeButton(this.h.getString(bc.f2931O), this).setPositiveButton(this.h.getString(bc.hR), this).create().show();
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (i == -1) {
            this.f4922e.m6935c(gwb.m1507a((Integer) m7089a().get(((AlertDialog) dialogInterface).getListView().getCheckedItemPosition())));
            bko e = fde.m15018e(this.f4921d.mo2317a());
            for (String a : this.f4922e.m6933b()) {
                this.f4923f.mo2003a(e, a, this.f4922e.m6944f());
            }
            Integer num = (Integer) f4918a.get(Integer.valueOf(this.f4922e.m6944f()));
            if (num != null) {
                this.f4924g.mo1979a(this.f4921d.mo2317a()).mo1693b().mo1714c(gwb.m1507a(num));
            }
            this.f4922e.m6961u();
        }
    }

    private int m7093j() {
        int indexOf = m7089a().indexOf(Integer.valueOf(this.f4922e.m6944f()));
        return indexOf == -1 ? 0 : indexOf;
    }
}

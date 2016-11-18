package p000;

import android.content.Context;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import java.util.ArrayList;

public final class ejv extends agp implements agn {
    private ArrayList<String> f11671B = new ArrayList();
    private final Runnable f11672C = new ejw(this);

    public ejv(agy agy) {
        super(agy);
    }

    public ahf mo1891a(Context context, ed edVar, Cursor cursor, float f) {
        return new eju(context, edVar, null, f, false);
    }

    public void mo1892a(Bundle bundle) {
        super.mo1892a(bundle);
        mo175a((agn) this);
    }

    public void mo194a(Cursor cursor) {
        this.f11671B.clear();
        if (cursor.getCount() > 0) {
            long a = glj.m17956a();
            long a2 = (long) ((biw) jyn.m25426a(gwb.m1400H(), biw.class)).mo560a("babel_young_image_threshold_millis", 300000);
            cursor.moveToLast();
            while (a - (cursor.getLong(7) / 1000) < a2) {
                this.f11671B.add(cursor.getString(0));
                if (!cursor.moveToPrevious()) {
                    return;
                }
            }
        }
    }

    public ig mo172a(int i, String str) {
        return new ejt(m1148c().mo161i(), str, i, fde.m15018e(m1148c().getIntent().getIntExtra("account_id", -1)));
    }

    public void mo1893n() {
        Cursor p = m1165p();
        if (p != null) {
            String string = p.getString(1);
            String string2 = p.getString(5);
            long j = p.getLong(7) / 1000;
            Object string3 = p.getString(6);
            String string4 = p.getString(2);
            if (TextUtils.isEmpty(string)) {
                this.o = string2;
                this.p = glj.m17965b(j).toString();
            } else {
                if (!string4.startsWith(fyi.f14370c.toString())) {
                    string = Html.fromHtml(string).toString();
                }
                this.o = string;
                string = String.valueOf(glj.m17965b(j));
                this.p = new StringBuilder((String.valueOf(string2).length() + 3) + String.valueOf(string).length()).append(string2).append(" - ").append(string).toString();
            }
            if (!TextUtils.isEmpty(string3)) {
                Bundle bundle = new Bundle();
                bundle.putString("image_uri", string3);
                m1148c().m1096f().mo1998b(1, bundle, this.z);
            }
        } else {
            this.o = null;
            this.p = null;
        }
        m1133a(m1148c().mo162j());
    }

    public void mo176a(ahg ahg, boolean z) {
        if (this.j.getVisibility() != 8 && ahg.m1269t() == this.i.m3192c()) {
            if (!z) {
                glk.m17981d("Babel", "Failed to load fragment image", new Object[0]);
            }
            Drawable q = ahg.m1266q();
            if (q instanceof gol) {
                ((gol) q).m18221a(this.f11672C);
            } else {
                this.f11672C.run();
            }
        }
    }
}

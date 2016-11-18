package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import java.util.ArrayList;

public final class ejv extends agp implements agn {
    private ArrayList<String> B = new ArrayList();
    private final Runnable C = new ejw(this);

    public ejv(agy agy) {
        super(agy);
    }

    public ahf a(Context context, ed edVar, Cursor cursor, float f) {
        return new eju(context, edVar, null, f, false);
    }

    public void a(Bundle bundle) {
        super.a(bundle);
        a((agn) this);
    }

    public void a(Cursor cursor) {
        this.B.clear();
        if (cursor.getCount() > 0) {
            long a = glj.a();
            long a2 = (long) ((biw) jyn.a(gwb.H(), biw.class)).a("babel_young_image_threshold_millis", 300000);
            cursor.moveToLast();
            while (a - (cursor.getLong(7) / 1000) < a2) {
                this.B.add(cursor.getString(0));
                if (!cursor.moveToPrevious()) {
                    return;
                }
            }
        }
    }

    public ig a(int i, String str) {
        return new ejt(c().i(), str, i, fde.e(c().getIntent().getIntExtra("account_id", -1)));
    }

    public void n() {
        Cursor p = p();
        if (p != null) {
            String string = p.getString(1);
            String string2 = p.getString(5);
            long j = p.getLong(7) / 1000;
            Object string3 = p.getString(6);
            String string4 = p.getString(2);
            if (TextUtils.isEmpty(string)) {
                this.o = string2;
                this.p = glj.b(j).toString();
            } else {
                if (!string4.startsWith(fyi.c.toString())) {
                    string = Html.fromHtml(string).toString();
                }
                this.o = string;
                string = String.valueOf(glj.b(j));
                this.p = new StringBuilder((String.valueOf(string2).length() + 3) + String.valueOf(string).length()).append(string2).append(" - ").append(string).toString();
            }
            if (!TextUtils.isEmpty(string3)) {
                Bundle bundle = new Bundle();
                bundle.putString("image_uri", string3);
                c().f().b(1, bundle, this.z);
            }
        } else {
            this.o = null;
            this.p = null;
        }
        a(c().j());
    }

    public void a(ahg ahg, boolean z) {
        if (this.j.getVisibility() != 8 && ahg.t() == this.i.c()) {
            if (!z) {
                glk.d("Babel", "Failed to load fragment image", new Object[0]);
            }
            Drawable q = ahg.q();
            if (q instanceof gol) {
                ((gol) q).a(this.C);
            } else {
                this.C.run();
            }
        }
    }
}

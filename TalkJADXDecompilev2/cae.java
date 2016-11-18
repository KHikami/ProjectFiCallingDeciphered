package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;

class cae implements OnClickListener, kcq {
    public final Context b;
    public final byn c;

    public cae(Context context, kbu kbu, byn byn) {
        this.b = context;
        this.c = byn;
        kbu.a((kcq) this);
    }

    public byn a() {
        return this.c;
    }

    public View a(View view, ViewGroup viewGroup) {
        if (this.c.e()) {
            caf caf;
            if (view == null || !(view.getTag() instanceof caf)) {
                caf = new caf(this, this.b, viewGroup);
            } else {
                caf = (caf) view.getTag();
            }
            a(caf);
            return caf.a;
        } else if (view == null || view.getId() != gwb.kK) {
            return LayoutInflater.from(this.b).inflate(ba.iV, viewGroup, false);
        } else {
            return view;
        }
    }

    protected void a(caf caf) {
        float f;
        caf.d.setText(this.c.b());
        if (TextUtils.isEmpty(this.c.c())) {
            caf.e.setText("");
            caf.e.setVisibility(8);
            caf.a.setMinimumHeight(a(gwb.kI));
        } else {
            caf.e.setText(this.c.c());
            caf.e.setVisibility(0);
            caf.a.setMinimumHeight(a(gwb.kJ));
        }
        caf.f.setVisibility(8);
        caf.b.setVisibility(8);
        if (this.c.f() != 0) {
            caf.c.setImageDrawable(ia.a(this.b, this.c.f()));
            caf.c.setColorFilter(ia.c(this.b, gwb.eb));
            caf.c.setVisibility(0);
            caf.c.setFocusable(false);
        } else {
            caf.c.setVisibility(8);
        }
        caf.a.setEnabled(this.c.d());
        View view = caf.a;
        if (this.c.d()) {
            f = 1.0f;
        } else {
            f = 0.4f;
        }
        view.setAlpha(f);
        caf.a.setOnClickListener(this);
    }

    private int a(int i) {
        return this.b.getResources().getDimensionPixelOffset(i);
    }

    public void onClick(View view) {
        this.c.g();
    }
}

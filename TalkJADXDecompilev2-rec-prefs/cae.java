package p000;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;

class cae implements OnClickListener, kcq {
    public final Context f4895b;
    public final byn f4896c;

    public cae(Context context, kbu kbu, byn byn) {
        this.f4895b = context;
        this.f4896c = byn;
        kbu.m25514a((kcq) this);
    }

    public byn m7072a() {
        return this.f4896c;
    }

    public View m7071a(View view, ViewGroup viewGroup) {
        if (this.f4896c.mo780e()) {
            caf caf;
            if (view == null || !(view.getTag() instanceof caf)) {
                caf = new caf(this, this.f4895b, viewGroup);
            } else {
                caf = (caf) view.getTag();
            }
            mo797a(caf);
            return caf.f4906a;
        } else if (view == null || view.getId() != gwb.kK) {
            return LayoutInflater.from(this.f4895b).inflate(ba.iV, viewGroup, false);
        } else {
            return view;
        }
    }

    protected void mo797a(caf caf) {
        float f;
        caf.f4909d.setText(this.f4896c.mo783b());
        if (TextUtils.isEmpty(this.f4896c.mo778c())) {
            caf.f4910e.setText("");
            caf.f4910e.setVisibility(8);
            caf.f4906a.setMinimumHeight(m7070a(gwb.kI));
        } else {
            caf.f4910e.setText(this.f4896c.mo778c());
            caf.f4910e.setVisibility(0);
            caf.f4906a.setMinimumHeight(m7070a(gwb.kJ));
        }
        caf.f4911f.setVisibility(8);
        caf.f4907b.setVisibility(8);
        if (this.f4896c.mo781f() != 0) {
            caf.f4908c.setImageDrawable(ia.m10675a(this.f4895b, this.f4896c.mo781f()));
            caf.f4908c.setColorFilter(ia.m10680c(this.f4895b, gwb.eb));
            caf.f4908c.setVisibility(0);
            caf.f4908c.setFocusable(false);
        } else {
            caf.f4908c.setVisibility(8);
        }
        caf.f4906a.setEnabled(this.f4896c.mo779d());
        View view = caf.f4906a;
        if (this.f4896c.mo779d()) {
            f = 1.0f;
        } else {
            f = 0.4f;
        }
        view.setAlpha(f);
        caf.f4906a.setOnClickListener(this);
    }

    private int m7070a(int i) {
        return this.f4895b.getResources().getDimensionPixelOffset(i);
    }

    public void onClick(View view) {
        this.f4896c.mo782g();
    }
}

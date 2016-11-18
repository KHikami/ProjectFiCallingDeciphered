package p000;

import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.google.android.apps.hangouts.R$drawable;

public class dek extends jzc {
    private int f6046n = R$drawable.bK;
    public Toolbar f6047q;

    public dek() {
        this.E.m25444a(kbc.class, this.F);
    }

    public Toolbar m8319l() {
        return this.f6047q;
    }

    public void setContentView(int i) {
        super.setContentView(i);
        mo1085j();
    }

    public void setContentView(View view) {
        super.setContentView(view);
        mo1085j();
    }

    public void setContentView(View view, LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        mo1085j();
    }

    public void addContentView(View view, LayoutParams layoutParams) {
        super.addContentView(view, layoutParams);
        mo1085j();
    }

    public void m8318a(int i, int i2) {
        super.setContentView(i);
        this.f6046n = i2;
        mo1085j();
    }

    private void mo1085j() {
        this.f6047q = (Toolbar) findViewById(ba.cm);
        iil.m21875b("Toolbar needs to be in the layout with id hangouts_toolbar", this.f6047q);
        this.f6047q.m3443e(R$drawable.aM);
        m8302a(this.f6047q);
        m8308g().b(this.f6046n);
    }
}

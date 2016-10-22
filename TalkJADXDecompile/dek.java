import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.google.android.apps.hangouts.R$drawable;

public class dek extends jzc {
    private int n;
    public Toolbar q;

    public dek() {
        this.n = R$drawable.bK;
        this.E.a(kbc.class, this.F);
    }

    public Toolbar l() {
        return this.q;
    }

    public void setContentView(int i) {
        super.setContentView(i);
        j();
    }

    public void setContentView(View view) {
        super.setContentView(view);
        j();
    }

    public void setContentView(View view, LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        j();
    }

    public void addContentView(View view, LayoutParams layoutParams) {
        super.addContentView(view, layoutParams);
        j();
    }

    public void a(int i, int i2) {
        super.setContentView(i);
        this.n = i2;
        j();
    }

    private void j() {
        this.q = (Toolbar) findViewById(ba.cm);
        iil.b("Toolbar needs to be in the layout with id hangouts_toolbar", this.q);
        this.q.e(R$drawable.aM);
        a(this.q);
        g().b(this.n);
    }
}

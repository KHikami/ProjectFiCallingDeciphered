import android.content.res.Resources;
import android.view.View;

public final class ddl extends ccv<ddn> {
    public ddl(View view, ddn ddn, gai gai) {
        super(view, ddn, gai);
    }

    protected boolean a() {
        int C = ((ddn) this.c).C();
        return C == 10 || C == 25;
    }

    protected gag b() {
        gah e = e();
        Resources resources = this.b.getResources();
        if (fdq.O.b(((jca) new jyr(this.b).getBinder().a(jca.class)).a())) {
            switch (((ddn) this.c).C()) {
                case wi.dr /*10*/:
                    e.a(resources.getString(bc.av));
                    break;
                case wi.dz /*25*/:
                    e.a(resources.getString(bc.ao));
                    break;
            }
        }
        e.a(resources.getString(bc.av));
        e.c(resources.getString(bc.P));
        e.a(new ddm(this));
        return e.a();
    }
}

import android.view.View;

public final class dcy extends ccv<dcz> {
    public dcy(View view, dcz dcz, gai gai) {
        super(view, dcz, gai);
    }

    protected boolean a() {
        return ((dcz) this.c).c() && ((dcz) this.c).b() != ((dcz) this.c).a();
    }

    protected gag b() {
        int i;
        gah e = e();
        if (((dcz) this.c).b()) {
            i = bc.kW;
        } else {
            i = bc.kX;
        }
        e.a(this.b.getResources().getString(i));
        return e.a();
    }
}

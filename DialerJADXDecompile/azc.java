import android.view.View;
import android.view.View.OnClickListener;

/* compiled from: PG */
final class azc implements OnClickListener {
    private /* synthetic */ ayv a;

    azc(ayv ayv) {
        this.a = ayv;
    }

    public final void onClick(View view) {
        azo azo = (azo) this.a.e;
        if (azo.c != null) {
            String valueOf = String.valueOf(azo.c);
            bdf.d(azo, new StringBuilder(String.valueOf(valueOf).length() + 20).append("Disconnecting call: ").append(valueOf).toString());
            valueOf = azo.c.d;
            azo.c.a(9);
            azs.a.b(azo.c);
            bdp.a().b(valueOf);
        }
    }
}

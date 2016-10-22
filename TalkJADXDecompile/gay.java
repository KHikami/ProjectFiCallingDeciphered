import android.content.Context;
import android.text.Html;

final class gay extends erm {
    final /* synthetic */ gaw a;

    public gay(gaw gaw, Context context, kbu kbu, int i) {
        this.a = gaw;
        super(context, kbu, i, gaw.a);
    }

    protected void c() {
        gaw gaw = this.a;
        if (null != null) {
            gaw.c = gld.a(Html.fromHtml(null));
            if (gaw.d != null) {
                gld.a(gaw.d, true);
                gaw.d.setOnClickListener(gaw.e);
            }
        } else {
            gaw.c = null;
            if (gaw.d != null) {
                gld.a(gaw.d, false);
                gaw.d.setOnClickListener(null);
            }
        }
        gaw.b();
    }

    public void a(etu etu) {
        gaw gaw = this.a;
        String a = etu.a();
        if (a != null) {
            gaw.c = gld.a(Html.fromHtml(a));
            if (gaw.d != null) {
                gld.a(gaw.d, true);
                gaw.d.setOnClickListener(gaw.e);
            }
        } else {
            gaw.c = null;
            if (gaw.d != null) {
                gld.a(gaw.d, false);
                gaw.d.setOnClickListener(null);
            }
        }
        gaw.b();
    }
}

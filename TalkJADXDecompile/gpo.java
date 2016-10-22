import android.text.TextUtils;
import android.widget.Toast;
import com.google.android.apps.hangouts.views.MessageListItemView;

public final class gpo extends iiq<Void, Void, Void> {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ MessageListItemView c;
    private String d;

    public gpo(MessageListItemView messageListItemView, String str, String str2) {
        this.c = messageListItemView;
        this.a = str;
        this.b = str2;
        this.d = this.c.c.ae();
    }

    protected /* bridge */ /* synthetic */ Object a(Object[] objArr) {
        return null;
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        a();
    }

    private void a() {
        if (!this.c.c.w() || !gwb.g(this.c.c.ae(), this.d)) {
            glk.d("Babel", "Not showing SmartProfile from conversation because user switched conversations/fragments.", new Object[0]);
        } else if (TextUtils.isEmpty(this.a) && TextUtils.isEmpty(this.b)) {
            glk.d("Babel", "Not showing SmartProfile from conversation because there's no personId", new Object[0]);
            Toast.makeText(this.c.getContext(), bc.hj, 0).show();
        } else {
            fxa fxa = (fxa) jyn.a(this.c.getContext(), fxa.class);
            if (TextUtils.isEmpty(this.a)) {
                fxa.b(this.c.getContext(), this.c.c, this.b, this.c.e, this.c.b.a());
            } else {
                fxa.a(this.c.getContext(), this.c.c, this.a, this.c.e, this.c.b.a());
            }
            gwb.a(this.c.i, 2141);
        }
    }
}

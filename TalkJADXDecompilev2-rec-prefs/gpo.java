package p000;

import android.text.TextUtils;
import android.widget.Toast;
import com.google.android.apps.hangouts.views.MessageListItemView;

public final class gpo extends iiq<Void, Void, Void> {
    final /* synthetic */ String f15873a;
    final /* synthetic */ String f15874b;
    final /* synthetic */ MessageListItemView f15875c;
    private String f15876d = this.f15875c.f7072c.ae();

    public gpo(MessageListItemView messageListItemView, String str, String str2) {
        this.f15875c = messageListItemView;
        this.f15873a = str;
        this.f15874b = str2;
    }

    protected /* bridge */ /* synthetic */ Object mo470a(Object[] objArr) {
        return null;
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        m18278a();
    }

    private void m18278a() {
        if (!this.f15875c.f7072c.mo875w() || !gwb.m2223g(this.f15875c.f7072c.ae(), this.f15876d)) {
            glk.m17981d("Babel", "Not showing SmartProfile from conversation because user switched conversations/fragments.", new Object[0]);
        } else if (TextUtils.isEmpty(this.f15873a) && TextUtils.isEmpty(this.f15874b)) {
            glk.m17981d("Babel", "Not showing SmartProfile from conversation because there's no personId", new Object[0]);
            Toast.makeText(this.f15875c.getContext(), bc.hj, 0).show();
        } else {
            fxa fxa = (fxa) jyn.m25426a(this.f15875c.getContext(), fxa.class);
            if (TextUtils.isEmpty(this.f15873a)) {
                fxa.mo2110b(this.f15875c.getContext(), this.f15875c.f7072c, this.f15874b, this.f15875c.f7074e, this.f15875c.f7071b.m9230a());
            } else {
                fxa.mo2109a(this.f15875c.getContext(), this.f15875c.f7072c, this.f15873a, this.f15875c.f7074e, this.f15875c.f7071b.m9230a());
            }
            gwb.m1823a(this.f15875c.f7078i, 2141);
        }
    }
}

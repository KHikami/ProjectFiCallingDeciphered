import android.content.res.Resources;
import android.text.TextUtils;
import android.widget.TextView;
import com.google.android.apps.hangouts.fragments.InvitationFragment;
import java.util.ArrayList;

public final class ddc extends fip {
    final /* synthetic */ InvitationFragment a;

    public ddc(InvitationFragment invitationFragment) {
        this.a = invitationFragment;
    }

    public void a(exz exz) {
        if (this.a.d == null || TextUtils.equals(this.a.d.a, exz.l())) {
            ArrayList m = exz.m();
            int min = Math.min(m.size(), this.a.i.size());
            Resources resources = this.a.getResources();
            for (int i = 0; i < min; i++) {
                CharSequence charSequence = null;
                eyb eyb = (eyb) m.get(i);
                Object string;
                switch (eyb.c) {
                    case wi.j /*1*/:
                        if (!TextUtils.isEmpty(eyb.b)) {
                            string = resources.getString(bc.sU, new Object[]{eyb.b, eyb.a});
                            break;
                        }
                        string = resources.getString(bc.uz, new Object[]{eyb.a});
                        break;
                    case wi.l /*2*/:
                        string = eyb.a;
                        break;
                    case wi.z /*3*/:
                        string = eyb.a;
                        break;
                    default:
                        break;
                }
                TextView textView = (TextView) this.a.i.get(i);
                textView.setVisibility(0);
                textView.setText(charSequence);
            }
            if (exz.k() != null) {
                String uri = exz.k().toString();
                dex dex = (dex) this.a.binder.a(dex.class);
                dey dey = (dey) this.a.binder.a(dey.class);
                if (dex.c()) {
                    dex.a(uri, new ddd(this), dey.b(this.a.h.getMeasuredWidth(), (int) (this.a.getResources().getDisplayMetrics().density * 128.0f)), new iic().c().d().a());
                    return;
                }
                InvitationFragment invitationFragment = this.a;
                ((fsi) invitationFragment.binder.a(fsi.class)).a(new bnn(new gkc(uri, invitationFragment.f.a()).a(invitationFragment.h.getMeasuredWidth(), (int) (invitationFragment.getResources().getDisplayMetrics().density * 128.0f)).a(true).d(true), new dde(invitationFragment), true, invitationFragment.d));
            }
        }
    }
}

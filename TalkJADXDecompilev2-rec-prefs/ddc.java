package p000;

import android.content.res.Resources;
import android.text.TextUtils;
import android.widget.TextView;
import com.google.android.apps.hangouts.fragments.InvitationFragment;
import java.util.ArrayList;

public final class ddc extends fip {
    final /* synthetic */ InvitationFragment f9530a;

    public ddc(InvitationFragment invitationFragment) {
        this.f9530a = invitationFragment;
    }

    public void mo1491a(exz exz) {
        if (this.f9530a.f6275d == null || TextUtils.equals(this.f9530a.f6275d.f11244a, exz.m14765l())) {
            ArrayList m = exz.m14766m();
            int min = Math.min(m.size(), this.f9530a.f6280i.size());
            Resources resources = this.f9530a.getResources();
            for (int i = 0; i < min; i++) {
                CharSequence charSequence = null;
                eyb eyb = (eyb) m.get(i);
                Object string;
                switch (eyb.f12463c) {
                    case 1:
                        if (!TextUtils.isEmpty(eyb.f12462b)) {
                            string = resources.getString(bc.sU, new Object[]{eyb.f12462b, eyb.f12461a});
                            break;
                        }
                        string = resources.getString(bc.uz, new Object[]{eyb.f12461a});
                        break;
                    case 2:
                        string = eyb.f12461a;
                        break;
                    case 3:
                        string = eyb.f12461a;
                        break;
                    default:
                        break;
                }
                TextView textView = (TextView) this.f9530a.f6280i.get(i);
                textView.setVisibility(0);
                textView.setText(charSequence);
            }
            if (exz.m14764k() != null) {
                String uri = exz.m14764k().toString();
                dex dex = (dex) this.f9530a.binder.m25443a(dex.class);
                dey dey = (dey) this.f9530a.binder.m25443a(dey.class);
                if (dex.mo1511c()) {
                    dex.mo1507a(uri, new ddd(this), dey.mo1517b(this.f9530a.f6279h.getMeasuredWidth(), (int) (this.f9530a.getResources().getDisplayMetrics().density * 128.0f)), new iic().m21857c().m21858d().m21854a());
                    return;
                }
                InvitationFragment invitationFragment = this.f9530a;
                ((fsi) invitationFragment.binder.m25443a(fsi.class)).mo2072a(new bnn(new gkc(uri, invitationFragment.f6277f.m5629a()).m5548a(invitationFragment.f6279h.getMeasuredWidth(), (int) (invitationFragment.getResources().getDisplayMetrics().density * 128.0f)).m5550a(true).m5558d(true), new dde(invitationFragment), true, invitationFragment.f6275d));
            }
        }
    }
}

package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.hangouts.content.EsProvider;
import com.google.android.apps.hangouts.quickreply.impl.QuickReplyActivity;

final class fcj implements ecv {
    final /* synthetic */ Context f12688a;
    final /* synthetic */ fci f12689b;

    fcj(fci fci, Context context) {
        this.f12689b = fci;
        this.f12688a = context;
    }

    public fr mo1975a(int i, ear ear, int i2) {
        String t;
        int i3;
        bko e = fde.m15018e(i);
        switch (fck.f12690a[ear.m13379a().ordinal()]) {
            case 1:
            case 2:
                t = e.m5651t();
                break;
            case 3:
                t = bko.m5608A();
                break;
            case 4:
                t = e.m5629a();
                break;
            default:
                String valueOf = String.valueOf(ear.m13379a());
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 30).append("Unexpected conversation type: ").append(valueOf).toString());
        }
        Intent intent = new Intent(this.f12688a, QuickReplyActivity.class);
        intent.putExtra("account_id", i);
        intent.putExtra("conversation_id", ear.f11061a);
        intent.putExtra("conversation_name", ear.f11066f);
        switch (fck.f12690a[ear.m13379a().ordinal()]) {
            case 1:
            case 2:
                i3 = 2;
                break;
            case 3:
                i3 = 3;
                break;
            default:
                i3 = 1;
                break;
        }
        intent.putExtra("transport_type", i3);
        intent.putExtra("conversation_type", ear.f11065e);
        intent.putExtra("is_group", ear.f11063c);
        intent.putExtra("send_from_name", t);
        intent.putExtra("opened_from_impression", i2);
        intent.setAction("android.intent.action.VIEW");
        intent.setFlags(32768);
        intent.setData(EsProvider.m8249a(i, ear.f11061a));
        fs fsVar = new fs(gwb.uf, this.f12688a.getString(gwb.ur), PendingIntent.getActivity(this.f12688a, i, intent, 268435456));
        if (gwb.m2107c()) {
            fsVar.m16109a(new hh("android.intent.extra.TEXT").m19778a(this.f12688a.getString(gwb.uu)).m19777a());
        }
        return fsVar.m16111b();
    }
}

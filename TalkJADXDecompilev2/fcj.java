package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.hangouts.content.EsProvider;
import com.google.android.apps.hangouts.quickreply.impl.QuickReplyActivity;

final class fcj implements ecv {
    final /* synthetic */ Context a;
    final /* synthetic */ fci b;

    fcj(fci fci, Context context) {
        this.b = fci;
        this.a = context;
    }

    public fr a(int i, ear ear, int i2) {
        String t;
        int i3;
        bko e = fde.e(i);
        switch (fck.a[ear.a().ordinal()]) {
            case 1:
            case 2:
                t = e.t();
                break;
            case 3:
                t = bko.A();
                break;
            case 4:
                t = e.a();
                break;
            default:
                String valueOf = String.valueOf(ear.a());
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 30).append("Unexpected conversation type: ").append(valueOf).toString());
        }
        Intent intent = new Intent(this.a, QuickReplyActivity.class);
        intent.putExtra("account_id", i);
        intent.putExtra("conversation_id", ear.a);
        intent.putExtra("conversation_name", ear.f);
        switch (fck.a[ear.a().ordinal()]) {
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
        intent.putExtra("conversation_type", ear.e);
        intent.putExtra("is_group", ear.c);
        intent.putExtra("send_from_name", t);
        intent.putExtra("opened_from_impression", i2);
        intent.setAction("android.intent.action.VIEW");
        intent.setFlags(32768);
        intent.setData(EsProvider.a(i, ear.a));
        fs fsVar = new fs(gwb.uf, this.a.getString(gwb.ur), PendingIntent.getActivity(this.a, i, intent, 268435456));
        if (gwb.c()) {
            fsVar.a(new hh("android.intent.extra.TEXT").a(this.a.getString(gwb.uu)).a());
        }
        return fsVar.b();
    }
}

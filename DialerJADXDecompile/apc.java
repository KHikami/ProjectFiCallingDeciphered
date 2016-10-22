import android.content.Context;
import android.telephony.PhoneNumberUtils;
import android.view.View;
import android.view.View.OnClickListener;

/* compiled from: PG */
final class apc implements OnClickListener {
    final /* synthetic */ Context a;
    private /* synthetic */ Integer b;
    private /* synthetic */ String c;
    private /* synthetic */ String d;
    private /* synthetic */ apb e;

    apc(apb apb, Integer num, String str, String str2, Context context) {
        this.e = apb;
        this.b = num;
        this.c = str;
        this.d = str2;
        this.a = context;
    }

    public final void onClick(View view) {
        atq.a(this.b, this.c, this.d, PhoneNumberUtils.formatNumber(this.c, this.d), Integer.valueOf(aq.l), this.e.a, new apd(this));
    }
}

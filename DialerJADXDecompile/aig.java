import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.android.contacts.common.vcard.ImportVCardActivity;

/* compiled from: PG */
public final class aig {
    private static boolean a;
    private static Uri b;

    static {
        a = false;
    }

    public static void a(Context context, int i, agd agd, int i2) {
        Intent intent;
        if (i == buf.fo) {
            intent = new Intent("android.intent.action.VIEW");
            intent.setType("vnd.android.cursor.item/sim-contact");
            if (agd != null) {
                intent.putExtra("account_name", agd.a);
                intent.putExtra("account_type", agd.b);
                intent.putExtra("data_set", agd.c);
            }
            intent.putExtra("subscription_id", Integer.valueOf(i2));
            intent.setClassName("com.android.phone", "com.android.phone.SimContacts");
            context.startActivity(intent);
        } else if (i == buf.fr) {
            intent = new Intent(context, ImportVCardActivity.class);
            if (agd != null) {
                intent.putExtra("account_name", agd.a);
                intent.putExtra("account_type", agd.b);
                intent.putExtra("data_set", agd.c);
            }
            a = false;
            b = null;
            context.startActivity(intent);
        }
    }
}

import android.os.AsyncTask;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;

/* compiled from: PG */
public final class bkn extends AsyncTask {
    private /* synthetic */ String a;
    private /* synthetic */ String b;
    private /* synthetic */ bkr c;
    private /* synthetic */ bkk d;

    public bkn(bkk bkk, String str, String str2, bkr bkr) {
        this.d = bkk;
        this.a = str;
        this.b = str2;
        this.c = bkr;
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        this.c.a(((Boolean) obj).booleanValue());
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        boolean z;
        bkz bkz = this.d.b;
        String str = this.a;
        String str2 = this.b;
        avl.b();
        if (str == null) {
            z = false;
        } else {
            CharSequence formatNumberToE164 = PhoneNumberUtils.formatNumberToE164(str, str2);
            if (!TextUtils.isEmpty(formatNumberToE164)) {
                CharSequence charSequence = formatNumberToE164;
            }
            z = bkz.a(str);
        }
        return Boolean.valueOf(z);
    }
}

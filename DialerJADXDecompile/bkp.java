import android.os.AsyncTask;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;

/* compiled from: PG */
public final class bkp extends AsyncTask {
    private /* synthetic */ String a;
    private /* synthetic */ String b;
    private /* synthetic */ int c;
    private /* synthetic */ int d;
    private /* synthetic */ bkk e;

    public bkp(bkk bkk, String str, String str2, int i, int i2) {
        this.e = bkk;
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        bkz bkz = this.e.b;
        String str = this.a;
        String str2 = this.b;
        int i = this.c;
        int i2 = this.d;
        avl.b();
        if (str != null) {
            CharSequence formatNumberToE164 = PhoneNumberUtils.formatNumberToE164(str, str2);
            if (!TextUtils.isEmpty(formatNumberToE164)) {
                CharSequence charSequence = formatNumberToE164;
            }
            if (bkz.a(str, 1) != -1) {
                bkx bkx = bkz.b;
                dbx a = bkx.a(str, i, i2);
                a.c = 2;
                a.j = false;
                bkx.a(a);
            }
        }
        return null;
    }
}

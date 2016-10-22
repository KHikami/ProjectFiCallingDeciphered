package defpackage;

import android.os.AsyncTask;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;

/* compiled from: PG */
/* renamed from: bko */
final class bko extends AsyncTask {
    private /* synthetic */ String a;
    private /* synthetic */ String b;
    private /* synthetic */ bkt c;
    private /* synthetic */ bkk d;

    bko(bkk bkk, String str, String str2, bkt bkt) {
        this.d = bkk;
        this.a = str;
        this.b = str2;
        this.c = bkt;
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        this.c.a((blb) obj);
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        bkz bkz = this.d.b;
        String str = this.a;
        String str2 = this.b;
        avl.b();
        if (str == null) {
            return null;
        }
        CharSequence formatNumberToE164 = PhoneNumberUtils.formatNumberToE164(str, str2);
        if (!TextUtils.isEmpty(formatNumberToE164)) {
            CharSequence charSequence = formatNumberToE164;
        }
        return bkz.b(str);
    }
}

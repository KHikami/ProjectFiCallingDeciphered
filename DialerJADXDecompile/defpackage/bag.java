package defpackage;

import android.content.AsyncQueryHandler;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: bag */
final class bag extends AsyncQueryHandler {
    Context a;
    Uri b;
    bad c;
    private /* synthetic */ bae d;

    bag(bae bae, Context context) {
        this.d = bae;
        super(context.getContentResolver());
    }

    public final void startQuery(int i, Object obj, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        super.startQuery(i, obj, uri, strArr, str, strArr2, str2);
    }

    protected final Handler createHandler(Looper looper) {
        return new bah(this, looper);
    }

    protected final void onQueryComplete(int i, Object obj, Cursor cursor) {
        try {
            bdf.a((Object) this, "##### onQueryComplete() #####   query complete for token: " + i);
            bai bai = (bai) obj;
            if (bai == null) {
                bdf.a((Object) this, "Cookie is null, ignoring onQueryComplete() request.");
                if (cursor != null && !cursor.isClosed()) {
                    cursor.close();
                }
            } else if (bai.c == 3) {
                bae bae = this.d;
                bae.a.a = null;
                bae.a.b = null;
                bae.a.c = null;
                bae.a = null;
                if (cursor != null && !cursor.isClosed()) {
                    cursor.close();
                }
            } else {
                String valueOf;
                if (this.c == null) {
                    if (this.a == null || this.b == null) {
                        throw new bam("Bad context or query uri, or CallerInfoAsyncQuery already released.");
                    }
                    bad bad;
                    if (bai.c == 4) {
                        bad = new bad();
                        bad.a = this.a.getString(aq.cu);
                        bad.c = null;
                        bad.m = buf.kG;
                        bad.v = true;
                        this.c = bad;
                    } else if (bai.c == 5) {
                        this.c = new bad().a(this.a);
                    } else {
                        this.c = bad.a(this.a, this.b, cursor);
                        valueOf = String.valueOf(this.c);
                        bdf.a((Object) this, new StringBuilder(String.valueOf(valueOf).length() + 21).append("==> Got mCallerInfo: ").append(valueOf).toString());
                        bad = bad.a(this.a, bai.d, this.c);
                        if (bad != this.c) {
                            this.c = bad;
                            valueOf = String.valueOf(this.c);
                            bdf.a((Object) this, new StringBuilder(String.valueOf(valueOf).length() + 48).append("#####async contact look up with numeric username").append(valueOf).toString());
                        }
                        if (TextUtils.isEmpty(this.c.a)) {
                            bad bad2 = this.c;
                            Context context = this.a;
                            valueOf = bai.d;
                            if (!TextUtils.isEmpty(bad2.c)) {
                                valueOf = bad2.c;
                            }
                            bad2.f = awy.a(context, valueOf);
                        }
                        if (!TextUtils.isEmpty(bai.d)) {
                            this.c.c = PhoneNumberUtils.formatNumber(bai.d, this.c.d, awy.a(this.a, Locale.getDefault()));
                        }
                    }
                    bdf.a((Object) this, "constructing CallerInfo object for token: " + i);
                    bai bai2 = new bai();
                    bai2.c = 3;
                    startQuery(i, bai2, null, null, null, null, null);
                }
                if (bai.a != null) {
                    valueOf = String.valueOf(bai.a.getClass().toString());
                    String valueOf2 = String.valueOf(this.c);
                    bdf.a((Object) this, new StringBuilder((String.valueOf(valueOf).length() + 43) + String.valueOf(valueOf2).length()).append("notifying listener: ").append(valueOf).append(" for token: ").append(i).append(valueOf2).toString());
                    bai.a.a(i, bai.b, this.c);
                }
                if (cursor != null && !cursor.isClosed()) {
                    cursor.close();
                }
            }
        } catch (Throwable th) {
            if (!(cursor == null || cursor.isClosed())) {
                cursor.close();
            }
        }
    }
}

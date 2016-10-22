import android.content.Intent;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Parcelable;
import android.text.TextUtils;

/* compiled from: PG */
final class aev extends aet {
    private final String f;
    private String g;
    private int h;
    private String i;
    private /* synthetic */ aes j;

    protected final /* synthetic */ void onPostExecute(Object obj) {
        Drawable bitmapDrawable;
        Parcelable a;
        aes aes = this.j;
        Uri uri = this.a;
        String str = this.b;
        String str2 = this.c;
        byte[] bArr = this.d;
        String str3 = this.g;
        int i = this.h;
        String str4 = this.i;
        CharSequence charSequence = this.f;
        if (bArr != null) {
            bitmapDrawable = new BitmapDrawable(aes.d.getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length, null));
        } else {
            bitmapDrawable = aaz.a(aes.d.getResources(), new abc(str, str2, false));
        }
        Uri fromParts;
        if ("android.intent.action.CALL".equals(charSequence)) {
            fromParts = Uri.fromParts("tel", str3, null);
            a = aes.a(bitmapDrawable, i, str4, buf.db);
            uri = fromParts;
        } else {
            fromParts = Uri.fromParts("smsto", str3, null);
            Object a2 = aes.a(bitmapDrawable, i, str4, buf.dc);
            uri = fromParts;
        }
        Parcelable intent = new Intent(charSequence, uri);
        intent.setFlags(67108864);
        Intent intent2 = new Intent();
        intent2.putExtra("android.intent.extra.shortcut.ICON", a);
        intent2.putExtra("android.intent.extra.shortcut.INTENT", intent);
        if (TextUtils.isEmpty(str)) {
            str2 = aes.d.getResources().getString(buf.fI);
        } else {
            str2 = str;
        }
        if (TextUtils.equals(charSequence, "android.intent.action.CALL")) {
            intent2.putExtra("android.intent.extra.shortcut.NAME", aes.d.getResources().getString(buf.dE, new Object[]{str2}));
        } else if (TextUtils.equals(charSequence, "android.intent.action.SENDTO")) {
            intent2.putExtra("android.intent.extra.shortcut.NAME", aes.d.getResources().getString(buf.gp, new Object[]{str2}));
        }
        aes.c.a(intent2);
    }

    public aev(aes aes, Uri uri, String str) {
        this.j = aes;
        super(aes, uri);
        this.f = str;
    }

    protected final void a() {
        Cursor query = this.j.d.getContentResolver().query(this.a, aes.a, null, null, null);
        if (query != null) {
            try {
                if (query.moveToFirst()) {
                    this.b = query.getString(0);
                    this.e = query.getLong(1);
                    this.g = query.getString(2);
                    this.h = query.getInt(3);
                    this.i = query.getString(4);
                    this.c = query.getString(5);
                }
                query.close();
            } catch (Throwable th) {
                query.close();
            }
        }
    }
}

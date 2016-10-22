package defpackage;

import android.content.ContentValues;
import android.os.AsyncTask;
import com.google.android.apps.hangouts.phone.ApnEditorActivity;

/* renamed from: eiu */
public final class eiu extends AsyncTask<Void, Void, Void> {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ ApnEditorActivity d;

    public eiu(ApnEditorActivity apnEditorActivity, String str, String str2, String str3) {
        this.d = apnEditorActivity;
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return a();
    }

    private Void a() {
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", this.a.length() <= 0 ? this.d.getResources().getString(bc.tI) : this.a);
        ApnEditorActivity apnEditorActivity = this.d;
        contentValues.put("mmsproxy", ApnEditorActivity.a(this.d.b.getText()));
        apnEditorActivity = this.d;
        contentValues.put("mmsport", ApnEditorActivity.a(this.d.c.getText()));
        apnEditorActivity = this.d;
        contentValues.put("mmsc", ApnEditorActivity.a(this.d.a.getText()));
        contentValues.put("type", "mms");
        contentValues.put("mcc", this.b);
        contentValues.put("mnc", this.c);
        String str = "numeric";
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        if (valueOf2.length() != 0) {
            valueOf2 = valueOf.concat(valueOf2);
        } else {
            valueOf2 = new String(valueOf);
        }
        contentValues.put(str, valueOf2);
        if (this.d.d != null && this.d.e != null && this.d.d.equals(this.c) && this.d.e.equals(this.b)) {
            contentValues.put("current", Integer.valueOf(1));
        }
        if (this.d.g) {
            this.d.j.insert("apn", null, contentValues);
        } else {
            this.d.j.update("apn", contentValues, "_id =?", new String[]{this.d.h});
        }
        return null;
    }
}

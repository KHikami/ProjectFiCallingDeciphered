package p000;

import android.content.ContentValues;
import android.os.AsyncTask;
import com.google.android.apps.hangouts.phone.ApnEditorActivity;

public final class eiu extends AsyncTask<Void, Void, Void> {
    final /* synthetic */ String f11619a;
    final /* synthetic */ String f11620b;
    final /* synthetic */ String f11621c;
    final /* synthetic */ ApnEditorActivity f11622d;

    public eiu(ApnEditorActivity apnEditorActivity, String str, String str2, String str3) {
        this.f11622d = apnEditorActivity;
        this.f11619a = str;
        this.f11620b = str2;
        this.f11621c = str3;
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return m13992a();
    }

    private Void m13992a() {
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", this.f11619a.length() <= 0 ? this.f11622d.getResources().getString(bc.tI) : this.f11619a);
        ApnEditorActivity apnEditorActivity = this.f11622d;
        contentValues.put("mmsproxy", ApnEditorActivity.m8776a(this.f11622d.f6544b.getText()));
        apnEditorActivity = this.f11622d;
        contentValues.put("mmsport", ApnEditorActivity.m8776a(this.f11622d.f6545c.getText()));
        apnEditorActivity = this.f11622d;
        contentValues.put("mmsc", ApnEditorActivity.m8776a(this.f11622d.f6543a.getText()));
        contentValues.put("type", "mms");
        contentValues.put("mcc", this.f11620b);
        contentValues.put("mnc", this.f11621c);
        String str = "numeric";
        String valueOf = String.valueOf(this.f11620b);
        String valueOf2 = String.valueOf(this.f11621c);
        if (valueOf2.length() != 0) {
            valueOf2 = valueOf.concat(valueOf2);
        } else {
            valueOf2 = new String(valueOf);
        }
        contentValues.put(str, valueOf2);
        if (this.f11622d.f6546d != null && this.f11622d.f6547e != null && this.f11622d.f6546d.equals(this.f11621c) && this.f11622d.f6547e.equals(this.f11620b)) {
            contentValues.put("current", Integer.valueOf(1));
        }
        if (this.f11622d.f6549g) {
            this.f11622d.f6551j.insert("apn", null, contentValues);
        } else {
            this.f11622d.f6551j.update("apn", contentValues, "_id =?", new String[]{this.f11622d.f6550h});
        }
        return null;
    }
}

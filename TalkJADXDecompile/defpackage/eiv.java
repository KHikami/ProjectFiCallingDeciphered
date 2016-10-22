package defpackage;

import android.os.AsyncTask;
import com.google.android.apps.hangouts.phone.ApnEditorActivity;

/* renamed from: eiv */
public final class eiv extends AsyncTask<Void, Void, Void> {
    final /* synthetic */ ApnEditorActivity a;

    public eiv(ApnEditorActivity apnEditorActivity) {
        this.a = apnEditorActivity;
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return a();
    }

    private Void a() {
        String[] strArr = new String[]{this.a.h};
        this.a.j.delete("apn", "_id =?", strArr);
        return null;
    }
}

package p000;

import android.os.AsyncTask;
import com.google.android.apps.hangouts.phone.ApnEditorActivity;

public final class eiv extends AsyncTask<Void, Void, Void> {
    final /* synthetic */ ApnEditorActivity f11623a;

    public eiv(ApnEditorActivity apnEditorActivity) {
        this.f11623a = apnEditorActivity;
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return m13993a();
    }

    private Void m13993a() {
        String[] strArr = new String[]{this.f11623a.f6550h};
        this.f11623a.f6551j.delete("apn", "_id =?", strArr);
        return null;
    }
}

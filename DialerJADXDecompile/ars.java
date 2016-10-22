import android.os.AsyncTask;
import java.io.FileNotFoundException;

/* compiled from: PG */
final class ars extends AsyncTask {
    private /* synthetic */ asw a;
    private /* synthetic */ arr b;

    ars(arr arr, asw asw) {
        this.b = arr;
        this.a = asw;
    }

    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        return a();
    }

    public final /* synthetic */ void onPostExecute(Object obj) {
        this.a.a(((Boolean) obj).booleanValue());
    }

    private Boolean a() {
        try {
            if (this.b.f != null) {
                this.b.e.getContentResolver().openInputStream(this.b.f);
                return Boolean.valueOf(true);
            }
        } catch (FileNotFoundException e) {
            String valueOf = String.valueOf(this.b.f);
            new StringBuilder(String.valueOf(valueOf).length() + 29).append("Voicemail file not found for ").append(valueOf);
        }
        return Boolean.valueOf(false);
    }
}

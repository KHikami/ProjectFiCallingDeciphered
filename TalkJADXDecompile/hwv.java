import android.content.Context;
import android.os.AsyncTask;

final class hwv extends AsyncTask<Void, Void, Integer> {
    final /* synthetic */ Context a;
    final /* synthetic */ hww b;

    hwv(Context context, hww hww) {
        this.a = context;
        this.b = hww;
    }

    private Integer a() {
        try {
            hwu.a(this.a);
            return Integer.valueOf(0);
        } catch (gts e) {
            return Integer.valueOf(e.a());
        } catch (gtr e2) {
            return Integer.valueOf(e2.a);
        }
    }

    private void a(Integer num) {
        if (num.intValue() != 0) {
            this.b.a(num.intValue(), hwu.a.a(this.a, num.intValue(), "pi"));
        }
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return a();
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        a((Integer) obj);
    }
}

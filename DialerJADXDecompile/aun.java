import android.os.AsyncTask;

/* compiled from: PG */
final class aun extends AsyncTask {
    private /* synthetic */ auo a;
    private /* synthetic */ aum b;

    aun(aum aum, auo auo) {
        this.b = aum;
        this.a = auo;
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        Boolean bool = (Boolean) obj;
        buf.a("BlockedNumbersMigrator, migrate - marking migration complete", new Object[0]);
        buf.a(this.b.a, bool.booleanValue());
        buf.a("BlockedNumbersMigrator, migrate - calling listener", new Object[0]);
        this.a.a();
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        buf.a("BlockedNumbersMigrator, migrate - start background migration", new Object[0]);
        return Boolean.valueOf(aum.a(this.b.a.getContentResolver()));
    }
}

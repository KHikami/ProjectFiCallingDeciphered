import android.accounts.Account;
import android.os.AsyncTask;
import android.os.RemoteException;
import android.util.Log;

final class hsr extends AsyncTask<Void, Void, Account[]> {
    final /* synthetic */ hsp a;

    hsr(hsp hsp) {
        this.a = hsp;
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return a();
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        a((Account[]) obj);
    }

    private Account[] a() {
        Throwable e;
        if (isCancelled()) {
            return null;
        }
        try {
            return gss.c(this.a.a, "com.google");
        } catch (RemoteException e2) {
            e = e2;
            Log.e("AccountOrderingHelper", "Failed to get accounts", e);
            return null;
        } catch (gts e3) {
            e = e3;
            Log.e("AccountOrderingHelper", "Failed to get accounts", e);
            return null;
        } catch (gtr e4) {
            e = e4;
            Log.e("AccountOrderingHelper", "Failed to get accounts", e);
            return null;
        }
    }

    private void a(Account[] accountArr) {
        hsp hsp = this.a;
        if (hsp.b == null || hsp.b.isEmpty()) {
            hsp.a();
        } else {
            hwn hwn;
            Iterable<hwn> iterable = hsp.b;
            hsp.d.clear();
            if (iterable != null) {
                for (hwn hwn2 : iterable) {
                    if (gwb.a(hwn2)) {
                        hsp.d.put(hwn2.a(), hwn2);
                    }
                }
            }
            if (hsp.d.isEmpty()) {
                hsp.a();
            } else if (accountArr != null && accountArr.length > 0) {
                hsp.c.clear();
                for (Account account : accountArr) {
                    hwn2 = (hwn) hsp.d.get(account.name);
                    if (hwn2 != null) {
                        hsp.c.add(hwn2);
                    }
                }
            }
        }
        if (hsp.e != null) {
            hsp.e.a(hsp.c);
        }
    }
}

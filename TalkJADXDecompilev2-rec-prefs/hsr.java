package p000;

import android.accounts.Account;
import android.os.AsyncTask;
import android.os.RemoteException;
import android.util.Log;

final class hsr extends AsyncTask<Void, Void, Account[]> {
    final /* synthetic */ hsp f17185a;

    hsr(hsp hsp) {
        this.f17185a = hsp;
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return m20778a();
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        m20777a((Account[]) obj);
    }

    private Account[] m20778a() {
        Throwable e;
        if (isCancelled()) {
            return null;
        }
        try {
            return gss.m18491c(this.f17185a.f17179a, "com.google");
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

    private void m20777a(Account[] accountArr) {
        hsp hsp = this.f17185a;
        if (hsp.f17180b == null || hsp.f17180b.isEmpty()) {
            hsp.m20774a();
        } else {
            hwn hwn;
            Iterable<hwn> iterable = hsp.f17180b;
            hsp.f17182d.clear();
            if (iterable != null) {
                for (hwn hwn2 : iterable) {
                    if (gwb.m1927a(hwn2)) {
                        hsp.f17182d.put(hwn2.mo1778a(), hwn2);
                    }
                }
            }
            if (hsp.f17182d.isEmpty()) {
                hsp.m20774a();
            } else if (accountArr != null && accountArr.length > 0) {
                hsp.f17181c.clear();
                for (Account account : accountArr) {
                    hwn2 = (hwn) hsp.f17182d.get(account.name);
                    if (hwn2 != null) {
                        hsp.f17181c.add(hwn2);
                    }
                }
            }
        }
        if (hsp.f17183e != null) {
            hsp.f17183e.mo2947a(hsp.f17181c);
        }
    }
}

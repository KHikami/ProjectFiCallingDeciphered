package p000;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Debug;
import android.os.Debug.MemoryInfo;

public final class czo extends AsyncTask<Void, Void, Void> {
    private hwl f9382a;
    private ky<String, Integer> f9383b = new ky();
    private ky<String, Integer> f9384c = new ky();
    private final Context f9385d;
    private final czp f9386e;
    private final fsb f9387f;

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return m11349b();
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        m11350c();
    }

    private void m11350c() {
        if (!isCancelled()) {
            this.f9386e.mo1494a(this.f9387f, this);
        }
    }

    public czo(Context context, hwl hwl, fsb fsb, czp czp) {
        this.f9385d = context;
        this.f9387f = fsb;
        this.f9386e = czp;
        this.f9382a = hwl;
    }

    public hwk m11351a(String str) {
        if (this.f9382a == null || this.f9382a.mo2076c() || !this.f9384c.containsKey(str)) {
            return null;
        }
        return (hwk) this.f9382a.mo2075a(gwb.m1507a((Integer) this.f9384c.get(str)));
    }

    public hwk m11353b(String str) {
        String e = glq.m18021e(this.f9385d, str);
        if (this.f9382a == null || this.f9382a.mo2076c() || !this.f9383b.containsKey(e)) {
            return null;
        }
        return (hwk) this.f9382a.mo2075a(gwb.m1507a((Integer) this.f9383b.get(e)));
    }

    public void m11352a() {
        this.f9382a = null;
        this.f9383b.clear();
        this.f9384c.clear();
    }

    private Void m11349b() {
        try {
            this.f9383b.clear();
            this.f9384c.clear();
            MemoryInfo memoryInfo = new MemoryInfo();
            if (this.f9382a != null) {
                glk.m17979c("Babel", "Loading contacts: " + this.f9382a.mo2074a(), new Object[0]);
                for (int i = 0; i < this.f9382a.mo2074a(); i++) {
                    if (i % 100 == 0) {
                        Debug.getMemoryInfo(memoryInfo);
                        if (memoryInfo.getTotalPss() < 2048) {
                            glk.m17982e("Babel", "Low memory! Halting contact load.", new Object[0]);
                            break;
                        }
                    }
                    hwk hwk = (hwk) this.f9382a.mo2075a(i);
                    if (dak.m11382a(hwk)) {
                        for (hwr hwr : hwk.mo2080d()) {
                            if (isCancelled()) {
                                throw new InterruptedException();
                            }
                            String e = glq.m18021e(this.f9385d, hwr.mo2955b());
                            if (!this.f9383b.containsKey(e)) {
                                this.f9383b.put(e, Integer.valueOf(i));
                            }
                        }
                        for (Long l : hwk.mo2078b()) {
                            if (isCancelled()) {
                                throw new InterruptedException();
                            }
                            String valueOf = String.valueOf(l);
                            if (!this.f9384c.containsKey(valueOf)) {
                                this.f9384c.put(valueOf, Integer.valueOf(i));
                            }
                        }
                        continue;
                    }
                }
            }
        } catch (InterruptedException e2) {
            glk.m17981d("Babel", "ContactLookupProviderAsyncTask interrupted.", new Object[0]);
            m11352a();
        } catch (IllegalStateException e3) {
            glk.m17981d("Babel", "ContactLookupProviderAsyncTask failed with IllegalStateException.", new Object[0]);
            m11352a();
        }
        return null;
    }
}

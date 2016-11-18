package p000;

import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.os.RemoteException;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class dzh {
    final String f10895a;
    final Map<String, Long> f10896b;
    final Map<String, String> f10897c;
    final ReadWriteLock f10898d = new ReentrantReadWriteLock();
    final Lock f10899e = this.f10898d.readLock();
    final Lock f10900f = this.f10898d.writeLock();

    public String m13145a(String str) {
        return m13146a(str, false);
    }

    public void m13147b(String str) {
        try {
            gwb.m1667a(str, this.f10895a, true);
        } catch (git e) {
            glk.m17970a("Babel", "Trigger Auth Notification: Ignore AccountNotFoundException", new Object[0]);
        } catch (ids e2) {
            glk.m17970a("Babel", "Trigger Auth Notification: Ignore GooglePlayServicesNotAvailableException | RemoteException | GooglePlayServicesRepairableException", new Object[0]);
        } catch (RemoteException e3) {
            glk.m17970a("Babel", "Trigger Auth Notification: Ignore GooglePlayServicesNotAvailableException | RemoteException | GooglePlayServicesRepairableException", new Object[0]);
        } catch (idt e4) {
            glk.m17970a("Babel", "Trigger Auth Notification: Ignore GooglePlayServicesNotAvailableException | RemoteException | GooglePlayServicesRepairableException", new Object[0]);
        } catch (AuthenticatorException e5) {
            glk.m17970a("Babel", "Trigger Auth Notification: Ignore AuthenticatorException", new Object[0]);
        } catch (OperationCanceledException e6) {
            glk.m17970a("Babel", "Trigger Auth Notification: Ignore OperationCanceledException", new Object[0]);
        } catch (IOException e7) {
            glk.m17970a("Babel", "Trigger Auth Notification: Ignore IOException", new Object[0]);
        } catch (giu e8) {
            glk.m17970a("Babel", "Trigger Auth Notification: Ignore BabelAuthException", new Object[0]);
        }
    }

    public Long m13148c(String str) {
        this.f10899e.lock();
        try {
            Long l = (Long) this.f10896b.get(str);
            return l;
        } finally {
            this.f10899e.unlock();
        }
    }

    public void m13149d(String str) {
        m13146a(str, true);
    }

    public dzh(String str) {
        this.f10895a = str;
        this.f10896b = new ky();
        this.f10897c = new ky();
    }

    String m13146a(String str, boolean z) {
        Exception e;
        this.f10900f.lock();
        try {
            String a;
            Long valueOf;
            String str2 = (String) this.f10897c.get(str);
            if (str2 == null && z) {
                a = gwb.m1667a(str, this.f10895a, false);
            } else {
                a = str2;
            }
            if (a != null) {
                Long l = (Long) this.f10896b.get(a);
                long a2 = glj.m17956a() - gwb.m1523a(l);
                if (z || l == null || a2 > 3600000) {
                    this.f10897c.remove(str);
                    this.f10896b.remove(a);
                    gwb.m1402H(a);
                    str2 = null;
                    if (str2 == null && this.f10895a != null) {
                        valueOf = Long.valueOf(glj.m17956a());
                        a = gwb.m1667a(str, this.f10895a, false);
                        if (a != null) {
                            str2 = (String) this.f10897c.remove(str);
                            if (str2 != null) {
                                this.f10896b.remove(str2);
                            }
                            this.f10897c.put(str, a);
                            this.f10896b.put(a, valueOf);
                        }
                        str2 = a;
                    }
                    this.f10900f.unlock();
                    return str2;
                }
            }
            str2 = a;
            valueOf = Long.valueOf(glj.m17956a());
            a = gwb.m1667a(str, this.f10895a, false);
            if (a != null) {
                str2 = (String) this.f10897c.remove(str);
                if (str2 != null) {
                    this.f10896b.remove(str2);
                }
                this.f10897c.put(str, a);
                this.f10896b.put(a, valueOf);
            }
            str2 = a;
            this.f10900f.unlock();
            return str2;
        } catch (Exception e2) {
            glk.m17980d("Babel", "Error getting auth token", (Throwable) e2);
            throw new fdo(100, e2);
        } catch (Exception e22) {
            glk.m17980d("Babel", "Error getting auth token", (Throwable) e22);
            throw new fdo(100, e22);
        } catch (Exception e222) {
            glk.m17980d("Babel", "Network error while getting auth token", (Throwable) e222);
            throw new fdo(102, e222);
        } catch (Exception e2222) {
            glk.m17980d("Babel", "Error getting auth token", (Throwable) e2222);
            throw new fdo(100, e2222);
        } catch (git e3) {
            e2222 = e3;
            throw new fdo(139, e2222);
        } catch (RemoteException e4) {
            e2222 = e4;
            throw new fdo(139, e2222);
        } catch (idt e5) {
            e2222 = e5;
            throw new fdo(139, e2222);
        } catch (ids e6) {
            e2222 = e6;
            throw new fdo(139, e2222);
        } catch (Throwable th) {
            this.f10900f.unlock();
        }
    }
}

import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.os.RemoteException;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class dzh {
    final String a;
    final Map<String, Long> b;
    final Map<String, String> c;
    final ReadWriteLock d;
    final Lock e;
    final Lock f;

    public String a(String str) {
        return a(str, false);
    }

    public void b(String str) {
        try {
            gwb.a(str, this.a, true);
        } catch (git e) {
            glk.a("Babel", "Trigger Auth Notification: Ignore AccountNotFoundException", new Object[0]);
        } catch (ids e2) {
            glk.a("Babel", "Trigger Auth Notification: Ignore GooglePlayServicesNotAvailableException | RemoteException | GooglePlayServicesRepairableException", new Object[0]);
        } catch (RemoteException e3) {
            glk.a("Babel", "Trigger Auth Notification: Ignore GooglePlayServicesNotAvailableException | RemoteException | GooglePlayServicesRepairableException", new Object[0]);
        } catch (idt e4) {
            glk.a("Babel", "Trigger Auth Notification: Ignore GooglePlayServicesNotAvailableException | RemoteException | GooglePlayServicesRepairableException", new Object[0]);
        } catch (AuthenticatorException e5) {
            glk.a("Babel", "Trigger Auth Notification: Ignore AuthenticatorException", new Object[0]);
        } catch (OperationCanceledException e6) {
            glk.a("Babel", "Trigger Auth Notification: Ignore OperationCanceledException", new Object[0]);
        } catch (IOException e7) {
            glk.a("Babel", "Trigger Auth Notification: Ignore IOException", new Object[0]);
        } catch (giu e8) {
            glk.a("Babel", "Trigger Auth Notification: Ignore BabelAuthException", new Object[0]);
        }
    }

    public Long c(String str) {
        this.e.lock();
        try {
            Long l = (Long) this.b.get(str);
            return l;
        } finally {
            this.e.unlock();
        }
    }

    public void d(String str) {
        a(str, true);
    }

    public dzh(String str) {
        this.d = new ReentrantReadWriteLock();
        this.e = this.d.readLock();
        this.f = this.d.writeLock();
        this.a = str;
        this.b = new ky();
        this.c = new ky();
    }

    String a(String str, boolean z) {
        Exception e;
        this.f.lock();
        try {
            String a;
            Long valueOf;
            String str2 = (String) this.c.get(str);
            if (str2 == null && z) {
                a = gwb.a(str, this.a, false);
            } else {
                a = str2;
            }
            if (a != null) {
                Long l = (Long) this.b.get(a);
                long a2 = glj.a() - gwb.a(l);
                if (z || l == null || a2 > 3600000) {
                    this.c.remove(str);
                    this.b.remove(a);
                    gwb.H(a);
                    str2 = null;
                    if (str2 == null && this.a != null) {
                        valueOf = Long.valueOf(glj.a());
                        a = gwb.a(str, this.a, false);
                        if (a != null) {
                            str2 = (String) this.c.remove(str);
                            if (str2 != null) {
                                this.b.remove(str2);
                            }
                            this.c.put(str, a);
                            this.b.put(a, valueOf);
                        }
                        str2 = a;
                    }
                    this.f.unlock();
                    return str2;
                }
            }
            str2 = a;
            valueOf = Long.valueOf(glj.a());
            a = gwb.a(str, this.a, false);
            if (a != null) {
                str2 = (String) this.c.remove(str);
                if (str2 != null) {
                    this.b.remove(str2);
                }
                this.c.put(str, a);
                this.b.put(a, valueOf);
            }
            str2 = a;
            this.f.unlock();
            return str2;
        } catch (Exception e2) {
            glk.d("Babel", "Error getting auth token", (Throwable) e2);
            throw new fdo(100, e2);
        } catch (Exception e22) {
            glk.d("Babel", "Error getting auth token", (Throwable) e22);
            throw new fdo(100, e22);
        } catch (Exception e222) {
            glk.d("Babel", "Network error while getting auth token", (Throwable) e222);
            throw new fdo(102, e222);
        } catch (Exception e2222) {
            glk.d("Babel", "Error getting auth token", (Throwable) e2222);
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
            this.f.unlock();
        }
    }
}

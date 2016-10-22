package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import com.google.api.client.http.HttpStatusCodes;
import java.util.ArrayList;
import java.util.List;

/* renamed from: cok */
public final class cok implements ead {
    private static final boolean c;
    public final col a;
    transient jqu b;

    static {
        kae kae = glk.l;
        c = false;
    }

    public cok(col col) {
        this.a = col;
    }

    public String K_() {
        return "photo_queue";
    }

    public long b() {
        return Long.MAX_VALUE;
    }

    public boolean c() {
        return true;
    }

    public void a(Context context, eaf eaf) {
        List g = this.a.g();
        if (g.isEmpty()) {
            throw new fdo(114, "no attachment found");
        }
        bxn bxn = (bxn) g.get(0);
        if (bxn.c != bxo.PHOTO && bxn.c != bxo.VIDEO) {
            String valueOf = String.valueOf(bxn.c);
            throw new fdo(114, new StringBuilder(String.valueOf(valueOf).length() + 57).append("only allow photo or video, unsupported attachment format ").append(valueOf).toString());
        } else if (bxn instanceof bxy) {
            bxy bxy = (bxy) bxn;
            int b = eaf.b();
            blo blo = new blo(context, b);
            if (bxn.c == bxo.VIDEO) {
                a(b, 551, bxy.j);
            } else {
                a(b, 501, bxy.j);
            }
            bko e = fde.e(b);
            if (e == null) {
                throw new fdo(114, "null account");
            }
            jqs a = a(new jqv(context).a(e.a()).b(e.b().a).a(new jqw(this, blo)).a(jrk.STANDARD).a());
            if (TextUtils.isEmpty(a.b())) {
                throw new fdo(122, "empty photo id in the upload response");
            }
            if (bxn.c == bxo.VIDEO) {
                a(b, 552, a.c());
            } else {
                a(b, (int) HttpStatusCodes.STATUS_CODE_BAD_GATEWAY, a.c());
            }
            if (c) {
                String str = "uploading completed. Public URL: ";
                String valueOf2 = String.valueOf(a.a());
                if (valueOf2.length() != 0) {
                    str.concat(valueOf2);
                } else {
                    valueOf2 = new String(str);
                }
            }
            if (blo.n(this.a.d(), this.a.c()) == fwx.PENDING_DELETE) {
                blo.a("conversation_id=? AND message_id=?", new String[]{this.a.d(), this.a.c()});
                return;
            }
            fdn e2 = fde.e(e);
            fok a2 = a(a);
            if (bxn.c == bxo.VIDEO) {
                blo.a(this.a.d(), this.a.c(), fwx.AWAIT_READY, 0);
                a(b, 554, (long) bxy.i);
                e2.a(new cnv(a.e(), a.b(), a2), this.a.L_());
                return;
            }
            e2.a(a2, this.a.L_());
        } else {
            throw new fdo(114, "only photo or video must be MediaAttachment");
        }
    }

    private cpa a(jqs jqs) {
        List arrayList = new ArrayList();
        bye bye = new bye();
        bye.c = bxo.PLUS_PHOTO;
        bye.f = jqs.b();
        bye.g = jqs.d();
        bye.h = jqs.a();
        arrayList.add(bye);
        cpa a = new cpb(this.a.c(), this.a.d()).a(this.a.e()).a(this.a.i()).a(this.a.j()).b(this.a.k()).b(this.a.m()).a(this.a.l()).b(this.a.n()).a(this.a.f()).b(arrayList).a();
        a.b(this.a.L_());
        return a;
    }

    private void a(int i, int i2, long j) {
        ba.a(i, glj.b(), 10, ba.c().a(this.a.d()).b(this.a.c()).a(i2).b(j));
    }

    private jqs a(jqu jqu) {
        bxn bxn = (bxn) this.a.g().get(0);
        String str = "Babel_ConvService";
        String str2 = "Start uploading media attachment URL -- ";
        String valueOf = String.valueOf(bxn.a);
        if (valueOf.length() != 0) {
            valueOf = str2.concat(valueOf);
        } else {
            valueOf = new String(str2);
        }
        glk.c(str, valueOf, new Object[0]);
        try {
            return jqu.a(new jrm().a(Uri.parse(bxn.a)).a(bxn.d).b("new.temporary").c("hangout_staging").a(true).b(false).a());
        } catch (Exception e) {
            throw new fdo(122, e);
        } catch (Exception e2) {
            throw new fdo(114, e2, 0, false, "media changed");
        } catch (Exception e22) {
            throw new fdo(114, e22, 0, false, "media unavailable");
        } catch (Exception e3) {
            throw new fdo(114, e3);
        } catch (Exception e222) {
            throw new fdo(102, e222, 0, false, "connectivity constraint");
        } catch (Exception e32) {
            throw new fdo(104, e32);
        } catch (Exception e2222) {
            throw new fdo(114, e2222, 0, false, "invalid content uri");
        } catch (Exception e22222) {
            throw new fdo(114, e22222, 0, false, "invalid content type");
        } catch (Exception e222222) {
            throw new fdo(122, e222222, 0, false, "restart; retriable");
        } catch (Exception e2222222) {
            throw new fdo(121, e2222222, 0, false, "abort");
        }
    }

    public void a_(Context context, int i, fdo fdo) {
        bko e = fde.e(i);
        if (e != null) {
            if (((bxn) this.a.g().get(0)).c == bxo.VIDEO) {
                a(i, 553, (long) fdo.c());
            } else {
                a(i, (int) HttpStatusCodes.STATUS_CODE_SERVICE_UNAVAILABLE, (long) fdo.c());
            }
            RealTimeChatService.a(e, this.a.d(), this.a.c(), fdo != null ? fdo.c() : 0);
            ((ect) jyn.a(context, ect.class)).d(e.g(), true);
            if (!(fdo == null || fdo.c() == 0)) {
                gwb.a(e, 1523);
                ba.a(e.g(), glj.b(), 5, ba.c().a(fdo.c()).b(this.a.c()).a(this.a.d()));
            }
            if (fdo.c() != 121) {
                coy.a(context);
            }
        } else if (glk.a("Babel_ConvService", 3)) {
            glk.a("Babel_ConvService", "Skipping request failure for invalid account: " + i, new Object[0]);
        }
    }

    public boolean d() {
        return true;
    }

    public boolean a(String str) {
        return str.startsWith(this.a.c());
    }

    public boolean a(ead ead) {
        return false;
    }

    public String toString() {
        String str = "PlusPhotoNetworkRequest ";
        String valueOf = String.valueOf(this.a.toString());
        return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
    }

    public boolean a(Context context, eaf eaf, fdo fdo) {
        if (fdo.c() == 101 || fdo.c() == 102 || fdo.c() == 103) {
            return true;
        }
        int a = ((biw) jyn.a(context, biw.class)).a("babel_max_upload_error_retries", 10);
        switch (fdo.c()) {
            case 102:
                return true;
            case 104:
                return false;
            case 114:
                return false;
            case 122:
                return eaf.c() < a;
            default:
                glk.d("Babel_ConvService", "Default no retry on BabelClientError: " + fdo.c(), new Object[0]);
                return false;
        }
    }

    public void f() {
        if (this.b != null) {
            this.b.a();
        }
    }

    public List<bhc> e() {
        List<bhc> arrayList = new ArrayList();
        arrayList.add(new bhc(this.a.c()));
        return arrayList;
    }
}

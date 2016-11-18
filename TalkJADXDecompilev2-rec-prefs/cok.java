package p000;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import com.google.api.client.http.HttpStatusCodes;
import java.util.ArrayList;
import java.util.List;

public final class cok implements ead {
    private static final boolean f5831c = false;
    public final col f5832a;
    transient jqu f5833b;

    static {
        kae kae = glk.f15565l;
    }

    public cok(col col) {
        this.f5832a = col;
    }

    public String K_() {
        return "photo_queue";
    }

    public long mo1017b() {
        return Long.MAX_VALUE;
    }

    public boolean mo1018c() {
        return true;
    }

    public void mo1007a(Context context, eaf eaf) {
        List g = this.f5832a.m8184g();
        if (g.isEmpty()) {
            throw new fdo(114, "no attachment found");
        }
        bxn bxn = (bxn) g.get(0);
        if (bxn.f4741c != bxo.PHOTO && bxn.f4741c != bxo.VIDEO) {
            String valueOf = String.valueOf(bxn.f4741c);
            throw new fdo(114, new StringBuilder(String.valueOf(valueOf).length() + 57).append("only allow photo or video, unsupported attachment format ").append(valueOf).toString());
        } else if (bxn instanceof bxy) {
            bxy bxy = (bxy) bxn;
            int b = eaf.m13268b();
            blo blo = new blo(context, b);
            if (bxn.f4741c == bxo.VIDEO) {
                m8167a(b, 551, bxy.f4761j);
            } else {
                m8167a(b, 501, bxy.f4761j);
            }
            bko e = fde.m15018e(b);
            if (e == null) {
                throw new fdo(114, "null account");
            }
            jqs a = m8166a(new jqv(context).m25030a(e.m5629a()).m25033b(e.m5632b().f11244a).m25031a(new jqw(this, blo)).m25032a(jrk.STANDARD).m25029a());
            if (TextUtils.isEmpty(a.m25013b())) {
                throw new fdo(122, "empty photo id in the upload response");
            }
            if (bxn.f4741c == bxo.VIDEO) {
                m8167a(b, 552, a.m25014c());
            } else {
                m8167a(b, (int) HttpStatusCodes.STATUS_CODE_BAD_GATEWAY, a.m25014c());
            }
            if (f5831c) {
                String str = "uploading completed. Public URL: ";
                String valueOf2 = String.valueOf(a.m25012a());
                if (valueOf2.length() != 0) {
                    str.concat(valueOf2);
                } else {
                    valueOf2 = new String(str);
                }
            }
            if (blo.m6090n(this.f5832a.m8181d(), this.f5832a.m8180c()) == fwx.PENDING_DELETE) {
                blo.m5936a("conversation_id=? AND message_id=?", new String[]{this.f5832a.m8181d(), this.f5832a.m8180c()});
                return;
            }
            fdn e2 = fde.m15019e(e);
            fok a2 = m8165a(a);
            if (bxn.f4741c == bxo.VIDEO) {
                blo.m5992a(this.f5832a.m8181d(), this.f5832a.m8180c(), fwx.AWAIT_READY, 0);
                m8167a(b, 554, (long) bxy.f4760i);
                e2.m15078a(new cnv(a.m25016e(), a.m25013b(), a2), this.f5832a.L_());
                return;
            }
            e2.m15078a(a2, this.f5832a.L_());
        } else {
            throw new fdo(114, "only photo or video must be MediaAttachment");
        }
    }

    private cpa m8165a(jqs jqs) {
        List arrayList = new ArrayList();
        bye bye = new bye();
        bye.c = bxo.PLUS_PHOTO;
        bye.f4764f = jqs.m25013b();
        bye.f4765g = jqs.m25015d();
        bye.f4766h = jqs.m25012a();
        arrayList.add(bye);
        cpa a = new cpb(this.f5832a.m8180c(), this.f5832a.m8181d()).m10609a(this.f5832a.m8182e()).m10608a(this.f5832a.m8186i()).m10611a(this.f5832a.m8187j()).m10615b(this.f5832a.m8188k()).m10613b(this.f5832a.m8190m()).m10607a(this.f5832a.m8189l()).m10612b(this.f5832a.m8191n()).m10610a(this.f5832a.m8183f()).m10614b(arrayList).m10606a();
        a.mo1023b(this.f5832a.L_());
        return a;
    }

    private void m8167a(int i, int i2, long j) {
        ba.m4548a(i, glj.m17963b(), 10, ba.m4618c().m12789a(this.f5832a.m8181d()).m12794b(this.f5832a.m8180c()).m12786a(i2).m12793b(j));
    }

    private jqs m8166a(jqu jqu) {
        bxn bxn = (bxn) this.f5832a.m8184g().get(0);
        String str = "Babel_ConvService";
        String str2 = "Start uploading media attachment URL -- ";
        String valueOf = String.valueOf(bxn.f4739a);
        if (valueOf.length() != 0) {
            valueOf = str2.concat(valueOf);
        } else {
            valueOf = new String(str2);
        }
        glk.m17979c(str, valueOf, new Object[0]);
        try {
            return jqu.m25027a(new jrm().m25083a(Uri.parse(bxn.f4739a)).m25084a(bxn.f4742d).m25086b("new.temporary").m25088c("hangout_staging").m25085a(true).m25087b(false).m25082a());
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
        bko e = fde.m15018e(i);
        if (e != null) {
            if (((bxn) this.f5832a.m8184g().get(0)).f4741c == bxo.VIDEO) {
                m8167a(i, 553, (long) fdo.m15084c());
            } else {
                m8167a(i, (int) HttpStatusCodes.STATUS_CODE_SERVICE_UNAVAILABLE, (long) fdo.m15084c());
            }
            RealTimeChatService.m9022a(e, this.f5832a.m8181d(), this.f5832a.m8180c(), fdo != null ? fdo.m15084c() : 0);
            ((ect) jyn.m25426a(context, ect.class)).mo1838d(e.m5638g(), true);
            if (!(fdo == null || fdo.m15084c() == 0)) {
                gwb.m1823a(e, 1523);
                ba.m4548a(e.m5638g(), glj.m17963b(), 5, ba.m4618c().m12786a(fdo.m15084c()).m12794b(this.f5832a.m8180c()).m12789a(this.f5832a.m8181d()));
            }
            if (fdo.m15084c() != 121) {
                coy.m10594a(context);
            }
        } else if (glk.m17973a("Babel_ConvService", 3)) {
            glk.m17970a("Babel_ConvService", "Skipping request failure for invalid account: " + i, new Object[0]);
        }
    }

    public boolean mo1019d() {
        return true;
    }

    public boolean mo1016a(String str) {
        return str.startsWith(this.f5832a.m8180c());
    }

    public boolean mo1015a(ead ead) {
        return false;
    }

    public String toString() {
        String str = "PlusPhotoNetworkRequest ";
        String valueOf = String.valueOf(this.f5832a.toString());
        return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
    }

    public boolean mo1008a(Context context, eaf eaf, fdo fdo) {
        if (fdo.m15084c() == 101 || fdo.m15084c() == 102 || fdo.m15084c() == 103) {
            return true;
        }
        int a = ((biw) jyn.m25426a(context, biw.class)).mo560a("babel_max_upload_error_retries", 10);
        switch (fdo.m15084c()) {
            case 102:
                return true;
            case 104:
                return false;
            case 114:
                return false;
            case 122:
                return eaf.m13269c() < a;
            default:
                glk.m17981d("Babel_ConvService", "Default no retry on BabelClientError: " + fdo.m15084c(), new Object[0]);
                return false;
        }
    }

    public void mo1011f() {
        if (this.f5833b != null) {
            this.f5833b.m25028a();
        }
    }

    public List<bhc> mo1010e() {
        List<bhc> arrayList = new ArrayList();
        arrayList.add(new bhc(this.f5832a.m8180c()));
        return arrayList;
    }
}

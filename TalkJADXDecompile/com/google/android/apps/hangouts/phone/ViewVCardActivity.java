package com.google.android.apps.hangouts.phone;

import ajq;
import ajr;
import ajv;
import ajz;
import akc;
import akd;
import ake;
import akg;
import akj;
import akk;
import akm;
import akn;
import akv;
import alb;
import android.content.ContentResolver;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.provider.ContactsContract.CommonDataKinds.Email;
import android.provider.ContactsContract.CommonDataKinds.Im;
import android.provider.ContactsContract.CommonDataKinds.Organization;
import android.provider.ContactsContract.CommonDataKinds.Phone;
import android.text.TextUtils;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.Toast;
import ba;
import bc;
import com.google.android.apps.hangouts.content.EsProvider;
import daq;
import dek;
import epl;
import epm;
import epn;
import epp;
import glk;
import gwb;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import jca;
import jcu;
import kae;
import ky;

public class ViewVCardActivity extends dek {
    private static final boolean v;
    public final jca n;
    public boolean o;
    public Uri p;
    public List<Map<String, ?>> r;
    public List<List<Map<String, ?>>> s;
    public ExpandableListView t;
    public Handler u;
    private Uri w;
    private final OnChildClickListener x;

    public ViewVCardActivity() {
        this.n = new jcu(this, this.F).a(this.E);
        this.r = new ArrayList();
        this.s = new ArrayList();
        this.u = new epp(this);
        this.x = new epl(this);
    }

    static {
        kae kae = glk.k;
        v = false;
    }

    public void onCreate(Bundle bundle) {
        String valueOf;
        super.onCreate(bundle);
        setContentView(gwb.hE);
        View findViewById = findViewById(ba.bd);
        this.t = (ExpandableListView) findViewById(ba.cU);
        this.t.setEmptyView(findViewById);
        this.t.setFocusable(true);
        this.t.setOnChildClickListener(this.x);
        Intent intent = getIntent();
        String valueOf2 = String.valueOf(intent);
        a(new StringBuilder(String.valueOf(valueOf2).length() + 10).append("intent is ").append(valueOf2).toString());
        this.w = intent.getData();
        try {
            if (this.w != null) {
                valueOf2 = "mUri is ";
                valueOf = String.valueOf(this.w.toString());
                a(valueOf.length() != 0 ? valueOf2.concat(valueOf) : new String(valueOf2));
                new Thread(new epn(this, this.w)).start();
                g().b(true);
            }
            j();
            g().b(true);
        } catch (Exception e) {
            valueOf = String.valueOf(e);
            a(new StringBuilder(String.valueOf(valueOf).length() + 19).append("onCreate Exception ").append(valueOf).toString());
        }
    }

    public void j() {
        Toast.makeText(this, bc.ub, 0).show();
        finish();
    }

    public void a(ajr ajr, List<Map<String, ?>> list, List<List<Map<String, ?>>> list2) {
        CharSequence charSequence;
        Resources resources = getResources();
        ky kyVar = new ky();
        list.add(kyVar);
        Object b = ajr.b();
        if (b == null) {
            ajr.a();
            b = ajr.b();
        }
        kyVar.put("data", b);
        String str = "name: ";
        String valueOf = String.valueOf(b);
        a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        List arrayList = new ArrayList();
        List<ake> list3 = ajr.a;
        if (list3 != null) {
            for (ake ake : list3) {
                String str2 = "phone.data is ";
                str = String.valueOf(ake.b());
                a(str.length() != 0 ? str2.concat(str) : new String(str2));
                a("phone.type is " + ake.c());
                str2 = "phone.label is ";
                str = String.valueOf(ake.d());
                a(str.length() != 0 ? str2.concat(str) : new String(str2));
                kyVar = new ky();
                arrayList.add(kyVar);
                kyVar.put("data", ake.b());
                try {
                    b = Phone.getTypeLabel(resources, ake.c(), ake.d()).toString();
                } catch (NotFoundException e) {
                    valueOf = String.valueOf(e);
                    a(new StringBuilder(String.valueOf(valueOf).length() + 36).append("createContactItem NotFoundException:").append(valueOf).toString());
                    b = resources.getStringArray(17235971)[6];
                } catch (Exception e2) {
                    valueOf = String.valueOf(e2);
                    a(new StringBuilder(String.valueOf(valueOf).length() + 34).append("createContactItem phone Exception:").append(valueOf).toString());
                    b = resources.getStringArray(17235971)[6];
                }
                kyVar.put("type", b);
            }
        }
        List<ajv> list4 = ajr.b;
        if (list4 != null) {
            for (ajv ajv : list4) {
                str2 = "email.type is ";
                str = String.valueOf(ajv.d());
                a(str.length() != 0 ? str2.concat(str) : new String(str2));
                str2 = "email.data is ";
                str = String.valueOf(ajv.b());
                a(str.length() != 0 ? str2.concat(str) : new String(str2));
                str2 = "email.auxdata is ";
                str = String.valueOf(ajv.d());
                a(str.length() != 0 ? str2.concat(str) : new String(str2));
                kyVar = new ky();
                arrayList.add(kyVar);
                kyVar.put("data", ajv.b());
                try {
                    b = Email.getTypeLabel(resources, ajv.c(), ajv.d()).toString();
                } catch (NotFoundException e3) {
                    b = resources.getStringArray(17235968)[2];
                } catch (Exception e22) {
                    valueOf = String.valueOf(e22);
                    a(new StringBuilder(String.valueOf(valueOf).length() + 34).append("createContactItem email Exception:").append(valueOf).toString());
                    b = resources.getStringArray(17235968)[2];
                }
                kyVar.put("type", b);
            }
        }
        List<akg> list5 = ajr.c;
        if (list5 != null) {
            for (akg akg : list5) {
                a("Postal.type is " + akg.i());
                str2 = "Postal.data is ";
                str = String.valueOf(akg.h());
                a(str.length() != 0 ? str2.concat(str) : new String(str2));
                str2 = "Postal.auxdata is ";
                str = String.valueOf(akg.j());
                if (str.length() != 0) {
                    str = str2.concat(str);
                } else {
                    str = new String(str2);
                }
                a(str);
                kyVar = new ky();
                arrayList.add(kyVar);
                StringBuilder stringBuilder = new StringBuilder();
                Object b2 = akg.b();
                if (!TextUtils.isEmpty(b2)) {
                    stringBuilder.append(b2).append(" ");
                }
                b2 = akg.c();
                if (!TextUtils.isEmpty(b2)) {
                    stringBuilder.append(b2).append(" ");
                }
                b2 = akg.d();
                if (!TextUtils.isEmpty(b2)) {
                    stringBuilder.append(b2).append(" ");
                }
                b2 = akg.e();
                if (!TextUtils.isEmpty(b2)) {
                    stringBuilder.append(b2).append(" ");
                }
                b2 = akg.f();
                if (!TextUtils.isEmpty(b2)) {
                    stringBuilder.append(b2).append(" ");
                }
                b2 = akg.g();
                if (!TextUtils.isEmpty(b2)) {
                    stringBuilder.append(b2).append(" ");
                }
                b2 = akg.h();
                if (!TextUtils.isEmpty(b2)) {
                    stringBuilder.append(b2);
                }
                kyVar.put("data", stringBuilder.toString());
                try {
                    b = resources.getStringArray(17235972)[akg.i() - 1];
                } catch (NotFoundException e4) {
                    b = resources.getStringArray(17235972)[2];
                } catch (Exception e222) {
                    valueOf = String.valueOf(e222);
                    a(new StringBuilder(String.valueOf(valueOf).length() + 35).append("createContactItem postal Exception:").append(valueOf).toString());
                    b = resources.getStringArray(17235972)[2];
                }
                kyVar.put("type", b);
            }
        }
        List<ajz> list6 = ajr.e;
        if (list6 != null) {
            for (ajz ajz : list6) {
                a("im.type is " + ajz.c());
                str2 = "im.data is ";
                str = String.valueOf(ajz.b());
                a(str.length() != 0 ? str2.concat(str) : new String(str2));
                kyVar = new ky();
                arrayList.add(kyVar);
                kyVar.put("data", ajz.b());
                try {
                    b = resources.getString(Im.getProtocolLabelResource(ajz.c()));
                } catch (NotFoundException e5) {
                    b = getString(bc.ic);
                } catch (Exception e2222) {
                    valueOf = String.valueOf(e2222);
                    a(new StringBuilder(String.valueOf(valueOf).length() + 31).append("createContactItem IM Exception:").append(valueOf).toString());
                    b = getString(bc.ic);
                }
                kyVar.put("type", b);
            }
        }
        List<akd> list7 = ajr.d;
        if (list7 != null) {
            for (akd akd : list7) {
                str2 = "Organization.Organization is ";
                str = String.valueOf(akd.c());
                if (str.length() != 0) {
                    str = str2.concat(str);
                } else {
                    str = new String(str2);
                }
                a(str);
                a("Organization.type is " + akd.e());
                ky kyVar2 = new ky();
                arrayList.add(kyVar2);
                str = akd.d();
                String str3 = "data";
                int i = bc.tN;
                Object[] objArr = new Object[2];
                objArr[0] = akd.c();
                if (str == null) {
                    str = "";
                }
                objArr[1] = str;
                kyVar2.put(str3, resources.getString(i, objArr));
                try {
                    b = resources.getString(Organization.getTypeLabelResource(akd.e()));
                } catch (NotFoundException e6) {
                    b = resources.getStringArray(17235970)[1];
                } catch (Exception e22222) {
                    valueOf = String.valueOf(e22222);
                    a(new StringBuilder(String.valueOf(valueOf).length() + 41).append("createContactItem Organization Exception:").append(valueOf).toString());
                    b = resources.getStringArray(17235970)[1];
                }
                kyVar2.put("type", b);
            }
        }
        List<akj> list8 = ajr.f;
        if (list8 != null) {
            for (akj akj : list8) {
                String valueOf2 = String.valueOf(akj);
                a(new StringBuilder(String.valueOf(valueOf2).length() + 11).append("website is ").append(valueOf2).toString());
                if (akj != null && TextUtils.isGraphic(akj.b())) {
                    ky kyVar3 = new ky();
                    arrayList.add(kyVar3);
                    kyVar3.put("data", akj.b());
                    kyVar3.put("type", getString(bc.uy));
                }
            }
        }
        if (ajr.h != null) {
            charSequence = ajr.h.a;
        } else {
            charSequence = null;
        }
        if (charSequence != null) {
            kyVar = new ky();
            if (TextUtils.isGraphic(charSequence)) {
                arrayList.add(kyVar);
                kyVar.put("data", charSequence);
                kyVar.put("type", getString(bc.cM));
            }
        }
        List<akc> list9 = ajr.g;
        if (list9 != null) {
            for (akc akc : list9) {
                if (TextUtils.isGraphic(akc.b())) {
                    kyVar3 = new ky();
                    arrayList.add(kyVar3);
                    kyVar3.put("data", akc.b());
                    kyVar3.put("type", getString(bc.fI));
                }
            }
        }
        list2.add(arrayList);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 0, 0, bc.ft).setShowAsAction(1);
        return true;
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        super.onPrepareOptionsMenu(menu);
        if (this.o) {
            menu.findItem(0).setVisible(true);
        } else {
            menu.findItem(0).setVisible(false);
        }
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 0) {
            String valueOf = String.valueOf(this.w);
            a(new StringBuilder(String.valueOf(valueOf).length() + 12).append("save vcard: ").append(valueOf).toString());
            if (this.w != null && this.n.b()) {
                new epm(this).execute(new Uri[]{this.p});
            }
        } else if (menuItem.getItemId() == 16908332) {
            onBackPressed();
        }
        return true;
    }

    public Uri c(int i) {
        Throwable e;
        Uri a = EsProvider.a(i, Math.abs(daq.bG.nextLong()));
        OutputStream openOutputStream;
        InputStream openInputStream;
        try {
            ContentResolver contentResolver = getContentResolver();
            openOutputStream = contentResolver.openOutputStream(a);
            try {
                openInputStream = contentResolver.openInputStream(this.w);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = openInputStream.read(bArr, 0, 1024);
                        if (read == -1) {
                            break;
                        }
                        openOutputStream.write(bArr, 0, read);
                    }
                    openOutputStream.flush();
                    if (openInputStream != null) {
                        try {
                            openInputStream.close();
                        } catch (Throwable e2) {
                            glk.d("Babel", "IOException caught while closing stream", e2);
                        }
                    }
                    if (openOutputStream == null) {
                        return a;
                    }
                    try {
                        openOutputStream.close();
                        return a;
                    } catch (Throwable e22) {
                        glk.d("Babel", "IOException caught while closing stream", e22);
                        return a;
                    }
                } catch (IOException e3) {
                    e = e3;
                    try {
                        glk.d("Babel", "IOException saving location image", e);
                        if (openInputStream != null) {
                            try {
                                openInputStream.close();
                            } catch (Throwable e4) {
                                glk.d("Babel", "IOException caught while closing stream", e4);
                            }
                        }
                        if (openOutputStream != null) {
                            try {
                                openOutputStream.close();
                            } catch (Throwable e42) {
                                glk.d("Babel", "IOException caught while closing stream", e42);
                            }
                        }
                        return null;
                    } catch (Throwable th) {
                        e42 = th;
                        if (openInputStream != null) {
                            try {
                                openInputStream.close();
                            } catch (Throwable e222) {
                                glk.d("Babel", "IOException caught while closing stream", e222);
                            }
                        }
                        if (openOutputStream != null) {
                            try {
                                openOutputStream.close();
                            } catch (Throwable e2222) {
                                glk.d("Babel", "IOException caught while closing stream", e2222);
                            }
                        }
                        throw e42;
                    }
                }
            } catch (IOException e5) {
                e42 = e5;
                openInputStream = null;
                glk.d("Babel", "IOException saving location image", e42);
                if (openInputStream != null) {
                    openInputStream.close();
                }
                if (openOutputStream != null) {
                    openOutputStream.close();
                }
                return null;
            } catch (Throwable th2) {
                e42 = th2;
                openInputStream = null;
                if (openInputStream != null) {
                    openInputStream.close();
                }
                if (openOutputStream != null) {
                    openOutputStream.close();
                }
                throw e42;
            }
        } catch (IOException e6) {
            e42 = e6;
            openOutputStream = null;
            openInputStream = null;
            glk.d("Babel", "IOException saving location image", e42);
            if (openInputStream != null) {
                openInputStream.close();
            }
            if (openOutputStream != null) {
                openOutputStream.close();
            }
            return null;
        } catch (Throwable th3) {
            e42 = th3;
            openOutputStream = null;
            openInputStream = null;
            if (openInputStream != null) {
                openInputStream.close();
            }
            if (openOutputStream != null) {
                openOutputStream.close();
            }
            throw e42;
        }
    }

    public void a(Uri uri, akv akv) {
        int c = akv.c();
        if (c == 0) {
            c = ajq.a(getString(bc.ag));
        }
        akn akk = new akk(c, null);
        akk.a(new akm(this, this.u));
        try {
            a(uri, c, akk, false, null);
        } catch (alb e) {
            Log.e("Babel", "Never reach here.");
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(android.net.Uri r8, int r9, akn r10, boolean r11, java.util.List<java.lang.String> r12) {
        /*
        r7 = this;
        r2 = 0;
        r4 = r7.getContentResolver();
        r3 = r4.openInputStream(r8);	 Catch:{ IOException -> 0x0024, alc -> 0x0076, akz -> 0x0090 }
        r1 = new aks;	 Catch:{ IOException -> 0x0024, alc -> 0x0076, akz -> 0x0090 }
        r1.<init>(r9);	 Catch:{ IOException -> 0x0024, alc -> 0x0076, akz -> 0x0090 }
        r1.a(r10);	 Catch:{ IOException -> 0x0024, alc -> 0x0076, akz -> 0x0090 }
        r1.a(r3);	 Catch:{ ald -> 0x0049 }
        if (r3 == 0) goto L_0x0019;
    L_0x0016:
        r3.close();	 Catch:{ IOException -> 0x001b, alc -> 0x0076, akz -> 0x0090 }
    L_0x0019:
        r1 = 1;
    L_0x001a:
        return r1;
    L_0x001b:
        r1 = move-exception;
        r3 = "Babel";
        r4 = "";
        android.util.Log.e(r3, r4, r1);	 Catch:{ IOException -> 0x0024, alc -> 0x0076, akz -> 0x0090 }
        goto L_0x0019;
    L_0x0024:
        r1 = move-exception;
        r3 = "Babel";
        r4 = "IOException was emitted: ";
        r1 = r1.getMessage();
        r1 = java.lang.String.valueOf(r1);
        r5 = r1.length();
        if (r5 == 0) goto L_0x00af;
    L_0x0037:
        r1 = r4.concat(r1);
    L_0x003b:
        android.util.Log.e(r3, r1);
        if (r12 == 0) goto L_0x0047;
    L_0x0040:
        r1 = r8.toString();
        r12.add(r1);
    L_0x0047:
        r1 = r2;
        goto L_0x001a;
    L_0x0049:
        r1 = move-exception;
        r3.close();	 Catch:{ IOException -> 0x0080 }
    L_0x004d:
        r1 = r10 instanceof akk;	 Catch:{ all -> 0x0089 }
        if (r1 == 0) goto L_0x0058;
    L_0x0051:
        r0 = r10;
        r0 = (akk) r0;	 Catch:{ all -> 0x0089 }
        r1 = r0;
        r1.c();	 Catch:{ all -> 0x0089 }
    L_0x0058:
        r3 = r4.openInputStream(r8);	 Catch:{ all -> 0x0089 }
        r1 = new akt;	 Catch:{ ald -> 0x009d }
        r1.<init>(r9);	 Catch:{ ald -> 0x009d }
        r1.a(r10);	 Catch:{ ald -> 0x009d }
        r1.a(r3);	 Catch:{ ald -> 0x009d }
        if (r3 == 0) goto L_0x0019;
    L_0x0069:
        r3.close();	 Catch:{ IOException -> 0x006d, alc -> 0x0076, akz -> 0x0090 }
        goto L_0x0019;
    L_0x006d:
        r1 = move-exception;
        r3 = "Babel";
        r4 = "";
        android.util.Log.e(r3, r4, r1);	 Catch:{ IOException -> 0x0024, alc -> 0x0076, akz -> 0x0090 }
        goto L_0x0019;
    L_0x0076:
        r1 = move-exception;
        r3 = r1 instanceof alb;
        if (r3 == 0) goto L_0x00b5;
    L_0x007b:
        if (r11 == 0) goto L_0x00b5;
    L_0x007d:
        r1 = (alb) r1;
        throw r1;
    L_0x0080:
        r1 = move-exception;
        r5 = "Babel";
        r6 = "";
        android.util.Log.e(r5, r6, r1);	 Catch:{ all -> 0x0089 }
        goto L_0x004d;
    L_0x0089:
        r1 = move-exception;
        if (r3 == 0) goto L_0x008f;
    L_0x008c:
        r3.close();	 Catch:{ IOException -> 0x00a6, alc -> 0x0076, akz -> 0x0090 }
    L_0x008f:
        throw r1;	 Catch:{ IOException -> 0x0024, alc -> 0x0076, akz -> 0x0090 }
    L_0x0090:
        r1 = move-exception;
        if (r12 == 0) goto L_0x009a;
    L_0x0093:
        r1 = r8.toString();
        r12.add(r1);
    L_0x009a:
        r1 = r2;
        goto L_0x001a;
    L_0x009d:
        r1 = move-exception;
        r1 = new akz;	 Catch:{ all -> 0x0089 }
        r4 = "vCard with unspported version.";
        r1.<init>(r4);	 Catch:{ all -> 0x0089 }
        throw r1;	 Catch:{ all -> 0x0089 }
    L_0x00a6:
        r3 = move-exception;
        r4 = "Babel";
        r5 = "";
        android.util.Log.e(r4, r5, r3);	 Catch:{ IOException -> 0x0024, alc -> 0x0076, akz -> 0x0090 }
        goto L_0x008f;
    L_0x00af:
        r1 = new java.lang.String;
        r1.<init>(r4);
        goto L_0x003b;
    L_0x00b5:
        if (r12 == 0) goto L_0x00be;
    L_0x00b7:
        r1 = r8.toString();
        r12.add(r1);
    L_0x00be:
        r1 = r2;
        goto L_0x001a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.hangouts.phone.ViewVCardActivity.a(android.net.Uri, int, akn, boolean, java.util.List):boolean");
    }

    public static void a(String str) {
        if (v) {
            String str2 = "[ViewVCardActivity]: ";
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                valueOf = new String(str2);
            }
        }
    }
}

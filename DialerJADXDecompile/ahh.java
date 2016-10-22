import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.res.XmlResourceParser;
import android.text.TextUtils;
import android.util.Log;
import java.util.List;

/* compiled from: PG */
public final class ahh extends agf {
    private static final String[] k;
    public boolean j;
    private String l;
    private String m;
    private String n;
    private String o;
    private List p;
    private String q;
    private String r;
    private boolean s;

    static {
        k = new String[]{"android.provider.ALTERNATE_CONTACTS_STRUCTURE", "android.provider.CONTACTS_STRUCTURE"};
    }

    public ahh(Context context, String str, boolean z) {
        this(context, str, z, null);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private ahh(android.content.Context r11, java.lang.String r12, boolean r13, android.content.res.XmlResourceParser r14) {
        /*
        r10 = this;
        r10.<init>();
        r10.c = r12;
        r10.d = r12;
        r3 = b(r11, r12);
        r1 = 1;
        if (r3 == 0) goto L_0x01f6;
    L_0x000e:
        r4 = android.util.Xml.asAttributeSet(r3);	 Catch:{ afx -> 0x0030 }
    L_0x0012:
        r0 = r3.next();	 Catch:{ XmlPullParserException -> 0x0027, IOException -> 0x0090 }
        r2 = 2;
        if (r0 == r2) goto L_0x001c;
    L_0x0019:
        r2 = 1;
        if (r0 != r2) goto L_0x0012;
    L_0x001c:
        r2 = 2;
        if (r0 == r2) goto L_0x0062;
    L_0x001f:
        r0 = new java.lang.IllegalStateException;	 Catch:{ XmlPullParserException -> 0x0027, IOException -> 0x0090 }
        r2 = "No start tag found";
        r0.<init>(r2);	 Catch:{ XmlPullParserException -> 0x0027, IOException -> 0x0090 }
        throw r0;	 Catch:{ XmlPullParserException -> 0x0027, IOException -> 0x0090 }
    L_0x0027:
        r0 = move-exception;
        r2 = new afx;	 Catch:{ afx -> 0x0030 }
        r4 = "Problem reading XML";
        r2.<init>(r4, r0);	 Catch:{ afx -> 0x0030 }
        throw r2;	 Catch:{ afx -> 0x0030 }
    L_0x0030:
        r0 = move-exception;
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0099 }
        r2.<init>();	 Catch:{ all -> 0x0099 }
        r4 = "Problem reading XML";
        r2.append(r4);	 Catch:{ all -> 0x0099 }
        if (r1 == 0) goto L_0x004b;
    L_0x003d:
        if (r3 == 0) goto L_0x004b;
    L_0x003f:
        r1 = " in line ";
        r2.append(r1);	 Catch:{ all -> 0x0099 }
        r1 = r3.getLineNumber();	 Catch:{ all -> 0x0099 }
        r2.append(r1);	 Catch:{ all -> 0x0099 }
    L_0x004b:
        r1 = " for external package ";
        r2.append(r1);	 Catch:{ all -> 0x0099 }
        r2.append(r12);	 Catch:{ all -> 0x0099 }
        r1 = "ExternalAccountType";
        r2 = r2.toString();	 Catch:{ all -> 0x0099 }
        android.util.Log.e(r1, r2, r0);	 Catch:{ all -> 0x0099 }
        if (r3 == 0) goto L_0x0061;
    L_0x005e:
        r3.close();
    L_0x0061:
        return;
    L_0x0062:
        r0 = r3.getName();	 Catch:{ XmlPullParserException -> 0x0027, IOException -> 0x0090 }
        r2 = "ContactsAccountType";
        r2 = r2.equals(r0);	 Catch:{ XmlPullParserException -> 0x0027, IOException -> 0x0090 }
        if (r2 != 0) goto L_0x00a6;
    L_0x006e:
        r2 = "ContactsSource";
        r2 = r2.equals(r0);	 Catch:{ XmlPullParserException -> 0x0027, IOException -> 0x0090 }
        if (r2 != 0) goto L_0x00a6;
    L_0x0076:
        r2 = new java.lang.IllegalStateException;	 Catch:{ XmlPullParserException -> 0x0027, IOException -> 0x0090 }
        r4 = "Top level element must be ContactsAccountType, not ";
        r4 = java.lang.String.valueOf(r4);	 Catch:{ XmlPullParserException -> 0x0027, IOException -> 0x0090 }
        r0 = java.lang.String.valueOf(r0);	 Catch:{ XmlPullParserException -> 0x0027, IOException -> 0x0090 }
        r5 = r0.length();	 Catch:{ XmlPullParserException -> 0x0027, IOException -> 0x0090 }
        if (r5 == 0) goto L_0x00a0;
    L_0x0088:
        r0 = r4.concat(r0);	 Catch:{ XmlPullParserException -> 0x0027, IOException -> 0x0090 }
    L_0x008c:
        r2.<init>(r0);	 Catch:{ XmlPullParserException -> 0x0027, IOException -> 0x0090 }
        throw r2;	 Catch:{ XmlPullParserException -> 0x0027, IOException -> 0x0090 }
    L_0x0090:
        r0 = move-exception;
        r2 = new afx;	 Catch:{ afx -> 0x0030 }
        r4 = "Problem reading XML";
        r2.<init>(r4, r0);	 Catch:{ afx -> 0x0030 }
        throw r2;	 Catch:{ afx -> 0x0030 }
    L_0x0099:
        r0 = move-exception;
        if (r3 == 0) goto L_0x009f;
    L_0x009c:
        r3.close();
    L_0x009f:
        throw r0;
    L_0x00a0:
        r0 = new java.lang.String;	 Catch:{ XmlPullParserException -> 0x0027, IOException -> 0x0090 }
        r0.<init>(r4);	 Catch:{ XmlPullParserException -> 0x0027, IOException -> 0x0090 }
        goto L_0x008c;
    L_0x00a6:
        r0 = 1;
        r10.j = r0;	 Catch:{ XmlPullParserException -> 0x0027, IOException -> 0x0090 }
        r5 = r3.getAttributeCount();	 Catch:{ XmlPullParserException -> 0x0027, IOException -> 0x0090 }
        r0 = 0;
        r2 = r0;
    L_0x00af:
        if (r2 >= r5) goto L_0x0184;
    L_0x00b1:
        r0 = r3.getAttributeName(r2);	 Catch:{ XmlPullParserException -> 0x0027, IOException -> 0x0090 }
        r6 = r3.getAttributeValue(r2);	 Catch:{ XmlPullParserException -> 0x0027, IOException -> 0x0090 }
        r7 = "ExternalAccountType";
        r8 = 3;
        r7 = android.util.Log.isLoggable(r7, r8);	 Catch:{ XmlPullParserException -> 0x0027, IOException -> 0x0090 }
        if (r7 == 0) goto L_0x00e7;
    L_0x00c2:
        r7 = new java.lang.StringBuilder;	 Catch:{ XmlPullParserException -> 0x0027, IOException -> 0x0090 }
        r8 = java.lang.String.valueOf(r0);	 Catch:{ XmlPullParserException -> 0x0027, IOException -> 0x0090 }
        r8 = r8.length();	 Catch:{ XmlPullParserException -> 0x0027, IOException -> 0x0090 }
        r8 = r8 + 1;
        r9 = java.lang.String.valueOf(r6);	 Catch:{ XmlPullParserException -> 0x0027, IOException -> 0x0090 }
        r9 = r9.length();	 Catch:{ XmlPullParserException -> 0x0027, IOException -> 0x0090 }
        r8 = r8 + r9;
        r7.<init>(r8);	 Catch:{ XmlPullParserException -> 0x0027, IOException -> 0x0090 }
        r7 = r7.append(r0);	 Catch:{ XmlPullParserException -> 0x0027, IOException -> 0x0090 }
        r8 = "=";
        r7 = r7.append(r8);	 Catch:{ XmlPullParserException -> 0x0027, IOException -> 0x0090 }
        r7.append(r6);	 Catch:{ XmlPullParserException -> 0x0027, IOException -> 0x0090 }
    L_0x00e7:
        r7 = "editContactActivity";
        r7 = r7.equals(r0);	 Catch:{ XmlPullParserException -> 0x0027, IOException -> 0x0090 }
        if (r7 != 0) goto L_0x0101;
    L_0x00ef:
        r7 = "createContactActivity";
        r7 = r7.equals(r0);	 Catch:{ XmlPullParserException -> 0x0027, IOException -> 0x0090 }
        if (r7 != 0) goto L_0x0101;
    L_0x00f7:
        r7 = "inviteContactActivity";
        r7 = r7.equals(r0);	 Catch:{ XmlPullParserException -> 0x0027, IOException -> 0x0090 }
        if (r7 == 0) goto L_0x0105;
    L_0x00ff:
        r10.l = r6;	 Catch:{ XmlPullParserException -> 0x0027, IOException -> 0x0090 }
    L_0x0101:
        r0 = r2 + 1;
        r2 = r0;
        goto L_0x00af;
    L_0x0105:
        r7 = "inviteContactActionLabel";
        r7 = r7.equals(r0);	 Catch:{ XmlPullParserException -> 0x0027, IOException -> 0x0090 }
        if (r7 == 0) goto L_0x0110;
    L_0x010d:
        r10.m = r6;	 Catch:{ XmlPullParserException -> 0x0027, IOException -> 0x0090 }
        goto L_0x0101;
    L_0x0110:
        r7 = "viewContactNotifyService";
        r7 = r7.equals(r0);	 Catch:{ XmlPullParserException -> 0x0027, IOException -> 0x0090 }
        if (r7 == 0) goto L_0x011b;
    L_0x0118:
        r10.n = r6;	 Catch:{ XmlPullParserException -> 0x0027, IOException -> 0x0090 }
        goto L_0x0101;
    L_0x011b:
        r7 = "viewGroupActivity";
        r7 = r7.equals(r0);	 Catch:{ XmlPullParserException -> 0x0027, IOException -> 0x0090 }
        if (r7 != 0) goto L_0x0101;
    L_0x0123:
        r7 = "viewGroupActionLabel";
        r7 = r7.equals(r0);	 Catch:{ XmlPullParserException -> 0x0027, IOException -> 0x0090 }
        if (r7 == 0) goto L_0x012e;
    L_0x012b:
        r10.o = r6;	 Catch:{ XmlPullParserException -> 0x0027, IOException -> 0x0090 }
        goto L_0x0101;
    L_0x012e:
        r7 = "dataSet";
        r7 = r7.equals(r0);	 Catch:{ XmlPullParserException -> 0x0027, IOException -> 0x0090 }
        if (r7 == 0) goto L_0x0139;
    L_0x0136:
        r10.b = r6;	 Catch:{ XmlPullParserException -> 0x0027, IOException -> 0x0090 }
        goto L_0x0101;
    L_0x0139:
        r7 = "extensionPackageNames";
        r7 = r7.equals(r0);	 Catch:{ XmlPullParserException -> 0x0027, IOException -> 0x0090 }
        if (r7 == 0) goto L_0x0147;
    L_0x0141:
        r0 = r10.p;	 Catch:{ XmlPullParserException -> 0x0027, IOException -> 0x0090 }
        r0.add(r6);	 Catch:{ XmlPullParserException -> 0x0027, IOException -> 0x0090 }
        goto L_0x0101;
    L_0x0147:
        r7 = "accountType";
        r7 = r7.equals(r0);	 Catch:{ XmlPullParserException -> 0x0027, IOException -> 0x0090 }
        if (r7 == 0) goto L_0x0152;
    L_0x014f:
        r10.a = r6;	 Catch:{ XmlPullParserException -> 0x0027, IOException -> 0x0090 }
        goto L_0x0101;
    L_0x0152:
        r7 = "accountTypeLabel";
        r7 = r7.equals(r0);	 Catch:{ XmlPullParserException -> 0x0027, IOException -> 0x0090 }
        if (r7 == 0) goto L_0x015d;
    L_0x015a:
        r10.q = r6;	 Catch:{ XmlPullParserException -> 0x0027, IOException -> 0x0090 }
        goto L_0x0101;
    L_0x015d:
        r7 = "accountTypeIcon";
        r7 = r7.equals(r0);	 Catch:{ XmlPullParserException -> 0x0027, IOException -> 0x0090 }
        if (r7 == 0) goto L_0x0168;
    L_0x0165:
        r10.r = r6;	 Catch:{ XmlPullParserException -> 0x0027, IOException -> 0x0090 }
        goto L_0x0101;
    L_0x0168:
        r6 = "ExternalAccountType";
        r7 = "Unsupported attribute ";
        r0 = java.lang.String.valueOf(r0);	 Catch:{ XmlPullParserException -> 0x0027, IOException -> 0x0090 }
        r8 = r0.length();	 Catch:{ XmlPullParserException -> 0x0027, IOException -> 0x0090 }
        if (r8 == 0) goto L_0x017e;
    L_0x0176:
        r0 = r7.concat(r0);	 Catch:{ XmlPullParserException -> 0x0027, IOException -> 0x0090 }
    L_0x017a:
        android.util.Log.e(r6, r0);	 Catch:{ XmlPullParserException -> 0x0027, IOException -> 0x0090 }
        goto L_0x0101;
    L_0x017e:
        r0 = new java.lang.String;	 Catch:{ XmlPullParserException -> 0x0027, IOException -> 0x0090 }
        r0.<init>(r7);	 Catch:{ XmlPullParserException -> 0x0027, IOException -> 0x0090 }
        goto L_0x017a;
    L_0x0184:
        r0 = r3.getDepth();	 Catch:{ XmlPullParserException -> 0x0027, IOException -> 0x0090 }
    L_0x0188:
        r2 = r3.next();	 Catch:{ XmlPullParserException -> 0x0027, IOException -> 0x0090 }
        r5 = 3;
        if (r2 != r5) goto L_0x0195;
    L_0x018f:
        r5 = r3.getDepth();	 Catch:{ XmlPullParserException -> 0x0027, IOException -> 0x0090 }
        if (r5 <= r0) goto L_0x01f6;
    L_0x0195:
        r5 = 1;
        if (r2 == r5) goto L_0x01f6;
    L_0x0198:
        r5 = 2;
        if (r2 != r5) goto L_0x0188;
    L_0x019b:
        r2 = r3.getDepth();	 Catch:{ XmlPullParserException -> 0x0027, IOException -> 0x0090 }
        r5 = r0 + 1;
        if (r2 != r5) goto L_0x0188;
    L_0x01a3:
        r2 = r3.getName();	 Catch:{ XmlPullParserException -> 0x0027, IOException -> 0x0090 }
        r5 = "EditSchema";
        r5 = r5.equals(r2);	 Catch:{ XmlPullParserException -> 0x0027, IOException -> 0x0090 }
        if (r5 == 0) goto L_0x01b6;
    L_0x01af:
        r2 = 1;
        r10.s = r2;	 Catch:{ XmlPullParserException -> 0x0027, IOException -> 0x0090 }
        r10.a(r11, r3, r4);	 Catch:{ XmlPullParserException -> 0x0027, IOException -> 0x0090 }
        goto L_0x0188;
    L_0x01b6:
        r5 = "ContactsDataKind";
        r2 = r5.equals(r2);	 Catch:{ XmlPullParserException -> 0x0027, IOException -> 0x0090 }
        if (r2 == 0) goto L_0x0188;
    L_0x01be:
        r2 = abp.v;	 Catch:{ XmlPullParserException -> 0x0027, IOException -> 0x0090 }
        r2 = r11.obtainStyledAttributes(r4, r2);	 Catch:{ XmlPullParserException -> 0x0027, IOException -> 0x0090 }
        r5 = new ahm;	 Catch:{ XmlPullParserException -> 0x0027, IOException -> 0x0090 }
        r5.<init>();	 Catch:{ XmlPullParserException -> 0x0027, IOException -> 0x0090 }
        r6 = abp.x;	 Catch:{ XmlPullParserException -> 0x0027, IOException -> 0x0090 }
        r6 = r2.getString(r6);	 Catch:{ XmlPullParserException -> 0x0027, IOException -> 0x0090 }
        r5.b = r6;	 Catch:{ XmlPullParserException -> 0x0027, IOException -> 0x0090 }
        r6 = abp.y;	 Catch:{ XmlPullParserException -> 0x0027, IOException -> 0x0090 }
        r6 = r2.getString(r6);	 Catch:{ XmlPullParserException -> 0x0027, IOException -> 0x0090 }
        if (r6 == 0) goto L_0x01e0;
    L_0x01d9:
        r7 = new ahc;	 Catch:{ XmlPullParserException -> 0x0027, IOException -> 0x0090 }
        r7.<init>(r6);	 Catch:{ XmlPullParserException -> 0x0027, IOException -> 0x0090 }
        r5.f = r7;	 Catch:{ XmlPullParserException -> 0x0027, IOException -> 0x0090 }
    L_0x01e0:
        r6 = abp.w;	 Catch:{ XmlPullParserException -> 0x0027, IOException -> 0x0090 }
        r6 = r2.getString(r6);	 Catch:{ XmlPullParserException -> 0x0027, IOException -> 0x0090 }
        if (r6 == 0) goto L_0x01ef;
    L_0x01e8:
        r7 = new ahc;	 Catch:{ XmlPullParserException -> 0x0027, IOException -> 0x0090 }
        r7.<init>(r6);	 Catch:{ XmlPullParserException -> 0x0027, IOException -> 0x0090 }
        r5.h = r7;	 Catch:{ XmlPullParserException -> 0x0027, IOException -> 0x0090 }
    L_0x01ef:
        r2.recycle();	 Catch:{ XmlPullParserException -> 0x0027, IOException -> 0x0090 }
        r10.a(r5);	 Catch:{ XmlPullParserException -> 0x0027, IOException -> 0x0090 }
        goto L_0x0188;
    L_0x01f6:
        r1 = 0;
        r0 = r10.s;	 Catch:{ afx -> 0x0030 }
        if (r0 == 0) goto L_0x024a;
    L_0x01fb:
        r0 = "vnd.android.cursor.item/name";
        r10.a(r0);	 Catch:{ afx -> 0x0030 }
        r0 = "#displayName";
        r10.a(r0);	 Catch:{ afx -> 0x0030 }
        r0 = "#phoneticName";
        r10.a(r0);	 Catch:{ afx -> 0x0030 }
        r0 = "vnd.android.cursor.item/photo";
        r10.a(r0);	 Catch:{ afx -> 0x0030 }
    L_0x020f:
        if (r3 == 0) goto L_0x0214;
    L_0x0211:
        r3.close();
    L_0x0214:
        r0 = new java.util.ArrayList;
        r0.<init>();
        r10.p = r0;
        r0 = r10.m;
        r1 = r10.d;
        r2 = "inviteContactActionLabel";
        a(r11, r0, r1, r2);
        r0 = r10.o;
        r1 = r10.d;
        r2 = "viewGroupActionLabel";
        a(r11, r0, r1, r2);
        r0 = r10.q;
        r1 = r10.d;
        r2 = "accountTypeLabel";
        r0 = a(r11, r0, r1, r2);
        r10.e = r0;
        r0 = r10.r;
        r1 = r10.d;
        r2 = "accountTypeIcon";
        r0 = a(r11, r0, r1, r2);
        r10.f = r0;
        r0 = 1;
        r10.g = r0;
        goto L_0x0061;
    L_0x024a:
        r10.h();	 Catch:{ afx -> 0x0030 }
        r10.c(r11);	 Catch:{ afx -> 0x0030 }
        r10.i();	 Catch:{ afx -> 0x0030 }
        r10.j(r11);	 Catch:{ afx -> 0x0030 }
        goto L_0x020f;
        */
        throw new UnsupportedOperationException("Method not decompiled: ahh.<init>(android.content.Context, java.lang.String, boolean, android.content.res.XmlResourceParser):void");
    }

    private static XmlResourceParser b(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(new Intent("android.content.SyncAdapter").setPackage(str), 132);
        if (queryIntentServices != null) {
            for (ResolveInfo resolveInfo : queryIntentServices) {
                ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                if (serviceInfo != null) {
                    String[] strArr = k;
                    int length = strArr.length;
                    int i = 0;
                    while (i < length) {
                        XmlResourceParser loadXmlMetaData = serviceInfo.loadXmlMetaData(packageManager, strArr[i]);
                        if (loadXmlMetaData == null) {
                            i++;
                        } else if (!Log.isLoggable("ExternalAccountType", 3)) {
                            return loadXmlMetaData;
                        } else {
                            String.format("Metadata loaded from: %s, %s, %s", new Object[]{serviceInfo.packageName, serviceInfo.name, r8});
                            return loadXmlMetaData;
                        }
                    }
                    continue;
                }
            }
        }
        return null;
    }

    public static boolean a(Context context, String str) {
        return b(context, str) != null;
    }

    private static int a(Context context, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (str.charAt(0) != '@') {
            Log.e("ExternalAccountType", String.valueOf(str3).concat(" must be a resource name beginnig with '@'"));
            return -1;
        }
        try {
            int identifier = context.getPackageManager().getResourcesForApplication(str2).getIdentifier(str.substring(1), null, str2);
            if (identifier != 0) {
                return identifier;
            }
            Log.e("ExternalAccountType", new StringBuilder((String.valueOf(str).length() + 29) + String.valueOf(str2).length()).append("Unable to load ").append(str).append(" from package ").append(str2).toString());
            return -1;
        } catch (NameNotFoundException e) {
            String str4 = "ExternalAccountType";
            String str5 = "Unable to load package ";
            String valueOf = String.valueOf(str2);
            Log.e(str4, valueOf.length() != 0 ? str5.concat(valueOf) : new String(str5));
            return -1;
        }
    }

    public final boolean a() {
        return false;
    }

    public final boolean b() {
        return this.s;
    }

    public final String c() {
        return this.l;
    }

    public final String d() {
        return this.n;
    }

    public final List f() {
        return this.p;
    }

    private final void a(String str) {
        if (((ahm) this.h.get(str)) == null) {
            throw new afx(String.valueOf(str).concat(" must be supported"));
        }
    }
}

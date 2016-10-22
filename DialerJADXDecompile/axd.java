import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
public final class axd {
    public static final axa a;
    private static final String b;
    private static String c;
    private static boolean d;
    private static Set e;
    private static Set f;

    static {
        b = null;
        a = new awz();
        c = null;
        d = false;
        e = null;
        f = null;
    }

    public static void a(Context context) {
        boolean z;
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager != null) {
            c = telephonyManager.getSimCountryIso();
        }
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        if (c != null) {
            defaultSharedPreferences.edit().putString("DialtactsActivity_user_sim_country_code", c).apply();
        } else {
            c = defaultSharedPreferences.getString("DialtactsActivity_user_sim_country_code", null);
        }
        Object obj = c;
        if (TextUtils.isEmpty(obj)) {
            z = false;
        } else {
            if (e == null) {
                Set hashSet = new HashSet();
                hashSet.add("US");
                hashSet.add("CA");
                hashSet.add("AS");
                hashSet.add("AI");
                hashSet.add("AG");
                hashSet.add("BS");
                hashSet.add("BB");
                hashSet.add("BM");
                hashSet.add("VG");
                hashSet.add("KY");
                hashSet.add("DM");
                hashSet.add("DO");
                hashSet.add("GD");
                hashSet.add("GU");
                hashSet.add("JM");
                hashSet.add("PR");
                hashSet.add("MS");
                hashSet.add("MP");
                hashSet.add("KN");
                hashSet.add("LC");
                hashSet.add("VC");
                hashSet.add("TT");
                hashSet.add("TC");
                hashSet.add("VI");
                e = hashSet;
            }
            z = e.contains(obj.toUpperCase());
        }
        d = z;
    }

    private static ArrayList d(String str) {
        int length = str.length();
        ArrayList arrayList = new ArrayList();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char d = a.d(str.charAt(i));
            if (a.c(d)) {
                stringBuilder.append(a.e(d));
            } else {
                if (stringBuilder.length() != 0) {
                    arrayList.add(stringBuilder.toString());
                }
                stringBuilder.delete(0, stringBuilder.length());
            }
        }
        if (stringBuilder.length() != 0) {
            arrayList.add(stringBuilder.toString());
        }
        return arrayList;
    }

    public static ArrayList a(String str) {
        ArrayList arrayList = new ArrayList();
        ArrayList d = d(str);
        if (d.size() > 0) {
            int size;
            StringBuilder stringBuilder = new StringBuilder();
            for (size = d.size() - 1; size >= 0; size--) {
                stringBuilder.insert(0, (String) d.get(size));
                arrayList.add(stringBuilder.toString());
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add((String) d.get(d.size() - 1));
            int size2 = arrayList.size();
            int size3 = arrayList.size();
            int size4 = d.size() - 2;
            while (size4 >= 0) {
                if (size4 >= d.size() - 2 || size4 < 2) {
                    String valueOf;
                    String valueOf2;
                    Object concat;
                    String substring = ((String) d.get(size4)).substring(0, 1);
                    for (size = 0; size < arrayList2.size(); size++) {
                        valueOf = String.valueOf(substring);
                        valueOf2 = String.valueOf((String) arrayList2.get(size));
                        arrayList.add(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
                    }
                    for (size = size2; size < size3; size++) {
                        valueOf = String.valueOf(substring);
                        valueOf2 = String.valueOf((String) arrayList.get(size));
                        arrayList.add(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
                    }
                    size3 = arrayList.size();
                    valueOf2 = (String) arrayList2.get(arrayList2.size() - 1);
                    String valueOf3 = String.valueOf((String) d.get(size4));
                    valueOf2 = String.valueOf(valueOf2);
                    if (valueOf2.length() != 0) {
                        concat = valueOf3.concat(valueOf2);
                    } else {
                        concat = new String(valueOf3);
                    }
                    arrayList2.add(concat);
                }
                size4--;
                size3 = size3;
            }
        }
        return arrayList;
    }

    public static ArrayList b(String str) {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            arrayList.add(axc.a(str, a));
            axe c = c(str);
            if (c.a != 0) {
                arrayList.add(axc.a(str, c.a, a));
            }
            if (c.b != 0) {
                arrayList.add(axc.a(str, c.b, a));
            }
        }
        return arrayList;
    }

    public static axe c(String str) {
        String str2;
        int i;
        int i2 = 0;
        String str3 = "";
        if (TextUtils.isEmpty(str)) {
            str2 = str3;
            i = 0;
        } else {
            String a = axc.a(str, a);
            if (str.charAt(0) == '+') {
                str2 = str3;
                i = 1;
                while (i <= 4 && str.length() > i) {
                    str2 = str.substring(1, i);
                    if (f == null) {
                        Set hashSet = new HashSet();
                        hashSet.add("1");
                        hashSet.add("7");
                        hashSet.add("20");
                        hashSet.add("27");
                        hashSet.add("30");
                        hashSet.add("31");
                        hashSet.add("32");
                        hashSet.add("33");
                        hashSet.add("34");
                        hashSet.add("36");
                        hashSet.add("39");
                        hashSet.add("40");
                        hashSet.add("41");
                        hashSet.add("43");
                        hashSet.add("44");
                        hashSet.add("45");
                        hashSet.add("46");
                        hashSet.add("47");
                        hashSet.add("48");
                        hashSet.add("49");
                        hashSet.add("51");
                        hashSet.add("52");
                        hashSet.add("53");
                        hashSet.add("54");
                        hashSet.add("55");
                        hashSet.add("56");
                        hashSet.add("57");
                        hashSet.add("58");
                        hashSet.add("60");
                        hashSet.add("61");
                        hashSet.add("62");
                        hashSet.add("63");
                        hashSet.add("64");
                        hashSet.add("65");
                        hashSet.add("66");
                        hashSet.add("81");
                        hashSet.add("82");
                        hashSet.add("84");
                        hashSet.add("86");
                        hashSet.add("90");
                        hashSet.add("91");
                        hashSet.add("92");
                        hashSet.add("93");
                        hashSet.add("94");
                        hashSet.add("95");
                        hashSet.add("98");
                        hashSet.add("211");
                        hashSet.add("212");
                        hashSet.add("213");
                        hashSet.add("216");
                        hashSet.add("218");
                        hashSet.add("220");
                        hashSet.add("221");
                        hashSet.add("222");
                        hashSet.add("223");
                        hashSet.add("224");
                        hashSet.add("225");
                        hashSet.add("226");
                        hashSet.add("227");
                        hashSet.add("228");
                        hashSet.add("229");
                        hashSet.add("230");
                        hashSet.add("231");
                        hashSet.add("232");
                        hashSet.add("233");
                        hashSet.add("234");
                        hashSet.add("235");
                        hashSet.add("236");
                        hashSet.add("237");
                        hashSet.add("238");
                        hashSet.add("239");
                        hashSet.add("240");
                        hashSet.add("241");
                        hashSet.add("242");
                        hashSet.add("243");
                        hashSet.add("244");
                        hashSet.add("245");
                        hashSet.add("246");
                        hashSet.add("247");
                        hashSet.add("248");
                        hashSet.add("249");
                        hashSet.add("250");
                        hashSet.add("251");
                        hashSet.add("252");
                        hashSet.add("253");
                        hashSet.add("254");
                        hashSet.add("255");
                        hashSet.add("256");
                        hashSet.add("257");
                        hashSet.add("258");
                        hashSet.add("260");
                        hashSet.add("261");
                        hashSet.add("262");
                        hashSet.add("263");
                        hashSet.add("264");
                        hashSet.add("265");
                        hashSet.add("266");
                        hashSet.add("267");
                        hashSet.add("268");
                        hashSet.add("269");
                        hashSet.add("290");
                        hashSet.add("291");
                        hashSet.add("297");
                        hashSet.add("298");
                        hashSet.add("299");
                        hashSet.add("350");
                        hashSet.add("351");
                        hashSet.add("352");
                        hashSet.add("353");
                        hashSet.add("354");
                        hashSet.add("355");
                        hashSet.add("356");
                        hashSet.add("357");
                        hashSet.add("358");
                        hashSet.add("359");
                        hashSet.add("370");
                        hashSet.add("371");
                        hashSet.add("372");
                        hashSet.add("373");
                        hashSet.add("374");
                        hashSet.add("375");
                        hashSet.add("376");
                        hashSet.add("377");
                        hashSet.add("378");
                        hashSet.add("379");
                        hashSet.add("380");
                        hashSet.add("381");
                        hashSet.add("382");
                        hashSet.add("385");
                        hashSet.add("386");
                        hashSet.add("387");
                        hashSet.add("389");
                        hashSet.add("420");
                        hashSet.add("421");
                        hashSet.add("423");
                        hashSet.add("500");
                        hashSet.add("501");
                        hashSet.add("502");
                        hashSet.add("503");
                        hashSet.add("504");
                        hashSet.add("505");
                        hashSet.add("506");
                        hashSet.add("507");
                        hashSet.add("508");
                        hashSet.add("509");
                        hashSet.add("590");
                        hashSet.add("591");
                        hashSet.add("592");
                        hashSet.add("593");
                        hashSet.add("594");
                        hashSet.add("595");
                        hashSet.add("596");
                        hashSet.add("597");
                        hashSet.add("598");
                        hashSet.add("599");
                        hashSet.add("670");
                        hashSet.add("672");
                        hashSet.add("673");
                        hashSet.add("674");
                        hashSet.add("675");
                        hashSet.add("676");
                        hashSet.add("677");
                        hashSet.add("678");
                        hashSet.add("679");
                        hashSet.add("680");
                        hashSet.add("681");
                        hashSet.add("682");
                        hashSet.add("683");
                        hashSet.add("685");
                        hashSet.add("686");
                        hashSet.add("687");
                        hashSet.add("688");
                        hashSet.add("689");
                        hashSet.add("690");
                        hashSet.add("691");
                        hashSet.add("692");
                        hashSet.add("800");
                        hashSet.add("808");
                        hashSet.add("850");
                        hashSet.add("852");
                        hashSet.add("853");
                        hashSet.add("855");
                        hashSet.add("856");
                        hashSet.add("870");
                        hashSet.add("878");
                        hashSet.add("880");
                        hashSet.add("881");
                        hashSet.add("882");
                        hashSet.add("883");
                        hashSet.add("886");
                        hashSet.add("888");
                        hashSet.add("960");
                        hashSet.add("961");
                        hashSet.add("962");
                        hashSet.add("963");
                        hashSet.add("964");
                        hashSet.add("965");
                        hashSet.add("966");
                        hashSet.add("967");
                        hashSet.add("968");
                        hashSet.add("970");
                        hashSet.add("971");
                        hashSet.add("972");
                        hashSet.add("973");
                        hashSet.add("974");
                        hashSet.add("975");
                        hashSet.add("976");
                        hashSet.add("977");
                        hashSet.add("979");
                        hashSet.add("992");
                        hashSet.add("993");
                        hashSet.add("994");
                        hashSet.add("995");
                        hashSet.add("996");
                        hashSet.add("998");
                        f = hashSet;
                    }
                    if (f.contains(str2)) {
                        break;
                    }
                    i++;
                }
                i = 0;
            } else if (a.length() == 11 && a.charAt(0) == '1' && d) {
                str2 = "1";
                i = str.indexOf(a.charAt(1));
                if (i == -1) {
                    i = 0;
                }
            } else {
                str2 = str3;
                i = 0;
            }
            if (d) {
                String str4 = "";
                if (str2.equals("") && a.length() == 10) {
                    str4 = a.substring(0, 3);
                } else if (str2.equals("1") && a.length() == 11) {
                    str4 = a.substring(1, 4);
                }
                if (!(str4.equals("") || str.indexOf(str4) == -1)) {
                    i2 = str.indexOf(str4) + 3;
                }
            }
        }
        return new axe(str2, i, i2);
    }
}

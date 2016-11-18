package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public class ggt extends Binder implements ggs {
    public final Context a;

    public ggt() {
        attachInterface(this, "com.google.android.apps.hangouts.telephony.ui.ITeleWifiCallingSettingsService");
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        Account account = null;
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.apps.hangouts.telephony.ui.ITeleWifiCallingSettingsService");
                a();
                parcel2.writeNoException();
                parcel2.writeInt(4);
                return true;
            case 2:
                parcel.enforceInterface("com.google.android.apps.hangouts.telephony.ui.ITeleWifiCallingSettingsService");
                b();
                parcel2.writeNoException();
                parcel2.writeString(null);
                return true;
            case 3:
                parcel.enforceInterface("com.google.android.apps.hangouts.telephony.ui.ITeleWifiCallingSettingsService");
                a(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 4:
                parcel.enforceInterface("com.google.android.apps.hangouts.telephony.ui.ITeleWifiCallingSettingsService");
                c();
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 5:
                parcel.enforceInterface("com.google.android.apps.hangouts.telephony.ui.ITeleWifiCallingSettingsService");
                if (parcel.readInt() != 0) {
                    Account.CREATOR.createFromParcel(parcel);
                }
                d();
                parcel2.writeNoException();
                return true;
            case 6:
                parcel.enforceInterface("com.google.android.apps.hangouts.telephony.ui.ITeleWifiCallingSettingsService");
                e();
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 7:
                parcel.enforceInterface("com.google.android.apps.hangouts.telephony.ui.ITeleWifiCallingSettingsService");
                if (parcel.readInt() != 0) {
                    account = (Account) Account.CREATOR.createFromParcel(parcel);
                }
                a(account);
                parcel2.writeNoException();
                return true;
            case 8:
                parcel.enforceInterface("com.google.android.apps.hangouts.telephony.ui.ITeleWifiCallingSettingsService");
                a(parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 9:
                parcel.enforceInterface("com.google.android.apps.hangouts.telephony.ui.ITeleWifiCallingSettingsService");
                boolean f = f();
                parcel2.writeNoException();
                parcel2.writeInt(f ? 1 : 0);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.apps.hangouts.telephony.ui.ITeleWifiCallingSettingsService");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }

    public ggt(Context context) {
        this();
        this.a = context;
    }

    public int a() {
        gwb.T(this.a);
        return 4;
    }

    public boolean f() {
        gwb.T(this.a);
        glk.c("Babel_telephony", "TeleWifiCallingSettingsService.getWifiCallingEnabledPreference", new Object[0]);
        return ggc.a(this.a).d();
    }

    public String b() {
        gwb.T(this.a);
        glk.c("Babel_telephony", "TeleWifiCallingSettingsService.getWifiCallingState, API not used", new Object[0]);
        return null;
    }

    public void a(String str) {
        gwb.T(this.a);
        glk.c("Babel_telephony", new StringBuilder(String.valueOf(str).length() + 68).append("TeleWifiCallingSettingsService.setWifiCallingState, state: ").append(str).append(", ignored").toString(), new Object[0]);
    }

    public Account c() {
        gwb.T(this.a);
        glk.c("Babel_telephony", "TeleWifiCallingSettingsService.getWifiCallingAccount, API not used", new Object[0]);
        return null;
    }

    public void d() {
        gwb.T(this.a);
        glk.c("Babel_telephony", "TeleWifiCallingSettingsService.setWifiCallingAccount, ignored", new Object[0]);
    }

    public Account e() {
        gwb.T(this.a);
        glk.c("Babel_telephony", "TeleWifiCallingSettingsService.getTychoAccount, API not used", new Object[0]);
        return null;
    }

    public void a(Account account) {
        gwb.T(this.a);
        String str = account == null ? null : account.name;
        String str2 = "Babel_telephony";
        String str3 = "TeleWifiCallingSettingsService.setTychoAccount, account name: ";
        String valueOf = String.valueOf(glk.b(str));
        glk.c(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3), new Object[0]);
        ggc.a(this.a).a(str);
    }

    public void a(long j) {
        gwb.T(this.a);
        glk.c("Babel_telephony", "TeleWifiCallingSettingsService.setLastEmergencyDialedTimeMillisFromDarkNumber, dialedTimeMillis: " + j, new Object[0]);
        ggc.a(this.a).a(j);
    }
}

package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import buf;
import bwh;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import rk;
import rl;
import rq;

public final class ConnectionResult implements SafeParcelable {
    public static final Creator CREATOR;
    public static final ConnectionResult a;
    final int b;
    public final int c;
    public final PendingIntent d;
    public final String e;

    static {
        a = new ConnectionResult(0);
        CREATOR = new bwh();
    }

    private ConnectionResult(int i) {
        this(0, null, null);
    }

    public ConnectionResult(int i, int i2, PendingIntent pendingIntent, String str) {
        this.b = i;
        this.c = i2;
        this.d = pendingIntent;
        this.e = str;
    }

    public ConnectionResult(int i, PendingIntent pendingIntent) {
        this(i, pendingIntent, null);
    }

    private ConnectionResult(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, null);
    }

    public static String a(int i) {
        switch (i) {
            case rl.c /*0*/:
                return "SUCCESS";
            case rq.b /*1*/:
                return "SERVICE_MISSING";
            case rq.c /*2*/:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case rl.e /*3*/:
                return "SERVICE_DISABLED";
            case rl.f /*4*/:
                return "SIGN_IN_REQUIRED";
            case rl.g /*5*/:
                return "INVALID_ACCOUNT";
            case rl.i /*6*/:
                return "RESOLUTION_REQUIRED";
            case rl.h /*7*/:
                return "NETWORK_ERROR";
            case rl.j /*8*/:
                return "INTERNAL_ERROR";
            case rl.l /*9*/:
                return "SERVICE_INVALID";
            case rl.m /*10*/:
                return "DEVELOPER_ERROR";
            case rl.n /*11*/:
                return "LICENSE_CHECK_FAILED";
            case rk.i /*13*/:
                return "CANCELED";
            case rk.bV /*14*/:
                return "TIMEOUT";
            case rk.bY /*15*/:
                return "INTERRUPTED";
            case rk.bX /*16*/:
                return "API_UNAVAILABLE";
            case rk.bZ /*17*/:
                return "SIGN_IN_FAILED";
            case rk.bW /*18*/:
                return "SERVICE_UPDATING";
            case rk.m /*19*/:
                return "SERVICE_MISSING_PERMISSION";
            case rk.h /*20*/:
                return "RESTRICTED_PROFILE";
            default:
                return "UNKNOWN_ERROR_CODE(" + i + ")";
        }
    }

    public final boolean a() {
        return (this.c == 0 || this.d == null) ? false : true;
    }

    public final boolean b() {
        return this.c == 0;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectionResult)) {
            return false;
        }
        ConnectionResult connectionResult = (ConnectionResult) obj;
        return this.c == connectionResult.c && buf.c(this.d, connectionResult.d) && buf.c(this.e, connectionResult.e);
    }

    public final int hashCode() {
        return buf.a(Integer.valueOf(this.c), this.d, this.e);
    }

    public final String toString() {
        return buf.z((Object) this).a("statusCode", a(this.c)).a("resolution", this.d).a("message", this.e).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int c = buf.c(parcel);
        buf.d(parcel, 1, this.b);
        buf.d(parcel, 2, this.c);
        buf.a(parcel, 3, this.d, i, false);
        buf.a(parcel, 4, this.e, false);
        buf.v(parcel, c);
    }
}

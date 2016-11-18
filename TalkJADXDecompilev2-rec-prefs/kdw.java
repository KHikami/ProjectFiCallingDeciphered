package p000;

import com.google.api.client.http.HttpHeaders;
import com.google.api.client.http.HttpRequest;
import java.util.List;

public class kdw {
    public void m25615a(HttpRequest httpRequest, String str) {
        HttpHeaders headers = httpRequest.getHeaders();
        String valueOf = String.valueOf("Bearer ");
        String valueOf2 = String.valueOf(str);
        headers.setAuthorization(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
    }

    public String m25614a(HttpRequest httpRequest) {
        List<String> authorizationAsList = httpRequest.getHeaders().getAuthorizationAsList();
        if (authorizationAsList != null) {
            for (String str : authorizationAsList) {
                if (str.startsWith("Bearer ")) {
                    return str.substring(7);
                }
            }
        }
        return null;
    }

    kdw() {
    }
}

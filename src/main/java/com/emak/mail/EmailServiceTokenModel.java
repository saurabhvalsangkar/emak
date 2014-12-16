package com.emak.mail;

import com.emak.user.User;
import com.emak.user.VerificationToken;
import com.emak.user.VerificationTokenType;
import org.apache.commons.codec.binary.Base64;

import java.io.Serializable;

/**
 * @version 1.0
 * @author: GyanomTech Studios
 * @since 13/05/2013
 */
public class EmailServiceTokenModel implements Serializable {

    private final String emailAddress;
    private final String token;
    private final VerificationTokenType tokenType;
    private final String hostNameUrl;


    public EmailServiceTokenModel(User user, VerificationToken token, String hostNameUrl)  {
        this.emailAddress = user.getEmailAddress();
        this.token = token.getToken();
        this.tokenType = token.getTokenType();
        this.hostNameUrl = hostNameUrl;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getEncodedToken() {
        return new String(Base64.encodeBase64(token.getBytes()));
    }

    public String getToken() {
        return token;
    }

    public VerificationTokenType getTokenType() {
        return tokenType;
    }

    public String getHostNameUrl() {
        return hostNameUrl;
    }
}


package org.example.googleoauth2.details;

import org.example.googleoauth2.info.OAuth2UserInfo;
import org.springframework.security.oauth2.core.user.OAuth2User;

import java.util.Map;

public class GoogleUserDetails implements OAuth2UserInfo {
    private Map<String, Object> attributes;

    public GoogleUserDetails(Map<String, Object> attributes) {
    }

    @Override
    public String getProvider() {
        return "google";
    }

    @Override
    public String getProviderId() {
        return (String) attributes.get("sub");
    }

    @Override
    public String getEmail() {
        return (String) attributes.get("email");
    }

    @Override
    public String getName() {
        return (String) attributes.get("name");
    }

}

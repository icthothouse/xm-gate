package com.icthh.xm.gate.idp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class IdpPrivateConfig {

    @JsonProperty("idp") //TODO can we map without this inner class?
    private PrivateIdpConfigDto idp;

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class PrivateIdpConfigDto {

        @JsonProperty("clients")
        private List<IdpPrivateClientConfig> clients = new ArrayList<>();

        @Data
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class IdpPrivateClientConfig {

            @JsonProperty("key")
            private String key;

            @JsonProperty("clientSecret")
            private String clientSecret;

            @JsonProperty("scope")
            private List<String> scope;

            @JsonProperty("additionalParams")
            private Map<String, String> additionalParams;

        }
    }
}

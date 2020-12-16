package com.icthh.xm.gate.dto.idp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
//TODO PublicIdpDto -> IdpPublicConfig
//TODO let's move this class to  com.icthh.xm.gate.domain.idp
public class PublicIdpDto {

    @JsonProperty("idp") //TODO can we map without this inner class?
    private PublicIdpConfigDto idp;

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public class PublicIdpConfigDto {
        @JsonProperty("directLogin")
        private Boolean directLogin;

        @JsonProperty("clients")
        //TODO let's mage PublicIdpClientConfigDto also as inner class
        private List<PublicIdpClientConfigDto> clients = new ArrayList<>();
    }
}

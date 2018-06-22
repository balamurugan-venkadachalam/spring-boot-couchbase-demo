package com.mini.domain;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"type",
"userName",
"loginPassword",
"rights",
"lastUpdatedUser",
"lastUpdatedTime"
})
public class UserRequest {

@JsonProperty("type")
private String type;
@JsonProperty("userName")
private String userName;
@JsonProperty("loginPassword")
private String loginPassword;
@JsonProperty("rights")
private String rights;
@JsonProperty("lastUpdatedUser")
private String lastUpdatedUser;
@JsonProperty("lastUpdatedTime")
private String lastUpdatedTime;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("type")
public String getType() {
return type;
}

@JsonProperty("type")
public void setType(String type) {
this.type = type;
}

@JsonProperty("userName")
public String getUserName() {
return userName;
}

@JsonProperty("userName")
public void setUserName(String userName) {
this.userName = userName;
}

@JsonProperty("loginPassword")
public String getLoginPassword() {
return loginPassword;
}

@JsonProperty("loginPassword")
public void setLoginPassword(String loginPassword) {
this.loginPassword = loginPassword;
}

@JsonProperty("rights")
public String getRights() {
return rights;
}

@JsonProperty("rights")
public void setRights(String rights) {
this.rights = rights;
}

@JsonProperty("lastUpdatedUser")
public String getLastUpdatedUser() {
return lastUpdatedUser;
}

@JsonProperty("lastUpdatedUser")
public void setLastUpdatedUser(String lastUpdatedUser) {
this.lastUpdatedUser = lastUpdatedUser;
}

@JsonProperty("lastUpdatedTime")
public String getLastUpdatedTime() {
return lastUpdatedTime;
}

@JsonProperty("lastUpdatedTime")
public void setLastUpdatedTime(String lastUpdatedTime) {
this.lastUpdatedTime = lastUpdatedTime;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}
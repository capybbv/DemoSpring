// package com.example.demo.sercurity;
//
// import com.example.demo.models.User;
// import java.util.*;
// import lombok.Getter;
// import lombok.ToString;
// import org.springframework.security.core.GrantedAuthority;
// import org.springframework.security.core.authority.SimpleGrantedAuthority;
// import org.springframework.security.core.userdetails.UserDetails;
//
// @ToString
// public class UserPrincipal implements UserDetails {
//  private long id;
//  @Getter private String email;
//  private String password;
//  private Collection<? extends GrantedAuthority> authorities;
//  @Getter private Map<String, Object> attributes;
//
//  public UserPrincipal(
//      long id, String email, String password, Collection<? extends GrantedAuthority> authorities)
// {
//    this.id = id;
//    this.email = email;
//    this.password = password;
//    this.authorities = authorities;
//  }
//
//  public static UserPrincipal create(User user) {
//    List<GrantedAuthority> authorities =
//        Collections.singletonList(new SimpleGrantedAuthority("ROLE_USER"));
//
//    return new UserPrincipal(user.getId(), user.getUsername(), user.getPassword(), authorities);
//  }
//
//  public static UserPrincipal create(User user, String role) {
//    List<GrantedAuthority> authorities =
//        Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"), new SimpleGrantedAuthority(role));
//
//    return new UserPrincipal(user.getId(), user.getUsername(), user.getPassword(), authorities);
//  }
//
//  public static UserPrincipal create(User user, Map<String, Object> attributes) {
//    UserPrincipal userPrincipal = UserPrincipal.create(user);
//    userPrincipal.setAttributes(attributes);
//    return userPrincipal;
//  }
//
//  public String getId() {
//    return String.valueOf(id);
//  }
//
//  @Override
//  public String getPassword() {
//    return password;
//  }
//
//  @Override
//  public String getUsername() {
//    return email;
//  }
//
//  @Override
//  public boolean isAccountNonExpired() {
//    return true;
//  }
//
//  @Override
//  public boolean isAccountNonLocked() {
//    return true;
//  }
//
//  @Override
//  public boolean isCredentialsNonExpired() {
//    return true;
//  }
//
//  @Override
//  public boolean isEnabled() {
//    return true;
//  }
//
//  @Override
//  public Collection<? extends GrantedAuthority> getAuthorities() {
//    return authorities;
//  }
//
//  public void setAttributes(Map<String, Object> attributes) {
//    this.attributes = attributes;
//  }
//
//  public String getName() {
//    return String.valueOf(id);
//  }
//
//  public Map<String, Object> getClaims() {
//    return null;
//  }
// }

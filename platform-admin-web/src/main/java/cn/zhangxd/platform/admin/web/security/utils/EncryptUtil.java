package cn.zhangxd.platform.admin.web.security.utils;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.StandardPasswordEncoder;

public class EncryptUtil {
   //从配置文件中获得  
   private static final String SITE_WIDE_SECRET = "beibei";  
   private static final PasswordEncoder encoder = new StandardPasswordEncoder(
      SITE_WIDE_SECRET);  
  
   public static String encrypt(String rawPassword) {  
        return encoder.encode(rawPassword);  
   }  
  
   public static boolean match(String rawPassword, String password) {  
        return encoder.matches(rawPassword, password);  
   }

    public static void main(String[] args) {
        System.out.println(EncryptUtil.encrypt("admin"));  // $08$UIbl948v1vaFLzwr3Hea7uJECTdYsEA8gkxWxNgBLBVXbIG1ODyLO
        System.out.println(EncryptUtil.encrypt("test"));
        System.out.println(EncryptUtil.encrypt("test"));
    }
}
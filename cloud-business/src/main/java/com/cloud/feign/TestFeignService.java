//package com.cloud.feign;
//
//import cn.hutool.json.JSONObject;
//import org.springframework.cloud.openfeign.FeignClient;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//
//import java.util.Map;
//
//@FeignClient(name = "CLOUD-SERVER-PROVIDER")
//public interface TestFeignService {
//
//    @GetMapping("/provider/getUser/{id}")
//    JSONObject getUsesss(@PathVariable("id") Integer id);
//
//    @GetMapping("/provider/getUser/{id}")
//    Map<String,Object> getUsesss2(@PathVariable("id") Integer id);
//
//    @GetMapping("/provider/get")
//    String getsss();
//
//}

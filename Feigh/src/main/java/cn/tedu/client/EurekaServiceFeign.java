package cn.tedu.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value="provider-hello")
public interface EurekaServiceFeign {
 @RequestMapping(value="/hello/{name}")
 public String hello(@PathVariable("name")String name);
}

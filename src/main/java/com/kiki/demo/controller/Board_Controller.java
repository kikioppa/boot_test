package com.kiki.demo.controller;

import com.kiki.demo.model.SearchVO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class Board_Controller {
 @RequestMapping(method = RequestMethod.GET, path ="/getRequest")
 public String getRequest(){
     return "this is getRequest";
 }
 @GetMapping("/getParameter")
    public String getParameter(@RequestParam String id, @RequestParam String email){
     return "아디 = " + id + "메일 = " +email;
 }

 @GetMapping("/getMultiParameters")
    public String getMultiParameters(SearchVO searchVO){
     return "VO 사용자 아디 = " + searchVO.getId() +"VO 사용자 메일 = " + searchVO.getEmail();
 }
 @GetMapping("/getMultiParametersRtnJson")
    public SearchVO getMultiParametersRtnJson(SearchVO searchVO){
        return searchVO;
    }
}
